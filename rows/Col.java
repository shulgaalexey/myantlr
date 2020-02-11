import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;


class Col {
  public static void main(String[] args) throws Exception {
    ANTLRInputStream input = new ANTLRInputStream(System.in);

    RowsLexer lexer = new RowsLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    int col = Integer.valueOf(args[0]);
    RowsParser parser = new RowsParser(tokens, col);  // pass column number
    //parser.setBuildParserTree(false);  // don't waste time building a tree
    parser.file(); // parse
  }
}
