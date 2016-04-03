grammar Simple;

@header {
import java.util.TreeMap;
}

@members {
	// The String is the variable name, and the Integer will be the register location
	public static TreeMap<String, Integer> decVars = new TreeMap<String, Integer>();
	public static TreeMap<String, Integer> loops = new TreeMap<String, Integer>();
	public static int nextLoop = 0;
	public static int nextRegister = 0;
}

prog
	: 
	{
		System.out.println(".super java/lang/Object");
		System.out.println(".method public <init>()V");
  		System.out.println("aload_0");
  		System.out.println("invokenonvirtual java/lang/Object/<init>()V");
  		System.out.println("return");
		System.out.println(".end method\n");
		System.out.println(".method public static main([Ljava/lang/String;)V");
  		System.out.println(".limit stack 10");
  		System.out.println(".limit locals 10");
	}
	block 
	{
		System.out.println("return\n.end method");
	}
	;	

expr
	: term {  } ('+' term { System.out.println("iadd"); })*
	| term {  } ('-' term { System.out.println("isub"); })*
	;

term
	: factor { } ('*' factor { System.out.println("imul"); } )*
	| factor{ }  ('/' factor { System.out.println("idiv"); } )*
	;


factor
	: '(' expr ')'
	| var
	;

repeatStmt
	@init {
    		int x = 0;
		int i = 0;
		int l = 0;
	}
	: 'repeat' 
		{
			i = nextRegister;
			decVars.put(String.valueOf(nextRegister), nextRegister);
			System.out.println("ldc 0");
  			System.out.println("istore " + decVars.get(String.valueOf(nextRegister++)));
		} 
		expr '{'
		{
			x = nextRegister;
			l = nextLoop;
			decVars.put(String.valueOf(nextRegister), nextRegister);
			System.out.println("istore " + decVars.get(String.valueOf(nextRegister++)));
			loops.put(String.valueOf(nextLoop), nextLoop);
			System.out.println("loop" + loops.get(String.valueOf(nextLoop++)) + ":");
		}
	 block '}'
		{
			System.out.println("iinc " +  decVars.get(String.valueOf(i)) + " " + 1);
  			System.out.println("iload " + decVars.get(String.valueOf(i)));
  			System.out.println("iload " + decVars.get(String.valueOf(x)));
			System.out.println("if_icmplt loop" + loops.get(String.valueOf(l)));
		}
	;

block
	: (stmt)+
	;

stmt
	: printStmt {
		System.out.println("; newline after a statement");
		System.out.println("getstatic java/lang/System/out Ljava/io/PrintStream;");
		System.out.println("ldc \"\\n\"");
		System.out.println("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
	}
	| assignStmt
	| repeatStmt
	;

printStmt
	: 'print' '(' exprlist ')'
	;

exprlist
	:

	(
	{
		System.out.println("getstatic java/lang/System/out Ljava/io/PrintStream;");
	}
	e1=expr ',' 
		{ 

    			System.out.println("invokevirtual java/io/PrintStream/print(I)V");
			System.out.println(" ; print a space inbetween each result");
			System.out.println("getstatic java/lang/System/out Ljava/io/PrintStream;");
			System.out.println("ldc \" \"");
			System.out.println("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
		} 
	)*
	{
		System.out.println("getstatic java/lang/System/out Ljava/io/PrintStream;");
	}
	e2=expr
	{
    		System.out.println("invokevirtual java/io/PrintStream/print(I)V");
	}
	;

assignStmt
	: 'let' ID '=' expr
		{ 
			if(!decVars.containsKey($ID.getText()))
				decVars.put( $ID.getText(), nextRegister++);
			System.out.println("istore " + decVars.get($ID.getText()));
		}
	;

var
	: x=ID 
		{ 
			System.out.println("; load the variable from the register");
			System.out.println("iload " + decVars.get($x.getText()));
		}
	| x=NUM 
		{ 
			System.out.println("ldc " + $x.getText());
		}
	;

/* Terminal Symbols */
NUM : ('0' .. '9')+ ;
ID : ('a' .. 'z' | 'A' .. 'Z')+ ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* ;
WS : (' ' | '\t' | '\r' | '\n') {skip();} ;
