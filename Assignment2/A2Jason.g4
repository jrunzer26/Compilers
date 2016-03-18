grammar A2Jason;

@header {
import java.util.TreeMap;
}

@members {

}

start 
	: {System.out.println("public class A2_apples {\n\tpublic static void main(String[] args){");}( stmtlist {System.out.println( $stmtlist.s );}) EOF {System.out.print("\t}\n}\n");} EOF
	;


stmtlist returns [String s]
	: stmt a { $s =  $stmt.s + $a.s; }
	;


a returns [String s]
	: stmtlist { $s = $stmtlist.s; }
	| { $s = ""; }
	;


stmt returns [String s]
	: ID ':=' expr { $s = "\t\t" + $ID.getText() + " = " +  $expr.s + ";\n"; }
	| loop { $s = "\t\t" + $loop.s +"\t\t}\n"; }
	| dec { $s = "\t\t" + $dec.s + "\n"; }
	;

expr returns [String s]
	: term c { $s = $term.s + $c.s; }
	;

c returns [String s]
	: '+' term { $s = " + " + $term.s; }
	| '-' term { $s = " - " + $term.s; }
	| { $s = ""; }
	;

term returns [String s]
	: factor d { $s = $factor.s + $d.s; }
	;

d returns [String s]
	: '*' factor { $s = " * " + $factor.s; }
	| '/' factor { $s = " / " + $factor.s; }
	| { $s = ""; }
	;

factor returns [String s]
	: '(' expr ')' { $s = "(" + $expr.s + ")"; }
	| var { $s = $var.number; }
	;

loop returns [String s]
	: 'while' '(' conditionlist ')' 'do' stmtlist 'end while' 
		{ 
			$s = "while (" + $conditionlist.s + ") {\n\t" +
				$stmtlist.s;
		}
	;

conditionlist returns [String s]
	: condition e { $s = $condition.s + $e.s; }
	;

e returns [String s]
	: 'and' conditionlist { $s = " && " + $conditionlist.s; }
	| { $s = ""; }
	;

condition returns [String s]
	: expr1=expr '<' expr2=expr { $s = "(" + $expr1.s + " < " + $expr2.s + ")"; }
	| expr1=expr '>' expr2=expr { $s = "(" + $expr1.s + " > " + $expr2.s + ")"; }
	;

dec returns [String s]
	: 'declare' ID ':' type { $s = $type.s + " " + $ID.getText() + ";"; }
	;

type returns [String s]
	: 'Integer' { $s = "int"; }
	;

var returns [String number]
	: ID 
		{ 
			$number = ""+$ID.getText(); 
		}
	| NUM 
		{ 
			$number = ""+ $NUM.getText(); 
		}
	;

/* Terminal Symbols */
NUM : ('0' .. '9')+ ;
ID : ('a' .. 'z' | 'A' .. 'Z')+ ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-')* ;
WS : (' ' | '\t' | '\r' | '\n') {skip();} ;

