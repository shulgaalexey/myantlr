import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {
  // Memory for our calculator; variable/value pairs go here
  Map<String, Integer> memory = new HashMap<String, Integer>();

  // ID '=' expr NEWLINE
  @Override
  public Integer visitAssign(LabeledExprParser.AssignContext ctx) {
    String id = ctx.ID().getText();  // id is left-hand side of '='
    int value = visit(ctx.expr());   // compute value of expr on right
    memory.put(id, value);
    return value;
  }

  // expr NEWLINE
  @Override
  public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx) {
    Integer value = visit(ctx.expr());   // evaluate the expr child
    System.out.println(value);
    return 0;
  }

  // INT
  @Override
  public Integer visitInt(LabeledExprParser.IntContext ctx) {
    return Integer.valueOf(ctx.INT().getText());
  }

  // ID
  @Override
  public Integer visitId(LabeledExprParser.IdContext ctx) {
    String id = ctx.ID().getText();
    if (memory.containsKey(id)) {
      return memory.get(id);
    }
    return 0;
  }

  // expr = op=('*'|'/') expr
  @Override
  public Integer visitMulDiv(LabeledExprParser.MulDivContext ctx) {
    int left = visit(ctx.expr(0));  // value of left subexpression
    int right = visit(ctx.expr(1)); // value of right subexpression
    if (ctx.op.getType() == LabeledExprParser.MUL)
      return left * right;
    else
      return left / right;
  }

  // expr = op=('+'|'-') expr
  @Override
  public Integer visitAddSub(LabeledExprParser.AddSubContext ctx) {
    int left = visit(ctx.expr(0));
    int right = visit(ctx.expr(1));
    if (ctx.op.getType() == LabeledExprParser.ADD)
      return left + right;
    else
      return left - right;
  }

  // '(' expr ')'
  @Override
  public Integer visitParens(LabeledExprParser.ParensContext ctx) {
    return visit(ctx.expr());
  }


  @Override 
  public Integer visitClr(LabeledExprParser.ClrContext ctx) {
    System.out.println("Clear the memory");
    //return visitChildren(ctx);
    memory.clear();
    return 42;
  }
}
