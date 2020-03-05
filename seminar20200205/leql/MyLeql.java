import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class MyLeql {
  public static class MyListener extends LeqlParserBaseListener {
    @Override public void enterWhere(LeqlParser.WhereContext ctx) {
      System.out.println("Entered WHERE: " + ctx.getText());
    }
    @Override public void exitIpv4CidrKvpEquality(LeqlParser.Ipv4CidrKvpEqualityContext ctx) {
      System.out.println("Entered IP search: " + ctx.getText());
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
    LeqlLexer lexer = new LeqlLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    LeqlParser parser = new LeqlParser(tokens);
    ParseTree tree = parser.filter(); // parse; start at prog
   
    System.out.println("Parsed tree:\n" + tree.toStringTree(parser)); // print tree as text

    // Out of the scope of this demo
    //MyVisitor eval = new MyVisitor();
    //eval.visit(tree);

    ParseTreeWalker walker = new ParseTreeWalker();
    MyListener myListener = new MyListener();
    walker.walk(myListener, tree);
  }
}
