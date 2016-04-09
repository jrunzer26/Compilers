grammar Simple;

@header {
import java.util.TreeMap;
}

@members {
  SymbolTable sym = new SymbolTable();
  public void printCode(Code c) {
    System.out.println(".super java/lang/Object");
    System.out.println(".method public <init>()V");
    System.out.println("aload_0");
    System.out.println("invokenonvirtual java/lang/Object/<init>()V");
    System.out.println("return");
    System.out.println(".end method\n");
    System.out.println(".method public static main([Ljava/lang/String;)V");
    System.out.println(".limit stack 10");
    System.out.println(".limit locals 10");
    for (String i: c) {
      System.out.println(i);
    }
    System.out.println("return\n.end method");
  }
}

prog
  : block { printCode($block.code); }
  ;	

expr returns [Code code]
  @init {
    $code = new Code();
  }
  : t1=term {
    $code.extend($t1.code);
  }('+' t2=term {
    $code.extend($t2.code);
    $code.append(I.IADD());
    })*
  | t1=term { 
    $code.extend($t1.code);
  }('-' t2=term { 
    $code.extend($t2.code);
    $code.append(I.ISUB());} )*
	;

term returns [Code code]
  : f1=factor { $code = new Code().extend($f1.code); } 
    ('*' f2=factor { 
      $code.extend($f2.code).append(I.IMUL());
    })*
  | f1=factor{ $code = new Code().extend($f1.code); }  
    ('/' f2=factor { 
      $code.extend($f2.code).append(I.IDIV());
    })*
  ;


factor returns [Code code]
	: '(' expr ')' { $code = $expr.code; }
	| var { $code = $var.code; }
	;

repeatStmt returns [Code code]
	@init {
          int x = 0;
	  int i = 0;
	  int l = 0;
          $code = new Code();
	}
	: 'repeat' expr '{' block '}'
	{
	  x = sym.createNewVar();
	  $code.append(I.LDC(0)).append(I.ISTORE(x));
	  String l1 = Code.newLabel();
	  $code.append(I.Label(l1));
	  $code
	  .extend($block.code)
	  .append(I.IINC(x,1))
	  .append(I.ILOAD(x))
	  .extend($expr.code)
	  .append(I.IF_ICMPLT(l1));
	}
	;

block returns [Code code]
  @init {
    $code = new Code();
  }
  : (stmt { $code.extend($stmt.code); })+
  ;

stmt returns [Code code]
  : printStmt {
    $code = $printStmt.code;
    $code.append("getstatic java/lang/System/out Ljava/io/PrintStream;")
    .append("ldc \"\\n\"")
    .append("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
  }
  | assignStmt { $code = $assignStmt.code; }
  | repeatStmt { $code = $repeatStmt.code; }
  ;

printStmt returns [Code code]
  : 'print' '(' exprlist ')' { $code = $exprlist.code; }
  ;

exprlist returns [Code code]
  @init {
    $code = new Code();
  }
  :
  (
  e1=expr ',' 
  { 
    $code.append(I.GetPrintStream());
    $code.extend($e1.code);
    $code.append(I.invokePrintln());
    $code.append(I.printSpace());
  })*
  e2=expr
  {
    $code.append(I.GetPrintStream());
    $code.extend($e2.code);
    $code.append(I.invokePrintln());
  }
  ;

assignStmt returns [Code code]
  : 'let' ID '=' expr
  { 
    int register = sym.resolve($ID.getText(), true);
    $code = new Code().extend($expr.code).append(I.ISTORE(register));
  }
  ;

var returns [Code code]
  : x=ID { $code = new Code().append(I.ILOAD(sym.resolve($x.getText(), false))); }
  | x=NUM { $code = new Code().append(I.LDC($x.getText())); }
  ;

/* Terminal Symbols */
NUM : ('0' .. '9')+ ;
ID : ('a' .. 'z' | 'A' .. 'Z')+ ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* ;
WS : (' ' | '\t' | '\r' | '\n') {skip();} ;
