grammar Simple;

@header {
import java.util.TreeMap;
}

@members {
	// The String is the variable name, and the Integer will be the register location
	public static TreeMap<String, Integer> decVars = new TreeMap<String, Integer>();
	public static int nextRegister = 0;
}

prog
	: 
	{
		System.out.println(".class public SimpleStuff");
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
	{  }
	;	

expr returns [int val]
	: term { $val = $term.val; } ('+' term { $val = $val + $term.val; })*
	| term { $val = $term.val; } ('-' term { $val = $val - $term.val; })*
	;

term returns [int val]
	: factor { $val = $factor.val; } ('*' factor { $val = $val * $factor.val; })*
	| factor{ $val = $factor.val; }  ('/' factor { $val = $val / $factor.val; })*
	;


factor returns [int val]
	: '(' expr ')' { $val = $expr.val; }
	| var 
		{
			$val = $var.number;
		}
	;

repeatStmt returns [String s]
	: 'repeat' expr '{' block '}'
		{
			$s = "";
		}
	;

block returns [String s]
	: (stmt { 
			if ($s != null)
				$s = $s + $stmt.s;
			else
				$s = $stmt.s;
		})+
	;

stmt returns [String s]
	: printStmt { $s = $printStmt.s; }
	| assignStmt { $s = $assignStmt.s; }
	| repeatStmt { $s = ""; }
	;

printStmt returns [String s]
	: 'print' '(' exprlist ')' { $s = $exprlist.s; }
	;

exprlist returns [String s]
	:
	{
		System.out.println("getstatic java/lang/System/out Ljava/io/PrintStream;");
	}
	(e1=expr ',' 
		{ 
			$s = "";
    			System.out.println("invokevirtual java/io/PrintStream/println(I)V");
		} 
	)*
	{
		System.out.println("; Print the value");
		System.out.println("getstatic java/lang/System/out Ljava/io/PrintStream;");
	} 
	e2=expr
	{
    		System.out.println("invokevirtual java/io/PrintStream/println(I)V");
	}
	;

assignStmt returns [String s]
	: 'let' ID '=' expr
		{ 
			decVars.put( $ID.getText(), nextRegister++);
			$s = "";
			System.out.println("istore " + decVars.get($ID.getText()));
		}
	;

var returns [int number]
	: x=ID 
		{ 
			$number = decVars.get($x.getText());
			System.out.println("; load the variable from the register");
			System.out.println("iload " + decVars.get($x.getText()));
		}
	| x=NUM 
		{ 
			$number = Integer.parseInt($x.getText());
			System.out.println("ldc " + $x.getText());
		}
	;

/* Terminal Symbols */
NUM : ('0' .. '9')+ ;
ID : ('a' .. 'z' | 'A' .. 'Z')+ ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-')* ;
WS : (' ' | '\t' | '\r' | '\n') {skip();} ;
