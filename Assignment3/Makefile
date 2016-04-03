ANTLR = /usr/local/lib/antlr/antlr-4-4-complete.jar
CP = $(ANTLR):.

all:
	java -jar $(ANTLR) -no-listener -no-visitor *.g4
	javac -cp $(CP) *.java

run:
	@java -cp $(CP) SimpleCompiler input

hello:
	java -jar jasmin.jar ./hello.j

clean:
	rm -rf SimpleL*.java SimpleP*.java Simple*.tokens *.class
