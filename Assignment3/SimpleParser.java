// Generated from Simple.g4 by ANTLR 4.4

import java.util.TreeMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, NUM=14, ID=15, WS=16;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "')'", "','", "'+'", "'let'", "'-'", "'*'", "'('", 
		"'print'", "'/'", "'='", "'}'", "'repeat'", "NUM", "ID", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_term = 2, RULE_factor = 3, RULE_repeatStmt = 4, 
		RULE_block = 5, RULE_stmt = 6, RULE_printStmt = 7, RULE_exprlist = 8, 
		RULE_assignStmt = 9, RULE_var = 10;
	public static final String[] ruleNames = {
		"prog", "expr", "term", "factor", "repeatStmt", "block", "stmt", "printStmt", 
		"exprlist", "assignStmt", "var"
	};

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		// The String is the variable name, and the Integer will be the register location
		public static TreeMap<String, Integer> decVars = new TreeMap<String, Integer>();
		public static TreeMap<String, Integer> loops = new TreeMap<String, Integer>();
		public static int nextLoop = 0;
		public static int nextRegister = 0;

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{

					System.out.println(".class public SimpleStuff");
					System.out.println(".super java/lang/Object");
					System.out.println(".method public <init>()V");
			  		System.out.println("aload_0");
			  		System.out.println("invokenonvirtual java/lang/Object/<init>()V");
			  		System.out.println("return");
					System.out.println(".end method\n");
					System.out.println(".method public static main([Ljava/lang/String;)V");
			  		System.out.println(".limit stack 10");
			  		System.out.println(".limit locals 10");
				
			setState(23); block();

					System.out.println("return\n.end method");
				
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26); term();
				  
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(28); match(T__9);
					setState(29); term();
					 System.out.println("iadd"); 
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37); term();
				  
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(39); match(T__7);
					setState(40); term();
					 System.out.println("isub"); 
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		int _la;
		try {
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50); factor();
				 
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(52); match(T__6);
					setState(53); factor();
					 System.out.println("imul"); 
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); factor();
				 
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(63); match(T__3);
					setState(64); factor();
					 System.out.println("idiv"); 
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class FactorContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_factor);
		try {
			setState(79);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); match(T__5);
				setState(75); expr();
				setState(76); match(T__11);
				}
				break;
			case NUM:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); var();
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

	public static class RepeatStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RepeatStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStmt; }
	}

	public final RepeatStmtContext repeatStmt() throws RecognitionException {
		RepeatStmtContext _localctx = new RepeatStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_repeatStmt);

		    		int x = 0;
				int i = 0;
				int l = 0;
			
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(T__0);

						i = nextRegister;
						decVars.put(String.valueOf(nextRegister), nextRegister);
						System.out.println("ldc 0");
			  			System.out.println("istore " + decVars.get(String.valueOf(nextRegister++)));
					
			setState(83); expr();
			setState(84); match(T__12);

						x = nextRegister;
						l = nextLoop;
						decVars.put(String.valueOf(nextRegister), nextRegister);
						System.out.println("istore " + decVars.get(String.valueOf(nextRegister++)));
						loops.put(String.valueOf(nextLoop), nextLoop);
						System.out.println("loop" + loops.get(String.valueOf(nextLoop++)) + ":");
					
			setState(86); block();
			setState(87); match(T__1);

						System.out.println("iinc " +  decVars.get(String.valueOf(i)) + " " + 1);
			  			System.out.println("iload " + decVars.get(String.valueOf(i)));
			  			System.out.println("iload " + decVars.get(String.valueOf(x)));
						System.out.println("if_icmplt loop" + loops.get(String.valueOf(l)));
					
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

	public static class BlockContext extends ParserRuleContext {
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90); stmt();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__4) | (1L << T__0))) != 0) );
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

	public static class StmtContext extends ParserRuleContext {
		public RepeatStmtContext repeatStmt() {
			return getRuleContext(RepeatStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(100);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); printStmt();

						System.out.println("; newline after a statement");
						System.out.println("getstatic java/lang/System/out Ljava/io/PrintStream;");
						System.out.println("ldc \"\\n\"");
						System.out.println("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
					
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); assignStmt();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(99); repeatStmt();
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

	public static class PrintStmtContext extends ParserRuleContext {
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(T__4);
			setState(103); match(T__5);
			setState(104); exprlist();
			setState(105); match(T__11);
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

	public static class ExprlistContext extends ParserRuleContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exprlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{

							System.out.println("getstatic java/lang/System/out Ljava/io/PrintStream;");
						
					setState(108); ((ExprlistContext)_localctx).e1 = expr();
					setState(109); match(T__10);
					 

					    			System.out.println("invokevirtual java/io/PrintStream/print(I)V");
							
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}

					System.out.println(" ; print a space inbetween each result");
					System.out.println("getstatic java/lang/System/out Ljava/io/PrintStream;");
					System.out.println("ldc \" \"");
					System.out.println("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
					
					System.out.println("; Print the value");
					System.out.println("getstatic java/lang/System/out Ljava/io/PrintStream;");
				
			setState(118); ((ExprlistContext)_localctx).e2 = expr();

			    		System.out.println("invokevirtual java/io/PrintStream/print(I)V");
				
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

	public static class AssignStmtContext extends ParserRuleContext {
		public Token ID;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(T__8);
			setState(122); ((AssignStmtContext)_localctx).ID = match(ID);
			setState(123); match(T__2);
			setState(124); expr();
			 
						if(!decVars.containsKey(((AssignStmtContext)_localctx).ID.getText()))
							decVars.put( ((AssignStmtContext)_localctx).ID.getText(), nextRegister++);
						System.out.println("istore " + decVars.get(((AssignStmtContext)_localctx).ID.getText()));
					
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

	public static class VarContext extends ParserRuleContext {
		public Token x;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode NUM() { return getToken(SimpleParser.NUM, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var);
		try {
			setState(131);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(127); ((VarContext)_localctx).x = match(ID);
				 
							System.out.println("; load the variable from the register");
							System.out.println("iload " + decVars.get(((VarContext)_localctx).x.getText()));
						
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); ((VarContext)_localctx).x = match(NUM);
				 
							System.out.println("ldc " + ((VarContext)_localctx).x.getText());
						
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22\u0088\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\5\3\63\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4F\n\4\f\4\16\4I\13\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\6\7^\n\7\r\7\16\7_\3\b\3\b\3\b\3\b"+
		"\3\b\5\bg\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\ns\n\n\f\n\16"+
		"\nv\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\5\f\u0086\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\u0088\2\30\3\2"+
		"\2\2\4\62\3\2\2\2\6J\3\2\2\2\bQ\3\2\2\2\nS\3\2\2\2\f]\3\2\2\2\16f\3\2"+
		"\2\2\20h\3\2\2\2\22t\3\2\2\2\24{\3\2\2\2\26\u0085\3\2\2\2\30\31\b\2\1"+
		"\2\31\32\5\f\7\2\32\33\b\2\1\2\33\3\3\2\2\2\34\35\5\6\4\2\35$\b\3\1\2"+
		"\36\37\7\6\2\2\37 \5\6\4\2 !\b\3\1\2!#\3\2\2\2\"\36\3\2\2\2#&\3\2\2\2"+
		"$\"\3\2\2\2$%\3\2\2\2%\63\3\2\2\2&$\3\2\2\2\'(\5\6\4\2(/\b\3\1\2)*\7\b"+
		"\2\2*+\5\6\4\2+,\b\3\1\2,.\3\2\2\2-)\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60"+
		"\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\62\34\3\2\2\2\62\'\3\2\2\2\63\5\3\2"+
		"\2\2\64\65\5\b\5\2\65<\b\4\1\2\66\67\7\t\2\2\678\5\b\5\289\b\4\1\29;\3"+
		"\2\2\2:\66\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=K\3\2\2\2><\3\2\2\2?"+
		"@\5\b\5\2@G\b\4\1\2AB\7\f\2\2BC\5\b\5\2CD\b\4\1\2DF\3\2\2\2EA\3\2\2\2"+
		"FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HK\3\2\2\2IG\3\2\2\2J\64\3\2\2\2J?\3\2\2"+
		"\2K\7\3\2\2\2LM\7\n\2\2MN\5\4\3\2NO\7\4\2\2OR\3\2\2\2PR\5\26\f\2QL\3\2"+
		"\2\2QP\3\2\2\2R\t\3\2\2\2ST\7\17\2\2TU\b\6\1\2UV\5\4\3\2VW\7\3\2\2WX\b"+
		"\6\1\2XY\5\f\7\2YZ\7\16\2\2Z[\b\6\1\2[\13\3\2\2\2\\^\5\16\b\2]\\\3\2\2"+
		"\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\r\3\2\2\2ab\5\20\t\2bc\b\b\1\2cg\3\2"+
		"\2\2dg\5\24\13\2eg\5\n\6\2fa\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\17\3\2\2\2h"+
		"i\7\13\2\2ij\7\n\2\2jk\5\22\n\2kl\7\4\2\2l\21\3\2\2\2mn\b\n\1\2no\5\4"+
		"\3\2op\7\5\2\2pq\b\n\1\2qs\3\2\2\2rm\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2"+
		"\2\2uw\3\2\2\2vt\3\2\2\2wx\b\n\1\2xy\5\4\3\2yz\b\n\1\2z\23\3\2\2\2{|\7"+
		"\7\2\2|}\7\21\2\2}~\7\r\2\2~\177\5\4\3\2\177\u0080\b\13\1\2\u0080\25\3"+
		"\2\2\2\u0081\u0082\7\21\2\2\u0082\u0086\b\f\1\2\u0083\u0084\7\20\2\2\u0084"+
		"\u0086\b\f\1\2\u0085\u0081\3\2\2\2\u0085\u0083\3\2\2\2\u0086\27\3\2\2"+
		"\2\r$/\62<GJQ_ft\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}