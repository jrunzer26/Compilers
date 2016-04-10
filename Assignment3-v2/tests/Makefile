#!/bin/bash
ANTLR = lib/antlr-4.5.2-complete.jar
JASMIN = lib/jasmin.jar
CP = $(ANTLR):$(JASMIN):.

all:
	java -jar $(ANTLR) -no-listener -no-visitor *.g4
	javac -cp $(CP) *.java

run:
	java -cp $(CP) SimpleCompiler tests/declaration.txt > declaration.j
	java -jar $(JASMIN) declaration.j
	java declaration
	echo "Declaration Test"
	java -cp $(CP) SimpleCompiler tests/print_one.txt > print_one.j
	java -jar $(JASMIN) print_one.j
	java print_one
	echo "Print One Test"
	java -cp $(CP) SimpleCompiler tests/print_multi.txt > print_multi.j
	java -jar $(JASMIN) print_multi.j
	java print_multi
	echo "Print Many Test"
	java -cp $(CP) SimpleCompiler tests/addition.txt > addition.j
	java -jar $(JASMIN) addition.j
	java addition
	echo "Addition Test"
	java -cp $(CP) SimpleCompiler tests/subtraction.txt > subtraction.j
	java -jar $(JASMIN) subtraction.j
	java subtraction
	echo "Subtraction Test"
	java -cp $(CP) SimpleCompiler tests/product.txt > product.j
	java -jar $(JASMIN) product.j
	java product
	echo "Product Test"
	java -cp $(CP) SimpleCompiler tests/division.txt > division.j
	java -jar $(JASMIN) division.j
	java division
	echo "Division Test"
	java -cp $(CP) SimpleCompiler tests/expression.txt > expression.j
	java -jar $(JASMIN) expression.j
	java expression
	echo "Expression Test"
	java -cp $(CP) SimpleCompiler tests/repeat_one.txt > repeat_one.j
	java -jar $(JASMIN) repeat_one.j
	java repeat_one
	echo "Repeat one statement Test"
	java -cp $(CP) SimpleCompiler tests/repeat_multi.txt > repeat_multi.j
	java -jar $(JASMIN) repeat_multi.j
	java repeat_multi
	echo "Repeat many statements Test"
	
clean:
	rm -rf SimpleLexer.java SimpleParser.java *.tokens *.class *.j
