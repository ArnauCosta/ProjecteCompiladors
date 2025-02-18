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
	    Bytecode x;
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

		//    x=new Bytecode("compilat");
		//    saltLinia=x.addConstant("S","\n");
		//    Vector<Long> trad = new Vector<Long>(10);

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
		public SentenciaContext cc;
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

		    x=new Bytecode("compilat");
		    saltLinia=x.addConstant("S","\n");
		    Vector<Long> trad = new Vector<Long>(10);

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

			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				((EstructuraGeneralContext)_localctx).cc = sentencia();
				trad.addAll(((EstructuraGeneralContext)_localctx).cc.trad);
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 59457L) != 0) );
			setState(72);
			match(TK_PC_FPROGRAMA);
			    if (!errorsem) {
			             trad.add(x.RETURN);
			             x.addMainCode(10L,10L,trad);
			             x.write();
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
	public static class TipusDeclContext extends ParserRuleContext {
		public Vector<Long> trad;
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

			((TipusDeclContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(TK_TIPUS);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				novaDefinicio();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TK_IDENT );
			setState(81);
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
		public Vector<Long> trad;
		public NovaDefinicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_novaDefinicio; }
	 
		public NovaDefinicioContext() { }
		public void copyFrom(NovaDefinicioContext ctx) {
			super.copyFrom(ctx);
			this.trad = ctx.trad;
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

			((NovaDefinicioContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new DefinicioVectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(TK_IDENT);
				setState(84);
				match(TK_PUNTS);
				setState(85);
				match(TK_VECTOR);
				setState(86);
				match(TK_TIPUS_BASIC);
				setState(87);
				match(TK_ENTER);
				setState(88);
				match(TK_ENTER);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(89);
					match(TK_COMA);
					setState(90);
					match(TK_ENTER);
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(96);
				match(TK_SEMI);
				}
				break;
			case 2:
				_localctx = new DefinicioTuplaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(TK_IDENT);
				setState(98);
				match(TK_PUNTS);
				setState(99);
				match(TK_TUPLA);
				setState(100);
				match(TK_LBRACKET);
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(101);
					campTupla();
					}
					}
					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_IDENT );
				setState(106);
				match(TK_RBRACKET);
				setState(107);
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
		public Vector<Long> trad;
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

			((CampTuplaContext)_localctx).trad = new Vector<Long>(100);
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(TK_IDENT);
			setState(112);
			match(TK_PUNTS);
			setState(113);
			match(TK_TIPUS_BASIC);
			setState(114);
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
		public Vector<Long> trad;
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

			((AccioFuncioDeclContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ACCIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(116);
					accioDecl();
					}
					}
					setState(119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_ACCIO );
				}
				break;
			case TK_FUNCIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(121);
					funcioDecl();
					}
					}
					setState(124); 
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
		public Vector<Long> trad;
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

			((AccioDeclContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(TK_ACCIO);
			setState(129);
			((AccioDeclContext)_localctx).id = match(TK_IDENT);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LPAREN) {
				{
				setState(130);
				match(TK_LPAREN);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PARAM) {
					{
					setState(131);
					parametresFormals();
					}
				}

				setState(134);
				match(TK_RPAREN);
				}
			}

			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_VARIABLES) {
				{
				setState(137);
				blocVariables();
				}
			}

			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 59457L) != 0)) {
				{
				{
				setState(140);
				sentencia();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
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
		public Vector<Long> trad;
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

			((FuncioDeclContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(TK_FUNCIO);
			setState(150);
			((FuncioDeclContext)_localctx).id = match(TK_IDENT);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_LPAREN) {
				{
				setState(151);
				match(TK_LPAREN);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PARAM) {
					{
					setState(152);
					parametresFormals();
					}
				}

				setState(155);
				match(TK_RPAREN);
				}
			}

			setState(158);
			match(TK_RETORNA);
			setState(159);
			((FuncioDeclContext)_localctx).TK_TIPUS_BASIC = match(TK_TIPUS_BASIC);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_VARIABLES) {
				{
				setState(160);
				blocVariables();
				}
			}

			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 59457L) != 0)) {
				{
				{
				setState(163);
				sentencia();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(TK_RETORNA);
			setState(170);
			expr();
			setState(171);
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
		public Vector<Long> trad;
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

			((ParametresFormalsContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(TK_PARAM);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(175);
				match(TK_COMA);
				setState(176);
				match(TK_PARAM);
				}
				}
				setState(181);
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
		public Vector<Long> trad;
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

			((BlocVariablesContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(TK_VARIABLES);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_IDENT) {
				{
				{
				setState(183);
				declaracioVariable();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
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
		public Vector<Long> trad;
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

			((DeclaracioVariableContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			((DeclaracioVariableContext)_localctx).id1 = match(TK_IDENT);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(192);
				match(TK_COMA);
				setState(193);
				((DeclaracioVariableContext)_localctx).TK_IDENT = match(TK_IDENT);
				((DeclaracioVariableContext)_localctx).id2.add(((DeclaracioVariableContext)_localctx).TK_IDENT);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(TK_PUNTS);
			setState(200);
			((DeclaracioVariableContext)_localctx).tipusDefinit = tipusDefinit();
			setState(201);
			match(TK_SEMI);

			        // Comprovem si la variable ja ha estat declarada
			        if (TS.existeix((((DeclaracioVariableContext)_localctx).id1!=null?((DeclaracioVariableContext)_localctx).id1.getText():null))) {
			            notifyErrorListeners(((DeclaracioVariableContext)_localctx).id1, "Error: Variable ja declarada.", null);
			        } else {
			            TS.inserir((((DeclaracioVariableContext)_localctx).id1!=null?((DeclaracioVariableContext)_localctx).id1.getText():null), new Registre("variable", ((DeclaracioVariableContext)_localctx).tipusDefinit.tipus, contadorVariables++));
			        }

			        // Recorrem totes les variables separades per coma
			        for (Token identificador : ((DeclaracioVariableContext)_localctx).id2) {
			            System.out.println("Identificadors: " + identificador.getText());
			            if (TS.existeix(identificador.getText())) {
			                notifyErrorListeners(identificador, "Error: Variable '" + identificador.getText() + "' ja declarada.", null);
			            } else {
			                TS.inserir(identificador.getText(), new Registre("variable", ((DeclaracioVariableContext)_localctx).tipusDefinit.tipus, contadorVariables++));
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
		public Vector<Long> trad;
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

			((TipusDefinitContext)_localctx).trad = new Vector<Long>(100);
		    
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_TIPUS_BASIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
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
				setState(206);
				((TipusDefinitContext)_localctx).TK_IDENT = match(TK_IDENT);

				        if (!TS.existeix((((TipusDefinitContext)_localctx).TK_IDENT!=null?((TipusDefinitContext)_localctx).TK_IDENT.getText():null))) {
				            System.out.println("No existeix: " + (((TipusDefinitContext)_localctx).TK_IDENT!=null?((TipusDefinitContext)_localctx).TK_IDENT.getText():null));
				            notifyErrorListeners(((TipusDefinitContext)_localctx).TK_IDENT, "Error: Variable '" + (((TipusDefinitContext)_localctx).TK_IDENT!=null?((TipusDefinitContext)_localctx).TK_IDENT.getText():null) + "' no declarada.", null);
				        } else {
				            Registre r=(Registre)TS.obtenir((((TipusDefinitContext)_localctx).TK_IDENT!=null?((TipusDefinitContext)_localctx).TK_IDENT.getText():null));
				            _localctx.trad.add(x.ILOAD);
				            _localctx.trad.add(new Long(r.getAdreca()));
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
		public Vector<Long> trad;
		public AssignacioContext assignacio;
		public CondicionalContext condicional;
		public BuclePerContext buclePer;
		public BucleMentContext bucleMent;
		public CridaAccioFuncioContext cridaAccioFuncio;
		public OperacioLecturaEscrituraContext operacioLecturaEscritura;
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

			((SentenciaContext)_localctx).trad = new Vector<Long>(100);
		    
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				((SentenciaContext)_localctx).assignacio = assignacio();

				        ((SentenciaContext)_localctx).trad =  ((SentenciaContext)_localctx).assignacio.trad;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				((SentenciaContext)_localctx).condicional = condicional();

				        ((SentenciaContext)_localctx).trad =  ((SentenciaContext)_localctx).condicional.trad;
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				((SentenciaContext)_localctx).buclePer = buclePer();

				        ((SentenciaContext)_localctx).trad =  ((SentenciaContext)_localctx).buclePer.trad;
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				((SentenciaContext)_localctx).bucleMent = bucleMent();

				        ((SentenciaContext)_localctx).trad =  ((SentenciaContext)_localctx).bucleMent.trad;
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				((SentenciaContext)_localctx).cridaAccioFuncio = cridaAccioFuncio();

				       ((SentenciaContext)_localctx).trad =  ((SentenciaContext)_localctx).cridaAccioFuncio.trad;
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				((SentenciaContext)_localctx).operacioLecturaEscritura = operacioLecturaEscritura();

				        ((SentenciaContext)_localctx).trad =  ((SentenciaContext)_localctx).operacioLecturaEscritura.trad;
				    
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
		public Vector<Long> trad;
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

			((AssignacioContext)_localctx).trad = new Vector<Long>(100);
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			((AssignacioContext)_localctx).TK_IDENT = match(TK_IDENT);
			setState(231);
			match(TK_ASSIGNACIO);
			setState(232);
			((AssignacioContext)_localctx).expr = expr();
			setState(233);
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
			            } else if (((AssignacioContext)_localctx).expr.tipus == 'F'){
			                ((AssignacioContext)_localctx).trad = ((AssignacioContext)_localctx).expr.trad;
			                _localctx.trad.add(x.FSTORE);
			                _localctx.trad.add(new Long(r.getAdreca()));
			            } else if (((AssignacioContext)_localctx).expr.tipus == 'I' | ((AssignacioContext)_localctx).expr.tipus == 'Z'){
			                ((AssignacioContext)_localctx).trad = ((AssignacioContext)_localctx).expr.trad;
			                _localctx.trad.add(x.ISTORE);
			                _localctx.trad.add(new Long(r.getAdreca()));
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
		public Vector<Long> trad;
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

			((CondicionalContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(TK_SI);
			setState(237);
			((CondicionalContext)_localctx).e1 = expr();
			setState(238);
			match(TK_LLAVORS);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 59457L) != 0)) {
				{
				{
				setState(239);
				sentencia();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245);
					match(TK_ALTRAMENT);
					setState(246);
					((CondicionalContext)_localctx).expr = expr();
					((CondicionalContext)_localctx).e2.add(((CondicionalContext)_localctx).expr);
					setState(247);
					match(TK_LLAVORS);
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 59457L) != 0)) {
						{
						{
						setState(248);
						sentencia();
						}
						}
						setState(253);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_ALTRAMENT) {
				{
				setState(259);
				match(TK_ALTRAMENT);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 59457L) != 0)) {
					{
					{
					setState(260);
					sentencia();
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(268);
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
		public Vector<Long> trad;
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

			((BuclePerContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(TK_PER);
			setState(272);
			match(TK_IDENT);
			setState(273);
			match(TK_EN);
			setState(274);
			((BuclePerContext)_localctx).r = rang();
			setState(275);
			match(TK_FER);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 59457L) != 0)) {
				{
				{
				setState(276);
				sentencia();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
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
		public Vector<Long> trad;
		public ExprContext ee;
		public ExprContext expr;
		public SentenciaContext cc;
		public TerminalNode TK_MENTRE() { return getToken(provaParser.TK_MENTRE, 0); }
		public TerminalNode TK_FER() { return getToken(provaParser.TK_FER, 0); }
		public TerminalNode TK_FMENTRE() { return getToken(provaParser.TK_FMENTRE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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

			((BucleMentContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(TK_MENTRE);
			setState(285);
			((BucleMentContext)_localctx).ee = ((BucleMentContext)_localctx).expr = expr();
			Vector<Long> trad2 = new Vector<Long>(100);
			setState(287);
			match(TK_FER);
			setState(291); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(288);
				((BucleMentContext)_localctx).cc = sentencia();
				trad2.addAll(((BucleMentContext)_localctx).cc.trad);
				}
				}
				setState(293); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 59457L) != 0) );
			setState(295);
			match(TK_FMENTRE);

			        if (((BucleMentContext)_localctx).expr.tipus != 'Z'){
			            notifyErrorListeners((((BucleMentContext)_localctx).expr!=null?(((BucleMentContext)_localctx).expr.start):null), "Expr not boolean", null);
			        } else {
			            ((BucleMentContext)_localctx).trad = ((BucleMentContext)_localctx).ee.trad;
			            _localctx.trad.add(x.IFEQ); // TODO revisar per que estava en IFNE
			            Long salt=trad2.size()+6L;
			            _localctx.trad.add(x.nByte(salt,2));
			            _localctx.trad.add(x.nByte(salt,1));
			            _localctx.trad.addAll(trad2);
			            salt=0L-_localctx.trad.size();
			            _localctx.trad.add(x.GOTO);
			            _localctx.trad.add(x.nByte(salt,2));
			            _localctx.trad.add(x.nByte(salt,1));
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
		public Vector<Long> trad;
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

			((CridaAccioFuncioContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(TK_IDENT);
			setState(299);
			match(TK_LPAREN);
			setState(300);
			expr();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(301);
				match(TK_COMA);
				setState(302);
				expr();
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			match(TK_RPAREN);
			setState(309);
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
		public Vector<Long> trad;
		public char tipus;
		public Token TK_IDENT;
		public ExprContext e1;
		public ExprContext e2;
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

			((OperacioLecturaEscrituraContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(TK_LLEGIR);
				setState(312);
				match(TK_LPAREN);
				setState(313);
				((OperacioLecturaEscrituraContext)_localctx).TK_IDENT = match(TK_IDENT);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTS) {
					{
					setState(314);
					match(TK_PUNTS);
					setState(315);
					match(TK_TIPUS_BASIC);
					}
				}

				setState(318);
				match(TK_RPAREN);
				setState(319);
				match(TK_SEMI);

				          if (!TS.existeix((((OperacioLecturaEscrituraContext)_localctx).TK_IDENT!=null?((OperacioLecturaEscrituraContext)_localctx).TK_IDENT.getText():null))) {
				              System.out.println("No existeix: " + (((OperacioLecturaEscrituraContext)_localctx).TK_IDENT!=null?((OperacioLecturaEscrituraContext)_localctx).TK_IDENT.getText():null));
				              notifyErrorListeners(((OperacioLecturaEscrituraContext)_localctx).TK_IDENT, "Error: Variable '" + (((OperacioLecturaEscrituraContext)_localctx).TK_IDENT!=null?((OperacioLecturaEscrituraContext)_localctx).TK_IDENT.getText():null) + "' no declarada.", null);
				          } else {
				              Registre r=(Registre)TS.obtenir((((OperacioLecturaEscrituraContext)_localctx).TK_IDENT!=null?((OperacioLecturaEscrituraContext)_localctx).TK_IDENT.getText():null));
				              switch(r.getTipus()){
				                    case 'F':
				                        _localctx.trad.add(x.INVOKESTATIC);
				                        _localctx.trad.add(x.nByte(x.mGetFloat,2));
				                        _localctx.trad.add(x.nByte(x.mGetFloat,1));
				                        ((OperacioLecturaEscrituraContext)_localctx).tipus =  'F';
				                        break;

				                    case 'I':
				                        _localctx.trad.add(x.INVOKESTATIC);
				                        _localctx.trad.add(x.nByte(x.mGetInt,2));
				                        _localctx.trad.add(x.nByte(x.mGetInt,1));
				                        ((OperacioLecturaEscrituraContext)_localctx).tipus =  'I';
				                        break;

				                    case 'Z':
				                        _localctx.trad.add(x.INVOKESTATIC);
				                        _localctx.trad.add(x.nByte(x.mGetBoolean,2));
				                        _localctx.trad.add(x.nByte(x.mGetBoolean,1));
				                        ((OperacioLecturaEscrituraContext)_localctx).tipus =  'Z';
				                        break;
				              }
				          }

				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(TK_ESCRIURE);
				setState(322);
				match(TK_LPAREN);
				setState(323);
				((OperacioLecturaEscrituraContext)_localctx).e1 = expr();

				        ((OperacioLecturaEscrituraContext)_localctx).trad = ((OperacioLecturaEscrituraContext)_localctx).e1.trad;
				        _localctx.trad.add(x.INVOKESTATIC);
				        switch(((OperacioLecturaEscrituraContext)_localctx).e1.tipus){
				            case 'F':
				                _localctx.trad.add(x.nByte(x.mPutFloat,2));
				                _localctx.trad.add(x.nByte(x.mPutFloat,1));
				                _localctx.trad.add(x.LDC_W);
				                _localctx.trad.add(x.nByte(saltLinia,2));
				                _localctx.trad.add(x.nByte(saltLinia,1));
				                _localctx.trad.add(x.INVOKESTATIC);
				                _localctx.trad.add(x.nByte(x.mPutString,2));
				                _localctx.trad.add(x.nByte(x.mPutString,1));
				                break;

				            case 'I':
				                _localctx.trad.add(x.nByte(x.mPutInt,2));
				                _localctx.trad.add(x.nByte(x.mPutInt,1));
				                _localctx.trad.add(x.LDC_W);
				                _localctx.trad.add(x.nByte(saltLinia,2));
				                _localctx.trad.add(x.nByte(saltLinia,1));
				                _localctx.trad.add(x.INVOKESTATIC);
				                _localctx.trad.add(x.nByte(x.mPutString,2));
				                _localctx.trad.add(x.nByte(x.mPutString,1));
				                break;

				            case 'Z':
				                _localctx.trad.add(x.nByte(x.mPutBoolean,2));
				                _localctx.trad.add(x.nByte(x.mPutBoolean,1));
				                _localctx.trad.add(x.LDC_W);
				                _localctx.trad.add(x.nByte(saltLinia,2));
				                _localctx.trad.add(x.nByte(saltLinia,1));
				                _localctx.trad.add(x.INVOKESTATIC);
				                _localctx.trad.add(x.nByte(x.mPutString,2));
				                _localctx.trad.add(x.nByte(x.mPutString,1));
				                break;

				       }
				    
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(325);
					match(TK_COMA);
					setState(326);
					((OperacioLecturaEscrituraContext)_localctx).e2 = expr();

					        //((OperacioLecturaEscrituraContext)_localctx).trad = ((OperacioLecturaEscrituraContext)_localctx).e2.trad;
					        _localctx.trad.addAll(((OperacioLecturaEscrituraContext)_localctx).e2.trad);
					        _localctx.trad.add(x.INVOKESTATIC);
					        switch(((OperacioLecturaEscrituraContext)_localctx).e2.tipus){
					             case 'F':
					                 _localctx.trad.add(x.nByte(x.mPutFloat,2));
					                 _localctx.trad.add(x.nByte(x.mPutFloat,1));
					                 _localctx.trad.add(x.LDC_W);
					                 _localctx.trad.add(x.nByte(saltLinia,2));
					                 _localctx.trad.add(x.nByte(saltLinia,1));
					                 _localctx.trad.add(x.INVOKESTATIC);
					                 _localctx.trad.add(x.nByte(x.mPutString,2));
					                 _localctx.trad.add(x.nByte(x.mPutString,1));
					                 break;

					             case 'I':
					                 _localctx.trad.add(x.nByte(x.mPutInt,2));
					                 _localctx.trad.add(x.nByte(x.mPutInt,1));
					                 _localctx.trad.add(x.LDC_W);
					                 _localctx.trad.add(x.nByte(saltLinia,2));
					                 _localctx.trad.add(x.nByte(saltLinia,1));
					                 _localctx.trad.add(x.INVOKESTATIC);
					                 _localctx.trad.add(x.nByte(x.mPutString,2));
					                 _localctx.trad.add(x.nByte(x.mPutString,1));
					                 break;

					             case 'Z':
					                 _localctx.trad.add(x.nByte(x.mPutBoolean,2));
					                 _localctx.trad.add(x.nByte(x.mPutBoolean,1));
					                 _localctx.trad.add(x.LDC_W);
					                 _localctx.trad.add(x.nByte(saltLinia,2));
					                 _localctx.trad.add(x.nByte(saltLinia,1));
					                 _localctx.trad.add(x.INVOKESTATIC);
					                 _localctx.trad.add(x.nByte(x.mPutString,2));
					                 _localctx.trad.add(x.nByte(x.mPutString,1));
					                 break;

					        }
					    
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(334);
				match(TK_RPAREN);
				setState(335);
				match(TK_SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				match(TK_ESCRIURE);
				setState(338);
				match(TK_LN);
				setState(339);
				match(TK_LPAREN);
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & -9223363172042162175L) != 0)) {
					{
					setState(340);
					expr();
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMA) {
						{
						{
						setState(341);
						match(TK_COMA);
						setState(342);
						expr();
						}
						}
						setState(347);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(350);
				match(TK_RPAREN);
				setState(351);
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
		public Vector<Long> trad;
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

			((RangContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(TK_ENTER);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COMA) {
				{
				setState(355);
				match(TK_COMA);
				setState(356);
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
		public Vector<Long> trad;
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
		public TerminalNode TK_NEGACIO() { return getToken(provaParser.TK_NEGACIO, 0); }
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

			((ExprContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				((ExprContext)_localctx).e1 = expr2();

				        if (((ExprContext)_localctx).e2 == null) {
				            ((ExprContext)_localctx).tipus =  ((ExprContext)_localctx).e1.tipus;
				            ((ExprContext)_localctx).trad =  ((ExprContext)_localctx).e1.trad;
				        }
				    
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_AND || _la==TK_OR) {
					{
					setState(369);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TK_AND:
						{
						setState(361);
						match(TK_AND);
						setState(362);
						((ExprContext)_localctx).e2 = expr2();

						        if (((ExprContext)_localctx).e2 == null) {
						            ((ExprContext)_localctx).tipus =  ((ExprContext)_localctx).e1.tipus;
						            ((ExprContext)_localctx).trad =  ((ExprContext)_localctx).e1.trad;
						        } else if ((((ExprContext)_localctx).e1.tipus != 'Z')) {
						            notifyErrorListeners((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null), "Expr not boolean", null);
						        } else if (((ExprContext)_localctx).e2.tipus != 'Z'){
						            notifyErrorListeners((((ExprContext)_localctx).e2!=null?(((ExprContext)_localctx).e2.start):null), "Expr not boolean", null);
						        } else {
						            ((ExprContext)_localctx).trad = ((ExprContext)_localctx).e1.trad;
						            _localctx.trad.addAll(((ExprContext)_localctx).e2.trad);
						            _localctx.trad.add(x.IAND);
						            ((ExprContext)_localctx).tipus =  'Z';
						        }
						    
						}
						break;
					case TK_OR:
						{
						setState(365);
						match(TK_OR);
						setState(366);
						((ExprContext)_localctx).e2 = expr2();

						        if (((ExprContext)_localctx).e2 == null) {
						            ((ExprContext)_localctx).tipus =  ((ExprContext)_localctx).e1.tipus;
						            ((ExprContext)_localctx).trad =  ((ExprContext)_localctx).e1.trad;
						        } else if ((((ExprContext)_localctx).e1.tipus != 'Z')) {
						            notifyErrorListeners((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null), "Expr not boolean", null);
						        } else if (((ExprContext)_localctx).e2.tipus != 'Z'){
						            notifyErrorListeners((((ExprContext)_localctx).e2!=null?(((ExprContext)_localctx).e2.start):null), "Expr not boolean", null);
						        } else {
						            ((ExprContext)_localctx).trad = ((ExprContext)_localctx).e1.trad;
						            _localctx.trad.addAll(((ExprContext)_localctx).e2.trad);
						            _localctx.trad.add(x.IOR);
						            ((ExprContext)_localctx).tipus =  'Z';
						        }
						    
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(TK_NEGACIO);
				setState(375);
				((ExprContext)_localctx).e1 = expr2();

				        if (((ExprContext)_localctx).e1 == null) {
				            ((ExprContext)_localctx).tipus =  ((ExprContext)_localctx).e1.tipus;
				            ((ExprContext)_localctx).trad =  ((ExprContext)_localctx).e1.trad;
				        } else if ((((ExprContext)_localctx).e1.tipus != 'Z')) {
				            notifyErrorListeners((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null), "Expr not boolean", null);
				        } else {
				            ((ExprContext)_localctx).trad = ((ExprContext)_localctx).e1.trad;
				                _localctx.trad.add(x.IFEQ);
				                Long salt=8L;
				                _localctx.trad.add(x.nByte(salt,2));
				                _localctx.trad.add(x.nByte(salt,1));
				                _localctx.trad.add(x.BIPUSH);
				                _localctx.trad.add(0L);
				                _localctx.trad.add(x.GOTO);
				                salt=5L;
				                _localctx.trad.add(x.nByte(salt,2));
				                _localctx.trad.add(x.nByte(salt,1));
				                _localctx.trad.add(x.BIPUSH);
				                _localctx.trad.add(1L);
				                ((ExprContext)_localctx).tipus = 'Z';
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
	public static class Expr2Context extends ParserRuleContext {
		public Vector<Long> trad;
		public char tipus;
		public Expr3Context e1;
		public Expr3Context e2;
		public List<Expr3Context> expr3() {
			return getRuleContexts(Expr3Context.class);
		}
		public Expr3Context expr3(int i) {
			return getRuleContext(Expr3Context.class,i);
		}
		public TerminalNode TK_MES_GRAN() { return getToken(provaParser.TK_MES_GRAN, 0); }
		public TerminalNode TK_MES_GRAN_IG() { return getToken(provaParser.TK_MES_GRAN_IG, 0); }
		public TerminalNode TK_MES_PETIT() { return getToken(provaParser.TK_MES_PETIT, 0); }
		public TerminalNode TK_MES_PETIT_IG() { return getToken(provaParser.TK_MES_PETIT_IG, 0); }
		public TerminalNode TK_IGUALTAT() { return getToken(provaParser.TK_IGUALTAT, 0); }
		public TerminalNode TK_DESIGUALTAT() { return getToken(provaParser.TK_DESIGUALTAT, 0); }
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

			((Expr2Context)_localctx).trad = new Vector<Long>(100);
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			((Expr2Context)_localctx).e1 = expr3();

			        if (((Expr2Context)_localctx).e2 == null) {
			            ((Expr2Context)_localctx).tipus =  ((Expr2Context)_localctx).e1.tipus;
			            ((Expr2Context)_localctx).trad =  ((Expr2Context)_localctx).e1.trad;
			        }
			        Integer opcio = 0;
			    
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_MES_GRAN:
				{
				setState(382);
				match(TK_MES_GRAN);
				setState(383);
				((Expr2Context)_localctx).e2 = expr3();

				        opcio = 1;
				    
				}
				break;
			case TK_MES_GRAN_IG:
				{
				setState(386);
				match(TK_MES_GRAN_IG);
				setState(387);
				((Expr2Context)_localctx).e2 = expr3();

				        opcio = 2;
				    
				}
				break;
			case TK_MES_PETIT:
				{
				setState(390);
				match(TK_MES_PETIT);
				setState(391);
				((Expr2Context)_localctx).e2 = expr3();

				        opcio = 3;
				    
				}
				break;
			case TK_MES_PETIT_IG:
				{
				setState(394);
				match(TK_MES_PETIT_IG);
				setState(395);
				((Expr2Context)_localctx).e2 = expr3();

				        opcio = 4;
				    
				}
				break;
			case TK_IGUALTAT:
				{
				setState(398);
				match(TK_IGUALTAT);
				setState(399);
				((Expr2Context)_localctx).e2 = expr3();

				        opcio = 5;
				    
				}
				break;
			case TK_DESIGUALTAT:
				{
				setState(402);
				match(TK_DESIGUALTAT);
				setState(403);
				((Expr2Context)_localctx).e2 = expr3();

				        opcio = 6;
				    
				}
				break;
			case TK_RPAREN:
			case TK_SEMI:
			case TK_FFUNCIO:
			case TK_COMA:
			case TK_AND:
			case TK_OR:
			case TK_LLAVORS:
			case TK_FER:
				break;
			default:
				break;
			}

			        ((Expr2Context)_localctx).trad =  ((Expr2Context)_localctx).e1.trad;
			        if (((Expr2Context)_localctx).e2 == null) {
			            ((Expr2Context)_localctx).tipus =  ((Expr2Context)_localctx).e1.tipus;
			        } else if ((((Expr2Context)_localctx).e1.tipus == ((Expr2Context)_localctx).e2.tipus) || ((((Expr2Context)_localctx).e1.tipus == 'F' && ((Expr2Context)_localctx).e2.tipus == 'I') || (((Expr2Context)_localctx).e1.tipus == 'I' && ((Expr2Context)_localctx).e2.tipus == 'F'))) {
			            if(((Expr2Context)_localctx).e1.tipus == 'F'){
			                _localctx.trad.add(x.F2I);
			            }
			            _localctx.trad.addAll(((Expr2Context)_localctx).e2.trad);
			            if (((Expr2Context)_localctx).e2.tipus == 'F') {
			                _localctx.trad.add(x.F2I);
			            }

			            switch (opcio){
			                case 1:
			                    _localctx.trad.add(x.IF_ICMPGT); // Mes gran
			                    break;
			                case 2:
			                    _localctx.trad.add(x.IF_ICMPGE); // Mes gran igual
			                    break;
			                case 3:
			                    _localctx.trad.add(x.IF_ICMPLT); // Mes petit
			                    break;
			                case 4:
			                    _localctx.trad.add(x.IF_ICMPLE); // Mes petit igual
			                    break;
			                case 5:
			                    _localctx.trad.add(x.IF_ICMPEQ); // iguals
			                    break;
			                case 6:
			                    _localctx.trad.add(x.IF_ICMPNE); // diferents
			                    break;
			            }
			            Long salt=8L;
			            _localctx.trad.add(x.nByte(salt,2));
			            _localctx.trad.add(x.nByte(salt,1));
			            _localctx.trad.add(x.BIPUSH);
			            _localctx.trad.add(0L);
			            _localctx.trad.add(x.GOTO);
			            salt=5L;
			            _localctx.trad.add(x.nByte(salt,2));
			            _localctx.trad.add(x.nByte(salt,1));
			            _localctx.trad.add(x.BIPUSH);
			            _localctx.trad.add(1L);
			            ((Expr2Context)_localctx).tipus =  'Z';

			        } else if ((((Expr2Context)_localctx).e1.tipus == 'F' && ((Expr2Context)_localctx).e2.tipus == 'I') || (((Expr2Context)_localctx).e1.tipus == 'I' && ((Expr2Context)_localctx).e2.tipus == 'F')){
			            if (((Expr2Context)_localctx).e2.tipus == 'I') {

			            }
			            ((Expr2Context)_localctx).tipus =  'Z';
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
	public static class Expr3Context extends ParserRuleContext {
		public Vector<Long> trad;
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

			((Expr3Context)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			((Expr3Context)_localctx).e1 = expr4();

			        if (((Expr3Context)_localctx).e2 == null) {
			            ((Expr3Context)_localctx).tipus =  ((Expr3Context)_localctx).e1.tipus;
			            ((Expr3Context)_localctx).trad =  ((Expr3Context)_localctx).e1.trad;
			        }
			    
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SUMA || _la==TK_RESTA) {
				{
				setState(420);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_SUMA:
					{
					setState(412);
					match(TK_SUMA);
					setState(413);
					((Expr3Context)_localctx).e2 = expr4();

					        if (((Expr3Context)_localctx).e2 == null) {
					            ((Expr3Context)_localctx).tipus =  ((Expr3Context)_localctx).e1.tipus;
					            ((Expr3Context)_localctx).trad =  ((Expr3Context)_localctx).e1.trad;
					        } else if ((((Expr3Context)_localctx).e1.tipus == 'Z') || (((Expr3Context)_localctx).e2.tipus == 'Z')) {
					            notifyErrorListeners((((Expr3Context)_localctx).e1!=null?(((Expr3Context)_localctx).e1.start):null), "Expr can't be boolean", null);
					        } else if ((((Expr3Context)_localctx).e1.tipus == 'F') && (((Expr3Context)_localctx).e2.tipus == 'F')){
					            ((Expr3Context)_localctx).trad = ((Expr3Context)_localctx).e1.trad;
					            _localctx.trad.addAll(((Expr3Context)_localctx).e2.trad);
					            _localctx.trad.add(x.FADD);
					            ((Expr3Context)_localctx).tipus =  'F';
					        } else if ((((Expr3Context)_localctx).e1.tipus == 'I') && (((Expr3Context)_localctx).e2.tipus == 'F')){
					            ((Expr3Context)_localctx).trad = ((Expr3Context)_localctx).e1.trad;
					            _localctx.trad.add(x.I2F);
					            _localctx.trad.addAll(((Expr3Context)_localctx).e2.trad);
					            _localctx.trad.add(x.FADD);
					            ((Expr3Context)_localctx).tipus =  'F';
					        } else if ((((Expr3Context)_localctx).e1.tipus == 'F') && (((Expr3Context)_localctx).e2.tipus == 'I')){
					            ((Expr3Context)_localctx).trad = ((Expr3Context)_localctx).e1.trad;
					            _localctx.trad.addAll(((Expr3Context)_localctx).e2.trad);
					            _localctx.trad.add(x.I2F);
					            _localctx.trad.add(x.FADD);
					            ((Expr3Context)_localctx).tipus =  'F';
					        } else {
					            ((Expr3Context)_localctx).trad = ((Expr3Context)_localctx).e1.trad;
					            _localctx.trad.addAll(((Expr3Context)_localctx).e2.trad);
					            _localctx.trad.add(x.IADD);
					            ((Expr3Context)_localctx).tipus =  'I';
					        }
					    
					}
					break;
				case TK_RESTA:
					{
					setState(416);
					match(TK_RESTA);
					setState(417);
					((Expr3Context)_localctx).e2 = expr4();

					       if (((Expr3Context)_localctx).e2 == null) {
					           ((Expr3Context)_localctx).tipus =  ((Expr3Context)_localctx).e1.tipus;
					           ((Expr3Context)_localctx).trad =  ((Expr3Context)_localctx).e1.trad;
					       } else if ((((Expr3Context)_localctx).e1.tipus == 'Z') || (((Expr3Context)_localctx).e2.tipus == 'Z')) {
					           notifyErrorListeners((((Expr3Context)_localctx).e1!=null?(((Expr3Context)_localctx).e1.start):null), "Expr can't be boolean", null);
					       } else if ((((Expr3Context)_localctx).e1.tipus == 'F') && (((Expr3Context)_localctx).e2.tipus == 'F')){
					           ((Expr3Context)_localctx).trad = ((Expr3Context)_localctx).e1.trad;
					           _localctx.trad.addAll(((Expr3Context)_localctx).e2.trad);
					           _localctx.trad.add(x.FSUB);
					           ((Expr3Context)_localctx).tipus =  'F';
					       } else if ((((Expr3Context)_localctx).e1.tipus == 'I') && (((Expr3Context)_localctx).e2.tipus == 'F')){
					           ((Expr3Context)_localctx).trad = ((Expr3Context)_localctx).e1.trad;
					           _localctx.trad.add(x.I2F);
					           _localctx.trad.addAll(((Expr3Context)_localctx).e2.trad);
					           _localctx.trad.add(x.FSUB);
					           ((Expr3Context)_localctx).tipus =  'F';
					       } else if ((((Expr3Context)_localctx).e1.tipus == 'F') && (((Expr3Context)_localctx).e2.tipus == 'I')){
					           ((Expr3Context)_localctx).trad = ((Expr3Context)_localctx).e1.trad;
					           _localctx.trad.addAll(((Expr3Context)_localctx).e2.trad);
					           _localctx.trad.add(x.I2F);
					           _localctx.trad.add(x.FSUB);
					           ((Expr3Context)_localctx).tipus =  'F';
					       } else {
					           ((Expr3Context)_localctx).trad = ((Expr3Context)_localctx).e1.trad;
					           _localctx.trad.addAll(((Expr3Context)_localctx).e2.trad);
					           _localctx.trad.add(x.ISUB);
					           ((Expr3Context)_localctx).tipus =  'I';
					       }
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(424);
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
	public static class Expr4Context extends ParserRuleContext {
		public Vector<Long> trad;
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
		public List<TerminalNode> TK_DIV_ENTERA() { return getTokens(provaParser.TK_DIV_ENTERA); }
		public TerminalNode TK_DIV_ENTERA(int i) {
			return getToken(provaParser.TK_DIV_ENTERA, i);
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

		    	((Expr4Context)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			((Expr4Context)_localctx).e1 = expr5();

			        if (((Expr4Context)_localctx).e2 == null) {
			            ((Expr4Context)_localctx).tipus =  ((Expr4Context)_localctx).e1.tipus;
			            ((Expr4Context)_localctx).trad =  ((Expr4Context)_localctx).e1.trad;
			        }
			    
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1030792151040L) != 0)) {
				{
				setState(443);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_MULTIPLICACIO:
					{
					setState(427);
					match(TK_MULTIPLICACIO);
					setState(428);
					((Expr4Context)_localctx).e2 = expr5();

					        if ((((Expr4Context)_localctx).e1.tipus == 'Z') || (((Expr4Context)_localctx).e2.tipus == 'Z')) {
					            notifyErrorListeners((((Expr4Context)_localctx).e1!=null?(((Expr4Context)_localctx).e1.start):null), "Expr can't be boolean", null);
					        } else if ((((Expr4Context)_localctx).e1.tipus == 'F') && (((Expr4Context)_localctx).e2.tipus == 'F')){
					            ((Expr4Context)_localctx).trad = ((Expr4Context)_localctx).e1.trad;
					            _localctx.trad.addAll(((Expr4Context)_localctx).e2.trad);
					            _localctx.trad.add(x.FMUL);
					            ((Expr4Context)_localctx).tipus =  'F';
					        } else if ((((Expr4Context)_localctx).e1.tipus == 'I') && (((Expr4Context)_localctx).e2.tipus == 'F')){
					            ((Expr4Context)_localctx).trad = ((Expr4Context)_localctx).e1.trad;
					            _localctx.trad.add(x.I2F);
					            _localctx.trad.addAll(((Expr4Context)_localctx).e2.trad);
					            _localctx.trad.add(x.FMUL);
					            ((Expr4Context)_localctx).tipus =  'F';
					        } else if ((((Expr4Context)_localctx).e1.tipus == 'F') && (((Expr4Context)_localctx).e2.tipus == 'I')){
					            ((Expr4Context)_localctx).trad = ((Expr4Context)_localctx).e1.trad;
					            _localctx.trad.addAll(((Expr4Context)_localctx).e2.trad);
					            _localctx.trad.add(x.I2F);
					            _localctx.trad.add(x.FMUL);
					            ((Expr4Context)_localctx).tipus =  'F';
					        } else {
					            ((Expr4Context)_localctx).trad = ((Expr4Context)_localctx).e1.trad;
					            _localctx.trad.addAll(((Expr4Context)_localctx).e2.trad);
					            _localctx.trad.add(x.IMUL);
					            ((Expr4Context)_localctx).tipus =  'I';
					        }
					    
					}
					break;
				case TK_DIVISIO:
					{
					setState(431);
					match(TK_DIVISIO);
					setState(432);
					((Expr4Context)_localctx).e2 = expr5();

					        if ((((Expr4Context)_localctx).e1.tipus == 'Z') || (((Expr4Context)_localctx).e2.tipus == 'Z')) {
					            notifyErrorListeners((((Expr4Context)_localctx).e1!=null?(((Expr4Context)_localctx).e1.start):null), "Expr can't be boolean", null);
					        } else if ((((Expr4Context)_localctx).e1.tipus == 'F') && (((Expr4Context)_localctx).e2.tipus == 'F')){
					            ((Expr4Context)_localctx).trad = ((Expr4Context)_localctx).e1.trad;
					            _localctx.trad.addAll(((Expr4Context)_localctx).e2.trad);
					            _localctx.trad.add(x.FDIV);
					            ((Expr4Context)_localctx).tipus =  'F';
					        } else if ((((Expr4Context)_localctx).e1.tipus == 'I') && (((Expr4Context)_localctx).e2.tipus == 'F')){
					            ((Expr4Context)_localctx).trad = ((Expr4Context)_localctx).e1.trad;
					            _localctx.trad.add(x.I2F);
					            _localctx.trad.addAll(((Expr4Context)_localctx).e2.trad);
					            _localctx.trad.add(x.FDIV);
					            ((Expr4Context)_localctx).tipus =  'F';
					        } else if ((((Expr4Context)_localctx).e1.tipus == 'F') && (((Expr4Context)_localctx).e2.tipus == 'I')){
					            ((Expr4Context)_localctx).trad = ((Expr4Context)_localctx).e1.trad;
					            _localctx.trad.addAll(((Expr4Context)_localctx).e2.trad);
					            _localctx.trad.add(x.I2F);
					            _localctx.trad.add(x.FDIV);
					            ((Expr4Context)_localctx).tipus =  'F';
					        } else {
					            ((Expr4Context)_localctx).trad = ((Expr4Context)_localctx).e1.trad;
					            _localctx.trad.add(x.I2F);
					            _localctx.trad.addAll(((Expr4Context)_localctx).e2.trad);
					            _localctx.trad.add(x.I2F);
					            _localctx.trad.add(x.FDIV);
					            ((Expr4Context)_localctx).tipus =  'F';
					        }
					    
					}
					break;
				case TK_DIV_ENTERA:
					{
					setState(435);
					match(TK_DIV_ENTERA);
					setState(436);
					((Expr4Context)_localctx).e2 = expr5();

					        if (((Expr4Context)_localctx).e2 == null) {
					            ((Expr4Context)_localctx).tipus =  ((Expr4Context)_localctx).e1.tipus;
					            ((Expr4Context)_localctx).trad =  ((Expr4Context)_localctx).e1.trad;
					        } else if ((((Expr4Context)_localctx).e1.tipus == 'Z') || (((Expr4Context)_localctx).e2.tipus == 'Z') || (((Expr4Context)_localctx).e1.tipus == 'F') || (((Expr4Context)_localctx).e2.tipus == 'F')) {
					            notifyErrorListeners((((Expr4Context)_localctx).e1!=null?(((Expr4Context)_localctx).e1.start):null), "Expr must take Int", null);
					        } else {
					            ((Expr4Context)_localctx).trad = ((Expr4Context)_localctx).e1.trad;
					            _localctx.trad.addAll(((Expr4Context)_localctx).e2.trad);
					            _localctx.trad.add(x.IDIV);
					            ((Expr4Context)_localctx).tipus =  'I';
					        }
					    
					}
					break;
				case TK_MODUL:
					{
					setState(439);
					match(TK_MODUL);
					setState(440);
					((Expr4Context)_localctx).e2 = expr5();

					        if (((Expr4Context)_localctx).e2 == null) {
					            ((Expr4Context)_localctx).tipus =  ((Expr4Context)_localctx).e1.tipus;
					            ((Expr4Context)_localctx).trad =  ((Expr4Context)_localctx).e1.trad;
					        } else if ((((Expr4Context)_localctx).e1.tipus == 'Z') || (((Expr4Context)_localctx).e2.tipus == 'Z') || (((Expr4Context)_localctx).e1.tipus == 'F') || (((Expr4Context)_localctx).e2.tipus == 'F')) {
					            notifyErrorListeners((((Expr4Context)_localctx).e1!=null?(((Expr4Context)_localctx).e1.start):null), "Expr must take Int", null);
					        } else {
					            ((Expr4Context)_localctx).trad = ((Expr4Context)_localctx).e1.trad;
					            _localctx.trad.addAll(((Expr4Context)_localctx).e2.trad);
					            _localctx.trad.add(x.IREM);
					            ((Expr4Context)_localctx).tipus =  'I';
					        }
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(447);
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
	public static class Expr5Context extends ParserRuleContext {
		public Vector<Long> trad;
		public char tipus;
		public ExprbaseContext exprbase;
		public ExprbaseContext ee;
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

			((Expr5Context)_localctx).trad = new Vector<Long>(100);
		    
		try {
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LPAREN:
			case TK_ENTER:
			case TK_REAL:
			case TK_BOLEA:
			case TK_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				((Expr5Context)_localctx).exprbase = exprbase();

				        ((Expr5Context)_localctx).tipus =  ((Expr5Context)_localctx).exprbase.tipus;
				        ((Expr5Context)_localctx).trad =  ((Expr5Context)_localctx).exprbase.trad;
				    
				}
				break;
			case TK_NEGACIO:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(451);
				match(TK_NEGACIO);
				setState(452);
				((Expr5Context)_localctx).ee = ((Expr5Context)_localctx).exprbase = exprbase();
				}

				        if (((Expr5Context)_localctx).exprbase.tipus != 'Z') {
				            notifyErrorListeners((((Expr5Context)_localctx).exprbase!=null?(((Expr5Context)_localctx).exprbase.start):null), "Expr must be boolean", null);
				        } else {
				            ((Expr5Context)_localctx).trad = ((Expr5Context)_localctx).ee.trad;
				            _localctx.trad.add(x.IFEQ);
				            Long salt=8L;
				            _localctx.trad.add(x.nByte(salt,2));
				            _localctx.trad.add(x.nByte(salt,1));
				            _localctx.trad.add(x.BIPUSH);
				            _localctx.trad.add(0L);
				            _localctx.trad.add(x.GOTO);
				            salt=5L;
				            _localctx.trad.add(x.nByte(salt,2));
				            _localctx.trad.add(x.nByte(salt,1));
				            _localctx.trad.add(x.BIPUSH);
				            _localctx.trad.add(1L);
				            ((Expr5Context)_localctx).tipus = 'Z';
				        }
				    
				}
				break;
			case TK_MENYS_UNARI:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(456);
				match(TK_MENYS_UNARI);
				setState(457);
				((Expr5Context)_localctx).exprbase = exprbase();
				}

				        if (((Expr5Context)_localctx).exprbase.tipus != 'F' && ((Expr5Context)_localctx).exprbase.tipus != 'I') {
				            notifyErrorListeners((((Expr5Context)_localctx).exprbase!=null?(((Expr5Context)_localctx).exprbase.start):null), "Expr must be Int or Float", null);
				        } else {
				            if ( ((Expr5Context)_localctx).exprbase.tipus != 'F') {
				                ((Expr5Context)_localctx).trad = ((Expr5Context)_localctx).exprbase.trad;
				                _localctx.trad.add(x.F2I);
				                _localctx.trad.add(x.INEG);
				                ((Expr5Context)_localctx).tipus =  'I';
				            }
				            else{
				                ((Expr5Context)_localctx).trad = ((Expr5Context)_localctx).exprbase.trad;
				                _localctx.trad.add(x.INEG);
				                ((Expr5Context)_localctx).tipus =  'I';
				            }
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
		public Vector<Long> trad;
		public char tipus;
		public Token TK_IDENT;
		public ExprContext expr;
		public Token TK_ENTER;
		public Token TK_REAL;
		public Token TK_BOLEA;
		public List<TerminalNode> TK_IDENT() { return getTokens(provaParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(provaParser.TK_IDENT, i);
		}
		public TerminalNode TK_LPAREN() { return getToken(provaParser.TK_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(provaParser.TK_RPAREN, 0); }
		public CridaAccioFuncioContext cridaAccioFuncio() {
			return getRuleContext(CridaAccioFuncioContext.class,0);
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

			((ExprbaseContext)_localctx).trad = new Vector<Long>(100);
		    
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				((ExprbaseContext)_localctx).TK_IDENT = match(TK_IDENT);

				        if (!TS.existeix((((ExprbaseContext)_localctx).TK_IDENT!=null?((ExprbaseContext)_localctx).TK_IDENT.getText():null))) {
				            System.out.println("No existeix: " + (((ExprbaseContext)_localctx).TK_IDENT!=null?((ExprbaseContext)_localctx).TK_IDENT.getText():null));
				            notifyErrorListeners(((ExprbaseContext)_localctx).TK_IDENT, "Error: Variable '" + (((ExprbaseContext)_localctx).TK_IDENT!=null?((ExprbaseContext)_localctx).TK_IDENT.getText():null) + "' no declarada.", null);
				        } else {
				            Registre r=(Registre)TS.obtenir((((ExprbaseContext)_localctx).TK_IDENT!=null?((ExprbaseContext)_localctx).TK_IDENT.getText():null));
				            if (r.getTipus() == 'I' | r.getTipus() == 'Z'){
				                _localctx.trad.add(x.ILOAD);
				            } else {
				                _localctx.trad.add(x.FLOAD);
				            }
				            _localctx.trad.add(new Long(r.getAdreca()));
				            System.out.println("Existeix molt: " + (((ExprbaseContext)_localctx).TK_IDENT!=null?((ExprbaseContext)_localctx).TK_IDENT.getText():null));
				            ((ExprbaseContext)_localctx).tipus = r.getTipus();
				        }
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(TK_LPAREN);
				setState(466);
				((ExprbaseContext)_localctx).expr = expr();
				setState(467);
				match(TK_RPAREN);

				        ((ExprbaseContext)_localctx).tipus =  ((ExprbaseContext)_localctx).expr.tipus;
				        ((ExprbaseContext)_localctx).trad =  ((ExprbaseContext)_localctx).expr.trad;
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				cridaAccioFuncio();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				match(TK_IDENT);
				setState(472);
				match(TK_LCLAU);
				setState(473);
				expr3();
				setState(474);
				match(TK_RCLAU);
				setState(475);
				match(TK_LCLAU);
				setState(476);
				expr3();
				setState(477);
				match(TK_RCLAU);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(479);
				match(TK_IDENT);
				setState(480);
				match(TK_PUNT);
				setState(481);
				match(TK_IDENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(482);
				((ExprbaseContext)_localctx).TK_ENTER = match(TK_ENTER);

				        ((ExprbaseContext)_localctx).tipus = 'I';
				        Long adrecaTemp=x.addConstant("I",(((ExprbaseContext)_localctx).TK_ENTER!=null?((ExprbaseContext)_localctx).TK_ENTER.getText():null)); //afegim a la constant pool
				        _localctx.trad.add(x.LDC_W);
				        _localctx.trad.add(x.nByte(adrecaTemp,2));
				        _localctx.trad.add(x.nByte(adrecaTemp,1));
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(484);
				((ExprbaseContext)_localctx).TK_REAL = match(TK_REAL);

				        ((ExprbaseContext)_localctx).tipus = 'F';
				        Long adrecaTemp=x.addConstant("F",(((ExprbaseContext)_localctx).TK_REAL!=null?((ExprbaseContext)_localctx).TK_REAL.getText():null)); //afegim a la constant pool
				        _localctx.trad.add(x.LDC_W);
				        _localctx.trad.add(x.nByte(adrecaTemp,2));
				        _localctx.trad.add(x.nByte(adrecaTemp,1));
				    
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(486);
				((ExprbaseContext)_localctx).TK_BOLEA = match(TK_BOLEA);

				        ((ExprbaseContext)_localctx).tipus = 'Z';
				        System.out.println("Text bool: " + (((ExprbaseContext)_localctx).TK_BOLEA!=null?((ExprbaseContext)_localctx).TK_BOLEA.getText():null));
				        Long adrecaTemp=x.addConstant("Z",(((ExprbaseContext)_localctx).TK_BOLEA!=null?((ExprbaseContext)_localctx).TK_BOLEA.getText():null));
				        _localctx.trad.add(x.LDC_W);
				        _localctx.trad.add(x.nByte(adrecaTemp,2));
				        _localctx.trad.add(x.nByte(adrecaTemp,1));
				    
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
		"\u0004\u0001C\u01eb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0003\u00019\b\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001@\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001E\b\u0001\u000b\u0001\f\u0001F\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0004\u0002N\b\u0002\u000b\u0002\f\u0002O\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\\\b\u0003\n\u0003"+
		"\f\u0003_\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0004\u0003g\b\u0003\u000b\u0003\f\u0003h\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003n\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005v\b\u0005"+
		"\u000b\u0005\f\u0005w\u0001\u0005\u0004\u0005{\b\u0005\u000b\u0005\f\u0005"+
		"|\u0003\u0005\u007f\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0085\b\u0006\u0001\u0006\u0003\u0006\u0088\b\u0006"+
		"\u0001\u0006\u0003\u0006\u008b\b\u0006\u0001\u0006\u0005\u0006\u008e\b"+
		"\u0006\n\u0006\f\u0006\u0091\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009a\b\u0007"+
		"\u0001\u0007\u0003\u0007\u009d\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00a2\b\u0007\u0001\u0007\u0005\u0007\u00a5\b\u0007\n\u0007"+
		"\f\u0007\u00a8\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00b2\b\b\n\b\f\b\u00b5\t"+
		"\b\u0001\t\u0001\t\u0005\t\u00b9\b\t\n\t\f\t\u00bc\t\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0005\n\u00c3\b\n\n\n\f\n\u00c6\t\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00d1\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e5\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00f1\b\u000e\n\u000e\f\u000e\u00f4\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00fa\b\u000e\n\u000e\f\u000e\u00fd"+
		"\t\u000e\u0005\u000e\u00ff\b\u000e\n\u000e\f\u000e\u0102\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u0106\b\u000e\n\u000e\f\u000e\u0109\t\u000e"+
		"\u0003\u000e\u010b\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u0116\b\u000f\n\u000f\f\u000f\u0119\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0004\u0010\u0124\b\u0010\u000b\u0010\f\u0010\u0125\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u0130\b\u0011\n\u0011\f\u0011\u0133\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u013d\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u014a\b\u0012\n\u0012\f\u0012"+
		"\u014d\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0158\b\u0012"+
		"\n\u0012\f\u0012\u015b\t\u0012\u0003\u0012\u015d\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0161\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0166\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0172\b\u0014\n\u0014\f\u0014\u0175\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u017b\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u0197\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u01a5\b\u0016\n\u0016\f\u0016\u01a8"+
		"\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u01bc\b\u0017\n\u0017\f\u0017\u01bf\t\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u01ce\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01e9\b\u0019\u0001\u0019"+
		"\u0000\u0000\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\u0000\u0213\u00004\u0001"+
		"\u0000\u0000\u0000\u00028\u0001\u0000\u0000\u0000\u0004K\u0001\u0000\u0000"+
		"\u0000\u0006m\u0001\u0000\u0000\u0000\bo\u0001\u0000\u0000\u0000\n~\u0001"+
		"\u0000\u0000\u0000\f\u0080\u0001\u0000\u0000\u0000\u000e\u0095\u0001\u0000"+
		"\u0000\u0000\u0010\u00ae\u0001\u0000\u0000\u0000\u0012\u00b6\u0001\u0000"+
		"\u0000\u0000\u0014\u00bf\u0001\u0000\u0000\u0000\u0016\u00d0\u0001\u0000"+
		"\u0000\u0000\u0018\u00e4\u0001\u0000\u0000\u0000\u001a\u00e6\u0001\u0000"+
		"\u0000\u0000\u001c\u00ec\u0001\u0000\u0000\u0000\u001e\u010f\u0001\u0000"+
		"\u0000\u0000 \u011c\u0001\u0000\u0000\u0000\"\u012a\u0001\u0000\u0000"+
		"\u0000$\u0160\u0001\u0000\u0000\u0000&\u0162\u0001\u0000\u0000\u0000("+
		"\u017a\u0001\u0000\u0000\u0000*\u017c\u0001\u0000\u0000\u0000,\u019a\u0001"+
		"\u0000\u0000\u0000.\u01a9\u0001\u0000\u0000\u00000\u01cd\u0001\u0000\u0000"+
		"\u00002\u01e8\u0001\u0000\u0000\u000045\u0003\u0002\u0001\u000056\u0005"+
		"\u0000\u0000\u00016\u0001\u0001\u0000\u0000\u000079\u0003\u0004\u0002"+
		"\u000087\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000"+
		"\u0000\u0000:<\u0003\n\u0005\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0005\t\u0000\u0000>@\u0003\u0012"+
		"\t\u0000?>\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@D\u0001\u0000"+
		"\u0000\u0000AB\u0003\u0018\f\u0000BC\u0006\u0001\uffff\uffff\u0000CE\u0001"+
		"\u0000\u0000\u0000DA\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HI\u0005\n\u0000\u0000IJ\u0006\u0001\uffff\uffff\u0000J\u0003\u0001"+
		"\u0000\u0000\u0000KM\u0005\f\u0000\u0000LN\u0003\u0006\u0003\u0000ML\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0005\r\u0000\u0000"+
		"R\u0005\u0001\u0000\u0000\u0000ST\u0005C\u0000\u0000TU\u0005\u000e\u0000"+
		"\u0000UV\u0005\u000f\u0000\u0000VW\u0005\u0015\u0000\u0000WX\u0005\u0012"+
		"\u0000\u0000X]\u0005\u0012\u0000\u0000YZ\u0005 \u0000\u0000Z\\\u0005\u0012"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000`n\u0005\b\u0000\u0000ab\u0005C\u0000\u0000"+
		"bc\u0005\u000e\u0000\u0000cd\u0005\u0010\u0000\u0000df\u0005\u0006\u0000"+
		"\u0000eg\u0003\b\u0004\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000jk\u0005\u0007\u0000\u0000kl\u0005\u0011\u0000\u0000ln\u0001"+
		"\u0000\u0000\u0000mS\u0001\u0000\u0000\u0000ma\u0001\u0000\u0000\u0000"+
		"n\u0007\u0001\u0000\u0000\u0000op\u0005C\u0000\u0000pq\u0005\u000e\u0000"+
		"\u0000qr\u0005\u0015\u0000\u0000rs\u0005\b\u0000\u0000s\t\u0001\u0000"+
		"\u0000\u0000tv\u0003\f\u0006\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u007f"+
		"\u0001\u0000\u0000\u0000y{\u0003\u000e\u0007\u0000zy\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~u\u0001\u0000\u0000\u0000"+
		"~z\u0001\u0000\u0000\u0000\u007f\u000b\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\u0016\u0000\u0000\u0081\u0087\u0005C\u0000\u0000\u0082\u0084\u0005"+
		"\u0004\u0000\u0000\u0083\u0085\u0003\u0010\b\u0000\u0084\u0083\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0088\u0005\u0005\u0000\u0000\u0087\u0082\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000"+
		"\u0000\u0000\u0089\u008b\u0003\u0012\t\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008f\u0001\u0000\u0000"+
		"\u0000\u008c\u008e\u0003\u0018\f\u0000\u008d\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0017\u0000\u0000"+
		"\u0093\u0094\u0006\u0006\uffff\uffff\u0000\u0094\r\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\u0018\u0000\u0000\u0096\u009c\u0005C\u0000\u0000\u0097"+
		"\u0099\u0005\u0004\u0000\u0000\u0098\u009a\u0003\u0010\b\u0000\u0099\u0098"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0001\u0000\u0000\u0000\u009b\u009d\u0005\u0005\u0000\u0000\u009c\u0097"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u001a\u0000\u0000\u009f\u00a1"+
		"\u0005\u0015\u0000\u0000\u00a0\u00a2\u0003\u0012\t\u0000\u00a1\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a5\u0003\u0018\f\u0000\u00a4\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u001a"+
		"\u0000\u0000\u00aa\u00ab\u0003(\u0014\u0000\u00ab\u00ac\u0005\u0019\u0000"+
		"\u0000\u00ac\u00ad\u0006\u0007\uffff\uffff\u0000\u00ad\u000f\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b3\u0005\u001b\u0000\u0000\u00af\u00b0\u0005 \u0000"+
		"\u0000\u00b0\u00b2\u0005\u001b\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u0011\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00ba\u0005\u001c\u0000"+
		"\u0000\u00b7\u00b9\u0003\u0014\n\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u001d\u0000\u0000"+
		"\u00be\u0013\u0001\u0000\u0000\u0000\u00bf\u00c4\u0005C\u0000\u0000\u00c0"+
		"\u00c1\u0005 \u0000\u0000\u00c1\u00c3\u0005C\u0000\u0000\u00c2\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005"+
		"\u000e\u0000\u0000\u00c8\u00c9\u0003\u0016\u000b\u0000\u00c9\u00ca\u0005"+
		"\b\u0000\u0000\u00ca\u00cb\u0006\n\uffff\uffff\u0000\u00cb\u0015\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0005\u0015\u0000\u0000\u00cd\u00d1\u0006"+
		"\u000b\uffff\uffff\u0000\u00ce\u00cf\u0005C\u0000\u0000\u00cf\u00d1\u0006"+
		"\u000b\uffff\uffff\u0000\u00d0\u00cc\u0001\u0000\u0000\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d1\u0017\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0003\u001a\r\u0000\u00d3\u00d4\u0006\f\uffff\uffff\u0000\u00d4\u00e5"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0003\u001c\u000e\u0000\u00d6\u00d7"+
		"\u0006\f\uffff\uffff\u0000\u00d7\u00e5\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0003\u001e\u000f\u0000\u00d9\u00da\u0006\f\uffff\uffff\u0000\u00da\u00e5"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0003 \u0010\u0000\u00dc\u00dd\u0006"+
		"\f\uffff\uffff\u0000\u00dd\u00e5\u0001\u0000\u0000\u0000\u00de\u00df\u0003"+
		"\"\u0011\u0000\u00df\u00e0\u0006\f\uffff\uffff\u0000\u00e0\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0003$\u0012\u0000\u00e2\u00e3\u0006\f"+
		"\uffff\uffff\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00e4\u00d5\u0001\u0000\u0000\u0000\u00e4\u00d8\u0001"+
		"\u0000\u0000\u0000\u00e4\u00db\u0001\u0000\u0000\u0000\u00e4\u00de\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e1\u0001\u0000\u0000\u0000\u00e5\u0019\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0005C\u0000\u0000\u00e7\u00e8\u00053\u0000"+
		"\u0000\u00e8\u00e9\u0003(\u0014\u0000\u00e9\u00ea\u0005\b\u0000\u0000"+
		"\u00ea\u00eb\u0006\r\uffff\uffff\u0000\u00eb\u001b\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u00054\u0000\u0000\u00ed\u00ee\u0003(\u0014\u0000\u00ee\u00f2"+
		"\u00055\u0000\u0000\u00ef\u00f1\u0003\u0018\f\u0000\u00f0\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u0100\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"6\u0000\u0000\u00f6\u00f7\u0003(\u0014\u0000\u00f7\u00fb\u00055\u0000"+
		"\u0000\u00f8\u00fa\u0003\u0018\f\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u00f5\u0001\u0000\u0000\u0000"+
		"\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u010a\u0001\u0000\u0000\u0000"+
		"\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0107\u00056\u0000\u0000\u0104"+
		"\u0106\u0003\u0018\f\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u0109"+
		"\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107"+
		"\u0001\u0000\u0000\u0000\u010a\u0103\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u00057\u0000\u0000\u010d\u010e\u0006\u000e\uffff\uffff\u0000\u010e\u001d"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0005:\u0000\u0000\u0110\u0111\u0005"+
		"C\u0000\u0000\u0111\u0112\u00058\u0000\u0000\u0112\u0113\u0003&\u0013"+
		"\u0000\u0113\u0117\u0005=\u0000\u0000\u0114\u0116\u0003\u0018\f\u0000"+
		"\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000"+
		"\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000"+
		"\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0005>\u0000\u0000\u011b\u001f\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0005?\u0000\u0000\u011d\u011e\u0003(\u0014\u0000\u011e\u011f\u0006"+
		"\u0010\uffff\uffff\u0000\u011f\u0123\u0005=\u0000\u0000\u0120\u0121\u0003"+
		"\u0018\f\u0000\u0121\u0122\u0006\u0010\uffff\uffff\u0000\u0122\u0124\u0001"+
		"\u0000\u0000\u0000\u0123\u0120\u0001\u0000\u0000\u0000\u0124\u0125\u0001"+
		"\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0005"+
		"@\u0000\u0000\u0128\u0129\u0006\u0010\uffff\uffff\u0000\u0129!\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0005C\u0000\u0000\u012b\u012c\u0005\u0004\u0000"+
		"\u0000\u012c\u0131\u0003(\u0014\u0000\u012d\u012e\u0005 \u0000\u0000\u012e"+
		"\u0130\u0003(\u0014\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0133"+
		"\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u0001\u0000\u0000\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u0131"+
		"\u0001\u0000\u0000\u0000\u0134\u0135\u0005\u0005\u0000\u0000\u0135\u0136"+
		"\u0005\b\u0000\u0000\u0136#\u0001\u0000\u0000\u0000\u0137\u0138\u0005"+
		"A\u0000\u0000\u0138\u0139\u0005\u0004\u0000\u0000\u0139\u013c\u0005C\u0000"+
		"\u0000\u013a\u013b\u0005\u000e\u0000\u0000\u013b\u013d\u0005\u0015\u0000"+
		"\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0005\u0005\u0000"+
		"\u0000\u013f\u0140\u0005\b\u0000\u0000\u0140\u0161\u0006\u0012\uffff\uffff"+
		"\u0000\u0141\u0142\u0005B\u0000\u0000\u0142\u0143\u0005\u0004\u0000\u0000"+
		"\u0143\u0144\u0003(\u0014\u0000\u0144\u014b\u0006\u0012\uffff\uffff\u0000"+
		"\u0145\u0146\u0005 \u0000\u0000\u0146\u0147\u0003(\u0014\u0000\u0147\u0148"+
		"\u0006\u0012\uffff\uffff\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149"+
		"\u0145\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000\u014b"+
		"\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c"+
		"\u014e\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0005\u0005\u0000\u0000\u014f\u0150\u0005\b\u0000\u0000\u0150\u0161"+
		"\u0001\u0000\u0000\u0000\u0151\u0152\u0005B\u0000\u0000\u0152\u0153\u0005"+
		"9\u0000\u0000\u0153\u015c\u0005\u0004\u0000\u0000\u0154\u0159\u0003(\u0014"+
		"\u0000\u0155\u0156\u0005 \u0000\u0000\u0156\u0158\u0003(\u0014\u0000\u0157"+
		"\u0155\u0001\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159"+
		"\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a"+
		"\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c"+
		"\u0154\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u0005\u0000\u0000\u015f"+
		"\u0161\u0005\b\u0000\u0000\u0160\u0137\u0001\u0000\u0000\u0000\u0160\u0141"+
		"\u0001\u0000\u0000\u0000\u0160\u0151\u0001\u0000\u0000\u0000\u0161%\u0001"+
		"\u0000\u0000\u0000\u0162\u0165\u0005\u0012\u0000\u0000\u0163\u0164\u0005"+
		" \u0000\u0000\u0164\u0166\u0005\u0012\u0000\u0000\u0165\u0163\u0001\u0000"+
		"\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\'\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0003*\u0015\u0000\u0168\u0173\u0006\u0014\uffff\uffff"+
		"\u0000\u0169\u016a\u00050\u0000\u0000\u016a\u016b\u0003*\u0015\u0000\u016b"+
		"\u016c\u0006\u0014\uffff\uffff\u0000\u016c\u0172\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\u00051\u0000\u0000\u016e\u016f\u0003*\u0015\u0000\u016f\u0170"+
		"\u0006\u0014\uffff\uffff\u0000\u0170\u0172\u0001\u0000\u0000\u0000\u0171"+
		"\u0169\u0001\u0000\u0000\u0000\u0171\u016d\u0001\u0000\u0000\u0000\u0172"+
		"\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u0174\u017b\u0001\u0000\u0000\u0000\u0175"+
		"\u0173\u0001\u0000\u0000\u0000\u0176\u0177\u0005/\u0000\u0000\u0177\u0178"+
		"\u0003*\u0015\u0000\u0178\u0179\u0006\u0014\uffff\uffff\u0000\u0179\u017b"+
		"\u0001\u0000\u0000\u0000\u017a\u0167\u0001\u0000\u0000\u0000\u017a\u0176"+
		"\u0001\u0000\u0000\u0000\u017b)\u0001\u0000\u0000\u0000\u017c\u017d\u0003"+
		",\u0016\u0000\u017d\u0196\u0006\u0015\uffff\uffff\u0000\u017e\u017f\u0005"+
		"-\u0000\u0000\u017f\u0180\u0003,\u0016\u0000\u0180\u0181\u0006\u0015\uffff"+
		"\uffff\u0000\u0181\u0197\u0001\u0000\u0000\u0000\u0182\u0183\u0005.\u0000"+
		"\u0000\u0183\u0184\u0003,\u0016\u0000\u0184\u0185\u0006\u0015\uffff\uffff"+
		"\u0000\u0185\u0197\u0001\u0000\u0000\u0000\u0186\u0187\u0005+\u0000\u0000"+
		"\u0187\u0188\u0003,\u0016\u0000\u0188\u0189\u0006\u0015\uffff\uffff\u0000"+
		"\u0189\u0197\u0001\u0000\u0000\u0000\u018a\u018b\u0005,\u0000\u0000\u018b"+
		"\u018c\u0003,\u0016\u0000\u018c\u018d\u0006\u0015\uffff\uffff\u0000\u018d"+
		"\u0197\u0001\u0000\u0000\u0000\u018e\u018f\u0005)\u0000\u0000\u018f\u0190"+
		"\u0003,\u0016\u0000\u0190\u0191\u0006\u0015\uffff\uffff\u0000\u0191\u0197"+
		"\u0001\u0000\u0000\u0000\u0192\u0193\u0005*\u0000\u0000\u0193\u0194\u0003"+
		",\u0016\u0000\u0194\u0195\u0006\u0015\uffff\uffff\u0000\u0195\u0197\u0001"+
		"\u0000\u0000\u0000\u0196\u017e\u0001\u0000\u0000\u0000\u0196\u0182\u0001"+
		"\u0000\u0000\u0000\u0196\u0186\u0001\u0000\u0000\u0000\u0196\u018a\u0001"+
		"\u0000\u0000\u0000\u0196\u018e\u0001\u0000\u0000\u0000\u0196\u0192\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0006\u0015\uffff\uffff\u0000\u0199+\u0001"+
		"\u0000\u0000\u0000\u019a\u019b\u0003.\u0017\u0000\u019b\u01a6\u0006\u0016"+
		"\uffff\uffff\u0000\u019c\u019d\u0005\"\u0000\u0000\u019d\u019e\u0003."+
		"\u0017\u0000\u019e\u019f\u0006\u0016\uffff\uffff\u0000\u019f\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0005#\u0000\u0000\u01a1\u01a2\u0003.\u0017"+
		"\u0000\u01a2\u01a3\u0006\u0016\uffff\uffff\u0000\u01a3\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a4\u019c\u0001\u0000\u0000\u0000\u01a4\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7-\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a9\u01aa\u00030\u0018\u0000"+
		"\u01aa\u01bd\u0006\u0017\uffff\uffff\u0000\u01ab\u01ac\u0005$\u0000\u0000"+
		"\u01ac\u01ad\u00030\u0018\u0000\u01ad\u01ae\u0006\u0017\uffff\uffff\u0000"+
		"\u01ae\u01bc\u0001\u0000\u0000\u0000\u01af\u01b0\u0005%\u0000\u0000\u01b0"+
		"\u01b1\u00030\u0018\u0000\u01b1\u01b2\u0006\u0017\uffff\uffff\u0000\u01b2"+
		"\u01bc\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005&\u0000\u0000\u01b4\u01b5"+
		"\u00030\u0018\u0000\u01b5\u01b6\u0006\u0017\uffff\uffff\u0000\u01b6\u01bc"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005\'\u0000\u0000\u01b8\u01b9\u0003"+
		"0\u0018\u0000\u01b9\u01ba\u0006\u0017\uffff\uffff\u0000\u01ba\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bb\u01ab\u0001\u0000\u0000\u0000\u01bb\u01af\u0001"+
		"\u0000\u0000\u0000\u01bb\u01b3\u0001\u0000\u0000\u0000\u01bb\u01b7\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001"+
		"\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be/\u0001\u0000"+
		"\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01c0\u01c1\u00032\u0019"+
		"\u0000\u01c1\u01c2\u0006\u0018\uffff\uffff\u0000\u01c2\u01ce\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c4\u0005/\u0000\u0000\u01c4\u01c5\u00032\u0019\u0000"+
		"\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c7\u0006\u0018\uffff\uffff"+
		"\u0000\u01c7\u01ce\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005(\u0000\u0000"+
		"\u01c9\u01ca\u00032\u0019\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb"+
		"\u01cc\u0006\u0018\uffff\uffff\u0000\u01cc\u01ce\u0001\u0000\u0000\u0000"+
		"\u01cd\u01c0\u0001\u0000\u0000\u0000\u01cd\u01c3\u0001\u0000\u0000\u0000"+
		"\u01cd\u01c8\u0001\u0000\u0000\u0000\u01ce1\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d0\u0005C\u0000\u0000\u01d0\u01e9\u0006\u0019\uffff\uffff\u0000\u01d1"+
		"\u01d2\u0005\u0004\u0000\u0000\u01d2\u01d3\u0003(\u0014\u0000\u01d3\u01d4"+
		"\u0005\u0005\u0000\u0000\u01d4\u01d5\u0006\u0019\uffff\uffff\u0000\u01d5"+
		"\u01e9\u0001\u0000\u0000\u0000\u01d6\u01e9\u0003\"\u0011\u0000\u01d7\u01d8"+
		"\u0005C\u0000\u0000\u01d8\u01d9\u0005\u0002\u0000\u0000\u01d9\u01da\u0003"+
		",\u0016\u0000\u01da\u01db\u0005\u0003\u0000\u0000\u01db\u01dc\u0005\u0002"+
		"\u0000\u0000\u01dc\u01dd\u0003,\u0016\u0000\u01dd\u01de\u0005\u0003\u0000"+
		"\u0000\u01de\u01e9\u0001\u0000\u0000\u0000\u01df\u01e0\u0005C\u0000\u0000"+
		"\u01e0\u01e1\u0005!\u0000\u0000\u01e1\u01e9\u0005C\u0000\u0000\u01e2\u01e3"+
		"\u0005\u0012\u0000\u0000\u01e3\u01e9\u0006\u0019\uffff\uffff\u0000\u01e4"+
		"\u01e5\u0005\u0013\u0000\u0000\u01e5\u01e9\u0006\u0019\uffff\uffff\u0000"+
		"\u01e6\u01e7\u0005\u0014\u0000\u0000\u01e7\u01e9\u0006\u0019\uffff\uffff"+
		"\u0000\u01e8\u01cf\u0001\u0000\u0000\u0000\u01e8\u01d1\u0001\u0000\u0000"+
		"\u0000\u01e8\u01d6\u0001\u0000\u0000\u0000\u01e8\u01d7\u0001\u0000\u0000"+
		"\u0000\u01e8\u01df\u0001\u0000\u0000\u0000\u01e8\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e4\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e93\u0001\u0000\u0000\u000008;?FO]hmw|~\u0084\u0087\u008a\u008f"+
		"\u0099\u009c\u00a1\u00a6\u00b3\u00ba\u00c4\u00d0\u00e4\u00f2\u00fb\u0100"+
		"\u0107\u010a\u0117\u0125\u0131\u013c\u014b\u0159\u015c\u0160\u0165\u0171"+
		"\u0173\u017a\u0196\u01a4\u01a6\u01bb\u01bd\u01cd\u01e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}