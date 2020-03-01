// Generated from /mnt/c/Users/namas/Documents/Research/Tools/UTrans/src/main/java/mastery.translator/cs/CSharpParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSharpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BYTE_ORDER_MARK=1, SINGLE_LINE_DOC_COMMENT=2, DELIMITED_DOC_COMMENT=3, 
		SINGLE_LINE_COMMENT=4, DELIMITED_COMMENT=5, WHITESPACES=6, SHARP=7, ABSTRACT=8, 
		ADD=9, ALIAS=10, ARGLIST=11, AS=12, ASCENDING=13, ASYNC=14, AWAIT=15, 
		BASE=16, BOOL=17, BREAK=18, BY=19, BYTE=20, CASE=21, CATCH=22, CHAR=23, 
		CHECKED=24, CLASS=25, CONST=26, CONTINUE=27, DECIMAL=28, DEFAULT=29, DELEGATE=30, 
		DESCENDING=31, DO=32, DOUBLE=33, DYNAMIC=34, ELSE=35, ENUM=36, EQUALS=37, 
		EVENT=38, EXPLICIT=39, EXTERN=40, FALSE=41, FINALLY=42, FIXED=43, FLOAT=44, 
		FOR=45, FOREACH=46, FROM=47, GET=48, GOTO=49, GROUP=50, IF=51, IMPLICIT=52, 
		IN=53, INT=54, INTERFACE=55, INTERNAL=56, INTO=57, IS=58, JOIN=59, LET=60, 
		LOCK=61, LONG=62, NAMEOF=63, NAMESPACE=64, NEW=65, NULL=66, OBJECT=67, 
		ON=68, OPERATOR=69, ORDERBY=70, OUT=71, OVERRIDE=72, PARAMS=73, PARTIAL=74, 
		PRIVATE=75, PROTECTED=76, PUBLIC=77, READONLY=78, REF=79, REMOVE=80, RETURN=81, 
		SBYTE=82, SEALED=83, SELECT=84, SET=85, SHORT=86, SIZEOF=87, STACKALLOC=88, 
		STATIC=89, STRING=90, STRUCT=91, SWITCH=92, THIS=93, THROW=94, TRUE=95, 
		TRY=96, TYPEOF=97, UINT=98, ULONG=99, UNCHECKED=100, UNSAFE=101, USHORT=102, 
		USING=103, VAR=104, VIRTUAL=105, VOID=106, VOLATILE=107, WHEN=108, WHERE=109, 
		WHILE=110, YIELD=111, IDENTIFIER=112, LITERAL_ACCESS=113, INTEGER_LITERAL=114, 
		HEX_INTEGER_LITERAL=115, REAL_LITERAL=116, CHARACTER_LITERAL=117, REGULAR_STRING=118, 
		VERBATIUM_STRING=119, INTERPOLATED_REGULAR_STRING_START=120, INTERPOLATED_VERBATIUM_STRING_START=121, 
		OPEN_BRACE=122, CLOSE_BRACE=123, OPEN_BRACKET=124, CLOSE_BRACKET=125, 
		OPEN_PARENS=126, CLOSE_PARENS=127, DOT=128, COMMA=129, COLON=130, SEMICOLON=131, 
		PLUS=132, MINUS=133, STAR=134, DIV=135, PERCENT=136, AMP=137, BITWISE_OR=138, 
		CARET=139, BANG=140, TILDE=141, ASSIGNMENT=142, LT=143, GT=144, INTERR=145, 
		DOUBLE_COLON=146, OP_COALESCING=147, OP_INC=148, OP_DEC=149, OP_AND=150, 
		OP_OR=151, OP_PTR=152, OP_EQ=153, OP_NE=154, OP_LE=155, OP_GE=156, OP_ADD_ASSIGNMENT=157, 
		OP_SUB_ASSIGNMENT=158, OP_MULT_ASSIGNMENT=159, OP_DIV_ASSIGNMENT=160, 
		OP_MOD_ASSIGNMENT=161, OP_AND_ASSIGNMENT=162, OP_OR_ASSIGNMENT=163, OP_XOR_ASSIGNMENT=164, 
		OP_LEFT_SHIFT=165, OP_LEFT_SHIFT_ASSIGNMENT=166, DOUBLE_CURLY_INSIDE=167, 
		OPEN_BRACE_INSIDE=168, REGULAR_CHAR_INSIDE=169, VERBATIUM_DOUBLE_QUOTE_INSIDE=170, 
		DOUBLE_QUOTE_INSIDE=171, REGULAR_STRING_INSIDE=172, VERBATIUM_INSIDE_STRING=173, 
		CLOSE_BRACE_INSIDE=174, FORMAT_STRING=175, DIRECTIVE_WHITESPACES=176, 
		DIGITS=177, DEFINE=178, UNDEF=179, ELIF=180, ENDIF=181, LINE=182, ERROR=183, 
		WARNING=184, REGION=185, ENDREGION=186, PRAGMA=187, DIRECTIVE_HIDDEN=188, 
		CONDITIONAL_SYMBOL=189, DIRECTIVE_NEW_LINE=190, TEXT=191, DOUBLE_CURLY_CLOSE_INSIDE=192;
	public static final int
		RULE_compilation_unit = 0, RULE_namespace_or_type_name = 1, RULE_type = 2, 
		RULE_base_type = 3, RULE_simple_type = 4, RULE_numeric_type = 5, RULE_integral_type = 6, 
		RULE_floating_point_type = 7, RULE_class_type = 8, RULE_type_argument_list = 9, 
		RULE_argument_list = 10, RULE_argument = 11, RULE_expression = 12, RULE_assignment_operator = 13, 
		RULE_unary_expression = 14, RULE_primary_expression_start = 15, RULE_member_access = 16, 
		RULE_indexer_argument = 17, RULE_predefined_type = 18, RULE_expression_list = 19, 
		RULE_object_or_collection_initializer = 20, RULE_object_initializer = 21, 
		RULE_member_initializer_list = 22, RULE_member_initializer = 23, RULE_initializer_value = 24, 
		RULE_collection_initializer = 25, RULE_element_initializer = 26, RULE_anonymous_object_initializer = 27, 
		RULE_member_declarator_list = 28, RULE_member_declarator = 29, RULE_unbound_type_name = 30, 
		RULE_generic_dimension_specifier = 31, RULE_isType = 32, RULE_anonymous_function_signature = 33, 
		RULE_explicit_anonymous_function_parameter_list = 34, RULE_explicit_anonymous_function_parameter = 35, 
		RULE_implicit_anonymous_function_parameter_list = 36, RULE_anonymous_function_body = 37, 
		RULE_from_clause = 38, RULE_query_body = 39, RULE_query_body_clause = 40, 
		RULE_let_clause = 41, RULE_where_clause = 42, RULE_combined_join_clause = 43, 
		RULE_orderby_clause = 44, RULE_ordering = 45, RULE_select_or_group_clause = 46, 
		RULE_query_continuation = 47, RULE_statement = 48, RULE_labeled_Statement = 49, 
		RULE_embedded_statement = 50, RULE_simple_embedded_statement = 51, RULE_block = 52, 
		RULE_local_variable_declaration = 53, RULE_local_variable_type = 54, RULE_local_variable_declarator = 55, 
		RULE_local_variable_initializer = 56, RULE_local_constant_declaration = 57, 
		RULE_if_body = 58, RULE_switch_section = 59, RULE_switch_label = 60, RULE_statement_list = 61, 
		RULE_for_initializer = 62, RULE_for_iterator = 63, RULE_catch_clauses = 64, 
		RULE_specific_catch_clause = 65, RULE_general_catch_clause = 66, RULE_exception_filter = 67, 
		RULE_finally_clause = 68, RULE_resource_acquisition = 69, RULE_namespace_declaration = 70, 
		RULE_qualified_identifier = 71, RULE_namespace_body = 72, RULE_extern_alias_directives = 73, 
		RULE_extern_alias_directive = 74, RULE_using_directives = 75, RULE_using_directive = 76, 
		RULE_namespace_member_declarations = 77, RULE_namespace_member_declaration = 78, 
		RULE_type_declaration = 79, RULE_qualified_alias_member = 80, RULE_type_parameter_list = 81, 
		RULE_type_parameter = 82, RULE_class_base = 83, RULE_interface_type_list = 84, 
		RULE_type_parameter_constraints_clauses = 85, RULE_type_parameter_constraints_clause = 86, 
		RULE_type_parameter_constraints = 87, RULE_primary_constraint = 88, RULE_secondary_constraints = 89, 
		RULE_constructor_constraint = 90, RULE_class_body = 91, RULE_class_member_declarations = 92, 
		RULE_class_member_declaration = 93, RULE_all_member_modifiers = 94, RULE_all_member_modifier = 95, 
		RULE_common_member_declaration = 96, RULE_constant_declarators = 97, RULE_constant_declarator = 98, 
		RULE_variable_declarators = 99, RULE_variable_declarator = 100, RULE_variable_initializer = 101, 
		RULE_return_type = 102, RULE_member_name = 103, RULE_method_body = 104, 
		RULE_formal_parameter_list = 105, RULE_fixed_parameters = 106, RULE_fixed_parameter = 107, 
		RULE_parameter_modifier = 108, RULE_parameter_array = 109, RULE_accessor_declarations = 110, 
		RULE_get_accessor_declaration = 111, RULE_set_accessor_declaration = 112, 
		RULE_accessor_modifier = 113, RULE_accessor_body = 114, RULE_event_accessor_declarations = 115, 
		RULE_add_accessor_declaration = 116, RULE_remove_accessor_declaration = 117, 
		RULE_overloadable_operator = 118, RULE_conversion_operator_declarator = 119, 
		RULE_constructor_initializer = 120, RULE_body = 121, RULE_struct_interfaces = 122, 
		RULE_struct_body = 123, RULE_struct_member_declaration = 124, RULE_array_type = 125, 
		RULE_rank_specifier = 126, RULE_array_initializer = 127, RULE_variant_type_parameter_list = 128, 
		RULE_variant_type_parameter = 129, RULE_variance_annotation = 130, RULE_interface_base = 131, 
		RULE_interface_body = 132, RULE_interface_member_declaration = 133, RULE_interface_accessors = 134, 
		RULE_enum_base = 135, RULE_enum_body = 136, RULE_enum_member_declaration = 137, 
		RULE_global_attribute_section = 138, RULE_global_attribute_target = 139, 
		RULE_attributes = 140, RULE_attribute_section = 141, RULE_attribute_target = 142, 
		RULE_attribute_list = 143, RULE_attribute = 144, RULE_attribute_argument = 145, 
		RULE_pointer_type = 146, RULE_fixed_pointer_declarators = 147, RULE_fixed_pointer_declarator = 148, 
		RULE_fixed_pointer_initializer = 149, RULE_fixed_size_buffer_declarator = 150, 
		RULE_local_variable_initializer_unsafe = 151, RULE_right_arrow = 152, 
		RULE_right_shift = 153, RULE_right_shift_assignment = 154, RULE_literal = 155, 
		RULE_boolean_literal = 156, RULE_string_literal = 157, RULE_interpolated_regular_string = 158, 
		RULE_interpolated_verbatium_string = 159, RULE_interpolated_regular_string_part = 160, 
		RULE_interpolated_verbatium_string_part = 161, RULE_interpolated_string_expression = 162, 
		RULE_keyword = 163, RULE_class_definition = 164, RULE_struct_definition = 165, 
		RULE_interface_definition = 166, RULE_enum_definition = 167, RULE_delegate_definition = 168, 
		RULE_event_declaration = 169, RULE_field_declaration = 170, RULE_property_declaration = 171, 
		RULE_constant_declaration = 172, RULE_indexer_declaration = 173, RULE_destructor_definition = 174, 
		RULE_constructor_declaration = 175, RULE_method_member_name = 176, RULE_operator_declaration = 177, 
		RULE_arg_declaration = 178, RULE_method_invocation = 179, RULE_object_creation_expression = 180, 
		RULE_identifier = 181;
	public static final String[] ruleNames = {
		"compilation_unit", "namespace_or_type_name", "type", "base_type", "simple_type", 
		"numeric_type", "integral_type", "floating_point_type", "class_type", 
		"type_argument_list", "argument_list", "argument", "expression", "assignment_operator", 
		"unary_expression", "primary_expression_start", "member_access", "indexer_argument", 
		"predefined_type", "expression_list", "object_or_collection_initializer", 
		"object_initializer", "member_initializer_list", "member_initializer", 
		"initializer_value", "collection_initializer", "element_initializer", 
		"anonymous_object_initializer", "member_declarator_list", "member_declarator", 
		"unbound_type_name", "generic_dimension_specifier", "isType", "anonymous_function_signature", 
		"explicit_anonymous_function_parameter_list", "explicit_anonymous_function_parameter", 
		"implicit_anonymous_function_parameter_list", "anonymous_function_body", 
		"from_clause", "query_body", "query_body_clause", "let_clause", "where_clause", 
		"combined_join_clause", "orderby_clause", "ordering", "select_or_group_clause", 
		"query_continuation", "statement", "labeled_Statement", "embedded_statement", 
		"simple_embedded_statement", "block", "local_variable_declaration", "local_variable_type", 
		"local_variable_declarator", "local_variable_initializer", "local_constant_declaration", 
		"if_body", "switch_section", "switch_label", "statement_list", "for_initializer", 
		"for_iterator", "catch_clauses", "specific_catch_clause", "general_catch_clause", 
		"exception_filter", "finally_clause", "resource_acquisition", "namespace_declaration", 
		"qualified_identifier", "namespace_body", "extern_alias_directives", "extern_alias_directive", 
		"using_directives", "using_directive", "namespace_member_declarations", 
		"namespace_member_declaration", "type_declaration", "qualified_alias_member", 
		"type_parameter_list", "type_parameter", "class_base", "interface_type_list", 
		"type_parameter_constraints_clauses", "type_parameter_constraints_clause", 
		"type_parameter_constraints", "primary_constraint", "secondary_constraints", 
		"constructor_constraint", "class_body", "class_member_declarations", "class_member_declaration", 
		"all_member_modifiers", "all_member_modifier", "common_member_declaration", 
		"constant_declarators", "constant_declarator", "variable_declarators", 
		"variable_declarator", "variable_initializer", "return_type", "member_name", 
		"method_body", "formal_parameter_list", "fixed_parameters", "fixed_parameter", 
		"parameter_modifier", "parameter_array", "accessor_declarations", "get_accessor_declaration", 
		"set_accessor_declaration", "accessor_modifier", "accessor_body", "event_accessor_declarations", 
		"add_accessor_declaration", "remove_accessor_declaration", "overloadable_operator", 
		"conversion_operator_declarator", "constructor_initializer", "body", "struct_interfaces", 
		"struct_body", "struct_member_declaration", "array_type", "rank_specifier", 
		"array_initializer", "variant_type_parameter_list", "variant_type_parameter", 
		"variance_annotation", "interface_base", "interface_body", "interface_member_declaration", 
		"interface_accessors", "enum_base", "enum_body", "enum_member_declaration", 
		"global_attribute_section", "global_attribute_target", "attributes", "attribute_section", 
		"attribute_target", "attribute_list", "attribute", "attribute_argument", 
		"pointer_type", "fixed_pointer_declarators", "fixed_pointer_declarator", 
		"fixed_pointer_initializer", "fixed_size_buffer_declarator", "local_variable_initializer_unsafe", 
		"right_arrow", "right_shift", "right_shift_assignment", "literal", "boolean_literal", 
		"string_literal", "interpolated_regular_string", "interpolated_verbatium_string", 
		"interpolated_regular_string_part", "interpolated_verbatium_string_part", 
		"interpolated_string_expression", "keyword", "class_definition", "struct_definition", 
		"interface_definition", "enum_definition", "delegate_definition", "event_declaration", 
		"field_declaration", "property_declaration", "constant_declaration", "indexer_declaration", 
		"destructor_definition", "constructor_declaration", "method_member_name", 
		"operator_declaration", "arg_declaration", "method_invocation", "object_creation_expression", 
		"identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u00EF\u00BB\u00BF'", null, null, null, null, null, "'#'", "'abstract'", 
		"'add'", "'alias'", "'__arglist'", "'as'", "'ascending'", "'async'", "'await'", 
		"'base'", "'bool'", "'break'", "'by'", "'byte'", "'case'", "'catch'", 
		"'char'", "'checked'", "'class'", "'const'", "'continue'", "'decimal'", 
		"'default'", "'delegate'", "'descending'", "'do'", "'double'", "'dynamic'", 
		"'else'", "'enum'", "'equals'", "'event'", "'explicit'", "'extern'", "'false'", 
		"'finally'", "'fixed'", "'float'", "'for'", "'foreach'", "'from'", "'get'", 
		"'goto'", "'group'", "'if'", "'implicit'", "'in'", "'int'", "'interface'", 
		"'internal'", "'into'", "'is'", "'join'", "'let'", "'lock'", "'long'", 
		"'nameof'", "'namespace'", "'new'", "'null'", "'object'", "'on'", "'operator'", 
		"'orderby'", "'out'", "'override'", "'params'", "'partial'", "'private'", 
		"'protected'", "'public'", "'readonly'", "'ref'", "'remove'", "'return'", 
		"'sbyte'", "'sealed'", "'select'", "'set'", "'short'", "'sizeof'", "'stackalloc'", 
		"'static'", "'string'", "'struct'", "'switch'", "'this'", "'throw'", "'true'", 
		"'try'", "'typeof'", "'uint'", "'ulong'", "'unchecked'", "'unsafe'", "'ushort'", 
		"'using'", "'var'", "'virtual'", "'void'", "'volatile'", "'when'", "'where'", 
		"'while'", "'yield'", null, null, null, null, null, null, null, null, 
		null, null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'.'", "','", "':'", 
		"';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'^'", "'!'", 
		"'~'", "'='", "'<'", "'>'", "'?'", "'::'", "'??'", "'++'", "'--'", "'&&'", 
		"'||'", "'->'", "'=='", "'!='", "'<='", "'>='", "'+='", "'-='", "'*='", 
		"'/='", "'%='", "'&='", "'|='", "'^='", "'<<'", "'<<='", "'{{'", null, 
		null, null, null, null, null, null, null, null, null, "'define'", "'undef'", 
		"'elif'", "'endif'", "'line'", null, null, null, null, null, "'hidden'", 
		null, null, null, "'}}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BYTE_ORDER_MARK", "SINGLE_LINE_DOC_COMMENT", "DELIMITED_DOC_COMMENT", 
		"SINGLE_LINE_COMMENT", "DELIMITED_COMMENT", "WHITESPACES", "SHARP", "ABSTRACT", 
		"ADD", "ALIAS", "ARGLIST", "AS", "ASCENDING", "ASYNC", "AWAIT", "BASE", 
		"BOOL", "BREAK", "BY", "BYTE", "CASE", "CATCH", "CHAR", "CHECKED", "CLASS", 
		"CONST", "CONTINUE", "DECIMAL", "DEFAULT", "DELEGATE", "DESCENDING", "DO", 
		"DOUBLE", "DYNAMIC", "ELSE", "ENUM", "EQUALS", "EVENT", "EXPLICIT", "EXTERN", 
		"FALSE", "FINALLY", "FIXED", "FLOAT", "FOR", "FOREACH", "FROM", "GET", 
		"GOTO", "GROUP", "IF", "IMPLICIT", "IN", "INT", "INTERFACE", "INTERNAL", 
		"INTO", "IS", "JOIN", "LET", "LOCK", "LONG", "NAMEOF", "NAMESPACE", "NEW", 
		"NULL", "OBJECT", "ON", "OPERATOR", "ORDERBY", "OUT", "OVERRIDE", "PARAMS", 
		"PARTIAL", "PRIVATE", "PROTECTED", "PUBLIC", "READONLY", "REF", "REMOVE", 
		"RETURN", "SBYTE", "SEALED", "SELECT", "SET", "SHORT", "SIZEOF", "STACKALLOC", 
		"STATIC", "STRING", "STRUCT", "SWITCH", "THIS", "THROW", "TRUE", "TRY", 
		"TYPEOF", "UINT", "ULONG", "UNCHECKED", "UNSAFE", "USHORT", "USING", "VAR", 
		"VIRTUAL", "VOID", "VOLATILE", "WHEN", "WHERE", "WHILE", "YIELD", "IDENTIFIER", 
		"LITERAL_ACCESS", "INTEGER_LITERAL", "HEX_INTEGER_LITERAL", "REAL_LITERAL", 
		"CHARACTER_LITERAL", "REGULAR_STRING", "VERBATIUM_STRING", "INTERPOLATED_REGULAR_STRING_START", 
		"INTERPOLATED_VERBATIUM_STRING_START", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", 
		"CLOSE_BRACKET", "OPEN_PARENS", "CLOSE_PARENS", "DOT", "COMMA", "COLON", 
		"SEMICOLON", "PLUS", "MINUS", "STAR", "DIV", "PERCENT", "AMP", "BITWISE_OR", 
		"CARET", "BANG", "TILDE", "ASSIGNMENT", "LT", "GT", "INTERR", "DOUBLE_COLON", 
		"OP_COALESCING", "OP_INC", "OP_DEC", "OP_AND", "OP_OR", "OP_PTR", "OP_EQ", 
		"OP_NE", "OP_LE", "OP_GE", "OP_ADD_ASSIGNMENT", "OP_SUB_ASSIGNMENT", "OP_MULT_ASSIGNMENT", 
		"OP_DIV_ASSIGNMENT", "OP_MOD_ASSIGNMENT", "OP_AND_ASSIGNMENT", "OP_OR_ASSIGNMENT", 
		"OP_XOR_ASSIGNMENT", "OP_LEFT_SHIFT", "OP_LEFT_SHIFT_ASSIGNMENT", "DOUBLE_CURLY_INSIDE", 
		"OPEN_BRACE_INSIDE", "REGULAR_CHAR_INSIDE", "VERBATIUM_DOUBLE_QUOTE_INSIDE", 
		"DOUBLE_QUOTE_INSIDE", "REGULAR_STRING_INSIDE", "VERBATIUM_INSIDE_STRING", 
		"CLOSE_BRACE_INSIDE", "FORMAT_STRING", "DIRECTIVE_WHITESPACES", "DIGITS", 
		"DEFINE", "UNDEF", "ELIF", "ENDIF", "LINE", "ERROR", "WARNING", "REGION", 
		"ENDREGION", "PRAGMA", "DIRECTIVE_HIDDEN", "CONDITIONAL_SYMBOL", "DIRECTIVE_NEW_LINE", 
		"TEXT", "DOUBLE_CURLY_CLOSE_INSIDE"
	};
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
	public String getGrammarFileName() { return "CSharpParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSharpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Compilation_unitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CSharpParser.EOF, 0); }
		public TerminalNode BYTE_ORDER_MARK() { return getToken(CSharpParser.BYTE_ORDER_MARK, 0); }
		public Extern_alias_directivesContext extern_alias_directives() {
			return getRuleContext(Extern_alias_directivesContext.class,0);
		}
		public Using_directivesContext using_directives() {
			return getRuleContext(Using_directivesContext.class,0);
		}
		public List<Global_attribute_sectionContext> global_attribute_section() {
			return getRuleContexts(Global_attribute_sectionContext.class);
		}
		public Global_attribute_sectionContext global_attribute_section(int i) {
			return getRuleContext(Global_attribute_sectionContext.class,i);
		}
		public Namespace_member_declarationsContext namespace_member_declarations() {
			return getRuleContext(Namespace_member_declarationsContext.class,0);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BYTE_ORDER_MARK) {
				{
				setState(364);
				match(BYTE_ORDER_MARK);
				}
			}

			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(367);
				extern_alias_directives();
				}
				break;
			}
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(370);
				using_directives();
				}
			}

			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(373);
					global_attribute_section();
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << CLASS) | (1L << DELEGATE) | (1L << ENUM) | (1L << EXTERN) | (1L << INTERFACE) | (1L << INTERNAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMESPACE - 64)) | (1L << (NEW - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PARTIAL - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (SEALED - 64)) | (1L << (STATIC - 64)) | (1L << (STRUCT - 64)) | (1L << (UNSAFE - 64)) | (1L << (VIRTUAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0)) {
				{
				setState(379);
				namespace_member_declarations();
				}
			}

			setState(382);
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

	public static class Namespace_or_type_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Qualified_alias_memberContext qualified_alias_member() {
			return getRuleContext(Qualified_alias_memberContext.class,0);
		}
		public List<Type_argument_listContext> type_argument_list() {
			return getRuleContexts(Type_argument_listContext.class);
		}
		public Type_argument_listContext type_argument_list(int i) {
			return getRuleContext(Type_argument_listContext.class,i);
		}
		public Namespace_or_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_or_type_name; }
	}

	public final Namespace_or_type_nameContext namespace_or_type_name() throws RecognitionException {
		Namespace_or_type_nameContext _localctx = new Namespace_or_type_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_namespace_or_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(384);
				identifier();
				setState(386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(385);
					type_argument_list();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(388);
				qualified_alias_member();
				}
				break;
			}
			setState(398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(391);
					match(DOT);
					setState(392);
					identifier();
					setState(394);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(393);
						type_argument_list();
						}
						break;
					}
					}
					} 
				}
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			base_type();
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(405);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INTERR:
						{
						setState(402);
						match(INTERR);
						}
						break;
					case OPEN_BRACKET:
						{
						setState(403);
						rank_specifier();
						}
						break;
					case STAR:
						{
						setState(404);
						match(STAR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Base_typeContext extends ParserRuleContext {
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_base_type);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				simple_type();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case STRING:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				class_type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				match(VOID);
				setState(413);
				match(STAR);
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

	public static class Simple_typeContext extends ParserRuleContext {
		public Numeric_typeContext numeric_type() {
			return getRuleContext(Numeric_typeContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(CSharpParser.BOOL, 0); }
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_simple_type);
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				numeric_type();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				match(BOOL);
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

	public static class Numeric_typeContext extends ParserRuleContext {
		public Integral_typeContext integral_type() {
			return getRuleContext(Integral_typeContext.class,0);
		}
		public Floating_point_typeContext floating_point_type() {
			return getRuleContext(Floating_point_typeContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(CSharpParser.DECIMAL, 0); }
		public Numeric_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_type; }
	}

	public final Numeric_typeContext numeric_type() throws RecognitionException {
		Numeric_typeContext _localctx = new Numeric_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_numeric_type);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				integral_type();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				floating_point_type();
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(422);
				match(DECIMAL);
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

	public static class Integral_typeContext extends ParserRuleContext {
		public TerminalNode SBYTE() { return getToken(CSharpParser.SBYTE, 0); }
		public TerminalNode BYTE() { return getToken(CSharpParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(CSharpParser.SHORT, 0); }
		public TerminalNode USHORT() { return getToken(CSharpParser.USHORT, 0); }
		public TerminalNode INT() { return getToken(CSharpParser.INT, 0); }
		public TerminalNode UINT() { return getToken(CSharpParser.UINT, 0); }
		public TerminalNode LONG() { return getToken(CSharpParser.LONG, 0); }
		public TerminalNode ULONG() { return getToken(CSharpParser.ULONG, 0); }
		public TerminalNode CHAR() { return getToken(CSharpParser.CHAR, 0); }
		public Integral_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integral_type; }
	}

	public final Integral_typeContext integral_type() throws RecognitionException {
		Integral_typeContext _localctx = new Integral_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_integral_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (SBYTE - 82)) | (1L << (SHORT - 82)) | (1L << (UINT - 82)) | (1L << (ULONG - 82)) | (1L << (USHORT - 82)))) != 0)) ) {
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

	public static class Floating_point_typeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(CSharpParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(CSharpParser.DOUBLE, 0); }
		public Floating_point_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_point_type; }
	}

	public final Floating_point_typeContext floating_point_type() throws RecognitionException {
		Floating_point_typeContext _localctx = new Floating_point_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_floating_point_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
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

	public static class Class_typeContext extends ParserRuleContext {
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode OBJECT() { return getToken(CSharpParser.OBJECT, 0); }
		public TerminalNode DYNAMIC() { return getToken(CSharpParser.DYNAMIC, 0); }
		public TerminalNode STRING() { return getToken(CSharpParser.STRING, 0); }
		public Class_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_type; }
	}

	public final Class_typeContext class_type() throws RecognitionException {
		Class_typeContext _localctx = new Class_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_class_type);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				namespace_or_type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(OBJECT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				match(DYNAMIC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
				match(STRING);
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

	public static class Type_argument_listContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Type_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_argument_list; }
	}

	public final Type_argument_listContext type_argument_list() throws RecognitionException {
		Type_argument_listContext _localctx = new Type_argument_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(LT);
			setState(436);
			type();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(437);
				match(COMMA);
				setState(438);
				type();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			argument();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(447);
				match(COMMA);
				setState(448);
				argument();
				}
				}
				setState(453);
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

	public static class ArgumentContext extends ParserRuleContext {
		public Token refout;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode VAR() { return getToken(CSharpParser.VAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(454);
				identifier();
				setState(455);
				match(COLON);
				}
				break;
			}
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUT || _la==REF) {
				{
				setState(459);
				((ArgumentContext)_localctx).refout = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OUT || _la==REF) ) {
					((ArgumentContext)_localctx).refout = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(462);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(463);
				type();
				}
				break;
			}
			setState(466);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Anonymous_function_signatureContext anonymous_function_signature() {
			return getRuleContext(Anonymous_function_signatureContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Anonymous_function_bodyContext anonymous_function_body() {
			return getRuleContext(Anonymous_function_bodyContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Query_bodyContext query_body() {
			return getRuleContext(Query_bodyContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Right_shiftContext right_shift() {
			return getRuleContext(Right_shiftContext.class,0);
		}
		public TerminalNode OP_EQ() { return getToken(CSharpParser.OP_EQ, 0); }
		public TerminalNode OP_NE() { return getToken(CSharpParser.OP_NE, 0); }
		public TerminalNode OP_AND() { return getToken(CSharpParser.OP_AND, 0); }
		public TerminalNode OP_OR() { return getToken(CSharpParser.OP_OR, 0); }
		public TerminalNode IS() { return getToken(CSharpParser.IS, 0); }
		public IsTypeContext isType() {
			return getRuleContext(IsTypeContext.class,0);
		}
		public TerminalNode AS() { return getToken(CSharpParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(469);
					match(ASYNC);
					}
					break;
				}
				setState(472);
				anonymous_function_signature();
				setState(473);
				right_arrow();
				setState(474);
				anonymous_function_body();
				}
				break;
			case 2:
				{
				setState(476);
				from_clause();
				setState(477);
				query_body();
				}
				break;
			case 3:
				{
				setState(479);
				unary_expression();
				}
				break;
			case 4:
				{
				setState(480);
				unary_expression();
				setState(481);
				assignment_operator();
				setState(482);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(534);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(486);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(487);
						_la = _input.LA(1);
						if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (STAR - 134)) | (1L << (DIV - 134)) | (1L << (PERCENT - 134)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(488);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(489);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(490);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(491);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(492);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(495);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OP_LEFT_SHIFT:
							{
							setState(493);
							match(OP_LEFT_SHIFT);
							}
							break;
						case GT:
							{
							setState(494);
							right_shift();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(497);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(498);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(499);
						_la = _input.LA(1);
						if ( !(_la==OP_EQ || _la==OP_NE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(500);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(501);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(502);
						match(AMP);
						setState(503);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(504);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(505);
						match(CARET);
						setState(506);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(507);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(508);
						match(BITWISE_OR);
						setState(509);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(510);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(511);
						match(OP_AND);
						setState(512);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(513);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(514);
						match(OP_OR);
						setState(515);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(516);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(517);
						match(OP_COALESCING);
						setState(518);
						expression(3);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(519);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(520);
						match(INTERR);
						setState(521);
						expression(0);
						setState(522);
						match(COLON);
						setState(523);
						expression(2);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(525);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(532);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LT:
						case GT:
						case OP_LE:
						case OP_GE:
							{
							setState(526);
							_la = _input.LA(1);
							if ( !(((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (LT - 143)) | (1L << (GT - 143)) | (1L << (OP_LE - 143)) | (1L << (OP_GE - 143)))) != 0)) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(527);
							expression(0);
							}
							break;
						case IS:
							{
							setState(528);
							match(IS);
							setState(529);
							isType();
							}
							break;
						case AS:
							{
							setState(530);
							match(AS);
							setState(531);
							type();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Right_shift_assignmentContext right_shift_assignment() {
			return getRuleContext(Right_shift_assignmentContext.class,0);
		}
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment_operator);
		try {
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGNMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				match(ASSIGNMENT);
				}
				break;
			case OP_ADD_ASSIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				match(OP_ADD_ASSIGNMENT);
				}
				break;
			case OP_SUB_ASSIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				match(OP_SUB_ASSIGNMENT);
				}
				break;
			case OP_MULT_ASSIGNMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(542);
				match(OP_MULT_ASSIGNMENT);
				}
				break;
			case OP_DIV_ASSIGNMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(543);
				match(OP_DIV_ASSIGNMENT);
				}
				break;
			case OP_MOD_ASSIGNMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(544);
				match(OP_MOD_ASSIGNMENT);
				}
				break;
			case OP_AND_ASSIGNMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(545);
				match(OP_AND_ASSIGNMENT);
				}
				break;
			case OP_OR_ASSIGNMENT:
				enterOuterAlt(_localctx, 8);
				{
				setState(546);
				match(OP_OR_ASSIGNMENT);
				}
				break;
			case OP_XOR_ASSIGNMENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(547);
				match(OP_XOR_ASSIGNMENT);
				}
				break;
			case OP_LEFT_SHIFT_ASSIGNMENT:
				enterOuterAlt(_localctx, 10);
				{
				setState(548);
				match(OP_LEFT_SHIFT_ASSIGNMENT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 11);
				{
				setState(549);
				right_shift_assignment();
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public Primary_expression_startContext pe;
		public Primary_expression_startContext primary_expression_start() {
			return getRuleContext(Primary_expression_startContext.class,0);
		}
		public List<Indexer_argumentContext> indexer_argument() {
			return getRuleContexts(Indexer_argumentContext.class);
		}
		public Indexer_argumentContext indexer_argument(int i) {
			return getRuleContext(Indexer_argumentContext.class,i);
		}
		public List<Member_accessContext> member_access() {
			return getRuleContexts(Member_accessContext.class);
		}
		public Member_accessContext member_access(int i) {
			return getRuleContext(Member_accessContext.class,i);
		}
		public List<Method_invocationContext> method_invocation() {
			return getRuleContexts(Method_invocationContext.class);
		}
		public Method_invocationContext method_invocation(int i) {
			return getRuleContext(Method_invocationContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(CSharpParser.BANG, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode AWAIT() { return getToken(CSharpParser.AWAIT, 0); }
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unary_expression);
		int _la;
		try {
			int _alt;
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				((Unary_expressionContext)_localctx).pe = primary_expression_start();
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(554);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INTERR) {
							{
							setState(553);
							match(INTERR);
							}
						}

						setState(556);
						match(OPEN_BRACKET);
						setState(557);
						indexer_argument();
						setState(562);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(558);
							match(COMMA);
							setState(559);
							indexer_argument();
							}
							}
							setState(564);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(565);
						match(CLOSE_BRACKET);
						}
						} 
					}
					setState(571);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(578);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DOT:
						case INTERR:
							{
							setState(572);
							member_access();
							}
							break;
						case OPEN_PARENS:
							{
							setState(573);
							method_invocation();
							}
							break;
						case OP_INC:
							{
							setState(574);
							match(OP_INC);
							}
							break;
						case OP_DEC:
							{
							setState(575);
							match(OP_DEC);
							}
							break;
						case OP_PTR:
							{
							setState(576);
							match(OP_PTR);
							setState(577);
							identifier();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(596);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(581);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==INTERR) {
									{
									setState(580);
									match(INTERR);
									}
								}

								setState(583);
								match(OPEN_BRACKET);
								setState(584);
								indexer_argument();
								setState(589);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(585);
									match(COMMA);
									setState(586);
									indexer_argument();
									}
									}
									setState(591);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(592);
								match(CLOSE_BRACKET);
								}
								} 
							}
							setState(598);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
						}
						}
						} 
					}
					setState(603);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				match(PLUS);
				setState(605);
				unary_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(606);
				match(MINUS);
				setState(607);
				unary_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(608);
				match(BANG);
				setState(609);
				unary_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(610);
				match(TILDE);
				setState(611);
				unary_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(612);
				match(OP_INC);
				setState(613);
				unary_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(614);
				match(OP_DEC);
				setState(615);
				unary_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(616);
				match(OPEN_PARENS);
				setState(617);
				type();
				setState(618);
				match(CLOSE_PARENS);
				setState(619);
				unary_expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(621);
				match(AWAIT);
				setState(622);
				unary_expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(623);
				match(AMP);
				setState(624);
				unary_expression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(625);
				match(STAR);
				setState(626);
				unary_expression();
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

	public static class Primary_expression_startContext extends ParserRuleContext {
		public Primary_expression_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression_start; }
	 
		public Primary_expression_startContext() { }
		public void copyFrom(Primary_expression_startContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralAccessExpressionContext extends Primary_expression_startContext {
		public TerminalNode LITERAL_ACCESS() { return getToken(CSharpParser.LITERAL_ACCESS, 0); }
		public LiteralAccessExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class DefaultValueExpressionContext extends Primary_expression_startContext {
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public DefaultValueExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class BaseAccessExpressionContext extends Primary_expression_startContext {
		public TerminalNode BASE() { return getToken(CSharpParser.BASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public BaseAccessExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class SizeofExpressionContext extends Primary_expression_startContext {
		public TerminalNode SIZEOF() { return getToken(CSharpParser.SIZEOF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public SizeofExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesisExpressionsContext extends Primary_expression_startContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public ParenthesisExpressionsContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class ThisReferenceExpressionContext extends Primary_expression_startContext {
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public ThisReferenceExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class ObjectCreationExpressionContext extends Primary_expression_startContext {
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Anonymous_object_initializerContext anonymous_object_initializer() {
			return getRuleContext(Anonymous_object_initializerContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Object_creation_expressionContext object_creation_expression() {
			return getRuleContext(Object_creation_expressionContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ObjectCreationExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class AnonymousMethodExpressionContext extends Primary_expression_startContext {
		public TerminalNode DELEGATE() { return getToken(CSharpParser.DELEGATE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Explicit_anonymous_function_parameter_listContext explicit_anonymous_function_parameter_list() {
			return getRuleContext(Explicit_anonymous_function_parameter_listContext.class,0);
		}
		public AnonymousMethodExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class TypeofExpressionContext extends Primary_expression_startContext {
		public TerminalNode TYPEOF() { return getToken(CSharpParser.TYPEOF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Unbound_type_nameContext unbound_type_name() {
			return getRuleContext(Unbound_type_nameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public TypeofExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class UncheckedExpressionContext extends Primary_expression_startContext {
		public TerminalNode UNCHECKED() { return getToken(CSharpParser.UNCHECKED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public UncheckedExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleNameExpressionContext extends Primary_expression_startContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public SimpleNameExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class MemberAccessExpressionContext extends Primary_expression_startContext {
		public Predefined_typeContext predefined_type() {
			return getRuleContext(Predefined_typeContext.class,0);
		}
		public Qualified_alias_memberContext qualified_alias_member() {
			return getRuleContext(Qualified_alias_memberContext.class,0);
		}
		public MemberAccessExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class CheckedExpressionContext extends Primary_expression_startContext {
		public TerminalNode CHECKED() { return getToken(CSharpParser.CHECKED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public CheckedExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralExpressionContext extends Primary_expression_startContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class NameofExpressionContext extends Primary_expression_startContext {
		public TerminalNode NAMEOF() { return getToken(CSharpParser.NAMEOF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public NameofExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}

	public final Primary_expression_startContext primary_expression_start() throws RecognitionException {
		Primary_expression_startContext _localctx = new Primary_expression_startContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primary_expression_start);
		int _la;
		try {
			int _alt;
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				literal();
				}
				break;
			case 2:
				_localctx = new SimpleNameExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				identifier();
				setState(632);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(631);
					type_argument_list();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ParenthesisExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(634);
				match(OPEN_PARENS);
				setState(635);
				expression(0);
				setState(636);
				match(CLOSE_PARENS);
				}
				break;
			case 4:
				_localctx = new MemberAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(638);
				predefined_type();
				}
				break;
			case 5:
				_localctx = new MemberAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(639);
				qualified_alias_member();
				}
				break;
			case 6:
				_localctx = new LiteralAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(640);
				match(LITERAL_ACCESS);
				}
				break;
			case 7:
				_localctx = new ThisReferenceExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(641);
				match(THIS);
				}
				break;
			case 8:
				_localctx = new BaseAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(642);
				match(BASE);
				setState(652);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(643);
					match(DOT);
					setState(644);
					identifier();
					setState(646);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(645);
						type_argument_list();
						}
						break;
					}
					}
					break;
				case OPEN_BRACKET:
					{
					setState(648);
					match(OPEN_BRACKET);
					setState(649);
					expression_list();
					setState(650);
					match(CLOSE_BRACKET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				_localctx = new ObjectCreationExpressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(654);
				match(NEW);
				setState(683);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BOOL:
				case BY:
				case BYTE:
				case CHAR:
				case DECIMAL:
				case DESCENDING:
				case DOUBLE:
				case DYNAMIC:
				case EQUALS:
				case FLOAT:
				case FROM:
				case GET:
				case GROUP:
				case INT:
				case INTO:
				case JOIN:
				case LET:
				case LONG:
				case NAMEOF:
				case OBJECT:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SBYTE:
				case SELECT:
				case SET:
				case SHORT:
				case STRING:
				case UINT:
				case ULONG:
				case USHORT:
				case VAR:
				case VOID:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
					{
					setState(655);
					type();
					setState(677);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(656);
						object_creation_expression();
						}
						break;
					case 2:
						{
						setState(657);
						object_or_collection_initializer();
						}
						break;
					case 3:
						{
						setState(658);
						match(OPEN_BRACKET);
						setState(659);
						expression_list();
						setState(660);
						match(CLOSE_BRACKET);
						setState(664);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(661);
								rank_specifier();
								}
								} 
							}
							setState(666);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
						}
						setState(668);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
						case 1:
							{
							setState(667);
							array_initializer();
							}
							break;
						}
						}
						break;
					case 4:
						{
						setState(671); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(670);
							rank_specifier();
							}
							}
							setState(673); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==OPEN_BRACKET );
						setState(675);
						array_initializer();
						}
						break;
					}
					}
					break;
				case OPEN_BRACE:
					{
					setState(679);
					anonymous_object_initializer();
					}
					break;
				case OPEN_BRACKET:
					{
					setState(680);
					rank_specifier();
					setState(681);
					array_initializer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				_localctx = new TypeofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(685);
				match(TYPEOF);
				setState(686);
				match(OPEN_PARENS);
				setState(690);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(687);
					unbound_type_name();
					}
					break;
				case 2:
					{
					setState(688);
					type();
					}
					break;
				case 3:
					{
					setState(689);
					match(VOID);
					}
					break;
				}
				setState(692);
				match(CLOSE_PARENS);
				}
				break;
			case 11:
				_localctx = new CheckedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(693);
				match(CHECKED);
				setState(694);
				match(OPEN_PARENS);
				setState(695);
				expression(0);
				setState(696);
				match(CLOSE_PARENS);
				}
				break;
			case 12:
				_localctx = new UncheckedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(698);
				match(UNCHECKED);
				setState(699);
				match(OPEN_PARENS);
				setState(700);
				expression(0);
				setState(701);
				match(CLOSE_PARENS);
				}
				break;
			case 13:
				_localctx = new DefaultValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(703);
				match(DEFAULT);
				setState(704);
				match(OPEN_PARENS);
				setState(705);
				type();
				setState(706);
				match(CLOSE_PARENS);
				}
				break;
			case 14:
				_localctx = new AnonymousMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASYNC) {
					{
					setState(708);
					match(ASYNC);
					}
				}

				setState(711);
				match(DELEGATE);
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PARENS) {
					{
					setState(712);
					match(OPEN_PARENS);
					setState(714);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (ON - 67)) | (1L << (ORDERBY - 67)) | (1L << (OUT - 67)) | (1L << (PARTIAL - 67)) | (1L << (REF - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)) | (1L << (VAR - 67)) | (1L << (VOID - 67)) | (1L << (WHEN - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
						{
						setState(713);
						explicit_anonymous_function_parameter_list();
						}
					}

					setState(716);
					match(CLOSE_PARENS);
					}
				}

				setState(719);
				block();
				}
				break;
			case 15:
				_localctx = new SizeofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(720);
				match(SIZEOF);
				setState(721);
				match(OPEN_PARENS);
				setState(722);
				type();
				setState(723);
				match(CLOSE_PARENS);
				}
				break;
			case 16:
				_localctx = new NameofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(725);
				match(NAMEOF);
				setState(726);
				match(OPEN_PARENS);
				setState(732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(727);
						identifier();
						setState(728);
						match(DOT);
						}
						} 
					}
					setState(734);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(735);
				identifier();
				setState(736);
				match(CLOSE_PARENS);
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

	public static class Member_accessContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public Member_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_access; }
	}

	public final Member_accessContext member_access() throws RecognitionException {
		Member_accessContext _localctx = new Member_accessContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_member_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERR) {
				{
				setState(740);
				match(INTERR);
				}
			}

			setState(743);
			match(DOT);
			setState(744);
			identifier();
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(745);
				type_argument_list();
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

	public static class Indexer_argumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Indexer_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexer_argument; }
	}

	public final Indexer_argumentContext indexer_argument() throws RecognitionException {
		Indexer_argumentContext _localctx = new Indexer_argumentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_indexer_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(748);
				identifier();
				setState(749);
				match(COLON);
				}
				break;
			}
			setState(753);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Predefined_typeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(CSharpParser.BOOL, 0); }
		public TerminalNode BYTE() { return getToken(CSharpParser.BYTE, 0); }
		public TerminalNode CHAR() { return getToken(CSharpParser.CHAR, 0); }
		public TerminalNode DECIMAL() { return getToken(CSharpParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(CSharpParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(CSharpParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(CSharpParser.INT, 0); }
		public TerminalNode LONG() { return getToken(CSharpParser.LONG, 0); }
		public TerminalNode OBJECT() { return getToken(CSharpParser.OBJECT, 0); }
		public TerminalNode SBYTE() { return getToken(CSharpParser.SBYTE, 0); }
		public TerminalNode SHORT() { return getToken(CSharpParser.SHORT, 0); }
		public TerminalNode STRING() { return getToken(CSharpParser.STRING, 0); }
		public TerminalNode UINT() { return getToken(CSharpParser.UINT, 0); }
		public TerminalNode ULONG() { return getToken(CSharpParser.ULONG, 0); }
		public TerminalNode USHORT() { return getToken(CSharpParser.USHORT, 0); }
		public Predefined_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefined_type; }
	}

	public final Predefined_typeContext predefined_type() throws RecognitionException {
		Predefined_typeContext _localctx = new Predefined_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_predefined_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (SBYTE - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)))) != 0)) ) {
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

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			expression(0);
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(758);
				match(COMMA);
				setState(759);
				expression(0);
				}
				}
				setState(764);
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

	public static class Object_or_collection_initializerContext extends ParserRuleContext {
		public Object_initializerContext object_initializer() {
			return getRuleContext(Object_initializerContext.class,0);
		}
		public Collection_initializerContext collection_initializer() {
			return getRuleContext(Collection_initializerContext.class,0);
		}
		public Object_or_collection_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_or_collection_initializer; }
	}

	public final Object_or_collection_initializerContext object_or_collection_initializer() throws RecognitionException {
		Object_or_collection_initializerContext _localctx = new Object_or_collection_initializerContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_object_or_collection_initializer);
		try {
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(765);
				object_initializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				collection_initializer();
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

	public static class Object_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Member_initializer_listContext member_initializer_list() {
			return getRuleContext(Member_initializer_listContext.class,0);
		}
		public Object_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_initializer; }
	}

	public final Object_initializerContext object_initializer() throws RecognitionException {
		Object_initializerContext _localctx = new Object_initializerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_object_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(OPEN_BRACE);
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << NAMEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ON - 68)) | (1L << (ORDERBY - 68)) | (1L << (PARTIAL - 68)) | (1L << (REMOVE - 68)) | (1L << (SELECT - 68)) | (1L << (SET - 68)) | (1L << (VAR - 68)) | (1L << (WHEN - 68)) | (1L << (WHERE - 68)) | (1L << (YIELD - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (OPEN_BRACKET - 68)))) != 0)) {
				{
				setState(770);
				member_initializer_list();
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(771);
					match(COMMA);
					}
				}

				}
			}

			setState(776);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_initializer_listContext extends ParserRuleContext {
		public List<Member_initializerContext> member_initializer() {
			return getRuleContexts(Member_initializerContext.class);
		}
		public Member_initializerContext member_initializer(int i) {
			return getRuleContext(Member_initializerContext.class,i);
		}
		public Member_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_initializer_list; }
	}

	public final Member_initializer_listContext member_initializer_list() throws RecognitionException {
		Member_initializer_listContext _localctx = new Member_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_member_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			member_initializer();
			setState(783);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(779);
					match(COMMA);
					setState(780);
					member_initializer();
					}
					} 
				}
				setState(785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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

	public static class Member_initializerContext extends ParserRuleContext {
		public Initializer_valueContext initializer_value() {
			return getRuleContext(Initializer_valueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Member_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_initializer; }
	}

	public final Member_initializerContext member_initializer() throws RecognitionException {
		Member_initializerContext _localctx = new Member_initializerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_member_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				{
				setState(786);
				identifier();
				}
				break;
			case OPEN_BRACKET:
				{
				setState(787);
				match(OPEN_BRACKET);
				setState(788);
				expression(0);
				setState(789);
				match(CLOSE_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(793);
			match(ASSIGNMENT);
			setState(794);
			initializer_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_valueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public Initializer_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_value; }
	}

	public final Initializer_valueContext initializer_value() throws RecognitionException {
		Initializer_valueContext _localctx = new Initializer_valueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_initializer_value);
		try {
			setState(798);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				expression(0);
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				object_or_collection_initializer();
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

	public static class Collection_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public List<Element_initializerContext> element_initializer() {
			return getRuleContexts(Element_initializerContext.class);
		}
		public Element_initializerContext element_initializer(int i) {
			return getRuleContext(Element_initializerContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Collection_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_initializer; }
	}

	public final Collection_initializerContext collection_initializer() throws RecognitionException {
		Collection_initializerContext _localctx = new Collection_initializerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_collection_initializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(OPEN_BRACE);
			setState(801);
			element_initializer();
			setState(806);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(802);
					match(COMMA);
					setState(803);
					element_initializer();
					}
					} 
				}
				setState(808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(809);
				match(COMMA);
				}
			}

			setState(812);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_initializerContext extends ParserRuleContext {
		public Anonymous_function_signatureContext anonymous_function_signature() {
			return getRuleContext(Anonymous_function_signatureContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Anonymous_function_bodyContext anonymous_function_body() {
			return getRuleContext(Anonymous_function_bodyContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Query_bodyContext query_body() {
			return getRuleContext(Query_bodyContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Element_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_initializer; }
	}

	public final Element_initializerContext element_initializer() throws RecognitionException {
		Element_initializerContext _localctx = new Element_initializerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_element_initializer);
		int _la;
		try {
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(815);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(814);
					match(ASYNC);
					}
					break;
				}
				setState(817);
				anonymous_function_signature();
				setState(818);
				right_arrow();
				setState(819);
				anonymous_function_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(821);
				from_clause();
				setState(822);
				query_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(824);
				expression(0);
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTERR) {
					{
					setState(825);
					match(INTERR);
					setState(826);
					expression(0);
					setState(827);
					match(COLON);
					setState(828);
					expression(0);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(832);
				match(OPEN_BRACE);
				setState(833);
				expression_list();
				setState(834);
				match(CLOSE_BRACE);
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

	public static class Anonymous_object_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Member_declarator_listContext member_declarator_list() {
			return getRuleContext(Member_declarator_listContext.class,0);
		}
		public Anonymous_object_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_object_initializer; }
	}

	public final Anonymous_object_initializerContext anonymous_object_initializer() throws RecognitionException {
		Anonymous_object_initializerContext _localctx = new Anonymous_object_initializerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_anonymous_object_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(OPEN_BRACE);
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0)) {
				{
				setState(839);
				member_declarator_list();
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(840);
					match(COMMA);
					}
				}

				}
			}

			setState(845);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_declarator_listContext extends ParserRuleContext {
		public List<Member_declaratorContext> member_declarator() {
			return getRuleContexts(Member_declaratorContext.class);
		}
		public Member_declaratorContext member_declarator(int i) {
			return getRuleContext(Member_declaratorContext.class,i);
		}
		public Member_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declarator_list; }
	}

	public final Member_declarator_listContext member_declarator_list() throws RecognitionException {
		Member_declarator_listContext _localctx = new Member_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_member_declarator_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			member_declarator();
			setState(852);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(848);
					match(COMMA);
					setState(849);
					member_declarator();
					}
					} 
				}
				setState(854);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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

	public static class Member_declaratorContext extends ParserRuleContext {
		public Primary_expression_startContext pe;
		public Primary_expression_startContext primary_expression_start() {
			return getRuleContext(Primary_expression_startContext.class,0);
		}
		public List<Indexer_argumentContext> indexer_argument() {
			return getRuleContexts(Indexer_argumentContext.class);
		}
		public Indexer_argumentContext indexer_argument(int i) {
			return getRuleContext(Indexer_argumentContext.class,i);
		}
		public List<Member_accessContext> member_access() {
			return getRuleContexts(Member_accessContext.class);
		}
		public Member_accessContext member_access(int i) {
			return getRuleContext(Member_accessContext.class,i);
		}
		public List<Method_invocationContext> method_invocation() {
			return getRuleContexts(Method_invocationContext.class);
		}
		public Method_invocationContext method_invocation(int i) {
			return getRuleContext(Method_invocationContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Member_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declarator; }
	}

	public final Member_declaratorContext member_declarator() throws RecognitionException {
		Member_declaratorContext _localctx = new Member_declaratorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_member_declarator);
		int _la;
		try {
			int _alt;
			setState(911);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				((Member_declaratorContext)_localctx).pe = primary_expression_start();
				setState(872);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(857);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INTERR) {
							{
							setState(856);
							match(INTERR);
							}
						}

						setState(859);
						match(OPEN_BRACKET);
						setState(860);
						indexer_argument();
						setState(865);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(861);
							match(COMMA);
							setState(862);
							indexer_argument();
							}
							}
							setState(867);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(868);
						match(CLOSE_BRACKET);
						}
						} 
					}
					setState(874);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (OPEN_PARENS - 126)) | (1L << (DOT - 126)) | (1L << (INTERR - 126)) | (1L << (OP_INC - 126)) | (1L << (OP_DEC - 126)) | (1L << (OP_PTR - 126)))) != 0)) {
					{
					{
					setState(881);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
					case INTERR:
						{
						setState(875);
						member_access();
						}
						break;
					case OPEN_PARENS:
						{
						setState(876);
						method_invocation();
						}
						break;
					case OP_INC:
						{
						setState(877);
						match(OP_INC);
						}
						break;
					case OP_DEC:
						{
						setState(878);
						match(OP_DEC);
						}
						break;
					case OP_PTR:
						{
						setState(879);
						match(OP_PTR);
						setState(880);
						identifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(899);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(884);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==INTERR) {
								{
								setState(883);
								match(INTERR);
								}
							}

							setState(886);
							match(OPEN_BRACKET);
							setState(887);
							indexer_argument();
							setState(892);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(888);
								match(COMMA);
								setState(889);
								indexer_argument();
								}
								}
								setState(894);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(895);
							match(CLOSE_BRACKET);
							}
							} 
						}
						setState(901);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
					}
					}
					}
					setState(906);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(907);
				identifier();
				setState(908);
				match(ASSIGNMENT);
				setState(909);
				expression(0);
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

	public static class Unbound_type_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<Generic_dimension_specifierContext> generic_dimension_specifier() {
			return getRuleContexts(Generic_dimension_specifierContext.class);
		}
		public Generic_dimension_specifierContext generic_dimension_specifier(int i) {
			return getRuleContext(Generic_dimension_specifierContext.class,i);
		}
		public Unbound_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unbound_type_name; }
	}

	public final Unbound_type_nameContext unbound_type_name() throws RecognitionException {
		Unbound_type_nameContext _localctx = new Unbound_type_nameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_unbound_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			identifier();
			setState(922);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_PARENS:
			case DOT:
			case LT:
				{
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(914);
					generic_dimension_specifier();
					}
				}

				}
				break;
			case DOUBLE_COLON:
				{
				setState(917);
				match(DOUBLE_COLON);
				setState(918);
				identifier();
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(919);
					generic_dimension_specifier();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(924);
				match(DOT);
				setState(925);
				identifier();
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(926);
					generic_dimension_specifier();
					}
				}

				}
				}
				setState(933);
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

	public static class Generic_dimension_specifierContext extends ParserRuleContext {
		public Generic_dimension_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_dimension_specifier; }
	}

	public final Generic_dimension_specifierContext generic_dimension_specifier() throws RecognitionException {
		Generic_dimension_specifierContext _localctx = new Generic_dimension_specifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_generic_dimension_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			match(LT);
			setState(938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(935);
				match(COMMA);
				}
				}
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(941);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsTypeContext extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public IsTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isType; }
	}

	public final IsTypeContext isType() throws RecognitionException {
		IsTypeContext _localctx = new IsTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_isType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			base_type();
			setState(948);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(946);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_BRACKET:
						{
						setState(944);
						rank_specifier();
						}
						break;
					case STAR:
						{
						setState(945);
						match(STAR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(950);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(951);
				match(INTERR);
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

	public static class Anonymous_function_signatureContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Explicit_anonymous_function_parameter_listContext explicit_anonymous_function_parameter_list() {
			return getRuleContext(Explicit_anonymous_function_parameter_listContext.class,0);
		}
		public Implicit_anonymous_function_parameter_listContext implicit_anonymous_function_parameter_list() {
			return getRuleContext(Implicit_anonymous_function_parameter_listContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Anonymous_function_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_function_signature; }
	}

	public final Anonymous_function_signatureContext anonymous_function_signature() throws RecognitionException {
		Anonymous_function_signatureContext _localctx = new Anonymous_function_signatureContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_anonymous_function_signature);
		try {
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				match(OPEN_PARENS);
				setState(955);
				match(CLOSE_PARENS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				match(OPEN_PARENS);
				setState(957);
				explicit_anonymous_function_parameter_list();
				setState(958);
				match(CLOSE_PARENS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(960);
				match(OPEN_PARENS);
				setState(961);
				implicit_anonymous_function_parameter_list();
				setState(962);
				match(CLOSE_PARENS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(964);
				identifier();
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

	public static class Explicit_anonymous_function_parameter_listContext extends ParserRuleContext {
		public List<Explicit_anonymous_function_parameterContext> explicit_anonymous_function_parameter() {
			return getRuleContexts(Explicit_anonymous_function_parameterContext.class);
		}
		public Explicit_anonymous_function_parameterContext explicit_anonymous_function_parameter(int i) {
			return getRuleContext(Explicit_anonymous_function_parameterContext.class,i);
		}
		public Explicit_anonymous_function_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_anonymous_function_parameter_list; }
	}

	public final Explicit_anonymous_function_parameter_listContext explicit_anonymous_function_parameter_list() throws RecognitionException {
		Explicit_anonymous_function_parameter_listContext _localctx = new Explicit_anonymous_function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_explicit_anonymous_function_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			explicit_anonymous_function_parameter();
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(968);
				match(COMMA);
				setState(969);
				explicit_anonymous_function_parameter();
				}
				}
				setState(974);
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

	public static class Explicit_anonymous_function_parameterContext extends ParserRuleContext {
		public Token refout;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public Explicit_anonymous_function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_anonymous_function_parameter; }
	}

	public final Explicit_anonymous_function_parameterContext explicit_anonymous_function_parameter() throws RecognitionException {
		Explicit_anonymous_function_parameterContext _localctx = new Explicit_anonymous_function_parameterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_explicit_anonymous_function_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUT || _la==REF) {
				{
				setState(975);
				((Explicit_anonymous_function_parameterContext)_localctx).refout = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OUT || _la==REF) ) {
					((Explicit_anonymous_function_parameterContext)_localctx).refout = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(978);
			type();
			setState(979);
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

	public static class Implicit_anonymous_function_parameter_listContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Implicit_anonymous_function_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicit_anonymous_function_parameter_list; }
	}

	public final Implicit_anonymous_function_parameter_listContext implicit_anonymous_function_parameter_list() throws RecognitionException {
		Implicit_anonymous_function_parameter_listContext _localctx = new Implicit_anonymous_function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_implicit_anonymous_function_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			identifier();
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(982);
				match(COMMA);
				setState(983);
				identifier();
				}
				}
				setState(988);
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

	public static class Anonymous_function_bodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Anonymous_function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_function_body; }
	}

	public final Anonymous_function_bodyContext anonymous_function_body() throws RecognitionException {
		Anonymous_function_bodyContext _localctx = new Anonymous_function_bodyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_anonymous_function_body);
		try {
			setState(991);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				expression(0);
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				block();
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

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(CSharpParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_from_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			match(FROM);
			setState(995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(994);
				type();
				}
				break;
			}
			setState(997);
			identifier();
			setState(998);
			match(IN);
			setState(999);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_bodyContext extends ParserRuleContext {
		public Select_or_group_clauseContext select_or_group_clause() {
			return getRuleContext(Select_or_group_clauseContext.class,0);
		}
		public List<Query_body_clauseContext> query_body_clause() {
			return getRuleContexts(Query_body_clauseContext.class);
		}
		public Query_body_clauseContext query_body_clause(int i) {
			return getRuleContext(Query_body_clauseContext.class,i);
		}
		public Query_continuationContext query_continuation() {
			return getRuleContext(Query_continuationContext.class,0);
		}
		public Query_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_body; }
	}

	public final Query_bodyContext query_body() throws RecognitionException {
		Query_bodyContext _localctx = new Query_bodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_query_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (FROM - 47)) | (1L << (JOIN - 47)) | (1L << (LET - 47)) | (1L << (ORDERBY - 47)) | (1L << (WHERE - 47)))) != 0)) {
				{
				{
				setState(1001);
				query_body_clause();
				}
				}
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1007);
			select_or_group_clause();
			setState(1009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(1008);
				query_continuation();
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

	public static class Query_body_clauseContext extends ParserRuleContext {
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Let_clauseContext let_clause() {
			return getRuleContext(Let_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Combined_join_clauseContext combined_join_clause() {
			return getRuleContext(Combined_join_clauseContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Query_body_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_body_clause; }
	}

	public final Query_body_clauseContext query_body_clause() throws RecognitionException {
		Query_body_clauseContext _localctx = new Query_body_clauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_query_body_clause);
		try {
			setState(1016);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011);
				from_clause();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1012);
				let_clause();
				}
				break;
			case WHERE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1013);
				where_clause();
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1014);
				combined_join_clause();
				}
				break;
			case ORDERBY:
				enterOuterAlt(_localctx, 5);
				{
				setState(1015);
				orderby_clause();
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

	public static class Let_clauseContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(CSharpParser.LET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Let_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_clause; }
	}

	public final Let_clauseContext let_clause() throws RecognitionException {
		Let_clauseContext _localctx = new Let_clauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_let_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			match(LET);
			setState(1019);
			identifier();
			setState(1020);
			match(ASSIGNMENT);
			setState(1021);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(CSharpParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			match(WHERE);
			setState(1024);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Combined_join_clauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(CSharpParser.JOIN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ON() { return getToken(CSharpParser.ON, 0); }
		public TerminalNode EQUALS() { return getToken(CSharpParser.EQUALS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INTO() { return getToken(CSharpParser.INTO, 0); }
		public Combined_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combined_join_clause; }
	}

	public final Combined_join_clauseContext combined_join_clause() throws RecognitionException {
		Combined_join_clauseContext _localctx = new Combined_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_combined_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(JOIN);
			setState(1028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(1027);
				type();
				}
				break;
			}
			setState(1030);
			identifier();
			setState(1031);
			match(IN);
			setState(1032);
			expression(0);
			setState(1033);
			match(ON);
			setState(1034);
			expression(0);
			setState(1035);
			match(EQUALS);
			setState(1036);
			expression(0);
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1037);
				match(INTO);
				setState(1038);
				identifier();
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

	public static class Orderby_clauseContext extends ParserRuleContext {
		public TerminalNode ORDERBY() { return getToken(CSharpParser.ORDERBY, 0); }
		public List<OrderingContext> ordering() {
			return getRuleContexts(OrderingContext.class);
		}
		public OrderingContext ordering(int i) {
			return getRuleContext(OrderingContext.class,i);
		}
		public Orderby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_clause; }
	}

	public final Orderby_clauseContext orderby_clause() throws RecognitionException {
		Orderby_clauseContext _localctx = new Orderby_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_orderby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			match(ORDERBY);
			setState(1042);
			ordering();
			setState(1047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1043);
				match(COMMA);
				setState(1044);
				ordering();
				}
				}
				setState(1049);
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

	public static class OrderingContext extends ParserRuleContext {
		public Token dir;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASCENDING() { return getToken(CSharpParser.ASCENDING, 0); }
		public TerminalNode DESCENDING() { return getToken(CSharpParser.DESCENDING, 0); }
		public OrderingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering; }
	}

	public final OrderingContext ordering() throws RecognitionException {
		OrderingContext _localctx = new OrderingContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_ordering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			expression(0);
			setState(1052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASCENDING || _la==DESCENDING) {
				{
				setState(1051);
				((OrderingContext)_localctx).dir = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASCENDING || _la==DESCENDING) ) {
					((OrderingContext)_localctx).dir = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class Select_or_group_clauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(CSharpParser.SELECT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GROUP() { return getToken(CSharpParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(CSharpParser.BY, 0); }
		public Select_or_group_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_group_clause; }
	}

	public final Select_or_group_clauseContext select_or_group_clause() throws RecognitionException {
		Select_or_group_clauseContext _localctx = new Select_or_group_clauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_select_or_group_clause);
		try {
			setState(1061);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				match(SELECT);
				setState(1055);
				expression(0);
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1056);
				match(GROUP);
				setState(1057);
				expression(0);
				setState(1058);
				match(BY);
				setState(1059);
				expression(0);
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

	public static class Query_continuationContext extends ParserRuleContext {
		public TerminalNode INTO() { return getToken(CSharpParser.INTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Query_bodyContext query_body() {
			return getRuleContext(Query_bodyContext.class,0);
		}
		public Query_continuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_continuation; }
	}

	public final Query_continuationContext query_continuation() throws RecognitionException {
		Query_continuationContext _localctx = new Query_continuationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_query_continuation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			match(INTO);
			setState(1064);
			identifier();
			setState(1065);
			query_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationStatementContext extends StatementContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public Local_constant_declarationContext local_constant_declaration() {
			return getRuleContext(Local_constant_declarationContext.class,0);
		}
		public DeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class EmbeddedStatementContext extends StatementContext {
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public EmbeddedStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class LabeledStatementContext extends StatementContext {
		public Labeled_StatementContext labeled_Statement() {
			return getRuleContext(Labeled_StatementContext.class,0);
		}
		public LabeledStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_statement);
		try {
			setState(1075);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				_localctx = new LabeledStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1067);
				labeled_Statement();
				}
				break;
			case 2:
				_localctx = new DeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BOOL:
				case BY:
				case BYTE:
				case CHAR:
				case DECIMAL:
				case DESCENDING:
				case DOUBLE:
				case DYNAMIC:
				case EQUALS:
				case FLOAT:
				case FROM:
				case GET:
				case GROUP:
				case INT:
				case INTO:
				case JOIN:
				case LET:
				case LONG:
				case NAMEOF:
				case OBJECT:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SBYTE:
				case SELECT:
				case SET:
				case SHORT:
				case STRING:
				case UINT:
				case ULONG:
				case USHORT:
				case VAR:
				case VOID:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
					{
					setState(1068);
					local_variable_declaration();
					}
					break;
				case CONST:
					{
					setState(1069);
					local_constant_declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1072);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new EmbeddedStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1074);
				embedded_statement();
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

	public static class Labeled_StatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Labeled_StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_Statement; }
	}

	public final Labeled_StatementContext labeled_Statement() throws RecognitionException {
		Labeled_StatementContext _localctx = new Labeled_StatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_labeled_Statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			identifier();
			setState(1078);
			match(COLON);
			setState(1079);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Embedded_statementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_embedded_statementContext simple_embedded_statement() {
			return getRuleContext(Simple_embedded_statementContext.class,0);
		}
		public Embedded_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_embedded_statement; }
	}

	public final Embedded_statementContext embedded_statement() throws RecognitionException {
		Embedded_statementContext _localctx = new Embedded_statementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_embedded_statement);
		try {
			setState(1083);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1081);
				block();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BREAK:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case CONTINUE:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DO:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FIXED:
			case FLOAT:
			case FOR:
			case FOREACH:
			case FROM:
			case GET:
			case GOTO:
			case GROUP:
			case IF:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LOCK:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case RETURN:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case SWITCH:
			case THIS:
			case THROW:
			case TRUE:
			case TRY:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNSAFE:
			case USHORT:
			case USING:
			case VAR:
			case WHEN:
			case WHERE:
			case WHILE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case SEMICOLON:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1082);
				simple_embedded_statement();
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

	public static class Simple_embedded_statementContext extends ParserRuleContext {
		public Simple_embedded_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_embedded_statement; }
	 
		public Simple_embedded_statementContext() { }
		public void copyFrom(Simple_embedded_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyStatementContext extends Simple_embedded_statementContext {
		public EmptyStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class TryStatementContext extends Simple_embedded_statementContext {
		public TerminalNode TRY() { return getToken(CSharpParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Catch_clausesContext catch_clauses() {
			return getRuleContext(Catch_clausesContext.class,0);
		}
		public Finally_clauseContext finally_clause() {
			return getRuleContext(Finally_clauseContext.class,0);
		}
		public TryStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class CheckedStatementContext extends Simple_embedded_statementContext {
		public TerminalNode CHECKED() { return getToken(CSharpParser.CHECKED, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CheckedStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class ThrowStatementContext extends Simple_embedded_statementContext {
		public TerminalNode THROW() { return getToken(CSharpParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class UnsafeStatementContext extends Simple_embedded_statementContext {
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UnsafeStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class ForStatementContext extends Simple_embedded_statementContext {
		public TerminalNode FOR() { return getToken(CSharpParser.FOR, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public For_initializerContext for_initializer() {
			return getRuleContext(For_initializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_iteratorContext for_iterator() {
			return getRuleContext(For_iteratorContext.class,0);
		}
		public ForStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class BreakStatementContext extends Simple_embedded_statementContext {
		public TerminalNode BREAK() { return getToken(CSharpParser.BREAK, 0); }
		public BreakStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class IfStatementContext extends Simple_embedded_statementContext {
		public TerminalNode IF() { return getToken(CSharpParser.IF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public List<If_bodyContext> if_body() {
			return getRuleContexts(If_bodyContext.class);
		}
		public If_bodyContext if_body(int i) {
			return getRuleContext(If_bodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CSharpParser.ELSE, 0); }
		public IfStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnStatementContext extends Simple_embedded_statementContext {
		public TerminalNode RETURN() { return getToken(CSharpParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class GotoStatementContext extends Simple_embedded_statementContext {
		public TerminalNode GOTO() { return getToken(CSharpParser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CASE() { return getToken(CSharpParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public GotoStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class SwitchStatementContext extends Simple_embedded_statementContext {
		public TerminalNode SWITCH() { return getToken(CSharpParser.SWITCH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Switch_sectionContext> switch_section() {
			return getRuleContexts(Switch_sectionContext.class);
		}
		public Switch_sectionContext switch_section(int i) {
			return getRuleContext(Switch_sectionContext.class,i);
		}
		public SwitchStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class FixedStatementContext extends Simple_embedded_statementContext {
		public TerminalNode FIXED() { return getToken(CSharpParser.FIXED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Pointer_typeContext pointer_type() {
			return getRuleContext(Pointer_typeContext.class,0);
		}
		public Fixed_pointer_declaratorsContext fixed_pointer_declarators() {
			return getRuleContext(Fixed_pointer_declaratorsContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public FixedStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class WhileStatementContext extends Simple_embedded_statementContext {
		public TerminalNode WHILE() { return getToken(CSharpParser.WHILE, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public WhileStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class DoStatementContext extends Simple_embedded_statementContext {
		public TerminalNode DO() { return getToken(CSharpParser.DO, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CSharpParser.WHILE, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public DoStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class ForeachStatementContext extends Simple_embedded_statementContext {
		public TerminalNode FOREACH() { return getToken(CSharpParser.FOREACH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Local_variable_typeContext local_variable_type() {
			return getRuleContext(Local_variable_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public ForeachStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class UncheckedStatementContext extends Simple_embedded_statementContext {
		public TerminalNode UNCHECKED() { return getToken(CSharpParser.UNCHECKED, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UncheckedStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class ExpressionStatementContext extends Simple_embedded_statementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class ContinueStatementContext extends Simple_embedded_statementContext {
		public TerminalNode CONTINUE() { return getToken(CSharpParser.CONTINUE, 0); }
		public ContinueStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class UsingStatementContext extends Simple_embedded_statementContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Resource_acquisitionContext resource_acquisition() {
			return getRuleContext(Resource_acquisitionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public UsingStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class LockStatementContext extends Simple_embedded_statementContext {
		public TerminalNode LOCK() { return getToken(CSharpParser.LOCK, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public LockStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class YieldStatementContext extends Simple_embedded_statementContext {
		public TerminalNode YIELD() { return getToken(CSharpParser.YIELD, 0); }
		public TerminalNode RETURN() { return getToken(CSharpParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(CSharpParser.BREAK, 0); }
		public YieldStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}

	public final Simple_embedded_statementContext simple_embedded_statement() throws RecognitionException {
		Simple_embedded_statementContext _localctx = new Simple_embedded_statementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_simple_embedded_statement);
		int _la;
		try {
			setState(1212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				_localctx = new EmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1085);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1086);
				expression(0);
				setState(1087);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1089);
				match(IF);
				setState(1090);
				match(OPEN_PARENS);
				setState(1091);
				expression(0);
				setState(1092);
				match(CLOSE_PARENS);
				setState(1093);
				if_body();
				setState(1096);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(1094);
					match(ELSE);
					setState(1095);
					if_body();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1098);
				match(SWITCH);
				setState(1099);
				match(OPEN_PARENS);
				setState(1100);
				expression(0);
				setState(1101);
				match(CLOSE_PARENS);
				setState(1102);
				match(OPEN_BRACE);
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1103);
					switch_section();
					}
					}
					setState(1108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1109);
				match(CLOSE_BRACE);
				}
				break;
			case 5:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1111);
				match(WHILE);
				setState(1112);
				match(OPEN_PARENS);
				setState(1113);
				expression(0);
				setState(1114);
				match(CLOSE_PARENS);
				setState(1115);
				embedded_statement();
				}
				break;
			case 6:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1117);
				match(DO);
				setState(1118);
				embedded_statement();
				setState(1119);
				match(WHILE);
				setState(1120);
				match(OPEN_PARENS);
				setState(1121);
				expression(0);
				setState(1122);
				match(CLOSE_PARENS);
				setState(1123);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1125);
				match(FOR);
				setState(1126);
				match(OPEN_PARENS);
				setState(1128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VOID - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
					{
					setState(1127);
					for_initializer();
					}
				}

				setState(1130);
				match(SEMICOLON);
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
					{
					setState(1131);
					expression(0);
					}
				}

				setState(1134);
				match(SEMICOLON);
				setState(1136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
					{
					setState(1135);
					for_iterator();
					}
				}

				setState(1138);
				match(CLOSE_PARENS);
				setState(1139);
				embedded_statement();
				}
				break;
			case 8:
				_localctx = new ForeachStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1140);
				match(FOREACH);
				setState(1141);
				match(OPEN_PARENS);
				setState(1142);
				local_variable_type();
				setState(1143);
				identifier();
				setState(1144);
				match(IN);
				setState(1145);
				expression(0);
				setState(1146);
				match(CLOSE_PARENS);
				setState(1147);
				embedded_statement();
				}
				break;
			case 9:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1149);
				match(BREAK);
				setState(1150);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1151);
				match(CONTINUE);
				setState(1152);
				match(SEMICOLON);
				}
				break;
			case 11:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1153);
				match(GOTO);
				setState(1158);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BY:
				case DESCENDING:
				case DYNAMIC:
				case EQUALS:
				case FROM:
				case GET:
				case GROUP:
				case INTO:
				case JOIN:
				case LET:
				case NAMEOF:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SELECT:
				case SET:
				case VAR:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
					{
					setState(1154);
					identifier();
					}
					break;
				case CASE:
					{
					setState(1155);
					match(CASE);
					setState(1156);
					expression(0);
					}
					break;
				case DEFAULT:
					{
					setState(1157);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1160);
				match(SEMICOLON);
				}
				break;
			case 12:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1161);
				match(RETURN);
				setState(1163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
					{
					setState(1162);
					expression(0);
					}
				}

				setState(1165);
				match(SEMICOLON);
				}
				break;
			case 13:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1166);
				match(THROW);
				setState(1168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
					{
					setState(1167);
					expression(0);
					}
				}

				setState(1170);
				match(SEMICOLON);
				}
				break;
			case 14:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1171);
				match(TRY);
				setState(1172);
				block();
				setState(1178);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1173);
					catch_clauses();
					setState(1175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1174);
						finally_clause();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1177);
					finally_clause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 15:
				_localctx = new CheckedStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1180);
				match(CHECKED);
				setState(1181);
				block();
				}
				break;
			case 16:
				_localctx = new UncheckedStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1182);
				match(UNCHECKED);
				setState(1183);
				block();
				}
				break;
			case 17:
				_localctx = new LockStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1184);
				match(LOCK);
				setState(1185);
				match(OPEN_PARENS);
				setState(1186);
				expression(0);
				setState(1187);
				match(CLOSE_PARENS);
				setState(1188);
				embedded_statement();
				}
				break;
			case 18:
				_localctx = new UsingStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1190);
				match(USING);
				setState(1191);
				match(OPEN_PARENS);
				setState(1192);
				resource_acquisition();
				setState(1193);
				match(CLOSE_PARENS);
				setState(1194);
				embedded_statement();
				}
				break;
			case 19:
				_localctx = new YieldStatementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(1196);
				match(YIELD);
				setState(1200);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RETURN:
					{
					setState(1197);
					match(RETURN);
					setState(1198);
					expression(0);
					}
					break;
				case BREAK:
					{
					setState(1199);
					match(BREAK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1202);
				match(SEMICOLON);
				}
				break;
			case 20:
				_localctx = new UnsafeStatementContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(1203);
				match(UNSAFE);
				setState(1204);
				block();
				}
				break;
			case 21:
				_localctx = new FixedStatementContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(1205);
				match(FIXED);
				setState(1206);
				match(OPEN_PARENS);
				setState(1207);
				pointer_type();
				setState(1208);
				fixed_pointer_declarators();
				setState(1209);
				match(CLOSE_PARENS);
				setState(1210);
				embedded_statement();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(OPEN_BRACE);
			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BREAK) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << CONST) | (1L << CONTINUE) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DO) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FIXED) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << FROM) | (1L << GET) | (1L << GOTO) | (1L << GROUP) | (1L << IF) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LOCK) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (RETURN - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (SWITCH - 65)) | (1L << (THIS - 65)) | (1L << (THROW - 65)) | (1L << (TRUE - 65)) | (1L << (TRY - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (UNSAFE - 65)) | (1L << (USHORT - 65)) | (1L << (USING - 65)) | (1L << (VAR - 65)) | (1L << (VOID - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (WHILE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_BRACE - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (SEMICOLON - 131)) | (1L << (PLUS - 131)) | (1L << (MINUS - 131)) | (1L << (STAR - 131)) | (1L << (AMP - 131)) | (1L << (BANG - 131)) | (1L << (TILDE - 131)) | (1L << (OP_INC - 131)) | (1L << (OP_DEC - 131)))) != 0)) {
				{
				setState(1215);
				statement_list();
				}
			}

			setState(1218);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_declarationContext extends ParserRuleContext {
		public Local_variable_typeContext local_variable_type() {
			return getRuleContext(Local_variable_typeContext.class,0);
		}
		public List<Local_variable_declaratorContext> local_variable_declarator() {
			return getRuleContexts(Local_variable_declaratorContext.class);
		}
		public Local_variable_declaratorContext local_variable_declarator(int i) {
			return getRuleContext(Local_variable_declaratorContext.class,i);
		}
		public Local_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_declaration; }
	}

	public final Local_variable_declarationContext local_variable_declaration() throws RecognitionException {
		Local_variable_declarationContext _localctx = new Local_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_local_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			local_variable_type();
			setState(1221);
			local_variable_declarator();
			setState(1226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1222);
				match(COMMA);
				setState(1223);
				local_variable_declarator();
				}
				}
				setState(1228);
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

	public static class Local_variable_typeContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(CSharpParser.VAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Local_variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_type; }
	}

	public final Local_variable_typeContext local_variable_type() throws RecognitionException {
		Local_variable_typeContext _localctx = new Local_variable_typeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_local_variable_type);
		try {
			setState(1231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1229);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1230);
				type();
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

	public static class Local_variable_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Local_variable_initializerContext local_variable_initializer() {
			return getRuleContext(Local_variable_initializerContext.class,0);
		}
		public Local_variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_declarator; }
	}

	public final Local_variable_declaratorContext local_variable_declarator() throws RecognitionException {
		Local_variable_declaratorContext _localctx = new Local_variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_local_variable_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			identifier();
			setState(1236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(1234);
				match(ASSIGNMENT);
				setState(1235);
				local_variable_initializer();
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

	public static class Local_variable_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Local_variable_initializer_unsafeContext local_variable_initializer_unsafe() {
			return getRuleContext(Local_variable_initializer_unsafeContext.class,0);
		}
		public Local_variable_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_initializer; }
	}

	public final Local_variable_initializerContext local_variable_initializer() throws RecognitionException {
		Local_variable_initializerContext _localctx = new Local_variable_initializerContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_local_variable_initializer);
		try {
			setState(1241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1238);
				expression(0);
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1239);
				array_initializer();
				}
				break;
			case STACKALLOC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1240);
				local_variable_initializer_unsafe();
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

	public static class Local_constant_declarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(CSharpParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Constant_declaratorsContext constant_declarators() {
			return getRuleContext(Constant_declaratorsContext.class,0);
		}
		public Local_constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_constant_declaration; }
	}

	public final Local_constant_declarationContext local_constant_declaration() throws RecognitionException {
		Local_constant_declarationContext _localctx = new Local_constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_local_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			match(CONST);
			setState(1244);
			type();
			setState(1245);
			constant_declarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_embedded_statementContext simple_embedded_statement() {
			return getRuleContext(Simple_embedded_statementContext.class,0);
		}
		public If_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_body; }
	}

	public final If_bodyContext if_body() throws RecognitionException {
		If_bodyContext _localctx = new If_bodyContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_if_body);
		try {
			setState(1249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1247);
				block();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BREAK:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case CONTINUE:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DO:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FIXED:
			case FLOAT:
			case FOR:
			case FOREACH:
			case FROM:
			case GET:
			case GOTO:
			case GROUP:
			case IF:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LOCK:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case RETURN:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case SWITCH:
			case THIS:
			case THROW:
			case TRUE:
			case TRY:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNSAFE:
			case USHORT:
			case USING:
			case VAR:
			case WHEN:
			case WHERE:
			case WHILE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case SEMICOLON:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1248);
				simple_embedded_statement();
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

	public static class Switch_sectionContext extends ParserRuleContext {
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public List<Switch_labelContext> switch_label() {
			return getRuleContexts(Switch_labelContext.class);
		}
		public Switch_labelContext switch_label(int i) {
			return getRuleContext(Switch_labelContext.class,i);
		}
		public Switch_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_section; }
	}

	public final Switch_sectionContext switch_section() throws RecognitionException {
		Switch_sectionContext _localctx = new Switch_sectionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_switch_section);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1252); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1251);
					switch_label();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1254); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1256);
			statement_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_labelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(CSharpParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public Switch_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_label; }
	}

	public final Switch_labelContext switch_label() throws RecognitionException {
		Switch_labelContext _localctx = new Switch_labelContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_switch_label);
		try {
			setState(1264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1258);
				match(CASE);
				setState(1259);
				expression(0);
				setState(1260);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1262);
				match(DEFAULT);
				setState(1263);
				match(COLON);
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

	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1267); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1266);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1269); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_initializerContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public For_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_initializer; }
	}

	public final For_initializerContext for_initializer() throws RecognitionException {
		For_initializerContext _localctx = new For_initializerContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_for_initializer);
		int _la;
		try {
			setState(1280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1271);
				local_variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1272);
				expression(0);
				setState(1277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1273);
					match(COMMA);
					setState(1274);
					expression(0);
					}
					}
					setState(1279);
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

	public static class For_iteratorContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public For_iteratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_iterator; }
	}

	public final For_iteratorContext for_iterator() throws RecognitionException {
		For_iteratorContext _localctx = new For_iteratorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_for_iterator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			expression(0);
			setState(1287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1283);
				match(COMMA);
				setState(1284);
				expression(0);
				}
				}
				setState(1289);
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

	public static class Catch_clausesContext extends ParserRuleContext {
		public List<Specific_catch_clauseContext> specific_catch_clause() {
			return getRuleContexts(Specific_catch_clauseContext.class);
		}
		public Specific_catch_clauseContext specific_catch_clause(int i) {
			return getRuleContext(Specific_catch_clauseContext.class,i);
		}
		public General_catch_clauseContext general_catch_clause() {
			return getRuleContext(General_catch_clauseContext.class,0);
		}
		public Catch_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clauses; }
	}

	public final Catch_clausesContext catch_clauses() throws RecognitionException {
		Catch_clausesContext _localctx = new Catch_clausesContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_catch_clauses);
		int _la;
		try {
			int _alt;
			setState(1301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1290);
				specific_catch_clause();
				setState(1294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1291);
						specific_catch_clause();
						}
						} 
					}
					setState(1296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				}
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1297);
					general_catch_clause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1300);
				general_catch_clause();
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

	public static class Specific_catch_clauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(CSharpParser.CATCH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Exception_filterContext exception_filter() {
			return getRuleContext(Exception_filterContext.class,0);
		}
		public Specific_catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specific_catch_clause; }
	}

	public final Specific_catch_clauseContext specific_catch_clause() throws RecognitionException {
		Specific_catch_clauseContext _localctx = new Specific_catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_specific_catch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			match(CATCH);
			setState(1304);
			match(OPEN_PARENS);
			setState(1305);
			class_type();
			setState(1307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << NAMEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ON - 68)) | (1L << (ORDERBY - 68)) | (1L << (PARTIAL - 68)) | (1L << (REMOVE - 68)) | (1L << (SELECT - 68)) | (1L << (SET - 68)) | (1L << (VAR - 68)) | (1L << (WHEN - 68)) | (1L << (WHERE - 68)) | (1L << (YIELD - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				setState(1306);
				identifier();
				}
			}

			setState(1309);
			match(CLOSE_PARENS);
			setState(1311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1310);
				exception_filter();
				}
			}

			setState(1313);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class General_catch_clauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(CSharpParser.CATCH, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Exception_filterContext exception_filter() {
			return getRuleContext(Exception_filterContext.class,0);
		}
		public General_catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_catch_clause; }
	}

	public final General_catch_clauseContext general_catch_clause() throws RecognitionException {
		General_catch_clauseContext _localctx = new General_catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_general_catch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			match(CATCH);
			setState(1317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1316);
				exception_filter();
				}
			}

			setState(1319);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_filterContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(CSharpParser.WHEN, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Exception_filterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_filter; }
	}

	public final Exception_filterContext exception_filter() throws RecognitionException {
		Exception_filterContext _localctx = new Exception_filterContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_exception_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			match(WHEN);
			setState(1322);
			match(OPEN_PARENS);
			setState(1323);
			expression(0);
			setState(1324);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_clauseContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(CSharpParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_clause; }
	}

	public final Finally_clauseContext finally_clause() throws RecognitionException {
		Finally_clauseContext _localctx = new Finally_clauseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_finally_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			match(FINALLY);
			setState(1327);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Resource_acquisitionContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Resource_acquisitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_acquisition; }
	}

	public final Resource_acquisitionContext resource_acquisition() throws RecognitionException {
		Resource_acquisitionContext _localctx = new Resource_acquisitionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_resource_acquisition);
		try {
			setState(1331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1329);
				local_variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1330);
				expression(0);
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

	public static class Namespace_declarationContext extends ParserRuleContext {
		public Qualified_identifierContext qi;
		public TerminalNode NAMESPACE() { return getToken(CSharpParser.NAMESPACE, 0); }
		public Namespace_bodyContext namespace_body() {
			return getRuleContext(Namespace_bodyContext.class,0);
		}
		public Qualified_identifierContext qualified_identifier() {
			return getRuleContext(Qualified_identifierContext.class,0);
		}
		public Namespace_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_declaration; }
	}

	public final Namespace_declarationContext namespace_declaration() throws RecognitionException {
		Namespace_declarationContext _localctx = new Namespace_declarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_namespace_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			match(NAMESPACE);
			setState(1334);
			((Namespace_declarationContext)_localctx).qi = qualified_identifier();
			setState(1335);
			namespace_body();
			setState(1337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(1336);
				match(SEMICOLON);
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

	public static class Qualified_identifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Qualified_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_identifier; }
	}

	public final Qualified_identifierContext qualified_identifier() throws RecognitionException {
		Qualified_identifierContext _localctx = new Qualified_identifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_qualified_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1339);
			identifier();
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1340);
				match(DOT);
				setState(1341);
				identifier();
				}
				}
				setState(1346);
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

	public static class Namespace_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Extern_alias_directivesContext extern_alias_directives() {
			return getRuleContext(Extern_alias_directivesContext.class,0);
		}
		public Using_directivesContext using_directives() {
			return getRuleContext(Using_directivesContext.class,0);
		}
		public Namespace_member_declarationsContext namespace_member_declarations() {
			return getRuleContext(Namespace_member_declarationsContext.class,0);
		}
		public Namespace_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_body; }
	}

	public final Namespace_bodyContext namespace_body() throws RecognitionException {
		Namespace_bodyContext _localctx = new Namespace_bodyContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_namespace_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			match(OPEN_BRACE);
			setState(1349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1348);
				extern_alias_directives();
				}
				break;
			}
			setState(1352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1351);
				using_directives();
				}
			}

			setState(1355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << CLASS) | (1L << DELEGATE) | (1L << ENUM) | (1L << EXTERN) | (1L << INTERFACE) | (1L << INTERNAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMESPACE - 64)) | (1L << (NEW - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PARTIAL - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (SEALED - 64)) | (1L << (STATIC - 64)) | (1L << (STRUCT - 64)) | (1L << (UNSAFE - 64)) | (1L << (VIRTUAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0)) {
				{
				setState(1354);
				namespace_member_declarations();
				}
			}

			setState(1357);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extern_alias_directivesContext extends ParserRuleContext {
		public List<Extern_alias_directiveContext> extern_alias_directive() {
			return getRuleContexts(Extern_alias_directiveContext.class);
		}
		public Extern_alias_directiveContext extern_alias_directive(int i) {
			return getRuleContext(Extern_alias_directiveContext.class,i);
		}
		public Extern_alias_directivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern_alias_directives; }
	}

	public final Extern_alias_directivesContext extern_alias_directives() throws RecognitionException {
		Extern_alias_directivesContext _localctx = new Extern_alias_directivesContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_extern_alias_directives);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1360); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1359);
					extern_alias_directive();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1362); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extern_alias_directiveContext extends ParserRuleContext {
		public TerminalNode EXTERN() { return getToken(CSharpParser.EXTERN, 0); }
		public TerminalNode ALIAS() { return getToken(CSharpParser.ALIAS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Extern_alias_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern_alias_directive; }
	}

	public final Extern_alias_directiveContext extern_alias_directive() throws RecognitionException {
		Extern_alias_directiveContext _localctx = new Extern_alias_directiveContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_extern_alias_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			match(EXTERN);
			setState(1365);
			match(ALIAS);
			setState(1366);
			identifier();
			setState(1367);
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

	public static class Using_directivesContext extends ParserRuleContext {
		public List<Using_directiveContext> using_directive() {
			return getRuleContexts(Using_directiveContext.class);
		}
		public Using_directiveContext using_directive(int i) {
			return getRuleContext(Using_directiveContext.class,i);
		}
		public Using_directivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directives; }
	}

	public final Using_directivesContext using_directives() throws RecognitionException {
		Using_directivesContext _localctx = new Using_directivesContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_using_directives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1370); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1369);
				using_directive();
				}
				}
				setState(1372); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USING );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Using_directiveContext extends ParserRuleContext {
		public Using_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directive; }
	 
		public Using_directiveContext() { }
		public void copyFrom(Using_directiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UsingAliasDirectiveContext extends Using_directiveContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public UsingAliasDirectiveContext(Using_directiveContext ctx) { copyFrom(ctx); }
	}
	public static class UsingNamespaceDirectiveContext extends Using_directiveContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public UsingNamespaceDirectiveContext(Using_directiveContext ctx) { copyFrom(ctx); }
	}
	public static class UsingStaticDirectiveContext extends Using_directiveContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public UsingStaticDirectiveContext(Using_directiveContext ctx) { copyFrom(ctx); }
	}

	public final Using_directiveContext using_directive() throws RecognitionException {
		Using_directiveContext _localctx = new Using_directiveContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_using_directive);
		try {
			setState(1389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				_localctx = new UsingAliasDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1374);
				match(USING);
				setState(1375);
				identifier();
				setState(1376);
				match(ASSIGNMENT);
				setState(1377);
				namespace_or_type_name();
				setState(1378);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new UsingNamespaceDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1380);
				match(USING);
				setState(1381);
				namespace_or_type_name();
				setState(1382);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new UsingStaticDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1384);
				match(USING);
				setState(1385);
				match(STATIC);
				setState(1386);
				namespace_or_type_name();
				setState(1387);
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

	public static class Namespace_member_declarationsContext extends ParserRuleContext {
		public List<Namespace_member_declarationContext> namespace_member_declaration() {
			return getRuleContexts(Namespace_member_declarationContext.class);
		}
		public Namespace_member_declarationContext namespace_member_declaration(int i) {
			return getRuleContext(Namespace_member_declarationContext.class,i);
		}
		public Namespace_member_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_member_declarations; }
	}

	public final Namespace_member_declarationsContext namespace_member_declarations() throws RecognitionException {
		Namespace_member_declarationsContext _localctx = new Namespace_member_declarationsContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_namespace_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1391);
				namespace_member_declaration();
				}
				}
				setState(1394); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << CLASS) | (1L << DELEGATE) | (1L << ENUM) | (1L << EXTERN) | (1L << INTERFACE) | (1L << INTERNAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMESPACE - 64)) | (1L << (NEW - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PARTIAL - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (SEALED - 64)) | (1L << (STATIC - 64)) | (1L << (STRUCT - 64)) | (1L << (UNSAFE - 64)) | (1L << (VIRTUAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_member_declarationContext extends ParserRuleContext {
		public Namespace_declarationContext namespace_declaration() {
			return getRuleContext(Namespace_declarationContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Namespace_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_member_declaration; }
	}

	public final Namespace_member_declarationContext namespace_member_declaration() throws RecognitionException {
		Namespace_member_declarationContext _localctx = new Namespace_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_namespace_member_declaration);
		try {
			setState(1398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1396);
				namespace_declaration();
				}
				break;
			case ABSTRACT:
			case ASYNC:
			case CLASS:
			case DELEGATE:
			case ENUM:
			case EXTERN:
			case INTERFACE:
			case INTERNAL:
			case NEW:
			case OVERRIDE:
			case PARTIAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case READONLY:
			case SEALED:
			case STATIC:
			case STRUCT:
			case UNSAFE:
			case VIRTUAL:
			case VOLATILE:
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1397);
				type_declaration();
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

	public static class Type_declarationContext extends ParserRuleContext {
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public Struct_definitionContext struct_definition() {
			return getRuleContext(Struct_definitionContext.class,0);
		}
		public Interface_definitionContext interface_definition() {
			return getRuleContext(Interface_definitionContext.class,0);
		}
		public Enum_definitionContext enum_definition() {
			return getRuleContext(Enum_definitionContext.class,0);
		}
		public Delegate_definitionContext delegate_definition() {
			return getRuleContext(Delegate_definitionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public Type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration; }
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1400);
				attributes();
				}
			}

			setState(1404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << EXTERN) | (1L << INTERNAL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (SEALED - 65)) | (1L << (STATIC - 65)) | (1L << (UNSAFE - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOLATILE - 65)))) != 0)) {
				{
				setState(1403);
				all_member_modifiers();
				}
			}

			setState(1411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(1406);
				class_definition();
				}
				break;
			case STRUCT:
				{
				setState(1407);
				struct_definition();
				}
				break;
			case INTERFACE:
				{
				setState(1408);
				interface_definition();
				}
				break;
			case ENUM:
				{
				setState(1409);
				enum_definition();
				}
				break;
			case DELEGATE:
				{
				setState(1410);
				delegate_definition();
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

	public static class Qualified_alias_memberContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public Qualified_alias_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_alias_member; }
	}

	public final Qualified_alias_memberContext qualified_alias_member() throws RecognitionException {
		Qualified_alias_memberContext _localctx = new Qualified_alias_memberContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_qualified_alias_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			identifier();
			setState(1414);
			match(DOUBLE_COLON);
			setState(1415);
			identifier();
			setState(1417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1416);
				type_argument_list();
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

	public static class Type_parameter_listContext extends ParserRuleContext {
		public List<Type_parameterContext> type_parameter() {
			return getRuleContexts(Type_parameterContext.class);
		}
		public Type_parameterContext type_parameter(int i) {
			return getRuleContext(Type_parameterContext.class,i);
		}
		public Type_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_list; }
	}

	public final Type_parameter_listContext type_parameter_list() throws RecognitionException {
		Type_parameter_listContext _localctx = new Type_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_type_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			match(LT);
			setState(1420);
			type_parameter();
			setState(1425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1421);
				match(COMMA);
				setState(1422);
				type_parameter();
				}
				}
				setState(1427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1428);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Type_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter; }
	}

	public final Type_parameterContext type_parameter() throws RecognitionException {
		Type_parameterContext _localctx = new Type_parameterContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_type_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1430);
				attributes();
				}
			}

			setState(1433);
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

	public static class Class_baseContext extends ParserRuleContext {
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public List<Namespace_or_type_nameContext> namespace_or_type_name() {
			return getRuleContexts(Namespace_or_type_nameContext.class);
		}
		public Namespace_or_type_nameContext namespace_or_type_name(int i) {
			return getRuleContext(Namespace_or_type_nameContext.class,i);
		}
		public Class_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_base; }
	}

	public final Class_baseContext class_base() throws RecognitionException {
		Class_baseContext _localctx = new Class_baseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_class_base);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
			match(COLON);
			setState(1436);
			class_type();
			setState(1441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1437);
				match(COMMA);
				setState(1438);
				namespace_or_type_name();
				}
				}
				setState(1443);
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

	public static class Interface_type_listContext extends ParserRuleContext {
		public List<Namespace_or_type_nameContext> namespace_or_type_name() {
			return getRuleContexts(Namespace_or_type_nameContext.class);
		}
		public Namespace_or_type_nameContext namespace_or_type_name(int i) {
			return getRuleContext(Namespace_or_type_nameContext.class,i);
		}
		public Interface_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_type_list; }
	}

	public final Interface_type_listContext interface_type_list() throws RecognitionException {
		Interface_type_listContext _localctx = new Interface_type_listContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_interface_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			namespace_or_type_name();
			setState(1449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1445);
				match(COMMA);
				setState(1446);
				namespace_or_type_name();
				}
				}
				setState(1451);
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

	public static class Type_parameter_constraints_clausesContext extends ParserRuleContext {
		public List<Type_parameter_constraints_clauseContext> type_parameter_constraints_clause() {
			return getRuleContexts(Type_parameter_constraints_clauseContext.class);
		}
		public Type_parameter_constraints_clauseContext type_parameter_constraints_clause(int i) {
			return getRuleContext(Type_parameter_constraints_clauseContext.class,i);
		}
		public Type_parameter_constraints_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_constraints_clauses; }
	}

	public final Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() throws RecognitionException {
		Type_parameter_constraints_clausesContext _localctx = new Type_parameter_constraints_clausesContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_type_parameter_constraints_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1452);
				type_parameter_constraints_clause();
				}
				}
				setState(1455); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHERE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameter_constraints_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(CSharpParser.WHERE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_parameter_constraintsContext type_parameter_constraints() {
			return getRuleContext(Type_parameter_constraintsContext.class,0);
		}
		public Type_parameter_constraints_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_constraints_clause; }
	}

	public final Type_parameter_constraints_clauseContext type_parameter_constraints_clause() throws RecognitionException {
		Type_parameter_constraints_clauseContext _localctx = new Type_parameter_constraints_clauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_type_parameter_constraints_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			match(WHERE);
			setState(1458);
			identifier();
			setState(1459);
			match(COLON);
			setState(1460);
			type_parameter_constraints();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameter_constraintsContext extends ParserRuleContext {
		public Constructor_constraintContext constructor_constraint() {
			return getRuleContext(Constructor_constraintContext.class,0);
		}
		public Primary_constraintContext primary_constraint() {
			return getRuleContext(Primary_constraintContext.class,0);
		}
		public Secondary_constraintsContext secondary_constraints() {
			return getRuleContext(Secondary_constraintsContext.class,0);
		}
		public Type_parameter_constraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_constraints; }
	}

	public final Type_parameter_constraintsContext type_parameter_constraints() throws RecognitionException {
		Type_parameter_constraintsContext _localctx = new Type_parameter_constraintsContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_type_parameter_constraints);
		int _la;
		try {
			setState(1472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1462);
				constructor_constraint();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case CLASS:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case STRING:
			case STRUCT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1463);
				primary_constraint();
				setState(1466);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1464);
					match(COMMA);
					setState(1465);
					secondary_constraints();
					}
					break;
				}
				setState(1470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1468);
					match(COMMA);
					setState(1469);
					constructor_constraint();
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

	public static class Primary_constraintContext extends ParserRuleContext {
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(CSharpParser.CLASS, 0); }
		public TerminalNode STRUCT() { return getToken(CSharpParser.STRUCT, 0); }
		public Primary_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_constraint; }
	}

	public final Primary_constraintContext primary_constraint() throws RecognitionException {
		Primary_constraintContext _localctx = new Primary_constraintContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_primary_constraint);
		try {
			setState(1477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case STRING:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1474);
				class_type();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1475);
				match(CLASS);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1476);
				match(STRUCT);
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

	public static class Secondary_constraintsContext extends ParserRuleContext {
		public List<Namespace_or_type_nameContext> namespace_or_type_name() {
			return getRuleContexts(Namespace_or_type_nameContext.class);
		}
		public Namespace_or_type_nameContext namespace_or_type_name(int i) {
			return getRuleContext(Namespace_or_type_nameContext.class,i);
		}
		public Secondary_constraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondary_constraints; }
	}

	public final Secondary_constraintsContext secondary_constraints() throws RecognitionException {
		Secondary_constraintsContext _localctx = new Secondary_constraintsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_secondary_constraints);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			namespace_or_type_name();
			setState(1484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1480);
					match(COMMA);
					setState(1481);
					namespace_or_type_name();
					}
					} 
				}
				setState(1486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
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

	public static class Constructor_constraintContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Constructor_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_constraint; }
	}

	public final Constructor_constraintContext constructor_constraint() throws RecognitionException {
		Constructor_constraintContext _localctx = new Constructor_constraintContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_constructor_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			match(NEW);
			setState(1488);
			match(OPEN_PARENS);
			setState(1489);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Class_member_declarationsContext class_member_declarations() {
			return getRuleContext(Class_member_declarationsContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			match(OPEN_BRACE);
			setState(1493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << DECIMAL) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << ENUM) | (1L << EQUALS) | (1L << EVENT) | (1L << EXPLICIT) | (1L << EXTERN) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IMPLICIT) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SEALED - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (STRUCT - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNSAFE - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOID - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (OPEN_BRACKET - 65)))) != 0) || _la==TILDE) {
				{
				setState(1492);
				class_member_declarations();
				}
			}

			setState(1495);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_member_declarationsContext extends ParserRuleContext {
		public List<Class_member_declarationContext> class_member_declaration() {
			return getRuleContexts(Class_member_declarationContext.class);
		}
		public Class_member_declarationContext class_member_declaration(int i) {
			return getRuleContext(Class_member_declarationContext.class,i);
		}
		public Class_member_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member_declarations; }
	}

	public final Class_member_declarationsContext class_member_declarations() throws RecognitionException {
		Class_member_declarationsContext _localctx = new Class_member_declarationsContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_class_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1497);
				class_member_declaration();
				}
				}
				setState(1500); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << DECIMAL) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << ENUM) | (1L << EQUALS) | (1L << EVENT) | (1L << EXPLICIT) | (1L << EXTERN) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IMPLICIT) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SEALED - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (STRUCT - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNSAFE - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOID - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (OPEN_BRACKET - 65)))) != 0) || _la==TILDE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_member_declarationContext extends ParserRuleContext {
		public Common_member_declarationContext common_member_declaration() {
			return getRuleContext(Common_member_declarationContext.class,0);
		}
		public Destructor_definitionContext destructor_definition() {
			return getRuleContext(Destructor_definitionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public Class_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member_declaration; }
	}

	public final Class_member_declarationContext class_member_declaration() throws RecognitionException {
		Class_member_declarationContext _localctx = new Class_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_class_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1502);
				attributes();
				}
			}

			setState(1506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1505);
				all_member_modifiers();
				}
				break;
			}
			setState(1510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CLASS:
			case CONST:
			case DECIMAL:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case ENUM:
			case EQUALS:
			case EVENT:
			case EXPLICIT:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case IMPLICIT:
			case INT:
			case INTERFACE:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case STRUCT:
			case UINT:
			case ULONG:
			case USHORT:
			case VAR:
			case VOID:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				{
				setState(1508);
				common_member_declaration();
				}
				break;
			case TILDE:
				{
				setState(1509);
				destructor_definition();
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

	public static class All_member_modifiersContext extends ParserRuleContext {
		public List<All_member_modifierContext> all_member_modifier() {
			return getRuleContexts(All_member_modifierContext.class);
		}
		public All_member_modifierContext all_member_modifier(int i) {
			return getRuleContext(All_member_modifierContext.class,i);
		}
		public All_member_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_member_modifiers; }
	}

	public final All_member_modifiersContext all_member_modifiers() throws RecognitionException {
		All_member_modifiersContext _localctx = new All_member_modifiersContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_all_member_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1513); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1512);
					all_member_modifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1515); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_member_modifierContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode PUBLIC() { return getToken(CSharpParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(CSharpParser.PROTECTED, 0); }
		public TerminalNode INTERNAL() { return getToken(CSharpParser.INTERNAL, 0); }
		public TerminalNode PRIVATE() { return getToken(CSharpParser.PRIVATE, 0); }
		public TerminalNode READONLY() { return getToken(CSharpParser.READONLY, 0); }
		public TerminalNode VOLATILE() { return getToken(CSharpParser.VOLATILE, 0); }
		public TerminalNode VIRTUAL() { return getToken(CSharpParser.VIRTUAL, 0); }
		public TerminalNode SEALED() { return getToken(CSharpParser.SEALED, 0); }
		public TerminalNode OVERRIDE() { return getToken(CSharpParser.OVERRIDE, 0); }
		public TerminalNode ABSTRACT() { return getToken(CSharpParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public TerminalNode EXTERN() { return getToken(CSharpParser.EXTERN, 0); }
		public TerminalNode PARTIAL() { return getToken(CSharpParser.PARTIAL, 0); }
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public All_member_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_member_modifier; }
	}

	public final All_member_modifierContext all_member_modifier() throws RecognitionException {
		All_member_modifierContext _localctx = new All_member_modifierContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_all_member_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << EXTERN) | (1L << INTERNAL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (SEALED - 65)) | (1L << (STATIC - 65)) | (1L << (UNSAFE - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOLATILE - 65)))) != 0)) ) {
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

	public static class Common_member_declarationContext extends ParserRuleContext {
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public Indexer_declarationContext indexer_declaration() {
			return getRuleContext(Indexer_declarationContext.class,0);
		}
		public Method_member_nameContext method_member_name() {
			return getRuleContext(Method_member_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Property_declarationContext property_declaration() {
			return getRuleContext(Property_declarationContext.class,0);
		}
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
		}
		public Field_declarationContext field_declaration() {
			return getRuleContext(Field_declarationContext.class,0);
		}
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Event_declarationContext event_declaration() {
			return getRuleContext(Event_declarationContext.class,0);
		}
		public Conversion_operator_declaratorContext conversion_operator_declarator() {
			return getRuleContext(Conversion_operator_declaratorContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Constructor_declarationContext constructor_declaration() {
			return getRuleContext(Constructor_declarationContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public Struct_definitionContext struct_definition() {
			return getRuleContext(Struct_definitionContext.class,0);
		}
		public Interface_definitionContext interface_definition() {
			return getRuleContext(Interface_definitionContext.class,0);
		}
		public Enum_definitionContext enum_definition() {
			return getRuleContext(Enum_definitionContext.class,0);
		}
		public Delegate_definitionContext delegate_definition() {
			return getRuleContext(Delegate_definitionContext.class,0);
		}
		public Common_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_member_declaration; }
	}

	public final Common_member_declarationContext common_member_declaration() throws RecognitionException {
		Common_member_declarationContext _localctx = new Common_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_common_member_declaration);
		int _la;
		try {
			setState(1585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1519);
				constant_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1520);
				type();
				setState(1548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1521);
					namespace_or_type_name();
					setState(1522);
					match(DOT);
					setState(1523);
					indexer_declaration();
					}
					break;
				case 2:
					{
					setState(1525);
					method_member_name();
					setState(1527);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1526);
						type_parameter_list();
						}
					}

					setState(1529);
					match(OPEN_PARENS);
					setState(1531);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (ON - 67)) | (1L << (ORDERBY - 67)) | (1L << (OUT - 67)) | (1L << (PARAMS - 67)) | (1L << (PARTIAL - 67)) | (1L << (REF - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (THIS - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)) | (1L << (VAR - 67)) | (1L << (VOID - 67)) | (1L << (WHEN - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (OPEN_BRACKET - 67)))) != 0)) {
						{
						setState(1530);
						formal_parameter_list();
						}
					}

					setState(1533);
					match(CLOSE_PARENS);
					setState(1535);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHERE) {
						{
						setState(1534);
						type_parameter_constraints_clauses();
						}
					}

					setState(1542);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_BRACE:
					case SEMICOLON:
						{
						setState(1537);
						method_body();
						}
						break;
					case ASSIGNMENT:
						{
						setState(1538);
						right_arrow();
						setState(1539);
						expression(0);
						setState(1540);
						match(SEMICOLON);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case 3:
					{
					setState(1544);
					property_declaration();
					}
					break;
				case 4:
					{
					setState(1545);
					indexer_declaration();
					}
					break;
				case 5:
					{
					setState(1546);
					operator_declaration();
					}
					break;
				case 6:
					{
					setState(1547);
					field_declaration();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1550);
				event_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1551);
				conversion_operator_declarator();
				setState(1557);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACE:
				case SEMICOLON:
					{
					setState(1552);
					body();
					}
					break;
				case ASSIGNMENT:
					{
					setState(1553);
					right_arrow();
					setState(1554);
					expression(0);
					setState(1555);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1559);
				constructor_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1560);
				match(VOID);
				setState(1561);
				method_member_name();
				setState(1563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1562);
					type_parameter_list();
					}
				}

				setState(1565);
				match(OPEN_PARENS);
				setState(1567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (ON - 67)) | (1L << (ORDERBY - 67)) | (1L << (OUT - 67)) | (1L << (PARAMS - 67)) | (1L << (PARTIAL - 67)) | (1L << (REF - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (THIS - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)) | (1L << (VAR - 67)) | (1L << (VOID - 67)) | (1L << (WHEN - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (OPEN_BRACKET - 67)))) != 0)) {
					{
					setState(1566);
					formal_parameter_list();
					}
				}

				setState(1569);
				match(CLOSE_PARENS);
				setState(1571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1570);
					type_parameter_constraints_clauses();
					}
				}

				setState(1578);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACE:
				case SEMICOLON:
					{
					setState(1573);
					method_body();
					}
					break;
				case ASSIGNMENT:
					{
					setState(1574);
					right_arrow();
					setState(1575);
					expression(0);
					setState(1576);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1580);
				class_definition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1581);
				struct_definition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1582);
				interface_definition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1583);
				enum_definition();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1584);
				delegate_definition();
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

	public static class Constant_declaratorsContext extends ParserRuleContext {
		public List<Constant_declaratorContext> constant_declarator() {
			return getRuleContexts(Constant_declaratorContext.class);
		}
		public Constant_declaratorContext constant_declarator(int i) {
			return getRuleContext(Constant_declaratorContext.class,i);
		}
		public Constant_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declarators; }
	}

	public final Constant_declaratorsContext constant_declarators() throws RecognitionException {
		Constant_declaratorsContext _localctx = new Constant_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_constant_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1587);
			constant_declarator();
			setState(1592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1588);
				match(COMMA);
				setState(1589);
				constant_declarator();
				}
				}
				setState(1594);
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

	public static class Constant_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Constant_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declarator; }
	}

	public final Constant_declaratorContext constant_declarator() throws RecognitionException {
		Constant_declaratorContext _localctx = new Constant_declaratorContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_constant_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
			identifier();
			setState(1596);
			match(ASSIGNMENT);
			setState(1597);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declaratorsContext extends ParserRuleContext {
		public List<Variable_declaratorContext> variable_declarator() {
			return getRuleContexts(Variable_declaratorContext.class);
		}
		public Variable_declaratorContext variable_declarator(int i) {
			return getRuleContext(Variable_declaratorContext.class,i);
		}
		public Variable_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarators; }
	}

	public final Variable_declaratorsContext variable_declarators() throws RecognitionException {
		Variable_declaratorsContext _localctx = new Variable_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_variable_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1599);
			variable_declarator();
			setState(1604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1600);
				match(COMMA);
				setState(1601);
				variable_declarator();
				}
				}
				setState(1606);
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

	public static class Variable_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Variable_initializerContext variable_initializer() {
			return getRuleContext(Variable_initializerContext.class,0);
		}
		public Variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarator; }
	}

	public final Variable_declaratorContext variable_declarator() throws RecognitionException {
		Variable_declaratorContext _localctx = new Variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_variable_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			identifier();
			setState(1610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(1608);
				match(ASSIGNMENT);
				setState(1609);
				variable_initializer();
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

	public static class Variable_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Variable_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_initializer; }
	}

	public final Variable_initializerContext variable_initializer() throws RecognitionException {
		Variable_initializerContext _localctx = new Variable_initializerContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_variable_initializer);
		try {
			setState(1614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1612);
				expression(0);
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1613);
				array_initializer();
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

	public static class Return_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_return_type);
		try {
			setState(1618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1616);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1617);
				match(VOID);
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

	public static class Member_nameContext extends ParserRuleContext {
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public Member_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_name; }
	}

	public final Member_nameContext member_name() throws RecognitionException {
		Member_nameContext _localctx = new Member_nameContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_member_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			namespace_or_type_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Method_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_body; }
	}

	public final Method_bodyContext method_body() throws RecognitionException {
		Method_bodyContext _localctx = new Method_bodyContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_method_body);
		try {
			setState(1624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1622);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1623);
				match(SEMICOLON);
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

	public static class Formal_parameter_listContext extends ParserRuleContext {
		public Parameter_arrayContext parameter_array() {
			return getRuleContext(Parameter_arrayContext.class,0);
		}
		public Fixed_parametersContext fixed_parameters() {
			return getRuleContext(Fixed_parametersContext.class,0);
		}
		public Formal_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_parameter_list; }
	}

	public final Formal_parameter_listContext formal_parameter_list() throws RecognitionException {
		Formal_parameter_listContext _localctx = new Formal_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_formal_parameter_list);
		int _la;
		try {
			setState(1632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1626);
				parameter_array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1627);
				fixed_parameters();
				setState(1630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1628);
					match(COMMA);
					setState(1629);
					parameter_array();
					}
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

	public static class Fixed_parametersContext extends ParserRuleContext {
		public List<Fixed_parameterContext> fixed_parameter() {
			return getRuleContexts(Fixed_parameterContext.class);
		}
		public Fixed_parameterContext fixed_parameter(int i) {
			return getRuleContext(Fixed_parameterContext.class,i);
		}
		public Fixed_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_parameters; }
	}

	public final Fixed_parametersContext fixed_parameters() throws RecognitionException {
		Fixed_parametersContext _localctx = new Fixed_parametersContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_fixed_parameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			fixed_parameter();
			setState(1639);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1635);
					match(COMMA);
					setState(1636);
					fixed_parameter();
					}
					} 
				}
				setState(1641);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
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

	public static class Fixed_parameterContext extends ParserRuleContext {
		public Arg_declarationContext arg_declaration() {
			return getRuleContext(Arg_declarationContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Parameter_modifierContext parameter_modifier() {
			return getRuleContext(Parameter_modifierContext.class,0);
		}
		public TerminalNode ARGLIST() { return getToken(CSharpParser.ARGLIST, 0); }
		public Fixed_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_parameter; }
	}

	public final Fixed_parameterContext fixed_parameter() throws RecognitionException {
		Fixed_parameterContext _localctx = new Fixed_parameterContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_fixed_parameter);
		int _la;
		try {
			setState(1650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(1642);
					attributes();
					}
				}

				setState(1646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (OUT - 71)) | (1L << (REF - 71)) | (1L << (THIS - 71)))) != 0)) {
					{
					setState(1645);
					parameter_modifier();
					}
				}

				setState(1648);
				arg_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1649);
				match(ARGLIST);
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

	public static class Parameter_modifierContext extends ParserRuleContext {
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public Parameter_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_modifier; }
	}

	public final Parameter_modifierContext parameter_modifier() throws RecognitionException {
		Parameter_modifierContext _localctx = new Parameter_modifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_parameter_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1652);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (OUT - 71)) | (1L << (REF - 71)) | (1L << (THIS - 71)))) != 0)) ) {
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

	public static class Parameter_arrayContext extends ParserRuleContext {
		public TerminalNode PARAMS() { return getToken(CSharpParser.PARAMS, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Parameter_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_array; }
	}

	public final Parameter_arrayContext parameter_array() throws RecognitionException {
		Parameter_arrayContext _localctx = new Parameter_arrayContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_parameter_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1654);
				attributes();
				}
			}

			setState(1657);
			match(PARAMS);
			setState(1658);
			array_type();
			setState(1659);
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

	public static class Accessor_declarationsContext extends ParserRuleContext {
		public AttributesContext attrs;
		public Accessor_modifierContext mods;
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public Accessor_bodyContext accessor_body() {
			return getRuleContext(Accessor_bodyContext.class,0);
		}
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Accessor_modifierContext accessor_modifier() {
			return getRuleContext(Accessor_modifierContext.class,0);
		}
		public Set_accessor_declarationContext set_accessor_declaration() {
			return getRuleContext(Set_accessor_declarationContext.class,0);
		}
		public Get_accessor_declarationContext get_accessor_declaration() {
			return getRuleContext(Get_accessor_declarationContext.class,0);
		}
		public Accessor_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor_declarations; }
	}

	public final Accessor_declarationsContext accessor_declarations() throws RecognitionException {
		Accessor_declarationsContext _localctx = new Accessor_declarationsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_accessor_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1661);
				((Accessor_declarationsContext)_localctx).attrs = attributes();
				}
			}

			setState(1665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (INTERNAL - 56)) | (1L << (PRIVATE - 56)) | (1L << (PROTECTED - 56)))) != 0)) {
				{
				setState(1664);
				((Accessor_declarationsContext)_localctx).mods = accessor_modifier();
				}
			}

			setState(1677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(1667);
				match(GET);
				setState(1668);
				accessor_body();
				setState(1670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTERNAL || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (PRIVATE - 75)) | (1L << (PROTECTED - 75)) | (1L << (SET - 75)) | (1L << (OPEN_BRACKET - 75)))) != 0)) {
					{
					setState(1669);
					set_accessor_declaration();
					}
				}

				}
				break;
			case SET:
				{
				setState(1672);
				match(SET);
				setState(1673);
				accessor_body();
				setState(1675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GET || _la==INTERNAL || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (PRIVATE - 75)) | (1L << (PROTECTED - 75)) | (1L << (OPEN_BRACKET - 75)))) != 0)) {
					{
					setState(1674);
					get_accessor_declaration();
					}
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

	public static class Get_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public Accessor_bodyContext accessor_body() {
			return getRuleContext(Accessor_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Accessor_modifierContext accessor_modifier() {
			return getRuleContext(Accessor_modifierContext.class,0);
		}
		public Get_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_accessor_declaration; }
	}

	public final Get_accessor_declarationContext get_accessor_declaration() throws RecognitionException {
		Get_accessor_declarationContext _localctx = new Get_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_get_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1679);
				attributes();
				}
			}

			setState(1683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (INTERNAL - 56)) | (1L << (PRIVATE - 56)) | (1L << (PROTECTED - 56)))) != 0)) {
				{
				setState(1682);
				accessor_modifier();
				}
			}

			setState(1685);
			match(GET);
			setState(1686);
			accessor_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public Accessor_bodyContext accessor_body() {
			return getRuleContext(Accessor_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Accessor_modifierContext accessor_modifier() {
			return getRuleContext(Accessor_modifierContext.class,0);
		}
		public Set_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_accessor_declaration; }
	}

	public final Set_accessor_declarationContext set_accessor_declaration() throws RecognitionException {
		Set_accessor_declarationContext _localctx = new Set_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_set_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1688);
				attributes();
				}
			}

			setState(1692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (INTERNAL - 56)) | (1L << (PRIVATE - 56)) | (1L << (PROTECTED - 56)))) != 0)) {
				{
				setState(1691);
				accessor_modifier();
				}
			}

			setState(1694);
			match(SET);
			setState(1695);
			accessor_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Accessor_modifierContext extends ParserRuleContext {
		public TerminalNode PROTECTED() { return getToken(CSharpParser.PROTECTED, 0); }
		public TerminalNode INTERNAL() { return getToken(CSharpParser.INTERNAL, 0); }
		public TerminalNode PRIVATE() { return getToken(CSharpParser.PRIVATE, 0); }
		public Accessor_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor_modifier; }
	}

	public final Accessor_modifierContext accessor_modifier() throws RecognitionException {
		Accessor_modifierContext _localctx = new Accessor_modifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_accessor_modifier);
		try {
			setState(1704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1697);
				match(PROTECTED);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1698);
				match(INTERNAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1699);
				match(PRIVATE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1700);
				match(PROTECTED);
				setState(1701);
				match(INTERNAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1702);
				match(INTERNAL);
				setState(1703);
				match(PROTECTED);
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

	public static class Accessor_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Accessor_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor_body; }
	}

	public final Accessor_bodyContext accessor_body() throws RecognitionException {
		Accessor_bodyContext _localctx = new Accessor_bodyContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_accessor_body);
		try {
			setState(1708);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1706);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1707);
				match(SEMICOLON);
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

	public static class Event_accessor_declarationsContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CSharpParser.ADD, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Remove_accessor_declarationContext remove_accessor_declaration() {
			return getRuleContext(Remove_accessor_declarationContext.class,0);
		}
		public TerminalNode REMOVE() { return getToken(CSharpParser.REMOVE, 0); }
		public Add_accessor_declarationContext add_accessor_declaration() {
			return getRuleContext(Add_accessor_declarationContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Event_accessor_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_accessor_declarations; }
	}

	public final Event_accessor_declarationsContext event_accessor_declarations() throws RecognitionException {
		Event_accessor_declarationsContext _localctx = new Event_accessor_declarationsContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_event_accessor_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1710);
				attributes();
				}
			}

			setState(1721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				{
				setState(1713);
				match(ADD);
				setState(1714);
				block();
				setState(1715);
				remove_accessor_declaration();
				}
				break;
			case REMOVE:
				{
				setState(1717);
				match(REMOVE);
				setState(1718);
				block();
				setState(1719);
				add_accessor_declaration();
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

	public static class Add_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CSharpParser.ADD, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Add_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_accessor_declaration; }
	}

	public final Add_accessor_declarationContext add_accessor_declaration() throws RecognitionException {
		Add_accessor_declarationContext _localctx = new Add_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_add_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1723);
				attributes();
				}
			}

			setState(1726);
			match(ADD);
			setState(1727);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Remove_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode REMOVE() { return getToken(CSharpParser.REMOVE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Remove_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove_accessor_declaration; }
	}

	public final Remove_accessor_declarationContext remove_accessor_declaration() throws RecognitionException {
		Remove_accessor_declarationContext _localctx = new Remove_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_remove_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1729);
				attributes();
				}
			}

			setState(1732);
			match(REMOVE);
			setState(1733);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Overloadable_operatorContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(CSharpParser.BANG, 0); }
		public TerminalNode TRUE() { return getToken(CSharpParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CSharpParser.FALSE, 0); }
		public Right_shiftContext right_shift() {
			return getRuleContext(Right_shiftContext.class,0);
		}
		public TerminalNode OP_EQ() { return getToken(CSharpParser.OP_EQ, 0); }
		public TerminalNode OP_NE() { return getToken(CSharpParser.OP_NE, 0); }
		public Overloadable_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overloadable_operator; }
	}

	public final Overloadable_operatorContext overloadable_operator() throws RecognitionException {
		Overloadable_operatorContext _localctx = new Overloadable_operatorContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_overloadable_operator);
		try {
			setState(1757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1735);
				match(PLUS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1736);
				match(MINUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1737);
				match(BANG);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1738);
				match(TILDE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1739);
				match(OP_INC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1740);
				match(OP_DEC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1741);
				match(TRUE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1742);
				match(FALSE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1743);
				match(STAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1744);
				match(DIV);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1745);
				match(PERCENT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1746);
				match(AMP);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1747);
				match(BITWISE_OR);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1748);
				match(CARET);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1749);
				match(OP_LEFT_SHIFT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1750);
				right_shift();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1751);
				match(OP_EQ);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1752);
				match(OP_NE);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1753);
				match(GT);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1754);
				match(LT);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1755);
				match(OP_GE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1756);
				match(OP_LE);
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

	public static class Conversion_operator_declaratorContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(CSharpParser.OPERATOR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Arg_declarationContext arg_declaration() {
			return getRuleContext(Arg_declarationContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode IMPLICIT() { return getToken(CSharpParser.IMPLICIT, 0); }
		public TerminalNode EXPLICIT() { return getToken(CSharpParser.EXPLICIT, 0); }
		public Conversion_operator_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion_operator_declarator; }
	}

	public final Conversion_operator_declaratorContext conversion_operator_declarator() throws RecognitionException {
		Conversion_operator_declaratorContext _localctx = new Conversion_operator_declaratorContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_conversion_operator_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			_la = _input.LA(1);
			if ( !(_la==EXPLICIT || _la==IMPLICIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1760);
			match(OPERATOR);
			setState(1761);
			type();
			setState(1762);
			match(OPEN_PARENS);
			setState(1763);
			arg_declaration();
			setState(1764);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode BASE() { return getToken(CSharpParser.BASE, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Constructor_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_initializer; }
	}

	public final Constructor_initializerContext constructor_initializer() throws RecognitionException {
		Constructor_initializerContext _localctx = new Constructor_initializerContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_constructor_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			match(COLON);
			setState(1767);
			_la = _input.LA(1);
			if ( !(_la==BASE || _la==THIS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1768);
			match(OPEN_PARENS);
			setState(1770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (OUT - 65)) | (1L << (PARTIAL - 65)) | (1L << (REF - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VOID - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
				{
				setState(1769);
				argument_list();
				}
			}

			setState(1772);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_body);
		try {
			setState(1776);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1774);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1775);
				match(SEMICOLON);
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

	public static class Struct_interfacesContext extends ParserRuleContext {
		public Interface_type_listContext interface_type_list() {
			return getRuleContext(Interface_type_listContext.class,0);
		}
		public Struct_interfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_interfaces; }
	}

	public final Struct_interfacesContext struct_interfaces() throws RecognitionException {
		Struct_interfacesContext _localctx = new Struct_interfacesContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_struct_interfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1778);
			match(COLON);
			setState(1779);
			interface_type_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Struct_member_declarationContext> struct_member_declaration() {
			return getRuleContexts(Struct_member_declarationContext.class);
		}
		public Struct_member_declarationContext struct_member_declaration(int i) {
			return getRuleContext(Struct_member_declarationContext.class,i);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
			match(OPEN_BRACE);
			setState(1785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << DECIMAL) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << ENUM) | (1L << EQUALS) | (1L << EVENT) | (1L << EXPLICIT) | (1L << EXTERN) | (1L << FIXED) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IMPLICIT) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SEALED - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (STRUCT - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNSAFE - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOID - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (OPEN_BRACKET - 65)))) != 0)) {
				{
				{
				setState(1782);
				struct_member_declaration();
				}
				}
				setState(1787);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1788);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_member_declarationContext extends ParserRuleContext {
		public Common_member_declarationContext common_member_declaration() {
			return getRuleContext(Common_member_declarationContext.class,0);
		}
		public TerminalNode FIXED() { return getToken(CSharpParser.FIXED, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public List<Fixed_size_buffer_declaratorContext> fixed_size_buffer_declarator() {
			return getRuleContexts(Fixed_size_buffer_declaratorContext.class);
		}
		public Fixed_size_buffer_declaratorContext fixed_size_buffer_declarator(int i) {
			return getRuleContext(Fixed_size_buffer_declaratorContext.class,i);
		}
		public Struct_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_member_declaration; }
	}

	public final Struct_member_declarationContext struct_member_declaration() throws RecognitionException {
		Struct_member_declarationContext _localctx = new Struct_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_struct_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1790);
				attributes();
				}
			}

			setState(1794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1793);
				all_member_modifiers();
				}
				break;
			}
			setState(1806);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CLASS:
			case CONST:
			case DECIMAL:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case ENUM:
			case EQUALS:
			case EVENT:
			case EXPLICIT:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case IMPLICIT:
			case INT:
			case INTERFACE:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case STRUCT:
			case UINT:
			case ULONG:
			case USHORT:
			case VAR:
			case VOID:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				{
				setState(1796);
				common_member_declaration();
				}
				break;
			case FIXED:
				{
				setState(1797);
				match(FIXED);
				setState(1798);
				type();
				setState(1800); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1799);
					fixed_size_buffer_declarator();
					}
					}
					setState(1802); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << NAMEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ON - 68)) | (1L << (ORDERBY - 68)) | (1L << (PARTIAL - 68)) | (1L << (REMOVE - 68)) | (1L << (SELECT - 68)) | (1L << (SET - 68)) | (1L << (VAR - 68)) | (1L << (WHEN - 68)) | (1L << (WHERE - 68)) | (1L << (YIELD - 68)) | (1L << (IDENTIFIER - 68)))) != 0) );
				setState(1804);
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

	public static class Array_typeContext extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_array_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			base_type();
			setState(1816); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR || _la==INTERR) {
					{
					{
					setState(1809);
					_la = _input.LA(1);
					if ( !(_la==STAR || _la==INTERR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(1814);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1815);
				rank_specifier();
				}
				}
				setState(1818); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (OPEN_BRACKET - 124)) | (1L << (STAR - 124)) | (1L << (INTERR - 124)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rank_specifierContext extends ParserRuleContext {
		public Rank_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rank_specifier; }
	}

	public final Rank_specifierContext rank_specifier() throws RecognitionException {
		Rank_specifierContext _localctx = new Rank_specifierContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_rank_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			match(OPEN_BRACKET);
			setState(1824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1821);
				match(COMMA);
				}
				}
				setState(1826);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1827);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Variable_initializerContext> variable_initializer() {
			return getRuleContexts(Variable_initializerContext.class);
		}
		public Variable_initializerContext variable_initializer(int i) {
			return getRuleContext(Variable_initializerContext.class,i);
		}
		public Array_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_initializer; }
	}

	public final Array_initializerContext array_initializer() throws RecognitionException {
		Array_initializerContext _localctx = new Array_initializerContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_array_initializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			match(OPEN_BRACE);
			setState(1841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_BRACE - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
				{
				setState(1830);
				variable_initializer();
				setState(1835);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1831);
						match(COMMA);
						setState(1832);
						variable_initializer();
						}
						} 
					}
					setState(1837);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				}
				setState(1839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1838);
					match(COMMA);
					}
				}

				}
			}

			setState(1843);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variant_type_parameter_listContext extends ParserRuleContext {
		public List<Variant_type_parameterContext> variant_type_parameter() {
			return getRuleContexts(Variant_type_parameterContext.class);
		}
		public Variant_type_parameterContext variant_type_parameter(int i) {
			return getRuleContext(Variant_type_parameterContext.class,i);
		}
		public Variant_type_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant_type_parameter_list; }
	}

	public final Variant_type_parameter_listContext variant_type_parameter_list() throws RecognitionException {
		Variant_type_parameter_listContext _localctx = new Variant_type_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_variant_type_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845);
			match(LT);
			setState(1846);
			variant_type_parameter();
			setState(1851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1847);
				match(COMMA);
				setState(1848);
				variant_type_parameter();
				}
				}
				setState(1853);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1854);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variant_type_parameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Variance_annotationContext variance_annotation() {
			return getRuleContext(Variance_annotationContext.class,0);
		}
		public Variant_type_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant_type_parameter; }
	}

	public final Variant_type_parameterContext variant_type_parameter() throws RecognitionException {
		Variant_type_parameterContext _localctx = new Variant_type_parameterContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_variant_type_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1856);
				attributes();
				}
			}

			setState(1860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==OUT) {
				{
				setState(1859);
				variance_annotation();
				}
			}

			setState(1862);
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

	public static class Variance_annotationContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public Variance_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variance_annotation; }
	}

	public final Variance_annotationContext variance_annotation() throws RecognitionException {
		Variance_annotationContext _localctx = new Variance_annotationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_variance_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1864);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OUT) ) {
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

	public static class Interface_baseContext extends ParserRuleContext {
		public Interface_type_listContext interface_type_list() {
			return getRuleContext(Interface_type_listContext.class,0);
		}
		public Interface_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_base; }
	}

	public final Interface_baseContext interface_base() throws RecognitionException {
		Interface_baseContext _localctx = new Interface_baseContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_interface_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			match(COLON);
			setState(1867);
			interface_type_list();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Interface_member_declarationContext> interface_member_declaration() {
			return getRuleContexts(Interface_member_declarationContext.class);
		}
		public Interface_member_declarationContext interface_member_declaration(int i) {
			return getRuleContext(Interface_member_declarationContext.class,i);
		}
		public Interface_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_body; }
	}

	public final Interface_bodyContext interface_body() throws RecognitionException {
		Interface_bodyContext _localctx = new Interface_bodyContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_interface_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1869);
			match(OPEN_BRACE);
			setState(1873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << EVENT) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (STRING - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNSAFE - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VOID - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (OPEN_BRACKET - 65)))) != 0)) {
				{
				{
				setState(1870);
				interface_member_declaration();
				}
				}
				setState(1875);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1876);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_member_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode EVENT() { return getToken(CSharpParser.EVENT, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Interface_accessorsContext interface_accessors() {
			return getRuleContext(Interface_accessorsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Interface_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_member_declaration; }
	}

	public final Interface_member_declarationContext interface_member_declaration() throws RecognitionException {
		Interface_member_declarationContext _localctx = new Interface_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_interface_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1878);
				attributes();
				}
			}

			setState(1882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW) {
				{
				setState(1881);
				match(NEW);
				}
			}

			setState(1940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSAFE) {
					{
					setState(1884);
					match(UNSAFE);
					}
				}

				setState(1887);
				type();
				setState(1915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1888);
					identifier();
					setState(1890);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1889);
						type_parameter_list();
						}
					}

					setState(1892);
					match(OPEN_PARENS);
					setState(1894);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (ON - 67)) | (1L << (ORDERBY - 67)) | (1L << (OUT - 67)) | (1L << (PARAMS - 67)) | (1L << (PARTIAL - 67)) | (1L << (REF - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (THIS - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)) | (1L << (VAR - 67)) | (1L << (VOID - 67)) | (1L << (WHEN - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (OPEN_BRACKET - 67)))) != 0)) {
						{
						setState(1893);
						formal_parameter_list();
						}
					}

					setState(1896);
					match(CLOSE_PARENS);
					setState(1898);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHERE) {
						{
						setState(1897);
						type_parameter_constraints_clauses();
						}
					}

					setState(1900);
					match(SEMICOLON);
					}
					break;
				case 2:
					{
					setState(1902);
					identifier();
					setState(1903);
					match(OPEN_BRACE);
					setState(1904);
					interface_accessors();
					setState(1905);
					match(CLOSE_BRACE);
					}
					break;
				case 3:
					{
					setState(1907);
					match(THIS);
					setState(1908);
					match(OPEN_BRACKET);
					setState(1909);
					formal_parameter_list();
					setState(1910);
					match(CLOSE_BRACKET);
					setState(1911);
					match(OPEN_BRACE);
					setState(1912);
					interface_accessors();
					setState(1913);
					match(CLOSE_BRACE);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSAFE) {
					{
					setState(1917);
					match(UNSAFE);
					}
				}

				setState(1920);
				match(VOID);
				setState(1921);
				identifier();
				setState(1923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1922);
					type_parameter_list();
					}
				}

				setState(1925);
				match(OPEN_PARENS);
				setState(1927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (ON - 67)) | (1L << (ORDERBY - 67)) | (1L << (OUT - 67)) | (1L << (PARAMS - 67)) | (1L << (PARTIAL - 67)) | (1L << (REF - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (THIS - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)) | (1L << (VAR - 67)) | (1L << (VOID - 67)) | (1L << (WHEN - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (OPEN_BRACKET - 67)))) != 0)) {
					{
					setState(1926);
					formal_parameter_list();
					}
				}

				setState(1929);
				match(CLOSE_PARENS);
				setState(1931);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1930);
					type_parameter_constraints_clauses();
					}
				}

				setState(1933);
				match(SEMICOLON);
				}
				break;
			case 3:
				{
				setState(1935);
				match(EVENT);
				setState(1936);
				type();
				setState(1937);
				identifier();
				setState(1938);
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

	public static class Interface_accessorsContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public Interface_accessorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_accessors; }
	}

	public final Interface_accessorsContext interface_accessors() throws RecognitionException {
		Interface_accessorsContext _localctx = new Interface_accessorsContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_interface_accessors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1942);
				attributes();
				}
			}

			setState(1963);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(1945);
				match(GET);
				setState(1946);
				match(SEMICOLON);
				setState(1952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET || _la==OPEN_BRACKET) {
					{
					setState(1948);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_BRACKET) {
						{
						setState(1947);
						attributes();
						}
					}

					setState(1950);
					match(SET);
					setState(1951);
					match(SEMICOLON);
					}
				}

				}
				break;
			case SET:
				{
				setState(1954);
				match(SET);
				setState(1955);
				match(SEMICOLON);
				setState(1961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GET || _la==OPEN_BRACKET) {
					{
					setState(1957);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_BRACKET) {
						{
						setState(1956);
						attributes();
						}
					}

					setState(1959);
					match(GET);
					setState(1960);
					match(SEMICOLON);
					}
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

	public static class Enum_baseContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Enum_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_base; }
	}

	public final Enum_baseContext enum_base() throws RecognitionException {
		Enum_baseContext _localctx = new Enum_baseContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_enum_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			match(COLON);
			setState(1966);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Enum_member_declarationContext> enum_member_declaration() {
			return getRuleContexts(Enum_member_declarationContext.class);
		}
		public Enum_member_declarationContext enum_member_declaration(int i) {
			return getRuleContext(Enum_member_declarationContext.class,i);
		}
		public Enum_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_body; }
	}

	public final Enum_bodyContext enum_body() throws RecognitionException {
		Enum_bodyContext _localctx = new Enum_bodyContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_enum_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
			match(OPEN_BRACE);
			setState(1980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << NAMEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ON - 68)) | (1L << (ORDERBY - 68)) | (1L << (PARTIAL - 68)) | (1L << (REMOVE - 68)) | (1L << (SELECT - 68)) | (1L << (SET - 68)) | (1L << (VAR - 68)) | (1L << (WHEN - 68)) | (1L << (WHERE - 68)) | (1L << (YIELD - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (OPEN_BRACKET - 68)))) != 0)) {
				{
				setState(1969);
				enum_member_declaration();
				setState(1974);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1970);
						match(COMMA);
						setState(1971);
						enum_member_declaration();
						}
						} 
					}
					setState(1976);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
				}
				setState(1978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1977);
					match(COMMA);
					}
				}

				}
			}

			setState(1982);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_member_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Enum_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_member_declaration; }
	}

	public final Enum_member_declarationContext enum_member_declaration() throws RecognitionException {
		Enum_member_declarationContext _localctx = new Enum_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_enum_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1984);
				attributes();
				}
			}

			setState(1987);
			identifier();
			setState(1990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(1988);
				match(ASSIGNMENT);
				setState(1989);
				expression(0);
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

	public static class Global_attribute_sectionContext extends ParserRuleContext {
		public Global_attribute_targetContext global_attribute_target() {
			return getRuleContext(Global_attribute_targetContext.class,0);
		}
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Global_attribute_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_attribute_section; }
	}

	public final Global_attribute_sectionContext global_attribute_section() throws RecognitionException {
		Global_attribute_sectionContext _localctx = new Global_attribute_sectionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_global_attribute_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1992);
			match(OPEN_BRACKET);
			setState(1993);
			global_attribute_target();
			setState(1994);
			match(COLON);
			setState(1995);
			attribute_list();
			setState(1997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1996);
				match(COMMA);
				}
			}

			setState(1999);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_attribute_targetContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Global_attribute_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_attribute_target; }
	}

	public final Global_attribute_targetContext global_attribute_target() throws RecognitionException {
		Global_attribute_targetContext _localctx = new Global_attribute_targetContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_global_attribute_target);
		try {
			setState(2003);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case AS:
			case BASE:
			case BOOL:
			case BREAK:
			case BYTE:
			case CASE:
			case CATCH:
			case CHAR:
			case CHECKED:
			case CLASS:
			case CONST:
			case CONTINUE:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DO:
			case DOUBLE:
			case ELSE:
			case ENUM:
			case EVENT:
			case EXPLICIT:
			case EXTERN:
			case FALSE:
			case FINALLY:
			case FIXED:
			case FLOAT:
			case FOR:
			case FOREACH:
			case GOTO:
			case IF:
			case IMPLICIT:
			case IN:
			case INT:
			case INTERFACE:
			case INTERNAL:
			case IS:
			case LOCK:
			case LONG:
			case NAMESPACE:
			case NEW:
			case NULL:
			case OBJECT:
			case OPERATOR:
			case OUT:
			case OVERRIDE:
			case PARAMS:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case READONLY:
			case REF:
			case RETURN:
			case SBYTE:
			case SEALED:
			case SHORT:
			case SIZEOF:
			case STACKALLOC:
			case STATIC:
			case STRING:
			case STRUCT:
			case SWITCH:
			case THIS:
			case THROW:
			case TRUE:
			case TRY:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNSAFE:
			case USHORT:
			case USING:
			case VIRTUAL:
			case VOID:
			case VOLATILE:
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2001);
				keyword();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2002);
				identifier();
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

	public static class AttributesContext extends ParserRuleContext {
		public List<Attribute_sectionContext> attribute_section() {
			return getRuleContexts(Attribute_sectionContext.class);
		}
		public Attribute_sectionContext attribute_section(int i) {
			return getRuleContext(Attribute_sectionContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2006); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2005);
				attribute_section();
				}
				}
				setState(2008); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_BRACKET );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_sectionContext extends ParserRuleContext {
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Attribute_targetContext attribute_target() {
			return getRuleContext(Attribute_targetContext.class,0);
		}
		public Attribute_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_section; }
	}

	public final Attribute_sectionContext attribute_section() throws RecognitionException {
		Attribute_sectionContext _localctx = new Attribute_sectionContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_attribute_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2010);
			match(OPEN_BRACKET);
			setState(2014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(2011);
				attribute_target();
				setState(2012);
				match(COLON);
				}
				break;
			}
			setState(2016);
			attribute_list();
			setState(2018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2017);
				match(COMMA);
				}
			}

			setState(2020);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_targetContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Attribute_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_target; }
	}

	public final Attribute_targetContext attribute_target() throws RecognitionException {
		Attribute_targetContext _localctx = new Attribute_targetContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_attribute_target);
		try {
			setState(2024);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case AS:
			case BASE:
			case BOOL:
			case BREAK:
			case BYTE:
			case CASE:
			case CATCH:
			case CHAR:
			case CHECKED:
			case CLASS:
			case CONST:
			case CONTINUE:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DO:
			case DOUBLE:
			case ELSE:
			case ENUM:
			case EVENT:
			case EXPLICIT:
			case EXTERN:
			case FALSE:
			case FINALLY:
			case FIXED:
			case FLOAT:
			case FOR:
			case FOREACH:
			case GOTO:
			case IF:
			case IMPLICIT:
			case IN:
			case INT:
			case INTERFACE:
			case INTERNAL:
			case IS:
			case LOCK:
			case LONG:
			case NAMESPACE:
			case NEW:
			case NULL:
			case OBJECT:
			case OPERATOR:
			case OUT:
			case OVERRIDE:
			case PARAMS:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case READONLY:
			case REF:
			case RETURN:
			case SBYTE:
			case SEALED:
			case SHORT:
			case SIZEOF:
			case STACKALLOC:
			case STATIC:
			case STRING:
			case STRUCT:
			case SWITCH:
			case THIS:
			case THROW:
			case TRUE:
			case TRY:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNSAFE:
			case USHORT:
			case USING:
			case VIRTUAL:
			case VOID:
			case VOLATILE:
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2022);
				keyword();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2023);
				identifier();
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

	public static class Attribute_listContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Attribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_attribute_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2026);
			attribute();
			setState(2031);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2027);
					match(COMMA);
					setState(2028);
					attribute();
					}
					} 
				}
				setState(2033);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
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

	public static class AttributeContext extends ParserRuleContext {
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public List<Attribute_argumentContext> attribute_argument() {
			return getRuleContexts(Attribute_argumentContext.class);
		}
		public Attribute_argumentContext attribute_argument(int i) {
			return getRuleContext(Attribute_argumentContext.class,i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2034);
			namespace_or_type_name();
			setState(2047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENS) {
				{
				setState(2035);
				match(OPEN_PARENS);
				setState(2044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
					{
					setState(2036);
					attribute_argument();
					setState(2041);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2037);
						match(COMMA);
						setState(2038);
						attribute_argument();
						}
						}
						setState(2043);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2046);
				match(CLOSE_PARENS);
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

	public static class Attribute_argumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Attribute_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_argument; }
	}

	public final Attribute_argumentContext attribute_argument() throws RecognitionException {
		Attribute_argumentContext _localctx = new Attribute_argumentContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_attribute_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2052);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(2049);
				identifier();
				setState(2050);
				match(COLON);
				}
				break;
			}
			setState(2054);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pointer_typeContext extends ParserRuleContext {
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public Pointer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_type; }
	}

	public final Pointer_typeContext pointer_type() throws RecognitionException {
		Pointer_typeContext _localctx = new Pointer_typeContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_pointer_type);
		int _la;
		try {
			setState(2071);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2058);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
				case BYTE:
				case CHAR:
				case DECIMAL:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SBYTE:
				case SHORT:
				case UINT:
				case ULONG:
				case USHORT:
					{
					setState(2056);
					simple_type();
					}
					break;
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BY:
				case DESCENDING:
				case DYNAMIC:
				case EQUALS:
				case FROM:
				case GET:
				case GROUP:
				case INTO:
				case JOIN:
				case LET:
				case NAMEOF:
				case OBJECT:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SELECT:
				case SET:
				case STRING:
				case VAR:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
					{
					setState(2057);
					class_type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_BRACKET || _la==INTERR) {
					{
					setState(2062);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_BRACKET:
						{
						setState(2060);
						rank_specifier();
						}
						break;
					case INTERR:
						{
						setState(2061);
						match(INTERR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2066);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2067);
				match(STAR);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(2069);
				match(VOID);
				setState(2070);
				match(STAR);
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

	public static class Fixed_pointer_declaratorsContext extends ParserRuleContext {
		public List<Fixed_pointer_declaratorContext> fixed_pointer_declarator() {
			return getRuleContexts(Fixed_pointer_declaratorContext.class);
		}
		public Fixed_pointer_declaratorContext fixed_pointer_declarator(int i) {
			return getRuleContext(Fixed_pointer_declaratorContext.class,i);
		}
		public Fixed_pointer_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pointer_declarators; }
	}

	public final Fixed_pointer_declaratorsContext fixed_pointer_declarators() throws RecognitionException {
		Fixed_pointer_declaratorsContext _localctx = new Fixed_pointer_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_fixed_pointer_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2073);
			fixed_pointer_declarator();
			setState(2078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2074);
				match(COMMA);
				setState(2075);
				fixed_pointer_declarator();
				}
				}
				setState(2080);
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

	public static class Fixed_pointer_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Fixed_pointer_initializerContext fixed_pointer_initializer() {
			return getRuleContext(Fixed_pointer_initializerContext.class,0);
		}
		public Fixed_pointer_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pointer_declarator; }
	}

	public final Fixed_pointer_declaratorContext fixed_pointer_declarator() throws RecognitionException {
		Fixed_pointer_declaratorContext _localctx = new Fixed_pointer_declaratorContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_fixed_pointer_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2081);
			identifier();
			setState(2082);
			match(ASSIGNMENT);
			setState(2083);
			fixed_pointer_initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_pointer_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Local_variable_initializer_unsafeContext local_variable_initializer_unsafe() {
			return getRuleContext(Local_variable_initializer_unsafeContext.class,0);
		}
		public Fixed_pointer_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pointer_initializer; }
	}

	public final Fixed_pointer_initializerContext fixed_pointer_initializer() throws RecognitionException {
		Fixed_pointer_initializerContext _localctx = new Fixed_pointer_initializerContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_fixed_pointer_initializer);
		try {
			setState(2090);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2086);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(2085);
					match(AMP);
					}
					break;
				}
				setState(2088);
				expression(0);
				}
				break;
			case STACKALLOC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2089);
				local_variable_initializer_unsafe();
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

	public static class Fixed_size_buffer_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Fixed_size_buffer_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_size_buffer_declarator; }
	}

	public final Fixed_size_buffer_declaratorContext fixed_size_buffer_declarator() throws RecognitionException {
		Fixed_size_buffer_declaratorContext _localctx = new Fixed_size_buffer_declaratorContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_fixed_size_buffer_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2092);
			identifier();
			setState(2093);
			match(OPEN_BRACKET);
			setState(2094);
			expression(0);
			setState(2095);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_initializer_unsafeContext extends ParserRuleContext {
		public TerminalNode STACKALLOC() { return getToken(CSharpParser.STACKALLOC, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Local_variable_initializer_unsafeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_initializer_unsafe; }
	}

	public final Local_variable_initializer_unsafeContext local_variable_initializer_unsafe() throws RecognitionException {
		Local_variable_initializer_unsafeContext _localctx = new Local_variable_initializer_unsafeContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_local_variable_initializer_unsafe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2097);
			match(STACKALLOC);
			setState(2098);
			type();
			setState(2099);
			match(OPEN_BRACKET);
			setState(2100);
			expression(0);
			setState(2101);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_arrowContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public Right_arrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_arrow; }
	}

	public final Right_arrowContext right_arrow() throws RecognitionException {
		Right_arrowContext _localctx = new Right_arrowContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_right_arrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2103);
			((Right_arrowContext)_localctx).first = match(ASSIGNMENT);
			setState(2104);
			((Right_arrowContext)_localctx).second = match(GT);
			setState(2105);
			if (!((((Right_arrowContext)_localctx).first!=null?((Right_arrowContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_arrowContext)_localctx).second!=null?((Right_arrowContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_shiftContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public Right_shiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_shift; }
	}

	public final Right_shiftContext right_shift() throws RecognitionException {
		Right_shiftContext _localctx = new Right_shiftContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_right_shift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2107);
			((Right_shiftContext)_localctx).first = match(GT);
			setState(2108);
			((Right_shiftContext)_localctx).second = match(GT);
			setState(2109);
			if (!((((Right_shiftContext)_localctx).first!=null?((Right_shiftContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shiftContext)_localctx).second!=null?((Right_shiftContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_shift_assignmentContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public Right_shift_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_shift_assignment; }
	}

	public final Right_shift_assignmentContext right_shift_assignment() throws RecognitionException {
		Right_shift_assignmentContext _localctx = new Right_shift_assignmentContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_right_shift_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2111);
			((Right_shift_assignmentContext)_localctx).first = match(GT);
			setState(2112);
			((Right_shift_assignmentContext)_localctx).second = match(OP_GE);
			setState(2113);
			if (!((((Right_shift_assignmentContext)_localctx).first!=null?((Right_shift_assignmentContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shift_assignmentContext)_localctx).second!=null?((Right_shift_assignmentContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
			}
		}
		catch (RecognitionException re) {
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
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(CSharpParser.INTEGER_LITERAL, 0); }
		public TerminalNode HEX_INTEGER_LITERAL() { return getToken(CSharpParser.HEX_INTEGER_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(CSharpParser.REAL_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(CSharpParser.CHARACTER_LITERAL, 0); }
		public TerminalNode NULL() { return getToken(CSharpParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_literal);
		try {
			setState(2122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2115);
				boolean_literal();
				}
				break;
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(2116);
				string_literal();
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2117);
				match(INTEGER_LITERAL);
				}
				break;
			case HEX_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(2118);
				match(HEX_INTEGER_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(2119);
				match(REAL_LITERAL);
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(2120);
				match(CHARACTER_LITERAL);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(2121);
				match(NULL);
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

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CSharpParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CSharpParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2124);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
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

	public static class String_literalContext extends ParserRuleContext {
		public Interpolated_regular_stringContext interpolated_regular_string() {
			return getRuleContext(Interpolated_regular_stringContext.class,0);
		}
		public Interpolated_verbatium_stringContext interpolated_verbatium_string() {
			return getRuleContext(Interpolated_verbatium_stringContext.class,0);
		}
		public TerminalNode REGULAR_STRING() { return getToken(CSharpParser.REGULAR_STRING, 0); }
		public TerminalNode VERBATIUM_STRING() { return getToken(CSharpParser.VERBATIUM_STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_string_literal);
		try {
			setState(2130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERPOLATED_REGULAR_STRING_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(2126);
				interpolated_regular_string();
				}
				break;
			case INTERPOLATED_VERBATIUM_STRING_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(2127);
				interpolated_verbatium_string();
				}
				break;
			case REGULAR_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(2128);
				match(REGULAR_STRING);
				}
				break;
			case VERBATIUM_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2129);
				match(VERBATIUM_STRING);
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

	public static class Interpolated_regular_stringContext extends ParserRuleContext {
		public TerminalNode INTERPOLATED_REGULAR_STRING_START() { return getToken(CSharpParser.INTERPOLATED_REGULAR_STRING_START, 0); }
		public TerminalNode DOUBLE_QUOTE_INSIDE() { return getToken(CSharpParser.DOUBLE_QUOTE_INSIDE, 0); }
		public List<Interpolated_regular_string_partContext> interpolated_regular_string_part() {
			return getRuleContexts(Interpolated_regular_string_partContext.class);
		}
		public Interpolated_regular_string_partContext interpolated_regular_string_part(int i) {
			return getRuleContext(Interpolated_regular_string_partContext.class,i);
		}
		public Interpolated_regular_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_regular_string; }
	}

	public final Interpolated_regular_stringContext interpolated_regular_string() throws RecognitionException {
		Interpolated_regular_stringContext _localctx = new Interpolated_regular_stringContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_interpolated_regular_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2132);
			match(INTERPOLATED_REGULAR_STRING_START);
			setState(2136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)) | (1L << (DOUBLE_CURLY_INSIDE - 132)) | (1L << (REGULAR_CHAR_INSIDE - 132)) | (1L << (REGULAR_STRING_INSIDE - 132)))) != 0)) {
				{
				{
				setState(2133);
				interpolated_regular_string_part();
				}
				}
				setState(2138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2139);
			match(DOUBLE_QUOTE_INSIDE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_verbatium_stringContext extends ParserRuleContext {
		public TerminalNode INTERPOLATED_VERBATIUM_STRING_START() { return getToken(CSharpParser.INTERPOLATED_VERBATIUM_STRING_START, 0); }
		public TerminalNode DOUBLE_QUOTE_INSIDE() { return getToken(CSharpParser.DOUBLE_QUOTE_INSIDE, 0); }
		public List<Interpolated_verbatium_string_partContext> interpolated_verbatium_string_part() {
			return getRuleContexts(Interpolated_verbatium_string_partContext.class);
		}
		public Interpolated_verbatium_string_partContext interpolated_verbatium_string_part(int i) {
			return getRuleContext(Interpolated_verbatium_string_partContext.class,i);
		}
		public Interpolated_verbatium_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_verbatium_string; }
	}

	public final Interpolated_verbatium_stringContext interpolated_verbatium_string() throws RecognitionException {
		Interpolated_verbatium_stringContext _localctx = new Interpolated_verbatium_stringContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_interpolated_verbatium_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2141);
			match(INTERPOLATED_VERBATIUM_STRING_START);
			setState(2145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)) | (1L << (DOUBLE_CURLY_INSIDE - 132)) | (1L << (VERBATIUM_DOUBLE_QUOTE_INSIDE - 132)) | (1L << (VERBATIUM_INSIDE_STRING - 132)))) != 0)) {
				{
				{
				setState(2142);
				interpolated_verbatium_string_part();
				}
				}
				setState(2147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2148);
			match(DOUBLE_QUOTE_INSIDE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_regular_string_partContext extends ParserRuleContext {
		public Interpolated_string_expressionContext interpolated_string_expression() {
			return getRuleContext(Interpolated_string_expressionContext.class,0);
		}
		public TerminalNode DOUBLE_CURLY_INSIDE() { return getToken(CSharpParser.DOUBLE_CURLY_INSIDE, 0); }
		public TerminalNode REGULAR_CHAR_INSIDE() { return getToken(CSharpParser.REGULAR_CHAR_INSIDE, 0); }
		public TerminalNode REGULAR_STRING_INSIDE() { return getToken(CSharpParser.REGULAR_STRING_INSIDE, 0); }
		public Interpolated_regular_string_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_regular_string_part; }
	}

	public final Interpolated_regular_string_partContext interpolated_regular_string_part() throws RecognitionException {
		Interpolated_regular_string_partContext _localctx = new Interpolated_regular_string_partContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_interpolated_regular_string_part);
		try {
			setState(2154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2150);
				interpolated_string_expression();
				}
				break;
			case DOUBLE_CURLY_INSIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2151);
				match(DOUBLE_CURLY_INSIDE);
				}
				break;
			case REGULAR_CHAR_INSIDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2152);
				match(REGULAR_CHAR_INSIDE);
				}
				break;
			case REGULAR_STRING_INSIDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2153);
				match(REGULAR_STRING_INSIDE);
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

	public static class Interpolated_verbatium_string_partContext extends ParserRuleContext {
		public Interpolated_string_expressionContext interpolated_string_expression() {
			return getRuleContext(Interpolated_string_expressionContext.class,0);
		}
		public TerminalNode DOUBLE_CURLY_INSIDE() { return getToken(CSharpParser.DOUBLE_CURLY_INSIDE, 0); }
		public TerminalNode VERBATIUM_DOUBLE_QUOTE_INSIDE() { return getToken(CSharpParser.VERBATIUM_DOUBLE_QUOTE_INSIDE, 0); }
		public TerminalNode VERBATIUM_INSIDE_STRING() { return getToken(CSharpParser.VERBATIUM_INSIDE_STRING, 0); }
		public Interpolated_verbatium_string_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_verbatium_string_part; }
	}

	public final Interpolated_verbatium_string_partContext interpolated_verbatium_string_part() throws RecognitionException {
		Interpolated_verbatium_string_partContext _localctx = new Interpolated_verbatium_string_partContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_interpolated_verbatium_string_part);
		try {
			setState(2160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2156);
				interpolated_string_expression();
				}
				break;
			case DOUBLE_CURLY_INSIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2157);
				match(DOUBLE_CURLY_INSIDE);
				}
				break;
			case VERBATIUM_DOUBLE_QUOTE_INSIDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2158);
				match(VERBATIUM_DOUBLE_QUOTE_INSIDE);
				}
				break;
			case VERBATIUM_INSIDE_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2159);
				match(VERBATIUM_INSIDE_STRING);
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

	public static class Interpolated_string_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> FORMAT_STRING() { return getTokens(CSharpParser.FORMAT_STRING); }
		public TerminalNode FORMAT_STRING(int i) {
			return getToken(CSharpParser.FORMAT_STRING, i);
		}
		public Interpolated_string_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_string_expression; }
	}

	public final Interpolated_string_expressionContext interpolated_string_expression() throws RecognitionException {
		Interpolated_string_expressionContext _localctx = new Interpolated_string_expressionContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_interpolated_string_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2162);
			expression(0);
			setState(2167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2163);
				match(COMMA);
				setState(2164);
				expression(0);
				}
				}
				setState(2169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2170);
				match(COLON);
				setState(2172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2171);
					match(FORMAT_STRING);
					}
					}
					setState(2174); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==FORMAT_STRING );
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(CSharpParser.ABSTRACT, 0); }
		public TerminalNode AS() { return getToken(CSharpParser.AS, 0); }
		public TerminalNode BASE() { return getToken(CSharpParser.BASE, 0); }
		public TerminalNode BOOL() { return getToken(CSharpParser.BOOL, 0); }
		public TerminalNode BREAK() { return getToken(CSharpParser.BREAK, 0); }
		public TerminalNode BYTE() { return getToken(CSharpParser.BYTE, 0); }
		public TerminalNode CASE() { return getToken(CSharpParser.CASE, 0); }
		public TerminalNode CATCH() { return getToken(CSharpParser.CATCH, 0); }
		public TerminalNode CHAR() { return getToken(CSharpParser.CHAR, 0); }
		public TerminalNode CHECKED() { return getToken(CSharpParser.CHECKED, 0); }
		public TerminalNode CLASS() { return getToken(CSharpParser.CLASS, 0); }
		public TerminalNode CONST() { return getToken(CSharpParser.CONST, 0); }
		public TerminalNode CONTINUE() { return getToken(CSharpParser.CONTINUE, 0); }
		public TerminalNode DECIMAL() { return getToken(CSharpParser.DECIMAL, 0); }
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public TerminalNode DELEGATE() { return getToken(CSharpParser.DELEGATE, 0); }
		public TerminalNode DO() { return getToken(CSharpParser.DO, 0); }
		public TerminalNode DOUBLE() { return getToken(CSharpParser.DOUBLE, 0); }
		public TerminalNode ELSE() { return getToken(CSharpParser.ELSE, 0); }
		public TerminalNode ENUM() { return getToken(CSharpParser.ENUM, 0); }
		public TerminalNode EVENT() { return getToken(CSharpParser.EVENT, 0); }
		public TerminalNode EXPLICIT() { return getToken(CSharpParser.EXPLICIT, 0); }
		public TerminalNode EXTERN() { return getToken(CSharpParser.EXTERN, 0); }
		public TerminalNode FALSE() { return getToken(CSharpParser.FALSE, 0); }
		public TerminalNode FINALLY() { return getToken(CSharpParser.FINALLY, 0); }
		public TerminalNode FIXED() { return getToken(CSharpParser.FIXED, 0); }
		public TerminalNode FLOAT() { return getToken(CSharpParser.FLOAT, 0); }
		public TerminalNode FOR() { return getToken(CSharpParser.FOR, 0); }
		public TerminalNode FOREACH() { return getToken(CSharpParser.FOREACH, 0); }
		public TerminalNode GOTO() { return getToken(CSharpParser.GOTO, 0); }
		public TerminalNode IF() { return getToken(CSharpParser.IF, 0); }
		public TerminalNode IMPLICIT() { return getToken(CSharpParser.IMPLICIT, 0); }
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public TerminalNode INT() { return getToken(CSharpParser.INT, 0); }
		public TerminalNode INTERFACE() { return getToken(CSharpParser.INTERFACE, 0); }
		public TerminalNode INTERNAL() { return getToken(CSharpParser.INTERNAL, 0); }
		public TerminalNode IS() { return getToken(CSharpParser.IS, 0); }
		public TerminalNode LOCK() { return getToken(CSharpParser.LOCK, 0); }
		public TerminalNode LONG() { return getToken(CSharpParser.LONG, 0); }
		public TerminalNode NAMESPACE() { return getToken(CSharpParser.NAMESPACE, 0); }
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode NULL() { return getToken(CSharpParser.NULL, 0); }
		public TerminalNode OBJECT() { return getToken(CSharpParser.OBJECT, 0); }
		public TerminalNode OPERATOR() { return getToken(CSharpParser.OPERATOR, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public TerminalNode OVERRIDE() { return getToken(CSharpParser.OVERRIDE, 0); }
		public TerminalNode PARAMS() { return getToken(CSharpParser.PARAMS, 0); }
		public TerminalNode PRIVATE() { return getToken(CSharpParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(CSharpParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(CSharpParser.PUBLIC, 0); }
		public TerminalNode READONLY() { return getToken(CSharpParser.READONLY, 0); }
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode RETURN() { return getToken(CSharpParser.RETURN, 0); }
		public TerminalNode SBYTE() { return getToken(CSharpParser.SBYTE, 0); }
		public TerminalNode SEALED() { return getToken(CSharpParser.SEALED, 0); }
		public TerminalNode SHORT() { return getToken(CSharpParser.SHORT, 0); }
		public TerminalNode SIZEOF() { return getToken(CSharpParser.SIZEOF, 0); }
		public TerminalNode STACKALLOC() { return getToken(CSharpParser.STACKALLOC, 0); }
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public TerminalNode STRING() { return getToken(CSharpParser.STRING, 0); }
		public TerminalNode STRUCT() { return getToken(CSharpParser.STRUCT, 0); }
		public TerminalNode SWITCH() { return getToken(CSharpParser.SWITCH, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public TerminalNode THROW() { return getToken(CSharpParser.THROW, 0); }
		public TerminalNode TRUE() { return getToken(CSharpParser.TRUE, 0); }
		public TerminalNode TRY() { return getToken(CSharpParser.TRY, 0); }
		public TerminalNode TYPEOF() { return getToken(CSharpParser.TYPEOF, 0); }
		public TerminalNode UINT() { return getToken(CSharpParser.UINT, 0); }
		public TerminalNode ULONG() { return getToken(CSharpParser.ULONG, 0); }
		public TerminalNode UNCHECKED() { return getToken(CSharpParser.UNCHECKED, 0); }
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public TerminalNode USHORT() { return getToken(CSharpParser.USHORT, 0); }
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public TerminalNode VIRTUAL() { return getToken(CSharpParser.VIRTUAL, 0); }
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public TerminalNode VOLATILE() { return getToken(CSharpParser.VOLATILE, 0); }
		public TerminalNode WHILE() { return getToken(CSharpParser.WHILE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << AS) | (1L << BASE) | (1L << BOOL) | (1L << BREAK) | (1L << BYTE) | (1L << CASE) | (1L << CATCH) | (1L << CHAR) | (1L << CHECKED) | (1L << CLASS) | (1L << CONST) | (1L << CONTINUE) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DO) | (1L << DOUBLE) | (1L << ELSE) | (1L << ENUM) | (1L << EVENT) | (1L << EXPLICIT) | (1L << EXTERN) | (1L << FALSE) | (1L << FINALLY) | (1L << FIXED) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << GOTO) | (1L << IF) | (1L << IMPLICIT) | (1L << IN) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << IS) | (1L << LOCK) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMESPACE - 64)) | (1L << (NEW - 64)) | (1L << (NULL - 64)) | (1L << (OBJECT - 64)) | (1L << (OPERATOR - 64)) | (1L << (OUT - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PARAMS - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (REF - 64)) | (1L << (RETURN - 64)) | (1L << (SBYTE - 64)) | (1L << (SEALED - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STACKALLOC - 64)) | (1L << (STATIC - 64)) | (1L << (STRING - 64)) | (1L << (STRUCT - 64)) | (1L << (SWITCH - 64)) | (1L << (THIS - 64)) | (1L << (THROW - 64)) | (1L << (TRUE - 64)) | (1L << (TRY - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNSAFE - 64)) | (1L << (USHORT - 64)) | (1L << (USING - 64)) | (1L << (VIRTUAL - 64)) | (1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHILE - 64)))) != 0)) ) {
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

	public static class Class_definitionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CSharpParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Class_baseContext class_base() {
			return getRuleContext(Class_baseContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_class_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2180);
			match(CLASS);
			setState(2181);
			identifier();
			setState(2183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2182);
				type_parameter_list();
				}
			}

			setState(2186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2185);
				class_base();
				}
			}

			setState(2189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2188);
				type_parameter_constraints_clauses();
				}
			}

			setState(2191);
			class_body();
			setState(2193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2192);
				match(SEMICOLON);
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

	public static class Struct_definitionContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(CSharpParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Struct_interfacesContext struct_interfaces() {
			return getRuleContext(Struct_interfacesContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Struct_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_definition; }
	}

	public final Struct_definitionContext struct_definition() throws RecognitionException {
		Struct_definitionContext _localctx = new Struct_definitionContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_struct_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2195);
			match(STRUCT);
			setState(2196);
			identifier();
			setState(2198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2197);
				type_parameter_list();
				}
			}

			setState(2201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2200);
				struct_interfaces();
				}
			}

			setState(2204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2203);
				type_parameter_constraints_clauses();
				}
			}

			setState(2206);
			struct_body();
			setState(2208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2207);
				match(SEMICOLON);
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

	public static class Interface_definitionContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(CSharpParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Interface_bodyContext interface_body() {
			return getRuleContext(Interface_bodyContext.class,0);
		}
		public Variant_type_parameter_listContext variant_type_parameter_list() {
			return getRuleContext(Variant_type_parameter_listContext.class,0);
		}
		public Interface_baseContext interface_base() {
			return getRuleContext(Interface_baseContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Interface_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_definition; }
	}

	public final Interface_definitionContext interface_definition() throws RecognitionException {
		Interface_definitionContext _localctx = new Interface_definitionContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_interface_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2210);
			match(INTERFACE);
			setState(2211);
			identifier();
			setState(2213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2212);
				variant_type_parameter_list();
				}
			}

			setState(2216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2215);
				interface_base();
				}
			}

			setState(2219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2218);
				type_parameter_constraints_clauses();
				}
			}

			setState(2221);
			interface_body();
			setState(2223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2222);
				match(SEMICOLON);
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

	public static class Enum_definitionContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(CSharpParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_bodyContext enum_body() {
			return getRuleContext(Enum_bodyContext.class,0);
		}
		public Enum_baseContext enum_base() {
			return getRuleContext(Enum_baseContext.class,0);
		}
		public Enum_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_definition; }
	}

	public final Enum_definitionContext enum_definition() throws RecognitionException {
		Enum_definitionContext _localctx = new Enum_definitionContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_enum_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2225);
			match(ENUM);
			setState(2226);
			identifier();
			setState(2228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2227);
				enum_base();
				}
			}

			setState(2230);
			enum_body();
			setState(2232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2231);
				match(SEMICOLON);
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

	public static class Delegate_definitionContext extends ParserRuleContext {
		public TerminalNode DELEGATE() { return getToken(CSharpParser.DELEGATE, 0); }
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Variant_type_parameter_listContext variant_type_parameter_list() {
			return getRuleContext(Variant_type_parameter_listContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Delegate_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegate_definition; }
	}

	public final Delegate_definitionContext delegate_definition() throws RecognitionException {
		Delegate_definitionContext _localctx = new Delegate_definitionContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_delegate_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2234);
			match(DELEGATE);
			setState(2235);
			return_type();
			setState(2236);
			identifier();
			setState(2238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2237);
				variant_type_parameter_list();
				}
			}

			setState(2240);
			match(OPEN_PARENS);
			setState(2242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (ON - 67)) | (1L << (ORDERBY - 67)) | (1L << (OUT - 67)) | (1L << (PARAMS - 67)) | (1L << (PARTIAL - 67)) | (1L << (REF - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (THIS - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)) | (1L << (VAR - 67)) | (1L << (VOID - 67)) | (1L << (WHEN - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (OPEN_BRACKET - 67)))) != 0)) {
				{
				setState(2241);
				formal_parameter_list();
				}
			}

			setState(2244);
			match(CLOSE_PARENS);
			setState(2246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2245);
				type_parameter_constraints_clauses();
				}
			}

			setState(2248);
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

	public static class Event_declarationContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(CSharpParser.EVENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Variable_declaratorsContext variable_declarators() {
			return getRuleContext(Variable_declaratorsContext.class,0);
		}
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Event_accessor_declarationsContext event_accessor_declarations() {
			return getRuleContext(Event_accessor_declarationsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Event_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_declaration; }
	}

	public final Event_declarationContext event_declaration() throws RecognitionException {
		Event_declarationContext _localctx = new Event_declarationContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_event_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2250);
			match(EVENT);
			setState(2251);
			type();
			setState(2260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				{
				setState(2252);
				variable_declarators();
				setState(2253);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(2255);
				member_name();
				setState(2256);
				match(OPEN_BRACE);
				setState(2257);
				event_accessor_declarations();
				setState(2258);
				match(CLOSE_BRACE);
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

	public static class Field_declarationContext extends ParserRuleContext {
		public Variable_declaratorsContext variable_declarators() {
			return getRuleContext(Variable_declaratorsContext.class,0);
		}
		public Field_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_declaration; }
	}

	public final Field_declarationContext field_declaration() throws RecognitionException {
		Field_declarationContext _localctx = new Field_declarationContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_field_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2262);
			variable_declarators();
			setState(2263);
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

	public static class Property_declarationContext extends ParserRuleContext {
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Accessor_declarationsContext accessor_declarations() {
			return getRuleContext(Accessor_declarationsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_initializerContext variable_initializer() {
			return getRuleContext(Variable_initializerContext.class,0);
		}
		public Property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_declaration; }
	}

	public final Property_declarationContext property_declaration() throws RecognitionException {
		Property_declarationContext _localctx = new Property_declarationContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_property_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2265);
			member_name();
			setState(2279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(2266);
				match(OPEN_BRACE);
				setState(2267);
				accessor_declarations();
				setState(2268);
				match(CLOSE_BRACE);
				setState(2273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(2269);
					match(ASSIGNMENT);
					setState(2270);
					variable_initializer();
					setState(2271);
					match(SEMICOLON);
					}
				}

				}
				break;
			case ASSIGNMENT:
				{
				setState(2275);
				right_arrow();
				setState(2276);
				expression(0);
				setState(2277);
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

	public static class Constant_declarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(CSharpParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Constant_declaratorsContext constant_declarators() {
			return getRuleContext(Constant_declaratorsContext.class,0);
		}
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2281);
			match(CONST);
			setState(2282);
			type();
			setState(2283);
			constant_declarators();
			setState(2284);
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

	public static class Indexer_declarationContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Accessor_declarationsContext accessor_declarations() {
			return getRuleContext(Accessor_declarationsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Indexer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexer_declaration; }
	}

	public final Indexer_declarationContext indexer_declaration() throws RecognitionException {
		Indexer_declarationContext _localctx = new Indexer_declarationContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_indexer_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2286);
			match(THIS);
			setState(2287);
			match(OPEN_BRACKET);
			setState(2288);
			formal_parameter_list();
			setState(2289);
			match(CLOSE_BRACKET);
			setState(2298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(2290);
				match(OPEN_BRACE);
				setState(2291);
				accessor_declarations();
				setState(2292);
				match(CLOSE_BRACE);
				}
				break;
			case ASSIGNMENT:
				{
				setState(2294);
				right_arrow();
				setState(2295);
				expression(0);
				setState(2296);
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

	public static class Destructor_definitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Destructor_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructor_definition; }
	}

	public final Destructor_definitionContext destructor_definition() throws RecognitionException {
		Destructor_definitionContext _localctx = new Destructor_definitionContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_destructor_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2300);
			match(TILDE);
			setState(2301);
			identifier();
			setState(2302);
			match(OPEN_PARENS);
			setState(2303);
			match(CLOSE_PARENS);
			setState(2304);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Constructor_initializerContext constructor_initializer() {
			return getRuleContext(Constructor_initializerContext.class,0);
		}
		public Constructor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_declaration; }
	}

	public final Constructor_declarationContext constructor_declaration() throws RecognitionException {
		Constructor_declarationContext _localctx = new Constructor_declarationContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_constructor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2306);
			identifier();
			setState(2307);
			match(OPEN_PARENS);
			setState(2309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (ON - 67)) | (1L << (ORDERBY - 67)) | (1L << (OUT - 67)) | (1L << (PARAMS - 67)) | (1L << (PARTIAL - 67)) | (1L << (REF - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (THIS - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)) | (1L << (VAR - 67)) | (1L << (VOID - 67)) | (1L << (WHEN - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (OPEN_BRACKET - 67)))) != 0)) {
				{
				setState(2308);
				formal_parameter_list();
				}
			}

			setState(2311);
			match(CLOSE_PARENS);
			setState(2313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2312);
				constructor_initializer();
				}
			}

			setState(2315);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_member_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<Type_argument_listContext> type_argument_list() {
			return getRuleContexts(Type_argument_listContext.class);
		}
		public Type_argument_listContext type_argument_list(int i) {
			return getRuleContext(Type_argument_listContext.class,i);
		}
		public Method_member_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_member_name; }
	}

	public final Method_member_nameContext method_member_name() throws RecognitionException {
		Method_member_nameContext _localctx = new Method_member_nameContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_method_member_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				{
				setState(2317);
				identifier();
				}
				break;
			case 2:
				{
				setState(2318);
				identifier();
				setState(2319);
				match(DOUBLE_COLON);
				setState(2320);
				identifier();
				}
				break;
			}
			setState(2331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2325);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(2324);
						type_argument_list();
						}
					}

					setState(2327);
					match(DOT);
					setState(2328);
					identifier();
					}
					} 
				}
				setState(2333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
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

	public static class Operator_declarationContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(CSharpParser.OPERATOR, 0); }
		public Overloadable_operatorContext overloadable_operator() {
			return getRuleContext(Overloadable_operatorContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public List<Arg_declarationContext> arg_declaration() {
			return getRuleContexts(Arg_declarationContext.class);
		}
		public Arg_declarationContext arg_declaration(int i) {
			return getRuleContext(Arg_declarationContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_declaration; }
	}

	public final Operator_declarationContext operator_declaration() throws RecognitionException {
		Operator_declarationContext _localctx = new Operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_operator_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2334);
			match(OPERATOR);
			setState(2335);
			overloadable_operator();
			setState(2336);
			match(OPEN_PARENS);
			setState(2337);
			arg_declaration();
			setState(2340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2338);
				match(COMMA);
				setState(2339);
				arg_declaration();
				}
			}

			setState(2342);
			match(CLOSE_PARENS);
			setState(2348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
			case SEMICOLON:
				{
				setState(2343);
				body();
				}
				break;
			case ASSIGNMENT:
				{
				setState(2344);
				right_arrow();
				setState(2345);
				expression(0);
				setState(2346);
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

	public static class Arg_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Arg_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_declaration; }
	}

	public final Arg_declarationContext arg_declaration() throws RecognitionException {
		Arg_declarationContext _localctx = new Arg_declarationContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_arg_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2350);
			type();
			setState(2351);
			identifier();
			setState(2354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(2352);
				match(ASSIGNMENT);
				setState(2353);
				expression(0);
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

	public static class Method_invocationContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Method_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_invocation; }
	}

	public final Method_invocationContext method_invocation() throws RecognitionException {
		Method_invocationContext _localctx = new Method_invocationContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_method_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2356);
			match(OPEN_PARENS);
			setState(2358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (OUT - 65)) | (1L << (PARTIAL - 65)) | (1L << (REF - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VOID - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
				{
				setState(2357);
				argument_list();
				}
			}

			setState(2360);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_creation_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public Object_creation_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_creation_expression; }
	}

	public final Object_creation_expressionContext object_creation_expression() throws RecognitionException {
		Object_creation_expressionContext _localctx = new Object_creation_expressionContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_object_creation_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2362);
			match(OPEN_PARENS);
			setState(2364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (OUT - 65)) | (1L << (PARTIAL - 65)) | (1L << (REF - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VOID - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
				{
				setState(2363);
				argument_list();
				}
			}

			setState(2366);
			match(CLOSE_PARENS);
			setState(2368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				{
				setState(2367);
				object_or_collection_initializer();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CSharpParser.IDENTIFIER, 0); }
		public TerminalNode ADD() { return getToken(CSharpParser.ADD, 0); }
		public TerminalNode ALIAS() { return getToken(CSharpParser.ALIAS, 0); }
		public TerminalNode ARGLIST() { return getToken(CSharpParser.ARGLIST, 0); }
		public TerminalNode ASCENDING() { return getToken(CSharpParser.ASCENDING, 0); }
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public TerminalNode AWAIT() { return getToken(CSharpParser.AWAIT, 0); }
		public TerminalNode BY() { return getToken(CSharpParser.BY, 0); }
		public TerminalNode DESCENDING() { return getToken(CSharpParser.DESCENDING, 0); }
		public TerminalNode DYNAMIC() { return getToken(CSharpParser.DYNAMIC, 0); }
		public TerminalNode EQUALS() { return getToken(CSharpParser.EQUALS, 0); }
		public TerminalNode FROM() { return getToken(CSharpParser.FROM, 0); }
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public TerminalNode GROUP() { return getToken(CSharpParser.GROUP, 0); }
		public TerminalNode INTO() { return getToken(CSharpParser.INTO, 0); }
		public TerminalNode JOIN() { return getToken(CSharpParser.JOIN, 0); }
		public TerminalNode LET() { return getToken(CSharpParser.LET, 0); }
		public TerminalNode NAMEOF() { return getToken(CSharpParser.NAMEOF, 0); }
		public TerminalNode ON() { return getToken(CSharpParser.ON, 0); }
		public TerminalNode ORDERBY() { return getToken(CSharpParser.ORDERBY, 0); }
		public TerminalNode PARTIAL() { return getToken(CSharpParser.PARTIAL, 0); }
		public TerminalNode REMOVE() { return getToken(CSharpParser.REMOVE, 0); }
		public TerminalNode SELECT() { return getToken(CSharpParser.SELECT, 0); }
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public TerminalNode VAR() { return getToken(CSharpParser.VAR, 0); }
		public TerminalNode WHEN() { return getToken(CSharpParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(CSharpParser.WHERE, 0); }
		public TerminalNode YIELD() { return getToken(CSharpParser.YIELD, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2370);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << NAMEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ON - 68)) | (1L << (ORDERBY - 68)) | (1L << (PARTIAL - 68)) | (1L << (REMOVE - 68)) | (1L << (SELECT - 68)) | (1L << (SET - 68)) | (1L << (VAR - 68)) | (1L << (WHEN - 68)) | (1L << (WHERE - 68)) | (1L << (YIELD - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 152:
			return right_arrow_sempred((Right_arrowContext)_localctx, predIndex);
		case 153:
			return right_shift_sempred((Right_shiftContext)_localctx, predIndex);
		case 154:
			return right_shift_assignment_sempred((Right_shift_assignmentContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean right_arrow_sempred(Right_arrowContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return (((Right_arrowContext)_localctx).first!=null?((Right_arrowContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_arrowContext)_localctx).second!=null?((Right_arrowContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}
	private boolean right_shift_sempred(Right_shiftContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return (((Right_shiftContext)_localctx).first!=null?((Right_shiftContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shiftContext)_localctx).second!=null?((Right_shiftContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}
	private boolean right_shift_assignment_sempred(Right_shift_assignmentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return (((Right_shift_assignmentContext)_localctx).first!=null?((Right_shift_assignmentContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shift_assignmentContext)_localctx).second!=null?((Right_shift_assignmentContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c2\u0947\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
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
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\3\2\5\2\u0170\n\2\3\2\5\2\u0173\n\2\3\2\5\2\u0176\n\2"+
		"\3\2\7\2\u0179\n\2\f\2\16\2\u017c\13\2\3\2\5\2\u017f\n\2\3\2\3\2\3\3\3"+
		"\3\5\3\u0185\n\3\3\3\5\3\u0188\n\3\3\3\3\3\3\3\5\3\u018d\n\3\7\3\u018f"+
		"\n\3\f\3\16\3\u0192\13\3\3\4\3\4\3\4\3\4\7\4\u0198\n\4\f\4\16\4\u019b"+
		"\13\4\3\5\3\5\3\5\3\5\5\5\u01a1\n\5\3\6\3\6\5\6\u01a5\n\6\3\7\3\7\3\7"+
		"\5\7\u01aa\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u01b4\n\n\3\13\3\13"+
		"\3\13\3\13\7\13\u01ba\n\13\f\13\16\13\u01bd\13\13\3\13\3\13\3\f\3\f\3"+
		"\f\7\f\u01c4\n\f\f\f\16\f\u01c7\13\f\3\r\3\r\3\r\5\r\u01cc\n\r\3\r\5\r"+
		"\u01cf\n\r\3\r\3\r\5\r\u01d3\n\r\3\r\3\r\3\16\3\16\5\16\u01d9\n\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01e7\n\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01f2\n\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0217\n\16\7\16\u0219\n\16\f\16\16\16\u021c"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0229"+
		"\n\17\3\20\3\20\5\20\u022d\n\20\3\20\3\20\3\20\3\20\7\20\u0233\n\20\f"+
		"\20\16\20\u0236\13\20\3\20\3\20\7\20\u023a\n\20\f\20\16\20\u023d\13\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0245\n\20\3\20\5\20\u0248\n\20\3"+
		"\20\3\20\3\20\3\20\7\20\u024e\n\20\f\20\16\20\u0251\13\20\3\20\3\20\7"+
		"\20\u0255\n\20\f\20\16\20\u0258\13\20\7\20\u025a\n\20\f\20\16\20\u025d"+
		"\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0276\n\20\3\21"+
		"\3\21\3\21\5\21\u027b\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0289\n\21\3\21\3\21\3\21\3\21\5\21\u028f\n\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0299\n\21\f\21\16\21\u029c"+
		"\13\21\3\21\5\21\u029f\n\21\3\21\6\21\u02a2\n\21\r\21\16\21\u02a3\3\21"+
		"\3\21\5\21\u02a8\n\21\3\21\3\21\3\21\3\21\5\21\u02ae\n\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u02b5\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u02c8\n\21\3\21\3\21"+
		"\3\21\5\21\u02cd\n\21\3\21\5\21\u02d0\n\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\7\21\u02dd\n\21\f\21\16\21\u02e0\13\21\3"+
		"\21\3\21\3\21\5\21\u02e5\n\21\3\22\5\22\u02e8\n\22\3\22\3\22\3\22\5\22"+
		"\u02ed\n\22\3\23\3\23\3\23\5\23\u02f2\n\23\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\7\25\u02fb\n\25\f\25\16\25\u02fe\13\25\3\26\3\26\5\26\u0302\n"+
		"\26\3\27\3\27\3\27\5\27\u0307\n\27\5\27\u0309\n\27\3\27\3\27\3\30\3\30"+
		"\3\30\7\30\u0310\n\30\f\30\16\30\u0313\13\30\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u031a\n\31\3\31\3\31\3\31\3\32\3\32\5\32\u0321\n\32\3\33\3\33\3"+
		"\33\3\33\7\33\u0327\n\33\f\33\16\33\u032a\13\33\3\33\5\33\u032d\n\33\3"+
		"\33\3\33\3\34\5\34\u0332\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u0341\n\34\3\34\3\34\3\34\3\34\5\34\u0347"+
		"\n\34\3\35\3\35\3\35\5\35\u034c\n\35\5\35\u034e\n\35\3\35\3\35\3\36\3"+
		"\36\3\36\7\36\u0355\n\36\f\36\16\36\u0358\13\36\3\37\3\37\5\37\u035c\n"+
		"\37\3\37\3\37\3\37\3\37\7\37\u0362\n\37\f\37\16\37\u0365\13\37\3\37\3"+
		"\37\7\37\u0369\n\37\f\37\16\37\u036c\13\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\5\37\u0374\n\37\3\37\5\37\u0377\n\37\3\37\3\37\3\37\3\37\7\37\u037d"+
		"\n\37\f\37\16\37\u0380\13\37\3\37\3\37\7\37\u0384\n\37\f\37\16\37\u0387"+
		"\13\37\7\37\u0389\n\37\f\37\16\37\u038c\13\37\3\37\3\37\3\37\3\37\5\37"+
		"\u0392\n\37\3 \3 \5 \u0396\n \3 \3 \3 \5 \u039b\n \5 \u039d\n \3 \3 \3"+
		" \5 \u03a2\n \7 \u03a4\n \f \16 \u03a7\13 \3!\3!\7!\u03ab\n!\f!\16!\u03ae"+
		"\13!\3!\3!\3\"\3\"\3\"\7\"\u03b5\n\"\f\"\16\"\u03b8\13\"\3\"\5\"\u03bb"+
		"\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u03c8\n#\3$\3$\3$\7$\u03cd\n"+
		"$\f$\16$\u03d0\13$\3%\5%\u03d3\n%\3%\3%\3%\3&\3&\3&\7&\u03db\n&\f&\16"+
		"&\u03de\13&\3\'\3\'\5\'\u03e2\n\'\3(\3(\5(\u03e6\n(\3(\3(\3(\3(\3)\7)"+
		"\u03ed\n)\f)\16)\u03f0\13)\3)\3)\5)\u03f4\n)\3*\3*\3*\3*\3*\5*\u03fb\n"+
		"*\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\5-\u0407\n-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\5-\u0412\n-\3.\3.\3.\3.\7.\u0418\n.\f.\16.\u041b\13.\3/\3/\5/\u041f"+
		"\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0428\n\60\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\5\62\u0431\n\62\3\62\3\62\3\62\5\62\u0436\n\62\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\5\64\u043e\n\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u044b\n\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\7\65\u0453\n\65\f\65\16\65\u0456\13\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u046b\n\65\3\65\3\65\5\65\u046f\n\65\3\65\3\65\5\65\u0473\n\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\5\65\u0489\n\65\3\65\3\65\3\65\5\65\u048e"+
		"\n\65\3\65\3\65\3\65\5\65\u0493\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u049a"+
		"\n\65\3\65\5\65\u049d\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u04b3\n\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u04bf\n\65\3\66"+
		"\3\66\5\66\u04c3\n\66\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u04cb\n\67\f"+
		"\67\16\67\u04ce\13\67\38\38\58\u04d2\n8\39\39\39\59\u04d7\n9\3:\3:\3:"+
		"\5:\u04dc\n:\3;\3;\3;\3;\3<\3<\5<\u04e4\n<\3=\6=\u04e7\n=\r=\16=\u04e8"+
		"\3=\3=\3>\3>\3>\3>\3>\3>\5>\u04f3\n>\3?\6?\u04f6\n?\r?\16?\u04f7\3@\3"+
		"@\3@\3@\7@\u04fe\n@\f@\16@\u0501\13@\5@\u0503\n@\3A\3A\3A\7A\u0508\nA"+
		"\fA\16A\u050b\13A\3B\3B\7B\u050f\nB\fB\16B\u0512\13B\3B\5B\u0515\nB\3"+
		"B\5B\u0518\nB\3C\3C\3C\3C\5C\u051e\nC\3C\3C\5C\u0522\nC\3C\3C\3D\3D\5"+
		"D\u0528\nD\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3G\3G\5G\u0536\nG\3H\3H\3H\3"+
		"H\5H\u053c\nH\3I\3I\3I\7I\u0541\nI\fI\16I\u0544\13I\3J\3J\5J\u0548\nJ"+
		"\3J\5J\u054b\nJ\3J\5J\u054e\nJ\3J\3J\3K\6K\u0553\nK\rK\16K\u0554\3L\3"+
		"L\3L\3L\3L\3M\6M\u055d\nM\rM\16M\u055e\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\5N\u0570\nN\3O\6O\u0573\nO\rO\16O\u0574\3P\3P\5P\u0579\n"+
		"P\3Q\5Q\u057c\nQ\3Q\5Q\u057f\nQ\3Q\3Q\3Q\3Q\3Q\5Q\u0586\nQ\3R\3R\3R\3"+
		"R\5R\u058c\nR\3S\3S\3S\3S\7S\u0592\nS\fS\16S\u0595\13S\3S\3S\3T\5T\u059a"+
		"\nT\3T\3T\3U\3U\3U\3U\7U\u05a2\nU\fU\16U\u05a5\13U\3V\3V\3V\7V\u05aa\n"+
		"V\fV\16V\u05ad\13V\3W\6W\u05b0\nW\rW\16W\u05b1\3X\3X\3X\3X\3X\3Y\3Y\3"+
		"Y\3Y\5Y\u05bd\nY\3Y\3Y\5Y\u05c1\nY\5Y\u05c3\nY\3Z\3Z\3Z\5Z\u05c8\nZ\3"+
		"[\3[\3[\7[\u05cd\n[\f[\16[\u05d0\13[\3\\\3\\\3\\\3\\\3]\3]\5]\u05d8\n"+
		"]\3]\3]\3^\6^\u05dd\n^\r^\16^\u05de\3_\5_\u05e2\n_\3_\5_\u05e5\n_\3_\3"+
		"_\5_\u05e9\n_\3`\6`\u05ec\n`\r`\16`\u05ed\3a\3a\3b\3b\3b\3b\3b\3b\3b\3"+
		"b\5b\u05fa\nb\3b\3b\5b\u05fe\nb\3b\3b\5b\u0602\nb\3b\3b\3b\3b\3b\5b\u0609"+
		"\nb\3b\3b\3b\3b\5b\u060f\nb\3b\3b\3b\3b\3b\3b\3b\5b\u0618\nb\3b\3b\3b"+
		"\3b\5b\u061e\nb\3b\3b\5b\u0622\nb\3b\3b\5b\u0626\nb\3b\3b\3b\3b\3b\5b"+
		"\u062d\nb\3b\3b\3b\3b\3b\5b\u0634\nb\3c\3c\3c\7c\u0639\nc\fc\16c\u063c"+
		"\13c\3d\3d\3d\3d\3e\3e\3e\7e\u0645\ne\fe\16e\u0648\13e\3f\3f\3f\5f\u064d"+
		"\nf\3g\3g\5g\u0651\ng\3h\3h\5h\u0655\nh\3i\3i\3j\3j\5j\u065b\nj\3k\3k"+
		"\3k\3k\5k\u0661\nk\5k\u0663\nk\3l\3l\3l\7l\u0668\nl\fl\16l\u066b\13l\3"+
		"m\5m\u066e\nm\3m\5m\u0671\nm\3m\3m\5m\u0675\nm\3n\3n\3o\5o\u067a\no\3"+
		"o\3o\3o\3o\3p\5p\u0681\np\3p\5p\u0684\np\3p\3p\3p\5p\u0689\np\3p\3p\3"+
		"p\5p\u068e\np\5p\u0690\np\3q\5q\u0693\nq\3q\5q\u0696\nq\3q\3q\3q\3r\5"+
		"r\u069c\nr\3r\5r\u069f\nr\3r\3r\3r\3s\3s\3s\3s\3s\3s\3s\5s\u06ab\ns\3"+
		"t\3t\5t\u06af\nt\3u\5u\u06b2\nu\3u\3u\3u\3u\3u\3u\3u\3u\5u\u06bc\nu\3"+
		"v\5v\u06bf\nv\3v\3v\3v\3w\5w\u06c5\nw\3w\3w\3w\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\5x\u06e0\nx\3y\3y\3y\3y\3"+
		"y\3y\3y\3z\3z\3z\3z\5z\u06ed\nz\3z\3z\3{\3{\5{\u06f3\n{\3|\3|\3|\3}\3"+
		"}\7}\u06fa\n}\f}\16}\u06fd\13}\3}\3}\3~\5~\u0702\n~\3~\5~\u0705\n~\3~"+
		"\3~\3~\3~\6~\u070b\n~\r~\16~\u070c\3~\3~\5~\u0711\n~\3\177\3\177\7\177"+
		"\u0715\n\177\f\177\16\177\u0718\13\177\3\177\6\177\u071b\n\177\r\177\16"+
		"\177\u071c\3\u0080\3\u0080\7\u0080\u0721\n\u0080\f\u0080\16\u0080\u0724"+
		"\13\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u072c"+
		"\n\u0081\f\u0081\16\u0081\u072f\13\u0081\3\u0081\5\u0081\u0732\n\u0081"+
		"\5\u0081\u0734\n\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\7\u0082\u073c\n\u0082\f\u0082\16\u0082\u073f\13\u0082\3\u0082\3\u0082"+
		"\3\u0083\5\u0083\u0744\n\u0083\3\u0083\5\u0083\u0747\n\u0083\3\u0083\3"+
		"\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\7\u0086"+
		"\u0752\n\u0086\f\u0086\16\u0086\u0755\13\u0086\3\u0086\3\u0086\3\u0087"+
		"\5\u0087\u075a\n\u0087\3\u0087\5\u0087\u075d\n\u0087\3\u0087\5\u0087\u0760"+
		"\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0765\n\u0087\3\u0087\3\u0087"+
		"\5\u0087\u0769\n\u0087\3\u0087\3\u0087\5\u0087\u076d\n\u0087\3\u0087\3"+
		"\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u077e\n\u0087\3\u0087"+
		"\5\u0087\u0781\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0786\n\u0087\3"+
		"\u0087\3\u0087\5\u0087\u078a\n\u0087\3\u0087\3\u0087\5\u0087\u078e\n\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0797"+
		"\n\u0087\3\u0088\5\u0088\u079a\n\u0088\3\u0088\3\u0088\3\u0088\5\u0088"+
		"\u079f\n\u0088\3\u0088\3\u0088\5\u0088\u07a3\n\u0088\3\u0088\3\u0088\3"+
		"\u0088\5\u0088\u07a8\n\u0088\3\u0088\3\u0088\5\u0088\u07ac\n\u0088\5\u0088"+
		"\u07ae\n\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\7\u008a\u07b7\n\u008a\f\u008a\16\u008a\u07ba\13\u008a\3\u008a\5\u008a"+
		"\u07bd\n\u008a\5\u008a\u07bf\n\u008a\3\u008a\3\u008a\3\u008b\5\u008b\u07c4"+
		"\n\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u07c9\n\u008b\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\5\u008c\u07d0\n\u008c\3\u008c\3\u008c\3\u008d"+
		"\3\u008d\5\u008d\u07d6\n\u008d\3\u008e\6\u008e\u07d9\n\u008e\r\u008e\16"+
		"\u008e\u07da\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u07e1\n\u008f\3\u008f"+
		"\3\u008f\5\u008f\u07e5\n\u008f\3\u008f\3\u008f\3\u0090\3\u0090\5\u0090"+
		"\u07eb\n\u0090\3\u0091\3\u0091\3\u0091\7\u0091\u07f0\n\u0091\f\u0091\16"+
		"\u0091\u07f3\13\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\7\u0092"+
		"\u07fa\n\u0092\f\u0092\16\u0092\u07fd\13\u0092\5\u0092\u07ff\n\u0092\3"+
		"\u0092\5\u0092\u0802\n\u0092\3\u0093\3\u0093\3\u0093\5\u0093\u0807\n\u0093"+
		"\3\u0093\3\u0093\3\u0094\3\u0094\5\u0094\u080d\n\u0094\3\u0094\3\u0094"+
		"\7\u0094\u0811\n\u0094\f\u0094\16\u0094\u0814\13\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\5\u0094\u081a\n\u0094\3\u0095\3\u0095\3\u0095\7\u0095"+
		"\u081f\n\u0095\f\u0095\16\u0095\u0822\13\u0095\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0097\5\u0097\u0829\n\u0097\3\u0097\3\u0097\5\u0097\u082d\n"+
		"\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u084d\n\u009d\3\u009e\3\u009e"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0855\n\u009f\3\u00a0\3\u00a0"+
		"\7\u00a0\u0859\n\u00a0\f\u00a0\16\u00a0\u085c\13\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a1\3\u00a1\7\u00a1\u0862\n\u00a1\f\u00a1\16\u00a1\u0865\13\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u086d\n\u00a2"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0873\n\u00a3\3\u00a4\3\u00a4"+
		"\3\u00a4\7\u00a4\u0878\n\u00a4\f\u00a4\16\u00a4\u087b\13\u00a4\3\u00a4"+
		"\3\u00a4\6\u00a4\u087f\n\u00a4\r\u00a4\16\u00a4\u0880\5\u00a4\u0883\n"+
		"\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u088a\n\u00a6\3"+
		"\u00a6\5\u00a6\u088d\n\u00a6\3\u00a6\5\u00a6\u0890\n\u00a6\3\u00a6\3\u00a6"+
		"\5\u00a6\u0894\n\u00a6\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0899\n\u00a7\3"+
		"\u00a7\5\u00a7\u089c\n\u00a7\3\u00a7\5\u00a7\u089f\n\u00a7\3\u00a7\3\u00a7"+
		"\5\u00a7\u08a3\n\u00a7\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u08a8\n\u00a8\3"+
		"\u00a8\5\u00a8\u08ab\n\u00a8\3\u00a8\5\u00a8\u08ae\n\u00a8\3\u00a8\3\u00a8"+
		"\5\u00a8\u08b2\n\u00a8\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u08b7\n\u00a9\3"+
		"\u00a9\3\u00a9\5\u00a9\u08bb\n\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5"+
		"\u00aa\u08c1\n\u00aa\3\u00aa\3\u00aa\5\u00aa\u08c5\n\u00aa\3\u00aa\3\u00aa"+
		"\5\u00aa\u08c9\n\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u08d7\n\u00ab"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\5\u00ad\u08e4\n\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\5\u00ad\u08ea\n\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\5\u00af\u08fd\n\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0908\n\u00b1\3\u00b1"+
		"\3\u00b1\5\u00b1\u090c\n\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\5\u00b2\u0915\n\u00b2\3\u00b2\5\u00b2\u0918\n\u00b2\3"+
		"\u00b2\3\u00b2\7\u00b2\u091c\n\u00b2\f\u00b2\16\u00b2\u091f\13\u00b2\3"+
		"\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0927\n\u00b3\3"+
		"\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u092f\n\u00b3\3"+
		"\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0935\n\u00b4\3\u00b5\3\u00b5\5"+
		"\u00b5\u0939\n\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6\5\u00b6\u093f\n\u00b6"+
		"\3\u00b6\3\u00b6\5\u00b6\u0943\n\u00b6\3\u00b7\3\u00b7\3\u00b7\2\3\32"+
		"\u00b8\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a"+
		"\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132"+
		"\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a"+
		"\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162"+
		"\u0164\u0166\u0168\u016a\u016c\2\24\n\2\26\26\31\3188@@TTXXdehh\4\2##"+
		"..\4\2IIQQ\3\2\u0088\u008a\3\2\u0086\u0087\3\2\u009b\u009c\4\2\u0091\u0092"+
		"\u009d\u009e\20\2\23\23\26\26\31\31\36\36##..88@@EETTXX\\\\dehh\4\2\17"+
		"\17!!\16\2\n\n\20\20**::CCJJLPUU[[ggkkmm\5\2IIQQ__\4\2))\66\66\4\2\22"+
		"\22__\4\2\u0088\u0088\u0093\u0093\4\2\67\67II\4\2++aa\25\2\n\n\16\16\22"+
		"\24\26 \"#%&(\60\63\63\65:<<?@BEGGIKMQSUXikmpp\25\2\13\r\17\21\25\25!"+
		"!$$\'\'\61\62\64\64;;=>AAFFHHLLRRVWjjnoqr\2\u0a4f\2\u016f\3\2\2\2\4\u0187"+
		"\3\2\2\2\6\u0193\3\2\2\2\b\u01a0\3\2\2\2\n\u01a4\3\2\2\2\f\u01a9\3\2\2"+
		"\2\16\u01ab\3\2\2\2\20\u01ad\3\2\2\2\22\u01b3\3\2\2\2\24\u01b5\3\2\2\2"+
		"\26\u01c0\3\2\2\2\30\u01cb\3\2\2\2\32\u01e6\3\2\2\2\34\u0228\3\2\2\2\36"+
		"\u0275\3\2\2\2 \u02e4\3\2\2\2\"\u02e7\3\2\2\2$\u02f1\3\2\2\2&\u02f5\3"+
		"\2\2\2(\u02f7\3\2\2\2*\u0301\3\2\2\2,\u0303\3\2\2\2.\u030c\3\2\2\2\60"+
		"\u0319\3\2\2\2\62\u0320\3\2\2\2\64\u0322\3\2\2\2\66\u0346\3\2\2\28\u0348"+
		"\3\2\2\2:\u0351\3\2\2\2<\u0391\3\2\2\2>\u0393\3\2\2\2@\u03a8\3\2\2\2B"+
		"\u03b1\3\2\2\2D\u03c7\3\2\2\2F\u03c9\3\2\2\2H\u03d2\3\2\2\2J\u03d7\3\2"+
		"\2\2L\u03e1\3\2\2\2N\u03e3\3\2\2\2P\u03ee\3\2\2\2R\u03fa\3\2\2\2T\u03fc"+
		"\3\2\2\2V\u0401\3\2\2\2X\u0404\3\2\2\2Z\u0413\3\2\2\2\\\u041c\3\2\2\2"+
		"^\u0427\3\2\2\2`\u0429\3\2\2\2b\u0435\3\2\2\2d\u0437\3\2\2\2f\u043d\3"+
		"\2\2\2h\u04be\3\2\2\2j\u04c0\3\2\2\2l\u04c6\3\2\2\2n\u04d1\3\2\2\2p\u04d3"+
		"\3\2\2\2r\u04db\3\2\2\2t\u04dd\3\2\2\2v\u04e3\3\2\2\2x\u04e6\3\2\2\2z"+
		"\u04f2\3\2\2\2|\u04f5\3\2\2\2~\u0502\3\2\2\2\u0080\u0504\3\2\2\2\u0082"+
		"\u0517\3\2\2\2\u0084\u0519\3\2\2\2\u0086\u0525\3\2\2\2\u0088\u052b\3\2"+
		"\2\2\u008a\u0530\3\2\2\2\u008c\u0535\3\2\2\2\u008e\u0537\3\2\2\2\u0090"+
		"\u053d\3\2\2\2\u0092\u0545\3\2\2\2\u0094\u0552\3\2\2\2\u0096\u0556\3\2"+
		"\2\2\u0098\u055c\3\2\2\2\u009a\u056f\3\2\2\2\u009c\u0572\3\2\2\2\u009e"+
		"\u0578\3\2\2\2\u00a0\u057b\3\2\2\2\u00a2\u0587\3\2\2\2\u00a4\u058d\3\2"+
		"\2\2\u00a6\u0599\3\2\2\2\u00a8\u059d\3\2\2\2\u00aa\u05a6\3\2\2\2\u00ac"+
		"\u05af\3\2\2\2\u00ae\u05b3\3\2\2\2\u00b0\u05c2\3\2\2\2\u00b2\u05c7\3\2"+
		"\2\2\u00b4\u05c9\3\2\2\2\u00b6\u05d1\3\2\2\2\u00b8\u05d5\3\2\2\2\u00ba"+
		"\u05dc\3\2\2\2\u00bc\u05e1\3\2\2\2\u00be\u05eb\3\2\2\2\u00c0\u05ef\3\2"+
		"\2\2\u00c2\u0633\3\2\2\2\u00c4\u0635\3\2\2\2\u00c6\u063d\3\2\2\2\u00c8"+
		"\u0641\3\2\2\2\u00ca\u0649\3\2\2\2\u00cc\u0650\3\2\2\2\u00ce\u0654\3\2"+
		"\2\2\u00d0\u0656\3\2\2\2\u00d2\u065a\3\2\2\2\u00d4\u0662\3\2\2\2\u00d6"+
		"\u0664\3\2\2\2\u00d8\u0674\3\2\2\2\u00da\u0676\3\2\2\2\u00dc\u0679\3\2"+
		"\2\2\u00de\u0680\3\2\2\2\u00e0\u0692\3\2\2\2\u00e2\u069b\3\2\2\2\u00e4"+
		"\u06aa\3\2\2\2\u00e6\u06ae\3\2\2\2\u00e8\u06b1\3\2\2\2\u00ea\u06be\3\2"+
		"\2\2\u00ec\u06c4\3\2\2\2\u00ee\u06df\3\2\2\2\u00f0\u06e1\3\2\2\2\u00f2"+
		"\u06e8\3\2\2\2\u00f4\u06f2\3\2\2\2\u00f6\u06f4\3\2\2\2\u00f8\u06f7\3\2"+
		"\2\2\u00fa\u0701\3\2\2\2\u00fc\u0712\3\2\2\2\u00fe\u071e\3\2\2\2\u0100"+
		"\u0727\3\2\2\2\u0102\u0737\3\2\2\2\u0104\u0743\3\2\2\2\u0106\u074a\3\2"+
		"\2\2\u0108\u074c\3\2\2\2\u010a\u074f\3\2\2\2\u010c\u0759\3\2\2\2\u010e"+
		"\u0799\3\2\2\2\u0110\u07af\3\2\2\2\u0112\u07b2\3\2\2\2\u0114\u07c3\3\2"+
		"\2\2\u0116\u07ca\3\2\2\2\u0118\u07d5\3\2\2\2\u011a\u07d8\3\2\2\2\u011c"+
		"\u07dc\3\2\2\2\u011e\u07ea\3\2\2\2\u0120\u07ec\3\2\2\2\u0122\u07f4\3\2"+
		"\2\2\u0124\u0806\3\2\2\2\u0126\u0819\3\2\2\2\u0128\u081b\3\2\2\2\u012a"+
		"\u0823\3\2\2\2\u012c\u082c\3\2\2\2\u012e\u082e\3\2\2\2\u0130\u0833\3\2"+
		"\2\2\u0132\u0839\3\2\2\2\u0134\u083d\3\2\2\2\u0136\u0841\3\2\2\2\u0138"+
		"\u084c\3\2\2\2\u013a\u084e\3\2\2\2\u013c\u0854\3\2\2\2\u013e\u0856\3\2"+
		"\2\2\u0140\u085f\3\2\2\2\u0142\u086c\3\2\2\2\u0144\u0872\3\2\2\2\u0146"+
		"\u0874\3\2\2\2\u0148\u0884\3\2\2\2\u014a\u0886\3\2\2\2\u014c\u0895\3\2"+
		"\2\2\u014e\u08a4\3\2\2\2\u0150\u08b3\3\2\2\2\u0152\u08bc\3\2\2\2\u0154"+
		"\u08cc\3\2\2\2\u0156\u08d8\3\2\2\2\u0158\u08db\3\2\2\2\u015a\u08eb\3\2"+
		"\2\2\u015c\u08f0\3\2\2\2\u015e\u08fe\3\2\2\2\u0160\u0904\3\2\2\2\u0162"+
		"\u0914\3\2\2\2\u0164\u0920\3\2\2\2\u0166\u0930\3\2\2\2\u0168\u0936\3\2"+
		"\2\2\u016a\u093c\3\2\2\2\u016c\u0944\3\2\2\2\u016e\u0170\7\3\2\2\u016f"+
		"\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u0173\5\u0094"+
		"K\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174"+
		"\u0176\5\u0098M\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u017a"+
		"\3\2\2\2\u0177\u0179\5\u0116\u008c\2\u0178\u0177\3\2\2\2\u0179\u017c\3"+
		"\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017e\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u017f\5\u009cO\2\u017e\u017d\3\2\2\2\u017e\u017f"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\7\2\2\3\u0181\3\3\2\2\2\u0182"+
		"\u0184\5\u016c\u00b7\2\u0183\u0185\5\24\13\2\u0184\u0183\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0188\5\u00a2R\2\u0187\u0182"+
		"\3\2\2\2\u0187\u0186\3\2\2\2\u0188\u0190\3\2\2\2\u0189\u018a\7\u0082\2"+
		"\2\u018a\u018c\5\u016c\u00b7\2\u018b\u018d\5\24\13\2\u018c\u018b\3\2\2"+
		"\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u0189\3\2\2\2\u018f\u0192"+
		"\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\5\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0193\u0199\5\b\5\2\u0194\u0198\7\u0093\2\2\u0195\u0198"+
		"\5\u00fe\u0080\2\u0196\u0198\7\u0088\2\2\u0197\u0194\3\2\2\2\u0197\u0195"+
		"\3\2\2\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\7\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u01a1\5\n\6\2"+
		"\u019d\u01a1\5\22\n\2\u019e\u019f\7l\2\2\u019f\u01a1\7\u0088\2\2\u01a0"+
		"\u019c\3\2\2\2\u01a0\u019d\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\t\3\2\2\2"+
		"\u01a2\u01a5\5\f\7\2\u01a3\u01a5\7\23\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a3"+
		"\3\2\2\2\u01a5\13\3\2\2\2\u01a6\u01aa\5\16\b\2\u01a7\u01aa\5\20\t\2\u01a8"+
		"\u01aa\7\36\2\2\u01a9\u01a6\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3"+
		"\2\2\2\u01aa\r\3\2\2\2\u01ab\u01ac\t\2\2\2\u01ac\17\3\2\2\2\u01ad\u01ae"+
		"\t\3\2\2\u01ae\21\3\2\2\2\u01af\u01b4\5\4\3\2\u01b0\u01b4\7E\2\2\u01b1"+
		"\u01b4\7$\2\2\u01b2\u01b4\7\\\2\2\u01b3\u01af\3\2\2\2\u01b3\u01b0\3\2"+
		"\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4\23\3\2\2\2\u01b5\u01b6"+
		"\7\u0091\2\2\u01b6\u01bb\5\6\4\2\u01b7\u01b8\7\u0083\2\2\u01b8\u01ba\5"+
		"\6\4\2\u01b9\u01b7\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\7\u0092"+
		"\2\2\u01bf\25\3\2\2\2\u01c0\u01c5\5\30\r\2\u01c1\u01c2\7\u0083\2\2\u01c2"+
		"\u01c4\5\30\r\2\u01c3\u01c1\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3"+
		"\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\27\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8"+
		"\u01c9\5\u016c\u00b7\2\u01c9\u01ca\7\u0084\2\2\u01ca\u01cc\3\2\2\2\u01cb"+
		"\u01c8\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cf\t\4"+
		"\2\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0"+
		"\u01d3\7j\2\2\u01d1\u01d3\5\6\4\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2"+
		"\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\5\32\16\2\u01d5"+
		"\31\3\2\2\2\u01d6\u01d8\b\16\1\2\u01d7\u01d9\7\20\2\2\u01d8\u01d7\3\2"+
		"\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\5D#\2\u01db\u01dc"+
		"\5\u0132\u009a\2\u01dc\u01dd\5L\'\2\u01dd\u01e7\3\2\2\2\u01de\u01df\5"+
		"N(\2\u01df\u01e0\5P)\2\u01e0\u01e7\3\2\2\2\u01e1\u01e7\5\36\20\2\u01e2"+
		"\u01e3\5\36\20\2\u01e3\u01e4\5\34\17\2\u01e4\u01e5\5\32\16\3\u01e5\u01e7"+
		"\3\2\2\2\u01e6\u01d6\3\2\2\2\u01e6\u01de\3\2\2\2\u01e6\u01e1\3\2\2\2\u01e6"+
		"\u01e2\3\2\2\2\u01e7\u021a\3\2\2\2\u01e8\u01e9\f\17\2\2\u01e9\u01ea\t"+
		"\5\2\2\u01ea\u0219\5\32\16\20\u01eb\u01ec\f\16\2\2\u01ec\u01ed\t\6\2\2"+
		"\u01ed\u0219\5\32\16\17\u01ee\u01f1\f\r\2\2\u01ef\u01f2\7\u00a7\2\2\u01f0"+
		"\u01f2\5\u0134\u009b\2\u01f1\u01ef\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3"+
		"\3\2\2\2\u01f3\u0219\5\32\16\16\u01f4\u01f5\f\13\2\2\u01f5\u01f6\t\7\2"+
		"\2\u01f6\u0219\5\32\16\f\u01f7\u01f8\f\n\2\2\u01f8\u01f9\7\u008b\2\2\u01f9"+
		"\u0219\5\32\16\13\u01fa\u01fb\f\t\2\2\u01fb\u01fc\7\u008d\2\2\u01fc\u0219"+
		"\5\32\16\n\u01fd\u01fe\f\b\2\2\u01fe\u01ff\7\u008c\2\2\u01ff\u0219\5\32"+
		"\16\t\u0200\u0201\f\7\2\2\u0201\u0202\7\u0098\2\2\u0202\u0219\5\32\16"+
		"\b\u0203\u0204\f\6\2\2\u0204\u0205\7\u0099\2\2\u0205\u0219\5\32\16\7\u0206"+
		"\u0207\f\5\2\2\u0207\u0208\7\u0095\2\2\u0208\u0219\5\32\16\5\u0209\u020a"+
		"\f\4\2\2\u020a\u020b\7\u0093\2\2\u020b\u020c\5\32\16\2\u020c\u020d\7\u0084"+
		"\2\2\u020d\u020e\5\32\16\4\u020e\u0219\3\2\2\2\u020f\u0216\f\f\2\2\u0210"+
		"\u0211\t\b\2\2\u0211\u0217\5\32\16\2\u0212\u0213\7<\2\2\u0213\u0217\5"+
		"B\"\2\u0214\u0215\7\16\2\2\u0215\u0217\5\6\4\2\u0216\u0210\3\2\2\2\u0216"+
		"\u0212\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u01e8\3\2"+
		"\2\2\u0218\u01eb\3\2\2\2\u0218\u01ee\3\2\2\2\u0218\u01f4\3\2\2\2\u0218"+
		"\u01f7\3\2\2\2\u0218\u01fa\3\2\2\2\u0218\u01fd\3\2\2\2\u0218\u0200\3\2"+
		"\2\2\u0218\u0203\3\2\2\2\u0218\u0206\3\2\2\2\u0218\u0209\3\2\2\2\u0218"+
		"\u020f\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2"+
		"\2\2\u021b\33\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u0229\7\u0090\2\2\u021e"+
		"\u0229\7\u009f\2\2\u021f\u0229\7\u00a0\2\2\u0220\u0229\7\u00a1\2\2\u0221"+
		"\u0229\7\u00a2\2\2\u0222\u0229\7\u00a3\2\2\u0223\u0229\7\u00a4\2\2\u0224"+
		"\u0229\7\u00a5\2\2\u0225\u0229\7\u00a6\2\2\u0226\u0229\7\u00a8\2\2\u0227"+
		"\u0229\5\u0136\u009c\2\u0228\u021d\3\2\2\2\u0228\u021e\3\2\2\2\u0228\u021f"+
		"\3\2\2\2\u0228\u0220\3\2\2\2\u0228\u0221\3\2\2\2\u0228\u0222\3\2\2\2\u0228"+
		"\u0223\3\2\2\2\u0228\u0224\3\2\2\2\u0228\u0225\3\2\2\2\u0228\u0226\3\2"+
		"\2\2\u0228\u0227\3\2\2\2\u0229\35\3\2\2\2\u022a\u023b\5 \21\2\u022b\u022d"+
		"\7\u0093\2\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2"+
		"\2\u022e\u022f\7~\2\2\u022f\u0234\5$\23\2\u0230\u0231\7\u0083\2\2\u0231"+
		"\u0233\5$\23\2\u0232\u0230\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2"+
		"\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0234\3\2\2\2\u0237"+
		"\u0238\7\177\2\2\u0238\u023a\3\2\2\2\u0239\u022c\3\2\2\2\u023a\u023d\3"+
		"\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u025b\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023e\u0245\5\"\22\2\u023f\u0245\5\u0168\u00b5\2\u0240"+
		"\u0245\7\u0096\2\2\u0241\u0245\7\u0097\2\2\u0242\u0243\7\u009a\2\2\u0243"+
		"\u0245\5\u016c\u00b7\2\u0244\u023e\3\2\2\2\u0244\u023f\3\2\2\2\u0244\u0240"+
		"\3\2\2\2\u0244\u0241\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0256\3\2\2\2\u0246"+
		"\u0248\7\u0093\2\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249"+
		"\3\2\2\2\u0249\u024a\7~\2\2\u024a\u024f\5$\23\2\u024b\u024c\7\u0083\2"+
		"\2\u024c\u024e\5$\23\2\u024d\u024b\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d"+
		"\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0252\3\2\2\2\u0251\u024f\3\2\2\2\u0252"+
		"\u0253\7\177\2\2\u0253\u0255\3\2\2\2\u0254\u0247\3\2\2\2\u0255\u0258\3"+
		"\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u025a\3\2\2\2\u0258"+
		"\u0256\3\2\2\2\u0259\u0244\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2"+
		"\2\2\u025b\u025c\3\2\2\2\u025c\u0276\3\2\2\2\u025d\u025b\3\2\2\2\u025e"+
		"\u025f\7\u0086\2\2\u025f\u0276\5\36\20\2\u0260\u0261\7\u0087\2\2\u0261"+
		"\u0276\5\36\20\2\u0262\u0263\7\u008e\2\2\u0263\u0276\5\36\20\2\u0264\u0265"+
		"\7\u008f\2\2\u0265\u0276\5\36\20\2\u0266\u0267\7\u0096\2\2\u0267\u0276"+
		"\5\36\20\2\u0268\u0269\7\u0097\2\2\u0269\u0276\5\36\20\2\u026a\u026b\7"+
		"\u0080\2\2\u026b\u026c\5\6\4\2\u026c\u026d\7\u0081\2\2\u026d\u026e\5\36"+
		"\20\2\u026e\u0276\3\2\2\2\u026f\u0270\7\21\2\2\u0270\u0276\5\36\20\2\u0271"+
		"\u0272\7\u008b\2\2\u0272\u0276\5\36\20\2\u0273\u0274\7\u0088\2\2\u0274"+
		"\u0276\5\36\20\2\u0275\u022a\3\2\2\2\u0275\u025e\3\2\2\2\u0275\u0260\3"+
		"\2\2\2\u0275\u0262\3\2\2\2\u0275\u0264\3\2\2\2\u0275\u0266\3\2\2\2\u0275"+
		"\u0268\3\2\2\2\u0275\u026a\3\2\2\2\u0275\u026f\3\2\2\2\u0275\u0271\3\2"+
		"\2\2\u0275\u0273\3\2\2\2\u0276\37\3\2\2\2\u0277\u02e5\5\u0138\u009d\2"+
		"\u0278\u027a\5\u016c\u00b7\2\u0279\u027b\5\24\13\2\u027a\u0279\3\2\2\2"+
		"\u027a\u027b\3\2\2\2\u027b\u02e5\3\2\2\2\u027c\u027d\7\u0080\2\2\u027d"+
		"\u027e\5\32\16\2\u027e\u027f\7\u0081\2\2\u027f\u02e5\3\2\2\2\u0280\u02e5"+
		"\5&\24\2\u0281\u02e5\5\u00a2R\2\u0282\u02e5\7s\2\2\u0283\u02e5\7_\2\2"+
		"\u0284\u028e\7\22\2\2\u0285\u0286\7\u0082\2\2\u0286\u0288\5\u016c\u00b7"+
		"\2\u0287\u0289\5\24\13\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028f\3\2\2\2\u028a\u028b\7~\2\2\u028b\u028c\5(\25\2\u028c\u028d\7\177"+
		"\2\2\u028d\u028f\3\2\2\2\u028e\u0285\3\2\2\2\u028e\u028a\3\2\2\2\u028f"+
		"\u02e5\3\2\2\2\u0290\u02ad\7C\2\2\u0291\u02a7\5\6\4\2\u0292\u02a8\5\u016a"+
		"\u00b6\2\u0293\u02a8\5*\26\2\u0294\u0295\7~\2\2\u0295\u0296\5(\25\2\u0296"+
		"\u029a\7\177\2\2\u0297\u0299\5\u00fe\u0080\2\u0298\u0297\3\2\2\2\u0299"+
		"\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029e\3\2"+
		"\2\2\u029c\u029a\3\2\2\2\u029d\u029f\5\u0100\u0081\2\u029e\u029d\3\2\2"+
		"\2\u029e\u029f\3\2\2\2\u029f\u02a8\3\2\2\2\u02a0\u02a2\5\u00fe\u0080\2"+
		"\u02a1\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4"+
		"\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\5\u0100\u0081\2\u02a6\u02a8\3"+
		"\2\2\2\u02a7\u0292\3\2\2\2\u02a7\u0293\3\2\2\2\u02a7\u0294\3\2\2\2\u02a7"+
		"\u02a1\3\2\2\2\u02a8\u02ae\3\2\2\2\u02a9\u02ae\58\35\2\u02aa\u02ab\5\u00fe"+
		"\u0080\2\u02ab\u02ac\5\u0100\u0081\2\u02ac\u02ae\3\2\2\2\u02ad\u0291\3"+
		"\2\2\2\u02ad\u02a9\3\2\2\2\u02ad\u02aa\3\2\2\2\u02ae\u02e5\3\2\2\2\u02af"+
		"\u02b0\7c\2\2\u02b0\u02b4\7\u0080\2\2\u02b1\u02b5\5> \2\u02b2\u02b5\5"+
		"\6\4\2\u02b3\u02b5\7l\2\2\u02b4\u02b1\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4"+
		"\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02e5\7\u0081\2\2\u02b7\u02b8"+
		"\7\32\2\2\u02b8\u02b9\7\u0080\2\2\u02b9\u02ba\5\32\16\2\u02ba\u02bb\7"+
		"\u0081\2\2\u02bb\u02e5\3\2\2\2\u02bc\u02bd\7f\2\2\u02bd\u02be\7\u0080"+
		"\2\2\u02be\u02bf\5\32\16\2\u02bf\u02c0\7\u0081\2\2\u02c0\u02e5\3\2\2\2"+
		"\u02c1\u02c2\7\37\2\2\u02c2\u02c3\7\u0080\2\2\u02c3\u02c4\5\6\4\2\u02c4"+
		"\u02c5\7\u0081\2\2\u02c5\u02e5\3\2\2\2\u02c6\u02c8\7\20\2\2\u02c7\u02c6"+
		"\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cf\7 \2\2\u02ca"+
		"\u02cc\7\u0080\2\2\u02cb\u02cd\5F$\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd\3"+
		"\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0\7\u0081\2\2\u02cf\u02ca\3\2\2\2"+
		"\u02cf\u02d0\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02e5\5j\66\2\u02d2\u02d3"+
		"\7Y\2\2\u02d3\u02d4\7\u0080\2\2\u02d4\u02d5\5\6\4\2\u02d5\u02d6\7\u0081"+
		"\2\2\u02d6\u02e5\3\2\2\2\u02d7\u02d8\7A\2\2\u02d8\u02de\7\u0080\2\2\u02d9"+
		"\u02da\5\u016c\u00b7\2\u02da\u02db\7\u0082\2\2\u02db\u02dd\3\2\2\2\u02dc"+
		"\u02d9\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2"+
		"\2\2\u02df\u02e1\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e2\5\u016c\u00b7"+
		"\2\u02e2\u02e3\7\u0081\2\2\u02e3\u02e5\3\2\2\2\u02e4\u0277\3\2\2\2\u02e4"+
		"\u0278\3\2\2\2\u02e4\u027c\3\2\2\2\u02e4\u0280\3\2\2\2\u02e4\u0281\3\2"+
		"\2\2\u02e4\u0282\3\2\2\2\u02e4\u0283\3\2\2\2\u02e4\u0284\3\2\2\2\u02e4"+
		"\u0290\3\2\2\2\u02e4\u02af\3\2\2\2\u02e4\u02b7\3\2\2\2\u02e4\u02bc\3\2"+
		"\2\2\u02e4\u02c1\3\2\2\2\u02e4\u02c7\3\2\2\2\u02e4\u02d2\3\2\2\2\u02e4"+
		"\u02d7\3\2\2\2\u02e5!\3\2\2\2\u02e6\u02e8\7\u0093\2\2\u02e7\u02e6\3\2"+
		"\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\7\u0082\2\2\u02ea"+
		"\u02ec\5\u016c\u00b7\2\u02eb\u02ed\5\24\13\2\u02ec\u02eb\3\2\2\2\u02ec"+
		"\u02ed\3\2\2\2\u02ed#\3\2\2\2\u02ee\u02ef\5\u016c\u00b7\2\u02ef\u02f0"+
		"\7\u0084\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02ee\3\2\2\2\u02f1\u02f2\3\2\2"+
		"\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\5\32\16\2\u02f4%\3\2\2\2\u02f5\u02f6"+
		"\t\t\2\2\u02f6\'\3\2\2\2\u02f7\u02fc\5\32\16\2\u02f8\u02f9\7\u0083\2\2"+
		"\u02f9\u02fb\5\32\16\2\u02fa\u02f8\3\2\2\2\u02fb\u02fe\3\2\2\2\u02fc\u02fa"+
		"\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd)\3\2\2\2\u02fe\u02fc\3\2\2\2\u02ff"+
		"\u0302\5,\27\2\u0300\u0302\5\64\33\2\u0301\u02ff\3\2\2\2\u0301\u0300\3"+
		"\2\2\2\u0302+\3\2\2\2\u0303\u0308\7|\2\2\u0304\u0306\5.\30\2\u0305\u0307"+
		"\7\u0083\2\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0309\3\2\2"+
		"\2\u0308\u0304\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b"+
		"\7}\2\2\u030b-\3\2\2\2\u030c\u0311\5\60\31\2\u030d\u030e\7\u0083\2\2\u030e"+
		"\u0310\5\60\31\2\u030f\u030d\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3"+
		"\2\2\2\u0311\u0312\3\2\2\2\u0312/\3\2\2\2\u0313\u0311\3\2\2\2\u0314\u031a"+
		"\5\u016c\u00b7\2\u0315\u0316\7~\2\2\u0316\u0317\5\32\16\2\u0317\u0318"+
		"\7\177\2\2\u0318\u031a\3\2\2\2\u0319\u0314\3\2\2\2\u0319\u0315\3\2\2\2"+
		"\u031a\u031b\3\2\2\2\u031b\u031c\7\u0090\2\2\u031c\u031d\5\62\32\2\u031d"+
		"\61\3\2\2\2\u031e\u0321\5\32\16\2\u031f\u0321\5*\26\2\u0320\u031e\3\2"+
		"\2\2\u0320\u031f\3\2\2\2\u0321\63\3\2\2\2\u0322\u0323\7|\2\2\u0323\u0328"+
		"\5\66\34\2\u0324\u0325\7\u0083\2\2\u0325\u0327\5\66\34\2\u0326\u0324\3"+
		"\2\2\2\u0327\u032a\3\2\2\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329"+
		"\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032b\u032d\7\u0083\2\2\u032c\u032b"+
		"\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\7}\2\2\u032f"+
		"\65\3\2\2\2\u0330\u0332\7\20\2\2\u0331\u0330\3\2\2\2\u0331\u0332\3\2\2"+
		"\2\u0332\u0333\3\2\2\2\u0333\u0334\5D#\2\u0334\u0335\5\u0132\u009a\2\u0335"+
		"\u0336\5L\'\2\u0336\u0347\3\2\2\2\u0337\u0338\5N(\2\u0338\u0339\5P)\2"+
		"\u0339\u0347\3\2\2\2\u033a\u0340\5\32\16\2\u033b\u033c\7\u0093\2\2\u033c"+
		"\u033d\5\32\16\2\u033d\u033e\7\u0084\2\2\u033e\u033f\5\32\16\2\u033f\u0341"+
		"\3\2\2\2\u0340\u033b\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0347\3\2\2\2\u0342"+
		"\u0343\7|\2\2\u0343\u0344\5(\25\2\u0344\u0345\7}\2\2\u0345\u0347\3\2\2"+
		"\2\u0346\u0331\3\2\2\2\u0346\u0337\3\2\2\2\u0346\u033a\3\2\2\2\u0346\u0342"+
		"\3\2\2\2\u0347\67\3\2\2\2\u0348\u034d\7|\2\2\u0349\u034b\5:\36\2\u034a"+
		"\u034c\7\u0083\2\2\u034b\u034a\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034e"+
		"\3\2\2\2\u034d\u0349\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f"+
		"\u0350\7}\2\2\u03509\3\2\2\2\u0351\u0356\5<\37\2\u0352\u0353\7\u0083\2"+
		"\2\u0353\u0355\5<\37\2\u0354\u0352\3\2\2\2\u0355\u0358\3\2\2\2\u0356\u0354"+
		"\3\2\2\2\u0356\u0357\3\2\2\2\u0357;\3\2\2\2\u0358\u0356\3\2\2\2\u0359"+
		"\u036a\5 \21\2\u035a\u035c\7\u0093\2\2\u035b\u035a\3\2\2\2\u035b\u035c"+
		"\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035e\7~\2\2\u035e\u0363\5$\23\2\u035f"+
		"\u0360\7\u0083\2\2\u0360\u0362\5$\23\2\u0361\u035f\3\2\2\2\u0362\u0365"+
		"\3\2\2\2\u0363\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0366\3\2\2\2\u0365"+
		"\u0363\3\2\2\2\u0366\u0367\7\177\2\2\u0367\u0369\3\2\2\2\u0368\u035b\3"+
		"\2\2\2\u0369\u036c\3\2\2\2\u036a\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b"+
		"\u038a\3\2\2\2\u036c\u036a\3\2\2\2\u036d\u0374\5\"\22\2\u036e\u0374\5"+
		"\u0168\u00b5\2\u036f\u0374\7\u0096\2\2\u0370\u0374\7\u0097\2\2\u0371\u0372"+
		"\7\u009a\2\2\u0372\u0374\5\u016c\u00b7\2\u0373\u036d\3\2\2\2\u0373\u036e"+
		"\3\2\2\2\u0373\u036f\3\2\2\2\u0373\u0370\3\2\2\2\u0373\u0371\3\2\2\2\u0374"+
		"\u0385\3\2\2\2\u0375\u0377\7\u0093\2\2\u0376\u0375\3\2\2\2\u0376\u0377"+
		"\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0379\7~\2\2\u0379\u037e\5$\23\2\u037a"+
		"\u037b\7\u0083\2\2\u037b\u037d\5$\23\2\u037c\u037a\3\2\2\2\u037d\u0380"+
		"\3\2\2\2\u037e\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0381\3\2\2\2\u0380"+
		"\u037e\3\2\2\2\u0381\u0382\7\177\2\2\u0382\u0384\3\2\2\2\u0383\u0376\3"+
		"\2\2\2\u0384\u0387\3\2\2\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386"+
		"\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0388\u0373\3\2\2\2\u0389\u038c\3\2"+
		"\2\2\u038a\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u0392\3\2\2\2\u038c"+
		"\u038a\3\2\2\2\u038d\u038e\5\u016c\u00b7\2\u038e\u038f\7\u0090\2\2\u038f"+
		"\u0390\5\32\16\2\u0390\u0392\3\2\2\2\u0391\u0359\3\2\2\2\u0391\u038d\3"+
		"\2\2\2\u0392=\3\2\2\2\u0393\u039c\5\u016c\u00b7\2\u0394\u0396\5@!\2\u0395"+
		"\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u039d\3\2\2\2\u0397\u0398\7\u0094"+
		"\2\2\u0398\u039a\5\u016c\u00b7\2\u0399\u039b\5@!\2\u039a\u0399\3\2\2\2"+
		"\u039a\u039b\3\2\2\2\u039b\u039d\3\2\2\2\u039c\u0395\3\2\2\2\u039c\u0397"+
		"\3\2\2\2\u039d\u03a5\3\2\2\2\u039e\u039f\7\u0082\2\2\u039f\u03a1\5\u016c"+
		"\u00b7\2\u03a0\u03a2\5@!\2\u03a1\u03a0\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2"+
		"\u03a4\3\2\2\2\u03a3\u039e\3\2\2\2\u03a4\u03a7\3\2\2\2\u03a5\u03a3\3\2"+
		"\2\2\u03a5\u03a6\3\2\2\2\u03a6?\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a8\u03ac"+
		"\7\u0091\2\2\u03a9\u03ab\7\u0083\2\2\u03aa\u03a9\3\2\2\2\u03ab\u03ae\3"+
		"\2\2\2\u03ac\u03aa\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03af\3\2\2\2\u03ae"+
		"\u03ac\3\2\2\2\u03af\u03b0\7\u0092\2\2\u03b0A\3\2\2\2\u03b1\u03b6\5\b"+
		"\5\2\u03b2\u03b5\5\u00fe\u0080\2\u03b3\u03b5\7\u0088\2\2\u03b4\u03b2\3"+
		"\2\2\2\u03b4\u03b3\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b6"+
		"\u03b7\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9\u03bb\7\u0093"+
		"\2\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bbC\3\2\2\2\u03bc\u03bd"+
		"\7\u0080\2\2\u03bd\u03c8\7\u0081\2\2\u03be\u03bf\7\u0080\2\2\u03bf\u03c0"+
		"\5F$\2\u03c0\u03c1\7\u0081\2\2\u03c1\u03c8\3\2\2\2\u03c2\u03c3\7\u0080"+
		"\2\2\u03c3\u03c4\5J&\2\u03c4\u03c5\7\u0081\2\2\u03c5\u03c8\3\2\2\2\u03c6"+
		"\u03c8\5\u016c\u00b7\2\u03c7\u03bc\3\2\2\2\u03c7\u03be\3\2\2\2\u03c7\u03c2"+
		"\3\2\2\2\u03c7\u03c6\3\2\2\2\u03c8E\3\2\2\2\u03c9\u03ce\5H%\2\u03ca\u03cb"+
		"\7\u0083\2\2\u03cb\u03cd\5H%\2\u03cc\u03ca\3\2\2\2\u03cd\u03d0\3\2\2\2"+
		"\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cfG\3\2\2\2\u03d0\u03ce\3"+
		"\2\2\2\u03d1\u03d3\t\4\2\2\u03d2\u03d1\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3"+
		"\u03d4\3\2\2\2\u03d4\u03d5\5\6\4\2\u03d5\u03d6\5\u016c\u00b7\2\u03d6I"+
		"\3\2\2\2\u03d7\u03dc\5\u016c\u00b7\2\u03d8\u03d9\7\u0083\2\2\u03d9\u03db"+
		"\5\u016c\u00b7\2\u03da\u03d8\3\2\2\2\u03db\u03de\3\2\2\2\u03dc\u03da\3"+
		"\2\2\2\u03dc\u03dd\3\2\2\2\u03ddK\3\2\2\2\u03de\u03dc\3\2\2\2\u03df\u03e2"+
		"\5\32\16\2\u03e0\u03e2\5j\66\2\u03e1\u03df\3\2\2\2\u03e1\u03e0\3\2\2\2"+
		"\u03e2M\3\2\2\2\u03e3\u03e5\7\61\2\2\u03e4\u03e6\5\6\4\2\u03e5\u03e4\3"+
		"\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8\5\u016c\u00b7"+
		"\2\u03e8\u03e9\7\67\2\2\u03e9\u03ea\5\32\16\2\u03eaO\3\2\2\2\u03eb\u03ed"+
		"\5R*\2\u03ec\u03eb\3\2\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee"+
		"\u03ef\3\2\2\2\u03ef\u03f1\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1\u03f3\5^"+
		"\60\2\u03f2\u03f4\5`\61\2\u03f3\u03f2\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4"+
		"Q\3\2\2\2\u03f5\u03fb\5N(\2\u03f6\u03fb\5T+\2\u03f7\u03fb\5V,\2\u03f8"+
		"\u03fb\5X-\2\u03f9\u03fb\5Z.\2\u03fa\u03f5\3\2\2\2\u03fa\u03f6\3\2\2\2"+
		"\u03fa\u03f7\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03f9\3\2\2\2\u03fbS\3"+
		"\2\2\2\u03fc\u03fd\7>\2\2\u03fd\u03fe\5\u016c\u00b7\2\u03fe\u03ff\7\u0090"+
		"\2\2\u03ff\u0400\5\32\16\2\u0400U\3\2\2\2\u0401\u0402\7o\2\2\u0402\u0403"+
		"\5\32\16\2\u0403W\3\2\2\2\u0404\u0406\7=\2\2\u0405\u0407\5\6\4\2\u0406"+
		"\u0405\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\5\u016c"+
		"\u00b7\2\u0409\u040a\7\67\2\2\u040a\u040b\5\32\16\2\u040b\u040c\7F\2\2"+
		"\u040c\u040d\5\32\16\2\u040d\u040e\7\'\2\2\u040e\u0411\5\32\16\2\u040f"+
		"\u0410\7;\2\2\u0410\u0412\5\u016c\u00b7\2\u0411\u040f\3\2\2\2\u0411\u0412"+
		"\3\2\2\2\u0412Y\3\2\2\2\u0413\u0414\7H\2\2\u0414\u0419\5\\/\2\u0415\u0416"+
		"\7\u0083\2\2\u0416\u0418\5\\/\2\u0417\u0415\3\2\2\2\u0418\u041b\3\2\2"+
		"\2\u0419\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041a[\3\2\2\2\u041b\u0419"+
		"\3\2\2\2\u041c\u041e\5\32\16\2\u041d\u041f\t\n\2\2\u041e\u041d\3\2\2\2"+
		"\u041e\u041f\3\2\2\2\u041f]\3\2\2\2\u0420\u0421\7V\2\2\u0421\u0428\5\32"+
		"\16\2\u0422\u0423\7\64\2\2\u0423\u0424\5\32\16\2\u0424\u0425\7\25\2\2"+
		"\u0425\u0426\5\32\16\2\u0426\u0428\3\2\2\2\u0427\u0420\3\2\2\2\u0427\u0422"+
		"\3\2\2\2\u0428_\3\2\2\2\u0429\u042a\7;\2\2\u042a\u042b\5\u016c\u00b7\2"+
		"\u042b\u042c\5P)\2\u042ca\3\2\2\2\u042d\u0436\5d\63\2\u042e\u0431\5l\67"+
		"\2\u042f\u0431\5t;\2\u0430\u042e\3\2\2\2\u0430\u042f\3\2\2\2\u0431\u0432"+
		"\3\2\2\2\u0432\u0433\7\u0085\2\2\u0433\u0436\3\2\2\2\u0434\u0436\5f\64"+
		"\2\u0435\u042d\3\2\2\2\u0435\u0430\3\2\2\2\u0435\u0434\3\2\2\2\u0436c"+
		"\3\2\2\2\u0437\u0438\5\u016c\u00b7\2\u0438\u0439\7\u0084\2\2\u0439\u043a"+
		"\5b\62\2\u043ae\3\2\2\2\u043b\u043e\5j\66\2\u043c\u043e\5h\65\2\u043d"+
		"\u043b\3\2\2\2\u043d\u043c\3\2\2\2\u043eg\3\2\2\2\u043f\u04bf\7\u0085"+
		"\2\2\u0440\u0441\5\32\16\2\u0441\u0442\7\u0085\2\2\u0442\u04bf\3\2\2\2"+
		"\u0443\u0444\7\65\2\2\u0444\u0445\7\u0080\2\2\u0445\u0446\5\32\16\2\u0446"+
		"\u0447\7\u0081\2\2\u0447\u044a\5v<\2\u0448\u0449\7%\2\2\u0449\u044b\5"+
		"v<\2\u044a\u0448\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u04bf\3\2\2\2\u044c"+
		"\u044d\7^\2\2\u044d\u044e\7\u0080\2\2\u044e\u044f\5\32\16\2\u044f\u0450"+
		"\7\u0081\2\2\u0450\u0454\7|\2\2\u0451\u0453\5x=\2\u0452\u0451\3\2\2\2"+
		"\u0453\u0456\3\2\2\2\u0454\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0457"+
		"\3\2\2\2\u0456\u0454\3\2\2\2\u0457\u0458\7}\2\2\u0458\u04bf\3\2\2\2\u0459"+
		"\u045a\7p\2\2\u045a\u045b\7\u0080\2\2\u045b\u045c\5\32\16\2\u045c\u045d"+
		"\7\u0081\2\2\u045d\u045e\5f\64\2\u045e\u04bf\3\2\2\2\u045f\u0460\7\"\2"+
		"\2\u0460\u0461\5f\64\2\u0461\u0462\7p\2\2\u0462\u0463\7\u0080\2\2\u0463"+
		"\u0464\5\32\16\2\u0464\u0465\7\u0081\2\2\u0465\u0466\7\u0085\2\2\u0466"+
		"\u04bf\3\2\2\2\u0467\u0468\7/\2\2\u0468\u046a\7\u0080\2\2\u0469\u046b"+
		"\5~@\2\u046a\u0469\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046c\3\2\2\2\u046c"+
		"\u046e\7\u0085\2\2\u046d\u046f\5\32\16\2\u046e\u046d\3\2\2\2\u046e\u046f"+
		"\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0472\7\u0085\2\2\u0471\u0473\5\u0080"+
		"A\2\u0472\u0471\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0474\3\2\2\2\u0474"+
		"\u0475\7\u0081\2\2\u0475\u04bf\5f\64\2\u0476\u0477\7\60\2\2\u0477\u0478"+
		"\7\u0080\2\2\u0478\u0479\5n8\2\u0479\u047a\5\u016c\u00b7\2\u047a\u047b"+
		"\7\67\2\2\u047b\u047c\5\32\16\2\u047c\u047d\7\u0081\2\2\u047d\u047e\5"+
		"f\64\2\u047e\u04bf\3\2\2\2\u047f\u0480\7\24\2\2\u0480\u04bf\7\u0085\2"+
		"\2\u0481\u0482\7\35\2\2\u0482\u04bf\7\u0085\2\2\u0483\u0488\7\63\2\2\u0484"+
		"\u0489\5\u016c\u00b7\2\u0485\u0486\7\27\2\2\u0486\u0489\5\32\16\2\u0487"+
		"\u0489\7\37\2\2\u0488\u0484\3\2\2\2\u0488\u0485\3\2\2\2\u0488\u0487\3"+
		"\2\2\2\u0489\u048a\3\2\2\2\u048a\u04bf\7\u0085\2\2\u048b\u048d\7S\2\2"+
		"\u048c\u048e\5\32\16\2\u048d\u048c\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f"+
		"\3\2\2\2\u048f\u04bf\7\u0085\2\2\u0490\u0492\7`\2\2\u0491\u0493\5\32\16"+
		"\2\u0492\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u04bf"+
		"\7\u0085\2\2\u0495\u0496\7b\2\2\u0496\u049c\5j\66\2\u0497\u0499\5\u0082"+
		"B\2\u0498\u049a\5\u008aF\2\u0499\u0498\3\2\2\2\u0499\u049a\3\2\2\2\u049a"+
		"\u049d\3\2\2\2\u049b\u049d\5\u008aF\2\u049c\u0497\3\2\2\2\u049c\u049b"+
		"\3\2\2\2\u049d\u04bf\3\2\2\2\u049e\u049f\7\32\2\2\u049f\u04bf\5j\66\2"+
		"\u04a0\u04a1\7f\2\2\u04a1\u04bf\5j\66\2\u04a2\u04a3\7?\2\2\u04a3\u04a4"+
		"\7\u0080\2\2\u04a4\u04a5\5\32\16\2\u04a5\u04a6\7\u0081\2\2\u04a6\u04a7"+
		"\5f\64\2\u04a7\u04bf\3\2\2\2\u04a8\u04a9\7i\2\2\u04a9\u04aa\7\u0080\2"+
		"\2\u04aa\u04ab\5\u008cG\2\u04ab\u04ac\7\u0081\2\2\u04ac\u04ad\5f\64\2"+
		"\u04ad\u04bf\3\2\2\2\u04ae\u04b2\7q\2\2\u04af\u04b0\7S\2\2\u04b0\u04b3"+
		"\5\32\16\2\u04b1\u04b3\7\24\2\2\u04b2\u04af\3\2\2\2\u04b2\u04b1\3\2\2"+
		"\2\u04b3\u04b4\3\2\2\2\u04b4\u04bf\7\u0085\2\2\u04b5\u04b6\7g\2\2\u04b6"+
		"\u04bf\5j\66\2\u04b7\u04b8\7-\2\2\u04b8\u04b9\7\u0080\2\2\u04b9\u04ba"+
		"\5\u0126\u0094\2\u04ba\u04bb\5\u0128\u0095\2\u04bb\u04bc\7\u0081\2\2\u04bc"+
		"\u04bd\5f\64\2\u04bd\u04bf\3\2\2\2\u04be\u043f\3\2\2\2\u04be\u0440\3\2"+
		"\2\2\u04be\u0443\3\2\2\2\u04be\u044c\3\2\2\2\u04be\u0459\3\2\2\2\u04be"+
		"\u045f\3\2\2\2\u04be\u0467\3\2\2\2\u04be\u0476\3\2\2\2\u04be\u047f\3\2"+
		"\2\2\u04be\u0481\3\2\2\2\u04be\u0483\3\2\2\2\u04be\u048b\3\2\2\2\u04be"+
		"\u0490\3\2\2\2\u04be\u0495\3\2\2\2\u04be\u049e\3\2\2\2\u04be\u04a0\3\2"+
		"\2\2\u04be\u04a2\3\2\2\2\u04be\u04a8\3\2\2\2\u04be\u04ae\3\2\2\2\u04be"+
		"\u04b5\3\2\2\2\u04be\u04b7\3\2\2\2\u04bfi\3\2\2\2\u04c0\u04c2\7|\2\2\u04c1"+
		"\u04c3\5|?\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2\2"+
		"\2\u04c4\u04c5\7}\2\2\u04c5k\3\2\2\2\u04c6\u04c7\5n8\2\u04c7\u04cc\5p"+
		"9\2\u04c8\u04c9\7\u0083\2\2\u04c9\u04cb\5p9\2\u04ca\u04c8\3\2\2\2\u04cb"+
		"\u04ce\3\2\2\2\u04cc\u04ca\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cdm\3\2\2\2"+
		"\u04ce\u04cc\3\2\2\2\u04cf\u04d2\7j\2\2\u04d0\u04d2\5\6\4\2\u04d1\u04cf"+
		"\3\2\2\2\u04d1\u04d0\3\2\2\2\u04d2o\3\2\2\2\u04d3\u04d6\5\u016c\u00b7"+
		"\2\u04d4\u04d5\7\u0090\2\2\u04d5\u04d7\5r:\2\u04d6\u04d4\3\2\2\2\u04d6"+
		"\u04d7\3\2\2\2\u04d7q\3\2\2\2\u04d8\u04dc\5\32\16\2\u04d9\u04dc\5\u0100"+
		"\u0081\2\u04da\u04dc\5\u0130\u0099\2\u04db\u04d8\3\2\2\2\u04db\u04d9\3"+
		"\2\2\2\u04db\u04da\3\2\2\2\u04dcs\3\2\2\2\u04dd\u04de\7\34\2\2\u04de\u04df"+
		"\5\6\4\2\u04df\u04e0\5\u00c4c\2\u04e0u\3\2\2\2\u04e1\u04e4\5j\66\2\u04e2"+
		"\u04e4\5h\65\2\u04e3\u04e1\3\2\2\2\u04e3\u04e2\3\2\2\2\u04e4w\3\2\2\2"+
		"\u04e5\u04e7\5z>\2\u04e6\u04e5\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04e6"+
		"\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\5|?\2\u04eb"+
		"y\3\2\2\2\u04ec\u04ed\7\27\2\2\u04ed\u04ee\5\32\16\2\u04ee\u04ef\7\u0084"+
		"\2\2\u04ef\u04f3\3\2\2\2\u04f0\u04f1\7\37\2\2\u04f1\u04f3\7\u0084\2\2"+
		"\u04f2\u04ec\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f3{\3\2\2\2\u04f4\u04f6\5"+
		"b\62\2\u04f5\u04f4\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f7"+
		"\u04f8\3\2\2\2\u04f8}\3\2\2\2\u04f9\u0503\5l\67\2\u04fa\u04ff\5\32\16"+
		"\2\u04fb\u04fc\7\u0083\2\2\u04fc\u04fe\5\32\16\2\u04fd\u04fb\3\2\2\2\u04fe"+
		"\u0501\3\2\2\2\u04ff\u04fd\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0503\3\2"+
		"\2\2\u0501\u04ff\3\2\2\2\u0502\u04f9\3\2\2\2\u0502\u04fa\3\2\2\2\u0503"+
		"\177\3\2\2\2\u0504\u0509\5\32\16\2\u0505\u0506\7\u0083\2\2\u0506\u0508"+
		"\5\32\16\2\u0507\u0505\3\2\2\2\u0508\u050b\3\2\2\2\u0509\u0507\3\2\2\2"+
		"\u0509\u050a\3\2\2\2\u050a\u0081\3\2\2\2\u050b\u0509\3\2\2\2\u050c\u0510"+
		"\5\u0084C\2\u050d\u050f\5\u0084C\2\u050e\u050d\3\2\2\2\u050f\u0512\3\2"+
		"\2\2\u0510\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0514\3\2\2\2\u0512"+
		"\u0510\3\2\2\2\u0513\u0515\5\u0086D\2\u0514\u0513\3\2\2\2\u0514\u0515"+
		"\3\2\2\2\u0515\u0518\3\2\2\2\u0516\u0518\5\u0086D\2\u0517\u050c\3\2\2"+
		"\2\u0517\u0516\3\2\2\2\u0518\u0083\3\2\2\2\u0519\u051a\7\30\2\2\u051a"+
		"\u051b\7\u0080\2\2\u051b\u051d\5\22\n\2\u051c\u051e\5\u016c\u00b7\2\u051d"+
		"\u051c\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0521\7\u0081"+
		"\2\2\u0520\u0522\5\u0088E\2\u0521\u0520\3\2\2\2\u0521\u0522\3\2\2\2\u0522"+
		"\u0523\3\2\2\2\u0523\u0524\5j\66\2\u0524\u0085\3\2\2\2\u0525\u0527\7\30"+
		"\2\2\u0526\u0528\5\u0088E\2\u0527\u0526\3\2\2\2\u0527\u0528\3\2\2\2\u0528"+
		"\u0529\3\2\2\2\u0529\u052a\5j\66\2\u052a\u0087\3\2\2\2\u052b\u052c\7n"+
		"\2\2\u052c\u052d\7\u0080\2\2\u052d\u052e\5\32\16\2\u052e\u052f\7\u0081"+
		"\2\2\u052f\u0089\3\2\2\2\u0530\u0531\7,\2\2\u0531\u0532\5j\66\2\u0532"+
		"\u008b\3\2\2\2\u0533\u0536\5l\67\2\u0534\u0536\5\32\16\2\u0535\u0533\3"+
		"\2\2\2\u0535\u0534\3\2\2\2\u0536\u008d\3\2\2\2\u0537\u0538\7B\2\2\u0538"+
		"\u0539\5\u0090I\2\u0539\u053b\5\u0092J\2\u053a\u053c\7\u0085\2\2\u053b"+
		"\u053a\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u008f\3\2\2\2\u053d\u0542\5\u016c"+
		"\u00b7\2\u053e\u053f\7\u0082\2\2\u053f\u0541\5\u016c\u00b7\2\u0540\u053e"+
		"\3\2\2\2\u0541\u0544\3\2\2\2\u0542\u0540\3\2\2\2\u0542\u0543\3\2\2\2\u0543"+
		"\u0091\3\2\2\2\u0544\u0542\3\2\2\2\u0545\u0547\7|\2\2\u0546\u0548\5\u0094"+
		"K\2\u0547\u0546\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u054a\3\2\2\2\u0549"+
		"\u054b\5\u0098M\2\u054a\u0549\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054d"+
		"\3\2\2\2\u054c\u054e\5\u009cO\2\u054d\u054c\3\2\2\2\u054d\u054e\3\2\2"+
		"\2\u054e\u054f\3\2\2\2\u054f\u0550\7}\2\2\u0550\u0093\3\2\2\2\u0551\u0553"+
		"\5\u0096L\2\u0552\u0551\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0552\3\2\2"+
		"\2\u0554\u0555\3\2\2\2\u0555\u0095\3\2\2\2\u0556\u0557\7*\2\2\u0557\u0558"+
		"\7\f\2\2\u0558\u0559\5\u016c\u00b7\2\u0559\u055a\7\u0085\2\2\u055a\u0097"+
		"\3\2\2\2\u055b\u055d\5\u009aN\2\u055c\u055b\3\2\2\2\u055d\u055e\3\2\2"+
		"\2\u055e\u055c\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0099\3\2\2\2\u0560\u0561"+
		"\7i\2\2\u0561\u0562\5\u016c\u00b7\2\u0562\u0563\7\u0090\2\2\u0563\u0564"+
		"\5\4\3\2\u0564\u0565\7\u0085\2\2\u0565\u0570\3\2\2\2\u0566\u0567\7i\2"+
		"\2\u0567\u0568\5\4\3\2\u0568\u0569\7\u0085\2\2\u0569\u0570\3\2\2\2\u056a"+
		"\u056b\7i\2\2\u056b\u056c\7[\2\2\u056c\u056d\5\4\3\2\u056d\u056e\7\u0085"+
		"\2\2\u056e\u0570\3\2\2\2\u056f\u0560\3\2\2\2\u056f\u0566\3\2\2\2\u056f"+
		"\u056a\3\2\2\2\u0570\u009b\3\2\2\2\u0571\u0573\5\u009eP\2\u0572\u0571"+
		"\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0572\3\2\2\2\u0574\u0575\3\2\2\2\u0575"+
		"\u009d\3\2\2\2\u0576\u0579\5\u008eH\2\u0577\u0579\5\u00a0Q\2\u0578\u0576"+
		"\3\2\2\2\u0578\u0577\3\2\2\2\u0579\u009f\3\2\2\2\u057a\u057c\5\u011a\u008e"+
		"\2\u057b\u057a\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u057e\3\2\2\2\u057d\u057f"+
		"\5\u00be`\2\u057e\u057d\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0585\3\2\2"+
		"\2\u0580\u0586\5\u014a\u00a6\2\u0581\u0586\5\u014c\u00a7\2\u0582\u0586"+
		"\5\u014e\u00a8\2\u0583\u0586\5\u0150\u00a9\2\u0584\u0586\5\u0152\u00aa"+
		"\2\u0585\u0580\3\2\2\2\u0585\u0581\3\2\2\2\u0585\u0582\3\2\2\2\u0585\u0583"+
		"\3\2\2\2\u0585\u0584\3\2\2\2\u0586\u00a1\3\2\2\2\u0587\u0588\5\u016c\u00b7"+
		"\2\u0588\u0589\7\u0094\2\2\u0589\u058b\5\u016c\u00b7\2\u058a\u058c\5\24"+
		"\13\2\u058b\u058a\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u00a3\3\2\2\2\u058d"+
		"\u058e\7\u0091\2\2\u058e\u0593\5\u00a6T\2\u058f\u0590\7\u0083\2\2\u0590"+
		"\u0592\5\u00a6T\2\u0591\u058f\3\2\2\2\u0592\u0595\3\2\2\2\u0593\u0591"+
		"\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0596\3\2\2\2\u0595\u0593\3\2\2\2\u0596"+
		"\u0597\7\u0092\2\2\u0597\u00a5\3\2\2\2\u0598\u059a\5\u011a\u008e\2\u0599"+
		"\u0598\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059c\5\u016c"+
		"\u00b7\2\u059c\u00a7\3\2\2\2\u059d\u059e\7\u0084\2\2\u059e\u05a3\5\22"+
		"\n\2\u059f\u05a0\7\u0083\2\2\u05a0\u05a2\5\4\3\2\u05a1\u059f\3\2\2\2\u05a2"+
		"\u05a5\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u00a9\3\2"+
		"\2\2\u05a5\u05a3\3\2\2\2\u05a6\u05ab\5\4\3\2\u05a7\u05a8\7\u0083\2\2\u05a8"+
		"\u05aa\5\4\3\2\u05a9\u05a7\3\2\2\2\u05aa\u05ad\3\2\2\2\u05ab\u05a9\3\2"+
		"\2\2\u05ab\u05ac\3\2\2\2\u05ac\u00ab\3\2\2\2\u05ad\u05ab\3\2\2\2\u05ae"+
		"\u05b0\5\u00aeX\2\u05af\u05ae\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05af"+
		"\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u00ad\3\2\2\2\u05b3\u05b4\7o\2\2\u05b4"+
		"\u05b5\5\u016c\u00b7\2\u05b5\u05b6\7\u0084\2\2\u05b6\u05b7\5\u00b0Y\2"+
		"\u05b7\u00af\3\2\2\2\u05b8\u05c3\5\u00b6\\\2\u05b9\u05bc\5\u00b2Z\2\u05ba"+
		"\u05bb\7\u0083\2\2\u05bb\u05bd\5\u00b4[\2\u05bc\u05ba\3\2\2\2\u05bc\u05bd"+
		"\3\2\2\2\u05bd\u05c0\3\2\2\2\u05be\u05bf\7\u0083\2\2\u05bf\u05c1\5\u00b6"+
		"\\\2\u05c0\u05be\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c3\3\2\2\2\u05c2"+
		"\u05b8\3\2\2\2\u05c2\u05b9\3\2\2\2\u05c3\u00b1\3\2\2\2\u05c4\u05c8\5\22"+
		"\n\2\u05c5\u05c8\7\33\2\2\u05c6\u05c8\7]\2\2\u05c7\u05c4\3\2\2\2\u05c7"+
		"\u05c5\3\2\2\2\u05c7\u05c6\3\2\2\2\u05c8\u00b3\3\2\2\2\u05c9\u05ce\5\4"+
		"\3\2\u05ca\u05cb\7\u0083\2\2\u05cb\u05cd\5\4\3\2\u05cc\u05ca\3\2\2\2\u05cd"+
		"\u05d0\3\2\2\2\u05ce\u05cc\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u00b5\3\2"+
		"\2\2\u05d0\u05ce\3\2\2\2\u05d1\u05d2\7C\2\2\u05d2\u05d3\7\u0080\2\2\u05d3"+
		"\u05d4\7\u0081\2\2\u05d4\u00b7\3\2\2\2\u05d5\u05d7\7|\2\2\u05d6\u05d8"+
		"\5\u00ba^\2\u05d7\u05d6\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05d9\3\2\2"+
		"\2\u05d9\u05da\7}\2\2\u05da\u00b9\3\2\2\2\u05db\u05dd\5\u00bc_\2\u05dc"+
		"\u05db\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05dc\3\2\2\2\u05de\u05df\3\2"+
		"\2\2\u05df\u00bb\3\2\2\2\u05e0\u05e2\5\u011a\u008e\2\u05e1\u05e0\3\2\2"+
		"\2\u05e1\u05e2\3\2\2\2\u05e2\u05e4\3\2\2\2\u05e3\u05e5\5\u00be`\2\u05e4"+
		"\u05e3\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e8\3\2\2\2\u05e6\u05e9\5\u00c2"+
		"b\2\u05e7\u05e9\5\u015e\u00b0\2\u05e8\u05e6\3\2\2\2\u05e8\u05e7\3\2\2"+
		"\2\u05e9\u00bd\3\2\2\2\u05ea\u05ec\5\u00c0a\2\u05eb\u05ea\3\2\2\2\u05ec"+
		"\u05ed\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u00bf\3\2"+
		"\2\2\u05ef\u05f0\t\13\2\2\u05f0\u00c1\3\2\2\2\u05f1\u0634\5\u015a\u00ae"+
		"\2\u05f2\u060e\5\6\4\2\u05f3\u05f4\5\4\3\2\u05f4\u05f5\7\u0082\2\2\u05f5"+
		"\u05f6\5\u015c\u00af\2\u05f6\u060f\3\2\2\2\u05f7\u05f9\5\u0162\u00b2\2"+
		"\u05f8\u05fa\5\u00a4S\2\u05f9\u05f8\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa"+
		"\u05fb\3\2\2\2\u05fb\u05fd\7\u0080\2\2\u05fc\u05fe\5\u00d4k\2\u05fd\u05fc"+
		"\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0601\7\u0081\2"+
		"\2\u0600\u0602\5\u00acW\2\u0601\u0600\3\2\2\2\u0601\u0602\3\2\2\2\u0602"+
		"\u0608\3\2\2\2\u0603\u0609\5\u00d2j\2\u0604\u0605\5\u0132\u009a\2\u0605"+
		"\u0606\5\32\16\2\u0606\u0607\7\u0085\2\2\u0607\u0609\3\2\2\2\u0608\u0603"+
		"\3\2\2\2\u0608\u0604\3\2\2\2\u0609\u060f\3\2\2\2\u060a\u060f\5\u0158\u00ad"+
		"\2\u060b\u060f\5\u015c\u00af\2\u060c\u060f\5\u0164\u00b3\2\u060d\u060f"+
		"\5\u0156\u00ac\2\u060e\u05f3\3\2\2\2\u060e\u05f7\3\2\2\2\u060e\u060a\3"+
		"\2\2\2\u060e\u060b\3\2\2\2\u060e\u060c\3\2\2\2\u060e\u060d\3\2\2\2\u060f"+
		"\u0634\3\2\2\2\u0610\u0634\5\u0154\u00ab\2\u0611\u0617\5\u00f0y\2\u0612"+
		"\u0618\5\u00f4{\2\u0613\u0614\5\u0132\u009a\2\u0614\u0615\5\32\16\2\u0615"+
		"\u0616\7\u0085\2\2\u0616\u0618\3\2\2\2\u0617\u0612\3\2\2\2\u0617\u0613"+
		"\3\2\2\2\u0618\u0634\3\2\2\2\u0619\u0634\5\u0160\u00b1\2\u061a\u061b\7"+
		"l\2\2\u061b\u061d\5\u0162\u00b2\2\u061c\u061e\5\u00a4S\2\u061d\u061c\3"+
		"\2\2\2\u061d\u061e\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0621\7\u0080\2\2"+
		"\u0620\u0622\5\u00d4k\2\u0621\u0620\3\2\2\2\u0621\u0622\3\2\2\2\u0622"+
		"\u0623\3\2\2\2\u0623\u0625\7\u0081\2\2\u0624\u0626\5\u00acW\2\u0625\u0624"+
		"\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u062c\3\2\2\2\u0627\u062d\5\u00d2j"+
		"\2\u0628\u0629\5\u0132\u009a\2\u0629\u062a\5\32\16\2\u062a\u062b\7\u0085"+
		"\2\2\u062b\u062d\3\2\2\2\u062c\u0627\3\2\2\2\u062c\u0628\3\2\2\2\u062d"+
		"\u0634\3\2\2\2\u062e\u0634\5\u014a\u00a6\2\u062f\u0634\5\u014c\u00a7\2"+
		"\u0630\u0634\5\u014e\u00a8\2\u0631\u0634\5\u0150\u00a9\2\u0632\u0634\5"+
		"\u0152\u00aa\2\u0633\u05f1\3\2\2\2\u0633\u05f2\3\2\2\2\u0633\u0610\3\2"+
		"\2\2\u0633\u0611\3\2\2\2\u0633\u0619\3\2\2\2\u0633\u061a\3\2\2\2\u0633"+
		"\u062e\3\2\2\2\u0633\u062f\3\2\2\2\u0633\u0630\3\2\2\2\u0633\u0631\3\2"+
		"\2\2\u0633\u0632\3\2\2\2\u0634\u00c3\3\2\2\2\u0635\u063a\5\u00c6d\2\u0636"+
		"\u0637\7\u0083\2\2\u0637\u0639\5\u00c6d\2\u0638\u0636\3\2\2\2\u0639\u063c"+
		"\3\2\2\2\u063a\u0638\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u00c5\3\2\2\2\u063c"+
		"\u063a\3\2\2\2\u063d\u063e\5\u016c\u00b7\2\u063e\u063f\7\u0090\2\2\u063f"+
		"\u0640\5\32\16\2\u0640\u00c7\3\2\2\2\u0641\u0646\5\u00caf\2\u0642\u0643"+
		"\7\u0083\2\2\u0643\u0645\5\u00caf\2\u0644\u0642\3\2\2\2\u0645\u0648\3"+
		"\2\2\2\u0646\u0644\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u00c9\3\2\2\2\u0648"+
		"\u0646\3\2\2\2\u0649\u064c\5\u016c\u00b7\2\u064a\u064b\7\u0090\2\2\u064b"+
		"\u064d\5\u00ccg\2\u064c\u064a\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u00cb"+
		"\3\2\2\2\u064e\u0651\5\32\16\2\u064f\u0651\5\u0100\u0081\2\u0650\u064e"+
		"\3\2\2\2\u0650\u064f\3\2\2\2\u0651\u00cd\3\2\2\2\u0652\u0655\5\6\4\2\u0653"+
		"\u0655\7l\2\2\u0654\u0652\3\2\2\2\u0654\u0653\3\2\2\2\u0655\u00cf\3\2"+
		"\2\2\u0656\u0657\5\4\3\2\u0657\u00d1\3\2\2\2\u0658\u065b\5j\66\2\u0659"+
		"\u065b\7\u0085\2\2\u065a\u0658\3\2\2\2\u065a\u0659\3\2\2\2\u065b\u00d3"+
		"\3\2\2\2\u065c\u0663\5\u00dco\2\u065d\u0660\5\u00d6l\2\u065e\u065f\7\u0083"+
		"\2\2\u065f\u0661\5\u00dco\2\u0660\u065e\3\2\2\2\u0660\u0661\3\2\2\2\u0661"+
		"\u0663\3\2\2\2\u0662\u065c\3\2\2\2\u0662\u065d\3\2\2\2\u0663\u00d5\3\2"+
		"\2\2\u0664\u0669\5\u00d8m\2\u0665\u0666\7\u0083\2\2\u0666\u0668\5\u00d8"+
		"m\2\u0667\u0665\3\2\2\2\u0668\u066b\3\2\2\2\u0669\u0667\3\2\2\2\u0669"+
		"\u066a\3\2\2\2\u066a\u00d7\3\2\2\2\u066b\u0669\3\2\2\2\u066c\u066e\5\u011a"+
		"\u008e\2\u066d\u066c\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u0670\3\2\2\2\u066f"+
		"\u0671\5\u00dan\2\u0670\u066f\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u0672"+
		"\3\2\2\2\u0672\u0675\5\u0166\u00b4\2\u0673\u0675\7\r\2\2\u0674\u066d\3"+
		"\2\2\2\u0674\u0673\3\2\2\2\u0675\u00d9\3\2\2\2\u0676\u0677\t\f\2\2\u0677"+
		"\u00db\3\2\2\2\u0678\u067a\5\u011a\u008e\2\u0679\u0678\3\2\2\2\u0679\u067a"+
		"\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067c\7K\2\2\u067c\u067d\5\u00fc\177"+
		"\2\u067d\u067e\5\u016c\u00b7\2\u067e\u00dd\3\2\2\2\u067f\u0681\5\u011a"+
		"\u008e\2\u0680\u067f\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u0683\3\2\2\2\u0682"+
		"\u0684\5\u00e4s\2\u0683\u0682\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u068f"+
		"\3\2\2\2\u0685\u0686\7\62\2\2\u0686\u0688\5\u00e6t\2\u0687\u0689\5\u00e2"+
		"r\2\u0688\u0687\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u0690\3\2\2\2\u068a"+
		"\u068b\7W\2\2\u068b\u068d\5\u00e6t\2\u068c\u068e\5\u00e0q\2\u068d\u068c"+
		"\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u0690\3\2\2\2\u068f\u0685\3\2\2\2\u068f"+
		"\u068a\3\2\2\2\u0690\u00df\3\2\2\2\u0691\u0693\5\u011a\u008e\2\u0692\u0691"+
		"\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0695\3\2\2\2\u0694\u0696\5\u00e4s"+
		"\2\u0695\u0694\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u0698"+
		"\7\62\2\2\u0698\u0699\5\u00e6t\2\u0699\u00e1\3\2\2\2\u069a\u069c\5\u011a"+
		"\u008e\2\u069b\u069a\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069e\3\2\2\2\u069d"+
		"\u069f\5\u00e4s\2\u069e\u069d\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a0"+
		"\3\2\2\2\u06a0\u06a1\7W\2\2\u06a1\u06a2\5\u00e6t\2\u06a2\u00e3\3\2\2\2"+
		"\u06a3\u06ab\7N\2\2\u06a4\u06ab\7:\2\2\u06a5\u06ab\7M\2\2\u06a6\u06a7"+
		"\7N\2\2\u06a7\u06ab\7:\2\2\u06a8\u06a9\7:\2\2\u06a9\u06ab\7N\2\2\u06aa"+
		"\u06a3\3\2\2\2\u06aa\u06a4\3\2\2\2\u06aa\u06a5\3\2\2\2\u06aa\u06a6\3\2"+
		"\2\2\u06aa\u06a8\3\2\2\2\u06ab\u00e5\3\2\2\2\u06ac\u06af\5j\66\2\u06ad"+
		"\u06af\7\u0085\2\2\u06ae\u06ac\3\2\2\2\u06ae\u06ad\3\2\2\2\u06af\u00e7"+
		"\3\2\2\2\u06b0\u06b2\5\u011a\u008e\2\u06b1\u06b0\3\2\2\2\u06b1\u06b2\3"+
		"\2\2\2\u06b2\u06bb\3\2\2\2\u06b3\u06b4\7\13\2\2\u06b4\u06b5\5j\66\2\u06b5"+
		"\u06b6\5\u00ecw\2\u06b6\u06bc\3\2\2\2\u06b7\u06b8\7R\2\2\u06b8\u06b9\5"+
		"j\66\2\u06b9\u06ba\5\u00eav\2\u06ba\u06bc\3\2\2\2\u06bb\u06b3\3\2\2\2"+
		"\u06bb\u06b7\3\2\2\2\u06bc\u00e9\3\2\2\2\u06bd\u06bf\5\u011a\u008e\2\u06be"+
		"\u06bd\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c1\7\13"+
		"\2\2\u06c1\u06c2\5j\66\2\u06c2\u00eb\3\2\2\2\u06c3\u06c5\5\u011a\u008e"+
		"\2\u06c4\u06c3\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06c7"+
		"\7R\2\2\u06c7\u06c8\5j\66\2\u06c8\u00ed\3\2\2\2\u06c9\u06e0\7\u0086\2"+
		"\2\u06ca\u06e0\7\u0087\2\2\u06cb\u06e0\7\u008e\2\2\u06cc\u06e0\7\u008f"+
		"\2\2\u06cd\u06e0\7\u0096\2\2\u06ce\u06e0\7\u0097\2\2\u06cf\u06e0\7a\2"+
		"\2\u06d0\u06e0\7+\2\2\u06d1\u06e0\7\u0088\2\2\u06d2\u06e0\7\u0089\2\2"+
		"\u06d3\u06e0\7\u008a\2\2\u06d4\u06e0\7\u008b\2\2\u06d5\u06e0\7\u008c\2"+
		"\2\u06d6\u06e0\7\u008d\2\2\u06d7\u06e0\7\u00a7\2\2\u06d8\u06e0\5\u0134"+
		"\u009b\2\u06d9\u06e0\7\u009b\2\2\u06da\u06e0\7\u009c\2\2\u06db\u06e0\7"+
		"\u0092\2\2\u06dc\u06e0\7\u0091\2\2\u06dd\u06e0\7\u009e\2\2\u06de\u06e0"+
		"\7\u009d\2\2\u06df\u06c9\3\2\2\2\u06df\u06ca\3\2\2\2\u06df\u06cb\3\2\2"+
		"\2\u06df\u06cc\3\2\2\2\u06df\u06cd\3\2\2\2\u06df\u06ce\3\2\2\2\u06df\u06cf"+
		"\3\2\2\2\u06df\u06d0\3\2\2\2\u06df\u06d1\3\2\2\2\u06df\u06d2\3\2\2\2\u06df"+
		"\u06d3\3\2\2\2\u06df\u06d4\3\2\2\2\u06df\u06d5\3\2\2\2\u06df\u06d6\3\2"+
		"\2\2\u06df\u06d7\3\2\2\2\u06df\u06d8\3\2\2\2\u06df\u06d9\3\2\2\2\u06df"+
		"\u06da\3\2\2\2\u06df\u06db\3\2\2\2\u06df\u06dc\3\2\2\2\u06df\u06dd\3\2"+
		"\2\2\u06df\u06de\3\2\2\2\u06e0\u00ef\3\2\2\2\u06e1\u06e2\t\r\2\2\u06e2"+
		"\u06e3\7G\2\2\u06e3\u06e4\5\6\4\2\u06e4\u06e5\7\u0080\2\2\u06e5\u06e6"+
		"\5\u0166\u00b4\2\u06e6\u06e7\7\u0081\2\2\u06e7\u00f1\3\2\2\2\u06e8\u06e9"+
		"\7\u0084\2\2\u06e9\u06ea\t\16\2\2\u06ea\u06ec\7\u0080\2\2\u06eb\u06ed"+
		"\5\26\f\2\u06ec\u06eb\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ee\3\2\2\2"+
		"\u06ee\u06ef\7\u0081\2\2\u06ef\u00f3\3\2\2\2\u06f0\u06f3\5j\66\2\u06f1"+
		"\u06f3\7\u0085\2\2\u06f2\u06f0\3\2\2\2\u06f2\u06f1\3\2\2\2\u06f3\u00f5"+
		"\3\2\2\2\u06f4\u06f5\7\u0084\2\2\u06f5\u06f6\5\u00aaV\2\u06f6\u00f7\3"+
		"\2\2\2\u06f7\u06fb\7|\2\2\u06f8\u06fa\5\u00fa~\2\u06f9\u06f8\3\2\2\2\u06fa"+
		"\u06fd\3\2\2\2\u06fb\u06f9\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u06fe\3\2"+
		"\2\2\u06fd\u06fb\3\2\2\2\u06fe\u06ff\7}\2\2\u06ff\u00f9\3\2\2\2\u0700"+
		"\u0702\5\u011a\u008e\2\u0701\u0700\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0704"+
		"\3\2\2\2\u0703\u0705\5\u00be`\2\u0704\u0703\3\2\2\2\u0704\u0705\3\2\2"+
		"\2\u0705\u0710\3\2\2\2\u0706\u0711\5\u00c2b\2\u0707\u0708\7-\2\2\u0708"+
		"\u070a\5\6\4\2\u0709\u070b\5\u012e\u0098\2\u070a\u0709\3\2\2\2\u070b\u070c"+
		"\3\2\2\2\u070c\u070a\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u070e\3\2\2\2\u070e"+
		"\u070f\7\u0085\2\2\u070f\u0711\3\2\2\2\u0710\u0706\3\2\2\2\u0710\u0707"+
		"\3\2\2\2\u0711\u00fb\3\2\2\2\u0712\u071a\5\b\5\2\u0713\u0715\t\17\2\2"+
		"\u0714\u0713\3\2\2\2\u0715\u0718\3\2\2\2\u0716\u0714\3\2\2\2\u0716\u0717"+
		"\3\2\2\2\u0717\u0719\3\2\2\2\u0718\u0716\3\2\2\2\u0719\u071b\5\u00fe\u0080"+
		"\2\u071a\u0716\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u071a\3\2\2\2\u071c\u071d"+
		"\3\2\2\2\u071d\u00fd\3\2\2\2\u071e\u0722\7~\2\2\u071f\u0721\7\u0083\2"+
		"\2\u0720\u071f\3\2\2\2\u0721\u0724\3\2\2\2\u0722\u0720\3\2\2\2\u0722\u0723"+
		"\3\2\2\2\u0723\u0725\3\2\2\2\u0724\u0722\3\2\2\2\u0725\u0726\7\177\2\2"+
		"\u0726\u00ff\3\2\2\2\u0727\u0733\7|\2\2\u0728\u072d\5\u00ccg\2\u0729\u072a"+
		"\7\u0083\2\2\u072a\u072c\5\u00ccg\2\u072b\u0729\3\2\2\2\u072c\u072f\3"+
		"\2\2\2\u072d\u072b\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u0731\3\2\2\2\u072f"+
		"\u072d\3\2\2\2\u0730\u0732\7\u0083\2\2\u0731\u0730\3\2\2\2\u0731\u0732"+
		"\3\2\2\2\u0732\u0734\3\2\2\2\u0733\u0728\3\2\2\2\u0733\u0734\3\2\2\2\u0734"+
		"\u0735\3\2\2\2\u0735\u0736\7}\2\2\u0736\u0101\3\2\2\2\u0737\u0738\7\u0091"+
		"\2\2\u0738\u073d\5\u0104\u0083\2\u0739\u073a\7\u0083\2\2\u073a\u073c\5"+
		"\u0104\u0083\2\u073b\u0739\3\2\2\2\u073c\u073f\3\2\2\2\u073d\u073b\3\2"+
		"\2\2\u073d\u073e\3\2\2\2\u073e\u0740\3\2\2\2\u073f\u073d\3\2\2\2\u0740"+
		"\u0741\7\u0092\2\2\u0741\u0103\3\2\2\2\u0742\u0744\5\u011a\u008e\2\u0743"+
		"\u0742\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0746\3\2\2\2\u0745\u0747\5\u0106"+
		"\u0084\2\u0746\u0745\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0748\3\2\2\2\u0748"+
		"\u0749\5\u016c\u00b7\2\u0749\u0105\3\2\2\2\u074a\u074b\t\20\2\2\u074b"+
		"\u0107\3\2\2\2\u074c\u074d\7\u0084\2\2\u074d\u074e\5\u00aaV\2\u074e\u0109"+
		"\3\2\2\2\u074f\u0753\7|\2\2\u0750\u0752\5\u010c\u0087\2\u0751\u0750\3"+
		"\2\2\2\u0752\u0755\3\2\2\2\u0753\u0751\3\2\2\2\u0753\u0754\3\2\2\2\u0754"+
		"\u0756\3\2\2\2\u0755\u0753\3\2\2\2\u0756\u0757\7}\2\2\u0757\u010b\3\2"+
		"\2\2\u0758\u075a\5\u011a\u008e\2\u0759\u0758\3\2\2\2\u0759\u075a\3\2\2"+
		"\2\u075a\u075c\3\2\2\2\u075b\u075d\7C\2\2\u075c\u075b\3\2\2\2\u075c\u075d"+
		"\3\2\2\2\u075d\u0796\3\2\2\2\u075e\u0760\7g\2\2\u075f\u075e\3\2\2\2\u075f"+
		"\u0760\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u077d\5\6\4\2\u0762\u0764\5\u016c"+
		"\u00b7\2\u0763\u0765\5\u00a4S\2\u0764\u0763\3\2\2\2\u0764\u0765\3\2\2"+
		"\2\u0765\u0766\3\2\2\2\u0766\u0768\7\u0080\2\2\u0767\u0769\5\u00d4k\2"+
		"\u0768\u0767\3\2\2\2\u0768\u0769\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u076c"+
		"\7\u0081\2\2\u076b\u076d\5\u00acW\2\u076c\u076b\3\2\2\2\u076c\u076d\3"+
		"\2\2\2\u076d\u076e\3\2\2\2\u076e\u076f\7\u0085\2\2\u076f\u077e\3\2\2\2"+
		"\u0770\u0771\5\u016c\u00b7\2\u0771\u0772\7|\2\2\u0772\u0773\5\u010e\u0088"+
		"\2\u0773\u0774\7}\2\2\u0774\u077e\3\2\2\2\u0775\u0776\7_\2\2\u0776\u0777"+
		"\7~\2\2\u0777\u0778\5\u00d4k\2\u0778\u0779\7\177\2\2\u0779\u077a\7|\2"+
		"\2\u077a\u077b\5\u010e\u0088\2\u077b\u077c\7}\2\2\u077c\u077e\3\2\2\2"+
		"\u077d\u0762\3\2\2\2\u077d\u0770\3\2\2\2\u077d\u0775\3\2\2\2\u077e\u0797"+
		"\3\2\2\2\u077f\u0781\7g\2\2\u0780\u077f\3\2\2\2\u0780\u0781\3\2\2\2\u0781"+
		"\u0782\3\2\2\2\u0782\u0783\7l\2\2\u0783\u0785\5\u016c\u00b7\2\u0784\u0786"+
		"\5\u00a4S\2\u0785\u0784\3\2\2\2\u0785\u0786\3\2\2\2\u0786\u0787\3\2\2"+
		"\2\u0787\u0789\7\u0080\2\2\u0788\u078a\5\u00d4k\2\u0789\u0788\3\2\2\2"+
		"\u0789\u078a\3\2\2\2\u078a\u078b\3\2\2\2\u078b\u078d\7\u0081\2\2\u078c"+
		"\u078e\5\u00acW\2\u078d\u078c\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u078f"+
		"\3\2\2\2\u078f\u0790\7\u0085\2\2\u0790\u0797\3\2\2\2\u0791\u0792\7(\2"+
		"\2\u0792\u0793\5\6\4\2\u0793\u0794\5\u016c\u00b7\2\u0794\u0795\7\u0085"+
		"\2\2\u0795\u0797\3\2\2\2\u0796\u075f\3\2\2\2\u0796\u0780\3\2\2\2\u0796"+
		"\u0791\3\2\2\2\u0797\u010d\3\2\2\2\u0798\u079a\5\u011a\u008e\2\u0799\u0798"+
		"\3\2\2\2\u0799\u079a\3\2\2\2\u079a\u07ad\3\2\2\2\u079b\u079c\7\62\2\2"+
		"\u079c\u07a2\7\u0085\2\2\u079d\u079f\5\u011a\u008e\2\u079e\u079d\3\2\2"+
		"\2\u079e\u079f\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0\u07a1\7W\2\2\u07a1\u07a3"+
		"\7\u0085\2\2\u07a2\u079e\3\2\2\2\u07a2\u07a3\3\2\2\2\u07a3\u07ae\3\2\2"+
		"\2\u07a4\u07a5\7W\2\2\u07a5\u07ab\7\u0085\2\2\u07a6\u07a8\5\u011a\u008e"+
		"\2\u07a7\u07a6\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07aa"+
		"\7\62\2\2\u07aa\u07ac\7\u0085\2\2\u07ab\u07a7\3\2\2\2\u07ab\u07ac\3\2"+
		"\2\2\u07ac\u07ae\3\2\2\2\u07ad\u079b\3\2\2\2\u07ad\u07a4\3\2\2\2\u07ae"+
		"\u010f\3\2\2\2\u07af\u07b0\7\u0084\2\2\u07b0\u07b1\5\6\4\2\u07b1\u0111"+
		"\3\2\2\2\u07b2\u07be\7|\2\2\u07b3\u07b8\5\u0114\u008b\2\u07b4\u07b5\7"+
		"\u0083\2\2\u07b5\u07b7\5\u0114\u008b\2\u07b6\u07b4\3\2\2\2\u07b7\u07ba"+
		"\3\2\2\2\u07b8\u07b6\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u07bc\3\2\2\2\u07ba"+
		"\u07b8\3\2\2\2\u07bb\u07bd\7\u0083\2\2\u07bc\u07bb\3\2\2\2\u07bc\u07bd"+
		"\3\2\2\2\u07bd\u07bf\3\2\2\2\u07be\u07b3\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf"+
		"\u07c0\3\2\2\2\u07c0\u07c1\7}\2\2\u07c1\u0113\3\2\2\2\u07c2\u07c4\5\u011a"+
		"\u008e\2\u07c3\u07c2\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5"+
		"\u07c8\5\u016c\u00b7\2\u07c6\u07c7\7\u0090\2\2\u07c7\u07c9\5\32\16\2\u07c8"+
		"\u07c6\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u0115\3\2\2\2\u07ca\u07cb\7~"+
		"\2\2\u07cb\u07cc\5\u0118\u008d\2\u07cc\u07cd\7\u0084\2\2\u07cd\u07cf\5"+
		"\u0120\u0091\2\u07ce\u07d0\7\u0083\2\2\u07cf\u07ce\3\2\2\2\u07cf\u07d0"+
		"\3\2\2\2\u07d0\u07d1\3\2\2\2\u07d1\u07d2\7\177\2\2\u07d2\u0117\3\2\2\2"+
		"\u07d3\u07d6\5\u0148\u00a5\2\u07d4\u07d6\5\u016c\u00b7\2\u07d5\u07d3\3"+
		"\2\2\2\u07d5\u07d4\3\2\2\2\u07d6\u0119\3\2\2\2\u07d7\u07d9\5\u011c\u008f"+
		"\2\u07d8\u07d7\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u07d8\3\2\2\2\u07da\u07db"+
		"\3\2\2\2\u07db\u011b\3\2\2\2\u07dc\u07e0\7~\2\2\u07dd\u07de\5\u011e\u0090"+
		"\2\u07de\u07df\7\u0084\2\2\u07df\u07e1\3\2\2\2\u07e0\u07dd\3\2\2\2\u07e0"+
		"\u07e1\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u07e4\5\u0120\u0091\2\u07e3\u07e5"+
		"\7\u0083\2\2\u07e4\u07e3\3\2\2\2\u07e4\u07e5\3\2\2\2\u07e5\u07e6\3\2\2"+
		"\2\u07e6\u07e7\7\177\2\2\u07e7\u011d\3\2\2\2\u07e8\u07eb\5\u0148\u00a5"+
		"\2\u07e9\u07eb\5\u016c\u00b7\2\u07ea\u07e8\3\2\2\2\u07ea\u07e9\3\2\2\2"+
		"\u07eb\u011f\3\2\2\2\u07ec\u07f1\5\u0122\u0092\2\u07ed\u07ee\7\u0083\2"+
		"\2\u07ee\u07f0\5\u0122\u0092\2\u07ef\u07ed\3\2\2\2\u07f0\u07f3\3\2\2\2"+
		"\u07f1\u07ef\3\2\2\2\u07f1\u07f2\3\2\2\2\u07f2\u0121\3\2\2\2\u07f3\u07f1"+
		"\3\2\2\2\u07f4\u0801\5\4\3\2\u07f5\u07fe\7\u0080\2\2\u07f6\u07fb\5\u0124"+
		"\u0093\2\u07f7\u07f8\7\u0083\2\2\u07f8\u07fa\5\u0124\u0093\2\u07f9\u07f7"+
		"\3\2\2\2\u07fa\u07fd\3\2\2\2\u07fb\u07f9\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc"+
		"\u07ff\3\2\2\2\u07fd\u07fb\3\2\2\2\u07fe\u07f6\3\2\2\2\u07fe\u07ff\3\2"+
		"\2\2\u07ff\u0800\3\2\2\2\u0800\u0802\7\u0081\2\2\u0801\u07f5\3\2\2\2\u0801"+
		"\u0802\3\2\2\2\u0802\u0123\3\2\2\2\u0803\u0804\5\u016c\u00b7\2\u0804\u0805"+
		"\7\u0084\2\2\u0805\u0807\3\2\2\2\u0806\u0803\3\2\2\2\u0806\u0807\3\2\2"+
		"\2\u0807\u0808\3\2\2\2\u0808\u0809\5\32\16\2\u0809\u0125\3\2\2\2\u080a"+
		"\u080d\5\n\6\2\u080b\u080d\5\22\n\2\u080c\u080a\3\2\2\2\u080c\u080b\3"+
		"\2\2\2\u080d\u0812\3\2\2\2\u080e\u0811\5\u00fe\u0080\2\u080f\u0811\7\u0093"+
		"\2\2\u0810\u080e\3\2\2\2\u0810\u080f\3\2\2\2\u0811\u0814\3\2\2\2\u0812"+
		"\u0810\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0815\3\2\2\2\u0814\u0812\3\2"+
		"\2\2\u0815\u0816\7\u0088\2\2\u0816\u081a\3\2\2\2\u0817\u0818\7l\2\2\u0818"+
		"\u081a\7\u0088\2\2\u0819\u080c\3\2\2\2\u0819\u0817\3\2\2\2\u081a\u0127"+
		"\3\2\2\2\u081b\u0820\5\u012a\u0096\2\u081c\u081d\7\u0083\2\2\u081d\u081f"+
		"\5\u012a\u0096\2\u081e\u081c\3\2\2\2\u081f\u0822\3\2\2\2\u0820\u081e\3"+
		"\2\2\2\u0820\u0821\3\2\2\2\u0821\u0129\3\2\2\2\u0822\u0820\3\2\2\2\u0823"+
		"\u0824\5\u016c\u00b7\2\u0824\u0825\7\u0090\2\2\u0825\u0826\5\u012c\u0097"+
		"\2\u0826\u012b\3\2\2\2\u0827\u0829\7\u008b\2\2\u0828\u0827\3\2\2\2\u0828"+
		"\u0829\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u082d\5\32\16\2\u082b\u082d\5"+
		"\u0130\u0099\2\u082c\u0828\3\2\2\2\u082c\u082b\3\2\2\2\u082d\u012d\3\2"+
		"\2\2\u082e\u082f\5\u016c\u00b7\2\u082f\u0830\7~\2\2\u0830\u0831\5\32\16"+
		"\2\u0831\u0832\7\177\2\2\u0832\u012f\3\2\2\2\u0833\u0834\7Z\2\2\u0834"+
		"\u0835\5\6\4\2\u0835\u0836\7~\2\2\u0836\u0837\5\32\16\2\u0837\u0838\7"+
		"\177\2\2\u0838\u0131\3\2\2\2\u0839\u083a\7\u0090\2\2\u083a\u083b\7\u0092"+
		"\2\2\u083b\u083c\6\u009a\16\3\u083c\u0133\3\2\2\2\u083d\u083e\7\u0092"+
		"\2\2\u083e\u083f\7\u0092\2\2\u083f\u0840\6\u009b\17\3\u0840\u0135\3\2"+
		"\2\2\u0841\u0842\7\u0092\2\2\u0842\u0843\7\u009e\2\2\u0843\u0844\6\u009c"+
		"\20\3\u0844\u0137\3\2\2\2\u0845\u084d\5\u013a\u009e\2\u0846\u084d\5\u013c"+
		"\u009f\2\u0847\u084d\7t\2\2\u0848\u084d\7u\2\2\u0849\u084d\7v\2\2\u084a"+
		"\u084d\7w\2\2\u084b\u084d\7D\2\2\u084c\u0845\3\2\2\2\u084c\u0846\3\2\2"+
		"\2\u084c\u0847\3\2\2\2\u084c\u0848\3\2\2\2\u084c\u0849\3\2\2\2\u084c\u084a"+
		"\3\2\2\2\u084c\u084b\3\2\2\2\u084d\u0139\3\2\2\2\u084e\u084f\t\21\2\2"+
		"\u084f\u013b\3\2\2\2\u0850\u0855\5\u013e\u00a0\2\u0851\u0855\5\u0140\u00a1"+
		"\2\u0852\u0855\7x\2\2\u0853\u0855\7y\2\2\u0854\u0850\3\2\2\2\u0854\u0851"+
		"\3\2\2\2\u0854\u0852\3\2\2\2\u0854\u0853\3\2\2\2\u0855\u013d\3\2\2\2\u0856"+
		"\u085a\7z\2\2\u0857\u0859\5\u0142\u00a2\2\u0858\u0857\3\2\2\2\u0859\u085c"+
		"\3\2\2\2\u085a\u0858\3\2\2\2\u085a\u085b\3\2\2\2\u085b\u085d\3\2\2\2\u085c"+
		"\u085a\3\2\2\2\u085d\u085e\7\u00ad\2\2\u085e\u013f\3\2\2\2\u085f\u0863"+
		"\7{\2\2\u0860\u0862\5\u0144\u00a3\2\u0861\u0860\3\2\2\2\u0862\u0865\3"+
		"\2\2\2\u0863\u0861\3\2\2\2\u0863\u0864\3\2\2\2\u0864\u0866\3\2\2\2\u0865"+
		"\u0863\3\2\2\2\u0866\u0867\7\u00ad\2\2\u0867\u0141\3\2\2\2\u0868\u086d"+
		"\5\u0146\u00a4\2\u0869\u086d\7\u00a9\2\2\u086a\u086d\7\u00ab\2\2\u086b"+
		"\u086d\7\u00ae\2\2\u086c\u0868\3\2\2\2\u086c\u0869\3\2\2\2\u086c\u086a"+
		"\3\2\2\2\u086c\u086b\3\2\2\2\u086d\u0143\3\2\2\2\u086e\u0873\5\u0146\u00a4"+
		"\2\u086f\u0873\7\u00a9\2\2\u0870\u0873\7\u00ac\2\2\u0871\u0873\7\u00af"+
		"\2\2\u0872\u086e\3\2\2\2\u0872\u086f\3\2\2\2\u0872\u0870\3\2\2\2\u0872"+
		"\u0871\3\2\2\2\u0873\u0145\3\2\2\2\u0874\u0879\5\32\16\2\u0875\u0876\7"+
		"\u0083\2\2\u0876\u0878\5\32\16\2\u0877\u0875\3\2\2\2\u0878\u087b\3\2\2"+
		"\2\u0879\u0877\3\2\2\2\u0879\u087a\3\2\2\2\u087a\u0882\3\2\2\2\u087b\u0879"+
		"\3\2\2\2\u087c\u087e\7\u0084\2\2\u087d\u087f\7\u00b1\2\2\u087e\u087d\3"+
		"\2\2\2\u087f\u0880\3\2\2\2\u0880\u087e\3\2\2\2\u0880\u0881\3\2\2\2\u0881"+
		"\u0883\3\2\2\2\u0882\u087c\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u0147\3\2"+
		"\2\2\u0884\u0885\t\22\2\2\u0885\u0149\3\2\2\2\u0886\u0887\7\33\2\2\u0887"+
		"\u0889\5\u016c\u00b7\2\u0888\u088a\5\u00a4S\2\u0889\u0888\3\2\2\2\u0889"+
		"\u088a\3\2\2\2\u088a\u088c\3\2\2\2\u088b\u088d\5\u00a8U\2\u088c\u088b"+
		"\3\2\2\2\u088c\u088d\3\2\2\2\u088d\u088f\3\2\2\2\u088e\u0890\5\u00acW"+
		"\2\u088f\u088e\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u0891\3\2\2\2\u0891\u0893"+
		"\5\u00b8]\2\u0892\u0894\7\u0085\2\2\u0893\u0892\3\2\2\2\u0893\u0894\3"+
		"\2\2\2\u0894\u014b\3\2\2\2\u0895\u0896\7]\2\2\u0896\u0898\5\u016c\u00b7"+
		"\2\u0897\u0899\5\u00a4S\2\u0898\u0897\3\2\2\2\u0898\u0899\3\2\2\2\u0899"+
		"\u089b\3\2\2\2\u089a\u089c\5\u00f6|\2\u089b\u089a\3\2\2\2\u089b\u089c"+
		"\3\2\2\2\u089c\u089e\3\2\2\2\u089d\u089f\5\u00acW\2\u089e\u089d\3\2\2"+
		"\2\u089e\u089f\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0\u08a2\5\u00f8}\2\u08a1"+
		"\u08a3\7\u0085\2\2\u08a2\u08a1\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3\u014d"+
		"\3\2\2\2\u08a4\u08a5\79\2\2\u08a5\u08a7\5\u016c\u00b7\2\u08a6\u08a8\5"+
		"\u0102\u0082\2\u08a7\u08a6\3\2\2\2\u08a7\u08a8\3\2\2\2\u08a8\u08aa\3\2"+
		"\2\2\u08a9\u08ab\5\u0108\u0085\2\u08aa\u08a9\3\2\2\2\u08aa\u08ab\3\2\2"+
		"\2\u08ab\u08ad\3\2\2\2\u08ac\u08ae\5\u00acW\2\u08ad\u08ac\3\2\2\2\u08ad"+
		"\u08ae\3\2\2\2\u08ae\u08af\3\2\2\2\u08af\u08b1\5\u010a\u0086\2\u08b0\u08b2"+
		"\7\u0085\2\2\u08b1\u08b0\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u014f\3\2\2"+
		"\2\u08b3\u08b4\7&\2\2\u08b4\u08b6\5\u016c\u00b7\2\u08b5\u08b7\5\u0110"+
		"\u0089\2\u08b6\u08b5\3\2\2\2\u08b6\u08b7\3\2\2\2\u08b7\u08b8\3\2\2\2\u08b8"+
		"\u08ba\5\u0112\u008a\2\u08b9\u08bb\7\u0085\2\2\u08ba\u08b9\3\2\2\2\u08ba"+
		"\u08bb\3\2\2\2\u08bb\u0151\3\2\2\2\u08bc\u08bd\7 \2\2\u08bd\u08be\5\u00ce"+
		"h\2\u08be\u08c0\5\u016c\u00b7\2\u08bf\u08c1\5\u0102\u0082\2\u08c0\u08bf"+
		"\3\2\2\2\u08c0\u08c1\3\2\2\2\u08c1\u08c2\3\2\2\2\u08c2\u08c4\7\u0080\2"+
		"\2\u08c3\u08c5\5\u00d4k\2\u08c4\u08c3\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5"+
		"\u08c6\3\2\2\2\u08c6\u08c8\7\u0081\2\2\u08c7\u08c9\5\u00acW\2\u08c8\u08c7"+
		"\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u08cb\7\u0085\2"+
		"\2\u08cb\u0153\3\2\2\2\u08cc\u08cd\7(\2\2\u08cd\u08d6\5\6\4\2\u08ce\u08cf"+
		"\5\u00c8e\2\u08cf\u08d0\7\u0085\2\2\u08d0\u08d7\3\2\2\2\u08d1\u08d2\5"+
		"\u00d0i\2\u08d2\u08d3\7|\2\2\u08d3\u08d4\5\u00e8u\2\u08d4\u08d5\7}\2\2"+
		"\u08d5\u08d7\3\2\2\2\u08d6\u08ce\3\2\2\2\u08d6\u08d1\3\2\2\2\u08d7\u0155"+
		"\3\2\2\2\u08d8\u08d9\5\u00c8e\2\u08d9\u08da\7\u0085\2\2\u08da\u0157\3"+
		"\2\2\2\u08db\u08e9\5\u00d0i\2\u08dc\u08dd\7|\2\2\u08dd\u08de\5\u00dep"+
		"\2\u08de\u08e3\7}\2\2\u08df\u08e0\7\u0090\2\2\u08e0\u08e1\5\u00ccg\2\u08e1"+
		"\u08e2\7\u0085\2\2\u08e2\u08e4\3\2\2\2\u08e3\u08df\3\2\2\2\u08e3\u08e4"+
		"\3\2\2\2\u08e4\u08ea\3\2\2\2\u08e5\u08e6\5\u0132\u009a\2\u08e6\u08e7\5"+
		"\32\16\2\u08e7\u08e8\7\u0085\2\2\u08e8\u08ea\3\2\2\2\u08e9\u08dc\3\2\2"+
		"\2\u08e9\u08e5\3\2\2\2\u08ea\u0159\3\2\2\2\u08eb\u08ec\7\34\2\2\u08ec"+
		"\u08ed\5\6\4\2\u08ed\u08ee\5\u00c4c\2\u08ee\u08ef\7\u0085\2\2\u08ef\u015b"+
		"\3\2\2\2\u08f0\u08f1\7_\2\2\u08f1\u08f2\7~\2\2\u08f2\u08f3\5\u00d4k\2"+
		"\u08f3\u08fc\7\177\2\2\u08f4\u08f5\7|\2\2\u08f5\u08f6\5\u00dep\2\u08f6"+
		"\u08f7\7}\2\2\u08f7\u08fd\3\2\2\2\u08f8\u08f9\5\u0132\u009a\2\u08f9\u08fa"+
		"\5\32\16\2\u08fa\u08fb\7\u0085\2\2\u08fb\u08fd\3\2\2\2\u08fc\u08f4\3\2"+
		"\2\2\u08fc\u08f8\3\2\2\2\u08fd\u015d\3\2\2\2\u08fe\u08ff\7\u008f\2\2\u08ff"+
		"\u0900\5\u016c\u00b7\2\u0900\u0901\7\u0080\2\2\u0901\u0902\7\u0081\2\2"+
		"\u0902\u0903\5\u00f4{\2\u0903\u015f\3\2\2\2\u0904\u0905\5\u016c\u00b7"+
		"\2\u0905\u0907\7\u0080\2\2\u0906\u0908\5\u00d4k\2\u0907\u0906\3\2\2\2"+
		"\u0907\u0908\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u090b\7\u0081\2\2\u090a"+
		"\u090c\5\u00f2z\2\u090b\u090a\3\2\2\2\u090b\u090c\3\2\2\2\u090c\u090d"+
		"\3\2\2\2\u090d\u090e\5\u00f4{\2\u090e\u0161\3\2\2\2\u090f\u0915\5\u016c"+
		"\u00b7\2\u0910\u0911\5\u016c\u00b7\2\u0911\u0912\7\u0094\2\2\u0912\u0913"+
		"\5\u016c\u00b7\2\u0913\u0915\3\2\2\2\u0914\u090f\3\2\2\2\u0914\u0910\3"+
		"\2\2\2\u0915\u091d\3\2\2\2\u0916\u0918\5\24\13\2\u0917\u0916\3\2\2\2\u0917"+
		"\u0918\3\2\2\2\u0918\u0919\3\2\2\2\u0919\u091a\7\u0082\2\2\u091a\u091c"+
		"\5\u016c\u00b7\2\u091b\u0917\3\2\2\2\u091c\u091f\3\2\2\2\u091d\u091b\3"+
		"\2\2\2\u091d\u091e\3\2\2\2\u091e\u0163\3\2\2\2\u091f\u091d\3\2\2\2\u0920"+
		"\u0921\7G\2\2\u0921\u0922\5\u00eex\2\u0922\u0923\7\u0080\2\2\u0923\u0926"+
		"\5\u0166\u00b4\2\u0924\u0925\7\u0083\2\2\u0925\u0927\5\u0166\u00b4\2\u0926"+
		"\u0924\3\2\2\2\u0926\u0927\3\2\2\2\u0927\u0928\3\2\2\2\u0928\u092e\7\u0081"+
		"\2\2\u0929\u092f\5\u00f4{\2\u092a\u092b\5\u0132\u009a\2\u092b\u092c\5"+
		"\32\16\2\u092c\u092d\7\u0085\2\2\u092d\u092f\3\2\2\2\u092e\u0929\3\2\2"+
		"\2\u092e\u092a\3\2\2\2\u092f\u0165\3\2\2\2\u0930\u0931\5\6\4\2\u0931\u0934"+
		"\5\u016c\u00b7\2\u0932\u0933\7\u0090\2\2\u0933\u0935\5\32\16\2\u0934\u0932"+
		"\3\2\2\2\u0934\u0935\3\2\2\2\u0935\u0167\3\2\2\2\u0936\u0938\7\u0080\2"+
		"\2\u0937\u0939\5\26\f\2\u0938\u0937\3\2\2\2\u0938\u0939\3\2\2\2\u0939"+
		"\u093a\3\2\2\2\u093a\u093b\7\u0081\2\2\u093b\u0169\3\2\2\2\u093c\u093e"+
		"\7\u0080\2\2\u093d\u093f\5\26\f\2\u093e\u093d\3\2\2\2\u093e\u093f\3\2"+
		"\2\2\u093f\u0940\3\2\2\2\u0940\u0942\7\u0081\2\2\u0941\u0943\5*\26\2\u0942"+
		"\u0941\3\2\2\2\u0942\u0943\3\2\2\2\u0943\u016b\3\2\2\2\u0944\u0945\t\23"+
		"\2\2\u0945\u016d\3\2\2\2\u0131\u016f\u0172\u0175\u017a\u017e\u0184\u0187"+
		"\u018c\u0190\u0197\u0199\u01a0\u01a4\u01a9\u01b3\u01bb\u01c5\u01cb\u01ce"+
		"\u01d2\u01d8\u01e6\u01f1\u0216\u0218\u021a\u0228\u022c\u0234\u023b\u0244"+
		"\u0247\u024f\u0256\u025b\u0275\u027a\u0288\u028e\u029a\u029e\u02a3\u02a7"+
		"\u02ad\u02b4\u02c7\u02cc\u02cf\u02de\u02e4\u02e7\u02ec\u02f1\u02fc\u0301"+
		"\u0306\u0308\u0311\u0319\u0320\u0328\u032c\u0331\u0340\u0346\u034b\u034d"+
		"\u0356\u035b\u0363\u036a\u0373\u0376\u037e\u0385\u038a\u0391\u0395\u039a"+
		"\u039c\u03a1\u03a5\u03ac\u03b4\u03b6\u03ba\u03c7\u03ce\u03d2\u03dc\u03e1"+
		"\u03e5\u03ee\u03f3\u03fa\u0406\u0411\u0419\u041e\u0427\u0430\u0435\u043d"+
		"\u044a\u0454\u046a\u046e\u0472\u0488\u048d\u0492\u0499\u049c\u04b2\u04be"+
		"\u04c2\u04cc\u04d1\u04d6\u04db\u04e3\u04e8\u04f2\u04f7\u04ff\u0502\u0509"+
		"\u0510\u0514\u0517\u051d\u0521\u0527\u0535\u053b\u0542\u0547\u054a\u054d"+
		"\u0554\u055e\u056f\u0574\u0578\u057b\u057e\u0585\u058b\u0593\u0599\u05a3"+
		"\u05ab\u05b1\u05bc\u05c0\u05c2\u05c7\u05ce\u05d7\u05de\u05e1\u05e4\u05e8"+
		"\u05ed\u05f9\u05fd\u0601\u0608\u060e\u0617\u061d\u0621\u0625\u062c\u0633"+
		"\u063a\u0646\u064c\u0650\u0654\u065a\u0660\u0662\u0669\u066d\u0670\u0674"+
		"\u0679\u0680\u0683\u0688\u068d\u068f\u0692\u0695\u069b\u069e\u06aa\u06ae"+
		"\u06b1\u06bb\u06be\u06c4\u06df\u06ec\u06f2\u06fb\u0701\u0704\u070c\u0710"+
		"\u0716\u071c\u0722\u072d\u0731\u0733\u073d\u0743\u0746\u0753\u0759\u075c"+
		"\u075f\u0764\u0768\u076c\u077d\u0780\u0785\u0789\u078d\u0796\u0799\u079e"+
		"\u07a2\u07a7\u07ab\u07ad\u07b8\u07bc\u07be\u07c3\u07c8\u07cf\u07d5\u07da"+
		"\u07e0\u07e4\u07ea\u07f1\u07fb\u07fe\u0801\u0806\u080c\u0810\u0812\u0819"+
		"\u0820\u0828\u082c\u084c\u0854\u085a\u0863\u086c\u0872\u0879\u0880\u0882"+
		"\u0889\u088c\u088f\u0893\u0898\u089b\u089e\u08a2\u08a7\u08aa\u08ad\u08b1"+
		"\u08b6\u08ba\u08c0\u08c4\u08c8\u08d6\u08e3\u08e9\u08fc\u0907\u090b\u0914"+
		"\u0917\u091d\u0926\u092e\u0934\u0938\u093e\u0942";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}