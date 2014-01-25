// Generated from proyectoLenguajes.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface proyectoLenguajesListener extends ParseTreeListener {
	void enterImpresion(proyectoLenguajesParser.ImpresionContext ctx);
	void exitImpresion(proyectoLenguajesParser.ImpresionContext ctx);

	void enterBloque_sentencias(proyectoLenguajesParser.Bloque_sentenciasContext ctx);
	void exitBloque_sentencias(proyectoLenguajesParser.Bloque_sentenciasContext ctx);

	void enterSentencia(proyectoLenguajesParser.SentenciaContext ctx);
	void exitSentencia(proyectoLenguajesParser.SentenciaContext ctx);

	void enterAtomExpr(proyectoLenguajesParser.AtomExprContext ctx);
	void exitAtomExpr(proyectoLenguajesParser.AtomExprContext ctx);

	void enterLtExpr(proyectoLenguajesParser.LtExprContext ctx);
	void exitLtExpr(proyectoLenguajesParser.LtExprContext ctx);

	void enterPlusExpr(proyectoLenguajesParser.PlusExprContext ctx);
	void exitPlusExpr(proyectoLenguajesParser.PlusExprContext ctx);

	void enterStringAtom(proyectoLenguajesParser.StringAtomContext ctx);
	void exitStringAtom(proyectoLenguajesParser.StringAtomContext ctx);

	void enterLteqExpr(proyectoLenguajesParser.LteqExprContext ctx);
	void exitLteqExpr(proyectoLenguajesParser.LteqExprContext ctx);

	void enterNumberAtom(proyectoLenguajesParser.NumberAtomContext ctx);
	void exitNumberAtom(proyectoLenguajesParser.NumberAtomContext ctx);

	void enterAsignacion(proyectoLenguajesParser.AsignacionContext ctx);
	void exitAsignacion(proyectoLenguajesParser.AsignacionContext ctx);

	void enterBooleanAtom(proyectoLenguajesParser.BooleanAtomContext ctx);
	void exitBooleanAtom(proyectoLenguajesParser.BooleanAtomContext ctx);

	void enterParExpr(proyectoLenguajesParser.ParExprContext ctx);
	void exitParExpr(proyectoLenguajesParser.ParExprContext ctx);

	void enterPrograma(proyectoLenguajesParser.ProgramaContext ctx);
	void exitPrograma(proyectoLenguajesParser.ProgramaContext ctx);

	void enterMinusExpr(proyectoLenguajesParser.MinusExprContext ctx);
	void exitMinusExpr(proyectoLenguajesParser.MinusExprContext ctx);

	void enterIdAtom(proyectoLenguajesParser.IdAtomContext ctx);
	void exitIdAtom(proyectoLenguajesParser.IdAtomContext ctx);

	void enterGteqExpr(proyectoLenguajesParser.GteqExprContext ctx);
	void exitGteqExpr(proyectoLenguajesParser.GteqExprContext ctx);

	void enterGtExpr(proyectoLenguajesParser.GtExprContext ctx);
	void exitGtExpr(proyectoLenguajesParser.GtExprContext ctx);

	void enterSent_if(proyectoLenguajesParser.Sent_ifContext ctx);
	void exitSent_if(proyectoLenguajesParser.Sent_ifContext ctx);

	void enterNeqExpr(proyectoLenguajesParser.NeqExprContext ctx);
	void exitNeqExpr(proyectoLenguajesParser.NeqExprContext ctx);

	void enterBloque(proyectoLenguajesParser.BloqueContext ctx);
	void exitBloque(proyectoLenguajesParser.BloqueContext ctx);

	void enterCondicion_bloque(proyectoLenguajesParser.Condicion_bloqueContext ctx);
	void exitCondicion_bloque(proyectoLenguajesParser.Condicion_bloqueContext ctx);

	void enterEqExpr(proyectoLenguajesParser.EqExprContext ctx);
	void exitEqExpr(proyectoLenguajesParser.EqExprContext ctx);

	void enterSentencia_for(proyectoLenguajesParser.Sentencia_forContext ctx);
	void exitSentencia_for(proyectoLenguajesParser.Sentencia_forContext ctx);
}