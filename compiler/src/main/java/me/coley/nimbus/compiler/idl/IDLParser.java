package me.coley.nimbus.compiler.idl;// Generated from IDL.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEGER_LITERAL=1, OCTAL_LITERAL=2, HEX_LITERAL=3, FLOATING_PT_LITERAL=4, 
		FIXED_PT_LITERAL=5, WIDE_CHARACTER_LITERAL=6, CHARACTER_LITERAL=7, WIDE_STRING_LITERAL=8, 
		STRING_LITERAL=9, BOOLEAN_LITERAL=10, SEMICOLON=11, COLON=12, COMMA=13, 
		LEFT_BRACE=14, RIGHT_BRACE=15, LEFT_BRACKET=16, RIGHT_BRACKET=17, LEFT_SQUARE_BRACKET=18, 
		RIGHT_SQUARE_BRACKET=19, TILDE=20, SLASH=21, LEFT_ANG_BRACKET=22, RIGHT_ANG_BRACKET=23, 
		STAR=24, PLUS=25, MINUS=26, CARET=27, AMPERSAND=28, PIPE=29, EQUAL=30, 
		PERCENT=31, DOUBLE_COLON=32, RIGHT_SHIFT=33, LEFT_SHIFT=34, AT=35, KW_SETRAISES=36, 
		KW_OUT=37, KW_EMITS=38, KW_STRING=39, KW_SWITCH=40, KW_PUBLISHES=41, KW_TYPEDEF=42, 
		KW_USES=43, KW_PRIMARYKEY=44, KW_CUSTOM=45, KW_OCTET=46, KW_SEQUENCE=47, 
		KW_IMPORT=48, KW_STRUCT=49, KW_NATIVE=50, KW_READONLY=51, KW_FINDER=52, 
		KW_RAISES=53, KW_VOID=54, KW_PRIVATE=55, KW_EVENTTYPE=56, KW_WCHAR=57, 
		KW_IN=58, KW_DEFAULT=59, KW_PUBLIC=60, KW_SHORT=61, KW_LONG=62, KW_ENUM=63, 
		KW_WSTRING=64, KW_CONTEXT=65, KW_HOME=66, KW_FACTORY=67, KW_EXCEPTION=68, 
		KW_GETRAISES=69, KW_CONST=70, KW_VALUEBASE=71, KW_VALUETYPE=72, KW_SUPPORTS=73, 
		KW_MODULE=74, KW_OBJECT=75, KW_TRUNCATABLE=76, KW_UNSIGNED=77, KW_FIXED=78, 
		KW_UNION=79, KW_ONEWAY=80, KW_ANY=81, KW_CHAR=82, KW_CASE=83, KW_FLOAT=84, 
		KW_BOOLEAN=85, KW_MULTIPLE=86, KW_ABSTRACT=87, KW_INOUT=88, KW_PROVIDES=89, 
		KW_CONSUMES=90, KW_DOUBLE=91, KW_TYPEPREFIX=92, KW_TYPEID=93, KW_ATTRIBUTE=94, 
		KW_LOCAL=95, KW_MANAGES=96, KW_INTERFACE=97, KW_COMPONENT=98, KW_SET=99, 
		KW_MAP=100, KW_BITFIELD=101, KW_BITSET=102, KW_BITMASK=103, KW_INT8=104, 
		KW_UINT8=105, KW_INT16=106, KW_UINT16=107, KW_INT32=108, KW_UINT32=109, 
		KW_INT64=110, KW_UINT64=111, KW_AT_ANNOTATION=112, ID=113, WS=114, COMMENT=115, 
		LINE_COMMENT=116;
	public static final int
		RULE_specification = 0, RULE_definition = 1, RULE_module = 2, RULE_interface_or_forward_decl = 3, 
		RULE_interface_decl = 4, RULE_forward_decl = 5, RULE_interface_header = 6, 
		RULE_interface_body = 7, RULE_export = 8, RULE_interface_inheritance_spec = 9, 
		RULE_interface_name = 10, RULE_a_scoped_name = 11, RULE_scoped_name = 12, 
		RULE_value = 13, RULE_value_forward_decl = 14, RULE_value_box_decl = 15, 
		RULE_value_abs_decl = 16, RULE_value_decl = 17, RULE_value_header = 18, 
		RULE_value_inheritance_spec = 19, RULE_value_name = 20, RULE_value_element = 21, 
		RULE_state_member = 22, RULE_init_decl = 23, RULE_init_param_decls = 24, 
		RULE_init_param_decl = 25, RULE_init_param_attribute = 26, RULE_const_decl = 27, 
		RULE_const_type = 28, RULE_const_exp = 29, RULE_or_expr = 30, RULE_xor_expr = 31, 
		RULE_and_expr = 32, RULE_shift_expr = 33, RULE_add_expr = 34, RULE_mult_expr = 35, 
		RULE_unary_expr = 36, RULE_unary_operator = 37, RULE_primary_expr = 38, 
		RULE_literal = 39, RULE_positive_int_const = 40, RULE_type_decl = 41, 
		RULE_type_declarator = 42, RULE_type_spec = 43, RULE_simple_type_spec = 44, 
		RULE_bitfield_type_spec = 45, RULE_base_type_spec = 46, RULE_template_type_spec = 47, 
		RULE_constr_type_spec = 48, RULE_simple_declarators = 49, RULE_declarators = 50, 
		RULE_declarator = 51, RULE_simple_declarator = 52, RULE_complex_declarator = 53, 
		RULE_floating_pt_type = 54, RULE_integer_type = 55, RULE_signed_int = 56, 
		RULE_signed_tiny_int = 57, RULE_signed_short_int = 58, RULE_signed_long_int = 59, 
		RULE_signed_longlong_int = 60, RULE_unsigned_int = 61, RULE_unsigned_tiny_int = 62, 
		RULE_unsigned_short_int = 63, RULE_unsigned_long_int = 64, RULE_unsigned_longlong_int = 65, 
		RULE_char_type = 66, RULE_wide_char_type = 67, RULE_boolean_type = 68, 
		RULE_octet_type = 69, RULE_any_type = 70, RULE_object_type = 71, RULE_annotation_decl = 72, 
		RULE_annotation_def = 73, RULE_annotation_header = 74, RULE_annotation_inheritance_spec = 75, 
		RULE_annotation_body = 76, RULE_annotation_member = 77, RULE_annotation_forward_dcl = 78, 
		RULE_bitset_type = 79, RULE_bitfield = 80, RULE_bitfield_spec = 81, RULE_bitmask_type = 82, 
		RULE_bit_values = 83, RULE_struct_type = 84, RULE_member_list = 85, RULE_member = 86, 
		RULE_union_type = 87, RULE_switch_type_spec = 88, RULE_switch_body = 89, 
		RULE_case_stmt = 90, RULE_case_label = 91, RULE_element_spec = 92, RULE_enum_type = 93, 
		RULE_enumerator = 94, RULE_sequence_type = 95, RULE_set_type = 96, RULE_map_type = 97, 
		RULE_string_type = 98, RULE_wide_string_type = 99, RULE_array_declarator = 100, 
		RULE_fixed_array_size = 101, RULE_attr_decl = 102, RULE_except_decl = 103, 
		RULE_op_decl = 104, RULE_op_attribute = 105, RULE_op_type_spec = 106, 
		RULE_parameter_decls = 107, RULE_param_decl = 108, RULE_param_attribute = 109, 
		RULE_raises_expr = 110, RULE_context_expr = 111, RULE_param_type_spec = 112, 
		RULE_fixed_pt_type = 113, RULE_fixed_pt_const_type = 114, RULE_value_base_type = 115, 
		RULE_constr_forward_decl = 116, RULE_import_decl = 117, RULE_imported_scope = 118, 
		RULE_type_id_decl = 119, RULE_type_prefix_decl = 120, RULE_readonly_attr_spec = 121, 
		RULE_readonly_attr_declarator = 122, RULE_attr_spec = 123, RULE_attr_declarator = 124, 
		RULE_attr_raises_expr = 125, RULE_get_excep_expr = 126, RULE_set_excep_expr = 127, 
		RULE_exception_list = 128, RULE_component = 129, RULE_component_forward_decl = 130, 
		RULE_component_decl = 131, RULE_component_header = 132, RULE_supported_interface_spec = 133, 
		RULE_component_inheritance_spec = 134, RULE_component_body = 135, RULE_component_export = 136, 
		RULE_provides_decl = 137, RULE_interface_type = 138, RULE_uses_decl = 139, 
		RULE_emits_decl = 140, RULE_publishes_decl = 141, RULE_consumes_decl = 142, 
		RULE_home_decl = 143, RULE_home_header = 144, RULE_home_inheritance_spec = 145, 
		RULE_primary_key_spec = 146, RULE_home_body = 147, RULE_home_export = 148, 
		RULE_factory_decl = 149, RULE_finder_decl = 150, RULE_event = 151, RULE_event_forward_decl = 152, 
		RULE_event_abs_decl = 153, RULE_event_decl = 154, RULE_event_header = 155, 
		RULE_annapps = 156, RULE_annotation_appl = 157, RULE_annotation_appl_params = 158, 
		RULE_annotation_appl_param = 159, RULE_identifier = 160;
	private static String[] makeRuleNames() {
		return new String[] {
			"specification", "definition", "module", "interface_or_forward_decl", 
			"interface_decl", "forward_decl", "interface_header", "interface_body", 
			"export", "interface_inheritance_spec", "interface_name", "a_scoped_name", 
			"scoped_name", "value", "value_forward_decl", "value_box_decl", "value_abs_decl", 
			"value_decl", "value_header", "value_inheritance_spec", "value_name", 
			"value_element", "state_member", "init_decl", "init_param_decls", "init_param_decl", 
			"init_param_attribute", "const_decl", "const_type", "const_exp", "or_expr", 
			"xor_expr", "and_expr", "shift_expr", "add_expr", "mult_expr", "unary_expr", 
			"unary_operator", "primary_expr", "literal", "positive_int_const", "type_decl", 
			"type_declarator", "type_spec", "simple_type_spec", "bitfield_type_spec", 
			"base_type_spec", "template_type_spec", "constr_type_spec", "simple_declarators", 
			"declarators", "declarator", "simple_declarator", "complex_declarator", 
			"floating_pt_type", "integer_type", "signed_int", "signed_tiny_int", 
			"signed_short_int", "signed_long_int", "signed_longlong_int", "unsigned_int", 
			"unsigned_tiny_int", "unsigned_short_int", "unsigned_long_int", "unsigned_longlong_int", 
			"char_type", "wide_char_type", "boolean_type", "octet_type", "any_type", 
			"object_type", "annotation_decl", "annotation_def", "annotation_header", 
			"annotation_inheritance_spec", "annotation_body", "annotation_member", 
			"annotation_forward_dcl", "bitset_type", "bitfield", "bitfield_spec", 
			"bitmask_type", "bit_values", "struct_type", "member_list", "member", 
			"union_type", "switch_type_spec", "switch_body", "case_stmt", "case_label", 
			"element_spec", "enum_type", "enumerator", "sequence_type", "set_type", 
			"map_type", "string_type", "wide_string_type", "array_declarator", "fixed_array_size", 
			"attr_decl", "except_decl", "op_decl", "op_attribute", "op_type_spec", 
			"parameter_decls", "param_decl", "param_attribute", "raises_expr", "context_expr", 
			"param_type_spec", "fixed_pt_type", "fixed_pt_const_type", "value_base_type", 
			"constr_forward_decl", "import_decl", "imported_scope", "type_id_decl", 
			"type_prefix_decl", "readonly_attr_spec", "readonly_attr_declarator", 
			"attr_spec", "attr_declarator", "attr_raises_expr", "get_excep_expr", 
			"set_excep_expr", "exception_list", "component", "component_forward_decl", 
			"component_decl", "component_header", "supported_interface_spec", "component_inheritance_spec", 
			"component_body", "component_export", "provides_decl", "interface_type", 
			"uses_decl", "emits_decl", "publishes_decl", "consumes_decl", "home_decl", 
			"home_header", "home_inheritance_spec", "primary_key_spec", "home_body", 
			"home_export", "factory_decl", "finder_decl", "event", "event_forward_decl", 
			"event_abs_decl", "event_decl", "event_header", "annapps", "annotation_appl", 
			"annotation_appl_params", "annotation_appl_param", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "';'", 
			"':'", "','", "'{'", "'}'", "'('", "')'", "'['", "']'", "'~'", "'/'", 
			"'<'", "'>'", "'*'", "'+'", "'-'", "'^'", "'&'", "'|'", "'='", "'%'", 
			"'::'", "'>>'", "'<<'", "'@'", "'setraises'", "'out'", "'emits'", "'string'", 
			"'switch'", "'publishes'", "'typedef'", "'uses'", "'primarykey'", "'custom'", 
			"'octet'", "'sequence'", "'import'", "'struct'", "'native'", "'readonly'", 
			"'finder'", "'raises'", "'void'", "'private'", "'eventtype'", "'wchar'", 
			"'in'", "'default'", "'public'", "'short'", "'long'", "'enum'", "'wstring'", 
			"'context'", "'home'", "'factory'", "'exception'", "'getraises'", "'const'", 
			"'ValueBase'", "'valuetype'", "'supports'", "'module'", "'Object'", "'truncatable'", 
			"'unsigned'", "'fixed'", "'union'", "'oneway'", "'any'", "'char'", "'case'", 
			"'float'", "'boolean'", "'multiple'", "'abstract'", "'inout'", "'provides'", 
			"'consumes'", "'double'", "'typeprefix'", "'typeid'", "'attribute'", 
			"'local'", "'manages'", "'interface'", "'component'", "'set'", "'map'", 
			"'bitfield'", "'bitset'", "'bitmask'", "'int8'", "'uint8'", "'int16'", 
			"'uint16'", "'int32'", "'uint32'", "'int64'", "'uint64'", "'@annotation'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTEGER_LITERAL", "OCTAL_LITERAL", "HEX_LITERAL", "FLOATING_PT_LITERAL", 
			"FIXED_PT_LITERAL", "WIDE_CHARACTER_LITERAL", "CHARACTER_LITERAL", "WIDE_STRING_LITERAL", 
			"STRING_LITERAL", "BOOLEAN_LITERAL", "SEMICOLON", "COLON", "COMMA", "LEFT_BRACE", 
			"RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_SQUARE_BRACKET", 
			"RIGHT_SQUARE_BRACKET", "TILDE", "SLASH", "LEFT_ANG_BRACKET", "RIGHT_ANG_BRACKET", 
			"STAR", "PLUS", "MINUS", "CARET", "AMPERSAND", "PIPE", "EQUAL", "PERCENT", 
			"DOUBLE_COLON", "RIGHT_SHIFT", "LEFT_SHIFT", "AT", "KW_SETRAISES", "KW_OUT", 
			"KW_EMITS", "KW_STRING", "KW_SWITCH", "KW_PUBLISHES", "KW_TYPEDEF", "KW_USES", 
			"KW_PRIMARYKEY", "KW_CUSTOM", "KW_OCTET", "KW_SEQUENCE", "KW_IMPORT", 
			"KW_STRUCT", "KW_NATIVE", "KW_READONLY", "KW_FINDER", "KW_RAISES", "KW_VOID", 
			"KW_PRIVATE", "KW_EVENTTYPE", "KW_WCHAR", "KW_IN", "KW_DEFAULT", "KW_PUBLIC", 
			"KW_SHORT", "KW_LONG", "KW_ENUM", "KW_WSTRING", "KW_CONTEXT", "KW_HOME", 
			"KW_FACTORY", "KW_EXCEPTION", "KW_GETRAISES", "KW_CONST", "KW_VALUEBASE", 
			"KW_VALUETYPE", "KW_SUPPORTS", "KW_MODULE", "KW_OBJECT", "KW_TRUNCATABLE", 
			"KW_UNSIGNED", "KW_FIXED", "KW_UNION", "KW_ONEWAY", "KW_ANY", "KW_CHAR", 
			"KW_CASE", "KW_FLOAT", "KW_BOOLEAN", "KW_MULTIPLE", "KW_ABSTRACT", "KW_INOUT", 
			"KW_PROVIDES", "KW_CONSUMES", "KW_DOUBLE", "KW_TYPEPREFIX", "KW_TYPEID", 
			"KW_ATTRIBUTE", "KW_LOCAL", "KW_MANAGES", "KW_INTERFACE", "KW_COMPONENT", 
			"KW_SET", "KW_MAP", "KW_BITFIELD", "KW_BITSET", "KW_BITMASK", "KW_INT8", 
			"KW_UINT8", "KW_INT16", "KW_UINT16", "KW_INT32", "KW_UINT32", "KW_INT64", 
			"KW_UINT64", "KW_AT_ANNOTATION", "ID", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "IDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SpecificationContext extends ParserRuleContext {
		public List<Import_declContext> import_decl() {
			return getRuleContexts(Import_declContext.class);
		}
		public Import_declContext import_decl(int i) {
			return getRuleContext(Import_declContext.class,i);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public SpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitSpecification(this);
		}
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_specification);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(322);
					import_decl();
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(329); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(328);
				definition();
				}
				}
				setState(331); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << KW_TYPEDEF) | (1L << KW_CUSTOM) | (1L << KW_STRUCT) | (1L << KW_NATIVE) | (1L << KW_EVENTTYPE) | (1L << KW_ENUM))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (KW_HOME - 66)) | (1L << (KW_EXCEPTION - 66)) | (1L << (KW_CONST - 66)) | (1L << (KW_VALUETYPE - 66)) | (1L << (KW_MODULE - 66)) | (1L << (KW_UNION - 66)) | (1L << (KW_ABSTRACT - 66)) | (1L << (KW_TYPEPREFIX - 66)) | (1L << (KW_TYPEID - 66)) | (1L << (KW_LOCAL - 66)) | (1L << (KW_INTERFACE - 66)) | (1L << (KW_COMPONENT - 66)) | (1L << (KW_BITSET - 66)) | (1L << (KW_BITMASK - 66)) | (1L << (KW_AT_ANNOTATION - 66)))) != 0) );
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

	public static class DefinitionContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public Const_declContext const_decl() {
			return getRuleContext(Const_declContext.class,0);
		}
		public Except_declContext except_decl() {
			return getRuleContext(Except_declContext.class,0);
		}
		public Interface_or_forward_declContext interface_or_forward_decl() {
			return getRuleContext(Interface_or_forward_declContext.class,0);
		}
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Type_id_declContext type_id_decl() {
			return getRuleContext(Type_id_declContext.class,0);
		}
		public Type_prefix_declContext type_prefix_decl() {
			return getRuleContext(Type_prefix_declContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public Home_declContext home_decl() {
			return getRuleContext(Home_declContext.class,0);
		}
		public Annotation_declContext annotation_decl() {
			return getRuleContext(Annotation_declContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			annapps();
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(334);
				type_decl();
				setState(335);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(337);
				const_decl();
				setState(338);
				match(SEMICOLON);
				}
				break;
			case 3:
				{
				setState(340);
				except_decl();
				setState(341);
				match(SEMICOLON);
				}
				break;
			case 4:
				{
				setState(343);
				interface_or_forward_decl();
				setState(344);
				match(SEMICOLON);
				}
				break;
			case 5:
				{
				setState(346);
				module();
				setState(347);
				match(SEMICOLON);
				}
				break;
			case 6:
				{
				setState(349);
				value();
				setState(350);
				match(SEMICOLON);
				}
				break;
			case 7:
				{
				setState(352);
				type_id_decl();
				setState(353);
				match(SEMICOLON);
				}
				break;
			case 8:
				{
				setState(355);
				type_prefix_decl();
				setState(356);
				match(SEMICOLON);
				}
				break;
			case 9:
				{
				setState(358);
				event();
				setState(359);
				match(SEMICOLON);
				}
				break;
			case 10:
				{
				setState(361);
				component();
				setState(362);
				match(SEMICOLON);
				}
				break;
			case 11:
				{
				setState(364);
				home_decl();
				setState(365);
				match(SEMICOLON);
				}
				break;
			case 12:
				{
				setState(367);
				annotation_decl();
				setState(368);
				match(SEMICOLON);
				}
				break;
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

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode KW_MODULE() { return getToken(IDLParser.KW_MODULE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(KW_MODULE);
			setState(373);
			identifier();
			setState(374);
			match(LEFT_BRACE);
			setState(376); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(375);
				definition();
				}
				}
				setState(378); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << KW_TYPEDEF) | (1L << KW_CUSTOM) | (1L << KW_STRUCT) | (1L << KW_NATIVE) | (1L << KW_EVENTTYPE) | (1L << KW_ENUM))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (KW_HOME - 66)) | (1L << (KW_EXCEPTION - 66)) | (1L << (KW_CONST - 66)) | (1L << (KW_VALUETYPE - 66)) | (1L << (KW_MODULE - 66)) | (1L << (KW_UNION - 66)) | (1L << (KW_ABSTRACT - 66)) | (1L << (KW_TYPEPREFIX - 66)) | (1L << (KW_TYPEID - 66)) | (1L << (KW_LOCAL - 66)) | (1L << (KW_INTERFACE - 66)) | (1L << (KW_COMPONENT - 66)) | (1L << (KW_BITSET - 66)) | (1L << (KW_BITMASK - 66)) | (1L << (KW_AT_ANNOTATION - 66)))) != 0) );
			setState(380);
			match(RIGHT_BRACE);
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

	public static class Interface_or_forward_declContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Interface_declContext interface_decl() {
			return getRuleContext(Interface_declContext.class,0);
		}
		public Forward_declContext forward_decl() {
			return getRuleContext(Forward_declContext.class,0);
		}
		public Interface_or_forward_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_or_forward_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterInterface_or_forward_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitInterface_or_forward_decl(this);
		}
	}

	public final Interface_or_forward_declContext interface_or_forward_decl() throws RecognitionException {
		Interface_or_forward_declContext _localctx = new Interface_or_forward_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_interface_or_forward_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			annapps();
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(383);
				interface_decl();
				}
				break;
			case 2:
				{
				setState(384);
				forward_decl();
				}
				break;
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

	public static class Interface_declContext extends ParserRuleContext {
		public Interface_headerContext interface_header() {
			return getRuleContext(Interface_headerContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public Interface_bodyContext interface_body() {
			return getRuleContext(Interface_bodyContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public Interface_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterInterface_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitInterface_decl(this);
		}
	}

	public final Interface_declContext interface_decl() throws RecognitionException {
		Interface_declContext _localctx = new Interface_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_interface_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			interface_header();
			setState(388);
			match(LEFT_BRACE);
			setState(389);
			interface_body();
			setState(390);
			match(RIGHT_BRACE);
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

	public static class Forward_declContext extends ParserRuleContext {
		public TerminalNode KW_INTERFACE() { return getToken(IDLParser.KW_INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_ABSTRACT() { return getToken(IDLParser.KW_ABSTRACT, 0); }
		public TerminalNode KW_LOCAL() { return getToken(IDLParser.KW_LOCAL, 0); }
		public Forward_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forward_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterForward_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitForward_decl(this);
		}
	}

	public final Forward_declContext forward_decl() throws RecognitionException {
		Forward_declContext _localctx = new Forward_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forward_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ABSTRACT || _la==KW_LOCAL) {
				{
				setState(392);
				_la = _input.LA(1);
				if ( !(_la==KW_ABSTRACT || _la==KW_LOCAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(395);
			match(KW_INTERFACE);
			setState(396);
			identifier();
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

	public static class Interface_headerContext extends ParserRuleContext {
		public TerminalNode KW_INTERFACE() { return getToken(IDLParser.KW_INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Interface_inheritance_specContext interface_inheritance_spec() {
			return getRuleContext(Interface_inheritance_specContext.class,0);
		}
		public TerminalNode KW_ABSTRACT() { return getToken(IDLParser.KW_ABSTRACT, 0); }
		public TerminalNode KW_LOCAL() { return getToken(IDLParser.KW_LOCAL, 0); }
		public Interface_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterInterface_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitInterface_header(this);
		}
	}

	public final Interface_headerContext interface_header() throws RecognitionException {
		Interface_headerContext _localctx = new Interface_headerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interface_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ABSTRACT || _la==KW_LOCAL) {
				{
				setState(398);
				_la = _input.LA(1);
				if ( !(_la==KW_ABSTRACT || _la==KW_LOCAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(401);
			match(KW_INTERFACE);
			setState(402);
			identifier();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(403);
				interface_inheritance_spec();
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

	public static class Interface_bodyContext extends ParserRuleContext {
		public List<ExportContext> export() {
			return getRuleContexts(ExportContext.class);
		}
		public ExportContext export(int i) {
			return getRuleContext(ExportContext.class,i);
		}
		public Interface_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterInterface_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitInterface_body(this);
		}
	}

	public final Interface_bodyContext interface_body() throws RecognitionException {
		Interface_bodyContext _localctx = new Interface_bodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_interface_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COLON) | (1L << AT) | (1L << KW_STRING) | (1L << KW_TYPEDEF) | (1L << KW_OCTET) | (1L << KW_STRUCT) | (1L << KW_NATIVE) | (1L << KW_READONLY) | (1L << KW_VOID) | (1L << KW_WCHAR) | (1L << KW_SHORT) | (1L << KW_LONG) | (1L << KW_ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_WSTRING - 64)) | (1L << (KW_EXCEPTION - 64)) | (1L << (KW_CONST - 64)) | (1L << (KW_VALUEBASE - 64)) | (1L << (KW_OBJECT - 64)) | (1L << (KW_UNSIGNED - 64)) | (1L << (KW_UNION - 64)) | (1L << (KW_ONEWAY - 64)) | (1L << (KW_ANY - 64)) | (1L << (KW_CHAR - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_TYPEPREFIX - 64)) | (1L << (KW_TYPEID - 64)) | (1L << (KW_ATTRIBUTE - 64)) | (1L << (KW_BITSET - 64)) | (1L << (KW_BITMASK - 64)) | (1L << (KW_INT8 - 64)) | (1L << (KW_UINT8 - 64)) | (1L << (KW_INT16 - 64)) | (1L << (KW_UINT16 - 64)) | (1L << (KW_INT32 - 64)) | (1L << (KW_UINT32 - 64)) | (1L << (KW_INT64 - 64)) | (1L << (KW_UINT64 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(406);
				export();
				}
				}
				setState(411);
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

	public static class ExportContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public Const_declContext const_decl() {
			return getRuleContext(Const_declContext.class,0);
		}
		public Except_declContext except_decl() {
			return getRuleContext(Except_declContext.class,0);
		}
		public Attr_declContext attr_decl() {
			return getRuleContext(Attr_declContext.class,0);
		}
		public Op_declContext op_decl() {
			return getRuleContext(Op_declContext.class,0);
		}
		public Type_id_declContext type_id_decl() {
			return getRuleContext(Type_id_declContext.class,0);
		}
		public Type_prefix_declContext type_prefix_decl() {
			return getRuleContext(Type_prefix_declContext.class,0);
		}
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitExport(this);
		}
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			annapps();
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_TYPEDEF:
			case KW_STRUCT:
			case KW_NATIVE:
			case KW_ENUM:
			case KW_UNION:
			case KW_BITSET:
			case KW_BITMASK:
				{
				setState(413);
				type_decl();
				setState(414);
				match(SEMICOLON);
				}
				break;
			case KW_CONST:
				{
				setState(416);
				const_decl();
				setState(417);
				match(SEMICOLON);
				}
				break;
			case KW_EXCEPTION:
				{
				setState(419);
				except_decl();
				setState(420);
				match(SEMICOLON);
				}
				break;
			case KW_READONLY:
			case KW_ATTRIBUTE:
				{
				setState(422);
				attr_decl();
				setState(423);
				match(SEMICOLON);
				}
				break;
			case DOUBLE_COLON:
			case AT:
			case KW_STRING:
			case KW_OCTET:
			case KW_VOID:
			case KW_WCHAR:
			case KW_SHORT:
			case KW_LONG:
			case KW_WSTRING:
			case KW_VALUEBASE:
			case KW_OBJECT:
			case KW_UNSIGNED:
			case KW_ONEWAY:
			case KW_ANY:
			case KW_CHAR:
			case KW_FLOAT:
			case KW_BOOLEAN:
			case KW_DOUBLE:
			case KW_INT8:
			case KW_UINT8:
			case KW_INT16:
			case KW_UINT16:
			case KW_INT32:
			case KW_UINT32:
			case KW_INT64:
			case KW_UINT64:
			case ID:
				{
				setState(425);
				op_decl();
				setState(426);
				match(SEMICOLON);
				}
				break;
			case KW_TYPEID:
				{
				setState(428);
				type_id_decl();
				setState(429);
				match(SEMICOLON);
				}
				break;
			case KW_TYPEPREFIX:
				{
				setState(431);
				type_prefix_decl();
				setState(432);
				match(SEMICOLON);
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

	public static class Interface_inheritance_specContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(IDLParser.COLON, 0); }
		public List<Interface_nameContext> interface_name() {
			return getRuleContexts(Interface_nameContext.class);
		}
		public Interface_nameContext interface_name(int i) {
			return getRuleContext(Interface_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Interface_inheritance_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_inheritance_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterInterface_inheritance_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitInterface_inheritance_spec(this);
		}
	}

	public final Interface_inheritance_specContext interface_inheritance_spec() throws RecognitionException {
		Interface_inheritance_specContext _localctx = new Interface_inheritance_specContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_interface_inheritance_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(COLON);
			setState(437);
			interface_name();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(438);
				match(COMMA);
				setState(439);
				interface_name();
				}
				}
				setState(444);
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

	public static class Interface_nameContext extends ParserRuleContext {
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public Interface_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterInterface_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitInterface_name(this);
		}
	}

	public final Interface_nameContext interface_name() throws RecognitionException {
		Interface_nameContext _localctx = new Interface_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interface_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			a_scoped_name();
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

	public static class A_scoped_nameContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public A_scoped_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_scoped_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterA_scoped_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitA_scoped_name(this);
		}
	}

	public final A_scoped_nameContext a_scoped_name() throws RecognitionException {
		A_scoped_nameContext _localctx = new A_scoped_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_a_scoped_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			annapps();
			setState(448);
			scoped_name();
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

	public static class Scoped_nameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(IDLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IDLParser.ID, i);
		}
		public List<TerminalNode> DOUBLE_COLON() { return getTokens(IDLParser.DOUBLE_COLON); }
		public TerminalNode DOUBLE_COLON(int i) {
			return getToken(IDLParser.DOUBLE_COLON, i);
		}
		public Scoped_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scoped_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterScoped_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitScoped_name(this);
		}
	}

	public final Scoped_nameContext scoped_name() throws RecognitionException {
		Scoped_nameContext _localctx = new Scoped_nameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_scoped_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOUBLE_COLON) {
				{
				setState(450);
				match(DOUBLE_COLON);
				}
			}

			setState(453);
			match(ID);
			setState(458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(454);
					match(DOUBLE_COLON);
					setState(455);
					match(ID);
					}
					} 
				}
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ValueContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Value_declContext value_decl() {
			return getRuleContext(Value_declContext.class,0);
		}
		public Value_abs_declContext value_abs_decl() {
			return getRuleContext(Value_abs_declContext.class,0);
		}
		public Value_box_declContext value_box_decl() {
			return getRuleContext(Value_box_declContext.class,0);
		}
		public Value_forward_declContext value_forward_decl() {
			return getRuleContext(Value_forward_declContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			annapps();
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(462);
				value_decl();
				}
				break;
			case 2:
				{
				setState(463);
				value_abs_decl();
				}
				break;
			case 3:
				{
				setState(464);
				value_box_decl();
				}
				break;
			case 4:
				{
				setState(465);
				value_forward_decl();
				}
				break;
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

	public static class Value_forward_declContext extends ParserRuleContext {
		public TerminalNode KW_VALUETYPE() { return getToken(IDLParser.KW_VALUETYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_ABSTRACT() { return getToken(IDLParser.KW_ABSTRACT, 0); }
		public Value_forward_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_forward_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterValue_forward_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitValue_forward_decl(this);
		}
	}

	public final Value_forward_declContext value_forward_decl() throws RecognitionException {
		Value_forward_declContext _localctx = new Value_forward_declContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value_forward_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ABSTRACT) {
				{
				setState(468);
				match(KW_ABSTRACT);
				}
			}

			setState(471);
			match(KW_VALUETYPE);
			setState(472);
			identifier();
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

	public static class Value_box_declContext extends ParserRuleContext {
		public TerminalNode KW_VALUETYPE() { return getToken(IDLParser.KW_VALUETYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public Value_box_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_box_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterValue_box_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitValue_box_decl(this);
		}
	}

	public final Value_box_declContext value_box_decl() throws RecognitionException {
		Value_box_declContext _localctx = new Value_box_declContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value_box_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(KW_VALUETYPE);
			setState(475);
			identifier();
			setState(476);
			type_spec();
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

	public static class Value_abs_declContext extends ParserRuleContext {
		public TerminalNode KW_ABSTRACT() { return getToken(IDLParser.KW_ABSTRACT, 0); }
		public TerminalNode KW_VALUETYPE() { return getToken(IDLParser.KW_VALUETYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Value_inheritance_specContext value_inheritance_spec() {
			return getRuleContext(Value_inheritance_specContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public List<ExportContext> export() {
			return getRuleContexts(ExportContext.class);
		}
		public ExportContext export(int i) {
			return getRuleContext(ExportContext.class,i);
		}
		public Value_abs_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_abs_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterValue_abs_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitValue_abs_decl(this);
		}
	}

	public final Value_abs_declContext value_abs_decl() throws RecognitionException {
		Value_abs_declContext _localctx = new Value_abs_declContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value_abs_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(KW_ABSTRACT);
			setState(479);
			match(KW_VALUETYPE);
			setState(480);
			identifier();
			setState(481);
			value_inheritance_spec();
			setState(482);
			match(LEFT_BRACE);
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COLON) | (1L << AT) | (1L << KW_STRING) | (1L << KW_TYPEDEF) | (1L << KW_OCTET) | (1L << KW_STRUCT) | (1L << KW_NATIVE) | (1L << KW_READONLY) | (1L << KW_VOID) | (1L << KW_WCHAR) | (1L << KW_SHORT) | (1L << KW_LONG) | (1L << KW_ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_WSTRING - 64)) | (1L << (KW_EXCEPTION - 64)) | (1L << (KW_CONST - 64)) | (1L << (KW_VALUEBASE - 64)) | (1L << (KW_OBJECT - 64)) | (1L << (KW_UNSIGNED - 64)) | (1L << (KW_UNION - 64)) | (1L << (KW_ONEWAY - 64)) | (1L << (KW_ANY - 64)) | (1L << (KW_CHAR - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_TYPEPREFIX - 64)) | (1L << (KW_TYPEID - 64)) | (1L << (KW_ATTRIBUTE - 64)) | (1L << (KW_BITSET - 64)) | (1L << (KW_BITMASK - 64)) | (1L << (KW_INT8 - 64)) | (1L << (KW_UINT8 - 64)) | (1L << (KW_INT16 - 64)) | (1L << (KW_UINT16 - 64)) | (1L << (KW_INT32 - 64)) | (1L << (KW_UINT32 - 64)) | (1L << (KW_INT64 - 64)) | (1L << (KW_UINT64 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(483);
				export();
				}
				}
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(489);
			match(RIGHT_BRACE);
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

	public static class Value_declContext extends ParserRuleContext {
		public Value_headerContext value_header() {
			return getRuleContext(Value_headerContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public List<Value_elementContext> value_element() {
			return getRuleContexts(Value_elementContext.class);
		}
		public Value_elementContext value_element(int i) {
			return getRuleContext(Value_elementContext.class,i);
		}
		public Value_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterValue_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitValue_decl(this);
		}
	}

	public final Value_declContext value_decl() throws RecognitionException {
		Value_declContext _localctx = new Value_declContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_value_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			value_header();
			setState(492);
			match(LEFT_BRACE);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COLON) | (1L << AT) | (1L << KW_STRING) | (1L << KW_TYPEDEF) | (1L << KW_OCTET) | (1L << KW_STRUCT) | (1L << KW_NATIVE) | (1L << KW_READONLY) | (1L << KW_VOID) | (1L << KW_PRIVATE) | (1L << KW_WCHAR) | (1L << KW_PUBLIC) | (1L << KW_SHORT) | (1L << KW_LONG) | (1L << KW_ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_WSTRING - 64)) | (1L << (KW_FACTORY - 64)) | (1L << (KW_EXCEPTION - 64)) | (1L << (KW_CONST - 64)) | (1L << (KW_VALUEBASE - 64)) | (1L << (KW_OBJECT - 64)) | (1L << (KW_UNSIGNED - 64)) | (1L << (KW_UNION - 64)) | (1L << (KW_ONEWAY - 64)) | (1L << (KW_ANY - 64)) | (1L << (KW_CHAR - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_TYPEPREFIX - 64)) | (1L << (KW_TYPEID - 64)) | (1L << (KW_ATTRIBUTE - 64)) | (1L << (KW_BITSET - 64)) | (1L << (KW_BITMASK - 64)) | (1L << (KW_INT8 - 64)) | (1L << (KW_UINT8 - 64)) | (1L << (KW_INT16 - 64)) | (1L << (KW_UINT16 - 64)) | (1L << (KW_INT32 - 64)) | (1L << (KW_UINT32 - 64)) | (1L << (KW_INT64 - 64)) | (1L << (KW_UINT64 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(493);
				value_element();
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499);
			match(RIGHT_BRACE);
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

	public static class Value_headerContext extends ParserRuleContext {
		public TerminalNode KW_VALUETYPE() { return getToken(IDLParser.KW_VALUETYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Value_inheritance_specContext value_inheritance_spec() {
			return getRuleContext(Value_inheritance_specContext.class,0);
		}
		public TerminalNode KW_CUSTOM() { return getToken(IDLParser.KW_CUSTOM, 0); }
		public Value_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterValue_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitValue_header(this);
		}
	}

	public final Value_headerContext value_header() throws RecognitionException {
		Value_headerContext _localctx = new Value_headerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CUSTOM) {
				{
				setState(501);
				match(KW_CUSTOM);
				}
			}

			setState(504);
			match(KW_VALUETYPE);
			setState(505);
			identifier();
			setState(506);
			value_inheritance_spec();
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

	public static class Value_inheritance_specContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(IDLParser.COLON, 0); }
		public List<Value_nameContext> value_name() {
			return getRuleContexts(Value_nameContext.class);
		}
		public Value_nameContext value_name(int i) {
			return getRuleContext(Value_nameContext.class,i);
		}
		public TerminalNode KW_SUPPORTS() { return getToken(IDLParser.KW_SUPPORTS, 0); }
		public List<Interface_nameContext> interface_name() {
			return getRuleContexts(Interface_nameContext.class);
		}
		public Interface_nameContext interface_name(int i) {
			return getRuleContext(Interface_nameContext.class,i);
		}
		public TerminalNode KW_TRUNCATABLE() { return getToken(IDLParser.KW_TRUNCATABLE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Value_inheritance_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_inheritance_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterValue_inheritance_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitValue_inheritance_spec(this);
		}
	}

	public final Value_inheritance_specContext value_inheritance_spec() throws RecognitionException {
		Value_inheritance_specContext _localctx = new Value_inheritance_specContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value_inheritance_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(508);
				match(COLON);
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_TRUNCATABLE) {
					{
					setState(509);
					match(KW_TRUNCATABLE);
					}
				}

				setState(512);
				value_name();
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(513);
					match(COMMA);
					setState(514);
					value_name();
					}
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_SUPPORTS) {
				{
				setState(522);
				match(KW_SUPPORTS);
				setState(523);
				interface_name();
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(524);
					match(COMMA);
					setState(525);
					interface_name();
					}
					}
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Value_nameContext extends ParserRuleContext {
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public Value_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterValue_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitValue_name(this);
		}
	}

	public final Value_nameContext value_name() throws RecognitionException {
		Value_nameContext _localctx = new Value_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			a_scoped_name();
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

	public static class Value_elementContext extends ParserRuleContext {
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public State_memberContext state_member() {
			return getRuleContext(State_memberContext.class,0);
		}
		public Init_declContext init_decl() {
			return getRuleContext(Init_declContext.class,0);
		}
		public Value_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterValue_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitValue_element(this);
		}
	}

	public final Value_elementContext value_element() throws RecognitionException {
		Value_elementContext _localctx = new Value_elementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_value_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(535);
				export();
				}
				break;
			case 2:
				{
				setState(536);
				state_member();
				}
				break;
			case 3:
				{
				setState(537);
				init_decl();
				}
				break;
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

	public static class State_memberContext extends ParserRuleContext {
		public List<AnnappsContext> annapps() {
			return getRuleContexts(AnnappsContext.class);
		}
		public AnnappsContext annapps(int i) {
			return getRuleContext(AnnappsContext.class,i);
		}
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public DeclaratorsContext declarators() {
			return getRuleContext(DeclaratorsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public TerminalNode KW_PUBLIC() { return getToken(IDLParser.KW_PUBLIC, 0); }
		public TerminalNode KW_PRIVATE() { return getToken(IDLParser.KW_PRIVATE, 0); }
		public State_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterState_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitState_member(this);
		}
	}

	public final State_memberContext state_member() throws RecognitionException {
		State_memberContext _localctx = new State_memberContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_state_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			annapps();
			setState(545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PUBLIC:
				{
				setState(541);
				match(KW_PUBLIC);
				setState(542);
				annapps();
				}
				break;
			case KW_PRIVATE:
				{
				setState(543);
				match(KW_PRIVATE);
				setState(544);
				annapps();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(547);
			type_spec();
			setState(548);
			declarators();
			setState(549);
			match(SEMICOLON);
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

	public static class Init_declContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public TerminalNode KW_FACTORY() { return getToken(IDLParser.KW_FACTORY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public Init_param_declsContext init_param_decls() {
			return getRuleContext(Init_param_declsContext.class,0);
		}
		public Raises_exprContext raises_expr() {
			return getRuleContext(Raises_exprContext.class,0);
		}
		public Init_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterInit_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitInit_decl(this);
		}
	}

	public final Init_declContext init_decl() throws RecognitionException {
		Init_declContext _localctx = new Init_declContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_init_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			annapps();
			setState(552);
			match(KW_FACTORY);
			setState(553);
			identifier();
			setState(554);
			match(LEFT_BRACKET);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==KW_IN) {
				{
				setState(555);
				init_param_decls();
				}
			}

			setState(558);
			match(RIGHT_BRACKET);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_RAISES) {
				{
				setState(559);
				raises_expr();
				}
			}

			setState(562);
			match(SEMICOLON);
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

	public static class Init_param_declsContext extends ParserRuleContext {
		public List<Init_param_declContext> init_param_decl() {
			return getRuleContexts(Init_param_declContext.class);
		}
		public Init_param_declContext init_param_decl(int i) {
			return getRuleContext(Init_param_declContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Init_param_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_param_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterInit_param_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitInit_param_decls(this);
		}
	}

	public final Init_param_declsContext init_param_decls() throws RecognitionException {
		Init_param_declsContext _localctx = new Init_param_declsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_init_param_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			init_param_decl();
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(565);
				match(COMMA);
				setState(566);
				init_param_decl();
				}
				}
				setState(571);
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

	public static class Init_param_declContext extends ParserRuleContext {
		public List<AnnappsContext> annapps() {
			return getRuleContexts(AnnappsContext.class);
		}
		public AnnappsContext annapps(int i) {
			return getRuleContext(AnnappsContext.class,i);
		}
		public Init_param_attributeContext init_param_attribute() {
			return getRuleContext(Init_param_attributeContext.class,0);
		}
		public Param_type_specContext param_type_spec() {
			return getRuleContext(Param_type_specContext.class,0);
		}
		public Simple_declaratorContext simple_declarator() {
			return getRuleContext(Simple_declaratorContext.class,0);
		}
		public Init_param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_param_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterInit_param_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitInit_param_decl(this);
		}
	}

	public final Init_param_declContext init_param_decl() throws RecognitionException {
		Init_param_declContext _localctx = new Init_param_declContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_init_param_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			annapps();
			setState(573);
			init_param_attribute();
			setState(574);
			annapps();
			setState(575);
			param_type_spec();
			setState(576);
			annapps();
			setState(577);
			simple_declarator();
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

	public static class Init_param_attributeContext extends ParserRuleContext {
		public TerminalNode KW_IN() { return getToken(IDLParser.KW_IN, 0); }
		public Init_param_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_param_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterInit_param_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitInit_param_attribute(this);
		}
	}

	public final Init_param_attributeContext init_param_attribute() throws RecognitionException {
		Init_param_attributeContext _localctx = new Init_param_attributeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_init_param_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(KW_IN);
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

	public static class Const_declContext extends ParserRuleContext {
		public TerminalNode KW_CONST() { return getToken(IDLParser.KW_CONST, 0); }
		public Const_typeContext const_type() {
			return getRuleContext(Const_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(IDLParser.EQUAL, 0); }
		public Const_expContext const_exp() {
			return getRuleContext(Const_expContext.class,0);
		}
		public Const_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterConst_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitConst_decl(this);
		}
	}

	public final Const_declContext const_decl() throws RecognitionException {
		Const_declContext _localctx = new Const_declContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_const_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(KW_CONST);
			setState(582);
			const_type();
			setState(583);
			identifier();
			setState(584);
			match(EQUAL);
			setState(585);
			const_exp();
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

	public static class Const_typeContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public Char_typeContext char_type() {
			return getRuleContext(Char_typeContext.class,0);
		}
		public Wide_char_typeContext wide_char_type() {
			return getRuleContext(Wide_char_typeContext.class,0);
		}
		public Boolean_typeContext boolean_type() {
			return getRuleContext(Boolean_typeContext.class,0);
		}
		public Floating_pt_typeContext floating_pt_type() {
			return getRuleContext(Floating_pt_typeContext.class,0);
		}
		public String_typeContext string_type() {
			return getRuleContext(String_typeContext.class,0);
		}
		public Wide_string_typeContext wide_string_type() {
			return getRuleContext(Wide_string_typeContext.class,0);
		}
		public Fixed_pt_const_typeContext fixed_pt_const_type() {
			return getRuleContext(Fixed_pt_const_typeContext.class,0);
		}
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Octet_typeContext octet_type() {
			return getRuleContext(Octet_typeContext.class,0);
		}
		public Const_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterConst_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitConst_type(this);
		}
	}

	public final Const_typeContext const_type() throws RecognitionException {
		Const_typeContext _localctx = new Const_typeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_const_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			annapps();
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(588);
				integer_type();
				}
				break;
			case 2:
				{
				setState(589);
				char_type();
				}
				break;
			case 3:
				{
				setState(590);
				wide_char_type();
				}
				break;
			case 4:
				{
				setState(591);
				boolean_type();
				}
				break;
			case 5:
				{
				setState(592);
				floating_pt_type();
				}
				break;
			case 6:
				{
				setState(593);
				string_type();
				}
				break;
			case 7:
				{
				setState(594);
				wide_string_type();
				}
				break;
			case 8:
				{
				setState(595);
				fixed_pt_const_type();
				}
				break;
			case 9:
				{
				setState(596);
				scoped_name();
				}
				break;
			case 10:
				{
				setState(597);
				octet_type();
				}
				break;
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

	public static class Const_expContext extends ParserRuleContext {
		public Or_exprContext or_expr() {
			return getRuleContext(Or_exprContext.class,0);
		}
		public Const_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterConst_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitConst_exp(this);
		}
	}

	public final Const_expContext const_exp() throws RecognitionException {
		Const_expContext _localctx = new Const_expContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_const_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			or_expr();
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

	public static class Or_exprContext extends ParserRuleContext {
		public List<Xor_exprContext> xor_expr() {
			return getRuleContexts(Xor_exprContext.class);
		}
		public Xor_exprContext xor_expr(int i) {
			return getRuleContext(Xor_exprContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(IDLParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(IDLParser.PIPE, i);
		}
		public Or_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterOr_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitOr_expr(this);
		}
	}

	public final Or_exprContext or_expr() throws RecognitionException {
		Or_exprContext _localctx = new Or_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_or_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			xor_expr();
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(603);
				match(PIPE);
				setState(604);
				xor_expr();
				}
				}
				setState(609);
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

	public static class Xor_exprContext extends ParserRuleContext {
		public List<And_exprContext> and_expr() {
			return getRuleContexts(And_exprContext.class);
		}
		public And_exprContext and_expr(int i) {
			return getRuleContext(And_exprContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(IDLParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(IDLParser.CARET, i);
		}
		public Xor_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterXor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitXor_expr(this);
		}
	}

	public final Xor_exprContext xor_expr() throws RecognitionException {
		Xor_exprContext _localctx = new Xor_exprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_xor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			and_expr();
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(611);
				match(CARET);
				setState(612);
				and_expr();
				}
				}
				setState(617);
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

	public static class And_exprContext extends ParserRuleContext {
		public List<Shift_exprContext> shift_expr() {
			return getRuleContexts(Shift_exprContext.class);
		}
		public Shift_exprContext shift_expr(int i) {
			return getRuleContext(Shift_exprContext.class,i);
		}
		public List<TerminalNode> AMPERSAND() { return getTokens(IDLParser.AMPERSAND); }
		public TerminalNode AMPERSAND(int i) {
			return getToken(IDLParser.AMPERSAND, i);
		}
		public And_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterAnd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitAnd_expr(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			shift_expr();
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMPERSAND) {
				{
				{
				setState(619);
				match(AMPERSAND);
				setState(620);
				shift_expr();
				}
				}
				setState(625);
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

	public static class Shift_exprContext extends ParserRuleContext {
		public List<Add_exprContext> add_expr() {
			return getRuleContexts(Add_exprContext.class);
		}
		public Add_exprContext add_expr(int i) {
			return getRuleContext(Add_exprContext.class,i);
		}
		public List<TerminalNode> RIGHT_SHIFT() { return getTokens(IDLParser.RIGHT_SHIFT); }
		public TerminalNode RIGHT_SHIFT(int i) {
			return getToken(IDLParser.RIGHT_SHIFT, i);
		}
		public List<TerminalNode> LEFT_SHIFT() { return getTokens(IDLParser.LEFT_SHIFT); }
		public TerminalNode LEFT_SHIFT(int i) {
			return getToken(IDLParser.LEFT_SHIFT, i);
		}
		public Shift_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterShift_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitShift_expr(this);
		}
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_shift_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			add_expr();
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RIGHT_SHIFT || _la==LEFT_SHIFT) {
				{
				{
				setState(627);
				_la = _input.LA(1);
				if ( !(_la==RIGHT_SHIFT || _la==LEFT_SHIFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(628);
				add_expr();
				}
				}
				setState(633);
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

	public static class Add_exprContext extends ParserRuleContext {
		public List<Mult_exprContext> mult_expr() {
			return getRuleContexts(Mult_exprContext.class);
		}
		public Mult_exprContext mult_expr(int i) {
			return getRuleContext(Mult_exprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(IDLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(IDLParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(IDLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(IDLParser.MINUS, i);
		}
		public Add_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterAdd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitAdd_expr(this);
		}
	}

	public final Add_exprContext add_expr() throws RecognitionException {
		Add_exprContext _localctx = new Add_exprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_add_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			mult_expr();
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(635);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(636);
				mult_expr();
				}
				}
				setState(641);
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

	public static class Mult_exprContext extends ParserRuleContext {
		public List<Unary_exprContext> unary_expr() {
			return getRuleContexts(Unary_exprContext.class);
		}
		public Unary_exprContext unary_expr(int i) {
			return getRuleContext(Unary_exprContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(IDLParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(IDLParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(IDLParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(IDLParser.SLASH, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(IDLParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(IDLParser.PERCENT, i);
		}
		public Mult_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterMult_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitMult_expr(this);
		}
	}

	public final Mult_exprContext mult_expr() throws RecognitionException {
		Mult_exprContext _localctx = new Mult_exprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_mult_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			unary_expr();
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SLASH) | (1L << STAR) | (1L << PERCENT))) != 0)) {
				{
				{
				setState(643);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SLASH) | (1L << STAR) | (1L << PERCENT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(644);
				unary_expr();
				}
				}
				setState(649);
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

	public static class Unary_exprContext extends ParserRuleContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Primary_exprContext primary_expr() {
			return getRuleContext(Primary_exprContext.class,0);
		}
		public Unary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterUnary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitUnary_expr(this);
		}
	}

	public final Unary_exprContext unary_expr() throws RecognitionException {
		Unary_exprContext _localctx = new Unary_exprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_unary_expr);
		try {
			setState(654);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TILDE:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				unary_operator();
				setState(651);
				primary_expr();
				}
				break;
			case INTEGER_LITERAL:
			case OCTAL_LITERAL:
			case HEX_LITERAL:
			case FLOATING_PT_LITERAL:
			case FIXED_PT_LITERAL:
			case WIDE_CHARACTER_LITERAL:
			case CHARACTER_LITERAL:
			case WIDE_STRING_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case LEFT_BRACKET:
			case DOUBLE_COLON:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				primary_expr();
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(IDLParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(IDLParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(IDLParser.TILDE, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TILDE) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
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

	public static class Primary_exprContext extends ParserRuleContext {
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public Const_expContext const_exp() {
			return getRuleContext(Const_expContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public Primary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterPrimary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitPrimary_expr(this);
		}
	}

	public final Primary_exprContext primary_expr() throws RecognitionException {
		Primary_exprContext _localctx = new Primary_exprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_primary_expr);
		try {
			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_COLON:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				scoped_name();
				}
				break;
			case INTEGER_LITERAL:
			case OCTAL_LITERAL:
			case HEX_LITERAL:
			case FLOATING_PT_LITERAL:
			case FIXED_PT_LITERAL:
			case WIDE_CHARACTER_LITERAL:
			case CHARACTER_LITERAL:
			case WIDE_STRING_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				literal();
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(660);
				match(LEFT_BRACKET);
				setState(661);
				const_exp();
				setState(662);
				match(RIGHT_BRACKET);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode HEX_LITERAL() { return getToken(IDLParser.HEX_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(IDLParser.INTEGER_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(IDLParser.OCTAL_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(IDLParser.STRING_LITERAL, 0); }
		public TerminalNode WIDE_STRING_LITERAL() { return getToken(IDLParser.WIDE_STRING_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(IDLParser.CHARACTER_LITERAL, 0); }
		public TerminalNode WIDE_CHARACTER_LITERAL() { return getToken(IDLParser.WIDE_CHARACTER_LITERAL, 0); }
		public TerminalNode FIXED_PT_LITERAL() { return getToken(IDLParser.FIXED_PT_LITERAL, 0); }
		public TerminalNode FLOATING_PT_LITERAL() { return getToken(IDLParser.FLOATING_PT_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(IDLParser.BOOLEAN_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_LITERAL) | (1L << OCTAL_LITERAL) | (1L << HEX_LITERAL) | (1L << FLOATING_PT_LITERAL) | (1L << FIXED_PT_LITERAL) | (1L << WIDE_CHARACTER_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << WIDE_STRING_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL))) != 0)) ) {
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

	public static class Positive_int_constContext extends ParserRuleContext {
		public Const_expContext const_exp() {
			return getRuleContext(Const_expContext.class,0);
		}
		public Positive_int_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positive_int_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterPositive_int_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitPositive_int_const(this);
		}
	}

	public final Positive_int_constContext positive_int_const() throws RecognitionException {
		Positive_int_constContext _localctx = new Positive_int_constContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_positive_int_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			const_exp();
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

	public static class Type_declContext extends ParserRuleContext {
		public TerminalNode KW_TYPEDEF() { return getToken(IDLParser.KW_TYPEDEF, 0); }
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Type_declaratorContext type_declarator() {
			return getRuleContext(Type_declaratorContext.class,0);
		}
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public Union_typeContext union_type() {
			return getRuleContext(Union_typeContext.class,0);
		}
		public Enum_typeContext enum_type() {
			return getRuleContext(Enum_typeContext.class,0);
		}
		public Bitset_typeContext bitset_type() {
			return getRuleContext(Bitset_typeContext.class,0);
		}
		public Bitmask_typeContext bitmask_type() {
			return getRuleContext(Bitmask_typeContext.class,0);
		}
		public TerminalNode KW_NATIVE() { return getToken(IDLParser.KW_NATIVE, 0); }
		public Simple_declaratorContext simple_declarator() {
			return getRuleContext(Simple_declaratorContext.class,0);
		}
		public Constr_forward_declContext constr_forward_decl() {
			return getRuleContext(Constr_forward_declContext.class,0);
		}
		public Type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterType_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitType_decl(this);
		}
	}

	public final Type_declContext type_decl() throws RecognitionException {
		Type_declContext _localctx = new Type_declContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_type_decl);
		try {
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				match(KW_TYPEDEF);
				setState(671);
				annapps();
				setState(672);
				type_declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				struct_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(675);
				union_type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(676);
				enum_type();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(677);
				bitset_type();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(678);
				bitmask_type();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(679);
				match(KW_NATIVE);
				setState(680);
				annapps();
				setState(681);
				simple_declarator();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(683);
				constr_forward_decl();
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

	public static class Type_declaratorContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public DeclaratorsContext declarators() {
			return getRuleContext(DeclaratorsContext.class,0);
		}
		public Type_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterType_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitType_declarator(this);
		}
	}

	public final Type_declaratorContext type_declarator() throws RecognitionException {
		Type_declaratorContext _localctx = new Type_declaratorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_type_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			type_spec();
			setState(687);
			declarators();
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

	public static class Type_specContext extends ParserRuleContext {
		public Simple_type_specContext simple_type_spec() {
			return getRuleContext(Simple_type_specContext.class,0);
		}
		public Constr_type_specContext constr_type_spec() {
			return getRuleContext(Constr_type_specContext.class,0);
		}
		public Type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterType_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitType_spec(this);
		}
	}

	public final Type_specContext type_spec() throws RecognitionException {
		Type_specContext _localctx = new Type_specContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_type_spec);
		try {
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_COLON:
			case KW_STRING:
			case KW_OCTET:
			case KW_SEQUENCE:
			case KW_WCHAR:
			case KW_SHORT:
			case KW_LONG:
			case KW_WSTRING:
			case KW_VALUEBASE:
			case KW_OBJECT:
			case KW_UNSIGNED:
			case KW_FIXED:
			case KW_ANY:
			case KW_CHAR:
			case KW_FLOAT:
			case KW_BOOLEAN:
			case KW_DOUBLE:
			case KW_SET:
			case KW_MAP:
			case KW_INT8:
			case KW_UINT8:
			case KW_INT16:
			case KW_UINT16:
			case KW_INT32:
			case KW_UINT32:
			case KW_INT64:
			case KW_UINT64:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				simple_type_spec();
				}
				break;
			case KW_STRUCT:
			case KW_ENUM:
			case KW_UNION:
			case KW_BITSET:
			case KW_BITMASK:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				constr_type_spec();
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

	public static class Simple_type_specContext extends ParserRuleContext {
		public Base_type_specContext base_type_spec() {
			return getRuleContext(Base_type_specContext.class,0);
		}
		public Template_type_specContext template_type_spec() {
			return getRuleContext(Template_type_specContext.class,0);
		}
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Simple_type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterSimple_type_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitSimple_type_spec(this);
		}
	}

	public final Simple_type_specContext simple_type_spec() throws RecognitionException {
		Simple_type_specContext _localctx = new Simple_type_specContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_simple_type_spec);
		try {
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_OCTET:
			case KW_WCHAR:
			case KW_SHORT:
			case KW_LONG:
			case KW_VALUEBASE:
			case KW_OBJECT:
			case KW_UNSIGNED:
			case KW_ANY:
			case KW_CHAR:
			case KW_FLOAT:
			case KW_BOOLEAN:
			case KW_DOUBLE:
			case KW_INT8:
			case KW_UINT8:
			case KW_INT16:
			case KW_UINT16:
			case KW_INT32:
			case KW_UINT32:
			case KW_INT64:
			case KW_UINT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				base_type_spec();
				}
				break;
			case KW_STRING:
			case KW_SEQUENCE:
			case KW_WSTRING:
			case KW_FIXED:
			case KW_SET:
			case KW_MAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				template_type_spec();
				}
				break;
			case DOUBLE_COLON:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(695);
				scoped_name();
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

	public static class Bitfield_type_specContext extends ParserRuleContext {
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public Boolean_typeContext boolean_type() {
			return getRuleContext(Boolean_typeContext.class,0);
		}
		public Octet_typeContext octet_type() {
			return getRuleContext(Octet_typeContext.class,0);
		}
		public Bitfield_type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitfield_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterBitfield_type_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitBitfield_type_spec(this);
		}
	}

	public final Bitfield_type_specContext bitfield_type_spec() throws RecognitionException {
		Bitfield_type_specContext _localctx = new Bitfield_type_specContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_bitfield_type_spec);
		try {
			setState(701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_SHORT:
			case KW_LONG:
			case KW_UNSIGNED:
			case KW_INT8:
			case KW_UINT8:
			case KW_INT16:
			case KW_UINT16:
			case KW_INT32:
			case KW_UINT32:
			case KW_INT64:
			case KW_UINT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				integer_type();
				}
				break;
			case KW_BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				boolean_type();
				}
				break;
			case KW_OCTET:
				enterOuterAlt(_localctx, 3);
				{
				setState(700);
				octet_type();
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

	public static class Base_type_specContext extends ParserRuleContext {
		public Floating_pt_typeContext floating_pt_type() {
			return getRuleContext(Floating_pt_typeContext.class,0);
		}
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public Char_typeContext char_type() {
			return getRuleContext(Char_typeContext.class,0);
		}
		public Wide_char_typeContext wide_char_type() {
			return getRuleContext(Wide_char_typeContext.class,0);
		}
		public Boolean_typeContext boolean_type() {
			return getRuleContext(Boolean_typeContext.class,0);
		}
		public Octet_typeContext octet_type() {
			return getRuleContext(Octet_typeContext.class,0);
		}
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public Object_typeContext object_type() {
			return getRuleContext(Object_typeContext.class,0);
		}
		public Value_base_typeContext value_base_type() {
			return getRuleContext(Value_base_typeContext.class,0);
		}
		public Base_type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterBase_type_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitBase_type_spec(this);
		}
	}

	public final Base_type_specContext base_type_spec() throws RecognitionException {
		Base_type_specContext _localctx = new Base_type_specContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_base_type_spec);
		try {
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				floating_pt_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				integer_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(705);
				char_type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(706);
				wide_char_type();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(707);
				boolean_type();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(708);
				octet_type();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(709);
				any_type();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(710);
				object_type();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(711);
				value_base_type();
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

	public static class Template_type_specContext extends ParserRuleContext {
		public Sequence_typeContext sequence_type() {
			return getRuleContext(Sequence_typeContext.class,0);
		}
		public Set_typeContext set_type() {
			return getRuleContext(Set_typeContext.class,0);
		}
		public Map_typeContext map_type() {
			return getRuleContext(Map_typeContext.class,0);
		}
		public String_typeContext string_type() {
			return getRuleContext(String_typeContext.class,0);
		}
		public Wide_string_typeContext wide_string_type() {
			return getRuleContext(Wide_string_typeContext.class,0);
		}
		public Fixed_pt_typeContext fixed_pt_type() {
			return getRuleContext(Fixed_pt_typeContext.class,0);
		}
		public Template_type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterTemplate_type_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitTemplate_type_spec(this);
		}
	}

	public final Template_type_specContext template_type_spec() throws RecognitionException {
		Template_type_specContext _localctx = new Template_type_specContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_template_type_spec);
		try {
			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_SEQUENCE:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				sequence_type();
				}
				break;
			case KW_SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				set_type();
				}
				break;
			case KW_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(716);
				map_type();
				}
				break;
			case KW_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(717);
				string_type();
				}
				break;
			case KW_WSTRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(718);
				wide_string_type();
				}
				break;
			case KW_FIXED:
				enterOuterAlt(_localctx, 6);
				{
				setState(719);
				fixed_pt_type();
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

	public static class Constr_type_specContext extends ParserRuleContext {
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public Union_typeContext union_type() {
			return getRuleContext(Union_typeContext.class,0);
		}
		public Enum_typeContext enum_type() {
			return getRuleContext(Enum_typeContext.class,0);
		}
		public Bitset_typeContext bitset_type() {
			return getRuleContext(Bitset_typeContext.class,0);
		}
		public Bitmask_typeContext bitmask_type() {
			return getRuleContext(Bitmask_typeContext.class,0);
		}
		public Constr_type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterConstr_type_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitConstr_type_spec(this);
		}
	}

	public final Constr_type_specContext constr_type_spec() throws RecognitionException {
		Constr_type_specContext _localctx = new Constr_type_specContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_constr_type_spec);
		try {
			setState(727);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				struct_type();
				}
				break;
			case KW_UNION:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				union_type();
				}
				break;
			case KW_ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(724);
				enum_type();
				}
				break;
			case KW_BITSET:
				enterOuterAlt(_localctx, 4);
				{
				setState(725);
				bitset_type();
				}
				break;
			case KW_BITMASK:
				enterOuterAlt(_localctx, 5);
				{
				setState(726);
				bitmask_type();
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

	public static class Simple_declaratorsContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Simple_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterSimple_declarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitSimple_declarators(this);
		}
	}

	public final Simple_declaratorsContext simple_declarators() throws RecognitionException {
		Simple_declaratorsContext _localctx = new Simple_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_simple_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			identifier();
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(730);
				match(COMMA);
				setState(731);
				identifier();
				}
				}
				setState(736);
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

	public static class DeclaratorsContext extends ParserRuleContext {
		public List<DeclaratorContext> declarator() {
			return getRuleContexts(DeclaratorContext.class);
		}
		public DeclaratorContext declarator(int i) {
			return getRuleContext(DeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public DeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitDeclarators(this);
		}
	}

	public final DeclaratorsContext declarators() throws RecognitionException {
		DeclaratorsContext _localctx = new DeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			declarator();
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(738);
				match(COMMA);
				setState(739);
				declarator();
				}
				}
				setState(744);
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

	public static class DeclaratorContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Simple_declaratorContext simple_declarator() {
			return getRuleContext(Simple_declaratorContext.class,0);
		}
		public Complex_declaratorContext complex_declarator() {
			return getRuleContext(Complex_declaratorContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			annapps();
			setState(748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(746);
				simple_declarator();
				}
				break;
			case 2:
				{
				setState(747);
				complex_declarator();
				}
				break;
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

	public static class Simple_declaratorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public Simple_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterSimple_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitSimple_declarator(this);
		}
	}

	public final Simple_declaratorContext simple_declarator() throws RecognitionException {
		Simple_declaratorContext _localctx = new Simple_declaratorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_simple_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(ID);
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

	public static class Complex_declaratorContext extends ParserRuleContext {
		public Array_declaratorContext array_declarator() {
			return getRuleContext(Array_declaratorContext.class,0);
		}
		public Complex_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterComplex_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitComplex_declarator(this);
		}
	}

	public final Complex_declaratorContext complex_declarator() throws RecognitionException {
		Complex_declaratorContext _localctx = new Complex_declaratorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_complex_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			array_declarator();
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

	public static class Floating_pt_typeContext extends ParserRuleContext {
		public TerminalNode KW_FLOAT() { return getToken(IDLParser.KW_FLOAT, 0); }
		public TerminalNode KW_DOUBLE() { return getToken(IDLParser.KW_DOUBLE, 0); }
		public TerminalNode KW_LONG() { return getToken(IDLParser.KW_LONG, 0); }
		public Floating_pt_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_pt_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterFloating_pt_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitFloating_pt_type(this);
		}
	}

	public final Floating_pt_typeContext floating_pt_type() throws RecognitionException {
		Floating_pt_typeContext _localctx = new Floating_pt_typeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_floating_pt_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_FLOAT:
				{
				setState(754);
				match(KW_FLOAT);
				}
				break;
			case KW_DOUBLE:
				{
				setState(755);
				match(KW_DOUBLE);
				}
				break;
			case KW_LONG:
				{
				setState(756);
				match(KW_LONG);
				setState(757);
				match(KW_DOUBLE);
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

	public static class Integer_typeContext extends ParserRuleContext {
		public Signed_intContext signed_int() {
			return getRuleContext(Signed_intContext.class,0);
		}
		public Unsigned_intContext unsigned_int() {
			return getRuleContext(Unsigned_intContext.class,0);
		}
		public Integer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterInteger_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitInteger_type(this);
		}
	}

	public final Integer_typeContext integer_type() throws RecognitionException {
		Integer_typeContext _localctx = new Integer_typeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_integer_type);
		try {
			setState(762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_SHORT:
			case KW_LONG:
			case KW_INT8:
			case KW_INT16:
			case KW_INT32:
			case KW_INT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				signed_int();
				}
				break;
			case KW_UNSIGNED:
			case KW_UINT8:
			case KW_UINT16:
			case KW_UINT32:
			case KW_UINT64:
				enterOuterAlt(_localctx, 2);
				{
				setState(761);
				unsigned_int();
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

	public static class Signed_intContext extends ParserRuleContext {
		public Signed_short_intContext signed_short_int() {
			return getRuleContext(Signed_short_intContext.class,0);
		}
		public Signed_long_intContext signed_long_int() {
			return getRuleContext(Signed_long_intContext.class,0);
		}
		public Signed_longlong_intContext signed_longlong_int() {
			return getRuleContext(Signed_longlong_intContext.class,0);
		}
		public Signed_tiny_intContext signed_tiny_int() {
			return getRuleContext(Signed_tiny_intContext.class,0);
		}
		public Signed_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterSigned_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitSigned_int(this);
		}
	}

	public final Signed_intContext signed_int() throws RecognitionException {
		Signed_intContext _localctx = new Signed_intContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_signed_int);
		try {
			setState(768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				signed_short_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				signed_long_int();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(766);
				signed_longlong_int();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(767);
				signed_tiny_int();
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

	public static class Signed_tiny_intContext extends ParserRuleContext {
		public TerminalNode KW_INT8() { return getToken(IDLParser.KW_INT8, 0); }
		public Signed_tiny_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_tiny_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterSigned_tiny_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitSigned_tiny_int(this);
		}
	}

	public final Signed_tiny_intContext signed_tiny_int() throws RecognitionException {
		Signed_tiny_intContext _localctx = new Signed_tiny_intContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_signed_tiny_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(KW_INT8);
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

	public static class Signed_short_intContext extends ParserRuleContext {
		public TerminalNode KW_SHORT() { return getToken(IDLParser.KW_SHORT, 0); }
		public TerminalNode KW_INT16() { return getToken(IDLParser.KW_INT16, 0); }
		public Signed_short_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_short_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterSigned_short_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitSigned_short_int(this);
		}
	}

	public final Signed_short_intContext signed_short_int() throws RecognitionException {
		Signed_short_intContext _localctx = new Signed_short_intContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_signed_short_int);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			_la = _input.LA(1);
			if ( !(_la==KW_SHORT || _la==KW_INT16) ) {
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

	public static class Signed_long_intContext extends ParserRuleContext {
		public TerminalNode KW_LONG() { return getToken(IDLParser.KW_LONG, 0); }
		public TerminalNode KW_INT32() { return getToken(IDLParser.KW_INT32, 0); }
		public Signed_long_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_long_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterSigned_long_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitSigned_long_int(this);
		}
	}

	public final Signed_long_intContext signed_long_int() throws RecognitionException {
		Signed_long_intContext _localctx = new Signed_long_intContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_signed_long_int);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			_la = _input.LA(1);
			if ( !(_la==KW_LONG || _la==KW_INT32) ) {
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

	public static class Signed_longlong_intContext extends ParserRuleContext {
		public List<TerminalNode> KW_LONG() { return getTokens(IDLParser.KW_LONG); }
		public TerminalNode KW_LONG(int i) {
			return getToken(IDLParser.KW_LONG, i);
		}
		public TerminalNode KW_INT64() { return getToken(IDLParser.KW_INT64, 0); }
		public Signed_longlong_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_longlong_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterSigned_longlong_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitSigned_longlong_int(this);
		}
	}

	public final Signed_longlong_intContext signed_longlong_int() throws RecognitionException {
		Signed_longlong_intContext _localctx = new Signed_longlong_intContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_signed_longlong_int);
		try {
			setState(779);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_LONG:
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				match(KW_LONG);
				setState(777);
				match(KW_LONG);
				}
				break;
			case KW_INT64:
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
				match(KW_INT64);
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

	public static class Unsigned_intContext extends ParserRuleContext {
		public Unsigned_short_intContext unsigned_short_int() {
			return getRuleContext(Unsigned_short_intContext.class,0);
		}
		public Unsigned_long_intContext unsigned_long_int() {
			return getRuleContext(Unsigned_long_intContext.class,0);
		}
		public Unsigned_longlong_intContext unsigned_longlong_int() {
			return getRuleContext(Unsigned_longlong_intContext.class,0);
		}
		public Unsigned_tiny_intContext unsigned_tiny_int() {
			return getRuleContext(Unsigned_tiny_intContext.class,0);
		}
		public Unsigned_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterUnsigned_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitUnsigned_int(this);
		}
	}

	public final Unsigned_intContext unsigned_int() throws RecognitionException {
		Unsigned_intContext _localctx = new Unsigned_intContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unsigned_int);
		try {
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				unsigned_short_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				unsigned_long_int();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(783);
				unsigned_longlong_int();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(784);
				unsigned_tiny_int();
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

	public static class Unsigned_tiny_intContext extends ParserRuleContext {
		public TerminalNode KW_UINT8() { return getToken(IDLParser.KW_UINT8, 0); }
		public Unsigned_tiny_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_tiny_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterUnsigned_tiny_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitUnsigned_tiny_int(this);
		}
	}

	public final Unsigned_tiny_intContext unsigned_tiny_int() throws RecognitionException {
		Unsigned_tiny_intContext _localctx = new Unsigned_tiny_intContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unsigned_tiny_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(KW_UINT8);
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

	public static class Unsigned_short_intContext extends ParserRuleContext {
		public TerminalNode KW_UNSIGNED() { return getToken(IDLParser.KW_UNSIGNED, 0); }
		public TerminalNode KW_SHORT() { return getToken(IDLParser.KW_SHORT, 0); }
		public TerminalNode KW_UINT16() { return getToken(IDLParser.KW_UINT16, 0); }
		public Unsigned_short_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_short_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterUnsigned_short_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitUnsigned_short_int(this);
		}
	}

	public final Unsigned_short_intContext unsigned_short_int() throws RecognitionException {
		Unsigned_short_intContext _localctx = new Unsigned_short_intContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unsigned_short_int);
		try {
			setState(792);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_UNSIGNED:
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				match(KW_UNSIGNED);
				setState(790);
				match(KW_SHORT);
				}
				break;
			case KW_UINT16:
				enterOuterAlt(_localctx, 2);
				{
				setState(791);
				match(KW_UINT16);
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

	public static class Unsigned_long_intContext extends ParserRuleContext {
		public TerminalNode KW_UNSIGNED() { return getToken(IDLParser.KW_UNSIGNED, 0); }
		public TerminalNode KW_LONG() { return getToken(IDLParser.KW_LONG, 0); }
		public TerminalNode KW_UINT32() { return getToken(IDLParser.KW_UINT32, 0); }
		public Unsigned_long_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_long_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterUnsigned_long_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitUnsigned_long_int(this);
		}
	}

	public final Unsigned_long_intContext unsigned_long_int() throws RecognitionException {
		Unsigned_long_intContext _localctx = new Unsigned_long_intContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unsigned_long_int);
		try {
			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_UNSIGNED:
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				match(KW_UNSIGNED);
				setState(795);
				match(KW_LONG);
				}
				break;
			case KW_UINT32:
				enterOuterAlt(_localctx, 2);
				{
				setState(796);
				match(KW_UINT32);
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

	public static class Unsigned_longlong_intContext extends ParserRuleContext {
		public TerminalNode KW_UNSIGNED() { return getToken(IDLParser.KW_UNSIGNED, 0); }
		public List<TerminalNode> KW_LONG() { return getTokens(IDLParser.KW_LONG); }
		public TerminalNode KW_LONG(int i) {
			return getToken(IDLParser.KW_LONG, i);
		}
		public TerminalNode KW_UINT64() { return getToken(IDLParser.KW_UINT64, 0); }
		public Unsigned_longlong_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_longlong_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterUnsigned_longlong_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitUnsigned_longlong_int(this);
		}
	}

	public final Unsigned_longlong_intContext unsigned_longlong_int() throws RecognitionException {
		Unsigned_longlong_intContext _localctx = new Unsigned_longlong_intContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unsigned_longlong_int);
		try {
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_UNSIGNED:
				enterOuterAlt(_localctx, 1);
				{
				setState(799);
				match(KW_UNSIGNED);
				setState(800);
				match(KW_LONG);
				setState(801);
				match(KW_LONG);
				}
				break;
			case KW_UINT64:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				match(KW_UINT64);
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

	public static class Char_typeContext extends ParserRuleContext {
		public TerminalNode KW_CHAR() { return getToken(IDLParser.KW_CHAR, 0); }
		public Char_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterChar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitChar_type(this);
		}
	}

	public final Char_typeContext char_type() throws RecognitionException {
		Char_typeContext _localctx = new Char_typeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_char_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(KW_CHAR);
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

	public static class Wide_char_typeContext extends ParserRuleContext {
		public TerminalNode KW_WCHAR() { return getToken(IDLParser.KW_WCHAR, 0); }
		public Wide_char_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wide_char_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterWide_char_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitWide_char_type(this);
		}
	}

	public final Wide_char_typeContext wide_char_type() throws RecognitionException {
		Wide_char_typeContext _localctx = new Wide_char_typeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_wide_char_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(KW_WCHAR);
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

	public static class Boolean_typeContext extends ParserRuleContext {
		public TerminalNode KW_BOOLEAN() { return getToken(IDLParser.KW_BOOLEAN, 0); }
		public Boolean_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterBoolean_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitBoolean_type(this);
		}
	}

	public final Boolean_typeContext boolean_type() throws RecognitionException {
		Boolean_typeContext _localctx = new Boolean_typeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_boolean_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(KW_BOOLEAN);
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

	public static class Octet_typeContext extends ParserRuleContext {
		public TerminalNode KW_OCTET() { return getToken(IDLParser.KW_OCTET, 0); }
		public Octet_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octet_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterOctet_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitOctet_type(this);
		}
	}

	public final Octet_typeContext octet_type() throws RecognitionException {
		Octet_typeContext _localctx = new Octet_typeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_octet_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(KW_OCTET);
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

	public static class Any_typeContext extends ParserRuleContext {
		public TerminalNode KW_ANY() { return getToken(IDLParser.KW_ANY, 0); }
		public Any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterAny_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitAny_type(this);
		}
	}

	public final Any_typeContext any_type() throws RecognitionException {
		Any_typeContext _localctx = new Any_typeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_any_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(KW_ANY);
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

	public static class Object_typeContext extends ParserRuleContext {
		public TerminalNode KW_OBJECT() { return getToken(IDLParser.KW_OBJECT, 0); }
		public Object_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterObject_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitObject_type(this);
		}
	}

	public final Object_typeContext object_type() throws RecognitionException {
		Object_typeContext _localctx = new Object_typeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_object_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(KW_OBJECT);
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

	public static class Annotation_declContext extends ParserRuleContext {
		public Annotation_defContext annotation_def() {
			return getRuleContext(Annotation_defContext.class,0);
		}
		public Annotation_forward_dclContext annotation_forward_dcl() {
			return getRuleContext(Annotation_forward_dclContext.class,0);
		}
		public Annotation_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterAnnotation_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitAnnotation_decl(this);
		}
	}

	public final Annotation_declContext annotation_decl() throws RecognitionException {
		Annotation_declContext _localctx = new Annotation_declContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_annotation_decl);
		try {
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(817);
				annotation_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(818);
				annotation_forward_dcl();
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

	public static class Annotation_defContext extends ParserRuleContext {
		public Annotation_headerContext annotation_header() {
			return getRuleContext(Annotation_headerContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public Annotation_bodyContext annotation_body() {
			return getRuleContext(Annotation_bodyContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public Annotation_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterAnnotation_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitAnnotation_def(this);
		}
	}

	public final Annotation_defContext annotation_def() throws RecognitionException {
		Annotation_defContext _localctx = new Annotation_defContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_annotation_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			annotation_header();
			setState(822);
			match(LEFT_BRACE);
			setState(823);
			annotation_body();
			setState(824);
			match(RIGHT_BRACE);
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

	public static class Annotation_headerContext extends ParserRuleContext {
		public TerminalNode KW_AT_ANNOTATION() { return getToken(IDLParser.KW_AT_ANNOTATION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Annotation_inheritance_specContext annotation_inheritance_spec() {
			return getRuleContext(Annotation_inheritance_specContext.class,0);
		}
		public Annotation_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterAnnotation_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitAnnotation_header(this);
		}
	}

	public final Annotation_headerContext annotation_header() throws RecognitionException {
		Annotation_headerContext _localctx = new Annotation_headerContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_annotation_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(KW_AT_ANNOTATION);
			setState(827);
			identifier();
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(828);
				annotation_inheritance_spec();
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

	public static class Annotation_inheritance_specContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(IDLParser.COLON, 0); }
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Annotation_inheritance_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_inheritance_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterAnnotation_inheritance_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitAnnotation_inheritance_spec(this);
		}
	}

	public final Annotation_inheritance_specContext annotation_inheritance_spec() throws RecognitionException {
		Annotation_inheritance_specContext _localctx = new Annotation_inheritance_specContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_annotation_inheritance_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(COLON);
			setState(832);
			scoped_name();
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

	public static class Annotation_bodyContext extends ParserRuleContext {
		public List<Annotation_memberContext> annotation_member() {
			return getRuleContexts(Annotation_memberContext.class);
		}
		public Annotation_memberContext annotation_member(int i) {
			return getRuleContext(Annotation_memberContext.class,i);
		}
		public List<Enum_typeContext> enum_type() {
			return getRuleContexts(Enum_typeContext.class);
		}
		public Enum_typeContext enum_type(int i) {
			return getRuleContext(Enum_typeContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(IDLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(IDLParser.SEMICOLON, i);
		}
		public List<Const_declContext> const_decl() {
			return getRuleContexts(Const_declContext.class);
		}
		public Const_declContext const_decl(int i) {
			return getRuleContext(Const_declContext.class,i);
		}
		public List<TerminalNode> KW_TYPEDEF() { return getTokens(IDLParser.KW_TYPEDEF); }
		public TerminalNode KW_TYPEDEF(int i) {
			return getToken(IDLParser.KW_TYPEDEF, i);
		}
		public List<Type_declaratorContext> type_declarator() {
			return getRuleContexts(Type_declaratorContext.class);
		}
		public Type_declaratorContext type_declarator(int i) {
			return getRuleContext(Type_declaratorContext.class,i);
		}
		public Annotation_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterAnnotation_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitAnnotation_body(this);
		}
	}

	public final Annotation_bodyContext annotation_body() throws RecognitionException {
		Annotation_bodyContext _localctx = new Annotation_bodyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_annotation_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COLON) | (1L << AT) | (1L << KW_STRING) | (1L << KW_TYPEDEF) | (1L << KW_OCTET) | (1L << KW_WCHAR) | (1L << KW_SHORT) | (1L << KW_LONG) | (1L << KW_ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_WSTRING - 64)) | (1L << (KW_CONST - 64)) | (1L << (KW_UNSIGNED - 64)) | (1L << (KW_FIXED - 64)) | (1L << (KW_CHAR - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_INT8 - 64)) | (1L << (KW_UINT8 - 64)) | (1L << (KW_INT16 - 64)) | (1L << (KW_UINT16 - 64)) | (1L << (KW_INT32 - 64)) | (1L << (KW_UINT32 - 64)) | (1L << (KW_INT64 - 64)) | (1L << (KW_UINT64 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				setState(845);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOUBLE_COLON:
				case AT:
				case KW_STRING:
				case KW_OCTET:
				case KW_WCHAR:
				case KW_SHORT:
				case KW_LONG:
				case KW_WSTRING:
				case KW_UNSIGNED:
				case KW_FIXED:
				case KW_CHAR:
				case KW_FLOAT:
				case KW_BOOLEAN:
				case KW_DOUBLE:
				case KW_INT8:
				case KW_UINT8:
				case KW_INT16:
				case KW_UINT16:
				case KW_INT32:
				case KW_UINT32:
				case KW_INT64:
				case KW_UINT64:
				case ID:
					{
					setState(834);
					annotation_member();
					}
					break;
				case KW_ENUM:
					{
					setState(835);
					enum_type();
					setState(836);
					match(SEMICOLON);
					}
					break;
				case KW_CONST:
					{
					setState(838);
					const_decl();
					setState(839);
					match(SEMICOLON);
					}
					break;
				case KW_TYPEDEF:
					{
					setState(841);
					match(KW_TYPEDEF);
					setState(842);
					type_declarator();
					setState(843);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(849);
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

	public static class Annotation_memberContext extends ParserRuleContext {
		public Const_typeContext const_type() {
			return getRuleContext(Const_typeContext.class,0);
		}
		public Simple_declaratorContext simple_declarator() {
			return getRuleContext(Simple_declaratorContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(IDLParser.KW_DEFAULT, 0); }
		public Const_expContext const_exp() {
			return getRuleContext(Const_expContext.class,0);
		}
		public Annotation_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterAnnotation_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitAnnotation_member(this);
		}
	}

	public final Annotation_memberContext annotation_member() throws RecognitionException {
		Annotation_memberContext _localctx = new Annotation_memberContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_annotation_member);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			const_type();
			setState(851);
			simple_declarator();
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DEFAULT) {
				{
				setState(852);
				match(KW_DEFAULT);
				setState(853);
				const_exp();
				}
			}

			setState(856);
			match(SEMICOLON);
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

	public static class Annotation_forward_dclContext extends ParserRuleContext {
		public TerminalNode KW_AT_ANNOTATION() { return getToken(IDLParser.KW_AT_ANNOTATION, 0); }
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Annotation_forward_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_forward_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterAnnotation_forward_dcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitAnnotation_forward_dcl(this);
		}
	}

	public final Annotation_forward_dclContext annotation_forward_dcl() throws RecognitionException {
		Annotation_forward_dclContext _localctx = new Annotation_forward_dclContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_annotation_forward_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(KW_AT_ANNOTATION);
			setState(859);
			scoped_name();
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

	public static class Bitset_typeContext extends ParserRuleContext {
		public TerminalNode KW_BITSET() { return getToken(IDLParser.KW_BITSET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public BitfieldContext bitfield() {
			return getRuleContext(BitfieldContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public TerminalNode COLON() { return getToken(IDLParser.COLON, 0); }
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Bitset_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitset_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterBitset_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitBitset_type(this);
		}
	}

	public final Bitset_typeContext bitset_type() throws RecognitionException {
		Bitset_typeContext _localctx = new Bitset_typeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_bitset_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(KW_BITSET);
			setState(862);
			identifier();
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(863);
				match(COLON);
				setState(864);
				scoped_name();
				}
			}

			setState(867);
			match(LEFT_BRACE);
			setState(868);
			bitfield();
			setState(869);
			match(RIGHT_BRACE);
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

	public static class BitfieldContext extends ParserRuleContext {
		public List<Bitfield_specContext> bitfield_spec() {
			return getRuleContexts(Bitfield_specContext.class);
		}
		public Bitfield_specContext bitfield_spec(int i) {
			return getRuleContext(Bitfield_specContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(IDLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(IDLParser.SEMICOLON, i);
		}
		public List<Simple_declaratorsContext> simple_declarators() {
			return getRuleContexts(Simple_declaratorsContext.class);
		}
		public Simple_declaratorsContext simple_declarators(int i) {
			return getRuleContext(Simple_declaratorsContext.class,i);
		}
		public BitfieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitfield; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterBitfield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitBitfield(this);
		}
	}

	public final BitfieldContext bitfield() throws RecognitionException {
		BitfieldContext _localctx = new BitfieldContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_bitfield);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(871);
				bitfield_spec();
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==ID) {
					{
					setState(872);
					simple_declarators();
					}
				}

				setState(875);
				match(SEMICOLON);
				}
				}
				setState(879); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AT || _la==KW_BITFIELD );
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

	public static class Bitfield_specContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public TerminalNode KW_BITFIELD() { return getToken(IDLParser.KW_BITFIELD, 0); }
		public TerminalNode LEFT_ANG_BRACKET() { return getToken(IDLParser.LEFT_ANG_BRACKET, 0); }
		public Positive_int_constContext positive_int_const() {
			return getRuleContext(Positive_int_constContext.class,0);
		}
		public TerminalNode RIGHT_ANG_BRACKET() { return getToken(IDLParser.RIGHT_ANG_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(IDLParser.COMMA, 0); }
		public Bitfield_type_specContext bitfield_type_spec() {
			return getRuleContext(Bitfield_type_specContext.class,0);
		}
		public Bitfield_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitfield_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterBitfield_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitBitfield_spec(this);
		}
	}

	public final Bitfield_specContext bitfield_spec() throws RecognitionException {
		Bitfield_specContext _localctx = new Bitfield_specContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_bitfield_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			annapps();
			setState(882);
			match(KW_BITFIELD);
			setState(883);
			match(LEFT_ANG_BRACKET);
			setState(884);
			positive_int_const();
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(885);
				match(COMMA);
				setState(886);
				bitfield_type_spec();
				}
			}

			setState(889);
			match(RIGHT_ANG_BRACKET);
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

	public static class Bitmask_typeContext extends ParserRuleContext {
		public TerminalNode KW_BITMASK() { return getToken(IDLParser.KW_BITMASK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public Bit_valuesContext bit_values() {
			return getRuleContext(Bit_valuesContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public Bitmask_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitmask_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterBitmask_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitBitmask_type(this);
		}
	}

	public final Bitmask_typeContext bitmask_type() throws RecognitionException {
		Bitmask_typeContext _localctx = new Bitmask_typeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_bitmask_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(KW_BITMASK);
			setState(892);
			identifier();
			setState(893);
			match(LEFT_BRACE);
			setState(894);
			bit_values();
			setState(895);
			match(RIGHT_BRACE);
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

	public static class Bit_valuesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Bit_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterBit_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitBit_values(this);
		}
	}

	public final Bit_valuesContext bit_values() throws RecognitionException {
		Bit_valuesContext _localctx = new Bit_valuesContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_bit_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			identifier();
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(898);
				match(COMMA);
				setState(899);
				identifier();
				}
				}
				setState(904);
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

	public static class Struct_typeContext extends ParserRuleContext {
		public TerminalNode KW_STRUCT() { return getToken(IDLParser.KW_STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public Member_listContext member_list() {
			return getRuleContext(Member_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public TerminalNode COLON() { return getToken(IDLParser.COLON, 0); }
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Struct_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterStruct_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitStruct_type(this);
		}
	}

	public final Struct_typeContext struct_type() throws RecognitionException {
		Struct_typeContext _localctx = new Struct_typeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_struct_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			match(KW_STRUCT);
			setState(906);
			identifier();
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(907);
				match(COLON);
				setState(908);
				scoped_name();
				}
			}

			setState(911);
			match(LEFT_BRACE);
			setState(912);
			member_list();
			setState(913);
			match(RIGHT_BRACE);
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

	public static class Member_listContext extends ParserRuleContext {
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public Member_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterMember_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitMember_list(this);
		}
	}

	public final Member_listContext member_list() throws RecognitionException {
		Member_listContext _localctx = new Member_listContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_member_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COLON) | (1L << AT) | (1L << KW_STRING) | (1L << KW_OCTET) | (1L << KW_SEQUENCE) | (1L << KW_STRUCT) | (1L << KW_WCHAR) | (1L << KW_SHORT) | (1L << KW_LONG) | (1L << KW_ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_WSTRING - 64)) | (1L << (KW_VALUEBASE - 64)) | (1L << (KW_OBJECT - 64)) | (1L << (KW_UNSIGNED - 64)) | (1L << (KW_FIXED - 64)) | (1L << (KW_UNION - 64)) | (1L << (KW_ANY - 64)) | (1L << (KW_CHAR - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_SET - 64)) | (1L << (KW_MAP - 64)) | (1L << (KW_BITSET - 64)) | (1L << (KW_BITMASK - 64)) | (1L << (KW_INT8 - 64)) | (1L << (KW_UINT8 - 64)) | (1L << (KW_INT16 - 64)) | (1L << (KW_UINT16 - 64)) | (1L << (KW_INT32 - 64)) | (1L << (KW_UINT32 - 64)) | (1L << (KW_INT64 - 64)) | (1L << (KW_UINT64 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(915);
				member();
				}
				}
				setState(920);
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

	public static class MemberContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public DeclaratorsContext declarators() {
			return getRuleContext(DeclaratorsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitMember(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			annapps();
			setState(922);
			type_spec();
			setState(923);
			declarators();
			setState(924);
			match(SEMICOLON);
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

	public static class Union_typeContext extends ParserRuleContext {
		public TerminalNode KW_UNION() { return getToken(IDLParser.KW_UNION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_SWITCH() { return getToken(IDLParser.KW_SWITCH, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Switch_type_specContext switch_type_spec() {
			return getRuleContext(Switch_type_specContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public Switch_bodyContext switch_body() {
			return getRuleContext(Switch_bodyContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public Union_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterUnion_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitUnion_type(this);
		}
	}

	public final Union_typeContext union_type() throws RecognitionException {
		Union_typeContext _localctx = new Union_typeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_union_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(KW_UNION);
			setState(927);
			identifier();
			setState(928);
			match(KW_SWITCH);
			setState(929);
			match(LEFT_BRACKET);
			setState(930);
			annapps();
			setState(931);
			switch_type_spec();
			setState(932);
			match(RIGHT_BRACKET);
			setState(933);
			match(LEFT_BRACE);
			setState(934);
			switch_body();
			setState(935);
			match(RIGHT_BRACE);
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

	public static class Switch_type_specContext extends ParserRuleContext {
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public Char_typeContext char_type() {
			return getRuleContext(Char_typeContext.class,0);
		}
		public Wide_char_typeContext wide_char_type() {
			return getRuleContext(Wide_char_typeContext.class,0);
		}
		public Octet_typeContext octet_type() {
			return getRuleContext(Octet_typeContext.class,0);
		}
		public Boolean_typeContext boolean_type() {
			return getRuleContext(Boolean_typeContext.class,0);
		}
		public Enum_typeContext enum_type() {
			return getRuleContext(Enum_typeContext.class,0);
		}
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Switch_type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterSwitch_type_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitSwitch_type_spec(this);
		}
	}

	public final Switch_type_specContext switch_type_spec() throws RecognitionException {
		Switch_type_specContext _localctx = new Switch_type_specContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_switch_type_spec);
		try {
			setState(944);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_SHORT:
			case KW_LONG:
			case KW_UNSIGNED:
			case KW_INT8:
			case KW_UINT8:
			case KW_INT16:
			case KW_UINT16:
			case KW_INT32:
			case KW_UINT32:
			case KW_INT64:
			case KW_UINT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(937);
				integer_type();
				}
				break;
			case KW_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(938);
				char_type();
				}
				break;
			case KW_WCHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(939);
				wide_char_type();
				}
				break;
			case KW_OCTET:
				enterOuterAlt(_localctx, 4);
				{
				setState(940);
				octet_type();
				}
				break;
			case KW_BOOLEAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(941);
				boolean_type();
				}
				break;
			case KW_ENUM:
				enterOuterAlt(_localctx, 6);
				{
				setState(942);
				enum_type();
				}
				break;
			case DOUBLE_COLON:
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(943);
				scoped_name();
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

	public static class Switch_bodyContext extends ParserRuleContext {
		public List<Case_stmtContext> case_stmt() {
			return getRuleContexts(Case_stmtContext.class);
		}
		public Case_stmtContext case_stmt(int i) {
			return getRuleContext(Case_stmtContext.class,i);
		}
		public Switch_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterSwitch_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitSwitch_body(this);
		}
	}

	public final Switch_bodyContext switch_body() throws RecognitionException {
		Switch_bodyContext _localctx = new Switch_bodyContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_switch_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(946);
				case_stmt();
				}
				}
				setState(949); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (AT - 35)) | (1L << (KW_DEFAULT - 35)) | (1L << (KW_CASE - 35)))) != 0) );
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

	public static class Case_stmtContext extends ParserRuleContext {
		public Element_specContext element_spec() {
			return getRuleContext(Element_specContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public List<Case_labelContext> case_label() {
			return getRuleContexts(Case_labelContext.class);
		}
		public Case_labelContext case_label(int i) {
			return getRuleContext(Case_labelContext.class,i);
		}
		public Case_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterCase_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitCase_stmt(this);
		}
	}

	public final Case_stmtContext case_stmt() throws RecognitionException {
		Case_stmtContext _localctx = new Case_stmtContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_case_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(952); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(951);
					case_label();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(954); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(956);
			element_spec();
			setState(957);
			match(SEMICOLON);
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

	public static class Case_labelContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public TerminalNode KW_CASE() { return getToken(IDLParser.KW_CASE, 0); }
		public Const_expContext const_exp() {
			return getRuleContext(Const_expContext.class,0);
		}
		public TerminalNode COLON() { return getToken(IDLParser.COLON, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(IDLParser.KW_DEFAULT, 0); }
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterCase_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitCase_label(this);
		}
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_case_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			annapps();
			setState(966);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CASE:
				{
				setState(960);
				match(KW_CASE);
				setState(961);
				const_exp();
				setState(962);
				match(COLON);
				}
				break;
			case KW_DEFAULT:
				{
				setState(964);
				match(KW_DEFAULT);
				setState(965);
				match(COLON);
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

	public static class Element_specContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Element_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterElement_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitElement_spec(this);
		}
	}

	public final Element_specContext element_spec() throws RecognitionException {
		Element_specContext _localctx = new Element_specContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_element_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			annapps();
			setState(969);
			type_spec();
			setState(970);
			declarator();
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

	public static class Enum_typeContext extends ParserRuleContext {
		public TerminalNode KW_ENUM() { return getToken(IDLParser.KW_ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Enum_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterEnum_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitEnum_type(this);
		}
	}

	public final Enum_typeContext enum_type() throws RecognitionException {
		Enum_typeContext _localctx = new Enum_typeContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_enum_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(KW_ENUM);
			setState(973);
			identifier();
			setState(974);
			match(LEFT_BRACE);
			setState(975);
			enumerator();
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(976);
				match(COMMA);
				setState(977);
				enumerator();
				}
				}
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(983);
			match(RIGHT_BRACE);
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

	public static class EnumeratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			identifier();
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

	public static class Sequence_typeContext extends ParserRuleContext {
		public TerminalNode KW_SEQUENCE() { return getToken(IDLParser.KW_SEQUENCE, 0); }
		public TerminalNode LEFT_ANG_BRACKET() { return getToken(IDLParser.LEFT_ANG_BRACKET, 0); }
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Simple_type_specContext simple_type_spec() {
			return getRuleContext(Simple_type_specContext.class,0);
		}
		public TerminalNode RIGHT_ANG_BRACKET() { return getToken(IDLParser.RIGHT_ANG_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(IDLParser.COMMA, 0); }
		public Positive_int_constContext positive_int_const() {
			return getRuleContext(Positive_int_constContext.class,0);
		}
		public Sequence_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterSequence_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitSequence_type(this);
		}
	}

	public final Sequence_typeContext sequence_type() throws RecognitionException {
		Sequence_typeContext _localctx = new Sequence_typeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_sequence_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			match(KW_SEQUENCE);
			setState(988);
			match(LEFT_ANG_BRACKET);
			setState(989);
			annapps();
			setState(990);
			simple_type_spec();
			setState(993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(991);
				match(COMMA);
				setState(992);
				positive_int_const();
				}
			}

			setState(995);
			match(RIGHT_ANG_BRACKET);
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

	public static class Set_typeContext extends ParserRuleContext {
		public TerminalNode KW_SET() { return getToken(IDLParser.KW_SET, 0); }
		public TerminalNode LEFT_ANG_BRACKET() { return getToken(IDLParser.LEFT_ANG_BRACKET, 0); }
		public Simple_type_specContext simple_type_spec() {
			return getRuleContext(Simple_type_specContext.class,0);
		}
		public TerminalNode RIGHT_ANG_BRACKET() { return getToken(IDLParser.RIGHT_ANG_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(IDLParser.COMMA, 0); }
		public Positive_int_constContext positive_int_const() {
			return getRuleContext(Positive_int_constContext.class,0);
		}
		public Set_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterSet_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitSet_type(this);
		}
	}

	public final Set_typeContext set_type() throws RecognitionException {
		Set_typeContext _localctx = new Set_typeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_set_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(KW_SET);
			setState(998);
			match(LEFT_ANG_BRACKET);
			setState(999);
			simple_type_spec();
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1000);
				match(COMMA);
				setState(1001);
				positive_int_const();
				}
			}

			setState(1004);
			match(RIGHT_ANG_BRACKET);
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

	public static class Map_typeContext extends ParserRuleContext {
		public TerminalNode KW_MAP() { return getToken(IDLParser.KW_MAP, 0); }
		public TerminalNode LEFT_ANG_BRACKET() { return getToken(IDLParser.LEFT_ANG_BRACKET, 0); }
		public List<Simple_type_specContext> simple_type_spec() {
			return getRuleContexts(Simple_type_specContext.class);
		}
		public Simple_type_specContext simple_type_spec(int i) {
			return getRuleContext(Simple_type_specContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public TerminalNode RIGHT_ANG_BRACKET() { return getToken(IDLParser.RIGHT_ANG_BRACKET, 0); }
		public Positive_int_constContext positive_int_const() {
			return getRuleContext(Positive_int_constContext.class,0);
		}
		public Map_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterMap_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitMap_type(this);
		}
	}

	public final Map_typeContext map_type() throws RecognitionException {
		Map_typeContext _localctx = new Map_typeContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_map_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(KW_MAP);
			setState(1007);
			match(LEFT_ANG_BRACKET);
			setState(1008);
			simple_type_spec();
			setState(1009);
			match(COMMA);
			setState(1010);
			simple_type_spec();
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1011);
				match(COMMA);
				setState(1012);
				positive_int_const();
				}
			}

			setState(1015);
			match(RIGHT_ANG_BRACKET);
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

	public static class String_typeContext extends ParserRuleContext {
		public TerminalNode KW_STRING() { return getToken(IDLParser.KW_STRING, 0); }
		public TerminalNode LEFT_ANG_BRACKET() { return getToken(IDLParser.LEFT_ANG_BRACKET, 0); }
		public Positive_int_constContext positive_int_const() {
			return getRuleContext(Positive_int_constContext.class,0);
		}
		public TerminalNode RIGHT_ANG_BRACKET() { return getToken(IDLParser.RIGHT_ANG_BRACKET, 0); }
		public String_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterString_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitString_type(this);
		}
	}

	public final String_typeContext string_type() throws RecognitionException {
		String_typeContext _localctx = new String_typeContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_string_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(KW_STRING);
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_ANG_BRACKET) {
				{
				setState(1018);
				match(LEFT_ANG_BRACKET);
				setState(1019);
				positive_int_const();
				setState(1020);
				match(RIGHT_ANG_BRACKET);
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

	public static class Wide_string_typeContext extends ParserRuleContext {
		public TerminalNode KW_WSTRING() { return getToken(IDLParser.KW_WSTRING, 0); }
		public TerminalNode LEFT_ANG_BRACKET() { return getToken(IDLParser.LEFT_ANG_BRACKET, 0); }
		public Positive_int_constContext positive_int_const() {
			return getRuleContext(Positive_int_constContext.class,0);
		}
		public TerminalNode RIGHT_ANG_BRACKET() { return getToken(IDLParser.RIGHT_ANG_BRACKET, 0); }
		public Wide_string_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wide_string_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterWide_string_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitWide_string_type(this);
		}
	}

	public final Wide_string_typeContext wide_string_type() throws RecognitionException {
		Wide_string_typeContext _localctx = new Wide_string_typeContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_wide_string_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			match(KW_WSTRING);
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_ANG_BRACKET) {
				{
				setState(1025);
				match(LEFT_ANG_BRACKET);
				setState(1026);
				positive_int_const();
				setState(1027);
				match(RIGHT_ANG_BRACKET);
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

	public static class Array_declaratorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public List<Fixed_array_sizeContext> fixed_array_size() {
			return getRuleContexts(Fixed_array_sizeContext.class);
		}
		public Fixed_array_sizeContext fixed_array_size(int i) {
			return getRuleContext(Fixed_array_sizeContext.class,i);
		}
		public Array_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterArray_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitArray_declarator(this);
		}
	}

	public final Array_declaratorContext array_declarator() throws RecognitionException {
		Array_declaratorContext _localctx = new Array_declaratorContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_array_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			match(ID);
			setState(1033); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1032);
				fixed_array_size();
				}
				}
				setState(1035); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LEFT_SQUARE_BRACKET );
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

	public static class Fixed_array_sizeContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(IDLParser.LEFT_SQUARE_BRACKET, 0); }
		public Positive_int_constContext positive_int_const() {
			return getRuleContext(Positive_int_constContext.class,0);
		}
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(IDLParser.RIGHT_SQUARE_BRACKET, 0); }
		public Fixed_array_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_array_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterFixed_array_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitFixed_array_size(this);
		}
	}

	public final Fixed_array_sizeContext fixed_array_size() throws RecognitionException {
		Fixed_array_sizeContext _localctx = new Fixed_array_sizeContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_fixed_array_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			match(LEFT_SQUARE_BRACKET);
			setState(1038);
			positive_int_const();
			setState(1039);
			match(RIGHT_SQUARE_BRACKET);
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

	public static class Attr_declContext extends ParserRuleContext {
		public Readonly_attr_specContext readonly_attr_spec() {
			return getRuleContext(Readonly_attr_specContext.class,0);
		}
		public Attr_specContext attr_spec() {
			return getRuleContext(Attr_specContext.class,0);
		}
		public Attr_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterAttr_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitAttr_decl(this);
		}
	}

	public final Attr_declContext attr_decl() throws RecognitionException {
		Attr_declContext _localctx = new Attr_declContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_attr_decl);
		try {
			setState(1043);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_READONLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1041);
				readonly_attr_spec();
				}
				break;
			case KW_ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1042);
				attr_spec();
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

	public static class Except_declContext extends ParserRuleContext {
		public TerminalNode KW_EXCEPTION() { return getToken(IDLParser.KW_EXCEPTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public Except_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_except_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterExcept_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitExcept_decl(this);
		}
	}

	public final Except_declContext except_decl() throws RecognitionException {
		Except_declContext _localctx = new Except_declContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_except_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			match(KW_EXCEPTION);
			setState(1046);
			identifier();
			setState(1047);
			match(LEFT_BRACE);
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COLON) | (1L << AT) | (1L << KW_STRING) | (1L << KW_OCTET) | (1L << KW_SEQUENCE) | (1L << KW_STRUCT) | (1L << KW_WCHAR) | (1L << KW_SHORT) | (1L << KW_LONG) | (1L << KW_ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_WSTRING - 64)) | (1L << (KW_VALUEBASE - 64)) | (1L << (KW_OBJECT - 64)) | (1L << (KW_UNSIGNED - 64)) | (1L << (KW_FIXED - 64)) | (1L << (KW_UNION - 64)) | (1L << (KW_ANY - 64)) | (1L << (KW_CHAR - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_SET - 64)) | (1L << (KW_MAP - 64)) | (1L << (KW_BITSET - 64)) | (1L << (KW_BITMASK - 64)) | (1L << (KW_INT8 - 64)) | (1L << (KW_UINT8 - 64)) | (1L << (KW_INT16 - 64)) | (1L << (KW_UINT16 - 64)) | (1L << (KW_INT32 - 64)) | (1L << (KW_UINT32 - 64)) | (1L << (KW_INT64 - 64)) | (1L << (KW_UINT64 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(1048);
				member();
				}
				}
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1054);
			match(RIGHT_BRACE);
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

	public static class Op_declContext extends ParserRuleContext {
		public Op_type_specContext op_type_spec() {
			return getRuleContext(Op_type_specContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Parameter_declsContext parameter_decls() {
			return getRuleContext(Parameter_declsContext.class,0);
		}
		public Op_attributeContext op_attribute() {
			return getRuleContext(Op_attributeContext.class,0);
		}
		public Raises_exprContext raises_expr() {
			return getRuleContext(Raises_exprContext.class,0);
		}
		public Context_exprContext context_expr() {
			return getRuleContext(Context_exprContext.class,0);
		}
		public Op_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterOp_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitOp_decl(this);
		}
	}

	public final Op_declContext op_decl() throws RecognitionException {
		Op_declContext _localctx = new Op_declContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_op_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ONEWAY) {
				{
				setState(1056);
				op_attribute();
				}
			}

			setState(1059);
			op_type_spec();
			setState(1060);
			identifier();
			setState(1061);
			parameter_decls();
			setState(1063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_RAISES) {
				{
				setState(1062);
				raises_expr();
				}
			}

			setState(1066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONTEXT) {
				{
				setState(1065);
				context_expr();
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

	public static class Op_attributeContext extends ParserRuleContext {
		public TerminalNode KW_ONEWAY() { return getToken(IDLParser.KW_ONEWAY, 0); }
		public Op_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterOp_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitOp_attribute(this);
		}
	}

	public final Op_attributeContext op_attribute() throws RecognitionException {
		Op_attributeContext _localctx = new Op_attributeContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_op_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			match(KW_ONEWAY);
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

	public static class Op_type_specContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Param_type_specContext param_type_spec() {
			return getRuleContext(Param_type_specContext.class,0);
		}
		public TerminalNode KW_VOID() { return getToken(IDLParser.KW_VOID, 0); }
		public Op_type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterOp_type_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitOp_type_spec(this);
		}
	}

	public final Op_type_specContext op_type_spec() throws RecognitionException {
		Op_type_specContext _localctx = new Op_type_specContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_op_type_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			annapps();
			setState(1073);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_COLON:
			case KW_STRING:
			case KW_OCTET:
			case KW_WCHAR:
			case KW_SHORT:
			case KW_LONG:
			case KW_WSTRING:
			case KW_VALUEBASE:
			case KW_OBJECT:
			case KW_UNSIGNED:
			case KW_ANY:
			case KW_CHAR:
			case KW_FLOAT:
			case KW_BOOLEAN:
			case KW_DOUBLE:
			case KW_INT8:
			case KW_UINT8:
			case KW_INT16:
			case KW_UINT16:
			case KW_INT32:
			case KW_UINT32:
			case KW_INT64:
			case KW_UINT64:
			case ID:
				{
				setState(1071);
				param_type_spec();
				}
				break;
			case KW_VOID:
				{
				setState(1072);
				match(KW_VOID);
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

	public static class Parameter_declsContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public List<Param_declContext> param_decl() {
			return getRuleContexts(Param_declContext.class);
		}
		public Param_declContext param_decl(int i) {
			return getRuleContext(Param_declContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Parameter_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterParameter_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitParameter_decls(this);
		}
	}

	public final Parameter_declsContext parameter_decls() throws RecognitionException {
		Parameter_declsContext _localctx = new Parameter_declsContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_parameter_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			match(LEFT_BRACKET);
			setState(1084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (AT - 35)) | (1L << (KW_OUT - 35)) | (1L << (KW_IN - 35)) | (1L << (KW_INOUT - 35)))) != 0)) {
				{
				setState(1076);
				param_decl();
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1077);
					match(COMMA);
					setState(1078);
					param_decl();
					}
					}
					setState(1083);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1086);
			match(RIGHT_BRACKET);
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

	public static class Param_declContext extends ParserRuleContext {
		public List<AnnappsContext> annapps() {
			return getRuleContexts(AnnappsContext.class);
		}
		public AnnappsContext annapps(int i) {
			return getRuleContext(AnnappsContext.class,i);
		}
		public Param_attributeContext param_attribute() {
			return getRuleContext(Param_attributeContext.class,0);
		}
		public Param_type_specContext param_type_spec() {
			return getRuleContext(Param_type_specContext.class,0);
		}
		public Simple_declaratorContext simple_declarator() {
			return getRuleContext(Simple_declaratorContext.class,0);
		}
		public Param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterParam_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitParam_decl(this);
		}
	}

	public final Param_declContext param_decl() throws RecognitionException {
		Param_declContext _localctx = new Param_declContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_param_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			annapps();
			setState(1089);
			param_attribute();
			setState(1090);
			annapps();
			setState(1091);
			param_type_spec();
			setState(1092);
			annapps();
			setState(1093);
			simple_declarator();
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

	public static class Param_attributeContext extends ParserRuleContext {
		public TerminalNode KW_IN() { return getToken(IDLParser.KW_IN, 0); }
		public TerminalNode KW_OUT() { return getToken(IDLParser.KW_OUT, 0); }
		public TerminalNode KW_INOUT() { return getToken(IDLParser.KW_INOUT, 0); }
		public Param_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterParam_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitParam_attribute(this);
		}
	}

	public final Param_attributeContext param_attribute() throws RecognitionException {
		Param_attributeContext _localctx = new Param_attributeContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_param_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			_la = _input.LA(1);
			if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (KW_OUT - 37)) | (1L << (KW_IN - 37)) | (1L << (KW_INOUT - 37)))) != 0)) ) {
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

	public static class Raises_exprContext extends ParserRuleContext {
		public TerminalNode KW_RAISES() { return getToken(IDLParser.KW_RAISES, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public List<A_scoped_nameContext> a_scoped_name() {
			return getRuleContexts(A_scoped_nameContext.class);
		}
		public A_scoped_nameContext a_scoped_name(int i) {
			return getRuleContext(A_scoped_nameContext.class,i);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Raises_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raises_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterRaises_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitRaises_expr(this);
		}
	}

	public final Raises_exprContext raises_expr() throws RecognitionException {
		Raises_exprContext _localctx = new Raises_exprContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_raises_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			match(KW_RAISES);
			setState(1098);
			match(LEFT_BRACKET);
			setState(1099);
			a_scoped_name();
			setState(1104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1100);
				match(COMMA);
				setState(1101);
				a_scoped_name();
				}
				}
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1107);
			match(RIGHT_BRACKET);
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

	public static class Context_exprContext extends ParserRuleContext {
		public TerminalNode KW_CONTEXT() { return getToken(IDLParser.KW_CONTEXT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(IDLParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(IDLParser.STRING_LITERAL, i);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Context_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterContext_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitContext_expr(this);
		}
	}

	public final Context_exprContext context_expr() throws RecognitionException {
		Context_exprContext _localctx = new Context_exprContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_context_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			match(KW_CONTEXT);
			setState(1110);
			match(LEFT_BRACKET);
			setState(1111);
			match(STRING_LITERAL);
			setState(1116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1112);
				match(COMMA);
				setState(1113);
				match(STRING_LITERAL);
				}
				}
				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1119);
			match(RIGHT_BRACKET);
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

	public static class Param_type_specContext extends ParserRuleContext {
		public Base_type_specContext base_type_spec() {
			return getRuleContext(Base_type_specContext.class,0);
		}
		public String_typeContext string_type() {
			return getRuleContext(String_typeContext.class,0);
		}
		public Wide_string_typeContext wide_string_type() {
			return getRuleContext(Wide_string_typeContext.class,0);
		}
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Param_type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterParam_type_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitParam_type_spec(this);
		}
	}

	public final Param_type_specContext param_type_spec() throws RecognitionException {
		Param_type_specContext _localctx = new Param_type_specContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_param_type_spec);
		try {
			setState(1125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_OCTET:
			case KW_WCHAR:
			case KW_SHORT:
			case KW_LONG:
			case KW_VALUEBASE:
			case KW_OBJECT:
			case KW_UNSIGNED:
			case KW_ANY:
			case KW_CHAR:
			case KW_FLOAT:
			case KW_BOOLEAN:
			case KW_DOUBLE:
			case KW_INT8:
			case KW_UINT8:
			case KW_INT16:
			case KW_UINT16:
			case KW_INT32:
			case KW_UINT32:
			case KW_INT64:
			case KW_UINT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(1121);
				base_type_spec();
				}
				break;
			case KW_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1122);
				string_type();
				}
				break;
			case KW_WSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1123);
				wide_string_type();
				}
				break;
			case DOUBLE_COLON:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(1124);
				scoped_name();
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

	public static class Fixed_pt_typeContext extends ParserRuleContext {
		public TerminalNode KW_FIXED() { return getToken(IDLParser.KW_FIXED, 0); }
		public TerminalNode LEFT_ANG_BRACKET() { return getToken(IDLParser.LEFT_ANG_BRACKET, 0); }
		public List<Positive_int_constContext> positive_int_const() {
			return getRuleContexts(Positive_int_constContext.class);
		}
		public Positive_int_constContext positive_int_const(int i) {
			return getRuleContext(Positive_int_constContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(IDLParser.COMMA, 0); }
		public TerminalNode RIGHT_ANG_BRACKET() { return getToken(IDLParser.RIGHT_ANG_BRACKET, 0); }
		public Fixed_pt_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pt_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterFixed_pt_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitFixed_pt_type(this);
		}
	}

	public final Fixed_pt_typeContext fixed_pt_type() throws RecognitionException {
		Fixed_pt_typeContext _localctx = new Fixed_pt_typeContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_fixed_pt_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			match(KW_FIXED);
			setState(1128);
			match(LEFT_ANG_BRACKET);
			setState(1129);
			positive_int_const();
			setState(1130);
			match(COMMA);
			setState(1131);
			positive_int_const();
			setState(1132);
			match(RIGHT_ANG_BRACKET);
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

	public static class Fixed_pt_const_typeContext extends ParserRuleContext {
		public TerminalNode KW_FIXED() { return getToken(IDLParser.KW_FIXED, 0); }
		public Fixed_pt_const_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pt_const_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterFixed_pt_const_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitFixed_pt_const_type(this);
		}
	}

	public final Fixed_pt_const_typeContext fixed_pt_const_type() throws RecognitionException {
		Fixed_pt_const_typeContext _localctx = new Fixed_pt_const_typeContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_fixed_pt_const_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			match(KW_FIXED);
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

	public static class Value_base_typeContext extends ParserRuleContext {
		public TerminalNode KW_VALUEBASE() { return getToken(IDLParser.KW_VALUEBASE, 0); }
		public Value_base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterValue_base_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitValue_base_type(this);
		}
	}

	public final Value_base_typeContext value_base_type() throws RecognitionException {
		Value_base_typeContext _localctx = new Value_base_typeContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_value_base_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			match(KW_VALUEBASE);
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

	public static class Constr_forward_declContext extends ParserRuleContext {
		public TerminalNode KW_STRUCT() { return getToken(IDLParser.KW_STRUCT, 0); }
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public TerminalNode KW_UNION() { return getToken(IDLParser.KW_UNION, 0); }
		public Constr_forward_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr_forward_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterConstr_forward_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitConstr_forward_decl(this);
		}
	}

	public final Constr_forward_declContext constr_forward_decl() throws RecognitionException {
		Constr_forward_declContext _localctx = new Constr_forward_declContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_constr_forward_decl);
		try {
			setState(1142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1138);
				match(KW_STRUCT);
				setState(1139);
				match(ID);
				}
				break;
			case KW_UNION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1140);
				match(KW_UNION);
				setState(1141);
				match(ID);
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

	public static class Import_declContext extends ParserRuleContext {
		public List<AnnappsContext> annapps() {
			return getRuleContexts(AnnappsContext.class);
		}
		public AnnappsContext annapps(int i) {
			return getRuleContext(AnnappsContext.class,i);
		}
		public TerminalNode KW_IMPORT() { return getToken(IDLParser.KW_IMPORT, 0); }
		public Imported_scopeContext imported_scope() {
			return getRuleContext(Imported_scopeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public Import_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterImport_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitImport_decl(this);
		}
	}

	public final Import_declContext import_decl() throws RecognitionException {
		Import_declContext _localctx = new Import_declContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_import_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			annapps();
			setState(1145);
			match(KW_IMPORT);
			setState(1146);
			annapps();
			setState(1147);
			imported_scope();
			setState(1148);
			match(SEMICOLON);
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

	public static class Imported_scopeContext extends ParserRuleContext {
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(IDLParser.STRING_LITERAL, 0); }
		public Imported_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imported_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterImported_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitImported_scope(this);
		}
	}

	public final Imported_scopeContext imported_scope() throws RecognitionException {
		Imported_scopeContext _localctx = new Imported_scopeContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_imported_scope);
		try {
			setState(1152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_COLON:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1150);
				scoped_name();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1151);
				match(STRING_LITERAL);
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

	public static class Type_id_declContext extends ParserRuleContext {
		public TerminalNode KW_TYPEID() { return getToken(IDLParser.KW_TYPEID, 0); }
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(IDLParser.STRING_LITERAL, 0); }
		public Type_id_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_id_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterType_id_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitType_id_decl(this);
		}
	}

	public final Type_id_declContext type_id_decl() throws RecognitionException {
		Type_id_declContext _localctx = new Type_id_declContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_type_id_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			match(KW_TYPEID);
			setState(1155);
			a_scoped_name();
			setState(1156);
			match(STRING_LITERAL);
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

	public static class Type_prefix_declContext extends ParserRuleContext {
		public TerminalNode KW_TYPEPREFIX() { return getToken(IDLParser.KW_TYPEPREFIX, 0); }
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(IDLParser.STRING_LITERAL, 0); }
		public Type_prefix_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_prefix_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterType_prefix_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitType_prefix_decl(this);
		}
	}

	public final Type_prefix_declContext type_prefix_decl() throws RecognitionException {
		Type_prefix_declContext _localctx = new Type_prefix_declContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_type_prefix_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
			match(KW_TYPEPREFIX);
			setState(1159);
			a_scoped_name();
			setState(1160);
			match(STRING_LITERAL);
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

	public static class Readonly_attr_specContext extends ParserRuleContext {
		public TerminalNode KW_READONLY() { return getToken(IDLParser.KW_READONLY, 0); }
		public TerminalNode KW_ATTRIBUTE() { return getToken(IDLParser.KW_ATTRIBUTE, 0); }
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Param_type_specContext param_type_spec() {
			return getRuleContext(Param_type_specContext.class,0);
		}
		public Readonly_attr_declaratorContext readonly_attr_declarator() {
			return getRuleContext(Readonly_attr_declaratorContext.class,0);
		}
		public Readonly_attr_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readonly_attr_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterReadonly_attr_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitReadonly_attr_spec(this);
		}
	}

	public final Readonly_attr_specContext readonly_attr_spec() throws RecognitionException {
		Readonly_attr_specContext _localctx = new Readonly_attr_specContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_readonly_attr_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			match(KW_READONLY);
			setState(1163);
			match(KW_ATTRIBUTE);
			setState(1164);
			annapps();
			setState(1165);
			param_type_spec();
			setState(1166);
			readonly_attr_declarator();
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

	public static class Readonly_attr_declaratorContext extends ParserRuleContext {
		public List<AnnappsContext> annapps() {
			return getRuleContexts(AnnappsContext.class);
		}
		public AnnappsContext annapps(int i) {
			return getRuleContext(AnnappsContext.class,i);
		}
		public List<Simple_declaratorContext> simple_declarator() {
			return getRuleContexts(Simple_declaratorContext.class);
		}
		public Simple_declaratorContext simple_declarator(int i) {
			return getRuleContext(Simple_declaratorContext.class,i);
		}
		public Raises_exprContext raises_expr() {
			return getRuleContext(Raises_exprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Readonly_attr_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readonly_attr_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterReadonly_attr_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitReadonly_attr_declarator(this);
		}
	}

	public final Readonly_attr_declaratorContext readonly_attr_declarator() throws RecognitionException {
		Readonly_attr_declaratorContext _localctx = new Readonly_attr_declaratorContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_readonly_attr_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			annapps();
			setState(1169);
			simple_declarator();
			setState(1180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_RAISES:
				{
				setState(1170);
				raises_expr();
				}
				break;
			case SEMICOLON:
			case COMMA:
				{
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1171);
					match(COMMA);
					setState(1172);
					annapps();
					setState(1173);
					simple_declarator();
					}
					}
					setState(1179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Attr_specContext extends ParserRuleContext {
		public TerminalNode KW_ATTRIBUTE() { return getToken(IDLParser.KW_ATTRIBUTE, 0); }
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Param_type_specContext param_type_spec() {
			return getRuleContext(Param_type_specContext.class,0);
		}
		public Attr_declaratorContext attr_declarator() {
			return getRuleContext(Attr_declaratorContext.class,0);
		}
		public Attr_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterAttr_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitAttr_spec(this);
		}
	}

	public final Attr_specContext attr_spec() throws RecognitionException {
		Attr_specContext _localctx = new Attr_specContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_attr_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			match(KW_ATTRIBUTE);
			setState(1183);
			annapps();
			setState(1184);
			param_type_spec();
			setState(1185);
			attr_declarator();
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

	public static class Attr_declaratorContext extends ParserRuleContext {
		public List<AnnappsContext> annapps() {
			return getRuleContexts(AnnappsContext.class);
		}
		public AnnappsContext annapps(int i) {
			return getRuleContext(AnnappsContext.class,i);
		}
		public List<Simple_declaratorContext> simple_declarator() {
			return getRuleContexts(Simple_declaratorContext.class);
		}
		public Simple_declaratorContext simple_declarator(int i) {
			return getRuleContext(Simple_declaratorContext.class,i);
		}
		public Attr_raises_exprContext attr_raises_expr() {
			return getRuleContext(Attr_raises_exprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Attr_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterAttr_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitAttr_declarator(this);
		}
	}

	public final Attr_declaratorContext attr_declarator() throws RecognitionException {
		Attr_declaratorContext _localctx = new Attr_declaratorContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_attr_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187);
			annapps();
			setState(1188);
			simple_declarator();
			setState(1199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_SETRAISES:
			case KW_GETRAISES:
				{
				setState(1189);
				attr_raises_expr();
				}
				break;
			case SEMICOLON:
			case COMMA:
				{
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1190);
					match(COMMA);
					setState(1191);
					annapps();
					setState(1192);
					simple_declarator();
					}
					}
					setState(1198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Attr_raises_exprContext extends ParserRuleContext {
		public Get_excep_exprContext get_excep_expr() {
			return getRuleContext(Get_excep_exprContext.class,0);
		}
		public Set_excep_exprContext set_excep_expr() {
			return getRuleContext(Set_excep_exprContext.class,0);
		}
		public Attr_raises_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_raises_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterAttr_raises_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitAttr_raises_expr(this);
		}
	}

	public final Attr_raises_exprContext attr_raises_expr() throws RecognitionException {
		Attr_raises_exprContext _localctx = new Attr_raises_exprContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_attr_raises_expr);
		int _la;
		try {
			setState(1206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_GETRAISES:
				enterOuterAlt(_localctx, 1);
				{
				setState(1201);
				get_excep_expr();
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_SETRAISES) {
					{
					setState(1202);
					set_excep_expr();
					}
				}

				}
				break;
			case KW_SETRAISES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1205);
				set_excep_expr();
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

	public static class Get_excep_exprContext extends ParserRuleContext {
		public TerminalNode KW_GETRAISES() { return getToken(IDLParser.KW_GETRAISES, 0); }
		public Exception_listContext exception_list() {
			return getRuleContext(Exception_listContext.class,0);
		}
		public Get_excep_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_excep_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterGet_excep_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitGet_excep_expr(this);
		}
	}

	public final Get_excep_exprContext get_excep_expr() throws RecognitionException {
		Get_excep_exprContext _localctx = new Get_excep_exprContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_get_excep_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			match(KW_GETRAISES);
			setState(1209);
			exception_list();
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

	public static class Set_excep_exprContext extends ParserRuleContext {
		public TerminalNode KW_SETRAISES() { return getToken(IDLParser.KW_SETRAISES, 0); }
		public Exception_listContext exception_list() {
			return getRuleContext(Exception_listContext.class,0);
		}
		public Set_excep_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_excep_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterSet_excep_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitSet_excep_expr(this);
		}
	}

	public final Set_excep_exprContext set_excep_expr() throws RecognitionException {
		Set_excep_exprContext _localctx = new Set_excep_exprContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_set_excep_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			match(KW_SETRAISES);
			setState(1212);
			exception_list();
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

	public static class Exception_listContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public List<A_scoped_nameContext> a_scoped_name() {
			return getRuleContexts(A_scoped_nameContext.class);
		}
		public A_scoped_nameContext a_scoped_name(int i) {
			return getRuleContext(A_scoped_nameContext.class,i);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Exception_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterException_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitException_list(this);
		}
	}

	public final Exception_listContext exception_list() throws RecognitionException {
		Exception_listContext _localctx = new Exception_listContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_exception_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(LEFT_BRACKET);
			setState(1215);
			a_scoped_name();
			setState(1220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1216);
				match(COMMA);
				setState(1217);
				a_scoped_name();
				}
				}
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1223);
			match(RIGHT_BRACKET);
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

	public static class ComponentContext extends ParserRuleContext {
		public Component_declContext component_decl() {
			return getRuleContext(Component_declContext.class,0);
		}
		public Component_forward_declContext component_forward_decl() {
			return getRuleContext(Component_forward_declContext.class,0);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitComponent(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_component);
		try {
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225);
				component_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1226);
				component_forward_decl();
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

	public static class Component_forward_declContext extends ParserRuleContext {
		public TerminalNode KW_COMPONENT() { return getToken(IDLParser.KW_COMPONENT, 0); }
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public Component_forward_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_forward_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterComponent_forward_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitComponent_forward_decl(this);
		}
	}

	public final Component_forward_declContext component_forward_decl() throws RecognitionException {
		Component_forward_declContext _localctx = new Component_forward_declContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_component_forward_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			match(KW_COMPONENT);
			setState(1230);
			match(ID);
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

	public static class Component_declContext extends ParserRuleContext {
		public Component_headerContext component_header() {
			return getRuleContext(Component_headerContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public Component_bodyContext component_body() {
			return getRuleContext(Component_bodyContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public Component_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterComponent_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitComponent_decl(this);
		}
	}

	public final Component_declContext component_decl() throws RecognitionException {
		Component_declContext _localctx = new Component_declContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_component_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			component_header();
			setState(1233);
			match(LEFT_BRACE);
			setState(1234);
			component_body();
			setState(1235);
			match(RIGHT_BRACE);
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

	public static class Component_headerContext extends ParserRuleContext {
		public TerminalNode KW_COMPONENT() { return getToken(IDLParser.KW_COMPONENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Component_inheritance_specContext component_inheritance_spec() {
			return getRuleContext(Component_inheritance_specContext.class,0);
		}
		public Supported_interface_specContext supported_interface_spec() {
			return getRuleContext(Supported_interface_specContext.class,0);
		}
		public Component_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterComponent_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitComponent_header(this);
		}
	}

	public final Component_headerContext component_header() throws RecognitionException {
		Component_headerContext _localctx = new Component_headerContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_component_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			match(KW_COMPONENT);
			setState(1238);
			identifier();
			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1239);
				component_inheritance_spec();
				}
			}

			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_SUPPORTS) {
				{
				setState(1242);
				supported_interface_spec();
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

	public static class Supported_interface_specContext extends ParserRuleContext {
		public TerminalNode KW_SUPPORTS() { return getToken(IDLParser.KW_SUPPORTS, 0); }
		public List<A_scoped_nameContext> a_scoped_name() {
			return getRuleContexts(A_scoped_nameContext.class);
		}
		public A_scoped_nameContext a_scoped_name(int i) {
			return getRuleContext(A_scoped_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Supported_interface_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supported_interface_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterSupported_interface_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitSupported_interface_spec(this);
		}
	}

	public final Supported_interface_specContext supported_interface_spec() throws RecognitionException {
		Supported_interface_specContext _localctx = new Supported_interface_specContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_supported_interface_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			match(KW_SUPPORTS);
			setState(1246);
			a_scoped_name();
			setState(1251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1247);
				match(COMMA);
				setState(1248);
				a_scoped_name();
				}
				}
				setState(1253);
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

	public static class Component_inheritance_specContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(IDLParser.COLON, 0); }
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public Component_inheritance_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_inheritance_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterComponent_inheritance_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitComponent_inheritance_spec(this);
		}
	}

	public final Component_inheritance_specContext component_inheritance_spec() throws RecognitionException {
		Component_inheritance_specContext _localctx = new Component_inheritance_specContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_component_inheritance_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			match(COLON);
			setState(1255);
			a_scoped_name();
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

	public static class Component_bodyContext extends ParserRuleContext {
		public List<Component_exportContext> component_export() {
			return getRuleContexts(Component_exportContext.class);
		}
		public Component_exportContext component_export(int i) {
			return getRuleContext(Component_exportContext.class,i);
		}
		public Component_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterComponent_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitComponent_body(this);
		}
	}

	public final Component_bodyContext component_body() throws RecognitionException {
		Component_bodyContext _localctx = new Component_bodyContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_component_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (AT - 35)) | (1L << (KW_EMITS - 35)) | (1L << (KW_PUBLISHES - 35)) | (1L << (KW_USES - 35)) | (1L << (KW_READONLY - 35)) | (1L << (KW_PROVIDES - 35)) | (1L << (KW_CONSUMES - 35)) | (1L << (KW_ATTRIBUTE - 35)))) != 0)) {
				{
				{
				setState(1257);
				component_export();
				}
				}
				setState(1262);
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

	public static class Component_exportContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Provides_declContext provides_decl() {
			return getRuleContext(Provides_declContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public Uses_declContext uses_decl() {
			return getRuleContext(Uses_declContext.class,0);
		}
		public Emits_declContext emits_decl() {
			return getRuleContext(Emits_declContext.class,0);
		}
		public Publishes_declContext publishes_decl() {
			return getRuleContext(Publishes_declContext.class,0);
		}
		public Consumes_declContext consumes_decl() {
			return getRuleContext(Consumes_declContext.class,0);
		}
		public Attr_declContext attr_decl() {
			return getRuleContext(Attr_declContext.class,0);
		}
		public Component_exportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_export; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterComponent_export(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitComponent_export(this);
		}
	}

	public final Component_exportContext component_export() throws RecognitionException {
		Component_exportContext _localctx = new Component_exportContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_component_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			annapps();
			setState(1282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PROVIDES:
				{
				setState(1264);
				provides_decl();
				setState(1265);
				match(SEMICOLON);
				}
				break;
			case KW_USES:
				{
				setState(1267);
				uses_decl();
				setState(1268);
				match(SEMICOLON);
				}
				break;
			case KW_EMITS:
				{
				setState(1270);
				emits_decl();
				setState(1271);
				match(SEMICOLON);
				}
				break;
			case KW_PUBLISHES:
				{
				setState(1273);
				publishes_decl();
				setState(1274);
				match(SEMICOLON);
				}
				break;
			case KW_CONSUMES:
				{
				setState(1276);
				consumes_decl();
				setState(1277);
				match(SEMICOLON);
				}
				break;
			case KW_READONLY:
			case KW_ATTRIBUTE:
				{
				setState(1279);
				attr_decl();
				setState(1280);
				match(SEMICOLON);
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

	public static class Provides_declContext extends ParserRuleContext {
		public TerminalNode KW_PROVIDES() { return getToken(IDLParser.KW_PROVIDES, 0); }
		public Interface_typeContext interface_type() {
			return getRuleContext(Interface_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public Provides_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_provides_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterProvides_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitProvides_decl(this);
		}
	}

	public final Provides_declContext provides_decl() throws RecognitionException {
		Provides_declContext _localctx = new Provides_declContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_provides_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			match(KW_PROVIDES);
			setState(1285);
			interface_type();
			setState(1286);
			match(ID);
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

	public static class Interface_typeContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public TerminalNode KW_OBJECT() { return getToken(IDLParser.KW_OBJECT, 0); }
		public Interface_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterInterface_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitInterface_type(this);
		}
	}

	public final Interface_typeContext interface_type() throws RecognitionException {
		Interface_typeContext _localctx = new Interface_typeContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_interface_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			annapps();
			setState(1291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_COLON:
			case ID:
				{
				setState(1289);
				scoped_name();
				}
				break;
			case KW_OBJECT:
				{
				setState(1290);
				match(KW_OBJECT);
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

	public static class Uses_declContext extends ParserRuleContext {
		public TerminalNode KW_USES() { return getToken(IDLParser.KW_USES, 0); }
		public Interface_typeContext interface_type() {
			return getRuleContext(Interface_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public TerminalNode KW_MULTIPLE() { return getToken(IDLParser.KW_MULTIPLE, 0); }
		public Uses_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uses_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterUses_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitUses_decl(this);
		}
	}

	public final Uses_declContext uses_decl() throws RecognitionException {
		Uses_declContext _localctx = new Uses_declContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_uses_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			match(KW_USES);
			setState(1295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MULTIPLE) {
				{
				setState(1294);
				match(KW_MULTIPLE);
				}
			}

			setState(1297);
			interface_type();
			setState(1298);
			match(ID);
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

	public static class Emits_declContext extends ParserRuleContext {
		public TerminalNode KW_EMITS() { return getToken(IDLParser.KW_EMITS, 0); }
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public Emits_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emits_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterEmits_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitEmits_decl(this);
		}
	}

	public final Emits_declContext emits_decl() throws RecognitionException {
		Emits_declContext _localctx = new Emits_declContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_emits_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			match(KW_EMITS);
			setState(1301);
			a_scoped_name();
			setState(1302);
			match(ID);
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

	public static class Publishes_declContext extends ParserRuleContext {
		public TerminalNode KW_PUBLISHES() { return getToken(IDLParser.KW_PUBLISHES, 0); }
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public Publishes_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publishes_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterPublishes_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitPublishes_decl(this);
		}
	}

	public final Publishes_declContext publishes_decl() throws RecognitionException {
		Publishes_declContext _localctx = new Publishes_declContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_publishes_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
			match(KW_PUBLISHES);
			setState(1305);
			a_scoped_name();
			setState(1306);
			match(ID);
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

	public static class Consumes_declContext extends ParserRuleContext {
		public TerminalNode KW_CONSUMES() { return getToken(IDLParser.KW_CONSUMES, 0); }
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public Consumes_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consumes_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterConsumes_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitConsumes_decl(this);
		}
	}

	public final Consumes_declContext consumes_decl() throws RecognitionException {
		Consumes_declContext _localctx = new Consumes_declContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_consumes_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308);
			match(KW_CONSUMES);
			setState(1309);
			a_scoped_name();
			setState(1310);
			match(ID);
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

	public static class Home_declContext extends ParserRuleContext {
		public Home_headerContext home_header() {
			return getRuleContext(Home_headerContext.class,0);
		}
		public Home_bodyContext home_body() {
			return getRuleContext(Home_bodyContext.class,0);
		}
		public Home_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_home_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterHome_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitHome_decl(this);
		}
	}

	public final Home_declContext home_decl() throws RecognitionException {
		Home_declContext _localctx = new Home_declContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_home_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			home_header();
			setState(1313);
			home_body();
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

	public static class Home_headerContext extends ParserRuleContext {
		public TerminalNode KW_HOME() { return getToken(IDLParser.KW_HOME, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_MANAGES() { return getToken(IDLParser.KW_MANAGES, 0); }
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public Home_inheritance_specContext home_inheritance_spec() {
			return getRuleContext(Home_inheritance_specContext.class,0);
		}
		public Supported_interface_specContext supported_interface_spec() {
			return getRuleContext(Supported_interface_specContext.class,0);
		}
		public Primary_key_specContext primary_key_spec() {
			return getRuleContext(Primary_key_specContext.class,0);
		}
		public Home_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_home_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterHome_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitHome_header(this);
		}
	}

	public final Home_headerContext home_header() throws RecognitionException {
		Home_headerContext _localctx = new Home_headerContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_home_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			match(KW_HOME);
			setState(1316);
			identifier();
			setState(1318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1317);
				home_inheritance_spec();
				}
			}

			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_SUPPORTS) {
				{
				setState(1320);
				supported_interface_spec();
				}
			}

			setState(1323);
			match(KW_MANAGES);
			setState(1324);
			a_scoped_name();
			setState(1326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PRIMARYKEY) {
				{
				setState(1325);
				primary_key_spec();
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

	public static class Home_inheritance_specContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(IDLParser.COLON, 0); }
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public Home_inheritance_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_home_inheritance_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterHome_inheritance_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitHome_inheritance_spec(this);
		}
	}

	public final Home_inheritance_specContext home_inheritance_spec() throws RecognitionException {
		Home_inheritance_specContext _localctx = new Home_inheritance_specContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_home_inheritance_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			match(COLON);
			setState(1329);
			a_scoped_name();
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

	public static class Primary_key_specContext extends ParserRuleContext {
		public TerminalNode KW_PRIMARYKEY() { return getToken(IDLParser.KW_PRIMARYKEY, 0); }
		public A_scoped_nameContext a_scoped_name() {
			return getRuleContext(A_scoped_nameContext.class,0);
		}
		public Primary_key_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_key_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterPrimary_key_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitPrimary_key_spec(this);
		}
	}

	public final Primary_key_specContext primary_key_spec() throws RecognitionException {
		Primary_key_specContext _localctx = new Primary_key_specContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_primary_key_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
			match(KW_PRIMARYKEY);
			setState(1332);
			a_scoped_name();
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

	public static class Home_bodyContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public List<Home_exportContext> home_export() {
			return getRuleContexts(Home_exportContext.class);
		}
		public Home_exportContext home_export(int i) {
			return getRuleContext(Home_exportContext.class,i);
		}
		public Home_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_home_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterHome_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitHome_body(this);
		}
	}

	public final Home_bodyContext home_body() throws RecognitionException {
		Home_bodyContext _localctx = new Home_bodyContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_home_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			match(LEFT_BRACE);
			setState(1338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COLON) | (1L << AT) | (1L << KW_STRING) | (1L << KW_TYPEDEF) | (1L << KW_OCTET) | (1L << KW_STRUCT) | (1L << KW_NATIVE) | (1L << KW_READONLY) | (1L << KW_FINDER) | (1L << KW_VOID) | (1L << KW_WCHAR) | (1L << KW_SHORT) | (1L << KW_LONG) | (1L << KW_ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_WSTRING - 64)) | (1L << (KW_FACTORY - 64)) | (1L << (KW_EXCEPTION - 64)) | (1L << (KW_CONST - 64)) | (1L << (KW_VALUEBASE - 64)) | (1L << (KW_OBJECT - 64)) | (1L << (KW_UNSIGNED - 64)) | (1L << (KW_UNION - 64)) | (1L << (KW_ONEWAY - 64)) | (1L << (KW_ANY - 64)) | (1L << (KW_CHAR - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_TYPEPREFIX - 64)) | (1L << (KW_TYPEID - 64)) | (1L << (KW_ATTRIBUTE - 64)) | (1L << (KW_BITSET - 64)) | (1L << (KW_BITMASK - 64)) | (1L << (KW_INT8 - 64)) | (1L << (KW_UINT8 - 64)) | (1L << (KW_INT16 - 64)) | (1L << (KW_UINT16 - 64)) | (1L << (KW_INT32 - 64)) | (1L << (KW_UINT32 - 64)) | (1L << (KW_INT64 - 64)) | (1L << (KW_UINT64 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(1335);
				home_export();
				}
				}
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1341);
			match(RIGHT_BRACE);
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

	public static class Home_exportContext extends ParserRuleContext {
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IDLParser.SEMICOLON, 0); }
		public Factory_declContext factory_decl() {
			return getRuleContext(Factory_declContext.class,0);
		}
		public Finder_declContext finder_decl() {
			return getRuleContext(Finder_declContext.class,0);
		}
		public Home_exportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_home_export; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterHome_export(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitHome_export(this);
		}
	}

	public final Home_exportContext home_export() throws RecognitionException {
		Home_exportContext _localctx = new Home_exportContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_home_export);
		try {
			setState(1351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1343);
				export();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1344);
				annapps();
				setState(1347);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_FACTORY:
					{
					setState(1345);
					factory_decl();
					}
					break;
				case KW_FINDER:
					{
					setState(1346);
					finder_decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1349);
				match(SEMICOLON);
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

	public static class Factory_declContext extends ParserRuleContext {
		public TerminalNode KW_FACTORY() { return getToken(IDLParser.KW_FACTORY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public Init_param_declsContext init_param_decls() {
			return getRuleContext(Init_param_declsContext.class,0);
		}
		public Raises_exprContext raises_expr() {
			return getRuleContext(Raises_exprContext.class,0);
		}
		public Factory_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factory_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterFactory_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitFactory_decl(this);
		}
	}

	public final Factory_declContext factory_decl() throws RecognitionException {
		Factory_declContext _localctx = new Factory_declContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_factory_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			match(KW_FACTORY);
			setState(1354);
			identifier();
			setState(1355);
			match(LEFT_BRACKET);
			setState(1357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==KW_IN) {
				{
				setState(1356);
				init_param_decls();
				}
			}

			setState(1359);
			match(RIGHT_BRACKET);
			setState(1361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_RAISES) {
				{
				setState(1360);
				raises_expr();
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

	public static class Finder_declContext extends ParserRuleContext {
		public TerminalNode KW_FINDER() { return getToken(IDLParser.KW_FINDER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public Init_param_declsContext init_param_decls() {
			return getRuleContext(Init_param_declsContext.class,0);
		}
		public Raises_exprContext raises_expr() {
			return getRuleContext(Raises_exprContext.class,0);
		}
		public Finder_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finder_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterFinder_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitFinder_decl(this);
		}
	}

	public final Finder_declContext finder_decl() throws RecognitionException {
		Finder_declContext _localctx = new Finder_declContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_finder_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			match(KW_FINDER);
			setState(1364);
			identifier();
			setState(1365);
			match(LEFT_BRACKET);
			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==KW_IN) {
				{
				setState(1366);
				init_param_decls();
				}
			}

			setState(1369);
			match(RIGHT_BRACKET);
			setState(1371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_RAISES) {
				{
				setState(1370);
				raises_expr();
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

	public static class EventContext extends ParserRuleContext {
		public Event_declContext event_decl() {
			return getRuleContext(Event_declContext.class,0);
		}
		public Event_abs_declContext event_abs_decl() {
			return getRuleContext(Event_abs_declContext.class,0);
		}
		public Event_forward_declContext event_forward_decl() {
			return getRuleContext(Event_forward_declContext.class,0);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitEvent(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1373);
				event_decl();
				}
				break;
			case 2:
				{
				setState(1374);
				event_abs_decl();
				}
				break;
			case 3:
				{
				setState(1375);
				event_forward_decl();
				}
				break;
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

	public static class Event_forward_declContext extends ParserRuleContext {
		public TerminalNode KW_EVENTTYPE() { return getToken(IDLParser.KW_EVENTTYPE, 0); }
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public TerminalNode KW_ABSTRACT() { return getToken(IDLParser.KW_ABSTRACT, 0); }
		public Event_forward_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_forward_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterEvent_forward_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitEvent_forward_decl(this);
		}
	}

	public final Event_forward_declContext event_forward_decl() throws RecognitionException {
		Event_forward_declContext _localctx = new Event_forward_declContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_event_forward_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ABSTRACT) {
				{
				setState(1378);
				match(KW_ABSTRACT);
				}
			}

			setState(1381);
			match(KW_EVENTTYPE);
			setState(1382);
			match(ID);
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

	public static class Event_abs_declContext extends ParserRuleContext {
		public TerminalNode KW_ABSTRACT() { return getToken(IDLParser.KW_ABSTRACT, 0); }
		public TerminalNode KW_EVENTTYPE() { return getToken(IDLParser.KW_EVENTTYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Value_inheritance_specContext value_inheritance_spec() {
			return getRuleContext(Value_inheritance_specContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public List<ExportContext> export() {
			return getRuleContexts(ExportContext.class);
		}
		public ExportContext export(int i) {
			return getRuleContext(ExportContext.class,i);
		}
		public Event_abs_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_abs_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterEvent_abs_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitEvent_abs_decl(this);
		}
	}

	public final Event_abs_declContext event_abs_decl() throws RecognitionException {
		Event_abs_declContext _localctx = new Event_abs_declContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_event_abs_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			match(KW_ABSTRACT);
			setState(1385);
			match(KW_EVENTTYPE);
			setState(1386);
			identifier();
			setState(1387);
			value_inheritance_spec();
			setState(1388);
			match(LEFT_BRACE);
			setState(1392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COLON) | (1L << AT) | (1L << KW_STRING) | (1L << KW_TYPEDEF) | (1L << KW_OCTET) | (1L << KW_STRUCT) | (1L << KW_NATIVE) | (1L << KW_READONLY) | (1L << KW_VOID) | (1L << KW_WCHAR) | (1L << KW_SHORT) | (1L << KW_LONG) | (1L << KW_ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_WSTRING - 64)) | (1L << (KW_EXCEPTION - 64)) | (1L << (KW_CONST - 64)) | (1L << (KW_VALUEBASE - 64)) | (1L << (KW_OBJECT - 64)) | (1L << (KW_UNSIGNED - 64)) | (1L << (KW_UNION - 64)) | (1L << (KW_ONEWAY - 64)) | (1L << (KW_ANY - 64)) | (1L << (KW_CHAR - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_TYPEPREFIX - 64)) | (1L << (KW_TYPEID - 64)) | (1L << (KW_ATTRIBUTE - 64)) | (1L << (KW_BITSET - 64)) | (1L << (KW_BITMASK - 64)) | (1L << (KW_INT8 - 64)) | (1L << (KW_UINT8 - 64)) | (1L << (KW_INT16 - 64)) | (1L << (KW_UINT16 - 64)) | (1L << (KW_INT32 - 64)) | (1L << (KW_UINT32 - 64)) | (1L << (KW_INT64 - 64)) | (1L << (KW_UINT64 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(1389);
				export();
				}
				}
				setState(1394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1395);
			match(RIGHT_BRACE);
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

	public static class Event_declContext extends ParserRuleContext {
		public Event_headerContext event_header() {
			return getRuleContext(Event_headerContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(IDLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(IDLParser.RIGHT_BRACE, 0); }
		public List<Value_elementContext> value_element() {
			return getRuleContexts(Value_elementContext.class);
		}
		public Value_elementContext value_element(int i) {
			return getRuleContext(Value_elementContext.class,i);
		}
		public Event_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterEvent_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitEvent_decl(this);
		}
	}

	public final Event_declContext event_decl() throws RecognitionException {
		Event_declContext _localctx = new Event_declContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_event_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			event_header();
			setState(1398);
			match(LEFT_BRACE);
			setState(1402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COLON) | (1L << AT) | (1L << KW_STRING) | (1L << KW_TYPEDEF) | (1L << KW_OCTET) | (1L << KW_STRUCT) | (1L << KW_NATIVE) | (1L << KW_READONLY) | (1L << KW_VOID) | (1L << KW_PRIVATE) | (1L << KW_WCHAR) | (1L << KW_PUBLIC) | (1L << KW_SHORT) | (1L << KW_LONG) | (1L << KW_ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_WSTRING - 64)) | (1L << (KW_FACTORY - 64)) | (1L << (KW_EXCEPTION - 64)) | (1L << (KW_CONST - 64)) | (1L << (KW_VALUEBASE - 64)) | (1L << (KW_OBJECT - 64)) | (1L << (KW_UNSIGNED - 64)) | (1L << (KW_UNION - 64)) | (1L << (KW_ONEWAY - 64)) | (1L << (KW_ANY - 64)) | (1L << (KW_CHAR - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_TYPEPREFIX - 64)) | (1L << (KW_TYPEID - 64)) | (1L << (KW_ATTRIBUTE - 64)) | (1L << (KW_BITSET - 64)) | (1L << (KW_BITMASK - 64)) | (1L << (KW_INT8 - 64)) | (1L << (KW_UINT8 - 64)) | (1L << (KW_INT16 - 64)) | (1L << (KW_UINT16 - 64)) | (1L << (KW_INT32 - 64)) | (1L << (KW_UINT32 - 64)) | (1L << (KW_INT64 - 64)) | (1L << (KW_UINT64 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(1399);
				value_element();
				}
				}
				setState(1404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1405);
			match(RIGHT_BRACE);
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

	public static class Event_headerContext extends ParserRuleContext {
		public TerminalNode KW_EVENTTYPE() { return getToken(IDLParser.KW_EVENTTYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Value_inheritance_specContext value_inheritance_spec() {
			return getRuleContext(Value_inheritance_specContext.class,0);
		}
		public TerminalNode KW_CUSTOM() { return getToken(IDLParser.KW_CUSTOM, 0); }
		public Event_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterEvent_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitEvent_header(this);
		}
	}

	public final Event_headerContext event_header() throws RecognitionException {
		Event_headerContext _localctx = new Event_headerContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_event_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CUSTOM) {
				{
				setState(1407);
				match(KW_CUSTOM);
				}
			}

			setState(1410);
			match(KW_EVENTTYPE);
			setState(1411);
			identifier();
			setState(1412);
			value_inheritance_spec();
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

	public static class AnnappsContext extends ParserRuleContext {
		public List<Annotation_applContext> annotation_appl() {
			return getRuleContexts(Annotation_applContext.class);
		}
		public Annotation_applContext annotation_appl(int i) {
			return getRuleContext(Annotation_applContext.class,i);
		}
		public AnnappsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annapps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterAnnapps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitAnnapps(this);
		}
	}

	public final AnnappsContext annapps() throws RecognitionException {
		AnnappsContext _localctx = new AnnappsContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_annapps);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1414);
					annotation_appl();
					}
					} 
				}
				setState(1419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
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

	public static class Annotation_applContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(IDLParser.AT, 0); }
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(IDLParser.LEFT_BRACKET, 0); }
		public Annotation_appl_paramsContext annotation_appl_params() {
			return getRuleContext(Annotation_appl_paramsContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(IDLParser.RIGHT_BRACKET, 0); }
		public Annotation_applContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_appl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterAnnotation_appl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitAnnotation_appl(this);
		}
	}

	public final Annotation_applContext annotation_appl() throws RecognitionException {
		Annotation_applContext _localctx = new Annotation_applContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_annotation_appl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			match(AT);
			setState(1421);
			scoped_name();
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET) {
				{
				setState(1422);
				match(LEFT_BRACKET);
				setState(1423);
				annotation_appl_params();
				setState(1424);
				match(RIGHT_BRACKET);
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

	public static class Annotation_appl_paramsContext extends ParserRuleContext {
		public Const_expContext const_exp() {
			return getRuleContext(Const_expContext.class,0);
		}
		public List<Annotation_appl_paramContext> annotation_appl_param() {
			return getRuleContexts(Annotation_appl_paramContext.class);
		}
		public Annotation_appl_paramContext annotation_appl_param(int i) {
			return getRuleContext(Annotation_appl_paramContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IDLParser.COMMA, i);
		}
		public Annotation_appl_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_appl_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterAnnotation_appl_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitAnnotation_appl_params(this);
		}
	}

	public final Annotation_appl_paramsContext annotation_appl_params() throws RecognitionException {
		Annotation_appl_paramsContext _localctx = new Annotation_appl_paramsContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_annotation_appl_params);
		int _la;
		try {
			setState(1437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1428);
				const_exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1429);
				annotation_appl_param();
				setState(1434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1430);
					match(COMMA);
					setState(1431);
					annotation_appl_param();
					}
					}
					setState(1436);
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

	public static class Annotation_appl_paramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(IDLParser.EQUAL, 0); }
		public Const_expContext const_exp() {
			return getRuleContext(Const_expContext.class,0);
		}
		public Annotation_appl_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_appl_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterAnnotation_appl_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitAnnotation_appl_param(this);
		}
	}

	public final Annotation_appl_paramContext annotation_appl_param() throws RecognitionException {
		Annotation_appl_paramContext _localctx = new Annotation_appl_paramContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_annotation_appl_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			match(ID);
			setState(1440);
			match(EQUAL);
			setState(1441);
			const_exp();
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

	public static class IdentifierContext extends ParserRuleContext {
		public AnnappsContext annapps() {
			return getRuleContext(AnnappsContext.class,0);
		}
		public TerminalNode ID() { return getToken(IDLParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IDLListener ) ((IDLListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			annapps();
			setState(1444);
			match(ID);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3v\u05a9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\3\2\7\2\u0146\n\2\f\2\16\2\u0149"+
		"\13\2\3\2\6\2\u014c\n\2\r\2\16\2\u014d\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0175\n\3\3\4\3\4\3"+
		"\4\3\4\6\4\u017b\n\4\r\4\16\4\u017c\3\4\3\4\3\5\3\5\3\5\5\5\u0184\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\5\7\u018c\n\7\3\7\3\7\3\7\3\b\5\b\u0192\n\b\3"+
		"\b\3\b\3\b\5\b\u0197\n\b\3\t\7\t\u019a\n\t\f\t\16\t\u019d\13\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u01b5\n\n\3\13\3\13\3\13\3\13\7\13\u01bb\n\13\f\13\16\13"+
		"\u01be\13\13\3\f\3\f\3\r\3\r\3\r\3\16\5\16\u01c6\n\16\3\16\3\16\3\16\7"+
		"\16\u01cb\n\16\f\16\16\16\u01ce\13\16\3\17\3\17\3\17\3\17\3\17\5\17\u01d5"+
		"\n\17\3\20\5\20\u01d8\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u01e7\n\22\f\22\16\22\u01ea\13\22\3\22\3\22"+
		"\3\23\3\23\3\23\7\23\u01f1\n\23\f\23\16\23\u01f4\13\23\3\23\3\23\3\24"+
		"\5\24\u01f9\n\24\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u0201\n\25\3\25\3"+
		"\25\3\25\7\25\u0206\n\25\f\25\16\25\u0209\13\25\5\25\u020b\n\25\3\25\3"+
		"\25\3\25\3\25\7\25\u0211\n\25\f\25\16\25\u0214\13\25\5\25\u0216\n\25\3"+
		"\26\3\26\3\27\3\27\3\27\5\27\u021d\n\27\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0224\n\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u022f\n"+
		"\31\3\31\3\31\5\31\u0233\n\31\3\31\3\31\3\32\3\32\3\32\7\32\u023a\n\32"+
		"\f\32\16\32\u023d\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u0259\n\36\3\37\3\37\3 \3 \3 \7 \u0260\n \f \16 \u0263"+
		"\13 \3!\3!\3!\7!\u0268\n!\f!\16!\u026b\13!\3\"\3\"\3\"\7\"\u0270\n\"\f"+
		"\"\16\"\u0273\13\"\3#\3#\3#\7#\u0278\n#\f#\16#\u027b\13#\3$\3$\3$\7$\u0280"+
		"\n$\f$\16$\u0283\13$\3%\3%\3%\7%\u0288\n%\f%\16%\u028b\13%\3&\3&\3&\3"+
		"&\5&\u0291\n&\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u029b\n(\3)\3)\3*\3*\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u02af\n+\3,\3,\3,\3-\3-\5-\u02b6"+
		"\n-\3.\3.\3.\5.\u02bb\n.\3/\3/\3/\5/\u02c0\n/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\5\60\u02cb\n\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61"+
		"\u02d3\n\61\3\62\3\62\3\62\3\62\3\62\5\62\u02da\n\62\3\63\3\63\3\63\7"+
		"\63\u02df\n\63\f\63\16\63\u02e2\13\63\3\64\3\64\3\64\7\64\u02e7\n\64\f"+
		"\64\16\64\u02ea\13\64\3\65\3\65\3\65\5\65\u02ef\n\65\3\66\3\66\3\67\3"+
		"\67\38\38\38\38\58\u02f9\n8\39\39\59\u02fd\n9\3:\3:\3:\3:\5:\u0303\n:"+
		"\3;\3;\3<\3<\3=\3=\3>\3>\3>\5>\u030e\n>\3?\3?\3?\3?\5?\u0314\n?\3@\3@"+
		"\3A\3A\3A\5A\u031b\nA\3B\3B\3B\5B\u0320\nB\3C\3C\3C\3C\5C\u0326\nC\3D"+
		"\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\5J\u0336\nJ\3K\3K\3K\3K\3K\3L"+
		"\3L\3L\5L\u0340\nL\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\7N\u0350"+
		"\nN\fN\16N\u0353\13N\3O\3O\3O\3O\5O\u0359\nO\3O\3O\3P\3P\3P\3Q\3Q\3Q\3"+
		"Q\5Q\u0364\nQ\3Q\3Q\3Q\3Q\3R\3R\5R\u036c\nR\3R\3R\6R\u0370\nR\rR\16R\u0371"+
		"\3S\3S\3S\3S\3S\3S\5S\u037a\nS\3S\3S\3T\3T\3T\3T\3T\3T\3U\3U\3U\7U\u0387"+
		"\nU\fU\16U\u038a\13U\3V\3V\3V\3V\5V\u0390\nV\3V\3V\3V\3V\3W\7W\u0397\n"+
		"W\fW\16W\u039a\13W\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u03b3\nZ\3[\6[\u03b6\n[\r[\16[\u03b7\3\\\6\\\u03bb"+
		"\n\\\r\\\16\\\u03bc\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\5]\u03c9\n]\3^\3"+
		"^\3^\3^\3_\3_\3_\3_\3_\3_\7_\u03d5\n_\f_\16_\u03d8\13_\3_\3_\3`\3`\3a"+
		"\3a\3a\3a\3a\3a\5a\u03e4\na\3a\3a\3b\3b\3b\3b\3b\5b\u03ed\nb\3b\3b\3c"+
		"\3c\3c\3c\3c\3c\3c\5c\u03f8\nc\3c\3c\3d\3d\3d\3d\3d\5d\u0401\nd\3e\3e"+
		"\3e\3e\3e\5e\u0408\ne\3f\3f\6f\u040c\nf\rf\16f\u040d\3g\3g\3g\3g\3h\3"+
		"h\5h\u0416\nh\3i\3i\3i\3i\7i\u041c\ni\fi\16i\u041f\13i\3i\3i\3j\5j\u0424"+
		"\nj\3j\3j\3j\3j\5j\u042a\nj\3j\5j\u042d\nj\3k\3k\3l\3l\3l\5l\u0434\nl"+
		"\3m\3m\3m\3m\7m\u043a\nm\fm\16m\u043d\13m\5m\u043f\nm\3m\3m\3n\3n\3n\3"+
		"n\3n\3n\3n\3o\3o\3p\3p\3p\3p\3p\7p\u0451\np\fp\16p\u0454\13p\3p\3p\3q"+
		"\3q\3q\3q\3q\7q\u045d\nq\fq\16q\u0460\13q\3q\3q\3r\3r\3r\3r\5r\u0468\n"+
		"r\3s\3s\3s\3s\3s\3s\3s\3t\3t\3u\3u\3v\3v\3v\3v\5v\u0479\nv\3w\3w\3w\3"+
		"w\3w\3w\3x\3x\5x\u0483\nx\3y\3y\3y\3y\3z\3z\3z\3z\3{\3{\3{\3{\3{\3{\3"+
		"|\3|\3|\3|\3|\3|\3|\7|\u049a\n|\f|\16|\u049d\13|\5|\u049f\n|\3}\3}\3}"+
		"\3}\3}\3~\3~\3~\3~\3~\3~\3~\7~\u04ad\n~\f~\16~\u04b0\13~\5~\u04b2\n~\3"+
		"\177\3\177\5\177\u04b6\n\177\3\177\5\177\u04b9\n\177\3\u0080\3\u0080\3"+
		"\u0080\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\7\u0082"+
		"\u04c5\n\u0082\f\u0082\16\u0082\u04c8\13\u0082\3\u0082\3\u0082\3\u0083"+
		"\3\u0083\5\u0083\u04ce\n\u0083\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\5\u0086\u04db\n\u0086"+
		"\3\u0086\5\u0086\u04de\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087\7\u0087"+
		"\u04e4\n\u0087\f\u0087\16\u0087\u04e7\13\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0089\7\u0089\u04ed\n\u0089\f\u0089\16\u0089\u04f0\13\u0089\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\5\u008a\u0505\n\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c"+
		"\3\u008c\5\u008c\u050e\n\u008c\3\u008d\3\u008d\5\u008d\u0512\n\u008d\3"+
		"\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091"+
		"\3\u0092\3\u0092\3\u0092\5\u0092\u0529\n\u0092\3\u0092\5\u0092\u052c\n"+
		"\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u0531\n\u0092\3\u0093\3\u0093\3"+
		"\u0093\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\7\u0095\u053b\n\u0095\f"+
		"\u0095\16\u0095\u053e\13\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\5\u0096\u0546\n\u0096\3\u0096\3\u0096\5\u0096\u054a\n\u0096\3"+
		"\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u0550\n\u0097\3\u0097\3\u0097\5"+
		"\u0097\u0554\n\u0097\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u055a\n\u0098"+
		"\3\u0098\3\u0098\5\u0098\u055e\n\u0098\3\u0099\3\u0099\3\u0099\5\u0099"+
		"\u0563\n\u0099\3\u009a\5\u009a\u0566\n\u009a\3\u009a\3\u009a\3\u009a\3"+
		"\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\7\u009b\u0571\n\u009b\f"+
		"\u009b\16\u009b\u0574\13\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c"+
		"\7\u009c\u057b\n\u009c\f\u009c\16\u009c\u057e\13\u009c\3\u009c\3\u009c"+
		"\3\u009d\5\u009d\u0583\n\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009e"+
		"\7\u009e\u058a\n\u009e\f\u009e\16\u009e\u058d\13\u009e\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0595\n\u009f\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\7\u00a0\u059b\n\u00a0\f\u00a0\16\u00a0\u059e\13\u00a0"+
		"\5\u00a0\u05a0\n\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\2\2\u00a3\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\2\13"+
		"\4\2YYaa\3\2#$\3\2\33\34\5\2\27\27\32\32!!\4\2\26\26\33\34\3\2\3\f\4\2"+
		"??ll\4\2@@nn\5\2\'\'<<ZZ\2\u05c8\2\u0147\3\2\2\2\4\u014f\3\2\2\2\6\u0176"+
		"\3\2\2\2\b\u0180\3\2\2\2\n\u0185\3\2\2\2\f\u018b\3\2\2\2\16\u0191\3\2"+
		"\2\2\20\u019b\3\2\2\2\22\u019e\3\2\2\2\24\u01b6\3\2\2\2\26\u01bf\3\2\2"+
		"\2\30\u01c1\3\2\2\2\32\u01c5\3\2\2\2\34\u01cf\3\2\2\2\36\u01d7\3\2\2\2"+
		" \u01dc\3\2\2\2\"\u01e0\3\2\2\2$\u01ed\3\2\2\2&\u01f8\3\2\2\2(\u020a\3"+
		"\2\2\2*\u0217\3\2\2\2,\u021c\3\2\2\2.\u021e\3\2\2\2\60\u0229\3\2\2\2\62"+
		"\u0236\3\2\2\2\64\u023e\3\2\2\2\66\u0245\3\2\2\28\u0247\3\2\2\2:\u024d"+
		"\3\2\2\2<\u025a\3\2\2\2>\u025c\3\2\2\2@\u0264\3\2\2\2B\u026c\3\2\2\2D"+
		"\u0274\3\2\2\2F\u027c\3\2\2\2H\u0284\3\2\2\2J\u0290\3\2\2\2L\u0292\3\2"+
		"\2\2N\u029a\3\2\2\2P\u029c\3\2\2\2R\u029e\3\2\2\2T\u02ae\3\2\2\2V\u02b0"+
		"\3\2\2\2X\u02b5\3\2\2\2Z\u02ba\3\2\2\2\\\u02bf\3\2\2\2^\u02ca\3\2\2\2"+
		"`\u02d2\3\2\2\2b\u02d9\3\2\2\2d\u02db\3\2\2\2f\u02e3\3\2\2\2h\u02eb\3"+
		"\2\2\2j\u02f0\3\2\2\2l\u02f2\3\2\2\2n\u02f8\3\2\2\2p\u02fc\3\2\2\2r\u0302"+
		"\3\2\2\2t\u0304\3\2\2\2v\u0306\3\2\2\2x\u0308\3\2\2\2z\u030d\3\2\2\2|"+
		"\u0313\3\2\2\2~\u0315\3\2\2\2\u0080\u031a\3\2\2\2\u0082\u031f\3\2\2\2"+
		"\u0084\u0325\3\2\2\2\u0086\u0327\3\2\2\2\u0088\u0329\3\2\2\2\u008a\u032b"+
		"\3\2\2\2\u008c\u032d\3\2\2\2\u008e\u032f\3\2\2\2\u0090\u0331\3\2\2\2\u0092"+
		"\u0335\3\2\2\2\u0094\u0337\3\2\2\2\u0096\u033c\3\2\2\2\u0098\u0341\3\2"+
		"\2\2\u009a\u0351\3\2\2\2\u009c\u0354\3\2\2\2\u009e\u035c\3\2\2\2\u00a0"+
		"\u035f\3\2\2\2\u00a2\u036f\3\2\2\2\u00a4\u0373\3\2\2\2\u00a6\u037d\3\2"+
		"\2\2\u00a8\u0383\3\2\2\2\u00aa\u038b\3\2\2\2\u00ac\u0398\3\2\2\2\u00ae"+
		"\u039b\3\2\2\2\u00b0\u03a0\3\2\2\2\u00b2\u03b2\3\2\2\2\u00b4\u03b5\3\2"+
		"\2\2\u00b6\u03ba\3\2\2\2\u00b8\u03c1\3\2\2\2\u00ba\u03ca\3\2\2\2\u00bc"+
		"\u03ce\3\2\2\2\u00be\u03db\3\2\2\2\u00c0\u03dd\3\2\2\2\u00c2\u03e7\3\2"+
		"\2\2\u00c4\u03f0\3\2\2\2\u00c6\u03fb\3\2\2\2\u00c8\u0402\3\2\2\2\u00ca"+
		"\u0409\3\2\2\2\u00cc\u040f\3\2\2\2\u00ce\u0415\3\2\2\2\u00d0\u0417\3\2"+
		"\2\2\u00d2\u0423\3\2\2\2\u00d4\u042e\3\2\2\2\u00d6\u0430\3\2\2\2\u00d8"+
		"\u0435\3\2\2\2\u00da\u0442\3\2\2\2\u00dc\u0449\3\2\2\2\u00de\u044b\3\2"+
		"\2\2\u00e0\u0457\3\2\2\2\u00e2\u0467\3\2\2\2\u00e4\u0469\3\2\2\2\u00e6"+
		"\u0470\3\2\2\2\u00e8\u0472\3\2\2\2\u00ea\u0478\3\2\2\2\u00ec\u047a\3\2"+
		"\2\2\u00ee\u0482\3\2\2\2\u00f0\u0484\3\2\2\2\u00f2\u0488\3\2\2\2\u00f4"+
		"\u048c\3\2\2\2\u00f6\u0492\3\2\2\2\u00f8\u04a0\3\2\2\2\u00fa\u04a5\3\2"+
		"\2\2\u00fc\u04b8\3\2\2\2\u00fe\u04ba\3\2\2\2\u0100\u04bd\3\2\2\2\u0102"+
		"\u04c0\3\2\2\2\u0104\u04cd\3\2\2\2\u0106\u04cf\3\2\2\2\u0108\u04d2\3\2"+
		"\2\2\u010a\u04d7\3\2\2\2\u010c\u04df\3\2\2\2\u010e\u04e8\3\2\2\2\u0110"+
		"\u04ee\3\2\2\2\u0112\u04f1\3\2\2\2\u0114\u0506\3\2\2\2\u0116\u050a\3\2"+
		"\2\2\u0118\u050f\3\2\2\2\u011a\u0516\3\2\2\2\u011c\u051a\3\2\2\2\u011e"+
		"\u051e\3\2\2\2\u0120\u0522\3\2\2\2\u0122\u0525\3\2\2\2\u0124\u0532\3\2"+
		"\2\2\u0126\u0535\3\2\2\2\u0128\u0538\3\2\2\2\u012a\u0549\3\2\2\2\u012c"+
		"\u054b\3\2\2\2\u012e\u0555\3\2\2\2\u0130\u0562\3\2\2\2\u0132\u0565\3\2"+
		"\2\2\u0134\u056a\3\2\2\2\u0136\u0577\3\2\2\2\u0138\u0582\3\2\2\2\u013a"+
		"\u058b\3\2\2\2\u013c\u058e\3\2\2\2\u013e\u059f\3\2\2\2\u0140\u05a1\3\2"+
		"\2\2\u0142\u05a5\3\2\2\2\u0144\u0146\5\u00ecw\2\u0145\u0144\3\2\2\2\u0146"+
		"\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u014a\u014c\5\4\3\2\u014b\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\3\3\2\2\2"+
		"\u014f\u0174\5\u013a\u009e\2\u0150\u0151\5T+\2\u0151\u0152\7\r\2\2\u0152"+
		"\u0175\3\2\2\2\u0153\u0154\58\35\2\u0154\u0155\7\r\2\2\u0155\u0175\3\2"+
		"\2\2\u0156\u0157\5\u00d0i\2\u0157\u0158\7\r\2\2\u0158\u0175\3\2\2\2\u0159"+
		"\u015a\5\b\5\2\u015a\u015b\7\r\2\2\u015b\u0175\3\2\2\2\u015c\u015d\5\6"+
		"\4\2\u015d\u015e\7\r\2\2\u015e\u0175\3\2\2\2\u015f\u0160\5\34\17\2\u0160"+
		"\u0161\7\r\2\2\u0161\u0175\3\2\2\2\u0162\u0163\5\u00f0y\2\u0163\u0164"+
		"\7\r\2\2\u0164\u0175\3\2\2\2\u0165\u0166\5\u00f2z\2\u0166\u0167\7\r\2"+
		"\2\u0167\u0175\3\2\2\2\u0168\u0169\5\u0130\u0099\2\u0169\u016a\7\r\2\2"+
		"\u016a\u0175\3\2\2\2\u016b\u016c\5\u0104\u0083\2\u016c\u016d\7\r\2\2\u016d"+
		"\u0175\3\2\2\2\u016e\u016f\5\u0120\u0091\2\u016f\u0170\7\r\2\2\u0170\u0175"+
		"\3\2\2\2\u0171\u0172\5\u0092J\2\u0172\u0173\7\r\2\2\u0173\u0175\3\2\2"+
		"\2\u0174\u0150\3\2\2\2\u0174\u0153\3\2\2\2\u0174\u0156\3\2\2\2\u0174\u0159"+
		"\3\2\2\2\u0174\u015c\3\2\2\2\u0174\u015f\3\2\2\2\u0174\u0162\3\2\2\2\u0174"+
		"\u0165\3\2\2\2\u0174\u0168\3\2\2\2\u0174\u016b\3\2\2\2\u0174\u016e\3\2"+
		"\2\2\u0174\u0171\3\2\2\2\u0175\5\3\2\2\2\u0176\u0177\7L\2\2\u0177\u0178"+
		"\5\u0142\u00a2\2\u0178\u017a\7\20\2\2\u0179\u017b\5\4\3\2\u017a\u0179"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u017f\7\21\2\2\u017f\7\3\2\2\2\u0180\u0183\5\u013a"+
		"\u009e\2\u0181\u0184\5\n\6\2\u0182\u0184\5\f\7\2\u0183\u0181\3\2\2\2\u0183"+
		"\u0182\3\2\2\2\u0184\t\3\2\2\2\u0185\u0186\5\16\b\2\u0186\u0187\7\20\2"+
		"\2\u0187\u0188\5\20\t\2\u0188\u0189\7\21\2\2\u0189\13\3\2\2\2\u018a\u018c"+
		"\t\2\2\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018e\7c\2\2\u018e\u018f\5\u0142\u00a2\2\u018f\r\3\2\2\2\u0190\u0192"+
		"\t\2\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0194\7c\2\2\u0194\u0196\5\u0142\u00a2\2\u0195\u0197\5\24\13\2\u0196"+
		"\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\17\3\2\2\2\u0198\u019a\5\22\n"+
		"\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c"+
		"\3\2\2\2\u019c\21\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01b4\5\u013a\u009e"+
		"\2\u019f\u01a0\5T+\2\u01a0\u01a1\7\r\2\2\u01a1\u01b5\3\2\2\2\u01a2\u01a3"+
		"\58\35\2\u01a3\u01a4\7\r\2\2\u01a4\u01b5\3\2\2\2\u01a5\u01a6\5\u00d0i"+
		"\2\u01a6\u01a7\7\r\2\2\u01a7\u01b5\3\2\2\2\u01a8\u01a9\5\u00ceh\2\u01a9"+
		"\u01aa\7\r\2\2\u01aa\u01b5\3\2\2\2\u01ab\u01ac\5\u00d2j\2\u01ac\u01ad"+
		"\7\r\2\2\u01ad\u01b5\3\2\2\2\u01ae\u01af\5\u00f0y\2\u01af\u01b0\7\r\2"+
		"\2\u01b0\u01b5\3\2\2\2\u01b1\u01b2\5\u00f2z\2\u01b2\u01b3\7\r\2\2\u01b3"+
		"\u01b5\3\2\2\2\u01b4\u019f\3\2\2\2\u01b4\u01a2\3\2\2\2\u01b4\u01a5\3\2"+
		"\2\2\u01b4\u01a8\3\2\2\2\u01b4\u01ab\3\2\2\2\u01b4\u01ae\3\2\2\2\u01b4"+
		"\u01b1\3\2\2\2\u01b5\23\3\2\2\2\u01b6\u01b7\7\16\2\2\u01b7\u01bc\5\26"+
		"\f\2\u01b8\u01b9\7\17\2\2\u01b9\u01bb\5\26\f\2\u01ba\u01b8\3\2\2\2\u01bb"+
		"\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\25\3\2\2"+
		"\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\5\30\r\2\u01c0\27\3\2\2\2\u01c1\u01c2"+
		"\5\u013a\u009e\2\u01c2\u01c3\5\32\16\2\u01c3\31\3\2\2\2\u01c4\u01c6\7"+
		"\"\2\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01cc\7s\2\2\u01c8\u01c9\7\"\2\2\u01c9\u01cb\7s\2\2\u01ca\u01c8\3\2\2"+
		"\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\33"+
		"\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d4\5\u013a\u009e\2\u01d0\u01d5\5"+
		"$\23\2\u01d1\u01d5\5\"\22\2\u01d2\u01d5\5 \21\2\u01d3\u01d5\5\36\20\2"+
		"\u01d4\u01d0\3\2\2\2\u01d4\u01d1\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d3"+
		"\3\2\2\2\u01d5\35\3\2\2\2\u01d6\u01d8\7Y\2\2\u01d7\u01d6\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\7J\2\2\u01da\u01db\5\u0142"+
		"\u00a2\2\u01db\37\3\2\2\2\u01dc\u01dd\7J\2\2\u01dd\u01de\5\u0142\u00a2"+
		"\2\u01de\u01df\5X-\2\u01df!\3\2\2\2\u01e0\u01e1\7Y\2\2\u01e1\u01e2\7J"+
		"\2\2\u01e2\u01e3\5\u0142\u00a2\2\u01e3\u01e4\5(\25\2\u01e4\u01e8\7\20"+
		"\2\2\u01e5\u01e7\5\22\n\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8"+
		"\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e8\3\2"+
		"\2\2\u01eb\u01ec\7\21\2\2\u01ec#\3\2\2\2\u01ed\u01ee\5&\24\2\u01ee\u01f2"+
		"\7\20\2\2\u01ef\u01f1\5,\27\2\u01f0\u01ef\3\2\2\2\u01f1\u01f4\3\2\2\2"+
		"\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f2"+
		"\3\2\2\2\u01f5\u01f6\7\21\2\2\u01f6%\3\2\2\2\u01f7\u01f9\7/\2\2\u01f8"+
		"\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\7J"+
		"\2\2\u01fb\u01fc\5\u0142\u00a2\2\u01fc\u01fd\5(\25\2\u01fd\'\3\2\2\2\u01fe"+
		"\u0200\7\16\2\2\u01ff\u0201\7N\2\2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2"+
		"\2\2\u0201\u0202\3\2\2\2\u0202\u0207\5*\26\2\u0203\u0204\7\17\2\2\u0204"+
		"\u0206\5*\26\2\u0205\u0203\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2"+
		"\2\2\u0207\u0208\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u020a"+
		"\u01fe\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0215\3\2\2\2\u020c\u020d\7K"+
		"\2\2\u020d\u0212\5\26\f\2\u020e\u020f\7\17\2\2\u020f\u0211\5\26\f\2\u0210"+
		"\u020e\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u020c\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216)\3\2\2\2\u0217\u0218\5\30\r\2\u0218+\3\2\2\2\u0219"+
		"\u021d\5\22\n\2\u021a\u021d\5.\30\2\u021b\u021d\5\60\31\2\u021c\u0219"+
		"\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021d-\3\2\2\2\u021e"+
		"\u0223\5\u013a\u009e\2\u021f\u0220\7>\2\2\u0220\u0224\5\u013a\u009e\2"+
		"\u0221\u0222\79\2\2\u0222\u0224\5\u013a\u009e\2\u0223\u021f\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\5X-\2\u0226\u0227\5f\64"+
		"\2\u0227\u0228\7\r\2\2\u0228/\3\2\2\2\u0229\u022a\5\u013a\u009e\2\u022a"+
		"\u022b\7E\2\2\u022b\u022c\5\u0142\u00a2\2\u022c\u022e\7\22\2\2\u022d\u022f"+
		"\5\62\32\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2"+
		"\u0230\u0232\7\23\2\2\u0231\u0233\5\u00dep\2\u0232\u0231\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\7\r\2\2\u0235\61\3\2\2"+
		"\2\u0236\u023b\5\64\33\2\u0237\u0238\7\17\2\2\u0238\u023a\5\64\33\2\u0239"+
		"\u0237\3\2\2\2\u023a\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2"+
		"\2\2\u023c\63\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u023f\5\u013a\u009e\2"+
		"\u023f\u0240\5\66\34\2\u0240\u0241\5\u013a\u009e\2\u0241\u0242\5\u00e2"+
		"r\2\u0242\u0243\5\u013a\u009e\2\u0243\u0244\5j\66\2\u0244\65\3\2\2\2\u0245"+
		"\u0246\7<\2\2\u0246\67\3\2\2\2\u0247\u0248\7H\2\2\u0248\u0249\5:\36\2"+
		"\u0249\u024a\5\u0142\u00a2\2\u024a\u024b\7 \2\2\u024b\u024c\5<\37\2\u024c"+
		"9\3\2\2\2\u024d\u0258\5\u013a\u009e\2\u024e\u0259\5p9\2\u024f\u0259\5"+
		"\u0086D\2\u0250\u0259\5\u0088E\2\u0251\u0259\5\u008aF\2\u0252\u0259\5"+
		"n8\2\u0253\u0259\5\u00c6d\2\u0254\u0259\5\u00c8e\2\u0255\u0259\5\u00e6"+
		"t\2\u0256\u0259\5\32\16\2\u0257\u0259\5\u008cG\2\u0258\u024e\3\2\2\2\u0258"+
		"\u024f\3\2\2\2\u0258\u0250\3\2\2\2\u0258\u0251\3\2\2\2\u0258\u0252\3\2"+
		"\2\2\u0258\u0253\3\2\2\2\u0258\u0254\3\2\2\2\u0258\u0255\3\2\2\2\u0258"+
		"\u0256\3\2\2\2\u0258\u0257\3\2\2\2\u0259;\3\2\2\2\u025a\u025b\5> \2\u025b"+
		"=\3\2\2\2\u025c\u0261\5@!\2\u025d\u025e\7\37\2\2\u025e\u0260\5@!\2\u025f"+
		"\u025d\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2"+
		"\2\2\u0262?\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0269\5B\"\2\u0265\u0266"+
		"\7\35\2\2\u0266\u0268\5B\"\2\u0267\u0265\3\2\2\2\u0268\u026b\3\2\2\2\u0269"+
		"\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026aA\3\2\2\2\u026b\u0269\3\2\2\2"+
		"\u026c\u0271\5D#\2\u026d\u026e\7\36\2\2\u026e\u0270\5D#\2\u026f\u026d"+
		"\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272"+
		"C\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0279\5F$\2\u0275\u0276\t\3\2\2\u0276"+
		"\u0278\5F$\2\u0277\u0275\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2"+
		"\2\u0279\u027a\3\2\2\2\u027aE\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u0281"+
		"\5H%\2\u027d\u027e\t\4\2\2\u027e\u0280\5H%\2\u027f\u027d\3\2\2\2\u0280"+
		"\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282G\3\2\2\2"+
		"\u0283\u0281\3\2\2\2\u0284\u0289\5J&\2\u0285\u0286\t\5\2\2\u0286\u0288"+
		"\5J&\2\u0287\u0285\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u0289"+
		"\u028a\3\2\2\2\u028aI\3\2\2\2\u028b\u0289\3\2\2\2\u028c\u028d\5L\'\2\u028d"+
		"\u028e\5N(\2\u028e\u0291\3\2\2\2\u028f\u0291\5N(\2\u0290\u028c\3\2\2\2"+
		"\u0290\u028f\3\2\2\2\u0291K\3\2\2\2\u0292\u0293\t\6\2\2\u0293M\3\2\2\2"+
		"\u0294\u029b\5\32\16\2\u0295\u029b\5P)\2\u0296\u0297\7\22\2\2\u0297\u0298"+
		"\5<\37\2\u0298\u0299\7\23\2\2\u0299\u029b\3\2\2\2\u029a\u0294\3\2\2\2"+
		"\u029a\u0295\3\2\2\2\u029a\u0296\3\2\2\2\u029bO\3\2\2\2\u029c\u029d\t"+
		"\7\2\2\u029dQ\3\2\2\2\u029e\u029f\5<\37\2\u029fS\3\2\2\2\u02a0\u02a1\7"+
		",\2\2\u02a1\u02a2\5\u013a\u009e\2\u02a2\u02a3\5V,\2\u02a3\u02af\3\2\2"+
		"\2\u02a4\u02af\5\u00aaV\2\u02a5\u02af\5\u00b0Y\2\u02a6\u02af\5\u00bc_"+
		"\2\u02a7\u02af\5\u00a0Q\2\u02a8\u02af\5\u00a6T\2\u02a9\u02aa\7\64\2\2"+
		"\u02aa\u02ab\5\u013a\u009e\2\u02ab\u02ac\5j\66\2\u02ac\u02af\3\2\2\2\u02ad"+
		"\u02af\5\u00eav\2\u02ae\u02a0\3\2\2\2\u02ae\u02a4\3\2\2\2\u02ae\u02a5"+
		"\3\2\2\2\u02ae\u02a6\3\2\2\2\u02ae\u02a7\3\2\2\2\u02ae\u02a8\3\2\2\2\u02ae"+
		"\u02a9\3\2\2\2\u02ae\u02ad\3\2\2\2\u02afU\3\2\2\2\u02b0\u02b1\5X-\2\u02b1"+
		"\u02b2\5f\64\2\u02b2W\3\2\2\2\u02b3\u02b6\5Z.\2\u02b4\u02b6\5b\62\2\u02b5"+
		"\u02b3\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b6Y\3\2\2\2\u02b7\u02bb\5^\60\2"+
		"\u02b8\u02bb\5`\61\2\u02b9\u02bb\5\32\16\2\u02ba\u02b7\3\2\2\2\u02ba\u02b8"+
		"\3\2\2\2\u02ba\u02b9\3\2\2\2\u02bb[\3\2\2\2\u02bc\u02c0\5p9\2\u02bd\u02c0"+
		"\5\u008aF\2\u02be\u02c0\5\u008cG\2\u02bf\u02bc\3\2\2\2\u02bf\u02bd\3\2"+
		"\2\2\u02bf\u02be\3\2\2\2\u02c0]\3\2\2\2\u02c1\u02cb\5n8\2\u02c2\u02cb"+
		"\5p9\2\u02c3\u02cb\5\u0086D\2\u02c4\u02cb\5\u0088E\2\u02c5\u02cb\5\u008a"+
		"F\2\u02c6\u02cb\5\u008cG\2\u02c7\u02cb\5\u008eH\2\u02c8\u02cb\5\u0090"+
		"I\2\u02c9\u02cb\5\u00e8u\2\u02ca\u02c1\3\2\2\2\u02ca\u02c2\3\2\2\2\u02ca"+
		"\u02c3\3\2\2\2\u02ca\u02c4\3\2\2\2\u02ca\u02c5\3\2\2\2\u02ca\u02c6\3\2"+
		"\2\2\u02ca\u02c7\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02c9\3\2\2\2\u02cb"+
		"_\3\2\2\2\u02cc\u02d3\5\u00c0a\2\u02cd\u02d3\5\u00c2b\2\u02ce\u02d3\5"+
		"\u00c4c\2\u02cf\u02d3\5\u00c6d\2\u02d0\u02d3\5\u00c8e\2\u02d1\u02d3\5"+
		"\u00e4s\2\u02d2\u02cc\3\2\2\2\u02d2\u02cd\3\2\2\2\u02d2\u02ce\3\2\2\2"+
		"\u02d2\u02cf\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3a\3"+
		"\2\2\2\u02d4\u02da\5\u00aaV\2\u02d5\u02da\5\u00b0Y\2\u02d6\u02da\5\u00bc"+
		"_\2\u02d7\u02da\5\u00a0Q\2\u02d8\u02da\5\u00a6T\2\u02d9\u02d4\3\2\2\2"+
		"\u02d9\u02d5\3\2\2\2\u02d9\u02d6\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02d8"+
		"\3\2\2\2\u02dac\3\2\2\2\u02db\u02e0\5\u0142\u00a2\2\u02dc\u02dd\7\17\2"+
		"\2\u02dd\u02df\5\u0142\u00a2\2\u02de\u02dc\3\2\2\2\u02df\u02e2\3\2\2\2"+
		"\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1e\3\2\2\2\u02e2\u02e0\3"+
		"\2\2\2\u02e3\u02e8\5h\65\2\u02e4\u02e5\7\17\2\2\u02e5\u02e7\5h\65\2\u02e6"+
		"\u02e4\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2"+
		"\2\2\u02e9g\3\2\2\2\u02ea\u02e8\3\2\2\2\u02eb\u02ee\5\u013a\u009e\2\u02ec"+
		"\u02ef\5j\66\2\u02ed\u02ef\5l\67\2\u02ee\u02ec\3\2\2\2\u02ee\u02ed\3\2"+
		"\2\2\u02efi\3\2\2\2\u02f0\u02f1\7s\2\2\u02f1k\3\2\2\2\u02f2\u02f3\5\u00ca"+
		"f\2\u02f3m\3\2\2\2\u02f4\u02f9\7V\2\2\u02f5\u02f9\7]\2\2\u02f6\u02f7\7"+
		"@\2\2\u02f7\u02f9\7]\2\2\u02f8\u02f4\3\2\2\2\u02f8\u02f5\3\2\2\2\u02f8"+
		"\u02f6\3\2\2\2\u02f9o\3\2\2\2\u02fa\u02fd\5r:\2\u02fb\u02fd\5|?\2\u02fc"+
		"\u02fa\3\2\2\2\u02fc\u02fb\3\2\2\2\u02fdq\3\2\2\2\u02fe\u0303\5v<\2\u02ff"+
		"\u0303\5x=\2\u0300\u0303\5z>\2\u0301\u0303\5t;\2\u0302\u02fe\3\2\2\2\u0302"+
		"\u02ff\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0301\3\2\2\2\u0303s\3\2\2\2"+
		"\u0304\u0305\7j\2\2\u0305u\3\2\2\2\u0306\u0307\t\b\2\2\u0307w\3\2\2\2"+
		"\u0308\u0309\t\t\2\2\u0309y\3\2\2\2\u030a\u030b\7@\2\2\u030b\u030e\7@"+
		"\2\2\u030c\u030e\7p\2\2\u030d\u030a\3\2\2\2\u030d\u030c\3\2\2\2\u030e"+
		"{\3\2\2\2\u030f\u0314\5\u0080A\2\u0310\u0314\5\u0082B\2\u0311\u0314\5"+
		"\u0084C\2\u0312\u0314\5~@\2\u0313\u030f\3\2\2\2\u0313\u0310\3\2\2\2\u0313"+
		"\u0311\3\2\2\2\u0313\u0312\3\2\2\2\u0314}\3\2\2\2\u0315\u0316\7k\2\2\u0316"+
		"\177\3\2\2\2\u0317\u0318\7O\2\2\u0318\u031b\7?\2\2\u0319\u031b\7m\2\2"+
		"\u031a\u0317\3\2\2\2\u031a\u0319\3\2\2\2\u031b\u0081\3\2\2\2\u031c\u031d"+
		"\7O\2\2\u031d\u0320\7@\2\2\u031e\u0320\7o\2\2\u031f\u031c\3\2\2\2\u031f"+
		"\u031e\3\2\2\2\u0320\u0083\3\2\2\2\u0321\u0322\7O\2\2\u0322\u0323\7@\2"+
		"\2\u0323\u0326\7@\2\2\u0324\u0326\7q\2\2\u0325\u0321\3\2\2\2\u0325\u0324"+
		"\3\2\2\2\u0326\u0085\3\2\2\2\u0327\u0328\7T\2\2\u0328\u0087\3\2\2\2\u0329"+
		"\u032a\7;\2\2\u032a\u0089\3\2\2\2\u032b\u032c\7W\2\2\u032c\u008b\3\2\2"+
		"\2\u032d\u032e\7\60\2\2\u032e\u008d\3\2\2\2\u032f\u0330\7S\2\2\u0330\u008f"+
		"\3\2\2\2\u0331\u0332\7M\2\2\u0332\u0091\3\2\2\2\u0333\u0336\5\u0094K\2"+
		"\u0334\u0336\5\u009eP\2\u0335\u0333\3\2\2\2\u0335\u0334\3\2\2\2\u0336"+
		"\u0093\3\2\2\2\u0337\u0338\5\u0096L\2\u0338\u0339\7\20\2\2\u0339\u033a"+
		"\5\u009aN\2\u033a\u033b\7\21\2\2\u033b\u0095\3\2\2\2\u033c\u033d\7r\2"+
		"\2\u033d\u033f\5\u0142\u00a2\2\u033e\u0340\5\u0098M\2\u033f\u033e\3\2"+
		"\2\2\u033f\u0340\3\2\2\2\u0340\u0097\3\2\2\2\u0341\u0342\7\16\2\2\u0342"+
		"\u0343\5\32\16\2\u0343\u0099\3\2\2\2\u0344\u0350\5\u009cO\2\u0345\u0346"+
		"\5\u00bc_\2\u0346\u0347\7\r\2\2\u0347\u0350\3\2\2\2\u0348\u0349\58\35"+
		"\2\u0349\u034a\7\r\2\2\u034a\u0350\3\2\2\2\u034b\u034c\7,\2\2\u034c\u034d"+
		"\5V,\2\u034d\u034e\7\r\2\2\u034e\u0350\3\2\2\2\u034f\u0344\3\2\2\2\u034f"+
		"\u0345\3\2\2\2\u034f\u0348\3\2\2\2\u034f\u034b\3\2\2\2\u0350\u0353\3\2"+
		"\2\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u009b\3\2\2\2\u0353"+
		"\u0351\3\2\2\2\u0354\u0355\5:\36\2\u0355\u0358\5j\66\2\u0356\u0357\7="+
		"\2\2\u0357\u0359\5<\37\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359"+
		"\u035a\3\2\2\2\u035a\u035b\7\r\2\2\u035b\u009d\3\2\2\2\u035c\u035d\7r"+
		"\2\2\u035d\u035e\5\32\16\2\u035e\u009f\3\2\2\2\u035f\u0360\7h\2\2\u0360"+
		"\u0363\5\u0142\u00a2\2\u0361\u0362\7\16\2\2\u0362\u0364\5\32\16\2\u0363"+
		"\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0366\7\20"+
		"\2\2\u0366\u0367\5\u00a2R\2\u0367\u0368\7\21\2\2\u0368\u00a1\3\2\2\2\u0369"+
		"\u036b\5\u00a4S\2\u036a\u036c\5d\63\2\u036b\u036a\3\2\2\2\u036b\u036c"+
		"\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\7\r\2\2\u036e\u0370\3\2\2\2\u036f"+
		"\u0369\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u036f\3\2\2\2\u0371\u0372\3\2"+
		"\2\2\u0372\u00a3\3\2\2\2\u0373\u0374\5\u013a\u009e\2\u0374\u0375\7g\2"+
		"\2\u0375\u0376\7\30\2\2\u0376\u0379\5R*\2\u0377\u0378\7\17\2\2\u0378\u037a"+
		"\5\\/\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
		"\u037c\7\31\2\2\u037c\u00a5\3\2\2\2\u037d\u037e\7i\2\2\u037e\u037f\5\u0142"+
		"\u00a2\2\u037f\u0380\7\20\2\2\u0380\u0381\5\u00a8U\2\u0381\u0382\7\21"+
		"\2\2\u0382\u00a7\3\2\2\2\u0383\u0388\5\u0142\u00a2\2\u0384\u0385\7\17"+
		"\2\2\u0385\u0387\5\u0142\u00a2\2\u0386\u0384\3\2\2\2\u0387\u038a\3\2\2"+
		"\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u00a9\3\2\2\2\u038a\u0388"+
		"\3\2\2\2\u038b\u038c\7\63\2\2\u038c\u038f\5\u0142\u00a2\2\u038d\u038e"+
		"\7\16\2\2\u038e\u0390\5\32\16\2\u038f\u038d\3\2\2\2\u038f\u0390\3\2\2"+
		"\2\u0390\u0391\3\2\2\2\u0391\u0392\7\20\2\2\u0392\u0393\5\u00acW\2\u0393"+
		"\u0394\7\21\2\2\u0394\u00ab\3\2\2\2\u0395\u0397\5\u00aeX\2\u0396\u0395"+
		"\3\2\2\2\u0397\u039a\3\2\2\2\u0398\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399"+
		"\u00ad\3\2\2\2\u039a\u0398\3\2\2\2\u039b\u039c\5\u013a\u009e\2\u039c\u039d"+
		"\5X-\2\u039d\u039e\5f\64\2\u039e\u039f\7\r\2\2\u039f\u00af\3\2\2\2\u03a0"+
		"\u03a1\7Q\2\2\u03a1\u03a2\5\u0142\u00a2\2\u03a2\u03a3\7*\2\2\u03a3\u03a4"+
		"\7\22\2\2\u03a4\u03a5\5\u013a\u009e\2\u03a5\u03a6\5\u00b2Z\2\u03a6\u03a7"+
		"\7\23\2\2\u03a7\u03a8\7\20\2\2\u03a8\u03a9\5\u00b4[\2\u03a9\u03aa\7\21"+
		"\2\2\u03aa\u00b1\3\2\2\2\u03ab\u03b3\5p9\2\u03ac\u03b3\5\u0086D\2\u03ad"+
		"\u03b3\5\u0088E\2\u03ae\u03b3\5\u008cG\2\u03af\u03b3\5\u008aF\2\u03b0"+
		"\u03b3\5\u00bc_\2\u03b1\u03b3\5\32\16\2\u03b2\u03ab\3\2\2\2\u03b2\u03ac"+
		"\3\2\2\2\u03b2\u03ad\3\2\2\2\u03b2\u03ae\3\2\2\2\u03b2\u03af\3\2\2\2\u03b2"+
		"\u03b0\3\2\2\2\u03b2\u03b1\3\2\2\2\u03b3\u00b3\3\2\2\2\u03b4\u03b6\5\u00b6"+
		"\\\2\u03b5\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7"+
		"\u03b8\3\2\2\2\u03b8\u00b5\3\2\2\2\u03b9\u03bb\5\u00b8]\2\u03ba\u03b9"+
		"\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
		"\u03be\3\2\2\2\u03be\u03bf\5\u00ba^\2\u03bf\u03c0\7\r\2\2\u03c0\u00b7"+
		"\3\2\2\2\u03c1\u03c8\5\u013a\u009e\2\u03c2\u03c3\7U\2\2\u03c3\u03c4\5"+
		"<\37\2\u03c4\u03c5\7\16\2\2\u03c5\u03c9\3\2\2\2\u03c6\u03c7\7=\2\2\u03c7"+
		"\u03c9\7\16\2\2\u03c8\u03c2\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9\u00b9\3"+
		"\2\2\2\u03ca\u03cb\5\u013a\u009e\2\u03cb\u03cc\5X-\2\u03cc\u03cd\5h\65"+
		"\2\u03cd\u00bb\3\2\2\2\u03ce\u03cf\7A\2\2\u03cf\u03d0\5\u0142\u00a2\2"+
		"\u03d0\u03d1\7\20\2\2\u03d1\u03d6\5\u00be`\2\u03d2\u03d3\7\17\2\2\u03d3"+
		"\u03d5\5\u00be`\2\u03d4\u03d2\3\2\2\2\u03d5\u03d8\3\2\2\2\u03d6\u03d4"+
		"\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d9\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d9"+
		"\u03da\7\21\2\2\u03da\u00bd\3\2\2\2\u03db\u03dc\5\u0142\u00a2\2\u03dc"+
		"\u00bf\3\2\2\2\u03dd\u03de\7\61\2\2\u03de\u03df\7\30\2\2\u03df\u03e0\5"+
		"\u013a\u009e\2\u03e0\u03e3\5Z.\2\u03e1\u03e2\7\17\2\2\u03e2\u03e4\5R*"+
		"\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6"+
		"\7\31\2\2\u03e6\u00c1\3\2\2\2\u03e7\u03e8\7e\2\2\u03e8\u03e9\7\30\2\2"+
		"\u03e9\u03ec\5Z.\2\u03ea\u03eb\7\17\2\2\u03eb\u03ed\5R*\2\u03ec\u03ea"+
		"\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\7\31\2\2"+
		"\u03ef\u00c3\3\2\2\2\u03f0\u03f1\7f\2\2\u03f1\u03f2\7\30\2\2\u03f2\u03f3"+
		"\5Z.\2\u03f3\u03f4\7\17\2\2\u03f4\u03f7\5Z.\2\u03f5\u03f6\7\17\2\2\u03f6"+
		"\u03f8\5R*\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2\2"+
		"\2\u03f9\u03fa\7\31\2\2\u03fa\u00c5\3\2\2\2\u03fb\u0400\7)\2\2\u03fc\u03fd"+
		"\7\30\2\2\u03fd\u03fe\5R*\2\u03fe\u03ff\7\31\2\2\u03ff\u0401\3\2\2\2\u0400"+
		"\u03fc\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u00c7\3\2\2\2\u0402\u0407\7B"+
		"\2\2\u0403\u0404\7\30\2\2\u0404\u0405\5R*\2\u0405\u0406\7\31\2\2\u0406"+
		"\u0408\3\2\2\2\u0407\u0403\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u00c9\3\2"+
		"\2\2\u0409\u040b\7s\2\2\u040a\u040c\5\u00ccg\2\u040b\u040a\3\2\2\2\u040c"+
		"\u040d\3\2\2\2\u040d\u040b\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u00cb\3\2"+
		"\2\2\u040f\u0410\7\24\2\2\u0410\u0411\5R*\2\u0411\u0412\7\25\2\2\u0412"+
		"\u00cd\3\2\2\2\u0413\u0416\5\u00f4{\2\u0414\u0416\5\u00f8}\2\u0415\u0413"+
		"\3\2\2\2\u0415\u0414\3\2\2\2\u0416\u00cf\3\2\2\2\u0417\u0418\7F\2\2\u0418"+
		"\u0419\5\u0142\u00a2\2\u0419\u041d\7\20\2\2\u041a\u041c\5\u00aeX\2\u041b"+
		"\u041a\3\2\2\2\u041c\u041f\3\2\2\2\u041d\u041b\3\2\2\2\u041d\u041e\3\2"+
		"\2\2\u041e\u0420\3\2\2\2\u041f\u041d\3\2\2\2\u0420\u0421\7\21\2\2\u0421"+
		"\u00d1\3\2\2\2\u0422\u0424\5\u00d4k\2\u0423\u0422\3\2\2\2\u0423\u0424"+
		"\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0426\5\u00d6l\2\u0426\u0427\5\u0142"+
		"\u00a2\2\u0427\u0429\5\u00d8m\2\u0428\u042a\5\u00dep\2\u0429\u0428\3\2"+
		"\2\2\u0429\u042a\3\2\2\2\u042a\u042c\3\2\2\2\u042b\u042d\5\u00e0q\2\u042c"+
		"\u042b\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u00d3\3\2\2\2\u042e\u042f\7R"+
		"\2\2\u042f\u00d5\3\2\2\2\u0430\u0433\5\u013a\u009e\2\u0431\u0434\5\u00e2"+
		"r\2\u0432\u0434\78\2\2\u0433\u0431\3\2\2\2\u0433\u0432\3\2\2\2\u0434\u00d7"+
		"\3\2\2\2\u0435\u043e\7\22\2\2\u0436\u043b\5\u00dan\2\u0437\u0438\7\17"+
		"\2\2\u0438\u043a\5\u00dan\2\u0439\u0437\3\2\2\2\u043a\u043d\3\2\2\2\u043b"+
		"\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043f\3\2\2\2\u043d\u043b\3\2"+
		"\2\2\u043e\u0436\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440\3\2\2\2\u0440"+
		"\u0441\7\23\2\2\u0441\u00d9\3\2\2\2\u0442\u0443\5\u013a\u009e\2\u0443"+
		"\u0444\5\u00dco\2\u0444\u0445\5\u013a\u009e\2\u0445\u0446\5\u00e2r\2\u0446"+
		"\u0447\5\u013a\u009e\2\u0447\u0448\5j\66\2\u0448\u00db\3\2\2\2\u0449\u044a"+
		"\t\n\2\2\u044a\u00dd\3\2\2\2\u044b\u044c\7\67\2\2\u044c\u044d\7\22\2\2"+
		"\u044d\u0452\5\30\r\2\u044e\u044f\7\17\2\2\u044f\u0451\5\30\r\2\u0450"+
		"\u044e\3\2\2\2\u0451\u0454\3\2\2\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2"+
		"\2\2\u0453\u0455\3\2\2\2\u0454\u0452\3\2\2\2\u0455\u0456\7\23\2\2\u0456"+
		"\u00df\3\2\2\2\u0457\u0458\7C\2\2\u0458\u0459\7\22\2\2\u0459\u045e\7\13"+
		"\2\2\u045a\u045b\7\17\2\2\u045b\u045d\7\13\2\2\u045c\u045a\3\2\2\2\u045d"+
		"\u0460\3\2\2\2\u045e\u045c\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0461\3\2"+
		"\2\2\u0460\u045e\3\2\2\2\u0461\u0462\7\23\2\2\u0462\u00e1\3\2\2\2\u0463"+
		"\u0468\5^\60\2\u0464\u0468\5\u00c6d\2\u0465\u0468\5\u00c8e\2\u0466\u0468"+
		"\5\32\16\2\u0467\u0463\3\2\2\2\u0467\u0464\3\2\2\2\u0467\u0465\3\2\2\2"+
		"\u0467\u0466\3\2\2\2\u0468\u00e3\3\2\2\2\u0469\u046a\7P\2\2\u046a\u046b"+
		"\7\30\2\2\u046b\u046c\5R*\2\u046c\u046d\7\17\2\2\u046d\u046e\5R*\2\u046e"+
		"\u046f\7\31\2\2\u046f\u00e5\3\2\2\2\u0470\u0471\7P\2\2\u0471\u00e7\3\2"+
		"\2\2\u0472\u0473\7I\2\2\u0473\u00e9\3\2\2\2\u0474\u0475\7\63\2\2\u0475"+
		"\u0479\7s\2\2\u0476\u0477\7Q\2\2\u0477\u0479\7s\2\2\u0478\u0474\3\2\2"+
		"\2\u0478\u0476\3\2\2\2\u0479\u00eb\3\2\2\2\u047a\u047b\5\u013a\u009e\2"+
		"\u047b\u047c\7\62\2\2\u047c\u047d\5\u013a\u009e\2\u047d\u047e\5\u00ee"+
		"x\2\u047e\u047f\7\r\2\2\u047f\u00ed\3\2\2\2\u0480\u0483\5\32\16\2\u0481"+
		"\u0483\7\13\2\2\u0482\u0480\3\2\2\2\u0482\u0481\3\2\2\2\u0483\u00ef\3"+
		"\2\2\2\u0484\u0485\7_\2\2\u0485\u0486\5\30\r\2\u0486\u0487\7\13\2\2\u0487"+
		"\u00f1\3\2\2\2\u0488\u0489\7^\2\2\u0489\u048a\5\30\r\2\u048a\u048b\7\13"+
		"\2\2\u048b\u00f3\3\2\2\2\u048c\u048d\7\65\2\2\u048d\u048e\7`\2\2\u048e"+
		"\u048f\5\u013a\u009e\2\u048f\u0490\5\u00e2r\2\u0490\u0491\5\u00f6|\2\u0491"+
		"\u00f5\3\2\2\2\u0492\u0493\5\u013a\u009e\2\u0493\u049e\5j\66\2\u0494\u049f"+
		"\5\u00dep\2\u0495\u0496\7\17\2\2\u0496\u0497\5\u013a\u009e\2\u0497\u0498"+
		"\5j\66\2\u0498\u049a\3\2\2\2\u0499\u0495\3\2\2\2\u049a\u049d\3\2\2\2\u049b"+
		"\u0499\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049f\3\2\2\2\u049d\u049b\3\2"+
		"\2\2\u049e\u0494\3\2\2\2\u049e\u049b\3\2\2\2\u049f\u00f7\3\2\2\2\u04a0"+
		"\u04a1\7`\2\2\u04a1\u04a2\5\u013a\u009e\2\u04a2\u04a3\5\u00e2r\2\u04a3"+
		"\u04a4\5\u00fa~\2\u04a4\u00f9\3\2\2\2\u04a5\u04a6\5\u013a\u009e\2\u04a6"+
		"\u04b1\5j\66\2\u04a7\u04b2\5\u00fc\177\2\u04a8\u04a9\7\17\2\2\u04a9\u04aa"+
		"\5\u013a\u009e\2\u04aa\u04ab\5j\66\2\u04ab\u04ad\3\2\2\2\u04ac\u04a8\3"+
		"\2\2\2\u04ad\u04b0\3\2\2\2\u04ae\u04ac\3\2\2\2\u04ae\u04af\3\2\2\2\u04af"+
		"\u04b2\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b1\u04a7\3\2\2\2\u04b1\u04ae\3\2"+
		"\2\2\u04b2\u00fb\3\2\2\2\u04b3\u04b5\5\u00fe\u0080\2\u04b4\u04b6\5\u0100"+
		"\u0081\2\u04b5\u04b4\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b9\3\2\2\2\u04b7"+
		"\u04b9\5\u0100\u0081\2\u04b8\u04b3\3\2\2\2\u04b8\u04b7\3\2\2\2\u04b9\u00fd"+
		"\3\2\2\2\u04ba\u04bb\7G\2\2\u04bb\u04bc\5\u0102\u0082\2\u04bc\u00ff\3"+
		"\2\2\2\u04bd\u04be\7&\2\2\u04be\u04bf\5\u0102\u0082\2\u04bf\u0101\3\2"+
		"\2\2\u04c0\u04c1\7\22\2\2\u04c1\u04c6\5\30\r\2\u04c2\u04c3\7\17\2\2\u04c3"+
		"\u04c5\5\30\r\2\u04c4\u04c2\3\2\2\2\u04c5\u04c8\3\2\2\2\u04c6\u04c4\3"+
		"\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c9\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c9"+
		"\u04ca\7\23\2\2\u04ca\u0103\3\2\2\2\u04cb\u04ce\5\u0108\u0085\2\u04cc"+
		"\u04ce\5\u0106\u0084\2\u04cd\u04cb\3\2\2\2\u04cd\u04cc\3\2\2\2\u04ce\u0105"+
		"\3\2\2\2\u04cf\u04d0\7d\2\2\u04d0\u04d1\7s\2\2\u04d1\u0107\3\2\2\2\u04d2"+
		"\u04d3\5\u010a\u0086\2\u04d3\u04d4\7\20\2\2\u04d4\u04d5\5\u0110\u0089"+
		"\2\u04d5\u04d6\7\21\2\2\u04d6\u0109\3\2\2\2\u04d7\u04d8\7d\2\2\u04d8\u04da"+
		"\5\u0142\u00a2\2\u04d9\u04db\5\u010e\u0088\2\u04da\u04d9\3\2\2\2\u04da"+
		"\u04db\3\2\2\2\u04db\u04dd\3\2\2\2\u04dc\u04de\5\u010c\u0087\2\u04dd\u04dc"+
		"\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u010b\3\2\2\2\u04df\u04e0\7K\2\2\u04e0"+
		"\u04e5\5\30\r\2\u04e1\u04e2\7\17\2\2\u04e2\u04e4\5\30\r\2\u04e3\u04e1"+
		"\3\2\2\2\u04e4\u04e7\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6"+
		"\u010d\3\2\2\2\u04e7\u04e5\3\2\2\2\u04e8\u04e9\7\16\2\2\u04e9\u04ea\5"+
		"\30\r\2\u04ea\u010f\3\2\2\2\u04eb\u04ed\5\u0112\u008a\2\u04ec\u04eb\3"+
		"\2\2\2\u04ed\u04f0\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef"+
		"\u0111\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f1\u0504\5\u013a\u009e\2\u04f2\u04f3"+
		"\5\u0114\u008b\2\u04f3\u04f4\7\r\2\2\u04f4\u0505\3\2\2\2\u04f5\u04f6\5"+
		"\u0118\u008d\2\u04f6\u04f7\7\r\2\2\u04f7\u0505\3\2\2\2\u04f8\u04f9\5\u011a"+
		"\u008e\2\u04f9\u04fa\7\r\2\2\u04fa\u0505\3\2\2\2\u04fb\u04fc\5\u011c\u008f"+
		"\2\u04fc\u04fd\7\r\2\2\u04fd\u0505\3\2\2\2\u04fe\u04ff\5\u011e\u0090\2"+
		"\u04ff\u0500\7\r\2\2\u0500\u0505\3\2\2\2\u0501\u0502\5\u00ceh\2\u0502"+
		"\u0503\7\r\2\2\u0503\u0505\3\2\2\2\u0504\u04f2\3\2\2\2\u0504\u04f5\3\2"+
		"\2\2\u0504\u04f8\3\2\2\2\u0504\u04fb\3\2\2\2\u0504\u04fe\3\2\2\2\u0504"+
		"\u0501\3\2\2\2\u0505\u0113\3\2\2\2\u0506\u0507\7[\2\2\u0507\u0508\5\u0116"+
		"\u008c\2\u0508\u0509\7s\2\2\u0509\u0115\3\2\2\2\u050a\u050d\5\u013a\u009e"+
		"\2\u050b\u050e\5\32\16\2\u050c\u050e\7M\2\2\u050d\u050b\3\2\2\2\u050d"+
		"\u050c\3\2\2\2\u050e\u0117\3\2\2\2\u050f\u0511\7-\2\2\u0510\u0512\7X\2"+
		"\2\u0511\u0510\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0514"+
		"\5\u0116\u008c\2\u0514\u0515\7s\2\2\u0515\u0119\3\2\2\2\u0516\u0517\7"+
		"(\2\2\u0517\u0518\5\30\r\2\u0518\u0519\7s\2\2\u0519\u011b\3\2\2\2\u051a"+
		"\u051b\7+\2\2\u051b\u051c\5\30\r\2\u051c\u051d\7s\2\2\u051d\u011d\3\2"+
		"\2\2\u051e\u051f\7\\\2\2\u051f\u0520\5\30\r\2\u0520\u0521\7s\2\2\u0521"+
		"\u011f\3\2\2\2\u0522\u0523\5\u0122\u0092\2\u0523\u0524\5\u0128\u0095\2"+
		"\u0524\u0121\3\2\2\2\u0525\u0526\7D\2\2\u0526\u0528\5\u0142\u00a2\2\u0527"+
		"\u0529\5\u0124\u0093\2\u0528\u0527\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052b"+
		"\3\2\2\2\u052a\u052c\5\u010c\u0087\2\u052b\u052a\3\2\2\2\u052b\u052c\3"+
		"\2\2\2\u052c\u052d\3\2\2\2\u052d\u052e\7b\2\2\u052e\u0530\5\30\r\2\u052f"+
		"\u0531\5\u0126\u0094\2\u0530\u052f\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0123"+
		"\3\2\2\2\u0532\u0533\7\16\2\2\u0533\u0534\5\30\r\2\u0534\u0125\3\2\2\2"+
		"\u0535\u0536\7.\2\2\u0536\u0537\5\30\r\2\u0537\u0127\3\2\2\2\u0538\u053c"+
		"\7\20\2\2\u0539\u053b\5\u012a\u0096\2\u053a\u0539\3\2\2\2\u053b\u053e"+
		"\3\2\2\2\u053c\u053a\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053f\3\2\2\2\u053e"+
		"\u053c\3\2\2\2\u053f\u0540\7\21\2\2\u0540\u0129\3\2\2\2\u0541\u054a\5"+
		"\22\n\2\u0542\u0545\5\u013a\u009e\2\u0543\u0546\5\u012c\u0097\2\u0544"+
		"\u0546\5\u012e\u0098\2\u0545\u0543\3\2\2\2\u0545\u0544\3\2\2\2\u0546\u0547"+
		"\3\2\2\2\u0547\u0548\7\r\2\2\u0548\u054a\3\2\2\2\u0549\u0541\3\2\2\2\u0549"+
		"\u0542\3\2\2\2\u054a\u012b\3\2\2\2\u054b\u054c\7E\2\2\u054c\u054d\5\u0142"+
		"\u00a2\2\u054d\u054f\7\22\2\2\u054e\u0550\5\62\32\2\u054f\u054e\3\2\2"+
		"\2\u054f\u0550\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0553\7\23\2\2\u0552"+
		"\u0554\5\u00dep\2\u0553\u0552\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u012d"+
		"\3\2\2\2\u0555\u0556\7\66\2\2\u0556\u0557\5\u0142\u00a2\2\u0557\u0559"+
		"\7\22\2\2\u0558\u055a\5\62\32\2\u0559\u0558\3\2\2\2\u0559\u055a\3\2\2"+
		"\2\u055a\u055b\3\2\2\2\u055b\u055d\7\23\2\2\u055c\u055e\5\u00dep\2\u055d"+
		"\u055c\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u012f\3\2\2\2\u055f\u0563\5\u0136"+
		"\u009c\2\u0560\u0563\5\u0134\u009b\2\u0561\u0563\5\u0132\u009a\2\u0562"+
		"\u055f\3\2\2\2\u0562\u0560\3\2\2\2\u0562\u0561\3\2\2\2\u0563\u0131\3\2"+
		"\2\2\u0564\u0566\7Y\2\2\u0565\u0564\3\2\2\2\u0565\u0566\3\2\2\2\u0566"+
		"\u0567\3\2\2\2\u0567\u0568\7:\2\2\u0568\u0569\7s\2\2\u0569\u0133\3\2\2"+
		"\2\u056a\u056b\7Y\2\2\u056b\u056c\7:\2\2\u056c\u056d\5\u0142\u00a2\2\u056d"+
		"\u056e\5(\25\2\u056e\u0572\7\20\2\2\u056f\u0571\5\22\n\2\u0570\u056f\3"+
		"\2\2\2\u0571\u0574\3\2\2\2\u0572\u0570\3\2\2\2\u0572\u0573\3\2\2\2\u0573"+
		"\u0575\3\2\2\2\u0574\u0572\3\2\2\2\u0575\u0576\7\21\2\2\u0576\u0135\3"+
		"\2\2\2\u0577\u0578\5\u0138\u009d\2\u0578\u057c\7\20\2\2\u0579\u057b\5"+
		",\27\2\u057a\u0579\3\2\2\2\u057b\u057e\3\2\2\2\u057c\u057a\3\2\2\2\u057c"+
		"\u057d\3\2\2\2\u057d\u057f\3\2\2\2\u057e\u057c\3\2\2\2\u057f\u0580\7\21"+
		"\2\2\u0580\u0137\3\2\2\2\u0581\u0583\7/\2\2\u0582\u0581\3\2\2\2\u0582"+
		"\u0583\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0585\7:\2\2\u0585\u0586\5\u0142"+
		"\u00a2\2\u0586\u0587\5(\25\2\u0587\u0139\3\2\2\2\u0588\u058a\5\u013c\u009f"+
		"\2\u0589\u0588\3\2\2\2\u058a\u058d\3\2\2\2\u058b\u0589\3\2\2\2\u058b\u058c"+
		"\3\2\2\2\u058c\u013b\3\2\2\2\u058d\u058b\3\2\2\2\u058e\u058f\7%\2\2\u058f"+
		"\u0594\5\32\16\2\u0590\u0591\7\22\2\2\u0591\u0592\5\u013e\u00a0\2\u0592"+
		"\u0593\7\23\2\2\u0593\u0595\3\2\2\2\u0594\u0590\3\2\2\2\u0594\u0595\3"+
		"\2\2\2\u0595\u013d\3\2\2\2\u0596\u05a0\5<\37\2\u0597\u059c\5\u0140\u00a1"+
		"\2\u0598\u0599\7\17\2\2\u0599\u059b\5\u0140\u00a1\2\u059a\u0598\3\2\2"+
		"\2\u059b\u059e\3\2\2\2\u059c\u059a\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u05a0"+
		"\3\2\2\2\u059e\u059c\3\2\2\2\u059f\u0596\3\2\2\2\u059f\u0597\3\2\2\2\u05a0"+
		"\u013f\3\2\2\2\u05a1\u05a2\7s\2\2\u05a2\u05a3\7 \2\2\u05a3\u05a4\5<\37"+
		"\2\u05a4\u0141\3\2\2\2\u05a5\u05a6\5\u013a\u009e\2\u05a6\u05a7\7s\2\2"+
		"\u05a7\u0143\3\2\2\2\177\u0147\u014d\u0174\u017c\u0183\u018b\u0191\u0196"+
		"\u019b\u01b4\u01bc\u01c5\u01cc\u01d4\u01d7\u01e8\u01f2\u01f8\u0200\u0207"+
		"\u020a\u0212\u0215\u021c\u0223\u022e\u0232\u023b\u0258\u0261\u0269\u0271"+
		"\u0279\u0281\u0289\u0290\u029a\u02ae\u02b5\u02ba\u02bf\u02ca\u02d2\u02d9"+
		"\u02e0\u02e8\u02ee\u02f8\u02fc\u0302\u030d\u0313\u031a\u031f\u0325\u0335"+
		"\u033f\u034f\u0351\u0358\u0363\u036b\u0371\u0379\u0388\u038f\u0398\u03b2"+
		"\u03b7\u03bc\u03c8\u03d6\u03e3\u03ec\u03f7\u0400\u0407\u040d\u0415\u041d"+
		"\u0423\u0429\u042c\u0433\u043b\u043e\u0452\u045e\u0467\u0478\u0482\u049b"+
		"\u049e\u04ae\u04b1\u04b5\u04b8\u04c6\u04cd\u04da\u04dd\u04e5\u04ee\u0504"+
		"\u050d\u0511\u0528\u052b\u0530\u053c\u0545\u0549\u054f\u0553\u0559\u055d"+
		"\u0562\u0565\u0572\u057c\u0582\u058b\u0594\u059c\u059f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}