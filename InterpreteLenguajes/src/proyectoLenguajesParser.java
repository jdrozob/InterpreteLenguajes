// Generated from C:\Users\TOSHIBA\Google Drive\Proyecto Lenguajes de Programacion\proyectoLenguajes.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class proyectoLenguajesParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASIGN=1, SCOL=2, APAR=3, CPAR=4, ALLAV=5, CLLAV=6, COMA=7, IF=8, ELSEIF=9, 
		ELSE=10, FOR=11, IN=12, RANGE=13, PRINT=14, TRUE=15, FALSE=16, EQ=17, 
		NEQ=18, GT=19, LT=20, GTEQ=21, LTEQ=22, PLUS=23, MINUS=24, ID=25, INT=26, 
		FLOAT=27, STRING=28, ESC_SEQ=29, OCTAL_ESC=30, UNICODE_ESC=31, HEX_DIGIT=32;
	public static final String[] tokenNames = {
		"<INVALID>", "'='", "';'", "'('", "')'", "'{'", "'}'", "','", "'if'", 
		"'elif'", "'else'", "'for'", "'in'", "'range'", "'print'", "'true'", "'false'", 
		"'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "ID", "INT", 
		"FLOAT", "STRING", "ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC", "HEX_DIGIT"
	};
	public static final int
		RULE_programa = 0, RULE_bloque = 1, RULE_sentencia = 2, RULE_asignacion = 3, 
		RULE_sent_if = 4, RULE_condicion_bloque = 5, RULE_bloque_sentencias = 6, 
		RULE_sentencia_for = 7, RULE_impresion = 8, RULE_expresion = 9, RULE_atom = 10;
	public static final String[] ruleNames = {
		"programa", "bloque", "sentencia", "asignacion", "sent_if", "condicion_bloque", 
		"bloque_sentencias", "sentencia_for", "impresion", "expresion", "atom"
	};

	@Override
	public String getGrammarFileName() { return "proyectoLenguajes.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public proyectoLenguajesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(proyectoLenguajesParser.EOF, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); bloque();
			setState(23); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(25); sentencia();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciaContext extends ParserRuleContext {
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public Sent_ifContext sent_if() {
			return getRuleContext(Sent_ifContext.class,0);
		}
		public Sentencia_forContext sentencia_for() {
			return getRuleContext(Sentencia_forContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencia);
		try {
			setState(35);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(31); asignacion();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(32); sent_if();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(33); sentencia_for();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(34); impresion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ASIGN() { return getToken(proyectoLenguajesParser.ASIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode ID() { return getToken(proyectoLenguajesParser.ID, 0); }
		public TerminalNode SCOL() { return getToken(proyectoLenguajesParser.SCOL, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(ID);
			setState(38); match(ASIGN);
			setState(39); expresion(0);
			setState(40); match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sent_ifContext extends ParserRuleContext {
		public Condicion_bloqueContext condicion_bloque(int i) {
			return getRuleContext(Condicion_bloqueContext.class,i);
		}
		public TerminalNode IF() { return getToken(proyectoLenguajesParser.IF, 0); }
		public List<TerminalNode> ELSEIF() { return getTokens(proyectoLenguajesParser.ELSEIF); }
		public Bloque_sentenciasContext bloque_sentencias() {
			return getRuleContext(Bloque_sentenciasContext.class,0);
		}
		public List<Condicion_bloqueContext> condicion_bloque() {
			return getRuleContexts(Condicion_bloqueContext.class);
		}
		public TerminalNode ELSE() { return getToken(proyectoLenguajesParser.ELSE, 0); }
		public TerminalNode ELSEIF(int i) {
			return getToken(proyectoLenguajesParser.ELSEIF, i);
		}
		public Sent_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterSent_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitSent_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitSent_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sent_ifContext sent_if() throws RecognitionException {
		Sent_ifContext _localctx = new Sent_ifContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sent_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(IF);
			setState(43); condicion_bloque();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(44); match(ELSEIF);
				setState(45); condicion_bloque();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(51); match(ELSE);
				setState(52); bloque_sentencias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condicion_bloqueContext extends ParserRuleContext {
		public Bloque_sentenciasContext bloque_sentencias() {
			return getRuleContext(Bloque_sentenciasContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Condicion_bloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterCondicion_bloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitCondicion_bloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitCondicion_bloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condicion_bloqueContext condicion_bloque() throws RecognitionException {
		Condicion_bloqueContext _localctx = new Condicion_bloqueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicion_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); expresion(0);
			setState(56); bloque_sentencias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bloque_sentenciasContext extends ParserRuleContext {
		public TerminalNode CLLAV() { return getToken(proyectoLenguajesParser.CLLAV, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode ALLAV() { return getToken(proyectoLenguajesParser.ALLAV, 0); }
		public Bloque_sentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_sentencias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterBloque_sentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitBloque_sentencias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitBloque_sentencias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_sentenciasContext bloque_sentencias() throws RecognitionException {
		Bloque_sentenciasContext _localctx = new Bloque_sentenciasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloque_sentencias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(ALLAV);
			setState(59); bloque();
			setState(60); match(CLLAV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentencia_forContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(proyectoLenguajesParser.IN, 0); }
		public TerminalNode CPAR() { return getToken(proyectoLenguajesParser.CPAR, 0); }
		public TerminalNode RANGE() { return getToken(proyectoLenguajesParser.RANGE, 0); }
		public Bloque_sentenciasContext bloque_sentencias() {
			return getRuleContext(Bloque_sentenciasContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(proyectoLenguajesParser.INT); }
		public TerminalNode APAR() { return getToken(proyectoLenguajesParser.APAR, 0); }
		public TerminalNode FOR() { return getToken(proyectoLenguajesParser.FOR, 0); }
		public TerminalNode ID() { return getToken(proyectoLenguajesParser.ID, 0); }
		public TerminalNode COMA() { return getToken(proyectoLenguajesParser.COMA, 0); }
		public TerminalNode INT(int i) {
			return getToken(proyectoLenguajesParser.INT, i);
		}
		public Sentencia_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterSentencia_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitSentencia_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitSentencia_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_forContext sentencia_for() throws RecognitionException {
		Sentencia_forContext _localctx = new Sentencia_forContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentencia_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(FOR);
			setState(63); match(ID);
			setState(64); match(IN);
			setState(65); match(RANGE);
			setState(66); match(APAR);
			setState(67); match(INT);
			setState(68); match(COMA);
			setState(69); match(INT);
			setState(70); match(CPAR);
			setState(71); bloque_sentencias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImpresionContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(proyectoLenguajesParser.PRINT, 0); }
		public TerminalNode STRING(int i) {
			return getToken(proyectoLenguajesParser.STRING, i);
		}
		public List<TerminalNode> ID() { return getTokens(proyectoLenguajesParser.ID); }
		public List<TerminalNode> PLUS() { return getTokens(proyectoLenguajesParser.PLUS); }
		public TerminalNode SCOL() { return getToken(proyectoLenguajesParser.SCOL, 0); }
		public List<TerminalNode> STRING() { return getTokens(proyectoLenguajesParser.STRING); }
		public TerminalNode PLUS(int i) {
			return getToken(proyectoLenguajesParser.PLUS, i);
		}
		public TerminalNode ID(int i) {
			return getToken(proyectoLenguajesParser.ID, i);
		}
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitImpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_impresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(PRINT);
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(75); match(PLUS);
				setState(76);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82); match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public int _p;
		public ExpresionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpresionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class MinusExprContext extends ExpresionContext {
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public TerminalNode MINUS() { return getToken(proyectoLenguajesParser.MINUS, 0); }
		public MinusExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GteqExprContext extends ExpresionContext {
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode GTEQ() { return getToken(proyectoLenguajesParser.GTEQ, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public GteqExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterGteqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitGteqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitGteqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtExprContext extends ExpresionContext {
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public TerminalNode GT() { return getToken(proyectoLenguajesParser.GT, 0); }
		public GtExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterGtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitGtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitGtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExpresionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NeqExprContext extends ExpresionContext {
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(proyectoLenguajesParser.NEQ, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public NeqExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterNeqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitNeqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitNeqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusExprContext extends ExpresionContext {
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public TerminalNode PLUS() { return getToken(proyectoLenguajesParser.PLUS, 0); }
		public PlusExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterPlusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitPlusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitPlusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtExprContext extends ExpresionContext {
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode LT() { return getToken(proyectoLenguajesParser.LT, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public LtExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterLtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitLtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitLtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LteqExprContext extends ExpresionContext {
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public TerminalNode LTEQ() { return getToken(proyectoLenguajesParser.LTEQ, 0); }
		public LteqExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterLteqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitLteqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitLteqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExprContext extends ExpresionContext {
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public TerminalNode EQ() { return getToken(proyectoLenguajesParser.EQ, 0); }
		public EqExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState, _p);
		ExpresionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, RULE_expresion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AtomExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(85); atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new PlusExprContext(new ExpresionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(87);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(88); match(PLUS);
						setState(89); expresion(10);
						}
						break;

					case 2:
						{
						_localctx = new MinusExprContext(new ExpresionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(90);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(91); match(MINUS);
						setState(92); expresion(9);
						}
						break;

					case 3:
						{
						_localctx = new LteqExprContext(new ExpresionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(93);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(94); match(LTEQ);
						setState(95); expresion(8);
						}
						break;

					case 4:
						{
						_localctx = new GteqExprContext(new ExpresionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(96);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(97); match(GTEQ);
						setState(98); expresion(7);
						}
						break;

					case 5:
						{
						_localctx = new LtExprContext(new ExpresionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(99);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(100); match(LT);
						setState(101); expresion(6);
						}
						break;

					case 6:
						{
						_localctx = new GtExprContext(new ExpresionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(102);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(103); match(GT);
						setState(104); expresion(5);
						}
						break;

					case 7:
						{
						_localctx = new NeqExprContext(new ExpresionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(105);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(106); match(NEQ);
						setState(107); expresion(4);
						}
						break;

					case 8:
						{
						_localctx = new EqExprContext(new ExpresionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(108);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(109); match(EQ);
						setState(110); expresion(3);
						}
						break;
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprContext extends AtomContext {
		public TerminalNode CPAR() { return getToken(proyectoLenguajesParser.CPAR, 0); }
		public TerminalNode APAR() { return getToken(proyectoLenguajesParser.APAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ParExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAtomContext extends AtomContext {
		public TerminalNode ID() { return getToken(proyectoLenguajesParser.ID, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterIdAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitIdAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(proyectoLenguajesParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode FLOAT() { return getToken(proyectoLenguajesParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(proyectoLenguajesParser.INT, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(proyectoLenguajesParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(proyectoLenguajesParser.FALSE, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).enterBooleanAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoLenguajesListener ) ((proyectoLenguajesListener)listener).exitBooleanAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoLenguajesVisitor ) return ((proyectoLenguajesVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atom);
		int _la;
		try {
			setState(124);
			switch (_input.LA(1)) {
			case APAR:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116); match(APAR);
				setState(117); expresion(0);
				setState(118); match(CPAR);
				}
				break;
			case INT:
			case FLOAT:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case ID:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(122); match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(123); match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9: return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 9 >= _localctx._p;

		case 1: return 8 >= _localctx._p;

		case 2: return 7 >= _localctx._p;

		case 3: return 6 >= _localctx._p;

		case 4: return 5 >= _localctx._p;

		case 5: return 4 >= _localctx._p;

		case 6: return 3 >= _localctx._p;

		case 7: return 2 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\"\u0081\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\4\3\4\3\4\3\4"+
		"\5\4&\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\61\n\6\f\6\16\6\64\13"+
		"\6\3\6\3\6\5\68\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\nP\n\n\f\n\16\nS\13\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"r\n\13\f\13\16\13u\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\177\n\f\3"+
		"\f\2\r\2\4\6\b\n\f\16\20\22\24\26\2\5\4\2\33\33\36\36\3\2\34\35\3\2\21"+
		"\22\u0088\2\30\3\2\2\2\4\36\3\2\2\2\6%\3\2\2\2\b\'\3\2\2\2\n,\3\2\2\2"+
		"\f9\3\2\2\2\16<\3\2\2\2\20@\3\2\2\2\22K\3\2\2\2\24V\3\2\2\2\26~\3\2\2"+
		"\2\30\31\5\4\3\2\31\32\7\2\2\3\32\3\3\2\2\2\33\35\5\6\4\2\34\33\3\2\2"+
		"\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\5\3\2\2\2 \36\3\2\2\2!&"+
		"\5\b\5\2\"&\5\n\6\2#&\5\20\t\2$&\5\22\n\2%!\3\2\2\2%\"\3\2\2\2%#\3\2\2"+
		"\2%$\3\2\2\2&\7\3\2\2\2\'(\7\33\2\2()\7\3\2\2)*\5\24\13\2*+\7\4\2\2+\t"+
		"\3\2\2\2,-\7\n\2\2-\62\5\f\7\2./\7\13\2\2/\61\5\f\7\2\60.\3\2\2\2\61\64"+
		"\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\67\3\2\2\2\64\62\3\2\2\2\65\66"+
		"\7\f\2\2\668\5\16\b\2\67\65\3\2\2\2\678\3\2\2\28\13\3\2\2\29:\5\24\13"+
		"\2:;\5\16\b\2;\r\3\2\2\2<=\7\7\2\2=>\5\4\3\2>?\7\b\2\2?\17\3\2\2\2@A\7"+
		"\r\2\2AB\7\33\2\2BC\7\16\2\2CD\7\17\2\2DE\7\5\2\2EF\7\34\2\2FG\7\t\2\2"+
		"GH\7\34\2\2HI\7\6\2\2IJ\5\16\b\2J\21\3\2\2\2KL\7\20\2\2LQ\t\2\2\2MN\7"+
		"\31\2\2NP\t\2\2\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ"+
		"\3\2\2\2TU\7\4\2\2U\23\3\2\2\2VW\b\13\1\2WX\5\26\f\2Xs\3\2\2\2YZ\6\13"+
		"\2\3Z[\7\31\2\2[r\5\24\13\2\\]\6\13\3\3]^\7\32\2\2^r\5\24\13\2_`\6\13"+
		"\4\3`a\7\30\2\2ar\5\24\13\2bc\6\13\5\3cd\7\27\2\2dr\5\24\13\2ef\6\13\6"+
		"\3fg\7\26\2\2gr\5\24\13\2hi\6\13\7\3ij\7\25\2\2jr\5\24\13\2kl\6\13\b\3"+
		"lm\7\24\2\2mr\5\24\13\2no\6\13\t\3op\7\23\2\2pr\5\24\13\2qY\3\2\2\2q\\"+
		"\3\2\2\2q_\3\2\2\2qb\3\2\2\2qe\3\2\2\2qh\3\2\2\2qk\3\2\2\2qn\3\2\2\2r"+
		"u\3\2\2\2sq\3\2\2\2st\3\2\2\2t\25\3\2\2\2us\3\2\2\2vw\7\5\2\2wx\5\24\13"+
		"\2xy\7\6\2\2y\177\3\2\2\2z\177\t\3\2\2{\177\t\4\2\2|\177\7\33\2\2}\177"+
		"\7\36\2\2~v\3\2\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\27\3\2"+
		"\2\2\n\36%\62\67Qqs~";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}