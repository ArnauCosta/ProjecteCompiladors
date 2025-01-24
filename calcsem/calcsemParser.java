// Generated from calcsem.g4 by ANTLR 4.13.2

    import java.io.*;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class calcsemParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LPAREN=2, RPAREN=3, STAR=4, DIV=5, PLUS=6, MINUS=7, SEMI=8, TK_CONSTANT_REAL=9, 
		TK_CONSTANT_ENTERA=10;
	public static final int
		RULE_lexpressions = 0, RULE_expr = 1, RULE_terme = 2, RULE_factor = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"lexpressions", "expr", "terme", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'*'", "'/'", "'+'", "'-'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LPAREN", "RPAREN", "STAR", "DIV", "PLUS", "MINUS", "SEMI", 
			"TK_CONSTANT_REAL", "TK_CONSTANT_ENTERA"
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
	public String getGrammarFileName() { return "calcsem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	         SymTable<Registre> TS = new SymTable<Registre>(1000);   
	         boolean error = false;        
	         
	         //override method    
	         public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e)    {            
	              super.notifyErrorListeners(offendingToken,msg,e);            
	              error=true;              
	         }

	public calcsemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LexpressionsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(calcsemParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(calcsemParser.SEMI, i);
		}
		public LexpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcsemListener ) ((calcsemListener)listener).enterLexpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcsemListener ) ((calcsemListener)listener).exitLexpressions(this);
		}
	}

	public final LexpressionsContext lexpressions() throws RecognitionException {
		LexpressionsContext _localctx = new LexpressionsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lexpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				expr();
				setState(9);
				match(SEMI);
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1540L) != 0) );
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
		public TermeContext t1;
		public Token s;
		public TermeContext t2;
		public List<TermeContext> terme() {
			return getRuleContexts(TermeContext.class);
		}
		public TermeContext terme(int i) {
			return getRuleContext(TermeContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(calcsemParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(calcsemParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(calcsemParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(calcsemParser.MINUS, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcsemListener ) ((calcsemListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcsemListener ) ((calcsemListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			((ExprContext)_localctx).t1 = terme();
			((ExprContext)_localctx).tipus = ((ExprContext)_localctx).t1.tipus;
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(17);
				((ExprContext)_localctx).s = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ExprContext)_localctx).s = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(18);
				((ExprContext)_localctx).t2 = terme();

				                    if(((ExprContext)_localctx).t1.tipus!=((ExprContext)_localctx).t2.tipus){
				                        error=true;
				                        System.out.println("Error de tipus detectat a la linia " + (((ExprContext)_localctx).s!=null?((ExprContext)_localctx).s.getLine():0));
				                    }
				                  
				}
				}
				setState(25);
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
	public static class TermeContext extends ParserRuleContext {
		public char tipus;
		public FactorContext t1;
		public Token s;
		public FactorContext t2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(calcsemParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(calcsemParser.STAR, i);
		}
		public List<TerminalNode> DIV() { return getTokens(calcsemParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(calcsemParser.DIV, i);
		}
		public TermeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcsemListener ) ((calcsemListener)listener).enterTerme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcsemListener ) ((calcsemListener)listener).exitTerme(this);
		}
	}

	public final TermeContext terme() throws RecognitionException {
		TermeContext _localctx = new TermeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_terme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			((TermeContext)_localctx).t1 = factor();
			((TermeContext)_localctx).tipus = ((TermeContext)_localctx).t1.tipus;
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR || _la==DIV) {
				{
				{
				setState(28);
				((TermeContext)_localctx).s = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==DIV) ) {
					((TermeContext)_localctx).s = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(29);
				((TermeContext)_localctx).t2 = factor();

				            if(((TermeContext)_localctx).t1.tipus!=((TermeContext)_localctx).t2.tipus){
				                error=true;
				                System.out.println("Error de tipus detectat a la linia " + (((TermeContext)_localctx).s!=null?((TermeContext)_localctx).s.getLine():0));
				            }
				        
				}
				}
				setState(36);
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
	public static class FactorContext extends ParserRuleContext {
		public char tipus;
		public Token a;
		public Token b;
		public ExprContext e;
		public TerminalNode TK_CONSTANT_ENTERA() { return getToken(calcsemParser.TK_CONSTANT_ENTERA, 0); }
		public TerminalNode TK_CONSTANT_REAL() { return getToken(calcsemParser.TK_CONSTANT_REAL, 0); }
		public TerminalNode LPAREN() { return getToken(calcsemParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(calcsemParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcsemListener ) ((calcsemListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcsemListener ) ((calcsemListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_factor);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CONSTANT_ENTERA:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				((FactorContext)_localctx).a = match(TK_CONSTANT_ENTERA);

				                              ((FactorContext)_localctx).tipus = 'E'; 
				                              if(!TS.existeix((((FactorContext)_localctx).a!=null?((FactorContext)_localctx).a.getText():null)))
				                                    TS.inserir((((FactorContext)_localctx).a!=null?((FactorContext)_localctx).a.getText():null),new Registre((((FactorContext)_localctx).a!=null?((FactorContext)_localctx).a.getText():null)));
				                
				}
				break;
			case TK_CONSTANT_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				((FactorContext)_localctx).b = match(TK_CONSTANT_REAL);

				                            ((FactorContext)_localctx).tipus = 'R';
				                            if(!TS.existeix((((FactorContext)_localctx).b!=null?((FactorContext)_localctx).b.getText():null)))
				                                    TS.inserir((((FactorContext)_localctx).b!=null?((FactorContext)_localctx).b.getText():null),new Registre((((FactorContext)_localctx).b!=null?((FactorContext)_localctx).b.getText():null)));
				                
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				match(LPAREN);
				setState(42);
				((FactorContext)_localctx).e = expr();
				((FactorContext)_localctx).tipus = ((FactorContext)_localctx).e.tipus;
				setState(44);
				match(RPAREN);
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

	public static final String _serializedATN =
		"\u0004\u0001\n1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0016\b\u0001"+
		"\n\u0001\f\u0001\u0019\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002!\b\u0002\n\u0002\f\u0002$\t"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003/\b\u0003\u0001"+
		"\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0002\u0001\u0000"+
		"\u0006\u0007\u0001\u0000\u0004\u00051\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0002\u000f\u0001\u0000\u0000\u0000\u0004\u001a\u0001\u0000\u0000\u0000"+
		"\u0006.\u0001\u0000\u0000\u0000\b\t\u0003\u0002\u0001\u0000\t\n\u0005"+
		"\b\u0000\u0000\n\f\u0001\u0000\u0000\u0000\u000b\b\u0001\u0000\u0000\u0000"+
		"\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001"+
		"\u0000\u0000\u0000\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0010\u0003"+
		"\u0004\u0002\u0000\u0010\u0017\u0006\u0001\uffff\uffff\u0000\u0011\u0012"+
		"\u0007\u0000\u0000\u0000\u0012\u0013\u0003\u0004\u0002\u0000\u0013\u0014"+
		"\u0006\u0001\uffff\uffff\u0000\u0014\u0016\u0001\u0000\u0000\u0000\u0015"+
		"\u0011\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017"+
		"\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018"+
		"\u0003\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0003\u0006\u0003\u0000\u001b\"\u0006\u0002\uffff\uffff\u0000\u001c"+
		"\u001d\u0007\u0001\u0000\u0000\u001d\u001e\u0003\u0006\u0003\u0000\u001e"+
		"\u001f\u0006\u0002\uffff\uffff\u0000\u001f!\u0001\u0000\u0000\u0000 \u001c"+
		"\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#\u0005\u0001\u0000\u0000\u0000$\"\u0001"+
		"\u0000\u0000\u0000%&\u0005\n\u0000\u0000&/\u0006\u0003\uffff\uffff\u0000"+
		"\'(\u0005\t\u0000\u0000(/\u0006\u0003\uffff\uffff\u0000)*\u0005\u0002"+
		"\u0000\u0000*+\u0003\u0002\u0001\u0000+,\u0006\u0003\uffff\uffff\u0000"+
		",-\u0005\u0003\u0000\u0000-/\u0001\u0000\u0000\u0000.%\u0001\u0000\u0000"+
		"\u0000.\'\u0001\u0000\u0000\u0000.)\u0001\u0000\u0000\u0000/\u0007\u0001"+
		"\u0000\u0000\u0000\u0004\r\u0017\".";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}