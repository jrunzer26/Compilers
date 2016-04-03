ANTLR = /usr/local/lib/antlr/antlr-4-4-complete.jar
CP = $(ANTLR):.

all:
	java -jar $(ANTLR) -no-listener -no-visitor *.g4
	javac -cp $(CP) *.java

hello:
	java -jar jasmin.jar ./hello.j

input: 
		java SimpleCompiler input
		java -jar jasmin.jar ./input.j

clean:
	rm -rf SimpleL*.java SimpleP*.java Simple*.tokens *.class
