/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interpretelenguajes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *
 * @author jdrozob
 */
public class EvalVisitor extends proyectoLenguajesBaseVisitor<Value> {
    
    //Variables de control:
    String strProceso = "";
    int line = 0;

    public void setLine(int line) {
        this.line = line;
    }

    public void setStrProceso(String strProceso) {
        this.strProceso = strProceso;
    }

    public String getStrProceso() {
        return strProceso;
    }

  // used to compare floating point numbers
  public static final double SMALL_VALUE = 0.00000000001;

  // store variables (there's only one global scope!)
  private Map<String, Value> memory = new HashMap<String, Value>();

  // assignment/id overrides
  @Override
  public Value visitAssignment(proyectoLenguajesParser.AssignmentContext ctx) {
  String id = ctx.ID().getText();
  Value value = this.visit(ctx.expr());
  return memory.put(id, value);
  }

  @Override
  public Value visitIdAtom(proyectoLenguajesParser.IdAtomContext ctx) {
  String id = ctx.getText();
  Value value = memory.get(id);
  if(value == null) {
  throw new RuntimeException("no such variable: " + id);
  }
  return value;
  }

  // atom overrides
  @Override
  public Value visitStringAtom(proyectoLenguajesParser.StringAtomContext ctx) {
  String str = ctx.getText();
  // strip quotes
  str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
  return new Value(str);
  }

  @Override
  public Value visitNumberAtom(proyectoLenguajesParser.NumberAtomContext ctx) {
  return new Value(Double.valueOf(ctx.getText()));
  }

  @Override
  public Value visitBooleanAtom(proyectoLenguajesParser.BooleanAtomContext ctx) {
  return new Value(Boolean.valueOf(ctx.getText()));
  }

  // expr overrides
  @Override
  public Value visitParExpr(proyectoLenguajesParser.ParExprContext ctx) {
  return this.visit(ctx.expr());
  }

  @Override
  public Value visitPlusExpr(proyectoLenguajesParser.PlusExprContext ctx) {
  Value left = this.visit(ctx.expr(0));
  Value right = this.visit(ctx.expr(1));
  if(left.isDouble() && right.isDouble()) {
  return new Value(left.asDouble() + right.asDouble());
  }
  else {
  return new Value(left.asString() + right.asString());
  }
  }

  @Override
  public Value visitMinusExpr(proyectoLenguajesParser.MinusExprContext ctx) {
  Value left = this.visit(ctx.expr(0));
  Value right = this.visit(ctx.expr(1));
  return new Value(left.asDouble() - right.asDouble());
  }

  @Override
  public Value visitLtExpr(proyectoLenguajesParser.LtExprContext ctx) {
  Value left = this.visit(ctx.expr(0));
  Value right = this.visit(ctx.expr(1));
  return new Value(left.asDouble() < right.asDouble());
  }

  @Override
  public Value visitLteqExpr(proyectoLenguajesParser.LteqExprContext ctx) {
  Value left = this.visit(ctx.expr(0));
  Value right = this.visit(ctx.expr(1));
  return new Value(left.asDouble() <= right.asDouble());
  }

  @Override
  public Value visitGtExpr(proyectoLenguajesParser.GtExprContext ctx) {
  Value left = this.visit(ctx.expr(0));
  Value right = this.visit(ctx.expr(1));
  return new Value(left.asDouble() > right.asDouble());
  }

  @Override
  public Value visitGteqExpr(proyectoLenguajesParser.GteqExprContext ctx) {
  Value left = this.visit(ctx.expr(0));
  Value right = this.visit(ctx.expr(1));
  return new Value(left.asDouble() >= right.asDouble());
  }

  @Override
  public Value visitNeqExpr(proyectoLenguajesParser.NeqExprContext ctx) {
  Value left = this.visit(ctx.expr(0));
  Value right = this.visit(ctx.expr(1));
  if(left.isDouble() && right.isDouble()) {
  double diff = Math.abs(left.asDouble() - right.asDouble());
  return new Value(diff >= SMALL_VALUE);
  }
  else {
  return new Value(!left.equals(right));
  }
  }

  @Override
  public Value visitEqExpr(proyectoLenguajesParser.EqExprContext ctx) {
  Value left = this.visit(ctx.expr(0));
  Value right = this.visit(ctx.expr(1));
  if(left.isDouble() && right.isDouble()) {
  double diff = Math.abs(left.asDouble() - right.asDouble());
  return new Value(diff < SMALL_VALUE);
  }
  else {
  return new Value(left.equals(right));
  }
  }

  // if override
  @Override
  public Value visitIf_stat(proyectoLenguajesParser.If_statContext ctx) {

  List<proyectoLenguajesParser.Condition_blockContext> conditions = ctx.condition_block();

  boolean evaluatedBlock = false;

  for(proyectoLenguajesParser.Condition_blockContext condition : conditions) {

  Value evaluated = this.visit(condition.expr());

  if(evaluated.asBoolean()) {
  evaluatedBlock = true;
  // evaluate this block whose expr==true
  this.visit(condition.stat_block());
  break;
  }
  }

  if(!evaluatedBlock && ctx.stat_block() != null) {
  // evaluate the else-stat_block (if present == not null)
  this.visit(ctx.stat_block());
  }

  return Value.VOID;
  }

  // for override
  @Override
  public Value visitFor_stat(proyectoLenguajesParser.For_statContext ctx) {
  
  String id = ctx.ID().getText();
  
  int desde = Integer.parseInt(ctx.INT(0).getText());
  int hasta = Integer.parseInt(ctx.INT(1).getText());

  for(int i=desde; i<hasta; i++){
    Value value = new Value(i);
    memory.put(id, value);
    this.visit(ctx.stat_block());
  }  

  return Value.VOID;
  }
  
  // for override
  @Override
  public Value visitPrint_stat(proyectoLenguajesParser.Print_statContext ctx) {
        Value value = this.visit(ctx.expr());
        line = line + 1;
        //System.out.println(value);
        //Aqui se guarda el proceso en una variable para mostrar en la interfaz:
        strProceso += line + ".     " + value + "\n";
        return value;
  }
}

