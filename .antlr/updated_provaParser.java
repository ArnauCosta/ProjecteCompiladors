// Generated from c:/Users/arnau/Documents/uni/Compiladors/antlr-proj/updated_prova.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class updated_provaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_WS=1, TK_LPAREN=2, TK_RPAREN=3, TK_LBRACKET=4, TK_RBRACKET=5, TK_SEMI=6, 
		TK_PC_PROGRAMA=7, TK_PC_FPROGRAMA=8, TK_PC_PERIODE=9, TK_ENTER=10, TK_REAL=11, 
		TK_BOLEA=12, TK_IDENT=13, TK_TIPUS_BASIC=14, TK_TIPUS=15, TK_FTIPUS=16, 
		TK_PUNTS=17, TK_VECTOR=18, TK_TUPLA=19, TK_FTUPLA=20, TK_ACCIO=21, TK_FACCIO=22, 
		TK_FUNCIO=23, TK_FFUNCIO=24, TK_RETORNA=25, TK_PARAM=26, TK_VARIABLES=27, 
		TK_FVARIABLES=28, TK_VARIABLE=29, TK_COMMENT=30, TK_COMA=31, TK_SUMA=32, 
		TK_RESTA=33, TK_MULTIPLICACIO=34, TK_DIVISIO=35, TK_DIV_ENTERA=36, TK_MODUL=37, 
		TK_MENYS_UNARI=38, TK_IGUALTAT=39, TK_DESIGUALTAT=40, TK_MES_PETIT=41, 
		TK_MES_PETIT_IG=42, TK_MES_GRAN=43, TK_MES_GRAN_IG=44, TK_NEGACIO=45, 
		TK_AND=46, TK_OR=47, TK_DOSPUNTS=48, TK_ASSIGNACIO=49, TK_SI=50, TK_LLAVORS=51, 
		TK_ALTRAMENT=52, TK_FSI=53, TK_EN=54, TK_LN=55, TK_PER=56, TK_ID=57, TK_FINS=58, 
		TK_FER=59, TK_FPER=60, TK_MENTRE=61, TK_FMENTRE=62, TK_LLEGIR=63, TK_ESCRIURE=64, 
		TK_MIDA=65, ENT_SOR=66;
	public static final int
		RULE_inici = 0, RULE_tipusDecl = 1, RULE_novaDefinicio = 2, RULE_campTupla = 3, 
		RULE_accioFuncioDecl = 4, RULE_accioDecl = 5, RULE_funcioDecl = 6, RULE_parametresFormals = 7, 
		RULE_parametre = 8, RULE_blocVariables = 9, RULE_declaracioVariable = 10, 
		RULE_tipusDefinit = 11, RULE_sentencia = 12, RULE_assignacio = 13, RULE_condicional = 14, 
		RULE_buclePer = 15, RULE_bucleMent = 16, RULE_cridaAccio = 17, RULE_operacioLecturaEscritura = 18, 
		RULE_rang = 19, RULE_expr = 20, RULE_expr2 = 21, RULE_exprbase = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"inici", "tipusDecl", "novaDefinicio", "campTupla", "accioFuncioDecl", 
			"accioDecl", "funcioDecl", "parametresFormals", "parametre", "blocVariables", 
			"declaracioVariable", "tipusDefinit", "sentencia", "assignacio", "condicional", 
			"buclePer", "bucleMent", "cridaAccio", "operacioLecturaEscritura", "rang", 
			"expr", "expr2", "exprbase"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'{'", "'}'", "';'", "'programa'", "'fprograma'", 
			"'periode'", null, null, null, null, null, "'tipus'", "'ftipus'", "':'", 
			"'vector'", "'tupla;'", "'ftupla;'", "'accio'", "'faccio'", "'funcio'", 
			"'ffuncio'", "'retorna'", null, "'variables'", "'fvariables'", null, 
			null, "','", "'+'", "'-'", "'*'", "'/'", "'\\'", "'%'", "'\\u00E2\\u02C6\\u00BC'", 
			"'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'no'", "'&'", "'|'", "'..'", 
			"':='", "'si'", "'llavors'", "'altrament'", "'fsi'", "'en'", "'ln'", 
			"'per'", "'id'", "'fins'", "'fer'", "'fper'", "'mentre'", "'fmentre'", 
			"'llegir'", "'escriure'", "'mida'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TK_WS", "TK_LPAREN", "TK_RPAREN", "TK_LBRACKET", "TK_RBRACKET", 
			"TK_SEMI", "TK_PC_PROGRAMA", "TK_PC_FPROGRAMA", "TK_PC_PERIODE", "TK_ENTER", 
			"TK_REAL", "TK_BOLEA", "TK_IDENT", "TK_TIPUS_BASIC", "TK_TIPUS", "TK_FTIPUS", 
			"TK_PUNTS", "TK_VECTOR", "TK_TUPLA", "TK_FTUPLA", "TK_ACCIO", "TK_FACCIO", 
			"TK_FUNCIO", "TK_FFUNCIO", "TK_RETORNA", "TK_PARAM", "TK_VARIABLES", 
			"TK_FVARIABLES", "TK_VARIABLE", "TK_COMMENT", "TK_COMA", "TK_SUMA", "TK_RESTA", 
			"TK_MULTIPLICACIO", "TK_DIVISIO", "TK_DIV_ENTERA", "TK_MODUL", "TK_MENYS_UNARI", 
			"TK_IGUALTAT", "TK_DESIGUALTAT", "TK_MES_PETIT", "TK_MES_PETIT_IG", "TK_MES_GRAN", 
			"TK_MES_GRAN_IG", "TK_NEGACIO", "TK_AND", "TK_OR", "TK_DOSPUNTS", "TK_ASSIGNACIO", 
			"TK_SI", "TK_LLAVORS", "TK_ALTRAMENT", "TK_FSI", "TK_EN", "TK_LN", "TK_PER", 
			"TK_ID", "TK_FINS", "TK_FER", "TK_FPER", "TK_MENTRE", "TK_FMENTRE", "TK_LLEGIR", 
			"TK_ESCRIURE", "TK_MIDA", "ENT_SOR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "updated_prova.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public updated_provaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IniciContext extends ParserRuleContext {
		public List<TerminalNode> EOF() { return getTokens(updated_provaParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(updated_provaParser.EOF, i);
		}
		public IniciContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inici; }
	}

	public final IniciContext inici() throws RecognitionException {
		IniciContext _localctx = new IniciContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inici);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==EOF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipusDeclContext extends ParserRuleContext {
		public TerminalNode TK_TIPUS() { return getToken(updated_provaParser.TK_TIPUS, 0); }
		public TerminalNode TK_FTIPUS() { return getToken(updated_provaParser.TK_FTIPUS, 0); }
		public List<NovaDefinicioContext> novaDefinicio() {
			return getRuleContexts(NovaDefinicioContext.class);
		}
		public NovaDefinicioContext novaDefinicio(int i) {
			return getRuleContext(NovaDefinicioContext.class,i);
		}
		public TipusDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipusDecl; }
	}

	public final TipusDeclContext tipusDecl() throws RecognitionException {
		TipusDeclContext _localctx = new TipusDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tipusDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(TK_TIPUS);
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				novaDefinicio();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TK_IDENT );
			setState(57);
			match(TK_FTIPUS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NovaDefinicioContext extends ParserRuleContext {
		public NovaDefinicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_novaDefinicio; }
	 
		public NovaDefinicioContext() { }
		public void copyFrom(NovaDefinicioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefinicioTuplaContext extends NovaDefinicioContext {
		public TerminalNode TK_IDENT() { return getToken(updated_provaParser.TK_IDENT, 0); }
		public TerminalNode TK_PUNTS() { return getToken(updated_provaParser.TK_PUNTS, 0); }
		public TerminalNode TK_TUPLA() { return getToken(updated_provaParser.TK_TUPLA, 0); }
		public TerminalNode TK_LBRACKET() { return getToken(updated_provaParser.TK_LBRACKET, 0); }
		public TerminalNode TK_RBRACKET() { return getToken(updated_provaParser.TK_RBRACKET, 0); }
		public TerminalNode TK_FTUPLA() { return getToken(updated_provaParser.TK_FTUPLA, 0); }
		public List<CampTuplaContext> campTupla() {
			return getRuleContexts(CampTuplaContext.class);
		}
		public CampTuplaContext campTupla(int i) {
			return getRuleContext(CampTuplaContext.class,i);
		}
		public DefinicioTuplaContext(NovaDefinicioContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefinicioVectorContext extends NovaDefinicioContext {
		public TerminalNode TK_IDENT() { return getToken(updated_provaParser.TK_IDENT, 0); }
		public TerminalNode TK_PUNTS() { return getToken(updated_provaParser.TK_PUNTS, 0); }
		public TerminalNode TK_VECTOR() { return getToken(updated_provaParser.TK_VECTOR, 0); }
		public TerminalNode TK_TIPUS_BASIC() { return getToken(updated_provaParser.TK_TIPUS_BASIC, 0); }
		public TerminalNode TK_MIDA() { return getToken(updated_provaParser.TK_MIDA, 0); }
		public List<TerminalNode> TK_ENTER() { return getTokens(updated_provaParser.TK_ENTER); }
		public TerminalNode TK_ENTER(int i) {
			return getToken(updated_provaParser.TK_ENTER, i);
		}
		public TerminalNode TK_SEMI() { return getToken(updated_provaParser.TK_SEMI, 0); }
		public List<TerminalNode> TK_COMA() { return getTokens(updated_provaParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(updated_provaParser.TK_COMA, i);
		}
		public DefinicioVectorContext(NovaDefinicioContext ctx) { copyFrom(ctx); }
	}

	public final NovaDefinicioContext novaDefinicio() throws RecognitionException {
		NovaDefinicioContext _localctx = new NovaDefinicioContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_novaDefinicio);
		int _la;
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new DefinicioVectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(TK_IDENT);
				setState(60);
				match(TK_PUNTS);
				setState(61);
				match(TK_VECTOR);
				setState(62);
				match(TK_TIPUS_BASIC);
				setState(63);
				match(TK_MIDA);
				setState(64);
				match(TK_ENTER);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(65);
					match(TK_COMA);
					setState(66);
					match(TK_ENTER);
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(TK_SEMI);
				}
				break;
			case 2:
				_localctx = new DefinicioTuplaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(TK_IDENT);
				setState(74);
				match(TK_PUNTS);
				setState(75);
				match(TK_TUPLA);
				setState(76);
				match(TK_LBRACKET);
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(77);
					campTupla();
					}
					}
					setState(80); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_IDENT );
				setState(82);
				match(TK_RBRACKET);
				setState(83);
				match(TK_FTUPLA);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class CampTuplaContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(updated_provaParser.TK_IDENT, 0); }
		public TerminalNode TK_PUNTS() { return getToken(updated_provaParser.TK_PUNTS, 0); }
		public TerminalNode TK_TIPUS_BASIC() { return getToken(updated_provaParser.TK_TIPUS_BASIC, 0); }
		public TerminalNode TK_SEMI() { return getToken(updated_provaParser.TK_SEMI, 0); }
		public CampTuplaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campTupla; }
	}

	public final CampTuplaContext campTupla() throws RecognitionException {
		CampTuplaContext _localctx = new CampTuplaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_campTupla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(TK_IDENT);
			setState(88);
			match(TK_PUNTS);
			setState(89);
			match(TK_TIPUS_BASIC);
			setState(90);
			match(TK_SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccioFuncioDeclContext extends ParserRuleContext {
		public AccioDeclContext accioDecl() {
			return getRuleContext(AccioDeclContext.class,0);
		}
		public FuncioDeclContext funcioDecl() {
			return getRuleContext(FuncioDeclContext.class,0);
		}
		public AccioFuncioDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accioFuncioDecl; }
	}

	public final AccioFuncioDeclContext accioFuncioDecl() throws RecognitionException {
		AccioFuncioDeclContext _localctx = new AccioFuncioDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_accioFuncioDecl);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ACCIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				accioDecl();
				}
				break;
			case TK_FUNCIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				funcioDecl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccioDeclContext extends ParserRuleContext {
		public TerminalNode TK_ACCIO() { return getToken(updated_provaParser.TK_ACCIO, 0); }
		public TerminalNode TK_IDENT() { return getToken(updated_provaParser.TK_IDENT, 0); }
		public TerminalNode TK_FACCIO() { return getToken(updated_provaParser.TK_FACCIO, 0); }
		public TerminalNode TK_LPAREN() { return getToken(updated_provaParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(updated_provaParser.TK_RPAREN, 0); }
		public BlocVariablesContext blocVariables() {
			return getRuleContext(BlocVariablesContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ParametresFormalsContext parametresFormals() {
			return getRuleContext(ParametresFormalsContext.class,0);
		}
		public AccioDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accioDecl; }
	}

	public final AccioDeclContext accioDecl() throws RecognitionException {
		AccioDeclContext _localctx = new AccioDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_accioDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(TK_ACCIO);
			setState(97);
			match(TK_IDENT);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LPAREN) {
				{
				setState(98);
				match(TK_LPAREN);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_IDENT || _la==ENT_SOR) {
					{
					setState(99);
					parametresFormals();
					}
				}

				setState(102);
				match(TK_RPAREN);
				}
			}

			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_VARIABLES) {
				{
				setState(105);
				blocVariables();
				}
			}

			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 3668108229214209L) != 0)) {
				{
				{
				setState(108);
				sentencia();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(TK_FACCIO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncioDeclContext extends ParserRuleContext {
		public TerminalNode TK_FUNCIO() { return getToken(updated_provaParser.TK_FUNCIO, 0); }
		public TerminalNode TK_IDENT() { return getToken(updated_provaParser.TK_IDENT, 0); }
		public List<TerminalNode> TK_RETORNA() { return getTokens(updated_provaParser.TK_RETORNA); }
		public TerminalNode TK_RETORNA(int i) {
			return getToken(updated_provaParser.TK_RETORNA, i);
		}
		public TerminalNode TK_TIPUS_BASIC() { return getToken(updated_provaParser.TK_TIPUS_BASIC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_FFUNCIO() { return getToken(updated_provaParser.TK_FFUNCIO, 0); }
		public TerminalNode TK_LPAREN() { return getToken(updated_provaParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(updated_provaParser.TK_RPAREN, 0); }
		public BlocVariablesContext blocVariables() {
			return getRuleContext(BlocVariablesContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ParametresFormalsContext parametresFormals() {
			return getRuleContext(ParametresFormalsContext.class,0);
		}
		public FuncioDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcioDecl; }
	}

	public final FuncioDeclContext funcioDecl() throws RecognitionException {
		FuncioDeclContext _localctx = new FuncioDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcioDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(TK_FUNCIO);
			setState(117);
			match(TK_IDENT);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LPAREN) {
				{
				setState(118);
				match(TK_LPAREN);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_IDENT || _la==ENT_SOR) {
					{
					setState(119);
					parametresFormals();
					}
				}

				setState(122);
				match(TK_RPAREN);
				}
			}

			setState(125);
			match(TK_RETORNA);
			setState(126);
			match(TK_TIPUS_BASIC);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_VARIABLES) {
				{
				setState(127);
				blocVariables();
				}
			}

			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 3668108229214209L) != 0)) {
				{
				{
				setState(130);
				sentencia();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(TK_RETORNA);
			setState(137);
			expr(0);
			setState(138);
			match(TK_FFUNCIO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametresFormalsContext extends ParserRuleContext {
		public List<ParametreContext> parametre() {
			return getRuleContexts(ParametreContext.class);
		}
		public ParametreContext parametre(int i) {
			return getRuleContext(ParametreContext.class,i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(updated_provaParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(updated_provaParser.TK_COMA, i);
		}
		public ParametresFormalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametresFormals; }
	}

	public final ParametresFormalsContext parametresFormals() throws RecognitionException {
		ParametresFormalsContext _localctx = new ParametresFormalsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametresFormals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			parametre();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(141);
				match(TK_COMA);
				setState(142);
				parametre();
				}
				}
				setState(147);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametreContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(updated_provaParser.TK_IDENT, 0); }
		public TerminalNode TK_PUNTS() { return getToken(updated_provaParser.TK_PUNTS, 0); }
		public TerminalNode TK_TIPUS_BASIC() { return getToken(updated_provaParser.TK_TIPUS_BASIC, 0); }
		public TerminalNode ENT_SOR() { return getToken(updated_provaParser.ENT_SOR, 0); }
		public ParametreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametre; }
	}

	public final ParametreContext parametre() throws RecognitionException {
		ParametreContext _localctx = new ParametreContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENT_SOR) {
				{
				setState(148);
				match(ENT_SOR);
				}
			}

			setState(151);
			match(TK_IDENT);
			setState(152);
			match(TK_PUNTS);
			setState(153);
			match(TK_TIPUS_BASIC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocVariablesContext extends ParserRuleContext {
		public TerminalNode TK_VARIABLES() { return getToken(updated_provaParser.TK_VARIABLES, 0); }
		public TerminalNode TK_FVARIABLES() { return getToken(updated_provaParser.TK_FVARIABLES, 0); }
		public List<DeclaracioVariableContext> declaracioVariable() {
			return getRuleContexts(DeclaracioVariableContext.class);
		}
		public DeclaracioVariableContext declaracioVariable(int i) {
			return getRuleContext(DeclaracioVariableContext.class,i);
		}
		public BlocVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocVariables; }
	}

	public final BlocVariablesContext blocVariables() throws RecognitionException {
		BlocVariablesContext _localctx = new BlocVariablesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blocVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(TK_VARIABLES);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_IDENT) {
				{
				{
				setState(156);
				declaracioVariable();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(TK_FVARIABLES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracioVariableContext extends ParserRuleContext {
		public List<TerminalNode> TK_IDENT() { return getTokens(updated_provaParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(updated_provaParser.TK_IDENT, i);
		}
		public TerminalNode TK_PUNTS() { return getToken(updated_provaParser.TK_PUNTS, 0); }
		public TipusDefinitContext tipusDefinit() {
			return getRuleContext(TipusDefinitContext.class,0);
		}
		public TerminalNode TK_SEMI() { return getToken(updated_provaParser.TK_SEMI, 0); }
		public List<TerminalNode> TK_COMA() { return getTokens(updated_provaParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(updated_provaParser.TK_COMA, i);
		}
		public DeclaracioVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracioVariable; }
	}

	public final DeclaracioVariableContext declaracioVariable() throws RecognitionException {
		DeclaracioVariableContext _localctx = new DeclaracioVariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracioVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(TK_IDENT);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(165);
				match(TK_COMA);
				setState(166);
				match(TK_IDENT);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(TK_PUNTS);
			setState(173);
			tipusDefinit();
			setState(174);
			match(TK_SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipusDefinitContext extends ParserRuleContext {
		public TerminalNode TK_TIPUS_BASIC() { return getToken(updated_provaParser.TK_TIPUS_BASIC, 0); }
		public TerminalNode TK_IDENT() { return getToken(updated_provaParser.TK_IDENT, 0); }
		public TipusDefinitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipusDefinit; }
	}

	public final TipusDefinitContext tipusDefinit() throws RecognitionException {
		TipusDefinitContext _localctx = new TipusDefinitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipusDefinit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !(_la==TK_IDENT || _la==TK_TIPUS_BASIC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public AssignacioContext assignacio() {
			return getRuleContext(AssignacioContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public BuclePerContext buclePer() {
			return getRuleContext(BuclePerContext.class,0);
		}
		public BucleMentContext bucleMent() {
			return getRuleContext(BucleMentContext.class,0);
		}
		public CridaAccioContext cridaAccio() {
			return getRuleContext(CridaAccioContext.class,0);
		}
		public OperacioLecturaEscrituraContext operacioLecturaEscritura() {
			return getRuleContext(OperacioLecturaEscrituraContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sentencia);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				assignacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				condicional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				buclePer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				bucleMent();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				cridaAccio();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				operacioLecturaEscritura();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignacioContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(updated_provaParser.TK_IDENT, 0); }
		public TerminalNode TK_ASSIGNACIO() { return getToken(updated_provaParser.TK_ASSIGNACIO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_SEMI() { return getToken(updated_provaParser.TK_SEMI, 0); }
		public AssignacioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignacio; }
	}

	public final AssignacioContext assignacio() throws RecognitionException {
		AssignacioContext _localctx = new AssignacioContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignacio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(TK_IDENT);
			setState(187);
			match(TK_ASSIGNACIO);
			setState(188);
			expr(0);
			setState(189);
			match(TK_SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode TK_SI() { return getToken(updated_provaParser.TK_SI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TK_LLAVORS() { return getTokens(updated_provaParser.TK_LLAVORS); }
		public TerminalNode TK_LLAVORS(int i) {
			return getToken(updated_provaParser.TK_LLAVORS, i);
		}
		public TerminalNode TK_FSI() { return getToken(updated_provaParser.TK_FSI, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<TerminalNode> TK_ALTRAMENT() { return getTokens(updated_provaParser.TK_ALTRAMENT); }
		public TerminalNode TK_ALTRAMENT(int i) {
			return getToken(updated_provaParser.TK_ALTRAMENT, i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condicional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(TK_SI);
			setState(192);
			expr(0);
			setState(193);
			match(TK_LLAVORS);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 3668108229214209L) != 0)) {
				{
				{
				setState(194);
				sentencia();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(200);
					match(TK_ALTRAMENT);
					setState(201);
					expr(0);
					setState(202);
					match(TK_LLAVORS);
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 3668108229214209L) != 0)) {
						{
						{
						setState(203);
						sentencia();
						}
						}
						setState(208);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_ALTRAMENT) {
				{
				setState(214);
				match(TK_ALTRAMENT);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 3668108229214209L) != 0)) {
					{
					{
					setState(215);
					sentencia();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(223);
			match(TK_FSI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BuclePerContext extends ParserRuleContext {
		public TerminalNode TK_PER() { return getToken(updated_provaParser.TK_PER, 0); }
		public TerminalNode TK_IDENT() { return getToken(updated_provaParser.TK_IDENT, 0); }
		public TerminalNode TK_EN() { return getToken(updated_provaParser.TK_EN, 0); }
		public RangContext rang() {
			return getRuleContext(RangContext.class,0);
		}
		public TerminalNode TK_FER() { return getToken(updated_provaParser.TK_FER, 0); }
		public TerminalNode TK_FPER() { return getToken(updated_provaParser.TK_FPER, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BuclePerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buclePer; }
	}

	public final BuclePerContext buclePer() throws RecognitionException {
		BuclePerContext _localctx = new BuclePerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_buclePer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(TK_PER);
			setState(226);
			match(TK_IDENT);
			setState(227);
			match(TK_EN);
			setState(228);
			rang();
			setState(229);
			match(TK_FER);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 3668108229214209L) != 0)) {
				{
				{
				setState(230);
				sentencia();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			match(TK_FPER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BucleMentContext extends ParserRuleContext {
		public TerminalNode TK_MENTRE() { return getToken(updated_provaParser.TK_MENTRE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_FER() { return getToken(updated_provaParser.TK_FER, 0); }
		public TerminalNode TK_FMENTRE() { return getToken(updated_provaParser.TK_FMENTRE, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BucleMentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucleMent; }
	}

	public final BucleMentContext bucleMent() throws RecognitionException {
		BucleMentContext _localctx = new BucleMentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bucleMent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(TK_MENTRE);
			setState(239);
			expr(0);
			setState(240);
			match(TK_FER);
			setState(242); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(241);
				sentencia();
				}
				}
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 3668108229214209L) != 0) );
			setState(246);
			match(TK_FMENTRE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CridaAccioContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(updated_provaParser.TK_IDENT, 0); }
		public TerminalNode TK_LPAREN() { return getToken(updated_provaParser.TK_LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_RPAREN() { return getToken(updated_provaParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(updated_provaParser.TK_SEMI, 0); }
		public List<TerminalNode> TK_COMA() { return getTokens(updated_provaParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(updated_provaParser.TK_COMA, i);
		}
		public CridaAccioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cridaAccio; }
	}

	public final CridaAccioContext cridaAccio() throws RecognitionException {
		CridaAccioContext _localctx = new CridaAccioContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cridaAccio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(TK_IDENT);
			setState(249);
			match(TK_LPAREN);
			setState(250);
			expr(0);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(251);
				match(TK_COMA);
				setState(252);
				expr(0);
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(TK_RPAREN);
			setState(259);
			match(TK_SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperacioLecturaEscrituraContext extends ParserRuleContext {
		public OperacioLecturaEscrituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacioLecturaEscritura; }
	 
		public OperacioLecturaEscrituraContext() { }
		public void copyFrom(OperacioLecturaEscrituraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EscrituraContext extends OperacioLecturaEscrituraContext {
		public TerminalNode TK_ESCRIURE() { return getToken(updated_provaParser.TK_ESCRIURE, 0); }
		public TerminalNode TK_LPAREN() { return getToken(updated_provaParser.TK_LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_RPAREN() { return getToken(updated_provaParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(updated_provaParser.TK_SEMI, 0); }
		public List<TerminalNode> TK_COMA() { return getTokens(updated_provaParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(updated_provaParser.TK_COMA, i);
		}
		public EscrituraContext(OperacioLecturaEscrituraContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LecturaContext extends OperacioLecturaEscrituraContext {
		public TerminalNode TK_LLEGIR() { return getToken(updated_provaParser.TK_LLEGIR, 0); }
		public TerminalNode TK_LPAREN() { return getToken(updated_provaParser.TK_LPAREN, 0); }
		public TerminalNode TK_IDENT() { return getToken(updated_provaParser.TK_IDENT, 0); }
		public TerminalNode TK_RPAREN() { return getToken(updated_provaParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(updated_provaParser.TK_SEMI, 0); }
		public TerminalNode TK_PUNTS() { return getToken(updated_provaParser.TK_PUNTS, 0); }
		public TerminalNode TK_TIPUS_BASIC() { return getToken(updated_provaParser.TK_TIPUS_BASIC, 0); }
		public LecturaContext(OperacioLecturaEscrituraContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EscrituraLnContext extends OperacioLecturaEscrituraContext {
		public TerminalNode TK_ESCRIURE() { return getToken(updated_provaParser.TK_ESCRIURE, 0); }
		public TerminalNode TK_LN() { return getToken(updated_provaParser.TK_LN, 0); }
		public TerminalNode TK_LPAREN() { return getToken(updated_provaParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(updated_provaParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(updated_provaParser.TK_SEMI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(updated_provaParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(updated_provaParser.TK_COMA, i);
		}
		public EscrituraLnContext(OperacioLecturaEscrituraContext ctx) { copyFrom(ctx); }
	}

	public final OperacioLecturaEscrituraContext operacioLecturaEscritura() throws RecognitionException {
		OperacioLecturaEscrituraContext _localctx = new OperacioLecturaEscrituraContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operacioLecturaEscritura);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new LecturaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(TK_LLEGIR);
				setState(262);
				match(TK_LPAREN);
				setState(263);
				match(TK_IDENT);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTS) {
					{
					setState(264);
					match(TK_PUNTS);
					setState(265);
					match(TK_TIPUS_BASIC);
					}
				}

				setState(268);
				match(TK_RPAREN);
				setState(269);
				match(TK_SEMI);
				}
				break;
			case 2:
				_localctx = new EscrituraContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(TK_ESCRIURE);
				setState(271);
				match(TK_LPAREN);
				setState(272);
				expr(0);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(273);
					match(TK_COMA);
					setState(274);
					expr(0);
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(280);
				match(TK_RPAREN);
				setState(281);
				match(TK_SEMI);
				}
				break;
			case 3:
				_localctx = new EscrituraLnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				match(TK_ESCRIURE);
				setState(284);
				match(TK_LN);
				setState(285);
				match(TK_LPAREN);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35459250011140L) != 0)) {
					{
					setState(286);
					expr(0);
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMA) {
						{
						{
						setState(287);
						match(TK_COMA);
						setState(288);
						expr(0);
						}
						}
						setState(293);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(296);
				match(TK_RPAREN);
				setState(297);
				match(TK_SEMI);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class RangContext extends ParserRuleContext {
		public List<TerminalNode> TK_ENTER() { return getTokens(updated_provaParser.TK_ENTER); }
		public TerminalNode TK_ENTER(int i) {
			return getToken(updated_provaParser.TK_ENTER, i);
		}
		public TerminalNode TK_DOSPUNTS() { return getToken(updated_provaParser.TK_DOSPUNTS, 0); }
		public RangContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rang; }
	}

	public final RangContext rang() throws RecognitionException {
		RangContext _localctx = new RangContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rang);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(TK_ENTER);
				setState(301);
				match(TK_DOSPUNTS);
				setState(302);
				match(TK_ENTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(TK_ENTER);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegacioContext extends ExprContext {
		public TerminalNode TK_NEGACIO() { return getToken(updated_provaParser.TK_NEGACIO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegacioContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MesGranIgualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_MES_GRAN_IG() { return getToken(updated_provaParser.TK_MES_GRAN_IG, 0); }
		public MesGranIgualContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ILogicContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_AND() { return getToken(updated_provaParser.TK_AND, 0); }
		public ILogicContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisioContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_DIVISIO() { return getToken(updated_provaParser.TK_DIVISIO, 0); }
		public DivisioContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MenysUnariContext extends ExprContext {
		public TerminalNode TK_MENYS_UNARI() { return getToken(updated_provaParser.TK_MENYS_UNARI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MenysUnariContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoleaLiteralContext extends ExprContext {
		public TerminalNode TK_BOLEA() { return getToken(updated_provaParser.TK_BOLEA, 0); }
		public BoleaLiteralContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicacioContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_MULTIPLICACIO() { return getToken(updated_provaParser.TK_MULTIPLICACIO, 0); }
		public MultiplicacioContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModulContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_MODUL() { return getToken(updated_provaParser.TK_MODUL, 0); }
		public ModulContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesiContext extends ExprContext {
		public TerminalNode TK_LPAREN() { return getToken(updated_provaParser.TK_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(updated_provaParser.TK_RPAREN, 0); }
		public ParentesiContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MesPetitContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_MES_PETIT() { return getToken(updated_provaParser.TK_MES_PETIT, 0); }
		public MesPetitContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IgualtatContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_IGUALTAT() { return getToken(updated_provaParser.TK_IGUALTAT, 0); }
		public IgualtatContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivEnteraContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_DIV_ENTERA() { return getToken(updated_provaParser.TK_DIV_ENTERA, 0); }
		public DivEnteraContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealLiteralContext extends ExprContext {
		public TerminalNode TK_REAL() { return getToken(updated_provaParser.TK_REAL, 0); }
		public RealLiteralContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumaContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_SUMA() { return getToken(updated_provaParser.TK_SUMA, 0); }
		public SumaContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DesigualtatContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_DESIGUALTAT() { return getToken(updated_provaParser.TK_DESIGUALTAT, 0); }
		public DesigualtatContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnterLiteralContext extends ExprContext {
		public TerminalNode TK_ENTER() { return getToken(updated_provaParser.TK_ENTER, 0); }
		public EnterLiteralContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadorContext extends ExprContext {
		public TerminalNode TK_IDENT() { return getToken(updated_provaParser.TK_IDENT, 0); }
		public IdentificadorContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MesGranContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_MES_GRAN() { return getToken(updated_provaParser.TK_MES_GRAN, 0); }
		public MesGranContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RestaContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_RESTA() { return getToken(updated_provaParser.TK_RESTA, 0); }
		public RestaContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OLogicContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_OR() { return getToken(updated_provaParser.TK_OR, 0); }
		public OLogicContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MesPetitIgualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_MES_PETIT_IG() { return getToken(updated_provaParser.TK_MES_PETIT_IG, 0); }
		public MesPetitIgualContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_MENYS_UNARI:
				{
				_localctx = new MenysUnariContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(307);
				match(TK_MENYS_UNARI);
				setState(308);
				expr(15);
				}
				break;
			case TK_NEGACIO:
				{
				_localctx = new NegacioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309);
				match(TK_NEGACIO);
				setState(310);
				expr(8);
				}
				break;
			case TK_IDENT:
				{
				_localctx = new IdentificadorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(311);
				match(TK_IDENT);
				}
				break;
			case TK_ENTER:
				{
				_localctx = new EnterLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(312);
				match(TK_ENTER);
				}
				break;
			case TK_REAL:
				{
				_localctx = new RealLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313);
				match(TK_REAL);
				}
				break;
			case TK_BOLEA:
				{
				_localctx = new BoleaLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314);
				match(TK_BOLEA);
				}
				break;
			case TK_LPAREN:
				{
				_localctx = new ParentesiContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315);
				match(TK_LPAREN);
				setState(316);
				expr(0);
				setState(317);
				match(TK_RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(363);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new SumaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(321);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(322);
						match(TK_SUMA);
						setState(323);
						expr(22);
						}
						break;
					case 2:
						{
						_localctx = new RestaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(324);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(325);
						match(TK_RESTA);
						setState(326);
						expr(21);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicacioContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(327);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(328);
						match(TK_MULTIPLICACIO);
						setState(329);
						expr(20);
						}
						break;
					case 4:
						{
						_localctx = new DivisioContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(330);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(331);
						match(TK_DIVISIO);
						setState(332);
						expr(19);
						}
						break;
					case 5:
						{
						_localctx = new DivEnteraContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(333);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(334);
						match(TK_DIV_ENTERA);
						setState(335);
						expr(18);
						}
						break;
					case 6:
						{
						_localctx = new ModulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(336);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(337);
						match(TK_MODUL);
						setState(338);
						expr(17);
						}
						break;
					case 7:
						{
						_localctx = new IgualtatContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(339);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(340);
						match(TK_IGUALTAT);
						setState(341);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new DesigualtatContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(342);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(343);
						match(TK_DESIGUALTAT);
						setState(344);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new MesPetitContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(345);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(346);
						match(TK_MES_PETIT);
						setState(347);
						expr(13);
						}
						break;
					case 10:
						{
						_localctx = new MesGranContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(348);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(349);
						match(TK_MES_GRAN);
						setState(350);
						expr(12);
						}
						break;
					case 11:
						{
						_localctx = new MesPetitIgualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(351);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(352);
						match(TK_MES_PETIT_IG);
						setState(353);
						expr(11);
						}
						break;
					case 12:
						{
						_localctx = new MesGranIgualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(354);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(355);
						match(TK_MES_GRAN_IG);
						setState(356);
						expr(10);
						}
						break;
					case 13:
						{
						_localctx = new ILogicContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(357);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(358);
						match(TK_AND);
						setState(359);
						expr(8);
						}
						break;
					case 14:
						{
						_localctx = new OLogicContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(360);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(361);
						match(TK_OR);
						setState(362);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr2Context extends ParserRuleContext {
		public List<ExprbaseContext> exprbase() {
			return getRuleContexts(ExprbaseContext.class);
		}
		public ExprbaseContext exprbase(int i) {
			return getRuleContext(ExprbaseContext.class,i);
		}
		public List<TerminalNode> TK_MULTIPLICACIO() { return getTokens(updated_provaParser.TK_MULTIPLICACIO); }
		public TerminalNode TK_MULTIPLICACIO(int i) {
			return getToken(updated_provaParser.TK_MULTIPLICACIO, i);
		}
		public List<TerminalNode> TK_DIVISIO() { return getTokens(updated_provaParser.TK_DIVISIO); }
		public TerminalNode TK_DIVISIO(int i) {
			return getToken(updated_provaParser.TK_DIVISIO, i);
		}
		public List<TerminalNode> TK_DIV_ENTERA() { return getTokens(updated_provaParser.TK_DIV_ENTERA); }
		public TerminalNode TK_DIV_ENTERA(int i) {
			return getToken(updated_provaParser.TK_DIV_ENTERA, i);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			exprbase();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) {
				{
				{
				setState(369);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(370);
				exprbase();
				}
				}
				setState(375);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprbaseContext extends ParserRuleContext {
		public TerminalNode TK_ENTER() { return getToken(updated_provaParser.TK_ENTER, 0); }
		public TerminalNode TK_REAL() { return getToken(updated_provaParser.TK_REAL, 0); }
		public TerminalNode TK_LPAREN() { return getToken(updated_provaParser.TK_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(updated_provaParser.TK_RPAREN, 0); }
		public ExprbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprbase; }
	}

	public final ExprbaseContext exprbase() throws RecognitionException {
		ExprbaseContext _localctx = new ExprbaseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exprbase);
		try {
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ENTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(TK_ENTER);
				}
				break;
			case TK_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(TK_REAL);
				}
				break;
			case TK_LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				match(TK_LPAREN);
				setState(379);
				expr(0);
				setState(380);
				match(TK_RPAREN);
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
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 11);
		case 10:
			return precpred(_ctx, 10);
		case 11:
			return precpred(_ctx, 9);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001B\u0181\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0004\u00000\b\u0000\u000b\u0000"+
		"\f\u00001\u0001\u0001\u0001\u0001\u0004\u00016\b\u0001\u000b\u0001\f\u0001"+
		"7\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002D\b\u0002"+
		"\n\u0002\f\u0002G\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0004\u0002O\b\u0002\u000b\u0002\f\u0002P\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002V\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003"+
		"\u0004_\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005e\b\u0005\u0001\u0005\u0003\u0005h\b\u0005\u0001\u0005\u0003\u0005"+
		"k\b\u0005\u0001\u0005\u0005\u0005n\b\u0005\n\u0005\f\u0005q\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006y\b\u0006\u0001\u0006\u0003\u0006|\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0081\b\u0006\u0001\u0006\u0005\u0006\u0084\b"+
		"\u0006\n\u0006\f\u0006\u0087\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0090\b\u0007"+
		"\n\u0007\f\u0007\u0093\t\u0007\u0001\b\u0003\b\u0096\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t\u009e\b\t\n\t\f\t\u00a1\t\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u00a8\b\n\n\n\f\n\u00ab"+
		"\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00b9\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00c4\b\u000e\n\u000e\f\u000e\u00c7\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00cd\b\u000e\n\u000e\f\u000e\u00d0"+
		"\t\u000e\u0005\u000e\u00d2\b\u000e\n\u000e\f\u000e\u00d5\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00d9\b\u000e\n\u000e\f\u000e\u00dc\t\u000e"+
		"\u0003\u000e\u00de\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00e8\b\u000f"+
		"\n\u000f\f\u000f\u00eb\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u00f3\b\u0010\u000b\u0010\f"+
		"\u0010\u00f4\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u00fe\b\u0011\n\u0011\f\u0011\u0101"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u010b\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u0114\b\u0012\n\u0012\f\u0012\u0117\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u0122\b\u0012\n\u0012\f\u0012\u0125\t\u0012\u0003"+
		"\u0012\u0127\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u012b\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0131\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0140\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u016c\b\u0014\n\u0014"+
		"\f\u0014\u016f\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u0174\b\u0015\n\u0015\f\u0015\u0177\t\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u017f\b\u0016\u0001"+
		"\u0016\u0000\u0001(\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0003\u0000\u0001\u0001"+
		"\u0000\r\u000e\u0001\u0000\"$\u01a6\u0000/\u0001\u0000\u0000\u0000\u0002"+
		"3\u0001\u0000\u0000\u0000\u0004U\u0001\u0000\u0000\u0000\u0006W\u0001"+
		"\u0000\u0000\u0000\b^\u0001\u0000\u0000\u0000\n`\u0001\u0000\u0000\u0000"+
		"\ft\u0001\u0000\u0000\u0000\u000e\u008c\u0001\u0000\u0000\u0000\u0010"+
		"\u0095\u0001\u0000\u0000\u0000\u0012\u009b\u0001\u0000\u0000\u0000\u0014"+
		"\u00a4\u0001\u0000\u0000\u0000\u0016\u00b0\u0001\u0000\u0000\u0000\u0018"+
		"\u00b8\u0001\u0000\u0000\u0000\u001a\u00ba\u0001\u0000\u0000\u0000\u001c"+
		"\u00bf\u0001\u0000\u0000\u0000\u001e\u00e1\u0001\u0000\u0000\u0000 \u00ee"+
		"\u0001\u0000\u0000\u0000\"\u00f8\u0001\u0000\u0000\u0000$\u012a\u0001"+
		"\u0000\u0000\u0000&\u0130\u0001\u0000\u0000\u0000(\u013f\u0001\u0000\u0000"+
		"\u0000*\u0170\u0001\u0000\u0000\u0000,\u017e\u0001\u0000\u0000\u0000."+
		"0\b\u0000\u0000\u0000/.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u0000"+
		"1/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u00002\u0001\u0001\u0000"+
		"\u0000\u000035\u0005\u000f\u0000\u000046\u0003\u0004\u0002\u000054\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0005\u0010\u0000"+
		"\u0000:\u0003\u0001\u0000\u0000\u0000;<\u0005\r\u0000\u0000<=\u0005\u0011"+
		"\u0000\u0000=>\u0005\u0012\u0000\u0000>?\u0005\u000e\u0000\u0000?@\u0005"+
		"A\u0000\u0000@E\u0005\n\u0000\u0000AB\u0005\u001f\u0000\u0000BD\u0005"+
		"\n\u0000\u0000CA\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000HV\u0005\u0006\u0000\u0000IJ\u0005\r\u0000\u0000"+
		"JK\u0005\u0011\u0000\u0000KL\u0005\u0013\u0000\u0000LN\u0005\u0004\u0000"+
		"\u0000MO\u0003\u0006\u0003\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RS\u0005\u0005\u0000\u0000ST\u0005\u0014\u0000\u0000"+
		"TV\u0001\u0000\u0000\u0000U;\u0001\u0000\u0000\u0000UI\u0001\u0000\u0000"+
		"\u0000V\u0005\u0001\u0000\u0000\u0000WX\u0005\r\u0000\u0000XY\u0005\u0011"+
		"\u0000\u0000YZ\u0005\u000e\u0000\u0000Z[\u0005\u0006\u0000\u0000[\u0007"+
		"\u0001\u0000\u0000\u0000\\_\u0003\n\u0005\u0000]_\u0003\f\u0006\u0000"+
		"^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_\t\u0001\u0000\u0000"+
		"\u0000`a\u0005\u0015\u0000\u0000ag\u0005\r\u0000\u0000bd\u0005\u0002\u0000"+
		"\u0000ce\u0003\u000e\u0007\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0005\u0003\u0000\u0000gb\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000"+
		"ik\u0003\u0012\t\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"ko\u0001\u0000\u0000\u0000ln\u0003\u0018\f\u0000ml\u0001\u0000\u0000\u0000"+
		"nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rs\u0005\u0016"+
		"\u0000\u0000s\u000b\u0001\u0000\u0000\u0000tu\u0005\u0017\u0000\u0000"+
		"u{\u0005\r\u0000\u0000vx\u0005\u0002\u0000\u0000wy\u0003\u000e\u0007\u0000"+
		"xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z|\u0005\u0003\u0000\u0000{v\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005\u0019\u0000\u0000~\u0080"+
		"\u0005\u000e\u0000\u0000\u007f\u0081\u0003\u0012\t\u0000\u0080\u007f\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0085\u0001"+
		"\u0000\u0000\u0000\u0082\u0084\u0003\u0018\f\u0000\u0083\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0019"+
		"\u0000\u0000\u0089\u008a\u0003(\u0014\u0000\u008a\u008b\u0005\u0018\u0000"+
		"\u0000\u008b\r\u0001\u0000\u0000\u0000\u008c\u0091\u0003\u0010\b\u0000"+
		"\u008d\u008e\u0005\u001f\u0000\u0000\u008e\u0090\u0003\u0010\b\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u000f\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094"+
		"\u0096\u0005B\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005\r\u0000\u0000\u0098\u0099\u0005\u0011\u0000\u0000\u0099\u009a\u0005"+
		"\u000e\u0000\u0000\u009a\u0011\u0001\u0000\u0000\u0000\u009b\u009f\u0005"+
		"\u001b\u0000\u0000\u009c\u009e\u0003\u0014\n\u0000\u009d\u009c\u0001\u0000"+
		"\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u001c"+
		"\u0000\u0000\u00a3\u0013\u0001\u0000\u0000\u0000\u00a4\u00a9\u0005\r\u0000"+
		"\u0000\u00a5\u00a6\u0005\u001f\u0000\u0000\u00a6\u00a8\u0005\r\u0000\u0000"+
		"\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0005\u0011\u0000\u0000\u00ad\u00ae\u0003\u0016\u000b\u0000"+
		"\u00ae\u00af\u0005\u0006\u0000\u0000\u00af\u0015\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0007\u0001\u0000\u0000\u00b1\u0017\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b9\u0003\u001a\r\u0000\u00b3\u00b9\u0003\u001c\u000e\u0000\u00b4"+
		"\u00b9\u0003\u001e\u000f\u0000\u00b5\u00b9\u0003 \u0010\u0000\u00b6\u00b9"+
		"\u0003\"\u0011\u0000\u00b7\u00b9\u0003$\u0012\u0000\u00b8\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b3\u0001\u0000\u0000\u0000\u00b8\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u0019\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0005\r\u0000\u0000\u00bb\u00bc\u00051"+
		"\u0000\u0000\u00bc\u00bd\u0003(\u0014\u0000\u00bd\u00be\u0005\u0006\u0000"+
		"\u0000\u00be\u001b\u0001\u0000\u0000\u0000\u00bf\u00c0\u00052\u0000\u0000"+
		"\u00c0\u00c1\u0003(\u0014\u0000\u00c1\u00c5\u00053\u0000\u0000\u00c2\u00c4"+
		"\u0003\u0018\f\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00d3\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u00054\u0000\u0000\u00c9\u00ca\u0003(\u0014"+
		"\u0000\u00ca\u00ce\u00053\u0000\u0000\u00cb\u00cd\u0003\u0018\f\u0000"+
		"\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d1\u00c8\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4\u00dd\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d6\u00da\u00054\u0000\u0000\u00d7\u00d9\u0003\u0018\f\u0000\u00d8"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db"+
		"\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd"+
		"\u00d6\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u00055\u0000\u0000\u00e0\u001d"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u00058\u0000\u0000\u00e2\u00e3\u0005"+
		"\r\u0000\u0000\u00e3\u00e4\u00056\u0000\u0000\u00e4\u00e5\u0003&\u0013"+
		"\u0000\u00e5\u00e9\u0005;\u0000\u0000\u00e6\u00e8\u0003\u0018\f\u0000"+
		"\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0005<\u0000\u0000\u00ed\u001f\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0005=\u0000\u0000\u00ef\u00f0\u0003(\u0014\u0000\u00f0\u00f2\u0005"+
		";\u0000\u0000\u00f1\u00f3\u0003\u0018\f\u0000\u00f2\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0005>\u0000\u0000\u00f7!\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0005\r\u0000\u0000\u00f9\u00fa\u0005\u0002\u0000\u0000\u00fa"+
		"\u00ff\u0003(\u0014\u0000\u00fb\u00fc\u0005\u001f\u0000\u0000\u00fc\u00fe"+
		"\u0003(\u0014\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u0101\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001"+
		"\u0000\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u00ff\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0005\u0003\u0000\u0000\u0103\u0104\u0005"+
		"\u0006\u0000\u0000\u0104#\u0001\u0000\u0000\u0000\u0105\u0106\u0005?\u0000"+
		"\u0000\u0106\u0107\u0005\u0002\u0000\u0000\u0107\u010a\u0005\r\u0000\u0000"+
		"\u0108\u0109\u0005\u0011\u0000\u0000\u0109\u010b\u0005\u000e\u0000\u0000"+
		"\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0005\u0003\u0000\u0000"+
		"\u010d\u012b\u0005\u0006\u0000\u0000\u010e\u010f\u0005@\u0000\u0000\u010f"+
		"\u0110\u0005\u0002\u0000\u0000\u0110\u0115\u0003(\u0014\u0000\u0111\u0112"+
		"\u0005\u001f\u0000\u0000\u0112\u0114\u0003(\u0014\u0000\u0113\u0111\u0001"+
		"\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000\u0000\u0115\u0113\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0118\u0001"+
		"\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u0119\u0005"+
		"\u0003\u0000\u0000\u0119\u011a\u0005\u0006\u0000\u0000\u011a\u012b\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0005@\u0000\u0000\u011c\u011d\u00057\u0000"+
		"\u0000\u011d\u0126\u0005\u0002\u0000\u0000\u011e\u0123\u0003(\u0014\u0000"+
		"\u011f\u0120\u0005\u001f\u0000\u0000\u0120\u0122\u0003(\u0014\u0000\u0121"+
		"\u011f\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123"+
		"\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124"+
		"\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126"+
		"\u011e\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u0003\u0000\u0000\u0129"+
		"\u012b\u0005\u0006\u0000\u0000\u012a\u0105\u0001\u0000\u0000\u0000\u012a"+
		"\u010e\u0001\u0000\u0000\u0000\u012a\u011b\u0001\u0000\u0000\u0000\u012b"+
		"%\u0001\u0000\u0000\u0000\u012c\u012d\u0005\n\u0000\u0000\u012d\u012e"+
		"\u00050\u0000\u0000\u012e\u0131\u0005\n\u0000\u0000\u012f\u0131\u0005"+
		"\n\u0000\u0000\u0130\u012c\u0001\u0000\u0000\u0000\u0130\u012f\u0001\u0000"+
		"\u0000\u0000\u0131\'\u0001\u0000\u0000\u0000\u0132\u0133\u0006\u0014\uffff"+
		"\uffff\u0000\u0133\u0134\u0005&\u0000\u0000\u0134\u0140\u0003(\u0014\u000f"+
		"\u0135\u0136\u0005-\u0000\u0000\u0136\u0140\u0003(\u0014\b\u0137\u0140"+
		"\u0005\r\u0000\u0000\u0138\u0140\u0005\n\u0000\u0000\u0139\u0140\u0005"+
		"\u000b\u0000\u0000\u013a\u0140\u0005\f\u0000\u0000\u013b\u013c\u0005\u0002"+
		"\u0000\u0000\u013c\u013d\u0003(\u0014\u0000\u013d\u013e\u0005\u0003\u0000"+
		"\u0000\u013e\u0140\u0001\u0000\u0000\u0000\u013f\u0132\u0001\u0000\u0000"+
		"\u0000\u013f\u0135\u0001\u0000\u0000\u0000\u013f\u0137\u0001\u0000\u0000"+
		"\u0000\u013f\u0138\u0001\u0000\u0000\u0000\u013f\u0139\u0001\u0000\u0000"+
		"\u0000\u013f\u013a\u0001\u0000\u0000\u0000\u013f\u013b\u0001\u0000\u0000"+
		"\u0000\u0140\u016d\u0001\u0000\u0000\u0000\u0141\u0142\n\u0015\u0000\u0000"+
		"\u0142\u0143\u0005 \u0000\u0000\u0143\u016c\u0003(\u0014\u0016\u0144\u0145"+
		"\n\u0014\u0000\u0000\u0145\u0146\u0005!\u0000\u0000\u0146\u016c\u0003"+
		"(\u0014\u0015\u0147\u0148\n\u0013\u0000\u0000\u0148\u0149\u0005\"\u0000"+
		"\u0000\u0149\u016c\u0003(\u0014\u0014\u014a\u014b\n\u0012\u0000\u0000"+
		"\u014b\u014c\u0005#\u0000\u0000\u014c\u016c\u0003(\u0014\u0013\u014d\u014e"+
		"\n\u0011\u0000\u0000\u014e\u014f\u0005$\u0000\u0000\u014f\u016c\u0003"+
		"(\u0014\u0012\u0150\u0151\n\u0010\u0000\u0000\u0151\u0152\u0005%\u0000"+
		"\u0000\u0152\u016c\u0003(\u0014\u0011\u0153\u0154\n\u000e\u0000\u0000"+
		"\u0154\u0155\u0005\'\u0000\u0000\u0155\u016c\u0003(\u0014\u000f\u0156"+
		"\u0157\n\r\u0000\u0000\u0157\u0158\u0005(\u0000\u0000\u0158\u016c\u0003"+
		"(\u0014\u000e\u0159\u015a\n\f\u0000\u0000\u015a\u015b\u0005)\u0000\u0000"+
		"\u015b\u016c\u0003(\u0014\r\u015c\u015d\n\u000b\u0000\u0000\u015d\u015e"+
		"\u0005+\u0000\u0000\u015e\u016c\u0003(\u0014\f\u015f\u0160\n\n\u0000\u0000"+
		"\u0160\u0161\u0005*\u0000\u0000\u0161\u016c\u0003(\u0014\u000b\u0162\u0163"+
		"\n\t\u0000\u0000\u0163\u0164\u0005,\u0000\u0000\u0164\u016c\u0003(\u0014"+
		"\n\u0165\u0166\n\u0007\u0000\u0000\u0166\u0167\u0005.\u0000\u0000\u0167"+
		"\u016c\u0003(\u0014\b\u0168\u0169\n\u0006\u0000\u0000\u0169\u016a\u0005"+
		"/\u0000\u0000\u016a\u016c\u0003(\u0014\u0007\u016b\u0141\u0001\u0000\u0000"+
		"\u0000\u016b\u0144\u0001\u0000\u0000\u0000\u016b\u0147\u0001\u0000\u0000"+
		"\u0000\u016b\u014a\u0001\u0000\u0000\u0000\u016b\u014d\u0001\u0000\u0000"+
		"\u0000\u016b\u0150\u0001\u0000\u0000\u0000\u016b\u0153\u0001\u0000\u0000"+
		"\u0000\u016b\u0156\u0001\u0000\u0000\u0000\u016b\u0159\u0001\u0000\u0000"+
		"\u0000\u016b\u015c\u0001\u0000\u0000\u0000\u016b\u015f\u0001\u0000\u0000"+
		"\u0000\u016b\u0162\u0001\u0000\u0000\u0000\u016b\u0165\u0001\u0000\u0000"+
		"\u0000\u016b\u0168\u0001\u0000\u0000\u0000\u016c\u016f\u0001\u0000\u0000"+
		"\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000"+
		"\u0000\u016e)\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000"+
		"\u0170\u0175\u0003,\u0016\u0000\u0171\u0172\u0007\u0002\u0000\u0000\u0172"+
		"\u0174\u0003,\u0016\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0174\u0177"+
		"\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0001\u0000\u0000\u0000\u0176+\u0001\u0000\u0000\u0000\u0177\u0175\u0001"+
		"\u0000\u0000\u0000\u0178\u017f\u0005\n\u0000\u0000\u0179\u017f\u0005\u000b"+
		"\u0000\u0000\u017a\u017b\u0005\u0002\u0000\u0000\u017b\u017c\u0003(\u0014"+
		"\u0000\u017c\u017d\u0005\u0003\u0000\u0000\u017d\u017f\u0001\u0000\u0000"+
		"\u0000\u017e\u0178\u0001\u0000\u0000\u0000\u017e\u0179\u0001\u0000\u0000"+
		"\u0000\u017e\u017a\u0001\u0000\u0000\u0000\u017f-\u0001\u0000\u0000\u0000"+
		"&17EPU^dgjox{\u0080\u0085\u0091\u0095\u009f\u00a9\u00b8\u00c5\u00ce\u00d3"+
		"\u00da\u00dd\u00e9\u00f4\u00ff\u010a\u0115\u0123\u0126\u012a\u0130\u013f"+
		"\u016b\u016d\u0175\u017e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}