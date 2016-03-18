grammar A2Jason;

@header {
import java.util.TreeMap;
}

@members {

}

start 
	: ( stmtlist )+ EOF
	;

stmtlist 
	: stmt stmtlist
	| stmt
	;

stmt 
	: VAR ':=' expr
	| loop
	| dec
	;

expr 
	: expr '+' term
	| expr '-' term
	| term
	;

term 
	: term '*' factor
	| term '/' factor
	| factor
	;

factor 
	: '(' expr ')'
	| NUM
	| VAR
	;

loop 
	: 'while(' condition ') do' stmtlist 'end while'
	;

condition 
	: expr '<' expr
	| expr '>' expr
	| condition 'and' condition
	;

dec 
	: 'declare' VAR ':' type
	;

type 
	: 'Integer'
	;

/* Terminal Symbols */
NUM : ('0' .. '9')+ ;
VAR : ('a' .. 'z' | 'A' .. 'Z')+ ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-')* ;
WS : (' ' | '\t' | '\r' | '\n') {skip();} ;
