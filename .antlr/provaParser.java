// Generated from c:/Users/arnau/Documents/uni/Compiladors/antlr-proj/prova.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class provaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_WS=1, TK_LPAREN=2, TK_RPAREN=3, TK_SEMI=4, TK_PC_PROGRAMA=5, TK_PC_FPROGRAMA=6, 
		TK_PC_PERIODE=7, TK_ENTER=8, TK_REAL=9, TK_BOLEA=10, TK_IDENT=11, TK_TIPUS_BASIC=12, 
		TK_TIPUS=13, TK_FTIPUS=14, TK_PUNTS=15, TK_VECTOR=16, TK_TUPLA=17, TK_ACCIO=18, 
		TK_FACCIO=19, TK_FUNCIO=20, TK_FFUNCIO=21, TK_RETORNA=22, TK_PARAM=23, 
		TK_VARIABLES=24, TK_FVARIABLES=25, TK_VARIABLE=26, TK_COMMENT=27, TK_SUMA=28, 
		TK_RESTA=29, TK_MULTIPLICACIO=30, TK_DIVISIO=31, TK_DIV_ENTERA=32, TK_MODUL=33, 
		TK_MENYS_UNARI=34, TK_IGUALTAT=35, TK_DESIGUALTAT=36, TK_MES_PETIT=37, 
		TK_MES_PETIT_IG=38, TK_MES_GRAN=39, TK_MES_GRAN_IG=40, TK_NEGACIO=41, 
		TK_AND=42, TK_OR=43, TK_ASSIGNACIO=44, TK_SI=45, TK_LLAVORS=46, TK_ALTRAMENT=47, 
		TK_FSI=48, TK_PER=49, TK_ID=50, TK_FINS=51, TK_FER=52, TK_FPER=53, TK_MENTRE=54, 
		TK_FMENTRE=55, TK_LLEGIR=56, TK_ESCRIURE=57;
	public static final int
		RULE_inici = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"inici"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "';'", "'programa'", "'fprograma'", "'periode'", 
			null, null, null, null, null, "'tipus'", "'ftipus'", "':'", "'vector'", 
			"'tupla;'", "'accio'", "'faccio'", "'funcio'", "'ffuncio'", "'retorna'", 
			null, "'variables'", "'fvariables'", null, null, "'+'", "'-'", "'*'", 
			"'/'", "'\\'", "'%'", "'\\u00E2\\u02C6\\u00BC'", "'=='", "'!='", "'<'", 
			"'<='", "'>'", "'>='", "'no'", "'&'", "'|'", "':='", "'si'", "'llavors'", 
			"'altrament'", "'fsi'", "'per'", "'id'", "'fins'", "'fer'", "'fper'", 
			"'mentre'", "'fmentre'", "'llegir'", "'escriure'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TK_WS", "TK_LPAREN", "TK_RPAREN", "TK_SEMI", "TK_PC_PROGRAMA", 
			"TK_PC_FPROGRAMA", "TK_PC_PERIODE", "TK_ENTER", "TK_REAL", "TK_BOLEA", 
			"TK_IDENT", "TK_TIPUS_BASIC", "TK_TIPUS", "TK_FTIPUS", "TK_PUNTS", "TK_VECTOR", 
			"TK_TUPLA", "TK_ACCIO", "TK_FACCIO", "TK_FUNCIO", "TK_FFUNCIO", "TK_RETORNA", 
			"TK_PARAM", "TK_VARIABLES", "TK_FVARIABLES", "TK_VARIABLE", "TK_COMMENT", 
			"TK_SUMA", "TK_RESTA", "TK_MULTIPLICACIO", "TK_DIVISIO", "TK_DIV_ENTERA", 
			"TK_MODUL", "TK_MENYS_UNARI", "TK_IGUALTAT", "TK_DESIGUALTAT", "TK_MES_PETIT", 
			"TK_MES_PETIT_IG", "TK_MES_GRAN", "TK_MES_GRAN_IG", "TK_NEGACIO", "TK_AND", 
			"TK_OR", "TK_ASSIGNACIO", "TK_SI", "TK_LLAVORS", "TK_ALTRAMENT", "TK_FSI", 
			"TK_PER", "TK_ID", "TK_FINS", "TK_FER", "TK_FPER", "TK_MENTRE", "TK_FMENTRE", 
			"TK_LLEGIR", "TK_ESCRIURE"
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

	public provaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IniciContext extends ParserRuleContext {
		public List<TerminalNode> EOF() { return getTokens(provaParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(provaParser.EOF, i);
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
			setState(3); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2);
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
				setState(5); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376151711742L) != 0) );
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
		"\u0004\u00019\b\u0002\u0000\u0007\u0000\u0001\u0000\u0004\u0000\u0004"+
		"\b\u0000\u000b\u0000\f\u0000\u0005\u0001\u0000\u0000\u0000\u0001\u0000"+
		"\u0000\u0001\u0000\u0001\u0007\u0000\u0003\u0001\u0000\u0000\u0000\u0002"+
		"\u0004\b\u0000\u0000\u0000\u0003\u0002\u0001\u0000\u0000\u0000\u0004\u0005"+
		"\u0001\u0000\u0000\u0000\u0005\u0003\u0001\u0000\u0000\u0000\u0005\u0006"+
		"\u0001\u0000\u0000\u0000\u0006\u0001\u0001\u0000\u0000\u0000\u0001\u0005";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}