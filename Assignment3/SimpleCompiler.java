import java.io.ByteArrayOutputStream;
import org.antlr.v4.runtime.*;
import java.io.*;

public class SimpleCompiler {
  public static void main(String[] args) throws Exception {
    if (args.length != 1) {
      System.err.println("Error: Invalid use of command line argument, expected file name");
      System.exit(0);       
    }
    FileInputStream in = new FileInputStream(args[0]);
    ANTLRInputStream input = new ANTLRInputStream(in);
    SimpleLexer lex = new SimpleLexer(input);
    CommonTokenStream tok = new CommonTokenStream(lex);
    SimpleParser parser = new SimpleParser(tok);
    int index1 = args[0].lastIndexOf("/") + 1;
    int index2 = args[0].indexOf(".");
    if (index1 == -1)
      index1 = 0;
    if (index2 == -1)
      index2 = args[0].length();
    System.out.println(".class public " + args[0].substring(index1, index2)); 
    parser.prog();
  }
}
