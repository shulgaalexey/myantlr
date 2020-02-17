
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Map;
import org.antlr.v4.misc.OrderedHashMap;
import java.io.*;

public class TestPropertyFile {

  public static class PropertyFileLoader extends PropertyFileBaseListener {
    Map<String, String> props = new OrderedHashMap<>();
    @Override public void exitProp(PropertyFileParser.PropContext ctx) { 
      final String id = ctx.ID().getText();
      final String value = ctx.STRING().getText();
      props.put(id, value);
    }
  }

  public static void main(String[] args) throws Exception {
    String inputFile = null;
    if (args.length > 0)
      inputFile = args[0];
    InputStream is = System.in;
    if (inputFile != null)
      is = new FileInputStream(inputFile);
    ANTLRInputStream input = new ANTLRInputStream(is);
    PropertyFileLexer lexer = new PropertyFileLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    PropertyFileParser parser = new PropertyFileParser(tokens);
    ParseTree tree = parser.file();

    // Create a standard ANTLR parse tree walker
    ParseTreeWalker walker = new ParseTreeWalker();
    // Create listener then feed to walker
    PropertyFileLoader loader = new PropertyFileLoader();
    walker.walk(loader, tree);
    System.out.println(loader.props);
  }
}
