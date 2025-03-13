// Generated from C:/Users/urak_/Documents/___1.felev(mesteri)/ModSoft/ANTLR/src/statemodel/StateModel.g4 by ANTLR 4.13.2
package statemodel.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class StateModelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STATES=1, INIT=2, ERROR=3, TRANSITIONS=4, TRANS=5, NORMAL=6, COLON=7, 
		TRANS_ARROW=8, COMMA=9, CURLY_START=10, CURLY_END=11, UPPER_CASE_ID=12, 
		LOWER_CASE_ID=13, WS=14, COMMENT=15, LINE_COMMENT=16;
	public static final int
		RULE_model = 0, RULE_statesAll = 1, RULE_stateWithModifier = 2, RULE_state = 3, 
		RULE_initState = 4, RULE_errorState = 5, RULE_transitionsAll = 6, RULE_instruction = 7, 
		RULE_schema = 8, RULE_modifier = 9, RULE_transition = 10, RULE_startState = 11, 
		RULE_endState = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "statesAll", "stateWithModifier", "state", "initState", "errorState", 
			"transitionsAll", "instruction", "schema", "modifier", "transition", 
			"startState", "endState"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'states'", "'initial'", "'error'", "'transitions'", "'trans'", 
			"'normal'", "':'", "'->'", "','", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STATES", "INIT", "ERROR", "TRANSITIONS", "TRANS", "NORMAL", "COLON", 
			"TRANS_ARROW", "COMMA", "CURLY_START", "CURLY_END", "UPPER_CASE_ID", 
			"LOWER_CASE_ID", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "StateModel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StateModelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModelContext extends ParserRuleContext {
		public StatesAllContext statesAll() {
			return getRuleContext(StatesAllContext.class,0);
		}
		public TransitionsAllContext transitionsAll() {
			return getRuleContext(TransitionsAllContext.class,0);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			statesAll();
			setState(27);
			transitionsAll();
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
	public static class StatesAllContext extends ParserRuleContext {
		public TerminalNode STATES() { return getToken(StateModelParser.STATES, 0); }
		public TerminalNode CURLY_START() { return getToken(StateModelParser.CURLY_START, 0); }
		public TerminalNode CURLY_END() { return getToken(StateModelParser.CURLY_END, 0); }
		public List<StateWithModifierContext> stateWithModifier() {
			return getRuleContexts(StateWithModifierContext.class);
		}
		public StateWithModifierContext stateWithModifier(int i) {
			return getRuleContext(StateWithModifierContext.class,i);
		}
		public StatesAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statesAll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterStatesAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitStatesAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitStatesAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatesAllContext statesAll() throws RecognitionException {
		StatesAllContext _localctx = new StatesAllContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statesAll);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(STATES);
			setState(30);
			match(CURLY_START);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INIT || _la==UPPER_CASE_ID) {
				{
				{
				setState(31);
				stateWithModifier();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			match(CURLY_END);
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
	public static class StateWithModifierContext extends ParserRuleContext {
		public InitStateContext initState() {
			return getRuleContext(InitStateContext.class,0);
		}
		public ErrorStateContext errorState() {
			return getRuleContext(ErrorStateContext.class,0);
		}
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public StateWithModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateWithModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterStateWithModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitStateWithModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitStateWithModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateWithModifierContext stateWithModifier() throws RecognitionException {
		StateWithModifierContext _localctx = new StateWithModifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stateWithModifier);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				initState();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				errorState();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				state();
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
	public static class StateContext extends ParserRuleContext {
		public TerminalNode UPPER_CASE_ID() { return getToken(StateModelParser.UPPER_CASE_ID, 0); }
		public TerminalNode CURLY_START() { return getToken(StateModelParser.CURLY_START, 0); }
		public TerminalNode CURLY_END() { return getToken(StateModelParser.CURLY_END, 0); }
		public List<TerminalNode> LOWER_CASE_ID() { return getTokens(StateModelParser.LOWER_CASE_ID); }
		public TerminalNode LOWER_CASE_ID(int i) {
			return getToken(StateModelParser.LOWER_CASE_ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StateModelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StateModelParser.COMMA, i);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(UPPER_CASE_ID);
			setState(45);
			match(CURLY_START);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOWER_CASE_ID) {
				{
				setState(46);
				match(LOWER_CASE_ID);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(47);
					match(COMMA);
					setState(48);
					match(LOWER_CASE_ID);
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(56);
			match(CURLY_END);
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
	public static class InitStateContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(StateModelParser.INIT, 0); }
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public InitStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterInitState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitInitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitInitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitStateContext initState() throws RecognitionException {
		InitStateContext _localctx = new InitStateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_initState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(INIT);
			setState(59);
			state();
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
	public static class ErrorStateContext extends ParserRuleContext {
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public TerminalNode ERROR() { return getToken(StateModelParser.ERROR, 0); }
		public ErrorStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterErrorState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitErrorState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitErrorState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorStateContext errorState() throws RecognitionException {
		ErrorStateContext _localctx = new ErrorStateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_errorState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			state();
			setState(62);
			match(ERROR);
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
	public static class TransitionsAllContext extends ParserRuleContext {
		public TerminalNode TRANSITIONS() { return getToken(StateModelParser.TRANSITIONS, 0); }
		public TerminalNode CURLY_START() { return getToken(StateModelParser.CURLY_START, 0); }
		public TerminalNode CURLY_END() { return getToken(StateModelParser.CURLY_END, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TransitionsAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionsAll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterTransitionsAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitTransitionsAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitTransitionsAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionsAllContext transitionsAll() throws RecognitionException {
		TransitionsAllContext _localctx = new TransitionsAllContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_transitionsAll);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(TRANSITIONS);
			setState(65);
			match(CURLY_START);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TRANS || _la==LOWER_CASE_ID) {
				{
				{
				setState(66);
				instruction();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(CURLY_END);
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
	public static class InstructionContext extends ParserRuleContext {
		public TransitionContext transition() {
			return getRuleContext(TransitionContext.class,0);
		}
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instruction);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWER_CASE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				transition();
				}
				break;
			case TRANS:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				schema();
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
	public static class SchemaContext extends ParserRuleContext {
		public TerminalNode TRANS() { return getToken(StateModelParser.TRANS, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode LOWER_CASE_ID() { return getToken(StateModelParser.LOWER_CASE_ID, 0); }
		public SchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaContext schema() throws RecognitionException {
		SchemaContext _localctx = new SchemaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(TRANS);
			setState(79);
			modifier();
			setState(80);
			match(LOWER_CASE_ID);
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
	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode NORMAL() { return getToken(StateModelParser.NORMAL, 0); }
		public TerminalNode ERROR() { return getToken(StateModelParser.ERROR, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==ERROR || _la==NORMAL) ) {
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
	public static class TransitionContext extends ParserRuleContext {
		public TerminalNode LOWER_CASE_ID() { return getToken(StateModelParser.LOWER_CASE_ID, 0); }
		public TerminalNode COLON() { return getToken(StateModelParser.COLON, 0); }
		public StartStateContext startState() {
			return getRuleContext(StartStateContext.class,0);
		}
		public TerminalNode TRANS_ARROW() { return getToken(StateModelParser.TRANS_ARROW, 0); }
		public EndStateContext endState() {
			return getRuleContext(EndStateContext.class,0);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitTransition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitTransition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_transition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(LOWER_CASE_ID);
			setState(85);
			match(COLON);
			setState(86);
			startState();
			setState(87);
			match(TRANS_ARROW);
			setState(88);
			endState();
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
	public static class StartStateContext extends ParserRuleContext {
		public TerminalNode UPPER_CASE_ID() { return getToken(StateModelParser.UPPER_CASE_ID, 0); }
		public StartStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterStartState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitStartState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitStartState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartStateContext startState() throws RecognitionException {
		StartStateContext _localctx = new StartStateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_startState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(UPPER_CASE_ID);
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
	public static class EndStateContext extends ParserRuleContext {
		public TerminalNode UPPER_CASE_ID() { return getToken(StateModelParser.UPPER_CASE_ID, 0); }
		public EndStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterEndState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitEndState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitEndState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndStateContext endState() throws RecognitionException {
		EndStateContext _localctx = new EndStateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_endState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(UPPER_CASE_ID);
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
		"\u0004\u0001\u0010_\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001$\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002+\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"2\b\u0003\n\u0003\f\u00035\t\u0003\u0003\u00037\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006D\b\u0006\n\u0006"+
		"\f\u0006G\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003"+
		"\u0007M\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u0000\u0001\u0002\u0000\u0003\u0003\u0006\u0006"+
		"X\u0000\u001a\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000\u0000"+
		"\u0004*\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b:\u0001"+
		"\u0000\u0000\u0000\n=\u0001\u0000\u0000\u0000\f@\u0001\u0000\u0000\u0000"+
		"\u000eL\u0001\u0000\u0000\u0000\u0010N\u0001\u0000\u0000\u0000\u0012R"+
		"\u0001\u0000\u0000\u0000\u0014T\u0001\u0000\u0000\u0000\u0016Z\u0001\u0000"+
		"\u0000\u0000\u0018\\\u0001\u0000\u0000\u0000\u001a\u001b\u0003\u0002\u0001"+
		"\u0000\u001b\u001c\u0003\f\u0006\u0000\u001c\u0001\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0005\u0001\u0000\u0000\u001e\"\u0005\n\u0000\u0000\u001f"+
		"!\u0003\u0004\u0002\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000"+
		"\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%&\u0005\u000b\u0000\u0000"+
		"&\u0003\u0001\u0000\u0000\u0000\'+\u0003\b\u0004\u0000(+\u0003\n\u0005"+
		"\u0000)+\u0003\u0006\u0003\u0000*\'\u0001\u0000\u0000\u0000*(\u0001\u0000"+
		"\u0000\u0000*)\u0001\u0000\u0000\u0000+\u0005\u0001\u0000\u0000\u0000"+
		",-\u0005\f\u0000\u0000-6\u0005\n\u0000\u0000.3\u0005\r\u0000\u0000/0\u0005"+
		"\t\u0000\u000002\u0005\r\u0000\u00001/\u0001\u0000\u0000\u000025\u0001"+
		"\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"47\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u00006.\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0005\u000b"+
		"\u0000\u00009\u0007\u0001\u0000\u0000\u0000:;\u0005\u0002\u0000\u0000"+
		";<\u0003\u0006\u0003\u0000<\t\u0001\u0000\u0000\u0000=>\u0003\u0006\u0003"+
		"\u0000>?\u0005\u0003\u0000\u0000?\u000b\u0001\u0000\u0000\u0000@A\u0005"+
		"\u0004\u0000\u0000AE\u0005\n\u0000\u0000BD\u0003\u000e\u0007\u0000CB\u0001"+
		"\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000HI\u0005\u000b\u0000\u0000I\r\u0001\u0000\u0000\u0000JM\u0003\u0014"+
		"\n\u0000KM\u0003\u0010\b\u0000LJ\u0001\u0000\u0000\u0000LK\u0001\u0000"+
		"\u0000\u0000M\u000f\u0001\u0000\u0000\u0000NO\u0005\u0005\u0000\u0000"+
		"OP\u0003\u0012\t\u0000PQ\u0005\r\u0000\u0000Q\u0011\u0001\u0000\u0000"+
		"\u0000RS\u0007\u0000\u0000\u0000S\u0013\u0001\u0000\u0000\u0000TU\u0005"+
		"\r\u0000\u0000UV\u0005\u0007\u0000\u0000VW\u0003\u0016\u000b\u0000WX\u0005"+
		"\b\u0000\u0000XY\u0003\u0018\f\u0000Y\u0015\u0001\u0000\u0000\u0000Z["+
		"\u0005\f\u0000\u0000[\u0017\u0001\u0000\u0000\u0000\\]\u0005\f\u0000\u0000"+
		"]\u0019\u0001\u0000\u0000\u0000\u0006\"*36EL";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}