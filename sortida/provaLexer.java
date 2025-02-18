// Generated from prova.g4 by ANTLR 4.13.2

    import java.io.*;
    import java.lang.Object;
    import java.util.Vector;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class provaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TK_WS", "TK_LCLAU", "TK_RCLAU", "TK_LPAREN", "TK_RPAREN", "TK_LBRACKET", 
			"TK_RBRACKET", "TK_SEMI", "TK_PC_PROGRAMA", "TK_PC_FPROGRAMA", "TK_PC_PERIODE", 
			"TK_TIPUS", "TK_FTIPUS", "TK_PUNTS", "TK_VECTOR", "TK_TUPLA", "TK_FTUPLA", 
			"DIGIT", "LLETRA", "TK_ENTER", "TK_REAL", "TK_BOLEA", "TK_TIPUS_BASIC", 
			"TK_ACCIO", "TK_FACCIO", "TK_FUNCIO", "TK_FFUNCIO", "TK_RETORNA", "ENT_SOR", 
			"TK_PARAM", "TK_VARIABLES", "TK_FVARIABLES", "TK_VARIABLE", "TK_COMMENT", 
			"TK_COMA", "TK_PUNT", "TK_SUMA", "TK_RESTA", "TK_MULTIPLICACIO", "TK_DIVISIO", 
			"TK_DIV_ENTERA", "TK_MODUL", "TK_MENYS_UNARI", "TK_IGUALTAT", "TK_DESIGUALTAT", 
			"TK_MES_PETIT", "TK_MES_PETIT_IG", "TK_MES_GRAN", "TK_MES_GRAN_IG", "TK_NEGACIO", 
			"TK_AND", "TK_OR", "TK_DOSPUNTS", "TK_ASSIGNACIO", "TK_SI", "TK_LLAVORS", 
			"TK_ALTRAMENT", "TK_FSI", "TK_EN", "TK_LN", "TK_PER", "TK_ID", "TK_FINS", 
			"TK_FER", "TK_FPER", "TK_MENTRE", "TK_FMENTRE", "TK_LLEGIR", "TK_ESCRIURE", 
			"TK_IDENT"
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
			"'\\u223C'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'no'", "'&'", 
			"'|'", "'..'", "':='", "'si'", "'llavors'", "'altrament'", "'fsi'", "'en'", 
			"'ln'", "'per'", "'id'", "'fins'", "'fer'", "'fper'", "'mentre'", "'fmentre'", 
			"'llegir'", "'escriure'"
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


	public provaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "prova.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 8:
			TK_PC_PROGRAMA_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TK_PC_PROGRAMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("he reconegut programa");
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000C\u023b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007"+
		"D\u0002E\u0007E\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004"+
		"\u0000\u0092\b\u0000\u000b\u0000\f\u0000\u0093\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00ee\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u00f3\b\u0013\n\u0013\f\u0013\u00f6\t\u0013\u0003\u0013"+
		"\u00f8\b\u0013\u0001\u0014\u0003\u0014\u00fb\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0004\u0014\u00ff\b\u0014\u000b\u0014\f\u0014\u0100\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0004\u0014\u0106\b\u0014\u000b\u0014\f\u0014"+
		"\u0107\u0003\u0014\u010a\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u010e"+
		"\b\u0014\u0001\u0014\u0004\u0014\u0111\b\u0014\u000b\u0014\f\u0014\u0112"+
		"\u0003\u0014\u0115\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u011f\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0130\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u015f\b\u001c\u0001\u001d\u0003\u001d"+
		"\u0162\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u0169\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u016f\b\u001d\n\u001d\f\u001d\u0172\t\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0005 \u018d\b \n \f \u0190"+
		"\t \u0001 \u0001 \u0001 \u0004 \u0195\b \u000b \f \u0196\u0001!\u0001"+
		"!\u0001!\u0001!\u0005!\u019d\b!\n!\f!\u01a0\t!\u0001!\u0001!\u0001!\u0001"+
		"!\u0005!\u01a6\b!\n!\f!\u01a9\t!\u0001!\u0001!\u0003!\u01ad\b!\u0001!"+
		"\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001"+
		".\u0001/\u0001/\u00010\u00010\u00010\u00011\u00011\u00011\u00012\u0001"+
		"2\u00013\u00013\u00014\u00014\u00014\u00015\u00015\u00015\u00016\u0001"+
		"6\u00016\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"9\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001"+
		"<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001E\u0001E\u0001E\u0001E\u0005E\u0237\bE\nE\fE\u023a\tE\u0001"+
		"\u01a7\u0000F\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0000%\u0000\'\u0012)\u0013"+
		"+\u0014-\u0015/\u00161\u00173\u00185\u00197\u001a9\u0000;\u001b=\u001c"+
		"?\u001dA\u001eC\u001fE G!I\"K#M$O%Q&S\'U(W)Y*[+],_-a.c/e0g1i2k3m4o5q6"+
		"s7u8w9y:{;}<\u007f=\u0081>\u0083?\u0085@\u0087A\u0089B\u008bC\u0001\u0000"+
		"\u0005\u0002\u0000\n\n\r\r\u0002\u0000AZaz\u0002\u0000++--\u0002\u0000"+
		"EEee\u0002\u000000__\u0256\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000"+
		"=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001"+
		"\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000"+
		"\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000"+
		"K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001"+
		"\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000"+
		"\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000"+
		"Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001"+
		"\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000"+
		"\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000"+
		"g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001"+
		"\u0000\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000"+
		"\u0000\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0000"+
		"u\u0001\u0000\u0000\u0000\u0000w\u0001\u0000\u0000\u0000\u0000y\u0001"+
		"\u0000\u0000\u0000\u0000{\u0001\u0000\u0000\u0000\u0000}\u0001\u0000\u0000"+
		"\u0000\u0000\u007f\u0001\u0000\u0000\u0000\u0000\u0081\u0001\u0000\u0000"+
		"\u0000\u0000\u0083\u0001\u0000\u0000\u0000\u0000\u0085\u0001\u0000\u0000"+
		"\u0000\u0000\u0087\u0001\u0000\u0000\u0000\u0000\u0089\u0001\u0000\u0000"+
		"\u0000\u0000\u008b\u0001\u0000\u0000\u0000\u0001\u0091\u0001\u0000\u0000"+
		"\u0000\u0003\u0097\u0001\u0000\u0000\u0000\u0005\u0099\u0001\u0000\u0000"+
		"\u0000\u0007\u009b\u0001\u0000\u0000\u0000\t\u009d\u0001\u0000\u0000\u0000"+
		"\u000b\u009f\u0001\u0000\u0000\u0000\r\u00a1\u0001\u0000\u0000\u0000\u000f"+
		"\u00a3\u0001\u0000\u0000\u0000\u0011\u00a5\u0001\u0000\u0000\u0000\u0013"+
		"\u00b0\u0001\u0000\u0000\u0000\u0015\u00ba\u0001\u0000\u0000\u0000\u0017"+
		"\u00c2\u0001\u0000\u0000\u0000\u0019\u00c8\u0001\u0000\u0000\u0000\u001b"+
		"\u00cf\u0001\u0000\u0000\u0000\u001d\u00d1\u0001\u0000\u0000\u0000\u001f"+
		"\u00d8\u0001\u0000\u0000\u0000!\u00df\u0001\u0000\u0000\u0000#\u00e7\u0001"+
		"\u0000\u0000\u0000%\u00e9\u0001\u0000\u0000\u0000\'\u00f7\u0001\u0000"+
		"\u0000\u0000)\u00fa\u0001\u0000\u0000\u0000+\u011e\u0001\u0000\u0000\u0000"+
		"-\u012f\u0001\u0000\u0000\u0000/\u0131\u0001\u0000\u0000\u00001\u0137"+
		"\u0001\u0000\u0000\u00003\u013e\u0001\u0000\u0000\u00005\u0145\u0001\u0000"+
		"\u0000\u00007\u014d\u0001\u0000\u0000\u00009\u015e\u0001\u0000\u0000\u0000"+
		";\u0161\u0001\u0000\u0000\u0000=\u0173\u0001\u0000\u0000\u0000?\u017d"+
		"\u0001\u0000\u0000\u0000A\u0194\u0001\u0000\u0000\u0000C\u01ac\u0001\u0000"+
		"\u0000\u0000E\u01b0\u0001\u0000\u0000\u0000G\u01b2\u0001\u0000\u0000\u0000"+
		"I\u01b4\u0001\u0000\u0000\u0000K\u01b6\u0001\u0000\u0000\u0000M\u01b8"+
		"\u0001\u0000\u0000\u0000O\u01ba\u0001\u0000\u0000\u0000Q\u01bc\u0001\u0000"+
		"\u0000\u0000S\u01be\u0001\u0000\u0000\u0000U\u01c0\u0001\u0000\u0000\u0000"+
		"W\u01c2\u0001\u0000\u0000\u0000Y\u01c5\u0001\u0000\u0000\u0000[\u01c8"+
		"\u0001\u0000\u0000\u0000]\u01ca\u0001\u0000\u0000\u0000_\u01cd\u0001\u0000"+
		"\u0000\u0000a\u01cf\u0001\u0000\u0000\u0000c\u01d2\u0001\u0000\u0000\u0000"+
		"e\u01d5\u0001\u0000\u0000\u0000g\u01d7\u0001\u0000\u0000\u0000i\u01d9"+
		"\u0001\u0000\u0000\u0000k\u01dc\u0001\u0000\u0000\u0000m\u01df\u0001\u0000"+
		"\u0000\u0000o\u01e2\u0001\u0000\u0000\u0000q\u01ea\u0001\u0000\u0000\u0000"+
		"s\u01f4\u0001\u0000\u0000\u0000u\u01f8\u0001\u0000\u0000\u0000w\u01fb"+
		"\u0001\u0000\u0000\u0000y\u01fe\u0001\u0000\u0000\u0000{\u0202\u0001\u0000"+
		"\u0000\u0000}\u0205\u0001\u0000\u0000\u0000\u007f\u020a\u0001\u0000\u0000"+
		"\u0000\u0081\u020e\u0001\u0000\u0000\u0000\u0083\u0213\u0001\u0000\u0000"+
		"\u0000\u0085\u021a\u0001\u0000\u0000\u0000\u0087\u0222\u0001\u0000\u0000"+
		"\u0000\u0089\u0229\u0001\u0000\u0000\u0000\u008b\u0232\u0001\u0000\u0000"+
		"\u0000\u008d\u0092\u0005 \u0000\u0000\u008e\u008f\u0005\t\u0000\u0000"+
		"\u008f\u0092\u0005 \u0000\u0000\u0090\u0092\u0007\u0000\u0000\u0000\u0091"+
		"\u008d\u0001\u0000\u0000\u0000\u0091\u008e\u0001\u0000\u0000\u0000\u0091"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0006\u0000\u0000\u0000\u0096"+
		"\u0002\u0001\u0000\u0000\u0000\u0097\u0098\u0005[\u0000\u0000\u0098\u0004"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0005]\u0000\u0000\u009a\u0006\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005(\u0000\u0000\u009c\b\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005)\u0000\u0000\u009e\n\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0005{\u0000\u0000\u00a0\f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0005}\u0000\u0000\u00a2\u000e\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0005;\u0000\u0000\u00a4\u0010\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0005p\u0000\u0000\u00a6\u00a7\u0005r\u0000\u0000\u00a7\u00a8\u0005o"+
		"\u0000\u0000\u00a8\u00a9\u0005g\u0000\u0000\u00a9\u00aa\u0005r\u0000\u0000"+
		"\u00aa\u00ab\u0005a\u0000\u0000\u00ab\u00ac\u0005m\u0000\u0000\u00ac\u00ad"+
		"\u0005a\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0006"+
		"\b\u0001\u0000\u00af\u0012\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005f"+
		"\u0000\u0000\u00b1\u00b2\u0005p\u0000\u0000\u00b2\u00b3\u0005r\u0000\u0000"+
		"\u00b3\u00b4\u0005o\u0000\u0000\u00b4\u00b5\u0005g\u0000\u0000\u00b5\u00b6"+
		"\u0005r\u0000\u0000\u00b6\u00b7\u0005a\u0000\u0000\u00b7\u00b8\u0005m"+
		"\u0000\u0000\u00b8\u00b9\u0005a\u0000\u0000\u00b9\u0014\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0005p\u0000\u0000\u00bb\u00bc\u0005e\u0000\u0000\u00bc"+
		"\u00bd\u0005r\u0000\u0000\u00bd\u00be\u0005i\u0000\u0000\u00be\u00bf\u0005"+
		"o\u0000\u0000\u00bf\u00c0\u0005d\u0000\u0000\u00c0\u00c1\u0005e\u0000"+
		"\u0000\u00c1\u0016\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005t\u0000\u0000"+
		"\u00c3\u00c4\u0005i\u0000\u0000\u00c4\u00c5\u0005p\u0000\u0000\u00c5\u00c6"+
		"\u0005u\u0000\u0000\u00c6\u00c7\u0005s\u0000\u0000\u00c7\u0018\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0005f\u0000\u0000\u00c9\u00ca\u0005t\u0000\u0000"+
		"\u00ca\u00cb\u0005i\u0000\u0000\u00cb\u00cc\u0005p\u0000\u0000\u00cc\u00cd"+
		"\u0005u\u0000\u0000\u00cd\u00ce\u0005s\u0000\u0000\u00ce\u001a\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0005:\u0000\u0000\u00d0\u001c\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0005v\u0000\u0000\u00d2\u00d3\u0005e\u0000\u0000\u00d3"+
		"\u00d4\u0005c\u0000\u0000\u00d4\u00d5\u0005t\u0000\u0000\u00d5\u00d6\u0005"+
		"o\u0000\u0000\u00d6\u00d7\u0005r\u0000\u0000\u00d7\u001e\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0005t\u0000\u0000\u00d9\u00da\u0005u\u0000\u0000\u00da"+
		"\u00db\u0005p\u0000\u0000\u00db\u00dc\u0005l\u0000\u0000\u00dc\u00dd\u0005"+
		"a\u0000\u0000\u00dd\u00de\u0005;\u0000\u0000\u00de \u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0005f\u0000\u0000\u00e0\u00e1\u0005t\u0000\u0000\u00e1"+
		"\u00e2\u0005u\u0000\u0000\u00e2\u00e3\u0005p\u0000\u0000\u00e3\u00e4\u0005"+
		"l\u0000\u0000\u00e4\u00e5\u0005a\u0000\u0000\u00e5\u00e6\u0005;\u0000"+
		"\u0000\u00e6\"\u0001\u0000\u0000\u0000\u00e7\u00e8\u000219\u0000\u00e8"+
		"$\u0001\u0000\u0000\u0000\u00e9\u00ea\u0007\u0001\u0000\u0000\u00ea&\u0001"+
		"\u0000\u0000\u0000\u00eb\u00f8\u00050\u0000\u0000\u00ec\u00ee\u0007\u0002"+
		"\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f4\u0003#\u0011"+
		"\u0000\u00f0\u00f3\u0003#\u0011\u0000\u00f1\u00f3\u00050\u0000\u0000\u00f2"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f7\u00eb\u0001\u0000\u0000\u0000\u00f7"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f8(\u0001\u0000\u0000\u0000\u00f9\u00fb"+
		"\u0007\u0002\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00ff"+
		"\u0003#\u0011\u0000\u00fd\u00ff\u00050\u0000\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000"+
		"\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000"+
		"\u0000\u0000\u0101\u0109\u0001\u0000\u0000\u0000\u0102\u0105\u0005.\u0000"+
		"\u0000\u0103\u0106\u0003#\u0011\u0000\u0104\u0106\u00050\u0000\u0000\u0105"+
		"\u0103\u0001\u0000\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0001\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109"+
		"\u0102\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"+
		"\u0114\u0001\u0000\u0000\u0000\u010b\u010d\u0007\u0003\u0000\u0000\u010c"+
		"\u010e\u0007\u0002\u0000\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f"+
		"\u0111\u0003#\u0011\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0112"+
		"\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u010b"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115*\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0005C\u0000\u0000\u0117\u0118\u0005e\u0000"+
		"\u0000\u0118\u0119\u0005r\u0000\u0000\u0119\u011f\u0005t\u0000\u0000\u011a"+
		"\u011b\u0005F\u0000\u0000\u011b\u011c\u0005a\u0000\u0000\u011c\u011d\u0005"+
		"l\u0000\u0000\u011d\u011f\u0005s\u0000\u0000\u011e\u0116\u0001\u0000\u0000"+
		"\u0000\u011e\u011a\u0001\u0000\u0000\u0000\u011f,\u0001\u0000\u0000\u0000"+
		"\u0120\u0121\u0005e\u0000\u0000\u0121\u0122\u0005n\u0000\u0000\u0122\u0123"+
		"\u0005t\u0000\u0000\u0123\u0124\u0005e\u0000\u0000\u0124\u0130\u0005r"+
		"\u0000\u0000\u0125\u0126\u0005r\u0000\u0000\u0126\u0127\u0005e\u0000\u0000"+
		"\u0127\u0128\u0005a\u0000\u0000\u0128\u0130\u0005l\u0000\u0000\u0129\u012a"+
		"\u0005b\u0000\u0000\u012a\u012b\u0005o\u0000\u0000\u012b\u012c\u0005o"+
		"\u0000\u0000\u012c\u012d\u0005l\u0000\u0000\u012d\u012e\u0005e\u0000\u0000"+
		"\u012e\u0130\u0005a\u0000\u0000\u012f\u0120\u0001\u0000\u0000\u0000\u012f"+
		"\u0125\u0001\u0000\u0000\u0000\u012f\u0129\u0001\u0000\u0000\u0000\u0130"+
		".\u0001\u0000\u0000\u0000\u0131\u0132\u0005a\u0000\u0000\u0132\u0133\u0005"+
		"c\u0000\u0000\u0133\u0134\u0005c\u0000\u0000\u0134\u0135\u0005i\u0000"+
		"\u0000\u0135\u0136\u0005o\u0000\u0000\u01360\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0005f\u0000\u0000\u0138\u0139\u0005a\u0000\u0000\u0139\u013a\u0005"+
		"c\u0000\u0000\u013a\u013b\u0005c\u0000\u0000\u013b\u013c\u0005i\u0000"+
		"\u0000\u013c\u013d\u0005o\u0000\u0000\u013d2\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0005f\u0000\u0000\u013f\u0140\u0005u\u0000\u0000\u0140\u0141\u0005"+
		"n\u0000\u0000\u0141\u0142\u0005c\u0000\u0000\u0142\u0143\u0005i\u0000"+
		"\u0000\u0143\u0144\u0005o\u0000\u0000\u01444\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0005f\u0000\u0000\u0146\u0147\u0005f\u0000\u0000\u0147\u0148\u0005"+
		"u\u0000\u0000\u0148\u0149\u0005n\u0000\u0000\u0149\u014a\u0005c\u0000"+
		"\u0000\u014a\u014b\u0005i\u0000\u0000\u014b\u014c\u0005o\u0000\u0000\u014c"+
		"6\u0001\u0000\u0000\u0000\u014d\u014e\u0005r\u0000\u0000\u014e\u014f\u0005"+
		"e\u0000\u0000\u014f\u0150\u0005t\u0000\u0000\u0150\u0151\u0005o\u0000"+
		"\u0000\u0151\u0152\u0005r\u0000\u0000\u0152\u0153\u0005n\u0000\u0000\u0153"+
		"\u0154\u0005a\u0000\u0000\u01548\u0001\u0000\u0000\u0000\u0155\u0156\u0005"+
		"e\u0000\u0000\u0156\u0157\u0005n\u0000\u0000\u0157\u015f\u0005t\u0000"+
		"\u0000\u0158\u0159\u0005e\u0000\u0000\u0159\u015a\u0005n\u0000\u0000\u015a"+
		"\u015b\u0005t\u0000\u0000\u015b\u015c\u0005s\u0000\u0000\u015c\u015d\u0005"+
		"o\u0000\u0000\u015d\u015f\u0005r\u0000\u0000\u015e\u0155\u0001\u0000\u0000"+
		"\u0000\u015e\u0158\u0001\u0000\u0000\u0000\u015f:\u0001\u0000\u0000\u0000"+
		"\u0160\u0162\u00039\u001c\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0003\u008bE\u0000\u0164\u0165\u0005:\u0000\u0000\u0165\u0170\u0003"+
		"-\u0016\u0000\u0166\u0168\u0005,\u0000\u0000\u0167\u0169\u00039\u001c"+
		"\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0003\u008bE\u0000"+
		"\u016b\u016c\u0005:\u0000\u0000\u016c\u016d\u0003-\u0016\u0000\u016d\u016f"+
		"\u0001\u0000\u0000\u0000\u016e\u0166\u0001\u0000\u0000\u0000\u016f\u0172"+
		"\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171"+
		"\u0001\u0000\u0000\u0000\u0171<\u0001\u0000\u0000\u0000\u0172\u0170\u0001"+
		"\u0000\u0000\u0000\u0173\u0174\u0005v\u0000\u0000\u0174\u0175\u0005a\u0000"+
		"\u0000\u0175\u0176\u0005r\u0000\u0000\u0176\u0177\u0005i\u0000\u0000\u0177"+
		"\u0178\u0005a\u0000\u0000\u0178\u0179\u0005b\u0000\u0000\u0179\u017a\u0005"+
		"l\u0000\u0000\u017a\u017b\u0005e\u0000\u0000\u017b\u017c\u0005s\u0000"+
		"\u0000\u017c>\u0001\u0000\u0000\u0000\u017d\u017e\u0005f\u0000\u0000\u017e"+
		"\u017f\u0005v\u0000\u0000\u017f\u0180\u0005a\u0000\u0000\u0180\u0181\u0005"+
		"r\u0000\u0000\u0181\u0182\u0005i\u0000\u0000\u0182\u0183\u0005a\u0000"+
		"\u0000\u0183\u0184\u0005b\u0000\u0000\u0184\u0185\u0005l\u0000\u0000\u0185"+
		"\u0186\u0005e\u0000\u0000\u0186\u0187\u0005s\u0000\u0000\u0187@\u0001"+
		"\u0000\u0000\u0000\u0188\u018e\u0003\u008bE\u0000\u0189\u018a\u0003E\""+
		"\u0000\u018a\u018b\u0003\u008bE\u0000\u018b\u018d\u0001\u0000\u0000\u0000"+
		"\u018c\u0189\u0001\u0000\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000"+
		"\u018e\u018c\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000"+
		"\u018f\u0191\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000"+
		"\u0191\u0192\u0005:\u0000\u0000\u0192\u0193\u0003-\u0016\u0000\u0193\u0195"+
		"\u0001\u0000\u0000\u0000\u0194\u0188\u0001\u0000\u0000\u0000\u0195\u0196"+
		"\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196\u0197"+
		"\u0001\u0000\u0000\u0000\u0197B\u0001\u0000\u0000\u0000\u0198\u0199\u0005"+
		"/\u0000\u0000\u0199\u019a\u0005/\u0000\u0000\u019a\u019e\u0001\u0000\u0000"+
		"\u0000\u019b\u019d\b\u0000\u0000\u0000\u019c\u019b\u0001\u0000\u0000\u0000"+
		"\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01ad\u0001\u0000\u0000\u0000"+
		"\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005/\u0000\u0000\u01a2"+
		"\u01a3\u0005*\u0000\u0000\u01a3\u01a7\u0001\u0000\u0000\u0000\u01a4\u01a6"+
		"\t\u0000\u0000\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0005*\u0000\u0000\u01ab\u01ad\u0005/\u0000"+
		"\u0000\u01ac\u0198\u0001\u0000\u0000\u0000\u01ac\u01a1\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0006!\u0000\u0000"+
		"\u01afD\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005,\u0000\u0000\u01b1F"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005.\u0000\u0000\u01b3H\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b5\u0005+\u0000\u0000\u01b5J\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b7\u0005-\u0000\u0000\u01b7L\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\u0005*\u0000\u0000\u01b9N\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005/"+
		"\u0000\u0000\u01bbP\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005\\\u0000"+
		"\u0000\u01bdR\u0001\u0000\u0000\u0000\u01be\u01bf\u0005%\u0000\u0000\u01bf"+
		"T\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005\u223c\u0000\u0000\u01c1V\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c3\u0005=\u0000\u0000\u01c3\u01c4\u0005=\u0000"+
		"\u0000\u01c4X\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005!\u0000\u0000\u01c6"+
		"\u01c7\u0005=\u0000\u0000\u01c7Z\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005"+
		"<\u0000\u0000\u01c9\\\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005<\u0000"+
		"\u0000\u01cb\u01cc\u0005=\u0000\u0000\u01cc^\u0001\u0000\u0000\u0000\u01cd"+
		"\u01ce\u0005>\u0000\u0000\u01ce`\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005"+
		">\u0000\u0000\u01d0\u01d1\u0005=\u0000\u0000\u01d1b\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d3\u0005n\u0000\u0000\u01d3\u01d4\u0005o\u0000\u0000\u01d4"+
		"d\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005&\u0000\u0000\u01d6f\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d8\u0005|\u0000\u0000\u01d8h\u0001\u0000\u0000"+
		"\u0000\u01d9\u01da\u0005.\u0000\u0000\u01da\u01db\u0005.\u0000\u0000\u01db"+
		"j\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005:\u0000\u0000\u01dd\u01de\u0005"+
		"=\u0000\u0000\u01del\u0001\u0000\u0000\u0000\u01df\u01e0\u0005s\u0000"+
		"\u0000\u01e0\u01e1\u0005i\u0000\u0000\u01e1n\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e3\u0005l\u0000\u0000\u01e3\u01e4\u0005l\u0000\u0000\u01e4\u01e5\u0005"+
		"a\u0000\u0000\u01e5\u01e6\u0005v\u0000\u0000\u01e6\u01e7\u0005o\u0000"+
		"\u0000\u01e7\u01e8\u0005r\u0000\u0000\u01e8\u01e9\u0005s\u0000\u0000\u01e9"+
		"p\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005a\u0000\u0000\u01eb\u01ec\u0005"+
		"l\u0000\u0000\u01ec\u01ed\u0005t\u0000\u0000\u01ed\u01ee\u0005r\u0000"+
		"\u0000\u01ee\u01ef\u0005a\u0000\u0000\u01ef\u01f0\u0005m\u0000\u0000\u01f0"+
		"\u01f1\u0005e\u0000\u0000\u01f1\u01f2\u0005n\u0000\u0000\u01f2\u01f3\u0005"+
		"t\u0000\u0000\u01f3r\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005f\u0000"+
		"\u0000\u01f5\u01f6\u0005s\u0000\u0000\u01f6\u01f7\u0005i\u0000\u0000\u01f7"+
		"t\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005e\u0000\u0000\u01f9\u01fa\u0005"+
		"n\u0000\u0000\u01fav\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005l\u0000"+
		"\u0000\u01fc\u01fd\u0005n\u0000\u0000\u01fdx\u0001\u0000\u0000\u0000\u01fe"+
		"\u01ff\u0005p\u0000\u0000\u01ff\u0200\u0005e\u0000\u0000\u0200\u0201\u0005"+
		"r\u0000\u0000\u0201z\u0001\u0000\u0000\u0000\u0202\u0203\u0005i\u0000"+
		"\u0000\u0203\u0204\u0005d\u0000\u0000\u0204|\u0001\u0000\u0000\u0000\u0205"+
		"\u0206\u0005f\u0000\u0000\u0206\u0207\u0005i\u0000\u0000\u0207\u0208\u0005"+
		"n\u0000\u0000\u0208\u0209\u0005s\u0000\u0000\u0209~\u0001\u0000\u0000"+
		"\u0000\u020a\u020b\u0005f\u0000\u0000\u020b\u020c\u0005e\u0000\u0000\u020c"+
		"\u020d\u0005r\u0000\u0000\u020d\u0080\u0001\u0000\u0000\u0000\u020e\u020f"+
		"\u0005f\u0000\u0000\u020f\u0210\u0005p\u0000\u0000\u0210\u0211\u0005e"+
		"\u0000\u0000\u0211\u0212\u0005r\u0000\u0000\u0212\u0082\u0001\u0000\u0000"+
		"\u0000\u0213\u0214\u0005m\u0000\u0000\u0214\u0215\u0005e\u0000\u0000\u0215"+
		"\u0216\u0005n\u0000\u0000\u0216\u0217\u0005t\u0000\u0000\u0217\u0218\u0005"+
		"r\u0000\u0000\u0218\u0219\u0005e\u0000\u0000\u0219\u0084\u0001\u0000\u0000"+
		"\u0000\u021a\u021b\u0005f\u0000\u0000\u021b\u021c\u0005m\u0000\u0000\u021c"+
		"\u021d\u0005e\u0000\u0000\u021d\u021e\u0005n\u0000\u0000\u021e\u021f\u0005"+
		"t\u0000\u0000\u021f\u0220\u0005r\u0000\u0000\u0220\u0221\u0005e\u0000"+
		"\u0000\u0221\u0086\u0001\u0000\u0000\u0000\u0222\u0223\u0005l\u0000\u0000"+
		"\u0223\u0224\u0005l\u0000\u0000\u0224\u0225\u0005e\u0000\u0000\u0225\u0226"+
		"\u0005g\u0000\u0000\u0226\u0227\u0005i\u0000\u0000\u0227\u0228\u0005r"+
		"\u0000\u0000\u0228\u0088\u0001\u0000\u0000\u0000\u0229\u022a\u0005e\u0000"+
		"\u0000\u022a\u022b\u0005s\u0000\u0000\u022b\u022c\u0005c\u0000\u0000\u022c"+
		"\u022d\u0005r\u0000\u0000\u022d\u022e\u0005i\u0000\u0000\u022e\u022f\u0005"+
		"u\u0000\u0000\u022f\u0230\u0005r\u0000\u0000\u0230\u0231\u0005e\u0000"+
		"\u0000\u0231\u008a\u0001\u0000\u0000\u0000\u0232\u0238\u0003%\u0012\u0000"+
		"\u0233\u0237\u0003%\u0012\u0000\u0234\u0237\u0003#\u0011\u0000\u0235\u0237"+
		"\u0007\u0004\u0000\u0000\u0236\u0233\u0001\u0000\u0000\u0000\u0236\u0234"+
		"\u0001\u0000\u0000\u0000\u0236\u0235\u0001\u0000\u0000\u0000\u0237\u023a"+
		"\u0001\u0000\u0000\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0238\u0239"+
		"\u0001\u0000\u0000\u0000\u0239\u008c\u0001\u0000\u0000\u0000\u023a\u0238"+
		"\u0001\u0000\u0000\u0000\u001d\u0000\u0091\u0093\u00ed\u00f2\u00f4\u00f7"+
		"\u00fa\u00fe\u0100\u0105\u0107\u0109\u010d\u0112\u0114\u011e\u012f\u015e"+
		"\u0161\u0168\u0170\u018e\u0196\u019e\u01a7\u01ac\u0236\u0238\u0002\u0006"+
		"\u0000\u0000\u0001\b\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}