import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class MyCalc {
  public static class MyListener extends CalcBaseListener {
    @Override public void enterId(CalcParser.IdContext ctx) {
      System.out.println("Entered ID: " + ctx.getText());
    }
  }

  public static void main(String[] args) throws Exception {
    String inputFile = null;
    if (args.length > 0 )
      inputFile = args[0];
    InputStream is = System.in;
    if (inputFile != null ) 
      is = new FileInputStream(inputFile);

    ANTLRInputStream input = new ANTLRInputStream(is);
    CalcLexer lexer = new CalcLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    CalcParser parser = new CalcParser(tokens);
    ParseTree tree = parser.prog(); // parse; start at prog
   
    System.out.println("Parsed tree:\n" + tree.toStringTree(parser)); // print tree as text

    // Out of the scope of this demo
    //MyVisitor eval = new MyVisitor();
    //eval.visit(tree);

    ParseTreeWalker walker = new ParseTreeWalker();
    MyListener myListener = new MyListener();
    walker.walk(myListener, tree);
  }
}
