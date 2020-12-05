package me.coley.nimbus.compiler.protobuf3;// Generated from Protobuf3.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Protobuf3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BOOL=2, BYTES=3, DOUBLE=4, ENUM=5, EXTEND=6, FIXED32=7, FIXED64=8, 
		FLOAT=9, IMPORT=10, INT32=11, INT64=12, MAP=13, MESSAGE=14, ONEOF=15, 
		OPTION=16, PACKAGE=17, PROTO3_DOUBLE=18, PROTO3_SINGLE=19, PUBLIC=20, 
		REPEATED=21, RESERVED=22, RETURNS=23, RPC=24, SERVICE=25, SFIXED32=26, 
		SFIXED64=27, SINT32=28, SINT64=29, STREAM=30, STRING=31, SYNTAX=32, TO=33, 
		UINT32=34, UINT64=35, WEAK=36, Ident=37, IntLit=38, FloatLit=39, BoolLit=40, 
		StrLit=41, Quote=42, LPAREN=43, RPAREN=44, LBRACE=45, RBRACE=46, LBRACK=47, 
		RBRACK=48, LCHEVR=49, RCHEVR=50, SEMI=51, COMMA=52, DOT=53, MINUS=54, 
		PLUS=55, ASSIGN=56, WS=57, COMMENT=58, LINE_COMMENT=59;
	public static final int
		RULE_proto = 0, RULE_syntax = 1, RULE_importStatement = 2, RULE_packageStatement = 3, 
		RULE_option = 4, RULE_optionName = 5, RULE_optionBody = 6, RULE_optionBodyVariable = 7, 
		RULE_topLevelDef = 8, RULE_message = 9, RULE_messageBody = 10, RULE_enumDefinition = 11, 
		RULE_enumBody = 12, RULE_enumField = 13, RULE_enumValueOption = 14, RULE_extend = 15, 
		RULE_service = 16, RULE_rpc = 17, RULE_reserved = 18, RULE_ranges = 19, 
		RULE_rangeRule = 20, RULE_fieldNames = 21, RULE_typeRule = 22, RULE_fieldNumber = 23, 
		RULE_field = 24, RULE_fieldOptions = 25, RULE_fieldOption = 26, RULE_oneof = 27, 
		RULE_oneofField = 28, RULE_mapField = 29, RULE_keyType = 30, RULE_reservedWord = 31, 
		RULE_fullIdent = 32, RULE_messageName = 33, RULE_enumName = 34, RULE_messageOrEnumName = 35, 
		RULE_fieldName = 36, RULE_oneofName = 37, RULE_mapName = 38, RULE_serviceName = 39, 
		RULE_rpcName = 40, RULE_messageType = 41, RULE_messageOrEnumType = 42, 
		RULE_emptyStatement = 43, RULE_constant = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"proto", "syntax", "importStatement", "packageStatement", "option", "optionName", 
			"optionBody", "optionBodyVariable", "topLevelDef", "message", "messageBody", 
			"enumDefinition", "enumBody", "enumField", "enumValueOption", "extend", 
			"service", "rpc", "reserved", "ranges", "rangeRule", "fieldNames", "typeRule", 
			"fieldNumber", "field", "fieldOptions", "fieldOption", "oneof", "oneofField", 
			"mapField", "keyType", "reservedWord", "fullIdent", "messageName", "enumName", 
			"messageOrEnumName", "fieldName", "oneofName", "mapName", "serviceName", 
			"rpcName", "messageType", "messageOrEnumType", "emptyStatement", "constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'bool'", "'bytes'", "'double'", "'enum'", "'extend'", "'fixed32'", 
			"'fixed64'", "'float'", "'import'", "'int32'", "'int64'", "'map'", "'message'", 
			"'oneof'", "'option'", "'package'", "'\"proto3\"'", "''proto3''", "'public'", 
			"'repeated'", "'reserved'", "'returns'", "'rpc'", "'service'", "'sfixed32'", 
			"'sfixed64'", "'sint32'", "'sint64'", "'stream'", "'string'", "'syntax'", 
			"'to'", "'uint32'", "'uint64'", "'weak'", null, null, null, null, null, 
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'<'", "'>'", "';'", 
			"','", "'.'", "'-'", "'+'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BOOL", "BYTES", "DOUBLE", "ENUM", "EXTEND", "FIXED32", "FIXED64", 
			"FLOAT", "IMPORT", "INT32", "INT64", "MAP", "MESSAGE", "ONEOF", "OPTION", 
			"PACKAGE", "PROTO3_DOUBLE", "PROTO3_SINGLE", "PUBLIC", "REPEATED", "RESERVED", 
			"RETURNS", "RPC", "SERVICE", "SFIXED32", "SFIXED64", "SINT32", "SINT64", 
			"STREAM", "STRING", "SYNTAX", "TO", "UINT32", "UINT64", "WEAK", "Ident", 
			"IntLit", "FloatLit", "BoolLit", "StrLit", "Quote", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "LCHEVR", "RCHEVR", "SEMI", "COMMA", 
			"DOT", "MINUS", "PLUS", "ASSIGN", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Protobuf3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Protobuf3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProtoContext extends ParserRuleContext {
		public SyntaxContext syntax() {
			return getRuleContext(SyntaxContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Protobuf3Parser.EOF, 0); }
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<PackageStatementContext> packageStatement() {
			return getRuleContexts(PackageStatementContext.class);
		}
		public PackageStatementContext packageStatement(int i) {
			return getRuleContext(PackageStatementContext.class,i);
		}
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public List<TopLevelDefContext> topLevelDef() {
			return getRuleContexts(TopLevelDefContext.class);
		}
		public TopLevelDefContext topLevelDef(int i) {
			return getRuleContext(TopLevelDefContext.class,i);
		}
		public List<EmptyStatementContext> emptyStatement() {
			return getRuleContexts(EmptyStatementContext.class);
		}
		public EmptyStatementContext emptyStatement(int i) {
			return getRuleContext(EmptyStatementContext.class,i);
		}
		public ProtoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterProto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitProto(this);
		}
	}

	public final ProtoContext proto() throws RecognitionException {
		ProtoContext _localctx = new ProtoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_proto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			syntax();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENUM) | (1L << EXTEND) | (1L << IMPORT) | (1L << MESSAGE) | (1L << OPTION) | (1L << PACKAGE) | (1L << SERVICE) | (1L << SEMI))) != 0)) {
				{
				setState(96);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IMPORT:
					{
					setState(91);
					importStatement();
					}
					break;
				case PACKAGE:
					{
					setState(92);
					packageStatement();
					}
					break;
				case OPTION:
					{
					setState(93);
					option();
					}
					break;
				case ENUM:
				case EXTEND:
				case MESSAGE:
				case SERVICE:
					{
					setState(94);
					topLevelDef();
					}
					break;
				case SEMI:
					{
					setState(95);
					emptyStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
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

	public static class SyntaxContext extends ParserRuleContext {
		public TerminalNode SYNTAX() { return getToken(Protobuf3Parser.SYNTAX, 0); }
		public TerminalNode ASSIGN() { return getToken(Protobuf3Parser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public TerminalNode PROTO3_DOUBLE() { return getToken(Protobuf3Parser.PROTO3_DOUBLE, 0); }
		public TerminalNode PROTO3_SINGLE() { return getToken(Protobuf3Parser.PROTO3_SINGLE, 0); }
		public SyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterSyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitSyntax(this);
		}
	}

	public final SyntaxContext syntax() throws RecognitionException {
		SyntaxContext _localctx = new SyntaxContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_syntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(SYNTAX);
			setState(104);
			match(ASSIGN);
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==PROTO3_DOUBLE || _la==PROTO3_SINGLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(106);
			match(SEMI);
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Protobuf3Parser.IMPORT, 0); }
		public TerminalNode StrLit() { return getToken(Protobuf3Parser.StrLit, 0); }
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public TerminalNode WEAK() { return getToken(Protobuf3Parser.WEAK, 0); }
		public TerminalNode PUBLIC() { return getToken(Protobuf3Parser.PUBLIC, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitImportStatement(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(IMPORT);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC || _la==WEAK) {
				{
				setState(109);
				_la = _input.LA(1);
				if ( !(_la==PUBLIC || _la==WEAK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(112);
			match(StrLit);
			setState(113);
			match(SEMI);
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

	public static class PackageStatementContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(Protobuf3Parser.PACKAGE, 0); }
		public FullIdentContext fullIdent() {
			return getRuleContext(FullIdentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public PackageStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterPackageStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitPackageStatement(this);
		}
	}

	public final PackageStatementContext packageStatement() throws RecognitionException {
		PackageStatementContext _localctx = new PackageStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_packageStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(PACKAGE);
			setState(116);
			fullIdent();
			setState(117);
			match(SEMI);
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

	public static class OptionContext extends ParserRuleContext {
		public TerminalNode OPTION() { return getToken(Protobuf3Parser.OPTION, 0); }
		public OptionNameContext optionName() {
			return getRuleContext(OptionNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Protobuf3Parser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public OptionBodyContext optionBody() {
			return getRuleContext(OptionBodyContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitOption(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(OPTION);
			setState(120);
			optionName();
			setState(121);
			match(ASSIGN);
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
			case IntLit:
			case FloatLit:
			case BoolLit:
			case StrLit:
			case MINUS:
			case PLUS:
				{
				setState(122);
				constant();
				}
				break;
			case LBRACE:
				{
				setState(123);
				optionBody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(126);
			match(SEMI);
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

	public static class OptionNameContext extends ParserRuleContext {
		public List<TerminalNode> Ident() { return getTokens(Protobuf3Parser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(Protobuf3Parser.Ident, i);
		}
		public TerminalNode LPAREN() { return getToken(Protobuf3Parser.LPAREN, 0); }
		public FullIdentContext fullIdent() {
			return getRuleContext(FullIdentContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Protobuf3Parser.RPAREN, 0); }
		public List<TerminalNode> DOT() { return getTokens(Protobuf3Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Protobuf3Parser.DOT, i);
		}
		public List<ReservedWordContext> reservedWord() {
			return getRuleContexts(ReservedWordContext.class);
		}
		public ReservedWordContext reservedWord(int i) {
			return getRuleContext(ReservedWordContext.class,i);
		}
		public OptionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterOptionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitOptionName(this);
		}
	}

	public final OptionNameContext optionName() throws RecognitionException {
		OptionNameContext _localctx = new OptionNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_optionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
				{
				setState(128);
				match(Ident);
				}
				break;
			case LPAREN:
				{
				setState(129);
				match(LPAREN);
				setState(130);
				fullIdent();
				setState(131);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(135);
				match(DOT);
				setState(138);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Ident:
					{
					setState(136);
					match(Ident);
					}
					break;
				case EXTEND:
				case MESSAGE:
				case OPTION:
				case PACKAGE:
				case RPC:
				case SERVICE:
				case STREAM:
				case STRING:
				case SYNTAX:
				case WEAK:
					{
					setState(137);
					reservedWord();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(144);
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

	public static class OptionBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Protobuf3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Protobuf3Parser.RBRACE, 0); }
		public List<OptionBodyVariableContext> optionBodyVariable() {
			return getRuleContexts(OptionBodyVariableContext.class);
		}
		public OptionBodyVariableContext optionBodyVariable(int i) {
			return getRuleContext(OptionBodyVariableContext.class,i);
		}
		public OptionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterOptionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitOptionBody(this);
		}
	}

	public final OptionBodyContext optionBody() throws RecognitionException {
		OptionBodyContext _localctx = new OptionBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_optionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(LBRACE);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Ident || _la==LPAREN) {
				{
				{
				setState(146);
				optionBodyVariable();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(RBRACE);
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

	public static class OptionBodyVariableContext extends ParserRuleContext {
		public OptionNameContext optionName() {
			return getRuleContext(OptionNameContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public OptionBodyVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionBodyVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterOptionBodyVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitOptionBodyVariable(this);
		}
	}

	public final OptionBodyVariableContext optionBodyVariable() throws RecognitionException {
		OptionBodyVariableContext _localctx = new OptionBodyVariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_optionBodyVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			optionName();
			setState(155);
			match(T__0);
			setState(156);
			constant();
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

	public static class TopLevelDefContext extends ParserRuleContext {
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public EnumDefinitionContext enumDefinition() {
			return getRuleContext(EnumDefinitionContext.class,0);
		}
		public ExtendContext extend() {
			return getRuleContext(ExtendContext.class,0);
		}
		public ServiceContext service() {
			return getRuleContext(ServiceContext.class,0);
		}
		public TopLevelDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterTopLevelDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitTopLevelDef(this);
		}
	}

	public final TopLevelDefContext topLevelDef() throws RecognitionException {
		TopLevelDefContext _localctx = new TopLevelDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_topLevelDef);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MESSAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				message();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				enumDefinition();
				}
				break;
			case EXTEND:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				extend();
				}
				break;
			case SERVICE:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				service();
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

	public static class MessageContext extends ParserRuleContext {
		public TerminalNode MESSAGE() { return getToken(Protobuf3Parser.MESSAGE, 0); }
		public MessageNameContext messageName() {
			return getRuleContext(MessageNameContext.class,0);
		}
		public MessageBodyContext messageBody() {
			return getRuleContext(MessageBodyContext.class,0);
		}
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitMessage(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(MESSAGE);
			setState(165);
			messageName();
			setState(166);
			messageBody();
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

	public static class MessageBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Protobuf3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Protobuf3Parser.RBRACE, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<EnumDefinitionContext> enumDefinition() {
			return getRuleContexts(EnumDefinitionContext.class);
		}
		public EnumDefinitionContext enumDefinition(int i) {
			return getRuleContext(EnumDefinitionContext.class,i);
		}
		public List<MessageContext> message() {
			return getRuleContexts(MessageContext.class);
		}
		public MessageContext message(int i) {
			return getRuleContext(MessageContext.class,i);
		}
		public List<ExtendContext> extend() {
			return getRuleContexts(ExtendContext.class);
		}
		public ExtendContext extend(int i) {
			return getRuleContext(ExtendContext.class,i);
		}
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public List<OneofContext> oneof() {
			return getRuleContexts(OneofContext.class);
		}
		public OneofContext oneof(int i) {
			return getRuleContext(OneofContext.class,i);
		}
		public List<MapFieldContext> mapField() {
			return getRuleContexts(MapFieldContext.class);
		}
		public MapFieldContext mapField(int i) {
			return getRuleContext(MapFieldContext.class,i);
		}
		public List<ReservedContext> reserved() {
			return getRuleContexts(ReservedContext.class);
		}
		public ReservedContext reserved(int i) {
			return getRuleContext(ReservedContext.class,i);
		}
		public List<EmptyStatementContext> emptyStatement() {
			return getRuleContexts(EmptyStatementContext.class);
		}
		public EmptyStatementContext emptyStatement(int i) {
			return getRuleContext(EmptyStatementContext.class,i);
		}
		public MessageBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterMessageBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitMessageBody(this);
		}
	}

	public final MessageBodyContext messageBody() throws RecognitionException {
		MessageBodyContext _localctx = new MessageBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_messageBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(LBRACE);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTES) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTEND) | (1L << FIXED32) | (1L << FIXED64) | (1L << FLOAT) | (1L << INT32) | (1L << INT64) | (1L << MAP) | (1L << MESSAGE) | (1L << ONEOF) | (1L << OPTION) | (1L << PACKAGE) | (1L << REPEATED) | (1L << RESERVED) | (1L << RPC) | (1L << SERVICE) | (1L << SFIXED32) | (1L << SFIXED64) | (1L << SINT32) | (1L << SINT64) | (1L << STREAM) | (1L << STRING) | (1L << SYNTAX) | (1L << UINT32) | (1L << UINT64) | (1L << WEAK) | (1L << Ident) | (1L << SEMI) | (1L << DOT))) != 0)) {
				{
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(169);
					field();
					}
					break;
				case 2:
					{
					setState(170);
					enumDefinition();
					}
					break;
				case 3:
					{
					setState(171);
					message();
					}
					break;
				case 4:
					{
					setState(172);
					extend();
					}
					break;
				case 5:
					{
					setState(173);
					option();
					}
					break;
				case 6:
					{
					setState(174);
					oneof();
					}
					break;
				case 7:
					{
					setState(175);
					mapField();
					}
					break;
				case 8:
					{
					setState(176);
					reserved();
					}
					break;
				case 9:
					{
					setState(177);
					emptyStatement();
					}
					break;
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(RBRACE);
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

	public static class EnumDefinitionContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(Protobuf3Parser.ENUM, 0); }
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterEnumDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitEnumDefinition(this);
		}
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ENUM);
			setState(186);
			enumName();
			setState(187);
			enumBody();
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

	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Protobuf3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Protobuf3Parser.RBRACE, 0); }
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public List<EnumFieldContext> enumField() {
			return getRuleContexts(EnumFieldContext.class);
		}
		public EnumFieldContext enumField(int i) {
			return getRuleContext(EnumFieldContext.class,i);
		}
		public List<EmptyStatementContext> emptyStatement() {
			return getRuleContexts(EmptyStatementContext.class);
		}
		public EmptyStatementContext emptyStatement(int i) {
			return getRuleContext(EmptyStatementContext.class,i);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitEnumBody(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(LBRACE);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPTION) | (1L << Ident) | (1L << SEMI))) != 0)) {
				{
				setState(193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTION:
					{
					setState(190);
					option();
					}
					break;
				case Ident:
					{
					setState(191);
					enumField();
					}
					break;
				case SEMI:
					{
					setState(192);
					emptyStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(RBRACE);
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

	public static class EnumFieldContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(Protobuf3Parser.Ident, 0); }
		public TerminalNode ASSIGN() { return getToken(Protobuf3Parser.ASSIGN, 0); }
		public TerminalNode IntLit() { return getToken(Protobuf3Parser.IntLit, 0); }
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public TerminalNode MINUS() { return getToken(Protobuf3Parser.MINUS, 0); }
		public TerminalNode LBRACK() { return getToken(Protobuf3Parser.LBRACK, 0); }
		public List<EnumValueOptionContext> enumValueOption() {
			return getRuleContexts(EnumValueOptionContext.class);
		}
		public EnumValueOptionContext enumValueOption(int i) {
			return getRuleContext(EnumValueOptionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(Protobuf3Parser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Protobuf3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Protobuf3Parser.COMMA, i);
		}
		public EnumFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterEnumField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitEnumField(this);
		}
	}

	public final EnumFieldContext enumField() throws RecognitionException {
		EnumFieldContext _localctx = new EnumFieldContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(Ident);
			setState(201);
			match(ASSIGN);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(202);
				match(MINUS);
				}
			}

			setState(205);
			match(IntLit);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(206);
				match(LBRACK);
				setState(207);
				enumValueOption();
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(208);
					match(COMMA);
					setState(209);
					enumValueOption();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
				match(RBRACK);
				}
			}

			setState(219);
			match(SEMI);
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

	public static class EnumValueOptionContext extends ParserRuleContext {
		public OptionNameContext optionName() {
			return getRuleContext(OptionNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Protobuf3Parser.ASSIGN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public EnumValueOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterEnumValueOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitEnumValueOption(this);
		}
	}

	public final EnumValueOptionContext enumValueOption() throws RecognitionException {
		EnumValueOptionContext _localctx = new EnumValueOptionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumValueOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			optionName();
			setState(222);
			match(ASSIGN);
			setState(223);
			constant();
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

	public static class ExtendContext extends ParserRuleContext {
		public TerminalNode EXTEND() { return getToken(Protobuf3Parser.EXTEND, 0); }
		public MessageTypeContext messageType() {
			return getRuleContext(MessageTypeContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(Protobuf3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Protobuf3Parser.RBRACE, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExtendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterExtend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitExtend(this);
		}
	}

	public final ExtendContext extend() throws RecognitionException {
		ExtendContext _localctx = new ExtendContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_extend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(EXTEND);
			setState(226);
			messageType();
			setState(227);
			match(LBRACE);
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTES:
			case DOUBLE:
			case EXTEND:
			case FIXED32:
			case FIXED64:
			case FLOAT:
			case INT32:
			case INT64:
			case MESSAGE:
			case OPTION:
			case PACKAGE:
			case REPEATED:
			case RPC:
			case SERVICE:
			case SFIXED32:
			case SFIXED64:
			case SINT32:
			case SINT64:
			case STREAM:
			case STRING:
			case SYNTAX:
			case UINT32:
			case UINT64:
			case WEAK:
			case Ident:
			case DOT:
				{
				setState(228);
				field();
				}
				break;
			case SEMI:
				{
				setState(229);
				emptyStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(232);
			match(RBRACE);
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

	public static class ServiceContext extends ParserRuleContext {
		public TerminalNode SERVICE() { return getToken(Protobuf3Parser.SERVICE, 0); }
		public ServiceNameContext serviceName() {
			return getRuleContext(ServiceNameContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(Protobuf3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Protobuf3Parser.RBRACE, 0); }
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public List<RpcContext> rpc() {
			return getRuleContexts(RpcContext.class);
		}
		public RpcContext rpc(int i) {
			return getRuleContext(RpcContext.class,i);
		}
		public List<EmptyStatementContext> emptyStatement() {
			return getRuleContexts(EmptyStatementContext.class);
		}
		public EmptyStatementContext emptyStatement(int i) {
			return getRuleContext(EmptyStatementContext.class,i);
		}
		public ServiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_service; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterService(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitService(this);
		}
	}

	public final ServiceContext service() throws RecognitionException {
		ServiceContext _localctx = new ServiceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_service);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(SERVICE);
			setState(235);
			serviceName();
			setState(236);
			match(LBRACE);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPTION) | (1L << RPC) | (1L << SEMI))) != 0)) {
				{
				setState(240);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTION:
					{
					setState(237);
					option();
					}
					break;
				case RPC:
					{
					setState(238);
					rpc();
					}
					break;
				case SEMI:
					{
					setState(239);
					emptyStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			match(RBRACE);
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

	public static class RpcContext extends ParserRuleContext {
		public TerminalNode RPC() { return getToken(Protobuf3Parser.RPC, 0); }
		public RpcNameContext rpcName() {
			return getRuleContext(RpcNameContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(Protobuf3Parser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(Protobuf3Parser.LPAREN, i);
		}
		public List<MessageTypeContext> messageType() {
			return getRuleContexts(MessageTypeContext.class);
		}
		public MessageTypeContext messageType(int i) {
			return getRuleContext(MessageTypeContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(Protobuf3Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(Protobuf3Parser.RPAREN, i);
		}
		public TerminalNode RETURNS() { return getToken(Protobuf3Parser.RETURNS, 0); }
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public List<TerminalNode> STREAM() { return getTokens(Protobuf3Parser.STREAM); }
		public TerminalNode STREAM(int i) {
			return getToken(Protobuf3Parser.STREAM, i);
		}
		public TerminalNode LBRACE() { return getToken(Protobuf3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Protobuf3Parser.RBRACE, 0); }
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public List<EmptyStatementContext> emptyStatement() {
			return getRuleContexts(EmptyStatementContext.class);
		}
		public EmptyStatementContext emptyStatement(int i) {
			return getRuleContext(EmptyStatementContext.class,i);
		}
		public RpcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rpc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterRpc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitRpc(this);
		}
	}

	public final RpcContext rpc() throws RecognitionException {
		RpcContext _localctx = new RpcContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rpc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(RPC);
			setState(248);
			rpcName();
			setState(249);
			match(LPAREN);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STREAM) {
				{
				setState(250);
				match(STREAM);
				}
			}

			setState(253);
			messageType();
			setState(254);
			match(RPAREN);
			setState(255);
			match(RETURNS);
			setState(256);
			match(LPAREN);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STREAM) {
				{
				setState(257);
				match(STREAM);
				}
			}

			setState(260);
			messageType();
			setState(261);
			match(RPAREN);
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				{
				setState(262);
				match(LBRACE);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPTION || _la==SEMI) {
					{
					setState(265);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPTION:
						{
						setState(263);
						option();
						}
						break;
					case SEMI:
						{
						setState(264);
						emptyStatement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				match(RBRACE);
				}
				}
				break;
			case SEMI:
				{
				setState(271);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ReservedContext extends ParserRuleContext {
		public TerminalNode RESERVED() { return getToken(Protobuf3Parser.RESERVED, 0); }
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public RangesContext ranges() {
			return getRuleContext(RangesContext.class,0);
		}
		public FieldNamesContext fieldNames() {
			return getRuleContext(FieldNamesContext.class,0);
		}
		public ReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitReserved(this);
		}
	}

	public final ReservedContext reserved() throws RecognitionException {
		ReservedContext _localctx = new ReservedContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_reserved);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(RESERVED);
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntLit:
				{
				setState(275);
				ranges();
				}
				break;
			case StrLit:
				{
				setState(276);
				fieldNames();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(279);
			match(SEMI);
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

	public static class RangesContext extends ParserRuleContext {
		public List<RangeRuleContext> rangeRule() {
			return getRuleContexts(RangeRuleContext.class);
		}
		public RangeRuleContext rangeRule(int i) {
			return getRuleContext(RangeRuleContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Protobuf3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Protobuf3Parser.COMMA, i);
		}
		public RangesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ranges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterRanges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitRanges(this);
		}
	}

	public final RangesContext ranges() throws RecognitionException {
		RangesContext _localctx = new RangesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ranges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			rangeRule();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(282);
				match(COMMA);
				setState(283);
				rangeRule();
				}
				}
				setState(288);
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

	public static class RangeRuleContext extends ParserRuleContext {
		public List<TerminalNode> IntLit() { return getTokens(Protobuf3Parser.IntLit); }
		public TerminalNode IntLit(int i) {
			return getToken(Protobuf3Parser.IntLit, i);
		}
		public TerminalNode TO() { return getToken(Protobuf3Parser.TO, 0); }
		public RangeRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterRangeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitRangeRule(this);
		}
	}

	public final RangeRuleContext rangeRule() throws RecognitionException {
		RangeRuleContext _localctx = new RangeRuleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_rangeRule);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(IntLit);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(IntLit);
				setState(291);
				match(TO);
				setState(292);
				match(IntLit);
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

	public static class FieldNamesContext extends ParserRuleContext {
		public List<TerminalNode> StrLit() { return getTokens(Protobuf3Parser.StrLit); }
		public TerminalNode StrLit(int i) {
			return getToken(Protobuf3Parser.StrLit, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Protobuf3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Protobuf3Parser.COMMA, i);
		}
		public FieldNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterFieldNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitFieldNames(this);
		}
	}

	public final FieldNamesContext fieldNames() throws RecognitionException {
		FieldNamesContext _localctx = new FieldNamesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fieldNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(StrLit);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(296);
				match(COMMA);
				setState(297);
				match(StrLit);
				}
				}
				setState(302);
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

	public static class TypeRuleContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(Protobuf3Parser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(Protobuf3Parser.FLOAT, 0); }
		public TerminalNode INT32() { return getToken(Protobuf3Parser.INT32, 0); }
		public TerminalNode INT64() { return getToken(Protobuf3Parser.INT64, 0); }
		public TerminalNode UINT32() { return getToken(Protobuf3Parser.UINT32, 0); }
		public TerminalNode UINT64() { return getToken(Protobuf3Parser.UINT64, 0); }
		public TerminalNode SINT32() { return getToken(Protobuf3Parser.SINT32, 0); }
		public TerminalNode SINT64() { return getToken(Protobuf3Parser.SINT64, 0); }
		public TerminalNode FIXED32() { return getToken(Protobuf3Parser.FIXED32, 0); }
		public TerminalNode FIXED64() { return getToken(Protobuf3Parser.FIXED64, 0); }
		public TerminalNode SFIXED32() { return getToken(Protobuf3Parser.SFIXED32, 0); }
		public TerminalNode SFIXED64() { return getToken(Protobuf3Parser.SFIXED64, 0); }
		public TerminalNode BOOL() { return getToken(Protobuf3Parser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(Protobuf3Parser.STRING, 0); }
		public TerminalNode BYTES() { return getToken(Protobuf3Parser.BYTES, 0); }
		public MessageOrEnumTypeContext messageOrEnumType() {
			return getRuleContext(MessageOrEnumTypeContext.class,0);
		}
		public TypeRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterTypeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitTypeRule(this);
		}
	}

	public final TypeRuleContext typeRule() throws RecognitionException {
		TypeRuleContext _localctx = new TypeRuleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeRule);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTES) | (1L << DOUBLE) | (1L << FIXED32) | (1L << FIXED64) | (1L << FLOAT) | (1L << INT32) | (1L << INT64) | (1L << SFIXED32) | (1L << SFIXED64) | (1L << SINT32) | (1L << SINT64) | (1L << STRING) | (1L << UINT32) | (1L << UINT64))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				messageOrEnumType();
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

	public static class FieldNumberContext extends ParserRuleContext {
		public TerminalNode IntLit() { return getToken(Protobuf3Parser.IntLit, 0); }
		public FieldNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterFieldNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitFieldNumber(this);
		}
	}

	public final FieldNumberContext fieldNumber() throws RecognitionException {
		FieldNumberContext _localctx = new FieldNumberContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fieldNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(IntLit);
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

	public static class FieldContext extends ParserRuleContext {
		public TypeRuleContext typeRule() {
			return getRuleContext(TypeRuleContext.class,0);
		}
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Protobuf3Parser.ASSIGN, 0); }
		public FieldNumberContext fieldNumber() {
			return getRuleContext(FieldNumberContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public TerminalNode REPEATED() { return getToken(Protobuf3Parser.REPEATED, 0); }
		public TerminalNode LBRACK() { return getToken(Protobuf3Parser.LBRACK, 0); }
		public FieldOptionsContext fieldOptions() {
			return getRuleContext(FieldOptionsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Protobuf3Parser.RBRACK, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPEATED) {
				{
				setState(309);
				match(REPEATED);
				}
			}

			setState(312);
			typeRule();
			setState(313);
			fieldName();
			setState(314);
			match(ASSIGN);
			setState(315);
			fieldNumber();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(316);
				match(LBRACK);
				setState(317);
				fieldOptions();
				setState(318);
				match(RBRACK);
				}
			}

			setState(322);
			match(SEMI);
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

	public static class FieldOptionsContext extends ParserRuleContext {
		public List<FieldOptionContext> fieldOption() {
			return getRuleContexts(FieldOptionContext.class);
		}
		public FieldOptionContext fieldOption(int i) {
			return getRuleContext(FieldOptionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Protobuf3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Protobuf3Parser.COMMA, i);
		}
		public FieldOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterFieldOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitFieldOptions(this);
		}
	}

	public final FieldOptionsContext fieldOptions() throws RecognitionException {
		FieldOptionsContext _localctx = new FieldOptionsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fieldOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			fieldOption();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(325);
				match(COMMA);
				setState(326);
				fieldOption();
				}
				}
				setState(331);
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

	public static class FieldOptionContext extends ParserRuleContext {
		public OptionNameContext optionName() {
			return getRuleContext(OptionNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Protobuf3Parser.ASSIGN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public FieldOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterFieldOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitFieldOption(this);
		}
	}

	public final FieldOptionContext fieldOption() throws RecognitionException {
		FieldOptionContext _localctx = new FieldOptionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fieldOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			optionName();
			setState(333);
			match(ASSIGN);
			setState(334);
			constant();
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

	public static class OneofContext extends ParserRuleContext {
		public TerminalNode ONEOF() { return getToken(Protobuf3Parser.ONEOF, 0); }
		public OneofNameContext oneofName() {
			return getRuleContext(OneofNameContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(Protobuf3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Protobuf3Parser.RBRACE, 0); }
		public List<OneofFieldContext> oneofField() {
			return getRuleContexts(OneofFieldContext.class);
		}
		public OneofFieldContext oneofField(int i) {
			return getRuleContext(OneofFieldContext.class,i);
		}
		public List<EmptyStatementContext> emptyStatement() {
			return getRuleContexts(EmptyStatementContext.class);
		}
		public EmptyStatementContext emptyStatement(int i) {
			return getRuleContext(EmptyStatementContext.class,i);
		}
		public OneofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterOneof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitOneof(this);
		}
	}

	public final OneofContext oneof() throws RecognitionException {
		OneofContext _localctx = new OneofContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_oneof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(ONEOF);
			setState(337);
			oneofName();
			setState(338);
			match(LBRACE);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTES) | (1L << DOUBLE) | (1L << EXTEND) | (1L << FIXED32) | (1L << FIXED64) | (1L << FLOAT) | (1L << INT32) | (1L << INT64) | (1L << MESSAGE) | (1L << OPTION) | (1L << PACKAGE) | (1L << RPC) | (1L << SERVICE) | (1L << SFIXED32) | (1L << SFIXED64) | (1L << SINT32) | (1L << SINT64) | (1L << STREAM) | (1L << STRING) | (1L << SYNTAX) | (1L << UINT32) | (1L << UINT64) | (1L << WEAK) | (1L << Ident) | (1L << SEMI) | (1L << DOT))) != 0)) {
				{
				setState(341);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
				case BYTES:
				case DOUBLE:
				case EXTEND:
				case FIXED32:
				case FIXED64:
				case FLOAT:
				case INT32:
				case INT64:
				case MESSAGE:
				case OPTION:
				case PACKAGE:
				case RPC:
				case SERVICE:
				case SFIXED32:
				case SFIXED64:
				case SINT32:
				case SINT64:
				case STREAM:
				case STRING:
				case SYNTAX:
				case UINT32:
				case UINT64:
				case WEAK:
				case Ident:
				case DOT:
					{
					setState(339);
					oneofField();
					}
					break;
				case SEMI:
					{
					setState(340);
					emptyStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346);
			match(RBRACE);
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

	public static class OneofFieldContext extends ParserRuleContext {
		public TypeRuleContext typeRule() {
			return getRuleContext(TypeRuleContext.class,0);
		}
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Protobuf3Parser.ASSIGN, 0); }
		public FieldNumberContext fieldNumber() {
			return getRuleContext(FieldNumberContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public TerminalNode LBRACK() { return getToken(Protobuf3Parser.LBRACK, 0); }
		public FieldOptionsContext fieldOptions() {
			return getRuleContext(FieldOptionsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Protobuf3Parser.RBRACK, 0); }
		public OneofFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneofField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterOneofField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitOneofField(this);
		}
	}

	public final OneofFieldContext oneofField() throws RecognitionException {
		OneofFieldContext _localctx = new OneofFieldContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_oneofField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			typeRule();
			setState(349);
			fieldName();
			setState(350);
			match(ASSIGN);
			setState(351);
			fieldNumber();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(352);
				match(LBRACK);
				setState(353);
				fieldOptions();
				setState(354);
				match(RBRACK);
				}
			}

			setState(358);
			match(SEMI);
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

	public static class MapFieldContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(Protobuf3Parser.MAP, 0); }
		public TerminalNode LCHEVR() { return getToken(Protobuf3Parser.LCHEVR, 0); }
		public KeyTypeContext keyType() {
			return getRuleContext(KeyTypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Protobuf3Parser.COMMA, 0); }
		public TypeRuleContext typeRule() {
			return getRuleContext(TypeRuleContext.class,0);
		}
		public TerminalNode RCHEVR() { return getToken(Protobuf3Parser.RCHEVR, 0); }
		public MapNameContext mapName() {
			return getRuleContext(MapNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Protobuf3Parser.ASSIGN, 0); }
		public FieldNumberContext fieldNumber() {
			return getRuleContext(FieldNumberContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public TerminalNode LBRACK() { return getToken(Protobuf3Parser.LBRACK, 0); }
		public FieldOptionsContext fieldOptions() {
			return getRuleContext(FieldOptionsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Protobuf3Parser.RBRACK, 0); }
		public MapFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterMapField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitMapField(this);
		}
	}

	public final MapFieldContext mapField() throws RecognitionException {
		MapFieldContext _localctx = new MapFieldContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mapField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(MAP);
			setState(361);
			match(LCHEVR);
			setState(362);
			keyType();
			setState(363);
			match(COMMA);
			setState(364);
			typeRule();
			setState(365);
			match(RCHEVR);
			setState(366);
			mapName();
			setState(367);
			match(ASSIGN);
			setState(368);
			fieldNumber();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(369);
				match(LBRACK);
				setState(370);
				fieldOptions();
				setState(371);
				match(RBRACK);
				}
			}

			setState(375);
			match(SEMI);
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

	public static class KeyTypeContext extends ParserRuleContext {
		public TerminalNode INT32() { return getToken(Protobuf3Parser.INT32, 0); }
		public TerminalNode INT64() { return getToken(Protobuf3Parser.INT64, 0); }
		public TerminalNode UINT32() { return getToken(Protobuf3Parser.UINT32, 0); }
		public TerminalNode UINT64() { return getToken(Protobuf3Parser.UINT64, 0); }
		public TerminalNode SINT32() { return getToken(Protobuf3Parser.SINT32, 0); }
		public TerminalNode SINT64() { return getToken(Protobuf3Parser.SINT64, 0); }
		public TerminalNode FIXED32() { return getToken(Protobuf3Parser.FIXED32, 0); }
		public TerminalNode FIXED64() { return getToken(Protobuf3Parser.FIXED64, 0); }
		public TerminalNode SFIXED32() { return getToken(Protobuf3Parser.SFIXED32, 0); }
		public TerminalNode SFIXED64() { return getToken(Protobuf3Parser.SFIXED64, 0); }
		public TerminalNode BOOL() { return getToken(Protobuf3Parser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(Protobuf3Parser.STRING, 0); }
		public KeyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterKeyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitKeyType(this);
		}
	}

	public final KeyTypeContext keyType() throws RecognitionException {
		KeyTypeContext _localctx = new KeyTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_keyType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << FIXED32) | (1L << FIXED64) | (1L << INT32) | (1L << INT64) | (1L << SFIXED32) | (1L << SFIXED64) | (1L << SINT32) | (1L << SINT64) | (1L << STRING) | (1L << UINT32) | (1L << UINT64))) != 0)) ) {
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

	public static class ReservedWordContext extends ParserRuleContext {
		public TerminalNode EXTEND() { return getToken(Protobuf3Parser.EXTEND, 0); }
		public TerminalNode MESSAGE() { return getToken(Protobuf3Parser.MESSAGE, 0); }
		public TerminalNode OPTION() { return getToken(Protobuf3Parser.OPTION, 0); }
		public TerminalNode PACKAGE() { return getToken(Protobuf3Parser.PACKAGE, 0); }
		public TerminalNode RPC() { return getToken(Protobuf3Parser.RPC, 0); }
		public TerminalNode SERVICE() { return getToken(Protobuf3Parser.SERVICE, 0); }
		public TerminalNode STREAM() { return getToken(Protobuf3Parser.STREAM, 0); }
		public TerminalNode STRING() { return getToken(Protobuf3Parser.STRING, 0); }
		public TerminalNode SYNTAX() { return getToken(Protobuf3Parser.SYNTAX, 0); }
		public TerminalNode WEAK() { return getToken(Protobuf3Parser.WEAK, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitReservedWord(this);
		}
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_reservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXTEND) | (1L << MESSAGE) | (1L << OPTION) | (1L << PACKAGE) | (1L << RPC) | (1L << SERVICE) | (1L << STREAM) | (1L << STRING) | (1L << SYNTAX) | (1L << WEAK))) != 0)) ) {
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

	public static class FullIdentContext extends ParserRuleContext {
		public List<TerminalNode> Ident() { return getTokens(Protobuf3Parser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(Protobuf3Parser.Ident, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Protobuf3Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Protobuf3Parser.DOT, i);
		}
		public FullIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterFullIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitFullIdent(this);
		}
	}

	public final FullIdentContext fullIdent() throws RecognitionException {
		FullIdentContext _localctx = new FullIdentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_fullIdent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(Ident);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(382);
				match(DOT);
				setState(383);
				match(Ident);
				}
				}
				setState(388);
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

	public static class MessageNameContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(Protobuf3Parser.Ident, 0); }
		public MessageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterMessageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitMessageName(this);
		}
	}

	public final MessageNameContext messageName() throws RecognitionException {
		MessageNameContext _localctx = new MessageNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_messageName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(Ident);
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

	public static class EnumNameContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(Protobuf3Parser.Ident, 0); }
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterEnumName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitEnumName(this);
		}
	}

	public final EnumNameContext enumName() throws RecognitionException {
		EnumNameContext _localctx = new EnumNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(Ident);
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

	public static class MessageOrEnumNameContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(Protobuf3Parser.Ident, 0); }
		public MessageOrEnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageOrEnumName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterMessageOrEnumName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitMessageOrEnumName(this);
		}
	}

	public final MessageOrEnumNameContext messageOrEnumName() throws RecognitionException {
		MessageOrEnumNameContext _localctx = new MessageOrEnumNameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_messageOrEnumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(Ident);
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

	public static class FieldNameContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(Protobuf3Parser.Ident, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitFieldName(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_fieldName);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(Ident);
				}
				break;
			case EXTEND:
			case MESSAGE:
			case OPTION:
			case PACKAGE:
			case RPC:
			case SERVICE:
			case STREAM:
			case STRING:
			case SYNTAX:
			case WEAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				reservedWord();
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

	public static class OneofNameContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(Protobuf3Parser.Ident, 0); }
		public OneofNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneofName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterOneofName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitOneofName(this);
		}
	}

	public final OneofNameContext oneofName() throws RecognitionException {
		OneofNameContext _localctx = new OneofNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_oneofName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(Ident);
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

	public static class MapNameContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(Protobuf3Parser.Ident, 0); }
		public MapNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterMapName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitMapName(this);
		}
	}

	public final MapNameContext mapName() throws RecognitionException {
		MapNameContext _localctx = new MapNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_mapName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(Ident);
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

	public static class ServiceNameContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(Protobuf3Parser.Ident, 0); }
		public ServiceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterServiceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitServiceName(this);
		}
	}

	public final ServiceNameContext serviceName() throws RecognitionException {
		ServiceNameContext _localctx = new ServiceNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_serviceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(Ident);
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

	public static class RpcNameContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(Protobuf3Parser.Ident, 0); }
		public RpcNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rpcName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterRpcName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitRpcName(this);
		}
	}

	public final RpcNameContext rpcName() throws RecognitionException {
		RpcNameContext _localctx = new RpcNameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_rpcName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(Ident);
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

	public static class MessageTypeContext extends ParserRuleContext {
		public MessageNameContext messageName() {
			return getRuleContext(MessageNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Protobuf3Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Protobuf3Parser.DOT, i);
		}
		public List<TerminalNode> Ident() { return getTokens(Protobuf3Parser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(Protobuf3Parser.Ident, i);
		}
		public MessageTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterMessageType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitMessageType(this);
		}
	}

	public final MessageTypeContext messageType() throws RecognitionException {
		MessageTypeContext _localctx = new MessageTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_messageType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(407);
				match(DOT);
				}
			}

			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(410);
					match(Ident);
					setState(411);
					match(DOT);
					}
					} 
				}
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(417);
			messageName();
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

	public static class MessageOrEnumTypeContext extends ParserRuleContext {
		public MessageOrEnumNameContext messageOrEnumName() {
			return getRuleContext(MessageOrEnumNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Protobuf3Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Protobuf3Parser.DOT, i);
		}
		public List<TerminalNode> Ident() { return getTokens(Protobuf3Parser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(Protobuf3Parser.Ident, i);
		}
		public List<ReservedWordContext> reservedWord() {
			return getRuleContexts(ReservedWordContext.class);
		}
		public ReservedWordContext reservedWord(int i) {
			return getRuleContext(ReservedWordContext.class,i);
		}
		public MessageOrEnumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageOrEnumType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterMessageOrEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitMessageOrEnumType(this);
		}
	}

	public final MessageOrEnumTypeContext messageOrEnumType() throws RecognitionException {
		MessageOrEnumTypeContext _localctx = new MessageOrEnumTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_messageOrEnumType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(419);
				match(DOT);
				}
			}

			setState(429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(424);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Ident:
						{
						setState(422);
						match(Ident);
						}
						break;
					case EXTEND:
					case MESSAGE:
					case OPTION:
					case PACKAGE:
					case RPC:
					case SERVICE:
					case STREAM:
					case STRING:
					case SYNTAX:
					case WEAK:
						{
						setState(423);
						reservedWord();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(426);
					match(DOT);
					}
					} 
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(432);
			messageOrEnumName();
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(SEMI);
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

	public static class ConstantContext extends ParserRuleContext {
		public FullIdentContext fullIdent() {
			return getRuleContext(FullIdentContext.class,0);
		}
		public TerminalNode IntLit() { return getToken(Protobuf3Parser.IntLit, 0); }
		public TerminalNode MINUS() { return getToken(Protobuf3Parser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(Protobuf3Parser.PLUS, 0); }
		public TerminalNode FloatLit() { return getToken(Protobuf3Parser.FloatLit, 0); }
		public TerminalNode StrLit() { return getToken(Protobuf3Parser.StrLit, 0); }
		public TerminalNode BoolLit() { return getToken(Protobuf3Parser.BoolLit, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Protobuf3Listener ) ((Protobuf3Listener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_constant);
		int _la;
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				fullIdent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(437);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(440);
				match(IntLit);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(441);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(444);
				match(FloatLit);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(445);
				_la = _input.LA(1);
				if ( !(_la==BoolLit || _la==StrLit) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u01c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\7\2c\n\2\f\2\16\2f\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4q\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\177\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0088\n"+
		"\7\3\7\3\7\3\7\5\7\u008d\n\7\7\7\u008f\n\7\f\7\16\7\u0092\13\7\3\b\3\b"+
		"\7\b\u0096\n\b\f\b\16\b\u0099\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\5\n\u00a5\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u00b5\n\f\f\f\16\f\u00b8\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\7\16\u00c4\n\16\f\16\16\16\u00c7\13\16\3\16\3\16\3\17"+
		"\3\17\3\17\5\17\u00ce\n\17\3\17\3\17\3\17\3\17\3\17\7\17\u00d5\n\17\f"+
		"\17\16\17\u00d8\13\17\3\17\3\17\5\17\u00dc\n\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00e9\n\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u00f3\n\22\f\22\16\22\u00f6\13\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\5\23\u00fe\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u0105"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\7\23\u010c\n\23\f\23\16\23\u010f\13\23"+
		"\3\23\3\23\5\23\u0113\n\23\3\24\3\24\3\24\5\24\u0118\n\24\3\24\3\24\3"+
		"\25\3\25\3\25\7\25\u011f\n\25\f\25\16\25\u0122\13\25\3\26\3\26\3\26\3"+
		"\26\5\26\u0128\n\26\3\27\3\27\3\27\7\27\u012d\n\27\f\27\16\27\u0130\13"+
		"\27\3\30\3\30\5\30\u0134\n\30\3\31\3\31\3\32\5\32\u0139\n\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0143\n\32\3\32\3\32\3\33\3\33\3\33"+
		"\7\33\u014a\n\33\f\33\16\33\u014d\13\33\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\7\35\u0158\n\35\f\35\16\35\u015b\13\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0167\n\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0178\n\37"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\7\"\u0183\n\"\f\"\16\"\u0186\13\"\3"+
		"#\3#\3$\3$\3%\3%\3&\3&\5&\u0190\n&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\5+\u019b"+
		"\n+\3+\3+\7+\u019f\n+\f+\16+\u01a2\13+\3+\3+\3,\5,\u01a7\n,\3,\3,\5,\u01ab"+
		"\n,\3,\7,\u01ae\n,\f,\16,\u01b1\13,\3,\3,\3-\3-\3.\3.\5.\u01b9\n.\3.\3"+
		".\5.\u01bd\n.\3.\3.\5.\u01c1\n.\3.\2\2/\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\t\3\2\24\25\4\2\26"+
		"\26&&\b\2\4\6\t\13\r\16\34\37!!$%\b\2\4\4\t\n\r\16\34\37!!$%\b\2\b\b\20"+
		"\20\22\23\32\33 \"&&\3\289\3\2*+\2\u01d3\2\\\3\2\2\2\4i\3\2\2\2\6n\3\2"+
		"\2\2\bu\3\2\2\2\ny\3\2\2\2\f\u0087\3\2\2\2\16\u0093\3\2\2\2\20\u009c\3"+
		"\2\2\2\22\u00a4\3\2\2\2\24\u00a6\3\2\2\2\26\u00aa\3\2\2\2\30\u00bb\3\2"+
		"\2\2\32\u00bf\3\2\2\2\34\u00ca\3\2\2\2\36\u00df\3\2\2\2 \u00e3\3\2\2\2"+
		"\"\u00ec\3\2\2\2$\u00f9\3\2\2\2&\u0114\3\2\2\2(\u011b\3\2\2\2*\u0127\3"+
		"\2\2\2,\u0129\3\2\2\2.\u0133\3\2\2\2\60\u0135\3\2\2\2\62\u0138\3\2\2\2"+
		"\64\u0146\3\2\2\2\66\u014e\3\2\2\28\u0152\3\2\2\2:\u015e\3\2\2\2<\u016a"+
		"\3\2\2\2>\u017b\3\2\2\2@\u017d\3\2\2\2B\u017f\3\2\2\2D\u0187\3\2\2\2F"+
		"\u0189\3\2\2\2H\u018b\3\2\2\2J\u018f\3\2\2\2L\u0191\3\2\2\2N\u0193\3\2"+
		"\2\2P\u0195\3\2\2\2R\u0197\3\2\2\2T\u019a\3\2\2\2V\u01a6\3\2\2\2X\u01b4"+
		"\3\2\2\2Z\u01c0\3\2\2\2\\d\5\4\3\2]c\5\6\4\2^c\5\b\5\2_c\5\n\6\2`c\5\22"+
		"\n\2ac\5X-\2b]\3\2\2\2b^\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2cf\3\2\2"+
		"\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\2\2\3h\3\3\2\2\2ij\7\""+
		"\2\2jk\7:\2\2kl\t\2\2\2lm\7\65\2\2m\5\3\2\2\2np\7\f\2\2oq\t\3\2\2po\3"+
		"\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7+\2\2st\7\65\2\2t\7\3\2\2\2uv\7\23\2\2v"+
		"w\5B\"\2wx\7\65\2\2x\t\3\2\2\2yz\7\22\2\2z{\5\f\7\2{~\7:\2\2|\177\5Z."+
		"\2}\177\5\16\b\2~|\3\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7\65"+
		"\2\2\u0081\13\3\2\2\2\u0082\u0088\7\'\2\2\u0083\u0084\7-\2\2\u0084\u0085"+
		"\5B\"\2\u0085\u0086\7.\2\2\u0086\u0088\3\2\2\2\u0087\u0082\3\2\2\2\u0087"+
		"\u0083\3\2\2\2\u0088\u0090\3\2\2\2\u0089\u008c\7\67\2\2\u008a\u008d\7"+
		"\'\2\2\u008b\u008d\5@!\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u0089\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\r\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0097"+
		"\7/\2\2\u0094\u0096\5\20\t\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\u009b\7\60\2\2\u009b\17\3\2\2\2\u009c\u009d\5\f\7\2\u009d\u009e"+
		"\7\3\2\2\u009e\u009f\5Z.\2\u009f\21\3\2\2\2\u00a0\u00a5\5\24\13\2\u00a1"+
		"\u00a5\5\30\r\2\u00a2\u00a5\5 \21\2\u00a3\u00a5\5\"\22\2\u00a4\u00a0\3"+
		"\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\23\3\2\2\2\u00a6\u00a7\7\20\2\2\u00a7\u00a8\5D#\2\u00a8\u00a9\5\26\f"+
		"\2\u00a9\25\3\2\2\2\u00aa\u00b6\7/\2\2\u00ab\u00b5\5\62\32\2\u00ac\u00b5"+
		"\5\30\r\2\u00ad\u00b5\5\24\13\2\u00ae\u00b5\5 \21\2\u00af\u00b5\5\n\6"+
		"\2\u00b0\u00b5\58\35\2\u00b1\u00b5\5<\37\2\u00b2\u00b5\5&\24\2\u00b3\u00b5"+
		"\5X-\2\u00b4\u00ab\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00ad\3\2\2\2\u00b4"+
		"\u00ae\3\2\2\2\u00b4\u00af\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b1\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b9\u00ba\7\60\2\2\u00ba\27\3\2\2\2\u00bb\u00bc\7\7\2\2\u00bc\u00bd"+
		"\5F$\2\u00bd\u00be\5\32\16\2\u00be\31\3\2\2\2\u00bf\u00c5\7/\2\2\u00c0"+
		"\u00c4\5\n\6\2\u00c1\u00c4\5\34\17\2\u00c2\u00c4\5X-\2\u00c3\u00c0\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\u00c9\7\60\2\2\u00c9\33\3\2\2\2\u00ca\u00cb\7\'\2\2\u00cb\u00cd"+
		"\7:\2\2\u00cc\u00ce\78\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00db\7(\2\2\u00d0\u00d1\7\61\2\2\u00d1\u00d6\5\36"+
		"\20\2\u00d2\u00d3\7\66\2\2\u00d3\u00d5\5\36\20\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7\62\2\2\u00da\u00dc\3\2\2\2\u00db"+
		"\u00d0\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7\65"+
		"\2\2\u00de\35\3\2\2\2\u00df\u00e0\5\f\7\2\u00e0\u00e1\7:\2\2\u00e1\u00e2"+
		"\5Z.\2\u00e2\37\3\2\2\2\u00e3\u00e4\7\b\2\2\u00e4\u00e5\5T+\2\u00e5\u00e8"+
		"\7/\2\2\u00e6\u00e9\5\62\32\2\u00e7\u00e9\5X-\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7\60\2\2\u00eb!\3\2\2\2"+
		"\u00ec\u00ed\7\33\2\2\u00ed\u00ee\5P)\2\u00ee\u00f4\7/\2\2\u00ef\u00f3"+
		"\5\n\6\2\u00f0\u00f3\5$\23\2\u00f1\u00f3\5X-\2\u00f2\u00ef\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00f8\7\60\2\2\u00f8#\3\2\2\2\u00f9\u00fa\7\32\2\2\u00fa\u00fb\5R*\2"+
		"\u00fb\u00fd\7-\2\2\u00fc\u00fe\7 \2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\5T+\2\u0100\u0101\7.\2\2\u0101"+
		"\u0102\7\31\2\2\u0102\u0104\7-\2\2\u0103\u0105\7 \2\2\u0104\u0103\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\5T+\2\u0107\u0112"+
		"\7.\2\2\u0108\u010d\7/\2\2\u0109\u010c\5\n\6\2\u010a\u010c\5X-\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0113\7\60\2\2\u0111\u0113\7\65\2\2\u0112\u0108\3\2\2\2\u0112\u0111\3"+
		"\2\2\2\u0113%\3\2\2\2\u0114\u0117\7\30\2\2\u0115\u0118\5(\25\2\u0116\u0118"+
		"\5,\27\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\7\65\2\2\u011a\'\3\2\2\2\u011b\u0120\5*\26\2\u011c\u011d\7\66\2"+
		"\2\u011d\u011f\5*\26\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121)\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u0128\7(\2\2\u0124\u0125\7(\2\2\u0125\u0126\7#\2\2\u0126\u0128\7(\2\2"+
		"\u0127\u0123\3\2\2\2\u0127\u0124\3\2\2\2\u0128+\3\2\2\2\u0129\u012e\7"+
		"+\2\2\u012a\u012b\7\66\2\2\u012b\u012d\7+\2\2\u012c\u012a\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f-\3\2\2\2"+
		"\u0130\u012e\3\2\2\2\u0131\u0134\t\4\2\2\u0132\u0134\5V,\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0132\3\2\2\2\u0134/\3\2\2\2\u0135\u0136\7(\2\2\u0136\61"+
		"\3\2\2\2\u0137\u0139\7\27\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2"+
		"\u0139\u013a\3\2\2\2\u013a\u013b\5.\30\2\u013b\u013c\5J&\2\u013c\u013d"+
		"\7:\2\2\u013d\u0142\5\60\31\2\u013e\u013f\7\61\2\2\u013f\u0140\5\64\33"+
		"\2\u0140\u0141\7\62\2\2\u0141\u0143\3\2\2\2\u0142\u013e\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7\65\2\2\u0145\63\3\2\2"+
		"\2\u0146\u014b\5\66\34\2\u0147\u0148\7\66\2\2\u0148\u014a\5\66\34\2\u0149"+
		"\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\65\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\5\f\7\2\u014f\u0150"+
		"\7:\2\2\u0150\u0151\5Z.\2\u0151\67\3\2\2\2\u0152\u0153\7\21\2\2\u0153"+
		"\u0154\5L\'\2\u0154\u0159\7/\2\2\u0155\u0158\5:\36\2\u0156\u0158\5X-\2"+
		"\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u015d\7\60\2\2\u015d9\3\2\2\2\u015e\u015f\5.\30\2\u015f\u0160\5J&\2\u0160"+
		"\u0161\7:\2\2\u0161\u0166\5\60\31\2\u0162\u0163\7\61\2\2\u0163\u0164\5"+
		"\64\33\2\u0164\u0165\7\62\2\2\u0165\u0167\3\2\2\2\u0166\u0162\3\2\2\2"+
		"\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\7\65\2\2\u0169;\3"+
		"\2\2\2\u016a\u016b\7\17\2\2\u016b\u016c\7\63\2\2\u016c\u016d\5> \2\u016d"+
		"\u016e\7\66\2\2\u016e\u016f\5.\30\2\u016f\u0170\7\64\2\2\u0170\u0171\5"+
		"N(\2\u0171\u0172\7:\2\2\u0172\u0177\5\60\31\2\u0173\u0174\7\61\2\2\u0174"+
		"\u0175\5\64\33\2\u0175\u0176\7\62\2\2\u0176\u0178\3\2\2\2\u0177\u0173"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7\65\2\2"+
		"\u017a=\3\2\2\2\u017b\u017c\t\5\2\2\u017c?\3\2\2\2\u017d\u017e\t\6\2\2"+
		"\u017eA\3\2\2\2\u017f\u0184\7\'\2\2\u0180\u0181\7\67\2\2\u0181\u0183\7"+
		"\'\2\2\u0182\u0180\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185C\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\7\'\2\2"+
		"\u0188E\3\2\2\2\u0189\u018a\7\'\2\2\u018aG\3\2\2\2\u018b\u018c\7\'\2\2"+
		"\u018cI\3\2\2\2\u018d\u0190\7\'\2\2\u018e\u0190\5@!\2\u018f\u018d\3\2"+
		"\2\2\u018f\u018e\3\2\2\2\u0190K\3\2\2\2\u0191\u0192\7\'\2\2\u0192M\3\2"+
		"\2\2\u0193\u0194\7\'\2\2\u0194O\3\2\2\2\u0195\u0196\7\'\2\2\u0196Q\3\2"+
		"\2\2\u0197\u0198\7\'\2\2\u0198S\3\2\2\2\u0199\u019b\7\67\2\2\u019a\u0199"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u01a0\3\2\2\2\u019c\u019d\7\'\2\2\u019d"+
		"\u019f\7\67\2\2\u019e\u019c\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3"+
		"\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3"+
		"\u01a4\5D#\2\u01a4U\3\2\2\2\u01a5\u01a7\7\67\2\2\u01a6\u01a5\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01af\3\2\2\2\u01a8\u01ab\7\'\2\2\u01a9\u01ab\5@"+
		"!\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ae\7\67\2\2\u01ad\u01aa\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3"+
		"\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2"+
		"\u01b3\5H%\2\u01b3W\3\2\2\2\u01b4\u01b5\7\65\2\2\u01b5Y\3\2\2\2\u01b6"+
		"\u01c1\5B\"\2\u01b7\u01b9\t\7\2\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01c1\7(\2\2\u01bb\u01bd\t\7\2\2\u01bc"+
		"\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c1\7)"+
		"\2\2\u01bf\u01c1\t\b\2\2\u01c0\u01b6\3\2\2\2\u01c0\u01b8\3\2\2\2\u01c0"+
		"\u01bc\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1[\3\2\2\2\60bdp~\u0087\u008c\u0090"+
		"\u0097\u00a4\u00b4\u00b6\u00c3\u00c5\u00cd\u00d6\u00db\u00e8\u00f2\u00f4"+
		"\u00fd\u0104\u010b\u010d\u0112\u0117\u0120\u0127\u012e\u0133\u0138\u0142"+
		"\u014b\u0157\u0159\u0166\u0177\u0184\u018f\u019a\u01a0\u01a6\u01aa\u01af"+
		"\u01b8\u01bc\u01c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}