import java.io.ByteArrayOutputStream;
import org.antlr.v4.runtime.*;
import java.io.*;

public class SimpleCompiler {
  public static void main(String[] args) throws Exception {
    final PrintStream store = System.out;
    if (args.length != 1) {
      System.err.println("Error: Invalid use of command line argument, expected file name");
      System.exit(0);       
    }
    FileInputStream in = new FileInputStream(args[0]);
    ANTLRInputStream input = new ANTLRInputStream(in);
    SimpleLexer lex = new SimpleLexer(input);
    CommonTokenStream tok = new CommonTokenStream(lex);
    SimpleParser parser = new SimpleParser(tok);
    int index = args[0].indexOf(".");
    if (index == -1)
      index = args[0].length();
    System.setOut(new PrintStream(new FileOutputStream(args[0].substring(0, index) + ".j")));
    System.out.println(".class public " + args[0].substring(0, index)); 
    parser.prog();
    System.setOut(store);
  }
}
