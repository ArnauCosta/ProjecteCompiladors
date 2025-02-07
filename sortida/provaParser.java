// Generated from prova.g4 by ANTLR 4.13.2

    import java.io.*;
    import java.lang.Object;
    import java.util.Vector;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class provaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_WS=1, TK_LCLAU=2, TK_RCLAU=3, TK_LPAREN=4, TK_RPAREN=5, TK_LBRACKET=6, 
		TK_RBRACKET=7, TK_SEMI=8, TK_PC_PROGRAMA=9, TK_PC_FPROGRAMA=10, TK_PC_PERIODE=11, 
		TK_TIPUS=12, TK_FTIPUS=13, TK_PUNTS=14, TK_VECTOR=15, TK_TUPLA=16, TK_FTUPLA=17, 
		TK_ENTER=18, TK_REAL=19, TK_BOLEA=20, TK_TIPUS_BASIC=21, TK_ACCIO=22, 
		TK_FACCIO=23, TK_FUNCIO=24, TK_FFUNCIO=25, TK_RETORNA=26, TK_PARAM=27, 
		TK_VARIABLES=28, TK_FVARIABLES=29, TK_VARIABLE=30, TK_COMMENT=31, TK_COMA=32, 
		TK_PUNT=33, TK_SUMA=34, TK_RESTA=35, TK_MULTIPLICACIO=36, TK_DIVISIO=37, 
		TK_DIV_ENTERA=38, TK_MODUL=39, TK_MENYS_UNARI=40, TK_IGUALTAT=41, TK_DESIGUALTAT=42, 
		TK_MES_PETIT=43, TK_MES_PETIT_IG=44, TK_MES_GRAN=45, TK_MES_GRAN_IG=46, 
		TK_NEGACIO=47, TK_AND=48, TK_OR=49, TK_DOSPUNTS=50, TK_ASSIGNACIO=51, 
		TK_SI=52, TK_LLAVORS=53, TK_ALTRAMENT=54, TK_FSI=55, TK_EN=56, TK_LN=57, 
		TK_PER=58, TK_ID=59, TK_FINS=60, TK_FER=61, TK_FPER=62, TK_MENTRE=63, 
		TK_FMENTRE=64, TK_LLEGIR=65, TK_ESCRIURE=66, TK_IDENT=67;
	public static final int
		RULE_inici = 0, RULE_estructuraGeneral = 1, RULE_tipusDecl = 2, RULE_novaDefinicio = 3, 
		RULE_campTupla = 4, RULE_accioFuncioDecl = 5, RULE_accioDecl = 6, RULE_funcioDecl = 7, 
		RULE_parametresFormals = 8, RULE_blocVariables = 9, RULE_declaracioVariable = 10, 
		RULE_tipusDefinit = 11, RULE_sentencia = 12, RULE_assignacio = 13, RULE_condicional = 14, 
		RULE_buclePer = 15, RULE_bucleMent = 16, RULE_cridaAccioFuncio = 17, RULE_operacioLecturaEscritura = 18, 
		RULE_rang = 19, RULE_expr = 20, RULE_expr2 = 21, RULE_expr3 = 22, RULE_expr4 = 23, 
		RULE_expr5 = 24, RULE_exprbase = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"inici", "estructuraGeneral", "tipusDecl", "novaDefinicio", "campTupla", 
			"accioFuncioDecl", "accioDecl", "funcioDecl", "parametresFormals", "blocVariables", 
			"declaracioVariable", "tipusDefinit", "sentencia", "assignacio", "condicional", 
			"buclePer", "bucleMent", "cridaAccioFuncio", "operacioLecturaEscritura", 
			"rang", "expr", "expr2", "expr3", "expr4", "expr5", "exprbase"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'['", "']'", "'('", "')'", "'{'", "'}'", "';'", "'programa'", 
			"'fprograma'", "'periode'", "'tipus'", "'ftipus'", "':'", "'vector'", 
			"'tupla;'", "'ftupla;'", null, null, null, null, "'accio'", "'faccio'", 
			"'funcio'", "'ffuncio'", "'retorna'", null, "'variables'", "'fvariables'", 
			null, null, "','", "'.'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'%'", 
			"'\\u00E2\\u02C6\\u00BC'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", 
			"'no'", "'&'", "'|'", "'..'", "':='", "'si'", "'llavors'", "'altrament'", 
			"'fsi'", "'en'", "'ln'", "'per'", "'id'", "'fins'", "'fer'", "'fper'", 
			"'mentre'", "'fmentre'", "'llegir'", "'escriure'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TK_WS", "TK_LCLAU", "TK_RCLAU", "TK_LPAREN", "TK_RPAREN", "TK_LBRACKET", 
			"TK_RBRACKET", "TK_SEMI", "TK_PC_PROGRAMA", "TK_PC_FPROGRAMA", "TK_PC_PERIODE", 
			"TK_TIPUS", "TK_FTIPUS", "TK_PUNTS", "TK_VECTOR", "TK_TUPLA", "TK_FTUPLA", 
			"TK_ENTER", "TK_REAL", "TK_BOLEA", "TK_TIPUS_BASIC", "TK_ACCIO", "TK_FACCIO", 
			"TK_FUNCIO", "TK_FFUNCIO", "TK_RETORNA", "TK_PARAM", "TK_VARIABLES", 
			"TK_FVARIABLES", "TK_VARIABLE", "TK_COMMENT", "TK_COMA", "TK_PUNT", "TK_SUMA", 
			"TK_RESTA", "TK_MULTIPLICACIO", "TK_DIVISIO", "TK_DIV_ENTERA", "TK_MODUL", 
			"TK_MENYS_UNARI", "TK_IGUALTAT", "TK_DESIGUALTAT", "TK_MES_PETIT", "TK_MES_PETIT_IG", 
			"TK_MES_GRAN", "TK_MES_GRAN_IG", "TK_NEGACIO", "TK_AND", "TK_OR", "TK_DOSPUNTS", 
			"TK_ASSIGNACIO", "TK_SI", "TK_LLAVORS", "TK_ALTRAMENT", "TK_FSI", "TK_EN", 
			"TK_LN", "TK_PER", "TK_ID", "TK_FINS", "TK_FER", "TK_FPER", "TK_MENTRE", 
			"TK_FMENTRE", "TK_LLEGIR", "TK_ESCRIURE", "TK_IDENT"
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
	public String getGrammarFileName() { return "prova.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    SymTable TS = new SymTable<Registre>(1001);
	    Bytecode bc=new Bytecode("Lans");
	    int contadorVariables=0;
	    Boolean errorsem=false;
	    Long saltLinia;

	    public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e)    {
	      super.notifyErrorListeners(offendingToken,msg,e);
	      errorsem=true;
	    }

	    private char stringTypeToType(String type) {
	        char tipus = ' ';
	        if (type.equals("enter")) {
	            tipus='I';
	        } else if (type.equals("real")) {
	            tipus='F';
	        } else if (type.equals("boolea")) {
	            tipus='Z';
	        }
	        return tipus;
	    }

	//    private char checkType(char tipus1, char tipus2) {
	//        if (tipus1 == 'F' && tipus2 == 'F') {
	//            return 'F';
	//        } else if ((tipus1 == 'F' || tipus2 == 'F') && ((tipus1 == 'I' || tipus2 == 'I'))){
	//            return 'F';
	//        } else if (tipus1 == 'I' && tipus2 == 'I') {
	//            return 'I';
	//        }
	//    }

	public provaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IniciContext extends ParserRuleContext {
		public EstructuraGeneralContext estructuraGeneral() {
			return getRuleContext(EstructuraGeneralContext.class,0);
		}
		public TerminalNode EOF() { return getToken(provaParser.EOF, 0); }
		public IniciContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inici; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterInici(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitInici(this);
		}
	}

	public final IniciContext inici() throws RecognitionException {
		IniciContext _localctx = new IniciContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inici);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			estructuraGeneral();
			setState(53);
			match(EOF);
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
	public static class EstructuraGeneralContext extends ParserRuleContext {
		public TerminalNode TK_PC_PROGRAMA() { return getToken(provaParser.TK_PC_PROGRAMA, 0); }
		public TerminalNode TK_PC_FPROGRAMA() { return getToken(provaParser.TK_PC_FPROGRAMA, 0); }
		public TipusDeclContext tipusDecl() {
			return getRuleContext(TipusDeclContext.class,0);
		}
		public AccioFuncioDeclContext accioFuncioDecl() {
			return getRuleContext(AccioFuncioDeclContext.class,0);
		}
		public BlocVariablesContext blocVariables() {
			return getRuleContext(BlocVariablesContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public EstructuraGeneralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructuraGeneral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterEstructuraGeneral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitEstructuraGeneral(this);
		}
	}

	public final EstructuraGeneralContext estructuraGeneral() throws RecognitionException {
		EstructuraGeneralContext _localctx = new EstructuraGeneralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_estructuraGeneral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_TIPUS) {
				{
				setState(55);
				tipusDecl();
				}
			}

			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_ACCIO || _la==TK_FUNCIO) {
				{
				setState(58);
				accioFuncioDecl();
				}
			}

			setState(61);
			match(TK_PC_PROGRAMA);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_VARIABLES) {
				{
				setState(62);
				blocVariables();
				}
			}

			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				sentencia();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 59457L) != 0) );
			setState(70);
			match(TK_PC_FPROGRAMA);
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
		public TerminalNode TK_TIPUS() { return getToken(provaParser.TK_TIPUS, 0); }
		public TerminalNode TK_FTIPUS() { return getToken(provaParser.TK_FTIPUS, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterTipusDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitTipusDecl(this);
		}
	}

	public final TipusDeclContext tipusDecl() throws RecognitionException {
		TipusDeclContext _localctx = new TipusDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipusDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(TK_TIPUS);
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				novaDefinicio();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TK_IDENT );
			setState(78);
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
		public TerminalNode TK_IDENT() { return getToken(provaParser.TK_IDENT, 0); }
		public TerminalNode TK_PUNTS() { return getToken(provaParser.TK_PUNTS, 0); }
		public TerminalNode TK_TUPLA() { return getToken(provaParser.TK_TUPLA, 0); }
		public TerminalNode TK_LBRACKET() { return getToken(provaParser.TK_LBRACKET, 0); }
		public TerminalNode TK_RBRACKET() { return getToken(provaParser.TK_RBRACKET, 0); }
		public TerminalNode TK_FTUPLA() { return getToken(provaParser.TK_FTUPLA, 0); }
		public List<CampTuplaContext> campTupla() {
			return getRuleContexts(CampTuplaContext.class);
		}
		public CampTuplaContext campTupla(int i) {
			return getRuleContext(CampTuplaContext.class,i);
		}
		public DefinicioTuplaContext(NovaDefinicioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterDefinicioTupla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitDefinicioTupla(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefinicioVectorContext extends NovaDefinicioContext {
		public TerminalNode TK_IDENT() { return getToken(provaParser.TK_IDENT, 0); }
		public TerminalNode TK_PUNTS() { return getToken(provaParser.TK_PUNTS, 0); }
		public TerminalNode TK_VECTOR() { return getToken(provaParser.TK_VECTOR, 0); }
		public TerminalNode TK_TIPUS_BASIC() { return getToken(provaParser.TK_TIPUS_BASIC, 0); }
		public List<TerminalNode> TK_ENTER() { return getTokens(provaParser.TK_ENTER); }
		public TerminalNode TK_ENTER(int i) {
			return getToken(provaParser.TK_ENTER, i);
		}
		public TerminalNode TK_SEMI() { return getToken(provaParser.TK_SEMI, 0); }
		public List<TerminalNode> TK_COMA() { return getTokens(provaParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(provaParser.TK_COMA, i);
		}
		public DefinicioVectorContext(NovaDefinicioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterDefinicioVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitDefinicioVector(this);
		}
	}

	public final NovaDefinicioContext novaDefinicio() throws RecognitionException {
		NovaDefinicioContext _localctx = new NovaDefinicioContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_novaDefinicio);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new DefinicioVectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(TK_IDENT);
				setState(81);
				match(TK_PUNTS);
				setState(82);
				match(TK_VECTOR);
				setState(83);
				match(TK_TIPUS_BASIC);
				setState(84);
				match(TK_ENTER);
				setState(85);
				match(TK_ENTER);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(86);
					match(TK_COMA);
					setState(87);
					match(TK_ENTER);
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				match(TK_SEMI);
				}
				break;
			case 2:
				_localctx = new DefinicioTuplaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(TK_IDENT);
				setState(95);
				match(TK_PUNTS);
				setState(96);
				match(TK_TUPLA);
				setState(97);
				match(TK_LBRACKET);
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(98);
					campTupla();
					}
					}
					setState(101); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_IDENT );
				setState(103);
				match(TK_RBRACKET);
				setState(104);
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
		public TerminalNode TK_IDENT() { return getToken(provaParser.TK_IDENT, 0); }
		public TerminalNode TK_PUNTS() { return getToken(provaParser.TK_PUNTS, 0); }
		public TerminalNode TK_TIPUS_BASIC() { return getToken(provaParser.TK_TIPUS_BASIC, 0); }
		public TerminalNode TK_SEMI() { return getToken(provaParser.TK_SEMI, 0); }
		public CampTuplaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campTupla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterCampTupla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitCampTupla(this);
		}
	}

	public final CampTuplaContext campTupla() throws RecognitionException {
		CampTuplaContext _localctx = new CampTuplaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_campTupla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(TK_IDENT);
			setState(109);
			match(TK_PUNTS);
			setState(110);
			match(TK_TIPUS_BASIC);
			setState(111);
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
		public List<AccioDeclContext> accioDecl() {
			return getRuleContexts(AccioDeclContext.class);
		}
		public AccioDeclContext accioDecl(int i) {
			return getRuleContext(AccioDeclContext.class,i);
		}
		public List<FuncioDeclContext> funcioDecl() {
			return getRuleContexts(FuncioDeclContext.class);
		}
		public FuncioDeclContext funcioDecl(int i) {
			return getRuleContext(FuncioDeclContext.class,i);
		}
		public AccioFuncioDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accioFuncioDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterAccioFuncioDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitAccioFuncioDecl(this);
		}
	}

	public final AccioFuncioDeclContext accioFuncioDecl() throws RecognitionException {
		AccioFuncioDeclContext _localctx = new AccioFuncioDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_accioFuncioDecl);
		int _la;
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ACCIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(113);
					accioDecl();
					}
					}
					setState(116); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_ACCIO );
				}
				break;
			case TK_FUNCIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(118);
					funcioDecl();
					}
					}
					setState(121); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_FUNCIO );
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
		public Token id;
		public TerminalNode TK_ACCIO() { return getToken(provaParser.TK_ACCIO, 0); }
		public TerminalNode TK_FACCIO() { return getToken(provaParser.TK_FACCIO, 0); }
		public TerminalNode TK_IDENT() { return getToken(provaParser.TK_IDENT, 0); }
		public TerminalNode TK_LPAREN() { return getToken(provaParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(provaParser.TK_RPAREN, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterAccioDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitAccioDecl(this);
		}
	}

	public final AccioDeclContext accioDecl() throws RecognitionException {
		AccioDeclContext _localctx = new AccioDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_accioDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(TK_ACCIO);
			setState(126);
			((AccioDeclContext)_localctx).id = match(TK_IDENT);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LPAREN) {
				{
				setState(127);
				match(TK_LPAREN);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PARAM) {
					{
					setState(128);
					parametresFormals();
					}
				}

				setState(131);
				match(TK_RPAREN);
				}
			}

			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_VARIABLES) {
				{
				setState(134);
				blocVariables();
				}
			}

			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 59457L) != 0)) {
				{
				{
				setState(137);
				sentencia();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(TK_FACCIO);

			            if (TS.existeix((((AccioDeclContext)_localctx).id!=null?((AccioDeclContext)_localctx).id.getText():null))) {
			                notifyErrorListeners(((AccioDeclContext)_localctx).id, "Error: Nom ja utilitzat.", null);
			            } else {
			                TS.inserir((((AccioDeclContext)_localctx).id!=null?((AccioDeclContext)_localctx).id.getText():null), new Registre("funcio", 'V'));
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
	public static class FuncioDeclContext extends ParserRuleContext {
		public Token id;
		public Token TK_TIPUS_BASIC;
		public TerminalNode TK_FUNCIO() { return getToken(provaParser.TK_FUNCIO, 0); }
		public List<TerminalNode> TK_RETORNA() { return getTokens(provaParser.TK_RETORNA); }
		public TerminalNode TK_RETORNA(int i) {
			return getToken(provaParser.TK_RETORNA, i);
		}
		public TerminalNode TK_TIPUS_BASIC() { return getToken(provaParser.TK_TIPUS_BASIC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_FFUNCIO() { return getToken(provaParser.TK_FFUNCIO, 0); }
		public TerminalNode TK_IDENT() { return getToken(provaParser.TK_IDENT, 0); }
		public TerminalNode TK_LPAREN() { return getToken(provaParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(provaParser.TK_RPAREN, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterFuncioDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitFuncioDecl(this);
		}
	}

	public final FuncioDeclContext funcioDecl() throws RecognitionException {
		FuncioDeclContext _localctx = new FuncioDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcioDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(TK_FUNCIO);
			setState(147);
			((FuncioDeclContext)_localctx).id = match(TK_IDENT);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LPAREN) {
				{
				setState(148);
				match(TK_LPAREN);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PARAM) {
					{
					setState(149);
					parametresFormals();
					}
				}

				setState(152);
				match(TK_RPAREN);
				}
			}

			setState(155);
			match(TK_RETORNA);
			setState(156);
			((FuncioDeclContext)_localctx).TK_TIPUS_BASIC = match(TK_TIPUS_BASIC);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_VARIABLES) {
				{
				setState(157);
				blocVariables();
				}
			}

			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 59457L) != 0)) {
				{
				{
				setState(160);
				sentencia();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(TK_RETORNA);
			setState(167);
			expr();
			setState(168);
			match(TK_FFUNCIO);

			        if (TS.existeix((((FuncioDeclContext)_localctx).id!=null?((FuncioDeclContext)_localctx).id.getText():null))) {
			            notifyErrorListeners(((FuncioDeclContext)_localctx).id, "Error: Nom ja utilitzat.", null);
			        } else {
			            TS.inserir((((FuncioDeclContext)_localctx).id!=null?((FuncioDeclContext)_localctx).id.getText():null), new Registre("funcio", stringTypeToType((((FuncioDeclContext)_localctx).TK_TIPUS_BASIC!=null?((FuncioDeclContext)_localctx).TK_TIPUS_BASIC.getText():null))));
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
	public static class ParametresFormalsContext extends ParserRuleContext {
		public List<TerminalNode> TK_PARAM() { return getTokens(provaParser.TK_PARAM); }
		public TerminalNode TK_PARAM(int i) {
			return getToken(provaParser.TK_PARAM, i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(provaParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(provaParser.TK_COMA, i);
		}
		public ParametresFormalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametresFormals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterParametresFormals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitParametresFormals(this);
		}
	}

	public final ParametresFormalsContext parametresFormals() throws RecognitionException {
		ParametresFormalsContext _localctx = new ParametresFormalsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametresFormals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(TK_PARAM);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(172);
				match(TK_COMA);
				setState(173);
				match(TK_PARAM);
				}
				}
				setState(178);
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
	public static class BlocVariablesContext extends ParserRuleContext {
		public TerminalNode TK_VARIABLES() { return getToken(provaParser.TK_VARIABLES, 0); }
		public TerminalNode TK_FVARIABLES() { return getToken(provaParser.TK_FVARIABLES, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterBlocVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitBlocVariables(this);
		}
	}

	public final BlocVariablesContext blocVariables() throws RecognitionException {
		BlocVariablesContext _localctx = new BlocVariablesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blocVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(TK_VARIABLES);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_IDENT) {
				{
				{
				setState(180);
				declaracioVariable();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
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
		public Token id1;
		public Token TK_IDENT;
		public List<Token> id2 = new ArrayList<Token>();
		public TipusDefinitContext tipusDefinit;
		public TerminalNode TK_PUNTS() { return getToken(provaParser.TK_PUNTS, 0); }
		public TipusDefinitContext tipusDefinit() {
			return getRuleContext(TipusDefinitContext.class,0);
		}
		public TerminalNode TK_SEMI() { return getToken(provaParser.TK_SEMI, 0); }
		public List<TerminalNode> TK_IDENT() { return getTokens(provaParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(provaParser.TK_IDENT, i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(provaParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(provaParser.TK_COMA, i);
		}
		public DeclaracioVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracioVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterDeclaracioVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitDeclaracioVariable(this);
		}
	}

	public final DeclaracioVariableContext declaracioVariable() throws RecognitionException {
		DeclaracioVariableContext _localctx = new DeclaracioVariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracioVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			((DeclaracioVariableContext)_localctx).id1 = match(TK_IDENT);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(189);
				match(TK_COMA);
				setState(190);
				((DeclaracioVariableContext)_localctx).TK_IDENT = match(TK_IDENT);
				((DeclaracioVariableContext)_localctx).id2.add(((DeclaracioVariableContext)_localctx).TK_IDENT);
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(TK_PUNTS);
			setState(197);
			((DeclaracioVariableContext)_localctx).tipusDefinit = tipusDefinit();
			setState(198);
			match(TK_SEMI);

			        // Comprovem si la variable ja ha estat declarada
			        if (TS.existeix((((DeclaracioVariableContext)_localctx).id1!=null?((DeclaracioVariableContext)_localctx).id1.getText():null))) {
			            notifyErrorListeners(((DeclaracioVariableContext)_localctx).id1, "Error: Variable ja declarada.", null);
			        } else {
			            int adreca = contadorVariables;
			            TS.inserir((((DeclaracioVariableContext)_localctx).id1!=null?((DeclaracioVariableContext)_localctx).id1.getText():null), new Registre("variable", ((DeclaracioVariableContext)_localctx).tipusDefinit.tipus, adreca));
			            contadorVariables++;
			        }

			        // Recorrem totes les variables separades per coma
			        for (Token identificador : ((DeclaracioVariableContext)_localctx).id2) {
			            System.out.println("Identificadors: " + identificador.getText());
			            if (TS.existeix(identificador.getText())) {
			                notifyErrorListeners(identificador, "Error: Variable '" + identificador.getText() + "' ja declarada.", null);
			            } else {
			                TS.inserir(identificador.getText(), new Registre("variable", ((DeclaracioVariableContext)_localctx).tipusDefinit.tipus));
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipusDefinitContext extends ParserRuleContext {
		public char tipus;
		public Token TK_TIPUS_BASIC;
		public Token TK_IDENT;
		public TerminalNode TK_TIPUS_BASIC() { return getToken(provaParser.TK_TIPUS_BASIC, 0); }
		public TerminalNode TK_IDENT() { return getToken(provaParser.TK_IDENT, 0); }
		public TipusDefinitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipusDefinit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterTipusDefinit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitTipusDefinit(this);
		}
	}

	public final TipusDefinitContext tipusDefinit() throws RecognitionException {
		TipusDefinitContext _localctx = new TipusDefinitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipusDefinit);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_TIPUS_BASIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				((TipusDefinitContext)_localctx).TK_TIPUS_BASIC = match(TK_TIPUS_BASIC);

				         if ((((TipusDefinitContext)_localctx).TK_TIPUS_BASIC!=null?((TipusDefinitContext)_localctx).TK_TIPUS_BASIC.getText():null).equals("enter")) {
				             ((TipusDefinitContext)_localctx).tipus = 'I';
				         } else if ((((TipusDefinitContext)_localctx).TK_TIPUS_BASIC!=null?((TipusDefinitContext)_localctx).TK_TIPUS_BASIC.getText():null).equals("real")) {
				             ((TipusDefinitContext)_localctx).tipus = 'F';
				         } else if ((((TipusDefinitContext)_localctx).TK_TIPUS_BASIC!=null?((TipusDefinitContext)_localctx).TK_TIPUS_BASIC.getText():null).equals("boolea")) {
				             ((TipusDefinitContext)_localctx).tipus = 'Z';
				         }
				     
				}
				break;
			case TK_IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				((TipusDefinitContext)_localctx).TK_IDENT = match(TK_IDENT);

				        // Verificar si la variable existe en la tabla de símbolos
				        if (!TS.existeix((((TipusDefinitContext)_localctx).TK_IDENT!=null?((TipusDefinitContext)_localctx).TK_IDENT.getText():null))) {
				            System.out.println("No existeix: " + (((TipusDefinitContext)_localctx).TK_IDENT!=null?((TipusDefinitContext)_localctx).TK_IDENT.getText():null));
				            notifyErrorListeners(((TipusDefinitContext)_localctx).TK_IDENT, "Error: Variable '" + (((TipusDefinitContext)_localctx).TK_IDENT!=null?((TipusDefinitContext)_localctx).TK_IDENT.getText():null) + "' no declarada.", null);
				        } else {
				            System.out.println("Existeix molt: " + (((TipusDefinitContext)_localctx).TK_IDENT!=null?((TipusDefinitContext)_localctx).TK_IDENT.getText():null));
				        }
				    
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
		public CridaAccioFuncioContext cridaAccioFuncio() {
			return getRuleContext(CridaAccioFuncioContext.class,0);
		}
		public OperacioLecturaEscrituraContext operacioLecturaEscritura() {
			return getRuleContext(OperacioLecturaEscrituraContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sentencia);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				assignacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				condicional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				buclePer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				bucleMent();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(211);
				cridaAccioFuncio();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(212);
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
		public Token TK_IDENT;
		public ExprContext expr;
		public TerminalNode TK_IDENT() { return getToken(provaParser.TK_IDENT, 0); }
		public TerminalNode TK_ASSIGNACIO() { return getToken(provaParser.TK_ASSIGNACIO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_SEMI() { return getToken(provaParser.TK_SEMI, 0); }
		public AssignacioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignacio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterAssignacio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitAssignacio(this);
		}
	}

	public final AssignacioContext assignacio() throws RecognitionException {
		AssignacioContext _localctx = new AssignacioContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignacio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			((AssignacioContext)_localctx).TK_IDENT = match(TK_IDENT);
			setState(216);
			match(TK_ASSIGNACIO);
			setState(217);
			((AssignacioContext)_localctx).expr = expr();
			setState(218);
			match(TK_SEMI);

			        // Verificar si la variable existe en la tabla de símbolos
			        if (!TS.existeix((((AssignacioContext)_localctx).TK_IDENT!=null?((AssignacioContext)_localctx).TK_IDENT.getText():null))) {
			            System.out.println("No existeix: " + (((AssignacioContext)_localctx).TK_IDENT!=null?((AssignacioContext)_localctx).TK_IDENT.getText():null));
			            notifyErrorListeners(((AssignacioContext)_localctx).TK_IDENT, "Error: Variable '" + (((AssignacioContext)_localctx).TK_IDENT!=null?((AssignacioContext)_localctx).TK_IDENT.getText():null) + "' no declarada.", null);
			        } else {
			            System.out.println("Existeix: " + (((AssignacioContext)_localctx).TK_IDENT!=null?((AssignacioContext)_localctx).TK_IDENT.getText():null));
			            Registre r = (Registre) TS.obtenir((((AssignacioContext)_localctx).TK_IDENT!=null?((AssignacioContext)_localctx).TK_IDENT.getText():null));
			            if (((AssignacioContext)_localctx).expr.tipus != r.getTipus() && !(r.getTipus() == 'F' && ((AssignacioContext)_localctx).expr.tipus == 'I')){
			                notifyErrorListeners(((AssignacioContext)_localctx).TK_IDENT, "Error: Type missmatch. " + ((AssignacioContext)_localctx).expr.tipus + " type cannot be casted to " + r.getTipus(), null);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public ExprContext e1;
		public ExprContext expr;
		public List<ExprContext> e2 = new ArrayList<ExprContext>();
		public TerminalNode TK_SI() { return getToken(provaParser.TK_SI, 0); }
		public List<TerminalNode> TK_LLAVORS() { return getTokens(provaParser.TK_LLAVORS); }
		public TerminalNode TK_LLAVORS(int i) {
			return getToken(provaParser.TK_LLAVORS, i);
		}
		public TerminalNode TK_FSI() { return getToken(provaParser.TK_FSI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<TerminalNode> TK_ALTRAMENT() { return getTokens(provaParser.TK_ALTRAMENT); }
		public TerminalNode TK_ALTRAMENT(int i) {
			return getToken(provaParser.TK_ALTRAMENT, i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condicional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(TK_SI);
			setState(222);
			((CondicionalContext)_localctx).e1 = expr();
			setState(223);
			match(TK_LLAVORS);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 59457L) != 0)) {
				{
				{
				setState(224);
				sentencia();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(230);
					match(TK_ALTRAMENT);
					setState(231);
					((CondicionalContext)_localctx).expr = expr();
					((CondicionalContext)_localctx).e2.add(((CondicionalContext)_localctx).expr);
					setState(232);
					match(TK_LLAVORS);
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 59457L) != 0)) {
						{
						{
						setState(233);
						sentencia();
						}
						}
						setState(238);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_ALTRAMENT) {
				{
				setState(244);
				match(TK_ALTRAMENT);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 59457L) != 0)) {
					{
					{
					setState(245);
					sentencia();
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(253);
			match(TK_FSI);

			        System.out.println("Primer: " + ((CondicionalContext)_localctx).e1.tipus);
			        if(((CondicionalContext)_localctx).e1.tipus != 'Z'){
			            notifyErrorListeners((((CondicionalContext)_localctx).e1!=null?(((CondicionalContext)_localctx).e1.start):null), "Expr not boolean", null);
			        }
			        for (ExprContext ctx : ((CondicionalContext)_localctx).e2) {
			            System.out.println("Segon: " + ctx.tipus);
			            if(ctx.tipus != 'Z'){
			                notifyErrorListeners(ctx.start, "Expr not boolean", null);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BuclePerContext extends ParserRuleContext {
		public RangContext r;
		public TerminalNode TK_PER() { return getToken(provaParser.TK_PER, 0); }
		public TerminalNode TK_IDENT() { return getToken(provaParser.TK_IDENT, 0); }
		public TerminalNode TK_EN() { return getToken(provaParser.TK_EN, 0); }
		public TerminalNode TK_FER() { return getToken(provaParser.TK_FER, 0); }
		public TerminalNode TK_FPER() { return getToken(provaParser.TK_FPER, 0); }
		public RangContext rang() {
			return getRuleContext(RangContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterBuclePer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitBuclePer(this);
		}
	}

	public final BuclePerContext buclePer() throws RecognitionException {
		BuclePerContext _localctx = new BuclePerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_buclePer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(TK_PER);
			setState(257);
			match(TK_IDENT);
			setState(258);
			match(TK_EN);
			setState(259);
			((BuclePerContext)_localctx).r = rang();
			setState(260);
			match(TK_FER);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 59457L) != 0)) {
				{
				{
				setState(261);
				sentencia();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
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
		public ExprContext expr;
		public TerminalNode TK_MENTRE() { return getToken(provaParser.TK_MENTRE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_FER() { return getToken(provaParser.TK_FER, 0); }
		public TerminalNode TK_FMENTRE() { return getToken(provaParser.TK_FMENTRE, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterBucleMent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitBucleMent(this);
		}
	}

	public final BucleMentContext bucleMent() throws RecognitionException {
		BucleMentContext _localctx = new BucleMentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bucleMent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(TK_MENTRE);
			setState(270);
			((BucleMentContext)_localctx).expr = expr();
			setState(271);
			match(TK_FER);
			setState(273); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(272);
				sentencia();
				}
				}
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 59457L) != 0) );
			setState(277);
			match(TK_FMENTRE);

			        if (((BucleMentContext)_localctx).expr.tipus != 'Z'){
			            notifyErrorListeners((((BucleMentContext)_localctx).expr!=null?(((BucleMentContext)_localctx).expr.start):null), "Expr not boolean", null);
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
	public static class CridaAccioFuncioContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(provaParser.TK_IDENT, 0); }
		public TerminalNode TK_LPAREN() { return getToken(provaParser.TK_LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_RPAREN() { return getToken(provaParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(provaParser.TK_SEMI, 0); }
		public List<TerminalNode> TK_COMA() { return getTokens(provaParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(provaParser.TK_COMA, i);
		}
		public CridaAccioFuncioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cridaAccioFuncio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterCridaAccioFuncio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitCridaAccioFuncio(this);
		}
	}

	public final CridaAccioFuncioContext cridaAccioFuncio() throws RecognitionException {
		CridaAccioFuncioContext _localctx = new CridaAccioFuncioContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cridaAccioFuncio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(TK_IDENT);
			setState(281);
			match(TK_LPAREN);
			setState(282);
			expr();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(283);
				match(TK_COMA);
				setState(284);
				expr();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			match(TK_RPAREN);
			setState(291);
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
		public TerminalNode TK_LLEGIR() { return getToken(provaParser.TK_LLEGIR, 0); }
		public TerminalNode TK_LPAREN() { return getToken(provaParser.TK_LPAREN, 0); }
		public TerminalNode TK_IDENT() { return getToken(provaParser.TK_IDENT, 0); }
		public TerminalNode TK_RPAREN() { return getToken(provaParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(provaParser.TK_SEMI, 0); }
		public TerminalNode TK_PUNTS() { return getToken(provaParser.TK_PUNTS, 0); }
		public TerminalNode TK_TIPUS_BASIC() { return getToken(provaParser.TK_TIPUS_BASIC, 0); }
		public TerminalNode TK_ESCRIURE() { return getToken(provaParser.TK_ESCRIURE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(provaParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(provaParser.TK_COMA, i);
		}
		public TerminalNode TK_LN() { return getToken(provaParser.TK_LN, 0); }
		public OperacioLecturaEscrituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacioLecturaEscritura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterOperacioLecturaEscritura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitOperacioLecturaEscritura(this);
		}
	}

	public final OperacioLecturaEscrituraContext operacioLecturaEscritura() throws RecognitionException {
		OperacioLecturaEscrituraContext _localctx = new OperacioLecturaEscrituraContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operacioLecturaEscritura);
		int _la;
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(TK_LLEGIR);
				setState(294);
				match(TK_LPAREN);
				setState(295);
				match(TK_IDENT);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTS) {
					{
					setState(296);
					match(TK_PUNTS);
					setState(297);
					match(TK_TIPUS_BASIC);
					}
				}

				setState(300);
				match(TK_RPAREN);
				setState(301);
				match(TK_SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(TK_ESCRIURE);
				setState(303);
				match(TK_LPAREN);
				setState(304);
				expr();
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(305);
					match(TK_COMA);
					setState(306);
					expr();
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(312);
				match(TK_RPAREN);
				setState(313);
				match(TK_SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(TK_ESCRIURE);
				setState(316);
				match(TK_LN);
				setState(317);
				match(TK_LPAREN);
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & -9223363172042031103L) != 0)) {
					{
					setState(318);
					expr();
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMA) {
						{
						{
						setState(319);
						match(TK_COMA);
						setState(320);
						expr();
						}
						}
						setState(325);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(328);
				match(TK_RPAREN);
				setState(329);
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
		public List<TerminalNode> TK_ENTER() { return getTokens(provaParser.TK_ENTER); }
		public TerminalNode TK_ENTER(int i) {
			return getToken(provaParser.TK_ENTER, i);
		}
		public TerminalNode TK_COMA() { return getToken(provaParser.TK_COMA, 0); }
		public RangContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rang; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterRang(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitRang(this);
		}
	}

	public final RangContext rang() throws RecognitionException {
		RangContext _localctx = new RangContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rang);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(TK_ENTER);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COMA) {
				{
				setState(333);
				match(TK_COMA);
				setState(334);
				match(TK_ENTER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public char tipus;
		public Expr2Context e1;
		public Expr2Context e2;
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public List<TerminalNode> TK_AND() { return getTokens(provaParser.TK_AND); }
		public TerminalNode TK_AND(int i) {
			return getToken(provaParser.TK_AND, i);
		}
		public List<TerminalNode> TK_OR() { return getTokens(provaParser.TK_OR); }
		public TerminalNode TK_OR(int i) {
			return getToken(provaParser.TK_OR, i);
		}
		public List<TerminalNode> TK_NEGACIO() { return getTokens(provaParser.TK_NEGACIO); }
		public TerminalNode TK_NEGACIO(int i) {
			return getToken(provaParser.TK_NEGACIO, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			((ExprContext)_localctx).e1 = expr2();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) {
				{
				{
				setState(338);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(339);
				((ExprContext)_localctx).e2 = expr2();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        if (((ExprContext)_localctx).e2 == null) {
			            ((ExprContext)_localctx).tipus =  ((ExprContext)_localctx).e1.tipus;
			        } else if ((((ExprContext)_localctx).e1.tipus != 'Z')) {
			            notifyErrorListeners((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null), "Expr not boolean", null);
			        } else if (((ExprContext)_localctx).e2.tipus != 'Z'){
			            notifyErrorListeners((((ExprContext)_localctx).e2!=null?(((ExprContext)_localctx).e2.start):null), "Expr not boolean", null);
			        } else {
			            ((ExprContext)_localctx).tipus =  'Z';
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
	public static class Expr2Context extends ParserRuleContext {
		public char tipus;
		public Expr3Context e1;
		public Expr3Context e2;
		public List<Expr3Context> expr3() {
			return getRuleContexts(Expr3Context.class);
		}
		public Expr3Context expr3(int i) {
			return getRuleContext(Expr3Context.class,i);
		}
		public List<TerminalNode> TK_MES_GRAN() { return getTokens(provaParser.TK_MES_GRAN); }
		public TerminalNode TK_MES_GRAN(int i) {
			return getToken(provaParser.TK_MES_GRAN, i);
		}
		public List<TerminalNode> TK_MES_GRAN_IG() { return getTokens(provaParser.TK_MES_GRAN_IG); }
		public TerminalNode TK_MES_GRAN_IG(int i) {
			return getToken(provaParser.TK_MES_GRAN_IG, i);
		}
		public List<TerminalNode> TK_MES_PETIT() { return getTokens(provaParser.TK_MES_PETIT); }
		public TerminalNode TK_MES_PETIT(int i) {
			return getToken(provaParser.TK_MES_PETIT, i);
		}
		public List<TerminalNode> TK_MES_PETIT_IG() { return getTokens(provaParser.TK_MES_PETIT_IG); }
		public TerminalNode TK_MES_PETIT_IG(int i) {
			return getToken(provaParser.TK_MES_PETIT_IG, i);
		}
		public List<TerminalNode> TK_IGUALTAT() { return getTokens(provaParser.TK_IGUALTAT); }
		public TerminalNode TK_IGUALTAT(int i) {
			return getToken(provaParser.TK_IGUALTAT, i);
		}
		public List<TerminalNode> TK_DESIGUALTAT() { return getTokens(provaParser.TK_DESIGUALTAT); }
		public TerminalNode TK_DESIGUALTAT(int i) {
			return getToken(provaParser.TK_DESIGUALTAT, i);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitExpr2(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr2);
		int _la;
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				((Expr2Context)_localctx).e1 = expr3();
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333120L) != 0)) {
					{
					{
					setState(348);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333120L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(349);
					((Expr2Context)_localctx).e2 = expr3();
					}
					}
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				        if (((Expr2Context)_localctx).e2 == null) {
				            ((Expr2Context)_localctx).tipus =  ((Expr2Context)_localctx).e1.tipus;
				        } else if (((Expr2Context)_localctx).e1.tipus != 'Z') {
				            notifyErrorListeners((((Expr2Context)_localctx).e1!=null?(((Expr2Context)_localctx).e1.start):null), "Expr not boolean", null);
				        } else if (((Expr2Context)_localctx).e2.tipus != 'Z') {
				            notifyErrorListeners((((Expr2Context)_localctx).e2!=null?(((Expr2Context)_localctx).e2.start):null), "Expr not boolean", null);
				        } else if ((((Expr2Context)_localctx).e1.tipus == ((Expr2Context)_localctx).e2.tipus)) {
				            ((Expr2Context)_localctx).tipus =  ((Expr2Context)_localctx).e1.tipus;
				        } else if ((((Expr2Context)_localctx).e1.tipus == 'F' && ((Expr2Context)_localctx).e2.tipus == 'I') || (((Expr2Context)_localctx).e1.tipus == 'I' && ((Expr2Context)_localctx).e2.tipus == 'F')){
				            ((Expr2Context)_localctx).tipus =  'F';
				        }
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				((Expr2Context)_localctx).e1 = expr3();
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_IGUALTAT || _la==TK_DESIGUALTAT) {
					{
					{
					setState(358);
					_la = _input.LA(1);
					if ( !(_la==TK_IGUALTAT || _la==TK_DESIGUALTAT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(359);
					((Expr2Context)_localctx).e2 = expr3();
					}
					}
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				        if (((Expr2Context)_localctx).e2 == null) {
				            ((Expr2Context)_localctx).tipus =  ((Expr2Context)_localctx).e1.tipus;
				        } else if ((((Expr2Context)_localctx).e1.tipus == ((Expr2Context)_localctx).e2.tipus)) {
				            ((Expr2Context)_localctx).tipus =  ((Expr2Context)_localctx).e1.tipus;
				        } else if ((((Expr2Context)_localctx).e1.tipus == 'F' && ((Expr2Context)_localctx).e2.tipus == 'I') || (((Expr2Context)_localctx).e1.tipus == 'I' && ((Expr2Context)_localctx).e2.tipus == 'F')){
				            ((Expr2Context)_localctx).tipus =  'F';
				        } else {
				            notifyErrorListeners((((Expr2Context)_localctx).e1!=null?(((Expr2Context)_localctx).e1.start):null), "Not matching expresions for comparing", null);
				        }
				    
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
	public static class Expr3Context extends ParserRuleContext {
		public char tipus;
		public Expr4Context e1;
		public Expr4Context e2;
		public List<Expr4Context> expr4() {
			return getRuleContexts(Expr4Context.class);
		}
		public Expr4Context expr4(int i) {
			return getRuleContext(Expr4Context.class,i);
		}
		public List<TerminalNode> TK_SUMA() { return getTokens(provaParser.TK_SUMA); }
		public TerminalNode TK_SUMA(int i) {
			return getToken(provaParser.TK_SUMA, i);
		}
		public List<TerminalNode> TK_RESTA() { return getTokens(provaParser.TK_RESTA); }
		public TerminalNode TK_RESTA(int i) {
			return getToken(provaParser.TK_RESTA, i);
		}
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitExpr3(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			((Expr3Context)_localctx).e1 = expr4();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SUMA || _la==TK_RESTA) {
				{
				{
				setState(370);
				_la = _input.LA(1);
				if ( !(_la==TK_SUMA || _la==TK_RESTA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(371);
				((Expr3Context)_localctx).e2 = expr4();
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        if (((Expr3Context)_localctx).e2 == null) {
			            ((Expr3Context)_localctx).tipus =  ((Expr3Context)_localctx).e1.tipus;
			        } else if ((((Expr3Context)_localctx).e1.tipus == 'Z') || (((Expr3Context)_localctx).e2.tipus == 'Z')) {
			            notifyErrorListeners((((Expr3Context)_localctx).e1!=null?(((Expr3Context)_localctx).e1.start):null), "Expr can't be boolean", null);
			        } else if ((((Expr3Context)_localctx).e1.tipus == 'F') || (((Expr3Context)_localctx).e2.tipus == 'F') ){
			            ((Expr3Context)_localctx).tipus =  'F';
			        } else {
			            ((Expr3Context)_localctx).tipus =  'I';
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
	public static class Expr4Context extends ParserRuleContext {
		public char tipus;
		public Expr5Context e1;
		public Expr5Context e2;
		public List<Expr5Context> expr5() {
			return getRuleContexts(Expr5Context.class);
		}
		public Expr5Context expr5(int i) {
			return getRuleContext(Expr5Context.class,i);
		}
		public List<TerminalNode> TK_MULTIPLICACIO() { return getTokens(provaParser.TK_MULTIPLICACIO); }
		public TerminalNode TK_MULTIPLICACIO(int i) {
			return getToken(provaParser.TK_MULTIPLICACIO, i);
		}
		public List<TerminalNode> TK_DIVISIO() { return getTokens(provaParser.TK_DIVISIO); }
		public TerminalNode TK_DIVISIO(int i) {
			return getToken(provaParser.TK_DIVISIO, i);
		}
		public List<TerminalNode> TK_MODUL() { return getTokens(provaParser.TK_MODUL); }
		public TerminalNode TK_MODUL(int i) {
			return getToken(provaParser.TK_MODUL, i);
		}
		public Expr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterExpr4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitExpr4(this);
		}
	}

	public final Expr4Context expr4() throws RecognitionException {
		Expr4Context _localctx = new Expr4Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			((Expr4Context)_localctx).e1 = expr5();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 755914244096L) != 0)) {
				{
				{
				setState(380);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 755914244096L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(381);
				((Expr4Context)_localctx).e2 = expr5();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        if (((Expr4Context)_localctx).e2 == null) {
			            ((Expr4Context)_localctx).tipus =  ((Expr4Context)_localctx).e1.tipus;
			        } else if ((((Expr4Context)_localctx).e1.tipus == 'Z') || (((Expr4Context)_localctx).e2.tipus == 'Z')) {
			            notifyErrorListeners((((Expr4Context)_localctx).e1!=null?(((Expr4Context)_localctx).e1.start):null), "Expr can't be boolean", null);
			        } else if ((((Expr4Context)_localctx).e1.tipus == 'F') || (((Expr4Context)_localctx).e2.tipus == 'F') ){
			            ((Expr4Context)_localctx).tipus =  'F';
			        } else {
			            ((Expr4Context)_localctx).tipus =  'I';
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
	public static class Expr5Context extends ParserRuleContext {
		public char tipus;
		public ExprbaseContext exprbase;
		public ExprbaseContext exprbase() {
			return getRuleContext(ExprbaseContext.class,0);
		}
		public TerminalNode TK_NEGACIO() { return getToken(provaParser.TK_NEGACIO, 0); }
		public TerminalNode TK_MENYS_UNARI() { return getToken(provaParser.TK_MENYS_UNARI, 0); }
		public Expr5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterExpr5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitExpr5(this);
		}
	}

	public final Expr5Context expr5() throws RecognitionException {
		Expr5Context _localctx = new Expr5Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr5);
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LPAREN:
			case TK_ENTER:
			case TK_REAL:
			case TK_BOLEA:
			case TK_TIPUS_BASIC:
			case TK_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				((Expr5Context)_localctx).exprbase = exprbase();

				        ((Expr5Context)_localctx).tipus =  ((Expr5Context)_localctx).exprbase.tipus;
				    
				}
				break;
			case TK_NEGACIO:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(392);
				match(TK_NEGACIO);
				setState(393);
				((Expr5Context)_localctx).exprbase = exprbase();
				}

				        if (((Expr5Context)_localctx).exprbase.tipus != 'Z') {
				            notifyErrorListeners((((Expr5Context)_localctx).exprbase!=null?(((Expr5Context)_localctx).exprbase.start):null), "Expr must be boolean", null);
				        }
				    
				}
				break;
			case TK_MENYS_UNARI:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(397);
				match(TK_MENYS_UNARI);
				setState(398);
				((Expr5Context)_localctx).exprbase = exprbase();
				}

				        if (((Expr5Context)_localctx).exprbase.tipus != 'F' && ((Expr5Context)_localctx).exprbase.tipus != 'I') {
				            notifyErrorListeners((((Expr5Context)_localctx).exprbase!=null?(((Expr5Context)_localctx).exprbase.start):null), "Expr must be Int or Float", null);
				        }
				    
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
	public static class ExprbaseContext extends ParserRuleContext {
		public char tipus;
		public ExprContext expr;
		public TipusDefinitContext tipusDefinit() {
			return getRuleContext(TipusDefinitContext.class,0);
		}
		public TerminalNode TK_LPAREN() { return getToken(provaParser.TK_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(provaParser.TK_RPAREN, 0); }
		public CridaAccioFuncioContext cridaAccioFuncio() {
			return getRuleContext(CridaAccioFuncioContext.class,0);
		}
		public List<TerminalNode> TK_IDENT() { return getTokens(provaParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(provaParser.TK_IDENT, i);
		}
		public List<TerminalNode> TK_LCLAU() { return getTokens(provaParser.TK_LCLAU); }
		public TerminalNode TK_LCLAU(int i) {
			return getToken(provaParser.TK_LCLAU, i);
		}
		public List<Expr3Context> expr3() {
			return getRuleContexts(Expr3Context.class);
		}
		public Expr3Context expr3(int i) {
			return getRuleContext(Expr3Context.class,i);
		}
		public List<TerminalNode> TK_RCLAU() { return getTokens(provaParser.TK_RCLAU); }
		public TerminalNode TK_RCLAU(int i) {
			return getToken(provaParser.TK_RCLAU, i);
		}
		public TerminalNode TK_PUNT() { return getToken(provaParser.TK_PUNT, 0); }
		public TerminalNode TK_ENTER() { return getToken(provaParser.TK_ENTER, 0); }
		public TerminalNode TK_REAL() { return getToken(provaParser.TK_REAL, 0); }
		public TerminalNode TK_BOLEA() { return getToken(provaParser.TK_BOLEA, 0); }
		public ExprbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprbase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterExprbase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitExprbase(this);
		}
	}

	public final ExprbaseContext exprbase() throws RecognitionException {
		ExprbaseContext _localctx = new ExprbaseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_exprbase);
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				tipusDefinit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				match(TK_LPAREN);
				setState(406);
				((ExprbaseContext)_localctx).expr = expr();
				setState(407);
				match(TK_RPAREN);

				        ((ExprbaseContext)_localctx).tipus =  ((ExprbaseContext)_localctx).expr.tipus;
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
				cridaAccioFuncio();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(411);
				match(TK_IDENT);
				setState(412);
				match(TK_LCLAU);
				setState(413);
				expr3();
				setState(414);
				match(TK_RCLAU);
				setState(415);
				match(TK_LCLAU);
				setState(416);
				expr3();
				setState(417);
				match(TK_RCLAU);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(419);
				match(TK_IDENT);
				setState(420);
				match(TK_PUNT);
				setState(421);
				match(TK_IDENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(422);
				match(TK_ENTER);

				        ((ExprbaseContext)_localctx).tipus = 'I';
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(424);
				match(TK_REAL);

				        ((ExprbaseContext)_localctx).tipus = 'F';
				    
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(426);
				match(TK_BOLEA);

				        ((ExprbaseContext)_localctx).tipus = 'Z';
				    
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

	public static final String _serializedATN =
		"\u0004\u0001C\u01af\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0003\u00019\b\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001@\b\u0001\u0001\u0001\u0004\u0001C\b\u0001\u000b\u0001"+
		"\f\u0001D\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0004\u0002"+
		"K\b\u0002\u000b\u0002\f\u0002L\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003Y\b\u0003\n\u0003\f\u0003\\\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003d\b"+
		"\u0003\u000b\u0003\f\u0003e\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003k\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0004\u0005s\b\u0005\u000b\u0005\f\u0005t\u0001\u0005"+
		"\u0004\u0005x\b\u0005\u000b\u0005\f\u0005y\u0003\u0005|\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0082\b\u0006\u0001"+
		"\u0006\u0003\u0006\u0085\b\u0006\u0001\u0006\u0003\u0006\u0088\b\u0006"+
		"\u0001\u0006\u0005\u0006\u008b\b\u0006\n\u0006\f\u0006\u008e\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0097\b\u0007\u0001\u0007\u0003\u0007\u009a\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009f\b\u0007\u0001\u0007"+
		"\u0005\u0007\u00a2\b\u0007\n\u0007\f\u0007\u00a5\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u00af\b\b\n\b\f\b\u00b2\t\b\u0001\t\u0001\t\u0005\t\u00b6\b\t\n\t\f"+
		"\t\u00b9\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u00c0\b\n"+
		"\n\n\f\n\u00c3\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00ce\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d6\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00e2\b\u000e\n\u000e\f\u000e\u00e5\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00eb\b\u000e\n"+
		"\u000e\f\u000e\u00ee\t\u000e\u0005\u000e\u00f0\b\u000e\n\u000e\f\u000e"+
		"\u00f3\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00f7\b\u000e\n\u000e"+
		"\f\u000e\u00fa\t\u000e\u0003\u000e\u00fc\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u0107\b\u000f\n\u000f\f\u000f\u010a\t\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004"+
		"\u0010\u0112\b\u0010\u000b\u0010\f\u0010\u0113\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u011e\b\u0011\n\u0011\f\u0011\u0121\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u012b\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0134\b\u0012\n"+
		"\u0012\f\u0012\u0137\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u0142\b\u0012\n\u0012\f\u0012\u0145\t\u0012\u0003\u0012\u0147\b"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u014b\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0150\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u0155\b\u0014\n\u0014\f\u0014\u0158\t\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u015f\b\u0015"+
		"\n\u0015\f\u0015\u0162\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u0169\b\u0015\n\u0015\f\u0015\u016c\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0170\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u0175\b\u0016\n\u0016\f\u0016\u0178\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u017f"+
		"\b\u0017\n\u0017\f\u0017\u0182\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0193\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u01ad\b\u0019\u0001\u0019\u0000\u0000"+
		"\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02\u0000\u0005\u0001\u0000/1\u0001\u0000+."+
		"\u0001\u0000)*\u0001\u0000\"#\u0002\u0000$%\'\'\u01ce\u00004\u0001\u0000"+
		"\u0000\u0000\u00028\u0001\u0000\u0000\u0000\u0004H\u0001\u0000\u0000\u0000"+
		"\u0006j\u0001\u0000\u0000\u0000\bl\u0001\u0000\u0000\u0000\n{\u0001\u0000"+
		"\u0000\u0000\f}\u0001\u0000\u0000\u0000\u000e\u0092\u0001\u0000\u0000"+
		"\u0000\u0010\u00ab\u0001\u0000\u0000\u0000\u0012\u00b3\u0001\u0000\u0000"+
		"\u0000\u0014\u00bc\u0001\u0000\u0000\u0000\u0016\u00cd\u0001\u0000\u0000"+
		"\u0000\u0018\u00d5\u0001\u0000\u0000\u0000\u001a\u00d7\u0001\u0000\u0000"+
		"\u0000\u001c\u00dd\u0001\u0000\u0000\u0000\u001e\u0100\u0001\u0000\u0000"+
		"\u0000 \u010d\u0001\u0000\u0000\u0000\"\u0118\u0001\u0000\u0000\u0000"+
		"$\u014a\u0001\u0000\u0000\u0000&\u014c\u0001\u0000\u0000\u0000(\u0151"+
		"\u0001\u0000\u0000\u0000*\u016f\u0001\u0000\u0000\u0000,\u0171\u0001\u0000"+
		"\u0000\u0000.\u017b\u0001\u0000\u0000\u00000\u0192\u0001\u0000\u0000\u0000"+
		"2\u01ac\u0001\u0000\u0000\u000045\u0003\u0002\u0001\u000056\u0005\u0000"+
		"\u0000\u00016\u0001\u0001\u0000\u0000\u000079\u0003\u0004\u0002\u0000"+
		"87\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000"+
		"\u0000:<\u0003\n\u0005\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=?\u0005\t\u0000\u0000>@\u0003\u0012\t"+
		"\u0000?>\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000"+
		"\u0000\u0000AC\u0003\u0018\f\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FG\u0005\n\u0000\u0000G\u0003\u0001\u0000\u0000\u0000"+
		"HJ\u0005\f\u0000\u0000IK\u0003\u0006\u0003\u0000JI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NO\u0005\r\u0000\u0000O\u0005\u0001\u0000"+
		"\u0000\u0000PQ\u0005C\u0000\u0000QR\u0005\u000e\u0000\u0000RS\u0005\u000f"+
		"\u0000\u0000ST\u0005\u0015\u0000\u0000TU\u0005\u0012\u0000\u0000UZ\u0005"+
		"\u0012\u0000\u0000VW\u0005 \u0000\u0000WY\u0005\u0012\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000]k\u0005\b\u0000\u0000^_\u0005C\u0000\u0000_`\u0005\u000e\u0000"+
		"\u0000`a\u0005\u0010\u0000\u0000ac\u0005\u0006\u0000\u0000bd\u0003\b\u0004"+
		"\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0005"+
		"\u0007\u0000\u0000hi\u0005\u0011\u0000\u0000ik\u0001\u0000\u0000\u0000"+
		"jP\u0001\u0000\u0000\u0000j^\u0001\u0000\u0000\u0000k\u0007\u0001\u0000"+
		"\u0000\u0000lm\u0005C\u0000\u0000mn\u0005\u000e\u0000\u0000no\u0005\u0015"+
		"\u0000\u0000op\u0005\b\u0000\u0000p\t\u0001\u0000\u0000\u0000qs\u0003"+
		"\f\u0006\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u|\u0001\u0000\u0000\u0000"+
		"vx\u0003\u000e\u0007\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000"+
		"\u0000\u0000{r\u0001\u0000\u0000\u0000{w\u0001\u0000\u0000\u0000|\u000b"+
		"\u0001\u0000\u0000\u0000}~\u0005\u0016\u0000\u0000~\u0084\u0005C\u0000"+
		"\u0000\u007f\u0081\u0005\u0004\u0000\u0000\u0080\u0082\u0003\u0010\b\u0000"+
		"\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0005\u0005\u0000\u0000"+
		"\u0084\u007f\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0088\u0003\u0012\t\u0000\u0087"+
		"\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u008c\u0001\u0000\u0000\u0000\u0089\u008b\u0003\u0018\f\u0000\u008a\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005\u0017\u0000\u0000\u0090\u0091\u0006\u0006\uffff\uffff\u0000\u0091"+
		"\r\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0018\u0000\u0000\u0093\u0099"+
		"\u0005C\u0000\u0000\u0094\u0096\u0005\u0004\u0000\u0000\u0095\u0097\u0003"+
		"\u0010\b\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0005\u0005"+
		"\u0000\u0000\u0099\u0094\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u001a"+
		"\u0000\u0000\u009c\u009e\u0005\u0015\u0000\u0000\u009d\u009f\u0003\u0012"+
		"\t\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u00a3\u0001\u0000\u0000\u0000\u00a0\u00a2\u0003\u0018\f\u0000"+
		"\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0005\u001a\u0000\u0000\u00a7\u00a8\u0003(\u0014\u0000\u00a8"+
		"\u00a9\u0005\u0019\u0000\u0000\u00a9\u00aa\u0006\u0007\uffff\uffff\u0000"+
		"\u00aa\u000f\u0001\u0000\u0000\u0000\u00ab\u00b0\u0005\u001b\u0000\u0000"+
		"\u00ac\u00ad\u0005 \u0000\u0000\u00ad\u00af\u0005\u001b\u0000\u0000\u00ae"+
		"\u00ac\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1"+
		"\u0011\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b7\u0005\u001c\u0000\u0000\u00b4\u00b6\u0003\u0014\n\u0000\u00b5\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00ba"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0005\u001d\u0000\u0000\u00bb\u0013\u0001\u0000\u0000\u0000\u00bc\u00c1"+
		"\u0005C\u0000\u0000\u00bd\u00be\u0005 \u0000\u0000\u00be\u00c0\u0005C"+
		"\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0005\u000e\u0000\u0000\u00c5\u00c6\u0003\u0016"+
		"\u000b\u0000\u00c6\u00c7\u0005\b\u0000\u0000\u00c7\u00c8\u0006\n\uffff"+
		"\uffff\u0000\u00c8\u0015\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0015"+
		"\u0000\u0000\u00ca\u00ce\u0006\u000b\uffff\uffff\u0000\u00cb\u00cc\u0005"+
		"C\u0000\u0000\u00cc\u00ce\u0006\u000b\uffff\uffff\u0000\u00cd\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u0017\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d6\u0003\u001a\r\u0000\u00d0\u00d6\u0003\u001c"+
		"\u000e\u0000\u00d1\u00d6\u0003\u001e\u000f\u0000\u00d2\u00d6\u0003 \u0010"+
		"\u0000\u00d3\u00d6\u0003\"\u0011\u0000\u00d4\u00d6\u0003$\u0012\u0000"+
		"\u00d5\u00cf\u0001\u0000\u0000\u0000\u00d5\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d1\u0001\u0000\u0000\u0000\u00d5\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d6\u0019\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005C\u0000\u0000\u00d8"+
		"\u00d9\u00053\u0000\u0000\u00d9\u00da\u0003(\u0014\u0000\u00da\u00db\u0005"+
		"\b\u0000\u0000\u00db\u00dc\u0006\r\uffff\uffff\u0000\u00dc\u001b\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u00054\u0000\u0000\u00de\u00df\u0003(\u0014"+
		"\u0000\u00df\u00e3\u00055\u0000\u0000\u00e0\u00e2\u0003\u0018\f\u0000"+
		"\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e4\u00f1\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u00056\u0000\u0000\u00e7\u00e8\u0003(\u0014\u0000\u00e8\u00ec"+
		"\u00055\u0000\u0000\u00e9\u00eb\u0003\u0018\f\u0000\u00ea\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00e6\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00fb\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f8\u0005"+
		"6\u0000\u0000\u00f5\u00f7\u0003\u0018\f\u0000\u00f6\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00f4\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u00057\u0000\u0000\u00fe\u00ff\u0006\u000e\uffff"+
		"\uffff\u0000\u00ff\u001d\u0001\u0000\u0000\u0000\u0100\u0101\u0005:\u0000"+
		"\u0000\u0101\u0102\u0005C\u0000\u0000\u0102\u0103\u00058\u0000\u0000\u0103"+
		"\u0104\u0003&\u0013\u0000\u0104\u0108\u0005=\u0000\u0000\u0105\u0107\u0003"+
		"\u0018\f\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000"+
		"\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000"+
		"\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0005>\u0000\u0000\u010c\u001f\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0005?\u0000\u0000\u010e\u010f\u0003(\u0014\u0000\u010f"+
		"\u0111\u0005=\u0000\u0000\u0110\u0112\u0003\u0018\f\u0000\u0111\u0110"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0111"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0001\u0000\u0000\u0000\u0115\u0116\u0005@\u0000\u0000\u0116\u0117\u0006"+
		"\u0010\uffff\uffff\u0000\u0117!\u0001\u0000\u0000\u0000\u0118\u0119\u0005"+
		"C\u0000\u0000\u0119\u011a\u0005\u0004\u0000\u0000\u011a\u011f\u0003(\u0014"+
		"\u0000\u011b\u011c\u0005 \u0000\u0000\u011c\u011e\u0003(\u0014\u0000\u011d"+
		"\u011b\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f"+
		"\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120"+
		"\u0122\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0005\u0005\u0000\u0000\u0123\u0124\u0005\b\u0000\u0000\u0124#"+
		"\u0001\u0000\u0000\u0000\u0125\u0126\u0005A\u0000\u0000\u0126\u0127\u0005"+
		"\u0004\u0000\u0000\u0127\u012a\u0005C\u0000\u0000\u0128\u0129\u0005\u000e"+
		"\u0000\u0000\u0129\u012b\u0005\u0015\u0000\u0000\u012a\u0128\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000"+
		"\u0000\u0000\u012c\u012d\u0005\u0005\u0000\u0000\u012d\u014b\u0005\b\u0000"+
		"\u0000\u012e\u012f\u0005B\u0000\u0000\u012f\u0130\u0005\u0004\u0000\u0000"+
		"\u0130\u0135\u0003(\u0014\u0000\u0131\u0132\u0005 \u0000\u0000\u0132\u0134"+
		"\u0003(\u0014\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u0137\u0001"+
		"\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001"+
		"\u0000\u0000\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137\u0135\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0005\u0005\u0000\u0000\u0139\u013a\u0005"+
		"\b\u0000\u0000\u013a\u014b\u0001\u0000\u0000\u0000\u013b\u013c\u0005B"+
		"\u0000\u0000\u013c\u013d\u00059\u0000\u0000\u013d\u0146\u0005\u0004\u0000"+
		"\u0000\u013e\u0143\u0003(\u0014\u0000\u013f\u0140\u0005 \u0000\u0000\u0140"+
		"\u0142\u0003(\u0014\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u0145"+
		"\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143"+
		"\u0001\u0000\u0000\u0000\u0146\u013e\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0005\u0005\u0000\u0000\u0149\u014b\u0005\b\u0000\u0000\u014a\u0125\u0001"+
		"\u0000\u0000\u0000\u014a\u012e\u0001\u0000\u0000\u0000\u014a\u013b\u0001"+
		"\u0000\u0000\u0000\u014b%\u0001\u0000\u0000\u0000\u014c\u014f\u0005\u0012"+
		"\u0000\u0000\u014d\u014e\u0005 \u0000\u0000\u014e\u0150\u0005\u0012\u0000"+
		"\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000"+
		"\u0000\u0150\'\u0001\u0000\u0000\u0000\u0151\u0156\u0003*\u0015\u0000"+
		"\u0152\u0153\u0007\u0000\u0000\u0000\u0153\u0155\u0003*\u0015\u0000\u0154"+
		"\u0152\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000\u0000\u0156"+
		"\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157"+
		"\u0159\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0006\u0014\uffff\uffff\u0000\u015a)\u0001\u0000\u0000\u0000\u015b"+
		"\u0160\u0003,\u0016\u0000\u015c\u015d\u0007\u0001\u0000\u0000\u015d\u015f"+
		"\u0003,\u0016\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0162\u0001"+
		"\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001"+
		"\u0000\u0000\u0000\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0006\u0015\uffff\uffff\u0000\u0164\u0170"+
		"\u0001\u0000\u0000\u0000\u0165\u016a\u0003,\u0016\u0000\u0166\u0167\u0007"+
		"\u0002\u0000\u0000\u0167\u0169\u0003,\u0016\u0000\u0168\u0166\u0001\u0000"+
		"\u0000\u0000\u0169\u016c\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000"+
		"\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0001\u0000"+
		"\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d\u016e\u0006\u0015"+
		"\uffff\uffff\u0000\u016e\u0170\u0001\u0000\u0000\u0000\u016f\u015b\u0001"+
		"\u0000\u0000\u0000\u016f\u0165\u0001\u0000\u0000\u0000\u0170+\u0001\u0000"+
		"\u0000\u0000\u0171\u0176\u0003.\u0017\u0000\u0172\u0173\u0007\u0003\u0000"+
		"\u0000\u0173\u0175\u0003.\u0017\u0000\u0174\u0172\u0001\u0000\u0000\u0000"+
		"\u0175\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000"+
		"\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0179\u0001\u0000\u0000\u0000"+
		"\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u017a\u0006\u0016\uffff\uffff"+
		"\u0000\u017a-\u0001\u0000\u0000\u0000\u017b\u0180\u00030\u0018\u0000\u017c"+
		"\u017d\u0007\u0004\u0000\u0000\u017d\u017f\u00030\u0018\u0000\u017e\u017c"+
		"\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000\u0000\u0000\u0180\u017e"+
		"\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0183"+
		"\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183\u0184"+
		"\u0006\u0017\uffff\uffff\u0000\u0184/\u0001\u0000\u0000\u0000\u0185\u0186"+
		"\u00032\u0019\u0000\u0186\u0187\u0006\u0018\uffff\uffff\u0000\u0187\u0193"+
		"\u0001\u0000\u0000\u0000\u0188\u0189\u0005/\u0000\u0000\u0189\u018a\u0003"+
		"2\u0019\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018c\u0006\u0018"+
		"\uffff\uffff\u0000\u018c\u0193\u0001\u0000\u0000\u0000\u018d\u018e\u0005"+
		"(\u0000\u0000\u018e\u018f\u00032\u0019\u0000\u018f\u0190\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u0006\u0018\uffff\uffff\u0000\u0191\u0193\u0001\u0000"+
		"\u0000\u0000\u0192\u0185\u0001\u0000\u0000\u0000\u0192\u0188\u0001\u0000"+
		"\u0000\u0000\u0192\u018d\u0001\u0000\u0000\u0000\u01931\u0001\u0000\u0000"+
		"\u0000\u0194\u01ad\u0003\u0016\u000b\u0000\u0195\u0196\u0005\u0004\u0000"+
		"\u0000\u0196\u0197\u0003(\u0014\u0000\u0197\u0198\u0005\u0005\u0000\u0000"+
		"\u0198\u0199\u0006\u0019\uffff\uffff\u0000\u0199\u01ad\u0001\u0000\u0000"+
		"\u0000\u019a\u01ad\u0003\"\u0011\u0000\u019b\u019c\u0005C\u0000\u0000"+
		"\u019c\u019d\u0005\u0002\u0000\u0000\u019d\u019e\u0003,\u0016\u0000\u019e"+
		"\u019f\u0005\u0003\u0000\u0000\u019f\u01a0\u0005\u0002\u0000\u0000\u01a0"+
		"\u01a1\u0003,\u0016\u0000\u01a1\u01a2\u0005\u0003\u0000\u0000\u01a2\u01ad"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005C\u0000\u0000\u01a4\u01a5\u0005"+
		"!\u0000\u0000\u01a5\u01ad\u0005C\u0000\u0000\u01a6\u01a7\u0005\u0012\u0000"+
		"\u0000\u01a7\u01ad\u0006\u0019\uffff\uffff\u0000\u01a8\u01a9\u0005\u0013"+
		"\u0000\u0000\u01a9\u01ad\u0006\u0019\uffff\uffff\u0000\u01aa\u01ab\u0005"+
		"\u0014\u0000\u0000\u01ab\u01ad\u0006\u0019\uffff\uffff\u0000\u01ac\u0194"+
		"\u0001\u0000\u0000\u0000\u01ac\u0195\u0001\u0000\u0000\u0000\u01ac\u019a"+
		"\u0001\u0000\u0000\u0000\u01ac\u019b\u0001\u0000\u0000\u0000\u01ac\u01a3"+
		"\u0001\u0000\u0000\u0000\u01ac\u01a6\u0001\u0000\u0000\u0000\u01ac\u01a8"+
		"\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad3\u0001"+
		"\u0000\u0000\u0000.8;?DLZejty{\u0081\u0084\u0087\u008c\u0096\u0099\u009e"+
		"\u00a3\u00b0\u00b7\u00c1\u00cd\u00d5\u00e3\u00ec\u00f1\u00f8\u00fb\u0108"+
		"\u0113\u011f\u012a\u0135\u0143\u0146\u014a\u014f\u0156\u0160\u016a\u016f"+
		"\u0176\u0180\u0192\u01ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}