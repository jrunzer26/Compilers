#!/bin/bash
ANTLR = /usr/local/lib/antlr/antlr-4-4-complete.jar
CP = $(ANTLR):.

all:
	java -jar $(ANTLR) -no-listener -no-visitor *.g4
	javac -cp $(CP) *.java

hello:
	java -jar jasmin.jar ./hello.j
	echo hello

.PHONY: input
input: 
	java SimpleCompiler input > input.j
	java -jar jasmin.jar ./input.j
	java input

clean:
	rm -rf SimpleL*.java SimpleP*.java Simple*.tokens *.class
