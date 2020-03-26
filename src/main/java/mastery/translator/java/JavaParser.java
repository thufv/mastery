package mastery.translator.java;

// Generated from JavaParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, DECIMAL_LITERAL=51, HEX_LITERAL=52, OCT_LITERAL=53, BINARY_LITERAL=54, 
		FLOAT_LITERAL=55, HEX_FLOAT_LITERAL=56, BOOL_LITERAL=57, CHAR_LITERAL=58, 
		STRING_LITERAL=59, NULL_LITERAL=60, LPAREN=61, RPAREN=62, LBRACE=63, RBRACE=64, 
		LBRACK=65, RBRACK=66, SEMI=67, COMMA=68, DOT=69, ASSIGN=70, GT=71, LT=72, 
		BANG=73, TILDE=74, QUESTION=75, COLON=76, EQUAL=77, LE=78, GE=79, NOTEQUAL=80, 
		AND=81, OR=82, INC=83, DEC=84, ADD=85, SUB=86, MUL=87, DIV=88, BITAND=89, 
		BITOR=90, CARET=91, MOD=92, ADD_ASSIGN=93, SUB_ASSIGN=94, MUL_ASSIGN=95, 
		DIV_ASSIGN=96, AND_ASSIGN=97, OR_ASSIGN=98, XOR_ASSIGN=99, MOD_ASSIGN=100, 
		LSHIFT_ASSIGN=101, RSHIFT_ASSIGN=102, URSHIFT_ASSIGN=103, ARROW=104, COLONCOLON=105, 
		AT=106, ELLIPSIS=107, WS=108, COMMENT=109, LINE_COMMENT=110, IDENTIFIER=111;
	public static final int
		RULE_compilationUnit = 0, RULE_optionPackageDeclaration = 1, RULE_importDeclarations = 2, 
		RULE_typeDeclarations = 3, RULE_packageDeclaration = 4, RULE_annotations = 5, 
		RULE_importDeclaration = 6, RULE_typeDeclaration = 7, RULE_classOrInterfaceModifiers = 8, 
		RULE_modifiers = 9, RULE_modifier = 10, RULE_classOrInterfaceModifier = 11, 
		RULE_variableModifier = 12, RULE_variableModifiers = 13, RULE_classDeclaration = 14, 
		RULE_optionTypeParameters = 15, RULE_optionExtendsTypeType = 16, RULE_extendsTypeType = 17, 
		RULE_optionImplementsTypeList = 18, RULE_implementsTypeList = 19, RULE_typeParameters = 20, 
		RULE_otherTypeParameters = 21, RULE_anotherTypeParameter = 22, RULE_typeParameter = 23, 
		RULE_optionExtendsTypeBound = 24, RULE_extendsTypeBound = 25, RULE_typeBound = 26, 
		RULE_otherTypeTypes = 27, RULE_anotherTypeType = 28, RULE_enumDeclaration = 29, 
		RULE_optionEnumConstants = 30, RULE_optionEnumBodyDeclarations = 31, RULE_enumConstants = 32, 
		RULE_otherEnumConstants = 33, RULE_anotherEnumConstant = 34, RULE_enumConstant = 35, 
		RULE_optionArguments = 36, RULE_optionClassBody = 37, RULE_classBodyDeclarations = 38, 
		RULE_enumBodyDeclarations = 39, RULE_interfaceDeclaration = 40, RULE_optionExtendsTypeList = 41, 
		RULE_extendsTypeList = 42, RULE_classBody = 43, RULE_interfaceBody = 44, 
		RULE_interfaceBodyDeclarations = 45, RULE_classBodyDeclaration = 46, RULE_memberDeclaration = 47, 
		RULE_methodDeclaration = 48, RULE_optionThrowsQualifiedNameList = 49, 
		RULE_throwsQualifiedNameList = 50, RULE_methodBody = 51, RULE_typeTypeOrVoid = 52, 
		RULE_genericMethodDeclaration = 53, RULE_genericConstructorDeclaration = 54, 
		RULE_constructorDeclaration = 55, RULE_fieldDeclaration = 56, RULE_interfaceBodyDeclaration = 57, 
		RULE_interfaceMemberDeclaration = 58, RULE_constDeclaration = 59, RULE_otherConstantDeclarators = 60, 
		RULE_anotherConstantDeclarators = 61, RULE_constantDeclarator = 62, RULE_interfaceMethodDeclaration = 63, 
		RULE_optionTypeParametersAnnotations = 64, RULE_typeParametersAnnotations = 65, 
		RULE_interfaceMethodModifiers = 66, RULE_interfaceMethodModifier = 67, 
		RULE_genericInterfaceMethodDeclaration = 68, RULE_variableDeclarators = 69, 
		RULE_otherVariableDeclarators = 70, RULE_anotherVariableDeclarator = 71, 
		RULE_variableDeclarator = 72, RULE_optionEqualsVariableInitializer = 73, 
		RULE_equalsVariableInitializer = 74, RULE_variableDeclaratorId = 75, RULE_variableInitializer = 76, 
		RULE_arrayInitializer = 77, RULE_optionVariablesInitializer = 78, RULE_variablesInitializer = 79, 
		RULE_otherVariableInitializers = 80, RULE_anotherVariableInitializer = 81, 
		RULE_classOrInterfaceType = 82, RULE_optionTypeArguments = 83, RULE_memberSelections = 84, 
		RULE_memberSelection = 85, RULE_typeArgument = 86, RULE_optionExtendsOrSuperTypeType = 87, 
		RULE_qualifiedNameList = 88, RULE_otherQualifiedNames = 89, RULE_anotherQualifiedName = 90, 
		RULE_formalParameters = 91, RULE_optionFormalParameterList = 92, RULE_formalParameterList = 93, 
		RULE_moreThanOneNonArrayFormalParameters = 94, RULE_otherFormalParameters = 95, 
		RULE_anotherFormalParameter = 96, RULE_optionCommaArrayFormalParameter = 97, 
		RULE_commaArrayFormalParameter = 98, RULE_formalParameter = 99, RULE_arrayFormalParameter = 100, 
		RULE_qualifiedName = 101, RULE_otherDotIdentifiers = 102, RULE_anotherDotIdentifier = 103, 
		RULE_literal = 104, RULE_integerLiteral = 105, RULE_floatLiteral = 106, 
		RULE_annotation = 107, RULE_optionAnnotationRest = 108, RULE_annotationRest = 109, 
		RULE_optionElementValuePairsOrElementValue = 110, RULE_elementValuePairsOrElementValue = 111, 
		RULE_elementValuePairs = 112, RULE_otherElementValuePairs = 113, RULE_anotherElementValuePair = 114, 
		RULE_elementValuePair = 115, RULE_elementValue = 116, RULE_elementValueArrayInitializer = 117, 
		RULE_otherElementValues = 118, RULE_anotherElementValue = 119, RULE_optionElementValues = 120, 
		RULE_elementValues = 121, RULE_annotationTypeDeclaration = 122, RULE_annotationTypeBody = 123, 
		RULE_annotationTypeElementDeclarations = 124, RULE_annotationTypeElementDeclaration = 125, 
		RULE_annotationTypeElementRest = 126, RULE_annotationMethodOrConstantRest = 127, 
		RULE_annotationMethodRest = 128, RULE_annotationConstantRest = 129, RULE_optionDefaultValue = 130, 
		RULE_defaultValue = 131, RULE_block = 132, RULE_blockStatements = 133, 
		RULE_blockStatement = 134, RULE_localVariableDeclarationStatement = 135, 
		RULE_localVariableDeclaration = 136, RULE_localTypeDeclaration = 137, 
		RULE_statement = 138, RULE_blockStmt = 139, RULE_assertStmt = 140, RULE_ifStmt = 141, 
		RULE_forStmt = 142, RULE_whileStmt = 143, RULE_doWhileStmt = 144, RULE_tryStmt = 145, 
		RULE_tryRscSpecStmt = 146, RULE_switchStmt = 147, RULE_synchronizedStmt = 148, 
		RULE_returnStmt = 149, RULE_throwStmt = 150, RULE_breakStmt = 151, RULE_continueStmt = 152, 
		RULE_semiStmt = 153, RULE_exprStmt = 154, RULE_identifierStmt = 155, RULE_optionColonExpression = 156, 
		RULE_colonExpression = 157, RULE_optionElseStatement = 158, RULE_elseStatement = 159, 
		RULE_optionFinallyBlock = 160, RULE_switchBlockStatementGroups = 161, 
		RULE_switchLabels = 162, RULE_catchClauses = 163, RULE_optionExpression = 164, 
		RULE_catchClausesOrOptionFinallyBlock = 165, RULE_catchClause = 166, RULE_catchType = 167, 
		RULE_orQualifiedNames = 168, RULE_orQualifiedName = 169, RULE_finallyBlock = 170, 
		RULE_resourceSpecification = 171, RULE_resources = 172, RULE_semicolonResources = 173, 
		RULE_semicolonResource = 174, RULE_resource = 175, RULE_switchBlockStatementGroup = 176, 
		RULE_switchLabel = 177, RULE_forControl = 178, RULE_optionforInit = 179, 
		RULE_optionExpressionList = 180, RULE_forInit = 181, RULE_enhancedForControl = 182, 
		RULE_parExpression = 183, RULE_expressionList = 184, RULE_otherExpressions = 185, 
		RULE_anotherExpression = 186, RULE_methodCall = 187, RULE_expression = 188, 
		RULE_thisArguments = 189, RULE_newOptionNonWildcardTypeArgumentsInnerCreator = 190, 
		RULE_superSuperSuffix = 191, RULE_optionTypeArgumentsIdentifier = 192, 
		RULE_leftShift = 193, RULE_signedRightShift = 194, RULE_unsignedRightShift = 195, 
		RULE_optionNonWildcardTypeArguments = 196, RULE_squaredExpression = 197, 
		RULE_lambdaExpression = 198, RULE_lambdaParameters = 199, RULE_identifiers = 200, 
		RULE_otherIdentifiers = 201, RULE_anotherIdentifier = 202, RULE_parenthesizedOptionFormalParameterList = 203, 
		RULE_parenthesizedIdentifiers = 204, RULE_lambdaBody = 205, RULE_classType = 206, 
		RULE_optionClassOrInterfaceTypeDot = 207, RULE_classOrInterfaceTypeDot = 208, 
		RULE_creator = 209, RULE_classOrInterfaceOrPrimitiveType = 210, RULE_innerCreator = 211, 
		RULE_optionNonWildcardTypeArgumentsOrDiamond = 212, RULE_arrayCreatorRest = 213, 
		RULE_rightSquaredExpression = 214, RULE_squaredExpressions = 215, RULE_rightAssocBinaryOperatorAndExpression = 216, 
		RULE_classCreatorRest = 217, RULE_explicitGenericInvocation = 218, RULE_nonWildcardTypeArgumentsOrDiamond = 219, 
		RULE_nonWildcardTypeArguments = 220, RULE_typeList = 221, RULE_commaTypeTypes = 222, 
		RULE_commaTypeType = 223, RULE_typeType = 224, RULE_optionAnnotation = 225, 
		RULE_primitiveType = 226, RULE_typeArguments = 227, RULE_optionNonEmptyTypeArguments = 228, 
		RULE_nonEmptyTypeArguments = 229, RULE_otherTypeArguments = 230, RULE_anotherTypeArgument = 231, 
		RULE_superSuffix = 232, RULE_commaIdentifierOptionArguments = 233, RULE_explicitGenericInvocationSuffix = 234, 
		RULE_arguments = 235, RULE_optionStatic = 236, RULE_optionDotStar = 237, 
		RULE_dotStar = 238, RULE_optionComma = 239, RULE_squares = 240, RULE_square = 241, 
		RULE_optionSemicolon = 242, RULE_optionIdentifier = 243, RULE_angle = 244;
	public static final String[] ruleNames = {
		"compilationUnit", "optionPackageDeclaration", "importDeclarations", "typeDeclarations", 
		"packageDeclaration", "annotations", "importDeclaration", "typeDeclaration", 
		"classOrInterfaceModifiers", "modifiers", "modifier", "classOrInterfaceModifier", 
		"variableModifier", "variableModifiers", "classDeclaration", "optionTypeParameters", 
		"optionExtendsTypeType", "extendsTypeType", "optionImplementsTypeList", 
		"implementsTypeList", "typeParameters", "otherTypeParameters", "anotherTypeParameter", 
		"typeParameter", "optionExtendsTypeBound", "extendsTypeBound", "typeBound", 
		"otherTypeTypes", "anotherTypeType", "enumDeclaration", "optionEnumConstants", 
		"optionEnumBodyDeclarations", "enumConstants", "otherEnumConstants", "anotherEnumConstant", 
		"enumConstant", "optionArguments", "optionClassBody", "classBodyDeclarations", 
		"enumBodyDeclarations", "interfaceDeclaration", "optionExtendsTypeList", 
		"extendsTypeList", "classBody", "interfaceBody", "interfaceBodyDeclarations", 
		"classBodyDeclaration", "memberDeclaration", "methodDeclaration", "optionThrowsQualifiedNameList", 
		"throwsQualifiedNameList", "methodBody", "typeTypeOrVoid", "genericMethodDeclaration", 
		"genericConstructorDeclaration", "constructorDeclaration", "fieldDeclaration", 
		"interfaceBodyDeclaration", "interfaceMemberDeclaration", "constDeclaration", 
		"otherConstantDeclarators", "anotherConstantDeclarators", "constantDeclarator", 
		"interfaceMethodDeclaration", "optionTypeParametersAnnotations", "typeParametersAnnotations", 
		"interfaceMethodModifiers", "interfaceMethodModifier", "genericInterfaceMethodDeclaration", 
		"variableDeclarators", "otherVariableDeclarators", "anotherVariableDeclarator", 
		"variableDeclarator", "optionEqualsVariableInitializer", "equalsVariableInitializer", 
		"variableDeclaratorId", "variableInitializer", "arrayInitializer", "optionVariablesInitializer", 
		"variablesInitializer", "otherVariableInitializers", "anotherVariableInitializer", 
		"classOrInterfaceType", "optionTypeArguments", "memberSelections", "memberSelection", 
		"typeArgument", "optionExtendsOrSuperTypeType", "qualifiedNameList", "otherQualifiedNames", 
		"anotherQualifiedName", "formalParameters", "optionFormalParameterList", 
		"formalParameterList", "moreThanOneNonArrayFormalParameters", "otherFormalParameters", 
		"anotherFormalParameter", "optionCommaArrayFormalParameter", "commaArrayFormalParameter", 
		"formalParameter", "arrayFormalParameter", "qualifiedName", "otherDotIdentifiers", 
		"anotherDotIdentifier", "literal", "integerLiteral", "floatLiteral", "annotation", 
		"optionAnnotationRest", "annotationRest", "optionElementValuePairsOrElementValue", 
		"elementValuePairsOrElementValue", "elementValuePairs", "otherElementValuePairs", 
		"anotherElementValuePair", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"otherElementValues", "anotherElementValue", "optionElementValues", "elementValues", 
		"annotationTypeDeclaration", "annotationTypeBody", "annotationTypeElementDeclarations", 
		"annotationTypeElementDeclaration", "annotationTypeElementRest", "annotationMethodOrConstantRest", 
		"annotationMethodRest", "annotationConstantRest", "optionDefaultValue", 
		"defaultValue", "block", "blockStatements", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "localTypeDeclaration", "statement", "blockStmt", 
		"assertStmt", "ifStmt", "forStmt", "whileStmt", "doWhileStmt", "tryStmt", 
		"tryRscSpecStmt", "switchStmt", "synchronizedStmt", "returnStmt", "throwStmt", 
		"breakStmt", "continueStmt", "semiStmt", "exprStmt", "identifierStmt", 
		"optionColonExpression", "colonExpression", "optionElseStatement", "elseStatement", 
		"optionFinallyBlock", "switchBlockStatementGroups", "switchLabels", "catchClauses", 
		"optionExpression", "catchClausesOrOptionFinallyBlock", "catchClause", 
		"catchType", "orQualifiedNames", "orQualifiedName", "finallyBlock", "resourceSpecification", 
		"resources", "semicolonResources", "semicolonResource", "resource", "switchBlockStatementGroup", 
		"switchLabel", "forControl", "optionforInit", "optionExpressionList", 
		"forInit", "enhancedForControl", "parExpression", "expressionList", "otherExpressions", 
		"anotherExpression", "methodCall", "expression", "thisArguments", "newOptionNonWildcardTypeArgumentsInnerCreator", 
		"superSuperSuffix", "optionTypeArgumentsIdentifier", "leftShift", "signedRightShift", 
		"unsignedRightShift", "optionNonWildcardTypeArguments", "squaredExpression", 
		"lambdaExpression", "lambdaParameters", "identifiers", "otherIdentifiers", 
		"anotherIdentifier", "parenthesizedOptionFormalParameterList", "parenthesizedIdentifiers", 
		"lambdaBody", "classType", "optionClassOrInterfaceTypeDot", "classOrInterfaceTypeDot", 
		"creator", "classOrInterfaceOrPrimitiveType", "innerCreator", "optionNonWildcardTypeArgumentsOrDiamond", 
		"arrayCreatorRest", "rightSquaredExpression", "squaredExpressions", "rightAssocBinaryOperatorAndExpression", 
		"classCreatorRest", "explicitGenericInvocation", "nonWildcardTypeArgumentsOrDiamond", 
		"nonWildcardTypeArguments", "typeList", "commaTypeTypes", "commaTypeType", 
		"typeType", "optionAnnotation", "primitiveType", "typeArguments", "optionNonEmptyTypeArguments", 
		"nonEmptyTypeArguments", "otherTypeArguments", "anotherTypeArgument", 
		"superSuffix", "commaIdentifierOptionArguments", "explicitGenericInvocationSuffix", 
		"arguments", "optionStatic", "optionDotStar", "dotStar", "optionComma", 
		"squares", "square", "optionSemicolon", "optionIdentifier", "angle"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
		"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null, 
		null, null, null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", 
		"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
		"'>>>='", "'->'", "'::'", "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
		"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
		"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "DECIMAL_LITERAL", "HEX_LITERAL", 
		"OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
		"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
		"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", 
		"GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
		"BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS", 
		"WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER"
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
	public String getGrammarFileName() { return "JavaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public OptionPackageDeclarationContext optionPackageDeclaration() {
			return getRuleContext(OptionPackageDeclarationContext.class,0);
		}
		public ImportDeclarationsContext importDeclarations() {
			return getRuleContext(ImportDeclarationsContext.class,0);
		}
		public TypeDeclarationsContext typeDeclarations() {
			return getRuleContext(TypeDeclarationsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			optionPackageDeclaration();
			setState(491);
			importDeclarations();
			setState(492);
			typeDeclarations();
			setState(493);
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

	public static class OptionPackageDeclarationContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public OptionPackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionPackageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionPackageDeclaration(this);
		}
	}

	public final OptionPackageDeclarationContext optionPackageDeclaration() throws RecognitionException {
		OptionPackageDeclarationContext _localctx = new OptionPackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_optionPackageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(495);
				packageDeclaration();
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

	public static class ImportDeclarationsContext extends ParserRuleContext {
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ImportDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterImportDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitImportDeclarations(this);
		}
	}

	public final ImportDeclarationsContext importDeclarations() throws RecognitionException {
		ImportDeclarationsContext _localctx = new ImportDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(498);
				importDeclaration();
				}
				}
				setState(503);
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

	public static class TypeDeclarationsContext extends ParserRuleContext {
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public TypeDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeDeclarations(this);
		}
	}

	public final TypeDeclarationsContext typeDeclarations() throws RecognitionException {
		TypeDeclarationsContext _localctx = new TypeDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(504);
				typeDeclaration();
				}
				}
				setState(509);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode PACKAGE() { return getToken(JavaParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			annotations();
			setState(511);
			match(PACKAGE);
			setState(512);
			qualifiedName();
			setState(513);
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

	public static class AnnotationsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotations(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(515);
					annotation();
					}
					} 
				}
				setState(520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JavaParser.IMPORT, 0); }
		public OptionStaticContext optionStatic() {
			return getRuleContext(OptionStaticContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public OptionDotStarContext optionDotStar() {
			return getRuleContext(OptionDotStarContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(IMPORT);
			setState(522);
			optionStatic();
			setState(523);
			qualifiedName();
			setState(524);
			optionDotStar();
			setState(525);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassOrInterfaceModifiersContext classOrInterfaceModifiers() {
			return getRuleContext(ClassOrInterfaceModifiersContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeDeclaration);
		try {
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				classOrInterfaceModifiers();
				setState(532);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(528);
					classDeclaration();
					}
					break;
				case ENUM:
					{
					setState(529);
					enumDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(530);
					interfaceDeclaration();
					}
					break;
				case AT:
					{
					setState(531);
					annotationTypeDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				match(SEMI);
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

	public static class ClassOrInterfaceModifiersContext extends ParserRuleContext {
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public ClassOrInterfaceModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassOrInterfaceModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassOrInterfaceModifiers(this);
		}
	}

	public final ClassOrInterfaceModifiersContext classOrInterfaceModifiers() throws RecognitionException {
		ClassOrInterfaceModifiersContext _localctx = new ClassOrInterfaceModifiersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classOrInterfaceModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(537);
					classOrInterfaceModifier();
					}
					} 
				}
				setState(542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ModifiersContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitModifiers(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(543);
					modifier();
					}
					} 
				}
				setState(548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(JavaParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(JavaParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(JavaParser.VOLATILE, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_modifier);
		try {
			setState(554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 3);
				{
				setState(551);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(552);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(553);
				match(VOLATILE);
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

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classOrInterfaceModifier);
		try {
			setState(564);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(558);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(559);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(560);
				match(STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(561);
				match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(562);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(563);
				match(STRICTFP);
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

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableModifier);
		try {
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				annotation();
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

	public static class VariableModifiersContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public VariableModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableModifiers(this);
		}
	}

	public final VariableModifiersContext variableModifiers() throws RecognitionException {
		VariableModifiersContext _localctx = new VariableModifiersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(570);
					variableModifier();
					}
					} 
				}
				setState(575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public OptionTypeParametersContext optionTypeParameters() {
			return getRuleContext(OptionTypeParametersContext.class,0);
		}
		public OptionExtendsTypeTypeContext optionExtendsTypeType() {
			return getRuleContext(OptionExtendsTypeTypeContext.class,0);
		}
		public OptionImplementsTypeListContext optionImplementsTypeList() {
			return getRuleContext(OptionImplementsTypeListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(CLASS);
			setState(577);
			match(IDENTIFIER);
			setState(578);
			optionTypeParameters();
			setState(579);
			optionExtendsTypeType();
			setState(580);
			optionImplementsTypeList();
			setState(581);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionTypeParametersContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public OptionTypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionTypeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionTypeParameters(this);
		}
	}

	public final OptionTypeParametersContext optionTypeParameters() throws RecognitionException {
		OptionTypeParametersContext _localctx = new OptionTypeParametersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_optionTypeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(583);
				typeParameters();
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

	public static class OptionExtendsTypeTypeContext extends ParserRuleContext {
		public ExtendsTypeTypeContext extendsTypeType() {
			return getRuleContext(ExtendsTypeTypeContext.class,0);
		}
		public OptionExtendsTypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionExtendsTypeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionExtendsTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionExtendsTypeType(this);
		}
	}

	public final OptionExtendsTypeTypeContext optionExtendsTypeType() throws RecognitionException {
		OptionExtendsTypeTypeContext _localctx = new OptionExtendsTypeTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_optionExtendsTypeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(586);
				extendsTypeType();
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

	public static class ExtendsTypeTypeContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ExtendsTypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsTypeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExtendsTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExtendsTypeType(this);
		}
	}

	public final ExtendsTypeTypeContext extendsTypeType() throws RecognitionException {
		ExtendsTypeTypeContext _localctx = new ExtendsTypeTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_extendsTypeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(EXTENDS);
			setState(590);
			typeType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionImplementsTypeListContext extends ParserRuleContext {
		public ImplementsTypeListContext implementsTypeList() {
			return getRuleContext(ImplementsTypeListContext.class,0);
		}
		public OptionImplementsTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionImplementsTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionImplementsTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionImplementsTypeList(this);
		}
	}

	public final OptionImplementsTypeListContext optionImplementsTypeList() throws RecognitionException {
		OptionImplementsTypeListContext _localctx = new OptionImplementsTypeListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_optionImplementsTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(592);
				implementsTypeList();
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

	public static class ImplementsTypeListContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ImplementsTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterImplementsTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitImplementsTypeList(this);
		}
	}

	public final ImplementsTypeListContext implementsTypeList() throws RecognitionException {
		ImplementsTypeListContext _localctx = new ImplementsTypeListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_implementsTypeList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(IMPLEMENTS);
			setState(596);
			typeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParameterContext typeParameter() {
			return getRuleContext(TypeParameterContext.class,0);
		}
		public OtherTypeParametersContext otherTypeParameters() {
			return getRuleContext(OtherTypeParametersContext.class,0);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(LT);
			setState(599);
			typeParameter();
			setState(600);
			otherTypeParameters();
			setState(601);
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

	public static class OtherTypeParametersContext extends ParserRuleContext {
		public List<AnotherTypeParameterContext> anotherTypeParameter() {
			return getRuleContexts(AnotherTypeParameterContext.class);
		}
		public AnotherTypeParameterContext anotherTypeParameter(int i) {
			return getRuleContext(AnotherTypeParameterContext.class,i);
		}
		public OtherTypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherTypeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOtherTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOtherTypeParameters(this);
		}
	}

	public final OtherTypeParametersContext otherTypeParameters() throws RecognitionException {
		OtherTypeParametersContext _localctx = new OtherTypeParametersContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_otherTypeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(603);
				anotherTypeParameter();
				}
				}
				setState(608);
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

	public static class AnotherTypeParameterContext extends ParserRuleContext {
		public TypeParameterContext typeParameter() {
			return getRuleContext(TypeParameterContext.class,0);
		}
		public AnotherTypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anotherTypeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnotherTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnotherTypeParameter(this);
		}
	}

	public final AnotherTypeParameterContext anotherTypeParameter() throws RecognitionException {
		AnotherTypeParameterContext _localctx = new AnotherTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_anotherTypeParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(COMMA);
			setState(610);
			typeParameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public OptionExtendsTypeTypeContext optionExtendsTypeType() {
			return getRuleContext(OptionExtendsTypeTypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			annotations();
			setState(613);
			match(IDENTIFIER);
			setState(614);
			optionExtendsTypeType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionExtendsTypeBoundContext extends ParserRuleContext {
		public ExtendsTypeBoundContext extendsTypeBound() {
			return getRuleContext(ExtendsTypeBoundContext.class,0);
		}
		public OptionExtendsTypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionExtendsTypeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionExtendsTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionExtendsTypeBound(this);
		}
	}

	public final OptionExtendsTypeBoundContext optionExtendsTypeBound() throws RecognitionException {
		OptionExtendsTypeBoundContext _localctx = new OptionExtendsTypeBoundContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_optionExtendsTypeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(616);
				extendsTypeBound();
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

	public static class ExtendsTypeBoundContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public ExtendsTypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsTypeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExtendsTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExtendsTypeBound(this);
		}
	}

	public final ExtendsTypeBoundContext extendsTypeBound() throws RecognitionException {
		ExtendsTypeBoundContext _localctx = new ExtendsTypeBoundContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_extendsTypeBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(EXTENDS);
			setState(620);
			typeBound();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public OtherTypeTypesContext otherTypeTypes() {
			return getRuleContext(OtherTypeTypesContext.class,0);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			typeType();
			setState(623);
			otherTypeTypes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherTypeTypesContext extends ParserRuleContext {
		public List<AnotherTypeTypeContext> anotherTypeType() {
			return getRuleContexts(AnotherTypeTypeContext.class);
		}
		public AnotherTypeTypeContext anotherTypeType(int i) {
			return getRuleContext(AnotherTypeTypeContext.class,i);
		}
		public OtherTypeTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherTypeTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOtherTypeTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOtherTypeTypes(this);
		}
	}

	public final OtherTypeTypesContext otherTypeTypes() throws RecognitionException {
		OtherTypeTypesContext _localctx = new OtherTypeTypesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_otherTypeTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(625);
				anotherTypeType();
				}
				}
				setState(630);
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

	public static class AnotherTypeTypeContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnotherTypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anotherTypeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnotherTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnotherTypeType(this);
		}
	}

	public final AnotherTypeTypeContext anotherTypeType() throws RecognitionException {
		AnotherTypeTypeContext _localctx = new AnotherTypeTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_anotherTypeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(BITAND);
			setState(632);
			typeType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JavaParser.ENUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public OptionImplementsTypeListContext optionImplementsTypeList() {
			return getRuleContext(OptionImplementsTypeListContext.class,0);
		}
		public OptionEnumConstantsContext optionEnumConstants() {
			return getRuleContext(OptionEnumConstantsContext.class,0);
		}
		public OptionCommaContext optionComma() {
			return getRuleContext(OptionCommaContext.class,0);
		}
		public OptionEnumBodyDeclarationsContext optionEnumBodyDeclarations() {
			return getRuleContext(OptionEnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_enumDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(ENUM);
			setState(635);
			match(IDENTIFIER);
			setState(636);
			optionImplementsTypeList();
			setState(637);
			match(LBRACE);
			setState(638);
			optionEnumConstants();
			setState(639);
			optionComma();
			setState(640);
			optionEnumBodyDeclarations();
			setState(641);
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

	public static class OptionEnumConstantsContext extends ParserRuleContext {
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public OptionEnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionEnumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionEnumConstants(this);
		}
	}

	public final OptionEnumConstantsContext optionEnumConstants() throws RecognitionException {
		OptionEnumConstantsContext _localctx = new OptionEnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_optionEnumConstants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==IDENTIFIER) {
				{
				setState(643);
				enumConstants();
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

	public static class OptionEnumBodyDeclarationsContext extends ParserRuleContext {
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public OptionEnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionEnumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionEnumBodyDeclarations(this);
		}
	}

	public final OptionEnumBodyDeclarationsContext optionEnumBodyDeclarations() throws RecognitionException {
		OptionEnumBodyDeclarationsContext _localctx = new OptionEnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_optionEnumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(646);
				enumBodyDeclarations();
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

	public static class EnumConstantsContext extends ParserRuleContext {
		public EnumConstantContext enumConstant() {
			return getRuleContext(EnumConstantContext.class,0);
		}
		public OtherEnumConstantsContext otherEnumConstants() {
			return getRuleContext(OtherEnumConstantsContext.class,0);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_enumConstants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			enumConstant();
			setState(650);
			otherEnumConstants();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherEnumConstantsContext extends ParserRuleContext {
		public List<AnotherEnumConstantContext> anotherEnumConstant() {
			return getRuleContexts(AnotherEnumConstantContext.class);
		}
		public AnotherEnumConstantContext anotherEnumConstant(int i) {
			return getRuleContext(AnotherEnumConstantContext.class,i);
		}
		public OtherEnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherEnumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOtherEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOtherEnumConstants(this);
		}
	}

	public final OtherEnumConstantsContext otherEnumConstants() throws RecognitionException {
		OtherEnumConstantsContext _localctx = new OtherEnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_otherEnumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(652);
					anotherEnumConstant();
					}
					} 
				}
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class AnotherEnumConstantContext extends ParserRuleContext {
		public EnumConstantContext enumConstant() {
			return getRuleContext(EnumConstantContext.class,0);
		}
		public AnotherEnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anotherEnumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnotherEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnotherEnumConstant(this);
		}
	}

	public final AnotherEnumConstantContext anotherEnumConstant() throws RecognitionException {
		AnotherEnumConstantContext _localctx = new AnotherEnumConstantContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_anotherEnumConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(COMMA);
			setState(659);
			enumConstant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public OptionArgumentsContext optionArguments() {
			return getRuleContext(OptionArgumentsContext.class,0);
		}
		public OptionClassBodyContext optionClassBody() {
			return getRuleContext(OptionClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_enumConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			annotations();
			setState(662);
			match(IDENTIFIER);
			setState(663);
			optionArguments();
			setState(664);
			optionClassBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionArgumentsContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public OptionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionArguments(this);
		}
	}

	public final OptionArgumentsContext optionArguments() throws RecognitionException {
		OptionArgumentsContext _localctx = new OptionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_optionArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(666);
				arguments();
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

	public static class OptionClassBodyContext extends ParserRuleContext {
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public OptionClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionClassBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionClassBody(this);
		}
	}

	public final OptionClassBodyContext optionClassBody() throws RecognitionException {
		OptionClassBodyContext _localctx = new OptionClassBodyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_optionClassBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(669);
				classBody();
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

	public static class ClassBodyDeclarationsContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassBodyDeclarations(this);
		}
	}

	public final ClassBodyDeclarationsContext classBodyDeclarations() throws RecognitionException {
		ClassBodyDeclarationsContext _localctx = new ClassBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_classBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(672);
				classBodyDeclaration();
				}
				}
				setState(677);
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

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public ClassBodyDeclarationsContext classBodyDeclarations() {
			return getRuleContext(ClassBodyDeclarationsContext.class,0);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_enumBodyDeclarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(SEMI);
			setState(679);
			classBodyDeclarations();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public OptionTypeParametersContext optionTypeParameters() {
			return getRuleContext(OptionTypeParametersContext.class,0);
		}
		public OptionExtendsTypeListContext optionExtendsTypeList() {
			return getRuleContext(OptionExtendsTypeListContext.class,0);
		}
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_interfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(INTERFACE);
			setState(682);
			match(IDENTIFIER);
			setState(683);
			optionTypeParameters();
			setState(684);
			optionExtendsTypeList();
			setState(685);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionExtendsTypeListContext extends ParserRuleContext {
		public ExtendsTypeListContext extendsTypeList() {
			return getRuleContext(ExtendsTypeListContext.class,0);
		}
		public OptionExtendsTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionExtendsTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionExtendsTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionExtendsTypeList(this);
		}
	}

	public final OptionExtendsTypeListContext optionExtendsTypeList() throws RecognitionException {
		OptionExtendsTypeListContext _localctx = new OptionExtendsTypeListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_optionExtendsTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(687);
				extendsTypeList();
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

	public static class ExtendsTypeListContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ExtendsTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExtendsTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExtendsTypeList(this);
		}
	}

	public final ExtendsTypeListContext extendsTypeList() throws RecognitionException {
		ExtendsTypeListContext _localctx = new ExtendsTypeListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_extendsTypeList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(EXTENDS);
			setState(691);
			typeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyDeclarationsContext classBodyDeclarations() {
			return getRuleContext(ClassBodyDeclarationsContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(LBRACE);
			setState(694);
			classBodyDeclarations();
			setState(695);
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public InterfaceBodyDeclarationsContext interfaceBodyDeclarations() {
			return getRuleContext(InterfaceBodyDeclarationsContext.class,0);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_interfaceBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(LBRACE);
			setState(698);
			interfaceBodyDeclarations();
			setState(699);
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

	public static class InterfaceBodyDeclarationsContext extends ParserRuleContext {
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceBodyDeclarations(this);
		}
	}

	public final InterfaceBodyDeclarationsContext interfaceBodyDeclarations() throws RecognitionException {
		InterfaceBodyDeclarationsContext _localctx = new InterfaceBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_interfaceBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(701);
				interfaceBodyDeclaration();
				}
				}
				setState(706);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public OptionStaticContext optionStatic() {
			return getRuleContext(OptionStaticContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_classBodyDeclaration);
		try {
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				optionStatic();
				setState(709);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(711);
				modifiers();
				setState(712);
				memberDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_memberDeclaration);
		try {
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(717);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(718);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(719);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(720);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(721);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(722);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(723);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(724);
				enumDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public SquaresContext squares() {
			return getRuleContext(SquaresContext.class,0);
		}
		public OptionThrowsQualifiedNameListContext optionThrowsQualifiedNameList() {
			return getRuleContext(OptionThrowsQualifiedNameListContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			typeTypeOrVoid();
			setState(728);
			match(IDENTIFIER);
			setState(729);
			formalParameters();
			setState(730);
			squares();
			setState(731);
			optionThrowsQualifiedNameList();
			setState(732);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionThrowsQualifiedNameListContext extends ParserRuleContext {
		public ThrowsQualifiedNameListContext throwsQualifiedNameList() {
			return getRuleContext(ThrowsQualifiedNameListContext.class,0);
		}
		public OptionThrowsQualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionThrowsQualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionThrowsQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionThrowsQualifiedNameList(this);
		}
	}

	public final OptionThrowsQualifiedNameListContext optionThrowsQualifiedNameList() throws RecognitionException {
		OptionThrowsQualifiedNameListContext _localctx = new OptionThrowsQualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_optionThrowsQualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(734);
				throwsQualifiedNameList();
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

	public static class ThrowsQualifiedNameListContext extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ThrowsQualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwsQualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterThrowsQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitThrowsQualifiedNameList(this);
		}
	}

	public final ThrowsQualifiedNameListContext throwsQualifiedNameList() throws RecognitionException {
		ThrowsQualifiedNameListContext _localctx = new ThrowsQualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_throwsQualifiedNameList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(THROWS);
			setState(738);
			qualifiedNameList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_methodBody);
		try {
			setState(742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				match(SEMI);
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

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeTypeOrVoid(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_typeTypeOrVoid);
		try {
			setState(746);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				match(VOID);
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

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitGenericMethodDeclaration(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			typeParameters();
			setState(749);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitGenericConstructorDeclaration(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			typeParameters();
			setState(752);
			constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public OptionThrowsQualifiedNameListContext optionThrowsQualifiedNameList() {
			return getRuleContext(OptionThrowsQualifiedNameListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_constructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(IDENTIFIER);
			setState(755);
			formalParameters();
			setState(756);
			optionThrowsQualifiedNameList();
			setState(757);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			typeType();
			setState(760);
			variableDeclarators();
			setState(761);
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

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_interfaceBodyDeclaration);
		try {
			setState(767);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				modifiers();
				setState(764);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				match(SEMI);
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

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_interfaceMemberDeclaration);
		try {
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(771);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(772);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(773);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(774);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(775);
				enumDeclaration();
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ConstantDeclaratorContext constantDeclarator() {
			return getRuleContext(ConstantDeclaratorContext.class,0);
		}
		public OtherConstantDeclaratorsContext otherConstantDeclarators() {
			return getRuleContext(OtherConstantDeclaratorsContext.class,0);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_constDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			typeType();
			setState(779);
			constantDeclarator();
			setState(780);
			otherConstantDeclarators();
			setState(781);
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

	public static class OtherConstantDeclaratorsContext extends ParserRuleContext {
		public List<AnotherConstantDeclaratorsContext> anotherConstantDeclarators() {
			return getRuleContexts(AnotherConstantDeclaratorsContext.class);
		}
		public AnotherConstantDeclaratorsContext anotherConstantDeclarators(int i) {
			return getRuleContext(AnotherConstantDeclaratorsContext.class,i);
		}
		public OtherConstantDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherConstantDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOtherConstantDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOtherConstantDeclarators(this);
		}
	}

	public final OtherConstantDeclaratorsContext otherConstantDeclarators() throws RecognitionException {
		OtherConstantDeclaratorsContext _localctx = new OtherConstantDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_otherConstantDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(783);
				anotherConstantDeclarators();
				}
				}
				setState(788);
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

	public static class AnotherConstantDeclaratorsContext extends ParserRuleContext {
		public ConstantDeclaratorContext constantDeclarator() {
			return getRuleContext(ConstantDeclaratorContext.class,0);
		}
		public AnotherConstantDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anotherConstantDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnotherConstantDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnotherConstantDeclarators(this);
		}
	}

	public final AnotherConstantDeclaratorsContext anotherConstantDeclarators() throws RecognitionException {
		AnotherConstantDeclaratorsContext _localctx = new AnotherConstantDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_anotherConstantDeclarators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(COMMA);
			setState(790);
			constantDeclarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public SquaresContext squares() {
			return getRuleContext(SquaresContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_constantDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(IDENTIFIER);
			setState(793);
			squares();
			setState(794);
			match(ASSIGN);
			setState(795);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public InterfaceMethodModifiersContext interfaceMethodModifiers() {
			return getRuleContext(InterfaceMethodModifiersContext.class,0);
		}
		public OptionTypeParametersAnnotationsContext optionTypeParametersAnnotations() {
			return getRuleContext(OptionTypeParametersAnnotationsContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public SquaresContext squares() {
			return getRuleContext(SquaresContext.class,0);
		}
		public OptionThrowsQualifiedNameListContext optionThrowsQualifiedNameList() {
			return getRuleContext(OptionThrowsQualifiedNameListContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_interfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			interfaceMethodModifiers();
			setState(798);
			optionTypeParametersAnnotations();
			setState(799);
			typeTypeOrVoid();
			setState(800);
			match(IDENTIFIER);
			setState(801);
			formalParameters();
			setState(802);
			squares();
			setState(803);
			optionThrowsQualifiedNameList();
			setState(804);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionTypeParametersAnnotationsContext extends ParserRuleContext {
		public TypeParametersAnnotationsContext typeParametersAnnotations() {
			return getRuleContext(TypeParametersAnnotationsContext.class,0);
		}
		public OptionTypeParametersAnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionTypeParametersAnnotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionTypeParametersAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionTypeParametersAnnotations(this);
		}
	}

	public final OptionTypeParametersAnnotationsContext optionTypeParametersAnnotations() throws RecognitionException {
		OptionTypeParametersAnnotationsContext _localctx = new OptionTypeParametersAnnotationsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_optionTypeParametersAnnotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(806);
				typeParametersAnnotations();
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

	public static class TypeParametersAnnotationsContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TypeParametersAnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParametersAnnotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeParametersAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeParametersAnnotations(this);
		}
	}

	public final TypeParametersAnnotationsContext typeParametersAnnotations() throws RecognitionException {
		TypeParametersAnnotationsContext _localctx = new TypeParametersAnnotationsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_typeParametersAnnotations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			typeParameters();
			setState(810);
			annotations();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifiersContext extends ParserRuleContext {
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceMethodModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceMethodModifiers(this);
		}
	}

	public final InterfaceMethodModifiersContext interfaceMethodModifiers() throws RecognitionException {
		InterfaceMethodModifiersContext _localctx = new InterfaceMethodModifiersContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_interfaceMethodModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(812);
					interfaceMethodModifier();
					}
					} 
				}
				setState(817);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceMethodModifier(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_interfaceMethodModifier);
		try {
			setState(824);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(818);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(819);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(820);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(821);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(822);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(823);
				match(STRICTFP);
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

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			typeParameters();
			setState(827);
			interfaceMethodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public OtherVariableDeclaratorsContext otherVariableDeclarators() {
			return getRuleContext(OtherVariableDeclaratorsContext.class,0);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_variableDeclarators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			variableDeclarator();
			setState(830);
			otherVariableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherVariableDeclaratorsContext extends ParserRuleContext {
		public List<AnotherVariableDeclaratorContext> anotherVariableDeclarator() {
			return getRuleContexts(AnotherVariableDeclaratorContext.class);
		}
		public AnotherVariableDeclaratorContext anotherVariableDeclarator(int i) {
			return getRuleContext(AnotherVariableDeclaratorContext.class,i);
		}
		public OtherVariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherVariableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOtherVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOtherVariableDeclarators(this);
		}
	}

	public final OtherVariableDeclaratorsContext otherVariableDeclarators() throws RecognitionException {
		OtherVariableDeclaratorsContext _localctx = new OtherVariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_otherVariableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(832);
				anotherVariableDeclarator();
				}
				}
				setState(837);
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

	public static class AnotherVariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public AnotherVariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anotherVariableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnotherVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnotherVariableDeclarator(this);
		}
	}

	public final AnotherVariableDeclaratorContext anotherVariableDeclarator() throws RecognitionException {
		AnotherVariableDeclaratorContext _localctx = new AnotherVariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_anotherVariableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(COMMA);
			setState(839);
			variableDeclarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public OptionEqualsVariableInitializerContext optionEqualsVariableInitializer() {
			return getRuleContext(OptionEqualsVariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_variableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			variableDeclaratorId();
			setState(842);
			optionEqualsVariableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionEqualsVariableInitializerContext extends ParserRuleContext {
		public EqualsVariableInitializerContext equalsVariableInitializer() {
			return getRuleContext(EqualsVariableInitializerContext.class,0);
		}
		public OptionEqualsVariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionEqualsVariableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionEqualsVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionEqualsVariableInitializer(this);
		}
	}

	public final OptionEqualsVariableInitializerContext optionEqualsVariableInitializer() throws RecognitionException {
		OptionEqualsVariableInitializerContext _localctx = new OptionEqualsVariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_optionEqualsVariableInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(844);
				equalsVariableInitializer();
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

	public static class EqualsVariableInitializerContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public EqualsVariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalsVariableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEqualsVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEqualsVariableInitializer(this);
		}
	}

	public final EqualsVariableInitializerContext equalsVariableInitializer() throws RecognitionException {
		EqualsVariableInitializerContext _localctx = new EqualsVariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_equalsVariableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(ASSIGN);
			setState(848);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public SquaresContext squares() {
			return getRuleContext(SquaresContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_variableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(IDENTIFIER);
			setState(851);
			squares();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_variableInitializer);
		try {
			setState(855);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public OptionVariablesInitializerContext optionVariablesInitializer() {
			return getRuleContext(OptionVariablesInitializerContext.class,0);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_arrayInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(LBRACE);
			setState(858);
			optionVariablesInitializer();
			setState(859);
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

	public static class OptionVariablesInitializerContext extends ParserRuleContext {
		public VariablesInitializerContext variablesInitializer() {
			return getRuleContext(VariablesInitializerContext.class,0);
		}
		public OptionVariablesInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionVariablesInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionVariablesInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionVariablesInitializer(this);
		}
	}

	public final OptionVariablesInitializerContext optionVariablesInitializer() throws RecognitionException {
		OptionVariablesInitializerContext _localctx = new OptionVariablesInitializerContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_optionVariablesInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(861);
				variablesInitializer();
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

	public static class VariablesInitializerContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public OtherVariableInitializersContext otherVariableInitializers() {
			return getRuleContext(OtherVariableInitializersContext.class,0);
		}
		public OptionCommaContext optionComma() {
			return getRuleContext(OptionCommaContext.class,0);
		}
		public VariablesInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablesInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariablesInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariablesInitializer(this);
		}
	}

	public final VariablesInitializerContext variablesInitializer() throws RecognitionException {
		VariablesInitializerContext _localctx = new VariablesInitializerContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_variablesInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			variableInitializer();
			setState(865);
			otherVariableInitializers();
			setState(866);
			optionComma();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherVariableInitializersContext extends ParserRuleContext {
		public List<AnotherVariableInitializerContext> anotherVariableInitializer() {
			return getRuleContexts(AnotherVariableInitializerContext.class);
		}
		public AnotherVariableInitializerContext anotherVariableInitializer(int i) {
			return getRuleContext(AnotherVariableInitializerContext.class,i);
		}
		public OtherVariableInitializersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherVariableInitializers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOtherVariableInitializers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOtherVariableInitializers(this);
		}
	}

	public final OtherVariableInitializersContext otherVariableInitializers() throws RecognitionException {
		OtherVariableInitializersContext _localctx = new OtherVariableInitializersContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_otherVariableInitializers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(868);
					anotherVariableInitializer();
					}
					} 
				}
				setState(873);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class AnotherVariableInitializerContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public AnotherVariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anotherVariableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnotherVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnotherVariableInitializer(this);
		}
	}

	public final AnotherVariableInitializerContext anotherVariableInitializer() throws RecognitionException {
		AnotherVariableInitializerContext _localctx = new AnotherVariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_anotherVariableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(COMMA);
			setState(875);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public OptionTypeArgumentsContext optionTypeArguments() {
			return getRuleContext(OptionTypeArgumentsContext.class,0);
		}
		public MemberSelectionsContext memberSelections() {
			return getRuleContext(MemberSelectionsContext.class,0);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(IDENTIFIER);
			setState(878);
			optionTypeArguments();
			setState(879);
			memberSelections();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionTypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public OptionTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionTypeArguments(this);
		}
	}

	public final OptionTypeArgumentsContext optionTypeArguments() throws RecognitionException {
		OptionTypeArgumentsContext _localctx = new OptionTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_optionTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(881);
				typeArguments();
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

	public static class MemberSelectionsContext extends ParserRuleContext {
		public List<MemberSelectionContext> memberSelection() {
			return getRuleContexts(MemberSelectionContext.class);
		}
		public MemberSelectionContext memberSelection(int i) {
			return getRuleContext(MemberSelectionContext.class,i);
		}
		public MemberSelectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberSelections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMemberSelections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMemberSelections(this);
		}
	}

	public final MemberSelectionsContext memberSelections() throws RecognitionException {
		MemberSelectionsContext _localctx = new MemberSelectionsContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_memberSelections);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(884);
					memberSelection();
					}
					} 
				}
				setState(889);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class MemberSelectionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public OptionTypeArgumentsContext optionTypeArguments() {
			return getRuleContext(OptionTypeArgumentsContext.class,0);
		}
		public MemberSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberSelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMemberSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMemberSelection(this);
		}
	}

	public final MemberSelectionContext memberSelection() throws RecognitionException {
		MemberSelectionContext _localctx = new MemberSelectionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_memberSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(DOT);
			setState(891);
			match(IDENTIFIER);
			setState(892);
			optionTypeArguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public OptionExtendsOrSuperTypeTypeContext optionExtendsOrSuperTypeType() {
			return getRuleContext(OptionExtendsOrSuperTypeTypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_typeArgument);
		try {
			setState(897);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(894);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(895);
				match(QUESTION);
				setState(896);
				optionExtendsOrSuperTypeType();
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

	public static class OptionExtendsOrSuperTypeTypeContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public OptionExtendsOrSuperTypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionExtendsOrSuperTypeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionExtendsOrSuperTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionExtendsOrSuperTypeType(this);
		}
	}

	public final OptionExtendsOrSuperTypeTypeContext optionExtendsOrSuperTypeType() throws RecognitionException {
		OptionExtendsOrSuperTypeTypeContext _localctx = new OptionExtendsOrSuperTypeTypeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_optionExtendsOrSuperTypeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(899);
				_la = _input.LA(1);
				if ( !(_la==EXTENDS || _la==SUPER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(900);
				typeType();
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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public OtherQualifiedNamesContext otherQualifiedNames() {
			return getRuleContext(OtherQualifiedNamesContext.class,0);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_qualifiedNameList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			qualifiedName();
			setState(904);
			otherQualifiedNames();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherQualifiedNamesContext extends ParserRuleContext {
		public List<AnotherQualifiedNameContext> anotherQualifiedName() {
			return getRuleContexts(AnotherQualifiedNameContext.class);
		}
		public AnotherQualifiedNameContext anotherQualifiedName(int i) {
			return getRuleContext(AnotherQualifiedNameContext.class,i);
		}
		public OtherQualifiedNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherQualifiedNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOtherQualifiedNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOtherQualifiedNames(this);
		}
	}

	public final OtherQualifiedNamesContext otherQualifiedNames() throws RecognitionException {
		OtherQualifiedNamesContext _localctx = new OtherQualifiedNamesContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_otherQualifiedNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(906);
				anotherQualifiedName();
				}
				}
				setState(911);
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

	public static class AnotherQualifiedNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnotherQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anotherQualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnotherQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnotherQualifiedName(this);
		}
	}

	public final AnotherQualifiedNameContext anotherQualifiedName() throws RecognitionException {
		AnotherQualifiedNameContext _localctx = new AnotherQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_anotherQualifiedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			match(COMMA);
			setState(913);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public OptionFormalParameterListContext optionFormalParameterList() {
			return getRuleContext(OptionFormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_formalParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(LPAREN);
			setState(916);
			optionFormalParameterList();
			setState(917);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionFormalParameterListContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public OptionFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionFormalParameterList(this);
		}
	}

	public final OptionFormalParameterListContext optionFormalParameterList() throws RecognitionException {
		OptionFormalParameterListContext _localctx = new OptionFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_optionFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(919);
				formalParameterList();
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public MoreThanOneNonArrayFormalParametersContext moreThanOneNonArrayFormalParameters() {
			return getRuleContext(MoreThanOneNonArrayFormalParametersContext.class,0);
		}
		public ArrayFormalParameterContext arrayFormalParameter() {
			return getRuleContext(ArrayFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_formalParameterList);
		try {
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
				moreThanOneNonArrayFormalParameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(923);
				arrayFormalParameter();
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

	public static class MoreThanOneNonArrayFormalParametersContext extends ParserRuleContext {
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public OtherFormalParametersContext otherFormalParameters() {
			return getRuleContext(OtherFormalParametersContext.class,0);
		}
		public OptionCommaArrayFormalParameterContext optionCommaArrayFormalParameter() {
			return getRuleContext(OptionCommaArrayFormalParameterContext.class,0);
		}
		public MoreThanOneNonArrayFormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreThanOneNonArrayFormalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMoreThanOneNonArrayFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMoreThanOneNonArrayFormalParameters(this);
		}
	}

	public final MoreThanOneNonArrayFormalParametersContext moreThanOneNonArrayFormalParameters() throws RecognitionException {
		MoreThanOneNonArrayFormalParametersContext _localctx = new MoreThanOneNonArrayFormalParametersContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_moreThanOneNonArrayFormalParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			formalParameter();
			setState(927);
			otherFormalParameters();
			setState(928);
			optionCommaArrayFormalParameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherFormalParametersContext extends ParserRuleContext {
		public List<AnotherFormalParameterContext> anotherFormalParameter() {
			return getRuleContexts(AnotherFormalParameterContext.class);
		}
		public AnotherFormalParameterContext anotherFormalParameter(int i) {
			return getRuleContext(AnotherFormalParameterContext.class,i);
		}
		public OtherFormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherFormalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOtherFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOtherFormalParameters(this);
		}
	}

	public final OtherFormalParametersContext otherFormalParameters() throws RecognitionException {
		OtherFormalParametersContext _localctx = new OtherFormalParametersContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_otherFormalParameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(930);
					anotherFormalParameter();
					}
					} 
				}
				setState(935);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class AnotherFormalParameterContext extends ParserRuleContext {
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public AnotherFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anotherFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnotherFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnotherFormalParameter(this);
		}
	}

	public final AnotherFormalParameterContext anotherFormalParameter() throws RecognitionException {
		AnotherFormalParameterContext _localctx = new AnotherFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_anotherFormalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(COMMA);
			setState(937);
			formalParameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionCommaArrayFormalParameterContext extends ParserRuleContext {
		public CommaArrayFormalParameterContext commaArrayFormalParameter() {
			return getRuleContext(CommaArrayFormalParameterContext.class,0);
		}
		public OptionCommaArrayFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionCommaArrayFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionCommaArrayFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionCommaArrayFormalParameter(this);
		}
	}

	public final OptionCommaArrayFormalParameterContext optionCommaArrayFormalParameter() throws RecognitionException {
		OptionCommaArrayFormalParameterContext _localctx = new OptionCommaArrayFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_optionCommaArrayFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(939);
				commaArrayFormalParameter();
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

	public static class CommaArrayFormalParameterContext extends ParserRuleContext {
		public ArrayFormalParameterContext arrayFormalParameter() {
			return getRuleContext(ArrayFormalParameterContext.class,0);
		}
		public CommaArrayFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaArrayFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCommaArrayFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCommaArrayFormalParameter(this);
		}
	}

	public final CommaArrayFormalParameterContext commaArrayFormalParameter() throws RecognitionException {
		CommaArrayFormalParameterContext _localctx = new CommaArrayFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_commaArrayFormalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			match(COMMA);
			setState(943);
			arrayFormalParameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			variableModifiers();
			setState(946);
			typeType();
			setState(947);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayFormalParameterContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ArrayFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArrayFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArrayFormalParameter(this);
		}
	}

	public final ArrayFormalParameterContext arrayFormalParameter() throws RecognitionException {
		ArrayFormalParameterContext _localctx = new ArrayFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_arrayFormalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			variableModifiers();
			setState(950);
			typeType();
			setState(951);
			match(ELLIPSIS);
			setState(952);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public OtherDotIdentifiersContext otherDotIdentifiers() {
			return getRuleContext(OtherDotIdentifiersContext.class,0);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_qualifiedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(IDENTIFIER);
			setState(955);
			otherDotIdentifiers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherDotIdentifiersContext extends ParserRuleContext {
		public List<AnotherDotIdentifierContext> anotherDotIdentifier() {
			return getRuleContexts(AnotherDotIdentifierContext.class);
		}
		public AnotherDotIdentifierContext anotherDotIdentifier(int i) {
			return getRuleContext(AnotherDotIdentifierContext.class,i);
		}
		public OtherDotIdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherDotIdentifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOtherDotIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOtherDotIdentifiers(this);
		}
	}

	public final OtherDotIdentifiersContext otherDotIdentifiers() throws RecognitionException {
		OtherDotIdentifiersContext _localctx = new OtherDotIdentifiersContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_otherDotIdentifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(957);
					anotherDotIdentifier();
					}
					} 
				}
				setState(962);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	public static class AnotherDotIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public AnotherDotIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anotherDotIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnotherDotIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnotherDotIdentifier(this);
		}
	}

	public final AnotherDotIdentifierContext anotherDotIdentifier() throws RecognitionException {
		AnotherDotIdentifierContext _localctx = new AnotherDotIdentifierContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_anotherDotIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			match(DOT);
			setState(964);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
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
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(JavaParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JavaParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(JavaParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(JavaParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_literal);
		try {
			setState(972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(968);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(969);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(970);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(971);
				match(NULL_LITERAL);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(JavaParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(JavaParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(JavaParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(JavaParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(JavaParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(JavaParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFloatLiteral(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
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

	public static class AnnotationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public OptionAnnotationRestContext optionAnnotationRest() {
			return getRuleContext(OptionAnnotationRestContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(AT);
			setState(979);
			qualifiedName();
			setState(980);
			optionAnnotationRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionAnnotationRestContext extends ParserRuleContext {
		public AnnotationRestContext annotationRest() {
			return getRuleContext(AnnotationRestContext.class,0);
		}
		public OptionAnnotationRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionAnnotationRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionAnnotationRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionAnnotationRest(this);
		}
	}

	public final OptionAnnotationRestContext optionAnnotationRest() throws RecognitionException {
		OptionAnnotationRestContext _localctx = new OptionAnnotationRestContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_optionAnnotationRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(982);
				annotationRest();
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

	public static class AnnotationRestContext extends ParserRuleContext {
		public OptionElementValuePairsOrElementValueContext optionElementValuePairsOrElementValue() {
			return getRuleContext(OptionElementValuePairsOrElementValueContext.class,0);
		}
		public AnnotationRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationRest(this);
		}
	}

	public final AnnotationRestContext annotationRest() throws RecognitionException {
		AnnotationRestContext _localctx = new AnnotationRestContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_annotationRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(LPAREN);
			setState(986);
			optionElementValuePairsOrElementValue();
			setState(987);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionElementValuePairsOrElementValueContext extends ParserRuleContext {
		public ElementValuePairsOrElementValueContext elementValuePairsOrElementValue() {
			return getRuleContext(ElementValuePairsOrElementValueContext.class,0);
		}
		public OptionElementValuePairsOrElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionElementValuePairsOrElementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionElementValuePairsOrElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionElementValuePairsOrElementValue(this);
		}
	}

	public final OptionElementValuePairsOrElementValueContext optionElementValuePairsOrElementValue() throws RecognitionException {
		OptionElementValuePairsOrElementValueContext _localctx = new OptionElementValuePairsOrElementValueContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_optionElementValuePairsOrElementValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(989);
				elementValuePairsOrElementValue();
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

	public static class ElementValuePairsOrElementValueContext extends ParserRuleContext {
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairsOrElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairsOrElementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElementValuePairsOrElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElementValuePairsOrElementValue(this);
		}
	}

	public final ElementValuePairsOrElementValueContext elementValuePairsOrElementValue() throws RecognitionException {
		ElementValuePairsOrElementValueContext _localctx = new ElementValuePairsOrElementValueContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_elementValuePairsOrElementValue);
		try {
			setState(994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(992);
				elementValuePairs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(993);
				elementValue();
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

	public static class ElementValuePairsContext extends ParserRuleContext {
		public ElementValuePairContext elementValuePair() {
			return getRuleContext(ElementValuePairContext.class,0);
		}
		public OtherElementValuePairsContext otherElementValuePairs() {
			return getRuleContext(OtherElementValuePairsContext.class,0);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_elementValuePairs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			elementValuePair();
			setState(997);
			otherElementValuePairs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherElementValuePairsContext extends ParserRuleContext {
		public List<AnotherElementValuePairContext> anotherElementValuePair() {
			return getRuleContexts(AnotherElementValuePairContext.class);
		}
		public AnotherElementValuePairContext anotherElementValuePair(int i) {
			return getRuleContext(AnotherElementValuePairContext.class,i);
		}
		public OtherElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherElementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOtherElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOtherElementValuePairs(this);
		}
	}

	public final OtherElementValuePairsContext otherElementValuePairs() throws RecognitionException {
		OtherElementValuePairsContext _localctx = new OtherElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_otherElementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(999);
				anotherElementValuePair();
				}
				}
				setState(1004);
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

	public static class AnotherElementValuePairContext extends ParserRuleContext {
		public ElementValuePairContext elementValuePair() {
			return getRuleContext(ElementValuePairContext.class,0);
		}
		public AnotherElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anotherElementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnotherElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnotherElementValuePair(this);
		}
	}

	public final AnotherElementValuePairContext anotherElementValuePair() throws RecognitionException {
		AnotherElementValuePairContext _localctx = new AnotherElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_anotherElementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			match(COMMA);
			setState(1006);
			elementValuePair();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(IDENTIFIER);
			setState(1009);
			match(ASSIGN);
			setState(1010);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_elementValue);
		try {
			setState(1015);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1012);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1013);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1014);
				elementValueArrayInitializer();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public OptionElementValuesContext optionElementValues() {
			return getRuleContext(OptionElementValuesContext.class,0);
		}
		public OptionCommaContext optionComma() {
			return getRuleContext(OptionCommaContext.class,0);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_elementValueArrayInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(LBRACE);
			setState(1018);
			optionElementValues();
			setState(1019);
			optionComma();
			setState(1020);
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

	public static class OtherElementValuesContext extends ParserRuleContext {
		public List<AnotherElementValueContext> anotherElementValue() {
			return getRuleContexts(AnotherElementValueContext.class);
		}
		public AnotherElementValueContext anotherElementValue(int i) {
			return getRuleContext(AnotherElementValueContext.class,i);
		}
		public OtherElementValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherElementValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOtherElementValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOtherElementValues(this);
		}
	}

	public final OtherElementValuesContext otherElementValues() throws RecognitionException {
		OtherElementValuesContext _localctx = new OtherElementValuesContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_otherElementValues);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1022);
					anotherElementValue();
					}
					} 
				}
				setState(1027);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class AnotherElementValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnotherElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anotherElementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnotherElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnotherElementValue(this);
		}
	}

	public final AnotherElementValueContext anotherElementValue() throws RecognitionException {
		AnotherElementValueContext _localctx = new AnotherElementValueContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_anotherElementValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(COMMA);
			setState(1029);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionElementValuesContext extends ParserRuleContext {
		public ElementValuesContext elementValues() {
			return getRuleContext(ElementValuesContext.class,0);
		}
		public OptionElementValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionElementValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionElementValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionElementValues(this);
		}
	}

	public final OptionElementValuesContext optionElementValues() throws RecognitionException {
		OptionElementValuesContext _localctx = new OptionElementValuesContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_optionElementValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(1031);
				elementValues();
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

	public static class ElementValuesContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public OtherElementValuesContext otherElementValues() {
			return getRuleContext(OtherElementValuesContext.class,0);
		}
		public ElementValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElementValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElementValues(this);
		}
	}

	public final ElementValuesContext elementValues() throws RecognitionException {
		ElementValuesContext _localctx = new ElementValuesContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_elementValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			elementValue();
			setState(1035);
			otherElementValues();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			match(AT);
			setState(1038);
			match(INTERFACE);
			setState(1039);
			match(IDENTIFIER);
			setState(1040);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public AnnotationTypeElementDeclarationsContext annotationTypeElementDeclarations() {
			return getRuleContext(AnnotationTypeElementDeclarationsContext.class,0);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_annotationTypeBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			match(LBRACE);
			setState(1043);
			annotationTypeElementDeclarations();
			setState(1044);
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

	public static class AnnotationTypeElementDeclarationsContext extends ParserRuleContext {
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeElementDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationTypeElementDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationTypeElementDeclarations(this);
		}
	}

	public final AnnotationTypeElementDeclarationsContext annotationTypeElementDeclarations() throws RecognitionException {
		AnnotationTypeElementDeclarationsContext _localctx = new AnnotationTypeElementDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_annotationTypeElementDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(1046);
				annotationTypeElementDeclaration();
				}
				}
				setState(1051);
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

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_annotationTypeElementDeclaration);
		try {
			setState(1056);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1052);
				modifiers();
				setState(1053);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
				match(SEMI);
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

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public OptionSemicolonContext optionSemicolon() {
			return getRuleContext(OptionSemicolonContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationTypeElementRest(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_annotationTypeElementRest);
		try {
			setState(1074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				typeType();
				setState(1059);
				annotationMethodOrConstantRest();
				setState(1060);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1062);
				classDeclaration();
				setState(1063);
				optionSemicolon();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1065);
				interfaceDeclaration();
				setState(1066);
				optionSemicolon();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1068);
				enumDeclaration();
				setState(1069);
				optionSemicolon();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1071);
				annotationTypeDeclaration();
				setState(1072);
				optionSemicolon();
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

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_annotationMethodOrConstantRest);
		try {
			setState(1078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1076);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1077);
				annotationConstantRest();
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

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public OptionDefaultValueContext optionDefaultValue() {
			return getRuleContext(OptionDefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationMethodRest(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_annotationMethodRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
			match(IDENTIFIER);
			setState(1081);
			match(LPAREN);
			setState(1082);
			match(RPAREN);
			setState(1083);
			optionDefaultValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationConstantRest(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionDefaultValueContext extends ParserRuleContext {
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public OptionDefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionDefaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionDefaultValue(this);
		}
	}

	public final OptionDefaultValueContext optionDefaultValue() throws RecognitionException {
		OptionDefaultValueContext _localctx = new OptionDefaultValueContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_optionDefaultValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1087);
				defaultValue();
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

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			match(DEFAULT);
			setState(1091);
			elementValue();
			}
		}
		catch (RecognitionException re) {
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
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			match(LBRACE);
			setState(1094);
			blockStatements();
			setState(1095);
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

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBlockStatements(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(1097);
				blockStatement();
				}
				}
				setState(1102);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_blockStatement);
		try {
			setState(1106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1104);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1105);
				localTypeDeclaration();
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			localVariableDeclaration();
			setState(1109);
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			variableModifiers();
			setState(1112);
			typeType();
			setState(1113);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassOrInterfaceModifiersContext classOrInterfaceModifiers() {
			return getRuleContext(ClassOrInterfaceModifiersContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLocalTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLocalTypeDeclaration(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_localTypeDeclaration);
		try {
			setState(1121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1115);
				classOrInterfaceModifiers();
				setState(1118);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(1116);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(1117);
					interfaceDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1120);
				match(SEMI);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public AssertStmtContext assertStmt() {
			return getRuleContext(AssertStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public DoWhileStmtContext doWhileStmt() {
			return getRuleContext(DoWhileStmtContext.class,0);
		}
		public TryStmtContext tryStmt() {
			return getRuleContext(TryStmtContext.class,0);
		}
		public TryRscSpecStmtContext tryRscSpecStmt() {
			return getRuleContext(TryRscSpecStmtContext.class,0);
		}
		public SwitchStmtContext switchStmt() {
			return getRuleContext(SwitchStmtContext.class,0);
		}
		public SynchronizedStmtContext synchronizedStmt() {
			return getRuleContext(SynchronizedStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public ThrowStmtContext throwStmt() {
			return getRuleContext(ThrowStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public SemiStmtContext semiStmt() {
			return getRuleContext(SemiStmtContext.class,0);
		}
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public IdentifierStmtContext identifierStmt() {
			return getRuleContext(IdentifierStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_statement);
		try {
			setState(1140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1123);
				blockStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1124);
				assertStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1125);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1126);
				forStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1127);
				whileStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1128);
				doWhileStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1129);
				tryStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1130);
				tryRscSpecStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1131);
				switchStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1132);
				synchronizedStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1133);
				returnStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1134);
				throwStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1135);
				breakStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1136);
				continueStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1137);
				semiStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1138);
				exprStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1139);
				identifierStmt();
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

	public static class BlockStmtContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBlockStmt(this);
		}
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_blockStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			((BlockStmtContext)_localctx).blockLabel = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStmtContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(JavaParser.ASSERT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OptionColonExpressionContext optionColonExpression() {
			return getRuleContext(OptionColonExpressionContext.class,0);
		}
		public AssertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAssertStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAssertStmt(this);
		}
	}

	public final AssertStmtContext assertStmt() throws RecognitionException {
		AssertStmtContext _localctx = new AssertStmtContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_assertStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(ASSERT);
			setState(1145);
			expression(0);
			setState(1146);
			optionColonExpression();
			setState(1147);
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public OptionElseStatementContext optionElseStatement() {
			return getRuleContext(OptionElseStatementContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			match(IF);
			setState(1150);
			parExpression();
			setState(1151);
			statement();
			setState(1152);
			optionElseStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JavaParser.FOR, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitForStmt(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			match(FOR);
			setState(1155);
			match(LPAREN);
			setState(1156);
			forControl();
			setState(1157);
			match(RPAREN);
			setState(1158);
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

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitWhileStmt(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			match(WHILE);
			setState(1161);
			parExpression();
			setState(1162);
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

	public static class DoWhileStmtContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(JavaParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public DoWhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterDoWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitDoWhileStmt(this);
		}
	}

	public final DoWhileStmtContext doWhileStmt() throws RecognitionException {
		DoWhileStmtContext _localctx = new DoWhileStmtContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_doWhileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			match(DO);
			setState(1165);
			statement();
			setState(1166);
			match(WHILE);
			setState(1167);
			parExpression();
			setState(1168);
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

	public static class TryStmtContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(JavaParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClausesOrOptionFinallyBlockContext catchClausesOrOptionFinallyBlock() {
			return getRuleContext(CatchClausesOrOptionFinallyBlockContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public TryStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTryStmt(this);
		}
	}

	public final TryStmtContext tryStmt() throws RecognitionException {
		TryStmtContext _localctx = new TryStmtContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_tryStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			match(TRY);
			setState(1171);
			block();
			setState(1174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(1172);
				catchClausesOrOptionFinallyBlock();
				}
				break;
			case 2:
				{
				setState(1173);
				finallyBlock();
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

	public static class TryRscSpecStmtContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(JavaParser.TRY, 0); }
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClausesContext catchClauses() {
			return getRuleContext(CatchClausesContext.class,0);
		}
		public OptionFinallyBlockContext optionFinallyBlock() {
			return getRuleContext(OptionFinallyBlockContext.class,0);
		}
		public TryRscSpecStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryRscSpecStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTryRscSpecStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTryRscSpecStmt(this);
		}
	}

	public final TryRscSpecStmtContext tryRscSpecStmt() throws RecognitionException {
		TryRscSpecStmtContext _localctx = new TryRscSpecStmtContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_tryRscSpecStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			match(TRY);
			setState(1177);
			resourceSpecification();
			setState(1178);
			block();
			setState(1179);
			catchClauses();
			setState(1180);
			optionFinallyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStmtContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public SwitchBlockStatementGroupsContext switchBlockStatementGroups() {
			return getRuleContext(SwitchBlockStatementGroupsContext.class,0);
		}
		public SwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchStmt(this);
		}
	}

	public final SwitchStmtContext switchStmt() throws RecognitionException {
		SwitchStmtContext _localctx = new SwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_switchStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			match(SWITCH);
			setState(1183);
			parExpression();
			setState(1184);
			match(LBRACE);
			setState(1185);
			switchBlockStatementGroups();
			setState(1186);
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

	public static class SynchronizedStmtContext extends ParserRuleContext {
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSynchronizedStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSynchronizedStmt(this);
		}
	}

	public final SynchronizedStmtContext synchronizedStmt() throws RecognitionException {
		SynchronizedStmtContext _localctx = new SynchronizedStmtContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_synchronizedStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			match(SYNCHRONIZED);
			setState(1189);
			parExpression();
			setState(1190);
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JavaParser.RETURN, 0); }
		public OptionExpressionContext optionExpression() {
			return getRuleContext(OptionExpressionContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitReturnStmt(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			match(RETURN);
			setState(1193);
			optionExpression();
			setState(1194);
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

	public static class ThrowStmtContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(JavaParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterThrowStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitThrowStmt(this);
		}
	}

	public final ThrowStmtContext throwStmt() throws RecognitionException {
		ThrowStmtContext _localctx = new ThrowStmtContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_throwStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			match(THROW);
			setState(1197);
			expression(0);
			setState(1198);
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

	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(JavaParser.BREAK, 0); }
		public OptionIdentifierContext optionIdentifier() {
			return getRuleContext(OptionIdentifierContext.class,0);
		}
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBreakStmt(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			match(BREAK);
			setState(1201);
			optionIdentifier();
			setState(1202);
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

	public static class ContinueStmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(JavaParser.CONTINUE, 0); }
		public OptionIdentifierContext optionIdentifier() {
			return getRuleContext(OptionIdentifierContext.class,0);
		}
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitContinueStmt(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_continueStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			match(CONTINUE);
			setState(1205);
			optionIdentifier();
			setState(1206);
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

	public static class SemiStmtContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public SemiStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semiStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSemiStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSemiStmt(this);
		}
	}

	public final SemiStmtContext semiStmt() throws RecognitionException {
		SemiStmtContext _localctx = new SemiStmtContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_semiStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
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

	public static class ExprStmtContext extends ParserRuleContext {
		public ExpressionContext statementExpression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExprStmt(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_exprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			((ExprStmtContext)_localctx).statementExpression = expression(0);
			setState(1211);
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

	public static class IdentifierStmtContext extends ParserRuleContext {
		public Token identifierLabel;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public IdentifierStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIdentifierStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIdentifierStmt(this);
		}
	}

	public final IdentifierStmtContext identifierStmt() throws RecognitionException {
		IdentifierStmtContext _localctx = new IdentifierStmtContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_identifierStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			((IdentifierStmtContext)_localctx).identifierLabel = match(IDENTIFIER);
			setState(1214);
			match(COLON);
			setState(1215);
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

	public static class OptionColonExpressionContext extends ParserRuleContext {
		public ColonExpressionContext colonExpression() {
			return getRuleContext(ColonExpressionContext.class,0);
		}
		public OptionColonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionColonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionColonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionColonExpression(this);
		}
	}

	public final OptionColonExpressionContext optionColonExpression() throws RecognitionException {
		OptionColonExpressionContext _localctx = new OptionColonExpressionContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_optionColonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1217);
				colonExpression();
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

	public static class ColonExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ColonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterColonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitColonExpression(this);
		}
	}

	public final ColonExpressionContext colonExpression() throws RecognitionException {
		ColonExpressionContext _localctx = new ColonExpressionContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_colonExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			match(COLON);
			setState(1221);
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

	public static class OptionElseStatementContext extends ParserRuleContext {
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public OptionElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionElseStatement(this);
		}
	}

	public final OptionElseStatementContext optionElseStatement() throws RecognitionException {
		OptionElseStatementContext _localctx = new OptionElseStatementContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_optionElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(1223);
				elseStatement();
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElseStatement(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			match(ELSE);
			setState(1227);
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

	public static class OptionFinallyBlockContext extends ParserRuleContext {
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public OptionFinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionFinallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionFinallyBlock(this);
		}
	}

	public final OptionFinallyBlockContext optionFinallyBlock() throws RecognitionException {
		OptionFinallyBlockContext _localctx = new OptionFinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_optionFinallyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1229);
				finallyBlock();
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

	public static class SwitchBlockStatementGroupsContext extends ParserRuleContext {
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public SwitchBlockStatementGroupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroups; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchBlockStatementGroups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchBlockStatementGroups(this);
		}
	}

	public final SwitchBlockStatementGroupsContext switchBlockStatementGroups() throws RecognitionException {
		SwitchBlockStatementGroupsContext _localctx = new SwitchBlockStatementGroupsContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_switchBlockStatementGroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1232);
				switchBlockStatementGroup();
				}
				}
				setState(1237);
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

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchLabels(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_switchLabels);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1239); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1238);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1241); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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

	public static class CatchClausesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCatchClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCatchClauses(this);
		}
	}

	public final CatchClausesContext catchClauses() throws RecognitionException {
		CatchClausesContext _localctx = new CatchClausesContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_catchClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1243);
				catchClause();
				}
				}
				setState(1248);
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

	public static class OptionExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OptionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionExpression(this);
		}
	}

	public final OptionExpressionContext optionExpression() throws RecognitionException {
		OptionExpressionContext _localctx = new OptionExpressionContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_optionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(1249);
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

	public static class CatchClausesOrOptionFinallyBlockContext extends ParserRuleContext {
		public CatchClausesContext catchClauses() {
			return getRuleContext(CatchClausesContext.class,0);
		}
		public OptionFinallyBlockContext optionFinallyBlock() {
			return getRuleContext(OptionFinallyBlockContext.class,0);
		}
		public CatchClausesOrOptionFinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClausesOrOptionFinallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCatchClausesOrOptionFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCatchClausesOrOptionFinallyBlock(this);
		}
	}

	public final CatchClausesOrOptionFinallyBlockContext catchClausesOrOptionFinallyBlock() throws RecognitionException {
		CatchClausesOrOptionFinallyBlockContext _localctx = new CatchClausesOrOptionFinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_catchClausesOrOptionFinallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			catchClauses();
			setState(1253);
			optionFinallyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(JavaParser.CATCH, 0); }
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			match(CATCH);
			setState(1256);
			match(LPAREN);
			setState(1257);
			variableModifiers();
			setState(1258);
			catchType();
			setState(1259);
			match(IDENTIFIER);
			setState(1260);
			match(RPAREN);
			setState(1261);
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

	public static class CatchTypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public OrQualifiedNamesContext orQualifiedNames() {
			return getRuleContext(OrQualifiedNamesContext.class,0);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_catchType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			qualifiedName();
			setState(1264);
			orQualifiedNames();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrQualifiedNamesContext extends ParserRuleContext {
		public List<OrQualifiedNameContext> orQualifiedName() {
			return getRuleContexts(OrQualifiedNameContext.class);
		}
		public OrQualifiedNameContext orQualifiedName(int i) {
			return getRuleContext(OrQualifiedNameContext.class,i);
		}
		public OrQualifiedNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orQualifiedNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOrQualifiedNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOrQualifiedNames(this);
		}
	}

	public final OrQualifiedNamesContext orQualifiedNames() throws RecognitionException {
		OrQualifiedNamesContext _localctx = new OrQualifiedNamesContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_orQualifiedNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1266);
				orQualifiedName();
				}
				}
				setState(1271);
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

	public static class OrQualifiedNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public OrQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orQualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOrQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOrQualifiedName(this);
		}
	}

	public final OrQualifiedNameContext orQualifiedName() throws RecognitionException {
		OrQualifiedNameContext _localctx = new OrQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_orQualifiedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			match(BITOR);
			setState(1273);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(JavaParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			match(FINALLY);
			setState(1276);
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public OptionSemicolonContext optionSemicolon() {
			return getRuleContext(OptionSemicolonContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_resourceSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1278);
			match(LPAREN);
			setState(1279);
			resources();
			setState(1280);
			optionSemicolon();
			setState(1281);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public SemicolonResourcesContext semicolonResources() {
			return getRuleContext(SemicolonResourcesContext.class,0);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_resources);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			resource();
			setState(1284);
			semicolonResources();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SemicolonResourcesContext extends ParserRuleContext {
		public List<SemicolonResourceContext> semicolonResource() {
			return getRuleContexts(SemicolonResourceContext.class);
		}
		public SemicolonResourceContext semicolonResource(int i) {
			return getRuleContext(SemicolonResourceContext.class,i);
		}
		public SemicolonResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolonResources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSemicolonResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSemicolonResources(this);
		}
	}

	public final SemicolonResourcesContext semicolonResources() throws RecognitionException {
		SemicolonResourcesContext _localctx = new SemicolonResourcesContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_semicolonResources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1286);
					semicolonResource();
					}
					} 
				}
				setState(1291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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

	public static class SemicolonResourceContext extends ParserRuleContext {
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public SemicolonResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolonResource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSemicolonResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSemicolonResource(this);
		}
	}

	public final SemicolonResourceContext semicolonResource() throws RecognitionException {
		SemicolonResourceContext _localctx = new SemicolonResourceContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_semicolonResource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			match(SEMI);
			setState(1293);
			resource();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
			variableModifiers();
			setState(1296);
			classOrInterfaceType();
			setState(1297);
			variableDeclaratorId();
			setState(1298);
			match(ASSIGN);
			setState(1299);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			switchLabels();
			setState(1302);
			blockStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public TerminalNode CASE() { return getToken(JavaParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_switchLabel);
		try {
			setState(1312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1304);
				match(CASE);
				setState(1307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(1305);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1306);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(1309);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1310);
				match(DEFAULT);
				setState(1311);
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

	public static class ForControlContext extends ParserRuleContext {
		public OptionExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public OptionforInitContext optionforInit() {
			return getRuleContext(OptionforInitContext.class,0);
		}
		public OptionExpressionContext optionExpression() {
			return getRuleContext(OptionExpressionContext.class,0);
		}
		public OptionExpressionListContext optionExpressionList() {
			return getRuleContext(OptionExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_forControl);
		try {
			setState(1321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1314);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1315);
				optionforInit();
				setState(1316);
				match(SEMI);
				setState(1317);
				optionExpression();
				setState(1318);
				match(SEMI);
				setState(1319);
				((ForControlContext)_localctx).forUpdate = optionExpressionList();
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

	public static class OptionforInitContext extends ParserRuleContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public OptionforInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionforInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionforInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionforInit(this);
		}
	}

	public final OptionforInitContext optionforInit() throws RecognitionException {
		OptionforInitContext _localctx = new OptionforInitContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_optionforInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(1323);
				forInit();
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

	public static class OptionExpressionListContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public OptionExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionExpressionList(this);
		}
	}

	public final OptionExpressionListContext optionExpressionList() throws RecognitionException {
		OptionExpressionListContext _localctx = new OptionExpressionListContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_optionExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(1326);
				expressionList();
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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_forInit);
		try {
			setState(1331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1329);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1330);
				expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			variableModifiers();
			setState(1334);
			typeType();
			setState(1335);
			variableDeclaratorId();
			setState(1336);
			match(COLON);
			setState(1337);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1339);
			match(LPAREN);
			setState(1340);
			expression(0);
			setState(1341);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OtherExpressionsContext otherExpressions() {
			return getRuleContext(OtherExpressionsContext.class,0);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_expressionList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1343);
			expression(0);
			setState(1344);
			otherExpressions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherExpressionsContext extends ParserRuleContext {
		public List<AnotherExpressionContext> anotherExpression() {
			return getRuleContexts(AnotherExpressionContext.class);
		}
		public AnotherExpressionContext anotherExpression(int i) {
			return getRuleContext(AnotherExpressionContext.class,i);
		}
		public OtherExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOtherExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOtherExpressions(this);
		}
	}

	public final OtherExpressionsContext otherExpressions() throws RecognitionException {
		OtherExpressionsContext _localctx = new OtherExpressionsContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_otherExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1346);
				anotherExpression();
				}
				}
				setState(1351);
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

	public static class AnotherExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnotherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anotherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnotherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnotherExpression(this);
		}
	}

	public final AnotherExpressionContext anotherExpression() throws RecognitionException {
		AnotherExpressionContext _localctx = new AnotherExpressionContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_anotherExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			match(COMMA);
			setState(1353);
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public OptionExpressionListContext optionExpressionList() {
			return getRuleContext(OptionExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_methodCall);
		try {
			setState(1370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1355);
				match(IDENTIFIER);
				setState(1356);
				match(LPAREN);
				setState(1357);
				optionExpressionList();
				setState(1358);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1360);
				match(THIS);
				setState(1361);
				match(LPAREN);
				setState(1362);
				optionExpressionList();
				setState(1363);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1365);
				match(SUPER);
				setState(1366);
				match(LPAREN);
				setState(1367);
				optionExpressionList();
				setState(1368);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewExprContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public NewExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNewExpr(this);
		}
	}
	public static class LogicOrExprContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogicOrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLogicOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLogicOrExpr(this);
		}
	}
	public static class ThisExprContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public ThisExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterThisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitThisExpr(this);
		}
	}
	public static class InstanceOfExprContext extends ExpressionContext {
		public Token bop;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(JavaParser.INSTANCEOF, 0); }
		public InstanceOfExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInstanceOfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInstanceOfExpr(this);
		}
	}
	public static class ArrayReadExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayReadExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArrayReadExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArrayReadExpr(this);
		}
	}
	public static class CondExprContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CondExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCondExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCondExpr(this);
		}
	}
	public static class DottedExprContext extends ExpressionContext {
		public Token bop;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public NewOptionNonWildcardTypeArgumentsInnerCreatorContext newOptionNonWildcardTypeArgumentsInnerCreator() {
			return getRuleContext(NewOptionNonWildcardTypeArgumentsInnerCreatorContext.class,0);
		}
		public SuperSuperSuffixContext superSuperSuffix() {
			return getRuleContext(SuperSuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public DottedExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterDottedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitDottedExpr(this);
		}
	}
	public static class XorExprContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public XorExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterXorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitXorExpr(this);
		}
	}
	public static class CmpExprContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CmpExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCmpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCmpExpr(this);
		}
	}
	public static class InfixAddMinusExprContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InfixAddMinusExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInfixAddMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInfixAddMinusExpr(this);
		}
	}
	public static class MethodCallExprContext extends ExpressionContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MethodCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodCallExpr(this);
		}
	}
	public static class LambdaExprContext extends ExpressionContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public LambdaExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLambdaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLambdaExpr(this);
		}
	}
	public static class ParenthesizedExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterParenthesizedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitParenthesizedExpr(this);
		}
	}
	public static class LiteralExprContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLiteralExpr(this);
		}
	}
	public static class TypedExprContext extends ExpressionContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypedExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypedExpr(this);
		}
	}
	public static class MultDivExprContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultDivExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMultDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMultDivExpr(this);
		}
	}
	public static class CallExprContext extends ExpressionContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ThisArgumentsContext thisArguments() {
			return getRuleContext(ThisArgumentsContext.class,0);
		}
		public CallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCallExpr(this);
		}
	}
	public static class BitAndExprContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BitAndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBitAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBitAndExpr(this);
		}
	}
	public static class AssignExprContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAssignExpr(this);
		}
	}
	public static class ExprMethodReferenceContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OptionTypeArgumentsIdentifierContext optionTypeArgumentsIdentifier() {
			return getRuleContext(OptionTypeArgumentsIdentifierContext.class,0);
		}
		public ExprMethodReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExprMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExprMethodReference(this);
		}
	}
	public static class TypeMethodReferenceContext extends ExpressionContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public OptionTypeArgumentsIdentifierContext optionTypeArgumentsIdentifier() {
			return getRuleContext(OptionTypeArgumentsIdentifierContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public TypeMethodReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeMethodReference(this);
		}
	}
	public static class ClassExprContext extends ExpressionContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public ClassExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassExpr(this);
		}
	}
	public static class PreAddMinusExprContext extends ExpressionContext {
		public Token prefix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PreAddMinusExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPreAddMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPreAddMinusExpr(this);
		}
	}
	public static class ShiftExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LeftShiftContext leftShift() {
			return getRuleContext(LeftShiftContext.class,0);
		}
		public UnsignedRightShiftContext unsignedRightShift() {
			return getRuleContext(UnsignedRightShiftContext.class,0);
		}
		public SignedRightShiftContext signedRightShift() {
			return getRuleContext(SignedRightShiftContext.class,0);
		}
		public ShiftExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterShiftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitShiftExpr(this);
		}
	}
	public static class SuperExprContext extends ExpressionContext {
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public SuperExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSuperExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSuperExpr(this);
		}
	}
	public static class EqExprContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEqExpr(this);
		}
	}
	public static class BitOrExprContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BitOrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBitOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBitOrExpr(this);
		}
	}
	public static class LogicAndExprContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogicAndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLogicAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLogicAndExpr(this);
		}
	}
	public static class NegExprContext extends ExpressionContext {
		public Token prefix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNegExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNegExpr(this);
		}
	}
	public static class SufAddMinusExprContext extends ExpressionContext {
		public Token postfix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SufAddMinusExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSufAddMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSufAddMinusExpr(this);
		}
	}
	public static class ClassTypeMethodReferenceContext extends ExpressionContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public OptionTypeArgumentsContext optionTypeArguments() {
			return getRuleContext(OptionTypeArgumentsContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public ClassTypeMethodReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassTypeMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassTypeMethodReference(this);
		}
	}
	public static class IdExprContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public IdExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIdExpr(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 376;
		enterRecursionRule(_localctx, 376, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1373);
				match(LPAREN);
				setState(1374);
				expression(0);
				setState(1375);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ThisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1377);
				match(THIS);
				}
				break;
			case 3:
				{
				_localctx = new SuperExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1378);
				match(SUPER);
				}
				break;
			case 4:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1379);
				literal();
				}
				break;
			case 5:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1380);
				match(IDENTIFIER);
				}
				break;
			case 6:
				{
				_localctx = new ClassExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1381);
				typeTypeOrVoid();
				setState(1382);
				match(DOT);
				setState(1383);
				match(CLASS);
				}
				break;
			case 7:
				{
				_localctx = new CallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1385);
				nonWildcardTypeArguments();
				setState(1388);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case IDENTIFIER:
					{
					setState(1386);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1387);
					thisArguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				{
				_localctx = new MethodCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1390);
				methodCall();
				}
				break;
			case 9:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1391);
				match(NEW);
				setState(1392);
				creator();
				}
				break;
			case 10:
				{
				_localctx = new TypedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1393);
				match(LPAREN);
				setState(1394);
				typeType();
				setState(1395);
				match(RPAREN);
				setState(1396);
				expression(21);
				}
				break;
			case 11:
				{
				_localctx = new PreAddMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1398);
				((PreAddMinusExprContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (INC - 83)) | (1L << (DEC - 83)) | (1L << (ADD - 83)) | (1L << (SUB - 83)))) != 0)) ) {
					((PreAddMinusExprContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1399);
				expression(19);
				}
				break;
			case 12:
				{
				_localctx = new NegExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1400);
				((NegExprContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((NegExprContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1401);
				expression(18);
				}
				break;
			case 13:
				{
				_localctx = new LambdaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1402);
				lambdaExpression();
				}
				break;
			case 14:
				{
				_localctx = new TypeMethodReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1403);
				typeType();
				setState(1404);
				match(COLONCOLON);
				setState(1407);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
				case IDENTIFIER:
					{
					setState(1405);
					optionTypeArgumentsIdentifier();
					}
					break;
				case NEW:
					{
					setState(1406);
					match(NEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 15:
				{
				_localctx = new ClassTypeMethodReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1409);
				classType();
				setState(1410);
				match(COLONCOLON);
				setState(1411);
				optionTypeArguments();
				setState(1412);
				match(NEW);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1485);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1483);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1416);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1417);
						((MultDivExprContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (MUL - 87)) | (1L << (DIV - 87)) | (1L << (MOD - 87)))) != 0)) ) {
							((MultDivExprContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1418);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new InfixAddMinusExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1419);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1420);
						((InfixAddMinusExprContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((InfixAddMinusExprContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1421);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1422);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1426);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
						case 1:
							{
							setState(1423);
							leftShift();
							}
							break;
						case 2:
							{
							setState(1424);
							unsignedRightShift();
							}
							break;
						case 3:
							{
							setState(1425);
							signedRightShift();
							}
							break;
						}
						setState(1428);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new CmpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1430);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1431);
						((CmpExprContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (GT - 71)) | (1L << (LT - 71)) | (1L << (LE - 71)) | (1L << (GE - 71)))) != 0)) ) {
							((CmpExprContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1432);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new EqExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1433);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1434);
						((EqExprContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((EqExprContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1435);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new BitAndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1436);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1437);
						((BitAndExprContext)_localctx).bop = match(BITAND);
						setState(1438);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new XorExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1439);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1440);
						((XorExprContext)_localctx).bop = match(CARET);
						setState(1441);
						expression(11);
						}
						break;
					case 8:
						{
						_localctx = new BitOrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1442);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1443);
						((BitOrExprContext)_localctx).bop = match(BITOR);
						setState(1444);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new LogicAndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1445);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1446);
						((LogicAndExprContext)_localctx).bop = match(AND);
						setState(1447);
						expression(9);
						}
						break;
					case 10:
						{
						_localctx = new LogicOrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1448);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1449);
						((LogicOrExprContext)_localctx).bop = match(OR);
						setState(1450);
						expression(8);
						}
						break;
					case 11:
						{
						_localctx = new CondExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1451);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1452);
						((CondExprContext)_localctx).bop = match(QUESTION);
						setState(1453);
						expression(0);
						setState(1454);
						match(COLON);
						setState(1455);
						expression(6);
						}
						break;
					case 12:
						{
						_localctx = new AssignExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1457);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1458);
						((AssignExprContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (ASSIGN - 70)) | (1L << (ADD_ASSIGN - 70)) | (1L << (SUB_ASSIGN - 70)) | (1L << (MUL_ASSIGN - 70)) | (1L << (DIV_ASSIGN - 70)) | (1L << (AND_ASSIGN - 70)) | (1L << (OR_ASSIGN - 70)) | (1L << (XOR_ASSIGN - 70)) | (1L << (MOD_ASSIGN - 70)) | (1L << (LSHIFT_ASSIGN - 70)) | (1L << (RSHIFT_ASSIGN - 70)) | (1L << (URSHIFT_ASSIGN - 70)))) != 0)) ) {
							((AssignExprContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1459);
						expression(5);
						}
						break;
					case 13:
						{
						_localctx = new DottedExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1460);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1461);
						((DottedExprContext)_localctx).bop = match(DOT);
						setState(1468);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
						case 1:
							{
							setState(1462);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(1463);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1464);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1465);
							newOptionNonWildcardTypeArgumentsInnerCreator();
							}
							break;
						case 5:
							{
							setState(1466);
							superSuperSuffix();
							}
							break;
						case 6:
							{
							setState(1467);
							explicitGenericInvocation();
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new ArrayReadExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1470);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1471);
						match(LBRACK);
						setState(1472);
						expression(0);
						setState(1473);
						match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new SufAddMinusExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1475);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1476);
						((SufAddMinusExprContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((SufAddMinusExprContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 16:
						{
						_localctx = new InstanceOfExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1477);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1478);
						((InstanceOfExprContext)_localctx).bop = match(INSTANCEOF);
						setState(1479);
						typeType();
						}
						break;
					case 17:
						{
						_localctx = new ExprMethodReferenceContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1480);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1481);
						match(COLONCOLON);
						setState(1482);
						optionTypeArgumentsIdentifier();
						}
						break;
					}
					} 
				}
				setState(1487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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

	public static class ThisArgumentsContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ThisArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterThisArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitThisArguments(this);
		}
	}

	public final ThisArgumentsContext thisArguments() throws RecognitionException {
		ThisArgumentsContext _localctx = new ThisArgumentsContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_thisArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			match(THIS);
			setState(1489);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewOptionNonWildcardTypeArgumentsInnerCreatorContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public OptionNonWildcardTypeArgumentsContext optionNonWildcardTypeArguments() {
			return getRuleContext(OptionNonWildcardTypeArgumentsContext.class,0);
		}
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public NewOptionNonWildcardTypeArgumentsInnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newOptionNonWildcardTypeArgumentsInnerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNewOptionNonWildcardTypeArgumentsInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNewOptionNonWildcardTypeArgumentsInnerCreator(this);
		}
	}

	public final NewOptionNonWildcardTypeArgumentsInnerCreatorContext newOptionNonWildcardTypeArgumentsInnerCreator() throws RecognitionException {
		NewOptionNonWildcardTypeArgumentsInnerCreatorContext _localctx = new NewOptionNonWildcardTypeArgumentsInnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_newOptionNonWildcardTypeArgumentsInnerCreator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			match(NEW);
			setState(1492);
			optionNonWildcardTypeArguments();
			setState(1493);
			innerCreator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuperSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public SuperSuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuperSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSuperSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSuperSuperSuffix(this);
		}
	}

	public final SuperSuperSuffixContext superSuperSuffix() throws RecognitionException {
		SuperSuperSuffixContext _localctx = new SuperSuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_superSuperSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			match(SUPER);
			setState(1496);
			superSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionTypeArgumentsIdentifierContext extends ParserRuleContext {
		public OptionTypeArgumentsContext optionTypeArguments() {
			return getRuleContext(OptionTypeArgumentsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public OptionTypeArgumentsIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionTypeArgumentsIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionTypeArgumentsIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionTypeArgumentsIdentifier(this);
		}
	}

	public final OptionTypeArgumentsIdentifierContext optionTypeArgumentsIdentifier() throws RecognitionException {
		OptionTypeArgumentsIdentifierContext _localctx = new OptionTypeArgumentsIdentifierContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_optionTypeArgumentsIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			optionTypeArguments();
			setState(1499);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftShiftContext extends ParserRuleContext {
		public LeftShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftShift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLeftShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLeftShift(this);
		}
	}

	public final LeftShiftContext leftShift() throws RecognitionException {
		LeftShiftContext _localctx = new LeftShiftContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_leftShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501);
			match(LT);
			setState(1502);
			match(LT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedRightShiftContext extends ParserRuleContext {
		public SignedRightShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedRightShift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSignedRightShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSignedRightShift(this);
		}
	}

	public final SignedRightShiftContext signedRightShift() throws RecognitionException {
		SignedRightShiftContext _localctx = new SignedRightShiftContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_signedRightShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			match(GT);
			setState(1505);
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

	public static class UnsignedRightShiftContext extends ParserRuleContext {
		public UnsignedRightShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedRightShift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterUnsignedRightShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitUnsignedRightShift(this);
		}
	}

	public final UnsignedRightShiftContext unsignedRightShift() throws RecognitionException {
		UnsignedRightShiftContext _localctx = new UnsignedRightShiftContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_unsignedRightShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			match(GT);
			setState(1508);
			match(GT);
			setState(1509);
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

	public static class OptionNonWildcardTypeArgumentsContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public OptionNonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionNonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionNonWildcardTypeArguments(this);
		}
	}

	public final OptionNonWildcardTypeArgumentsContext optionNonWildcardTypeArguments() throws RecognitionException {
		OptionNonWildcardTypeArgumentsContext _localctx = new OptionNonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_optionNonWildcardTypeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1511);
				nonWildcardTypeArguments();
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

	public static class SquaredExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SquaredExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_squaredExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSquaredExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSquaredExpression(this);
		}
	}

	public final SquaredExpressionContext squaredExpression() throws RecognitionException {
		SquaredExpressionContext _localctx = new SquaredExpressionContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_squaredExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			match(LBRACK);
			setState(1515);
			expression(0);
			setState(1516);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			lambdaParameters();
			setState(1519);
			match(ARROW);
			setState(1520);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public ParenthesizedOptionFormalParameterListContext parenthesizedOptionFormalParameterList() {
			return getRuleContext(ParenthesizedOptionFormalParameterListContext.class,0);
		}
		public ParenthesizedIdentifiersContext parenthesizedIdentifiers() {
			return getRuleContext(ParenthesizedIdentifiersContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_lambdaParameters);
		try {
			setState(1525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1522);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1523);
				parenthesizedOptionFormalParameterList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1524);
				parenthesizedIdentifiers();
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

	public static class IdentifiersContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public OtherIdentifiersContext otherIdentifiers() {
			return getRuleContext(OtherIdentifiersContext.class,0);
		}
		public IdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIdentifiers(this);
		}
	}

	public final IdentifiersContext identifiers() throws RecognitionException {
		IdentifiersContext _localctx = new IdentifiersContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_identifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			match(IDENTIFIER);
			setState(1528);
			otherIdentifiers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherIdentifiersContext extends ParserRuleContext {
		public List<AnotherIdentifierContext> anotherIdentifier() {
			return getRuleContexts(AnotherIdentifierContext.class);
		}
		public AnotherIdentifierContext anotherIdentifier(int i) {
			return getRuleContext(AnotherIdentifierContext.class,i);
		}
		public OtherIdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherIdentifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOtherIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOtherIdentifiers(this);
		}
	}

	public final OtherIdentifiersContext otherIdentifiers() throws RecognitionException {
		OtherIdentifiersContext _localctx = new OtherIdentifiersContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_otherIdentifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1530);
				anotherIdentifier();
				}
				}
				setState(1535);
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

	public static class AnotherIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public AnotherIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anotherIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnotherIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnotherIdentifier(this);
		}
	}

	public final AnotherIdentifierContext anotherIdentifier() throws RecognitionException {
		AnotherIdentifierContext _localctx = new AnotherIdentifierContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_anotherIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			match(COMMA);
			setState(1537);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesizedOptionFormalParameterListContext extends ParserRuleContext {
		public OptionFormalParameterListContext optionFormalParameterList() {
			return getRuleContext(OptionFormalParameterListContext.class,0);
		}
		public ParenthesizedOptionFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedOptionFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterParenthesizedOptionFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitParenthesizedOptionFormalParameterList(this);
		}
	}

	public final ParenthesizedOptionFormalParameterListContext parenthesizedOptionFormalParameterList() throws RecognitionException {
		ParenthesizedOptionFormalParameterListContext _localctx = new ParenthesizedOptionFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_parenthesizedOptionFormalParameterList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			match(LPAREN);
			setState(1540);
			optionFormalParameterList();
			setState(1541);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesizedIdentifiersContext extends ParserRuleContext {
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public ParenthesizedIdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedIdentifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterParenthesizedIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitParenthesizedIdentifiers(this);
		}
	}

	public final ParenthesizedIdentifiersContext parenthesizedIdentifiers() throws RecognitionException {
		ParenthesizedIdentifiersContext _localctx = new ParenthesizedIdentifiersContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_parenthesizedIdentifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			match(LPAREN);
			setState(1544);
			identifiers();
			setState(1545);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_lambdaBody);
		try {
			setState(1549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1547);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1548);
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

	public static class ClassTypeContext extends ParserRuleContext {
		public OptionClassOrInterfaceTypeDotContext optionClassOrInterfaceTypeDot() {
			return getRuleContext(OptionClassOrInterfaceTypeDotContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public OptionTypeArgumentsContext optionTypeArguments() {
			return getRuleContext(OptionTypeArgumentsContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_classType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			optionClassOrInterfaceTypeDot();
			setState(1552);
			annotations();
			setState(1553);
			match(IDENTIFIER);
			setState(1554);
			optionTypeArguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionClassOrInterfaceTypeDotContext extends ParserRuleContext {
		public ClassOrInterfaceTypeDotContext classOrInterfaceTypeDot() {
			return getRuleContext(ClassOrInterfaceTypeDotContext.class,0);
		}
		public OptionClassOrInterfaceTypeDotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionClassOrInterfaceTypeDot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionClassOrInterfaceTypeDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionClassOrInterfaceTypeDot(this);
		}
	}

	public final OptionClassOrInterfaceTypeDotContext optionClassOrInterfaceTypeDot() throws RecognitionException {
		OptionClassOrInterfaceTypeDotContext _localctx = new OptionClassOrInterfaceTypeDotContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_optionClassOrInterfaceTypeDot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(1556);
				classOrInterfaceTypeDot();
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

	public static class ClassOrInterfaceTypeDotContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ClassOrInterfaceTypeDotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceTypeDot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassOrInterfaceTypeDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassOrInterfaceTypeDot(this);
		}
	}

	public final ClassOrInterfaceTypeDotContext classOrInterfaceTypeDot() throws RecognitionException {
		ClassOrInterfaceTypeDotContext _localctx = new ClassOrInterfaceTypeDotContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_classOrInterfaceTypeDot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
			classOrInterfaceType();
			setState(1560);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceOrPrimitiveTypeContext classOrInterfaceOrPrimitiveType() {
			return getRuleContext(ClassOrInterfaceOrPrimitiveTypeContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_creator);
		try {
			setState(1571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1562);
				nonWildcardTypeArguments();
				setState(1563);
				classOrInterfaceOrPrimitiveType();
				setState(1564);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1566);
				classOrInterfaceOrPrimitiveType();
				setState(1569);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1567);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1568);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class ClassOrInterfaceOrPrimitiveTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceOrPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceOrPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassOrInterfaceOrPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassOrInterfaceOrPrimitiveType(this);
		}
	}

	public final ClassOrInterfaceOrPrimitiveTypeContext classOrInterfaceOrPrimitiveType() throws RecognitionException {
		ClassOrInterfaceOrPrimitiveTypeContext _localctx = new ClassOrInterfaceOrPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_classOrInterfaceOrPrimitiveType);
		try {
			setState(1575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1573);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1574);
				primitiveType();
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

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public OptionNonWildcardTypeArgumentsOrDiamondContext optionNonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(OptionNonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_innerCreator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			match(IDENTIFIER);
			setState(1578);
			optionNonWildcardTypeArgumentsOrDiamond();
			setState(1579);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionNonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public OptionNonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionNonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final OptionNonWildcardTypeArgumentsOrDiamondContext optionNonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		OptionNonWildcardTypeArgumentsOrDiamondContext _localctx = new OptionNonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_optionNonWildcardTypeArgumentsOrDiamond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1581);
				nonWildcardTypeArgumentsOrDiamond();
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public SquaresContext squares() {
			return getRuleContext(SquaresContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public RightSquaredExpressionContext rightSquaredExpression() {
			return getRuleContext(RightSquaredExpressionContext.class,0);
		}
		public SquaredExpressionsContext squaredExpressions() {
			return getRuleContext(SquaredExpressionsContext.class,0);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_arrayCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			match(LBRACK);
			setState(1593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1585);
				match(RBRACK);
				setState(1586);
				squares();
				setState(1587);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				{
				setState(1589);
				rightSquaredExpression();
				setState(1590);
				squaredExpressions();
				setState(1591);
				squares();
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

	public static class RightSquaredExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RightSquaredExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightSquaredExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterRightSquaredExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitRightSquaredExpression(this);
		}
	}

	public final RightSquaredExpressionContext rightSquaredExpression() throws RecognitionException {
		RightSquaredExpressionContext _localctx = new RightSquaredExpressionContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_rightSquaredExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
			expression(0);
			setState(1596);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SquaredExpressionsContext extends ParserRuleContext {
		public List<SquaredExpressionContext> squaredExpression() {
			return getRuleContexts(SquaredExpressionContext.class);
		}
		public SquaredExpressionContext squaredExpression(int i) {
			return getRuleContext(SquaredExpressionContext.class,i);
		}
		public SquaredExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_squaredExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSquaredExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSquaredExpressions(this);
		}
	}

	public final SquaredExpressionsContext squaredExpressions() throws RecognitionException {
		SquaredExpressionsContext _localctx = new SquaredExpressionsContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_squaredExpressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1601);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1598);
					squaredExpression();
					}
					} 
				}
				setState(1603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
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

	public static class RightAssocBinaryOperatorAndExpressionContext extends ParserRuleContext {
		public Token bop;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RightAssocBinaryOperatorAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightAssocBinaryOperatorAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterRightAssocBinaryOperatorAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitRightAssocBinaryOperatorAndExpression(this);
		}
	}

	public final RightAssocBinaryOperatorAndExpressionContext rightAssocBinaryOperatorAndExpression() throws RecognitionException {
		RightAssocBinaryOperatorAndExpressionContext _localctx = new RightAssocBinaryOperatorAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_rightAssocBinaryOperatorAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
			((RightAssocBinaryOperatorAndExpressionContext)_localctx).bop = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (ASSIGN - 70)) | (1L << (ADD_ASSIGN - 70)) | (1L << (SUB_ASSIGN - 70)) | (1L << (MUL_ASSIGN - 70)) | (1L << (DIV_ASSIGN - 70)) | (1L << (AND_ASSIGN - 70)) | (1L << (OR_ASSIGN - 70)) | (1L << (XOR_ASSIGN - 70)) | (1L << (MOD_ASSIGN - 70)) | (1L << (LSHIFT_ASSIGN - 70)) | (1L << (RSHIFT_ASSIGN - 70)) | (1L << (URSHIFT_ASSIGN - 70)))) != 0)) ) {
				((RightAssocBinaryOperatorAndExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1605);
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public OptionClassBodyContext optionClassBody() {
			return getRuleContext(OptionClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			arguments();
			setState(1608);
			optionClassBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			nonWildcardTypeArguments();
			setState(1611);
			explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public AngleContext angle() {
			return getRuleContext(AngleContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1613);
				angle();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1614);
				nonWildcardTypeArguments();
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

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			match(LT);
			setState(1618);
			typeList();
			setState(1619);
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

	public static class TypeListContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public CommaTypeTypesContext commaTypeTypes() {
			return getRuleContext(CommaTypeTypesContext.class,0);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_typeList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621);
			typeType();
			setState(1622);
			commaTypeTypes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommaTypeTypesContext extends ParserRuleContext {
		public List<CommaTypeTypeContext> commaTypeType() {
			return getRuleContexts(CommaTypeTypeContext.class);
		}
		public CommaTypeTypeContext commaTypeType(int i) {
			return getRuleContext(CommaTypeTypeContext.class,i);
		}
		public CommaTypeTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaTypeTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCommaTypeTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCommaTypeTypes(this);
		}
	}

	public final CommaTypeTypesContext commaTypeTypes() throws RecognitionException {
		CommaTypeTypesContext _localctx = new CommaTypeTypesContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_commaTypeTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1624);
				commaTypeType();
				}
				}
				setState(1629);
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

	public static class CommaTypeTypeContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public CommaTypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaTypeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCommaTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCommaTypeType(this);
		}
	}

	public final CommaTypeTypeContext commaTypeType() throws RecognitionException {
		CommaTypeTypeContext _localctx = new CommaTypeTypeContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_commaTypeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			match(COMMA);
			setState(1631);
			typeType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public OptionAnnotationContext optionAnnotation() {
			return getRuleContext(OptionAnnotationContext.class,0);
		}
		public ClassOrInterfaceOrPrimitiveTypeContext classOrInterfaceOrPrimitiveType() {
			return getRuleContext(ClassOrInterfaceOrPrimitiveTypeContext.class,0);
		}
		public SquaresContext squares() {
			return getRuleContext(SquaresContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_typeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			optionAnnotation();
			setState(1634);
			classOrInterfaceOrPrimitiveType();
			setState(1635);
			squares();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionAnnotationContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public OptionAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionAnnotation(this);
		}
	}

	public final OptionAnnotationContext optionAnnotation() throws RecognitionException {
		OptionAnnotationContext _localctx = new OptionAnnotationContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_optionAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1637);
				annotation();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JavaParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(JavaParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(JavaParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(JavaParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode LONG() { return getToken(JavaParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(JavaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public OptionNonEmptyTypeArgumentsContext optionNonEmptyTypeArguments() {
			return getRuleContext(OptionNonEmptyTypeArgumentsContext.class,0);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			match(LT);
			setState(1643);
			optionNonEmptyTypeArguments();
			setState(1644);
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

	public static class OptionNonEmptyTypeArgumentsContext extends ParserRuleContext {
		public NonEmptyTypeArgumentsContext nonEmptyTypeArguments() {
			return getRuleContext(NonEmptyTypeArgumentsContext.class,0);
		}
		public OptionNonEmptyTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionNonEmptyTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionNonEmptyTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionNonEmptyTypeArguments(this);
		}
	}

	public final OptionNonEmptyTypeArgumentsContext optionNonEmptyTypeArguments() throws RecognitionException {
		OptionNonEmptyTypeArgumentsContext _localctx = new OptionNonEmptyTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_optionNonEmptyTypeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (QUESTION - 75)) | (1L << (AT - 75)) | (1L << (IDENTIFIER - 75)))) != 0)) {
				{
				setState(1646);
				nonEmptyTypeArguments();
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

	public static class NonEmptyTypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentContext typeArgument() {
			return getRuleContext(TypeArgumentContext.class,0);
		}
		public OtherTypeArgumentsContext otherTypeArguments() {
			return getRuleContext(OtherTypeArgumentsContext.class,0);
		}
		public NonEmptyTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonEmptyTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNonEmptyTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNonEmptyTypeArguments(this);
		}
	}

	public final NonEmptyTypeArgumentsContext nonEmptyTypeArguments() throws RecognitionException {
		NonEmptyTypeArgumentsContext _localctx = new NonEmptyTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_nonEmptyTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			typeArgument();
			setState(1650);
			otherTypeArguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherTypeArgumentsContext extends ParserRuleContext {
		public List<AnotherTypeArgumentContext> anotherTypeArgument() {
			return getRuleContexts(AnotherTypeArgumentContext.class);
		}
		public AnotherTypeArgumentContext anotherTypeArgument(int i) {
			return getRuleContext(AnotherTypeArgumentContext.class,i);
		}
		public OtherTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOtherTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOtherTypeArguments(this);
		}
	}

	public final OtherTypeArgumentsContext otherTypeArguments() throws RecognitionException {
		OtherTypeArgumentsContext _localctx = new OtherTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_otherTypeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1652);
				anotherTypeArgument();
				}
				}
				setState(1657);
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

	public static class AnotherTypeArgumentContext extends ParserRuleContext {
		public TypeArgumentContext typeArgument() {
			return getRuleContext(TypeArgumentContext.class,0);
		}
		public AnotherTypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anotherTypeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnotherTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnotherTypeArgument(this);
		}
	}

	public final AnotherTypeArgumentContext anotherTypeArgument() throws RecognitionException {
		AnotherTypeArgumentContext _localctx = new AnotherTypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_anotherTypeArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1658);
			match(COMMA);
			setState(1659);
			typeArgument();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public CommaIdentifierOptionArgumentsContext commaIdentifierOptionArguments() {
			return getRuleContext(CommaIdentifierOptionArgumentsContext.class,0);
		}
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_superSuffix);
		try {
			setState(1663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1661);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1662);
				commaIdentifierOptionArguments();
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

	public static class CommaIdentifierOptionArgumentsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public OptionArgumentsContext optionArguments() {
			return getRuleContext(OptionArgumentsContext.class,0);
		}
		public CommaIdentifierOptionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaIdentifierOptionArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCommaIdentifierOptionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCommaIdentifierOptionArguments(this);
		}
	}

	public final CommaIdentifierOptionArgumentsContext commaIdentifierOptionArguments() throws RecognitionException {
		CommaIdentifierOptionArgumentsContext _localctx = new CommaIdentifierOptionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_commaIdentifierOptionArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			match(DOT);
			setState(1666);
			match(IDENTIFIER);
			setState(1667);
			optionArguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1669);
				match(SUPER);
				setState(1670);
				superSuffix();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1671);
				match(IDENTIFIER);
				setState(1672);
				arguments();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public OptionExpressionListContext optionExpressionList() {
			return getRuleContext(OptionExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675);
			match(LPAREN);
			setState(1676);
			optionExpressionList();
			setState(1677);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionStaticContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public OptionStaticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionStatic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionStatic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionStatic(this);
		}
	}

	public final OptionStaticContext optionStatic() throws RecognitionException {
		OptionStaticContext _localctx = new OptionStaticContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_optionStatic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1679);
				match(STATIC);
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

	public static class OptionDotStarContext extends ParserRuleContext {
		public DotStarContext dotStar() {
			return getRuleContext(DotStarContext.class,0);
		}
		public OptionDotStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionDotStar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionDotStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionDotStar(this);
		}
	}

	public final OptionDotStarContext optionDotStar() throws RecognitionException {
		OptionDotStarContext _localctx = new OptionDotStarContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_optionDotStar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1682);
				dotStar();
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

	public static class DotStarContext extends ParserRuleContext {
		public DotStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotStar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterDotStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitDotStar(this);
		}
	}

	public final DotStarContext dotStar() throws RecognitionException {
		DotStarContext _localctx = new DotStarContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_dotStar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			match(DOT);
			setState(1686);
			match(MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionCommaContext extends ParserRuleContext {
		public OptionCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionComma(this);
		}
	}

	public final OptionCommaContext optionComma() throws RecognitionException {
		OptionCommaContext _localctx = new OptionCommaContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_optionComma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1688);
				match(COMMA);
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

	public static class SquaresContext extends ParserRuleContext {
		public List<SquareContext> square() {
			return getRuleContexts(SquareContext.class);
		}
		public SquareContext square(int i) {
			return getRuleContext(SquareContext.class,i);
		}
		public SquaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_squares; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSquares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSquares(this);
		}
	}

	public final SquaresContext squares() throws RecognitionException {
		SquaresContext _localctx = new SquaresContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_squares);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1691);
					square();
					}
					} 
				}
				setState(1696);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
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

	public static class SquareContext extends ParserRuleContext {
		public SquareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_square; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSquare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSquare(this);
		}
	}

	public final SquareContext square() throws RecognitionException {
		SquareContext _localctx = new SquareContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_square);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1697);
			match(LBRACK);
			setState(1698);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionSemicolonContext extends ParserRuleContext {
		public OptionSemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionSemicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionSemicolon(this);
		}
	}

	public final OptionSemicolonContext optionSemicolon() throws RecognitionException {
		OptionSemicolonContext _localctx = new OptionSemicolonContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_optionSemicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1700);
				match(SEMI);
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

	public static class OptionIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public OptionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOptionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOptionIdentifier(this);
		}
	}

	public final OptionIdentifierContext optionIdentifier() throws RecognitionException {
		OptionIdentifierContext _localctx = new OptionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_optionIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1703);
				match(IDENTIFIER);
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

	public static class AngleContext extends ParserRuleContext {
		public AngleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAngle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAngle(this);
		}
	}

	public final AngleContext angle() throws RecognitionException {
		AngleContext _localctx = new AngleContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_angle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			match(LT);
			setState(1707);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 188:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 25);
		case 13:
			return precpred(_ctx, 24);
		case 14:
			return precpred(_ctx, 20);
		case 15:
			return precpred(_ctx, 13);
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3q\u06b0\4\2\t\2\4"+
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
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\3\2\3\2\3\2\3\2\3\2\3\3\5\3\u01f3\n\3\3\4\7\4\u01f6\n"+
		"\4\f\4\16\4\u01f9\13\4\3\5\7\5\u01fc\n\5\f\5\16\5\u01ff\13\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\7\7\u0207\n\7\f\7\16\7\u020a\13\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\5\t\u0217\n\t\3\t\5\t\u021a\n\t\3\n\7\n\u021d\n"+
		"\n\f\n\16\n\u0220\13\n\3\13\7\13\u0223\n\13\f\13\16\13\u0226\13\13\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u022d\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0237"+
		"\n\r\3\16\3\16\5\16\u023b\n\16\3\17\7\17\u023e\n\17\f\17\16\17\u0241\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\5\21\u024b\n\21\3\22\5\22"+
		"\u024e\n\22\3\23\3\23\3\23\3\24\5\24\u0254\n\24\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\7\27\u025f\n\27\f\27\16\27\u0262\13\27\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\32\5\32\u026c\n\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\7\35\u0275\n\35\f\35\16\35\u0278\13\35\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \5 \u0287\n \3!\5!\u028a"+
		"\n!\3\"\3\"\3\"\3#\7#\u0290\n#\f#\16#\u0293\13#\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3&\5&\u029e\n&\3\'\5\'\u02a1\n\'\3(\7(\u02a4\n(\f(\16(\u02a7\13(\3)"+
		"\3)\3)\3*\3*\3*\3*\3*\3*\3+\5+\u02b3\n+\3,\3,\3,\3-\3-\3-\3-\3.\3.\3."+
		"\3.\3/\7/\u02c1\n/\f/\16/\u02c4\13/\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u02cd\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02d8"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\5\63\u02e2\n\63\3\64\3\64"+
		"\3\64\3\65\3\65\5\65\u02e9\n\65\3\66\3\66\5\66\u02ed\n\66\3\67\3\67\3"+
		"\67\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3;\3;\3;\3;\5;\u0302\n;\3<\3<"+
		"\3<\3<\3<\3<\3<\5<\u030b\n<\3=\3=\3=\3=\3=\3>\7>\u0313\n>\f>\16>\u0316"+
		"\13>\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\5B\u032a\n"+
		"B\3C\3C\3C\3D\7D\u0330\nD\fD\16D\u0333\13D\3E\3E\3E\3E\3E\3E\5E\u033b"+
		"\nE\3F\3F\3F\3G\3G\3G\3H\7H\u0344\nH\fH\16H\u0347\13H\3I\3I\3I\3J\3J\3"+
		"J\3K\5K\u0350\nK\3L\3L\3L\3M\3M\3M\3N\3N\5N\u035a\nN\3O\3O\3O\3O\3P\5"+
		"P\u0361\nP\3Q\3Q\3Q\3Q\3R\7R\u0368\nR\fR\16R\u036b\13R\3S\3S\3S\3T\3T"+
		"\3T\3T\3U\5U\u0375\nU\3V\7V\u0378\nV\fV\16V\u037b\13V\3W\3W\3W\3W\3X\3"+
		"X\3X\5X\u0384\nX\3Y\3Y\5Y\u0388\nY\3Z\3Z\3Z\3[\7[\u038e\n[\f[\16[\u0391"+
		"\13[\3\\\3\\\3\\\3]\3]\3]\3]\3^\5^\u039b\n^\3_\3_\5_\u039f\n_\3`\3`\3"+
		"`\3`\3a\7a\u03a6\na\fa\16a\u03a9\13a\3b\3b\3b\3c\5c\u03af\nc\3d\3d\3d"+
		"\3e\3e\3e\3e\3f\3f\3f\3f\3f\3g\3g\3g\3h\7h\u03c1\nh\fh\16h\u03c4\13h\3"+
		"i\3i\3i\3j\3j\3j\3j\3j\3j\5j\u03cf\nj\3k\3k\3l\3l\3m\3m\3m\3m\3n\5n\u03da"+
		"\nn\3o\3o\3o\3o\3p\5p\u03e1\np\3q\3q\5q\u03e5\nq\3r\3r\3r\3s\7s\u03eb"+
		"\ns\fs\16s\u03ee\13s\3t\3t\3t\3u\3u\3u\3u\3v\3v\3v\5v\u03fa\nv\3w\3w\3"+
		"w\3w\3w\3x\7x\u0402\nx\fx\16x\u0405\13x\3y\3y\3y\3z\5z\u040b\nz\3{\3{"+
		"\3{\3|\3|\3|\3|\3|\3}\3}\3}\3}\3~\7~\u041a\n~\f~\16~\u041d\13~\3\177\3"+
		"\177\3\177\3\177\5\177\u0423\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\5\u0080\u0435\n\u0080\3\u0081\3\u0081\5\u0081\u0439\n"+
		"\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084"+
		"\5\u0084\u0443\n\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0087\7\u0087\u044d\n\u0087\f\u0087\16\u0087\u0450\13\u0087"+
		"\3\u0088\3\u0088\3\u0088\5\u0088\u0455\n\u0088\3\u0089\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\5\u008b\u0461"+
		"\n\u008b\3\u008b\5\u008b\u0464\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0477\n\u008c\3\u008d\3\u008d"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\5\u0093\u0499\n\u0093\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009e\5\u009e\u04c5\n\u009e\3\u009f\3\u009f\3\u009f"+
		"\3\u00a0\5\u00a0\u04cb\n\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a2\5\u00a2"+
		"\u04d1\n\u00a2\3\u00a3\7\u00a3\u04d4\n\u00a3\f\u00a3\16\u00a3\u04d7\13"+
		"\u00a3\3\u00a4\6\u00a4\u04da\n\u00a4\r\u00a4\16\u00a4\u04db\3\u00a5\7"+
		"\u00a5\u04df\n\u00a5\f\u00a5\16\u00a5\u04e2\13\u00a5\3\u00a6\5\u00a6\u04e5"+
		"\n\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00aa\7\u00aa\u04f6"+
		"\n\u00aa\f\u00aa\16\u00aa\u04f9\13\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00af\7\u00af\u050a\n\u00af\f\u00af\16\u00af\u050d\13\u00af"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u051e\n\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0523\n\u00b3\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u052c\n\u00b4\3\u00b5\5\u00b5"+
		"\u052f\n\u00b5\3\u00b6\5\u00b6\u0532\n\u00b6\3\u00b7\3\u00b7\5\u00b7\u0536"+
		"\n\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00bb\7\u00bb\u0546\n\u00bb"+
		"\f\u00bb\16\u00bb\u0549\13\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u055d\n\u00bd\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u056f\n\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0582"+
		"\n\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0589\n\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\5\u00be\u0595\n\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be"+
		"\u05bf\n\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\7\u00be\u05ce\n\u00be"+
		"\f\u00be\16\u00be\u05d1\13\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c6\5\u00c6\u05eb\n\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u05f8\n\u00c9"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00cb\7\u00cb\u05fe\n\u00cb\f\u00cb\16\u00cb"+
		"\u0601\13\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00cf\3\u00cf\5\u00cf\u0610\n\u00cf"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d1\5\u00d1\u0618\n\u00d1"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\5\u00d3\u0624\n\u00d3\5\u00d3\u0626\n\u00d3\3\u00d4\3\u00d4\5"+
		"\u00d4\u062a\n\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d6\5\u00d6\u0631"+
		"\n\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\5\u00d7\u063c\n\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d9\7\u00d9"+
		"\u0642\n\u00d9\f\u00d9\16\u00d9\u0645\13\u00d9\3\u00da\3\u00da\3\u00da"+
		"\3\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dd\3\u00dd\5\u00dd"+
		"\u0652\n\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00df\3\u00df\3\u00df"+
		"\3\u00e0\7\u00e0\u065c\n\u00e0\f\u00e0\16\u00e0\u065f\13\u00e0\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e3\5\u00e3\u0669"+
		"\n\u00e3\3\u00e4\3\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e6\5\u00e6"+
		"\u0672\n\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e8\7\u00e8\u0678\n\u00e8\f"+
		"\u00e8\16\u00e8\u067b\13\u00e8\3\u00e9\3\u00e9\3\u00e9\3\u00ea\3\u00ea"+
		"\5\u00ea\u0682\n\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\5\u00ec\u068c\n\u00ec\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ee\5\u00ee\u0693\n\u00ee\3\u00ef\5\u00ef\u0696\n\u00ef\3\u00f0\3"+
		"\u00f0\3\u00f0\3\u00f1\5\u00f1\u069c\n\u00f1\3\u00f2\7\u00f2\u069f\n\u00f2"+
		"\f\u00f2\16\u00f2\u06a2\13\u00f2\3\u00f3\3\u00f3\3\u00f3\3\u00f4\5\u00f4"+
		"\u06a8\n\u00f4\3\u00f5\5\u00f5\u06ab\n\u00f5\3\u00f6\3\u00f6\3\u00f6\3"+
		"\u00f6\2\3\u017a\u00f7\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116"+
		"\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e"+
		"\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146"+
		"\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e"+
		"\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176"+
		"\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e"+
		"\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6"+
		"\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be"+
		"\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6"+
		"\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\2\16\4\2"+
		"\23\23**\3\2\658\3\29:\3\2UX\3\2KL\4\2YZ^^\3\2WX\4\2IJPQ\4\2OORR\4\2H"+
		"H_i\3\2UV\n\2\5\5\7\7\n\n\20\20\26\26\35\35\37\37\'\'\2\u0688\2\u01ec"+
		"\3\2\2\2\4\u01f2\3\2\2\2\6\u01f7\3\2\2\2\b\u01fd\3\2\2\2\n\u0200\3\2\2"+
		"\2\f\u0208\3\2\2\2\16\u020b\3\2\2\2\20\u0219\3\2\2\2\22\u021e\3\2\2\2"+
		"\24\u0224\3\2\2\2\26\u022c\3\2\2\2\30\u0236\3\2\2\2\32\u023a\3\2\2\2\34"+
		"\u023f\3\2\2\2\36\u0242\3\2\2\2 \u024a\3\2\2\2\"\u024d\3\2\2\2$\u024f"+
		"\3\2\2\2&\u0253\3\2\2\2(\u0255\3\2\2\2*\u0258\3\2\2\2,\u0260\3\2\2\2."+
		"\u0263\3\2\2\2\60\u0266\3\2\2\2\62\u026b\3\2\2\2\64\u026d\3\2\2\2\66\u0270"+
		"\3\2\2\28\u0276\3\2\2\2:\u0279\3\2\2\2<\u027c\3\2\2\2>\u0286\3\2\2\2@"+
		"\u0289\3\2\2\2B\u028b\3\2\2\2D\u0291\3\2\2\2F\u0294\3\2\2\2H\u0297\3\2"+
		"\2\2J\u029d\3\2\2\2L\u02a0\3\2\2\2N\u02a5\3\2\2\2P\u02a8\3\2\2\2R\u02ab"+
		"\3\2\2\2T\u02b2\3\2\2\2V\u02b4\3\2\2\2X\u02b7\3\2\2\2Z\u02bb\3\2\2\2\\"+
		"\u02c2\3\2\2\2^\u02cc\3\2\2\2`\u02d7\3\2\2\2b\u02d9\3\2\2\2d\u02e1\3\2"+
		"\2\2f\u02e3\3\2\2\2h\u02e8\3\2\2\2j\u02ec\3\2\2\2l\u02ee\3\2\2\2n\u02f1"+
		"\3\2\2\2p\u02f4\3\2\2\2r\u02f9\3\2\2\2t\u0301\3\2\2\2v\u030a\3\2\2\2x"+
		"\u030c\3\2\2\2z\u0314\3\2\2\2|\u0317\3\2\2\2~\u031a\3\2\2\2\u0080\u031f"+
		"\3\2\2\2\u0082\u0329\3\2\2\2\u0084\u032b\3\2\2\2\u0086\u0331\3\2\2\2\u0088"+
		"\u033a\3\2\2\2\u008a\u033c\3\2\2\2\u008c\u033f\3\2\2\2\u008e\u0345\3\2"+
		"\2\2\u0090\u0348\3\2\2\2\u0092\u034b\3\2\2\2\u0094\u034f\3\2\2\2\u0096"+
		"\u0351\3\2\2\2\u0098\u0354\3\2\2\2\u009a\u0359\3\2\2\2\u009c\u035b\3\2"+
		"\2\2\u009e\u0360\3\2\2\2\u00a0\u0362\3\2\2\2\u00a2\u0369\3\2\2\2\u00a4"+
		"\u036c\3\2\2\2\u00a6\u036f\3\2\2\2\u00a8\u0374\3\2\2\2\u00aa\u0379\3\2"+
		"\2\2\u00ac\u037c\3\2\2\2\u00ae\u0383\3\2\2\2\u00b0\u0387\3\2\2\2\u00b2"+
		"\u0389\3\2\2\2\u00b4\u038f\3\2\2\2\u00b6\u0392\3\2\2\2\u00b8\u0395\3\2"+
		"\2\2\u00ba\u039a\3\2\2\2\u00bc\u039e\3\2\2\2\u00be\u03a0\3\2\2\2\u00c0"+
		"\u03a7\3\2\2\2\u00c2\u03aa\3\2\2\2\u00c4\u03ae\3\2\2\2\u00c6\u03b0\3\2"+
		"\2\2\u00c8\u03b3\3\2\2\2\u00ca\u03b7\3\2\2\2\u00cc\u03bc\3\2\2\2\u00ce"+
		"\u03c2\3\2\2\2\u00d0\u03c5\3\2\2\2\u00d2\u03ce\3\2\2\2\u00d4\u03d0\3\2"+
		"\2\2\u00d6\u03d2\3\2\2\2\u00d8\u03d4\3\2\2\2\u00da\u03d9\3\2\2\2\u00dc"+
		"\u03db\3\2\2\2\u00de\u03e0\3\2\2\2\u00e0\u03e4\3\2\2\2\u00e2\u03e6\3\2"+
		"\2\2\u00e4\u03ec\3\2\2\2\u00e6\u03ef\3\2\2\2\u00e8\u03f2\3\2\2\2\u00ea"+
		"\u03f9\3\2\2\2\u00ec\u03fb\3\2\2\2\u00ee\u0403\3\2\2\2\u00f0\u0406\3\2"+
		"\2\2\u00f2\u040a\3\2\2\2\u00f4\u040c\3\2\2\2\u00f6\u040f\3\2\2\2\u00f8"+
		"\u0414\3\2\2\2\u00fa\u041b\3\2\2\2\u00fc\u0422\3\2\2\2\u00fe\u0434\3\2"+
		"\2\2\u0100\u0438\3\2\2\2\u0102\u043a\3\2\2\2\u0104\u043f\3\2\2\2\u0106"+
		"\u0442\3\2\2\2\u0108\u0444\3\2\2\2\u010a\u0447\3\2\2\2\u010c\u044e\3\2"+
		"\2\2\u010e\u0454\3\2\2\2\u0110\u0456\3\2\2\2\u0112\u0459\3\2\2\2\u0114"+
		"\u0463\3\2\2\2\u0116\u0476\3\2\2\2\u0118\u0478\3\2\2\2\u011a\u047a\3\2"+
		"\2\2\u011c\u047f\3\2\2\2\u011e\u0484\3\2\2\2\u0120\u048a\3\2\2\2\u0122"+
		"\u048e\3\2\2\2\u0124\u0494\3\2\2\2\u0126\u049a\3\2\2\2\u0128\u04a0\3\2"+
		"\2\2\u012a\u04a6\3\2\2\2\u012c\u04aa\3\2\2\2\u012e\u04ae\3\2\2\2\u0130"+
		"\u04b2\3\2\2\2\u0132\u04b6\3\2\2\2\u0134\u04ba\3\2\2\2\u0136\u04bc\3\2"+
		"\2\2\u0138\u04bf\3\2\2\2\u013a\u04c4\3\2\2\2\u013c\u04c6\3\2\2\2\u013e"+
		"\u04ca\3\2\2\2\u0140\u04cc\3\2\2\2\u0142\u04d0\3\2\2\2\u0144\u04d5\3\2"+
		"\2\2\u0146\u04d9\3\2\2\2\u0148\u04e0\3\2\2\2\u014a\u04e4\3\2\2\2\u014c"+
		"\u04e6\3\2\2\2\u014e\u04e9\3\2\2\2\u0150\u04f1\3\2\2\2\u0152\u04f7\3\2"+
		"\2\2\u0154\u04fa\3\2\2\2\u0156\u04fd\3\2\2\2\u0158\u0500\3\2\2\2\u015a"+
		"\u0505\3\2\2\2\u015c\u050b\3\2\2\2\u015e\u050e\3\2\2\2\u0160\u0511\3\2"+
		"\2\2\u0162\u0517\3\2\2\2\u0164\u0522\3\2\2\2\u0166\u052b\3\2\2\2\u0168"+
		"\u052e\3\2\2\2\u016a\u0531\3\2\2\2\u016c\u0535\3\2\2\2\u016e\u0537\3\2"+
		"\2\2\u0170\u053d\3\2\2\2\u0172\u0541\3\2\2\2\u0174\u0547\3\2\2\2\u0176"+
		"\u054a\3\2\2\2\u0178\u055c\3\2\2\2\u017a\u0588\3\2\2\2\u017c\u05d2\3\2"+
		"\2\2\u017e\u05d5\3\2\2\2\u0180\u05d9\3\2\2\2\u0182\u05dc\3\2\2\2\u0184"+
		"\u05df\3\2\2\2\u0186\u05e2\3\2\2\2\u0188\u05e5\3\2\2\2\u018a\u05ea\3\2"+
		"\2\2\u018c\u05ec\3\2\2\2\u018e\u05f0\3\2\2\2\u0190\u05f7\3\2\2\2\u0192"+
		"\u05f9\3\2\2\2\u0194\u05ff\3\2\2\2\u0196\u0602\3\2\2\2\u0198\u0605\3\2"+
		"\2\2\u019a\u0609\3\2\2\2\u019c\u060f\3\2\2\2\u019e\u0611\3\2\2\2\u01a0"+
		"\u0617\3\2\2\2\u01a2\u0619\3\2\2\2\u01a4\u0625\3\2\2\2\u01a6\u0629\3\2"+
		"\2\2\u01a8\u062b\3\2\2\2\u01aa\u0630\3\2\2\2\u01ac\u0632\3\2\2\2\u01ae"+
		"\u063d\3\2\2\2\u01b0\u0643\3\2\2\2\u01b2\u0646\3\2\2\2\u01b4\u0649\3\2"+
		"\2\2\u01b6\u064c\3\2\2\2\u01b8\u0651\3\2\2\2\u01ba\u0653\3\2\2\2\u01bc"+
		"\u0657\3\2\2\2\u01be\u065d\3\2\2\2\u01c0\u0660\3\2\2\2\u01c2\u0663\3\2"+
		"\2\2\u01c4\u0668\3\2\2\2\u01c6\u066a\3\2\2\2\u01c8\u066c\3\2\2\2\u01ca"+
		"\u0671\3\2\2\2\u01cc\u0673\3\2\2\2\u01ce\u0679\3\2\2\2\u01d0\u067c\3\2"+
		"\2\2\u01d2\u0681\3\2\2\2\u01d4\u0683\3\2\2\2\u01d6\u068b\3\2\2\2\u01d8"+
		"\u068d\3\2\2\2\u01da\u0692\3\2\2\2\u01dc\u0695\3\2\2\2\u01de\u0697\3\2"+
		"\2\2\u01e0\u069b\3\2\2\2\u01e2\u06a0\3\2\2\2\u01e4\u06a3\3\2\2\2\u01e6"+
		"\u06a7\3\2\2\2\u01e8\u06aa\3\2\2\2\u01ea\u06ac\3\2\2\2\u01ec\u01ed\5\4"+
		"\3\2\u01ed\u01ee\5\6\4\2\u01ee\u01ef\5\b\5\2\u01ef\u01f0\7\2\2\3\u01f0"+
		"\3\3\2\2\2\u01f1\u01f3\5\n\6\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2"+
		"\u01f3\5\3\2\2\2\u01f4\u01f6\5\16\b\2\u01f5\u01f4\3\2\2\2\u01f6\u01f9"+
		"\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\7\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01fa\u01fc\5\20\t\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3"+
		"\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\t\3\2\2\2\u01ff\u01fd"+
		"\3\2\2\2\u0200\u0201\5\f\7\2\u0201\u0202\7\"\2\2\u0202\u0203\5\u00ccg"+
		"\2\u0203\u0204\7E\2\2\u0204\13\3\2\2\2\u0205\u0207\5\u00d8m\2\u0206\u0205"+
		"\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\r\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020c\7\33\2\2\u020c\u020d\5\u01da"+
		"\u00ee\2\u020d\u020e\5\u00ccg\2\u020e\u020f\5\u01dc\u00ef\2\u020f\u0210"+
		"\7E\2\2\u0210\17\3\2\2\2\u0211\u0216\5\22\n\2\u0212\u0217\5\36\20\2\u0213"+
		"\u0217\5<\37\2\u0214\u0217\5R*\2\u0215\u0217\5\u00f6|\2\u0216\u0212\3"+
		"\2\2\2\u0216\u0213\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0215\3\2\2\2\u0217"+
		"\u021a\3\2\2\2\u0218\u021a\7E\2\2\u0219\u0211\3\2\2\2\u0219\u0218\3\2"+
		"\2\2\u021a\21\3\2\2\2\u021b\u021d\5\30\r\2\u021c\u021b\3\2\2\2\u021d\u0220"+
		"\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\23\3\2\2\2\u0220"+
		"\u021e\3\2\2\2\u0221\u0223\5\26\f\2\u0222\u0221\3\2\2\2\u0223\u0226\3"+
		"\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\25\3\2\2\2\u0226"+
		"\u0224\3\2\2\2\u0227\u022d\5\30\r\2\u0228\u022d\7 \2\2\u0229\u022d\7,"+
		"\2\2\u022a\u022d\7\60\2\2\u022b\u022d\7\63\2\2\u022c\u0227\3\2\2\2\u022c"+
		"\u0228\3\2\2\2\u022c\u0229\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022b\3\2"+
		"\2\2\u022d\27\3\2\2\2\u022e\u0237\5\u00d8m\2\u022f\u0237\7%\2\2\u0230"+
		"\u0237\7$\2\2\u0231\u0237\7#\2\2\u0232\u0237\7(\2\2\u0233\u0237\7\3\2"+
		"\2\u0234\u0237\7\24\2\2\u0235\u0237\7)\2\2\u0236\u022e\3\2\2\2\u0236\u022f"+
		"\3\2\2\2\u0236\u0230\3\2\2\2\u0236\u0231\3\2\2\2\u0236\u0232\3\2\2\2\u0236"+
		"\u0233\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0235\3\2\2\2\u0237\31\3\2\2"+
		"\2\u0238\u023b\7\24\2\2\u0239\u023b\5\u00d8m\2\u023a\u0238\3\2\2\2\u023a"+
		"\u0239\3\2\2\2\u023b\33\3\2\2\2\u023c\u023e\5\32\16\2\u023d\u023c\3\2"+
		"\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\35\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0243\7\13\2\2\u0243\u0244\7q\2"+
		"\2\u0244\u0245\5 \21\2\u0245\u0246\5\"\22\2\u0246\u0247\5&\24\2\u0247"+
		"\u0248\5X-\2\u0248\37\3\2\2\2\u0249\u024b\5*\26\2\u024a\u0249\3\2\2\2"+
		"\u024a\u024b\3\2\2\2\u024b!\3\2\2\2\u024c\u024e\5$\23\2\u024d\u024c\3"+
		"\2\2\2\u024d\u024e\3\2\2\2\u024e#\3\2\2\2\u024f\u0250\7\23\2\2\u0250\u0251"+
		"\5\u01c2\u00e2\2\u0251%\3\2\2\2\u0252\u0254\5(\25\2\u0253\u0252\3\2\2"+
		"\2\u0253\u0254\3\2\2\2\u0254\'\3\2\2\2\u0255\u0256\7\32\2\2\u0256\u0257"+
		"\5\u01bc\u00df\2\u0257)\3\2\2\2\u0258\u0259\7J\2\2\u0259\u025a\5\60\31"+
		"\2\u025a\u025b\5,\27\2\u025b\u025c\7I\2\2\u025c+\3\2\2\2\u025d\u025f\5"+
		".\30\2\u025e\u025d\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261-\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0264\7F\2\2\u0264"+
		"\u0265\5\60\31\2\u0265/\3\2\2\2\u0266\u0267\5\f\7\2\u0267\u0268\7q\2\2"+
		"\u0268\u0269\5\"\22\2\u0269\61\3\2\2\2\u026a\u026c\5\64\33\2\u026b\u026a"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c\63\3\2\2\2\u026d\u026e\7\23\2\2\u026e"+
		"\u026f\5\66\34\2\u026f\65\3\2\2\2\u0270\u0271\5\u01c2\u00e2\2\u0271\u0272"+
		"\58\35\2\u0272\67\3\2\2\2\u0273\u0275\5:\36\2\u0274\u0273\3\2\2\2\u0275"+
		"\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u02779\3\2\2\2"+
		"\u0278\u0276\3\2\2\2\u0279\u027a\7[\2\2\u027a\u027b\5\u01c2\u00e2\2\u027b"+
		";\3\2\2\2\u027c\u027d\7\22\2\2\u027d\u027e\7q\2\2\u027e\u027f\5&\24\2"+
		"\u027f\u0280\7A\2\2\u0280\u0281\5> \2\u0281\u0282\5\u01e0\u00f1\2\u0282"+
		"\u0283\5@!\2\u0283\u0284\7B\2\2\u0284=\3\2\2\2\u0285\u0287\5B\"\2\u0286"+
		"\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287?\3\2\2\2\u0288\u028a\5P)\2\u0289"+
		"\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028aA\3\2\2\2\u028b\u028c\5H%\2\u028c"+
		"\u028d\5D#\2\u028dC\3\2\2\2\u028e\u0290\5F$\2\u028f\u028e\3\2\2\2\u0290"+
		"\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292E\3\2\2\2"+
		"\u0293\u0291\3\2\2\2\u0294\u0295\7F\2\2\u0295\u0296\5H%\2\u0296G\3\2\2"+
		"\2\u0297\u0298\5\f\7\2\u0298\u0299\7q\2\2\u0299\u029a\5J&\2\u029a\u029b"+
		"\5L\'\2\u029bI\3\2\2\2\u029c\u029e\5\u01d8\u00ed\2\u029d\u029c\3\2\2\2"+
		"\u029d\u029e\3\2\2\2\u029eK\3\2\2\2\u029f\u02a1\5X-\2\u02a0\u029f\3\2"+
		"\2\2\u02a0\u02a1\3\2\2\2\u02a1M\3\2\2\2\u02a2\u02a4\5^\60\2\u02a3\u02a2"+
		"\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"O\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02a9\7E\2\2\u02a9\u02aa\5N(\2\u02aa"+
		"Q\3\2\2\2\u02ab\u02ac\7\36\2\2\u02ac\u02ad\7q\2\2\u02ad\u02ae\5 \21\2"+
		"\u02ae\u02af\5T+\2\u02af\u02b0\5Z.\2\u02b0S\3\2\2\2\u02b1\u02b3\5V,\2"+
		"\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3U\3\2\2\2\u02b4\u02b5\7"+
		"\23\2\2\u02b5\u02b6\5\u01bc\u00df\2\u02b6W\3\2\2\2\u02b7\u02b8\7A\2\2"+
		"\u02b8\u02b9\5N(\2\u02b9\u02ba\7B\2\2\u02baY\3\2\2\2\u02bb\u02bc\7A\2"+
		"\2\u02bc\u02bd\5\\/\2\u02bd\u02be\7B\2\2\u02be[\3\2\2\2\u02bf\u02c1\5"+
		"t;\2\u02c0\u02bf\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3]\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02cd\7E\2\2\u02c6"+
		"\u02c7\5\u01da\u00ee\2\u02c7\u02c8\5\u010a\u0086\2\u02c8\u02cd\3\2\2\2"+
		"\u02c9\u02ca\5\24\13\2\u02ca\u02cb\5`\61\2\u02cb\u02cd\3\2\2\2\u02cc\u02c5"+
		"\3\2\2\2\u02cc\u02c6\3\2\2\2\u02cc\u02c9\3\2\2\2\u02cd_\3\2\2\2\u02ce"+
		"\u02d8\5b\62\2\u02cf\u02d8\5l\67\2\u02d0\u02d8\5r:\2\u02d1\u02d8\5p9\2"+
		"\u02d2\u02d8\5n8\2\u02d3\u02d8\5R*\2\u02d4\u02d8\5\u00f6|\2\u02d5\u02d8"+
		"\5\36\20\2\u02d6\u02d8\5<\37\2\u02d7\u02ce\3\2\2\2\u02d7\u02cf\3\2\2\2"+
		"\u02d7\u02d0\3\2\2\2\u02d7\u02d1\3\2\2\2\u02d7\u02d2\3\2\2\2\u02d7\u02d3"+
		"\3\2\2\2\u02d7\u02d4\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d6\3\2\2\2\u02d8"+
		"a\3\2\2\2\u02d9\u02da\5j\66\2\u02da\u02db\7q\2\2\u02db\u02dc\5\u00b8]"+
		"\2\u02dc\u02dd\5\u01e2\u00f2\2\u02dd\u02de\5d\63\2\u02de\u02df\5h\65\2"+
		"\u02dfc\3\2\2\2\u02e0\u02e2\5f\64\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2\3"+
		"\2\2\2\u02e2e\3\2\2\2\u02e3\u02e4\7/\2\2\u02e4\u02e5\5\u00b2Z\2\u02e5"+
		"g\3\2\2\2\u02e6\u02e9\5\u010a\u0086\2\u02e7\u02e9\7E\2\2\u02e8\u02e6\3"+
		"\2\2\2\u02e8\u02e7\3\2\2\2\u02e9i\3\2\2\2\u02ea\u02ed\5\u01c2\u00e2\2"+
		"\u02eb\u02ed\7\62\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02eb\3\2\2\2\u02edk\3"+
		"\2\2\2\u02ee\u02ef\5*\26\2\u02ef\u02f0\5b\62\2\u02f0m\3\2\2\2\u02f1\u02f2"+
		"\5*\26\2\u02f2\u02f3\5p9\2\u02f3o\3\2\2\2\u02f4\u02f5\7q\2\2\u02f5\u02f6"+
		"\5\u00b8]\2\u02f6\u02f7\5d\63\2\u02f7\u02f8\5\u010a\u0086\2\u02f8q\3\2"+
		"\2\2\u02f9\u02fa\5\u01c2\u00e2\2\u02fa\u02fb\5\u008cG\2\u02fb\u02fc\7"+
		"E\2\2\u02fcs\3\2\2\2\u02fd\u02fe\5\24\13\2\u02fe\u02ff\5v<\2\u02ff\u0302"+
		"\3\2\2\2\u0300\u0302\7E\2\2\u0301\u02fd\3\2\2\2\u0301\u0300\3\2\2\2\u0302"+
		"u\3\2\2\2\u0303\u030b\5x=\2\u0304\u030b\5\u0080A\2\u0305\u030b\5\u008a"+
		"F\2\u0306\u030b\5R*\2\u0307\u030b\5\u00f6|\2\u0308\u030b\5\36\20\2\u0309"+
		"\u030b\5<\37\2\u030a\u0303\3\2\2\2\u030a\u0304\3\2\2\2\u030a\u0305\3\2"+
		"\2\2\u030a\u0306\3\2\2\2\u030a\u0307\3\2\2\2\u030a\u0308\3\2\2\2\u030a"+
		"\u0309\3\2\2\2\u030bw\3\2\2\2\u030c\u030d\5\u01c2\u00e2\2\u030d\u030e"+
		"\5~@\2\u030e\u030f\5z>\2\u030f\u0310\7E\2\2\u0310y\3\2\2\2\u0311\u0313"+
		"\5|?\2\u0312\u0311\3\2\2\2\u0313\u0316\3\2\2\2\u0314\u0312\3\2\2\2\u0314"+
		"\u0315\3\2\2\2\u0315{\3\2\2\2\u0316\u0314\3\2\2\2\u0317\u0318\7F\2\2\u0318"+
		"\u0319\5~@\2\u0319}\3\2\2\2\u031a\u031b\7q\2\2\u031b\u031c\5\u01e2\u00f2"+
		"\2\u031c\u031d\7H\2\2\u031d\u031e\5\u009aN\2\u031e\177\3\2\2\2\u031f\u0320"+
		"\5\u0086D\2\u0320\u0321\5\u0082B\2\u0321\u0322\5j\66\2\u0322\u0323\7q"+
		"\2\2\u0323\u0324\5\u00b8]\2\u0324\u0325\5\u01e2\u00f2\2\u0325\u0326\5"+
		"d\63\2\u0326\u0327\5h\65\2\u0327\u0081\3\2\2\2\u0328\u032a\5\u0084C\2"+
		"\u0329\u0328\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u0083\3\2\2\2\u032b\u032c"+
		"\5*\26\2\u032c\u032d\5\f\7\2\u032d\u0085\3\2\2\2\u032e\u0330\5\u0088E"+
		"\2\u032f\u032e\3\2\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0332"+
		"\3\2\2\2\u0332\u0087\3\2\2\2\u0333\u0331\3\2\2\2\u0334\u033b\5\u00d8m"+
		"\2\u0335\u033b\7%\2\2\u0336\u033b\7\3\2\2\u0337\u033b\7\16\2\2\u0338\u033b"+
		"\7(\2\2\u0339\u033b\7)\2\2\u033a\u0334\3\2\2\2\u033a\u0335\3\2\2\2\u033a"+
		"\u0336\3\2\2\2\u033a\u0337\3\2\2\2\u033a\u0338\3\2\2\2\u033a\u0339\3\2"+
		"\2\2\u033b\u0089\3\2\2\2\u033c\u033d\5*\26\2\u033d\u033e\5\u0080A\2\u033e"+
		"\u008b\3\2\2\2\u033f\u0340\5\u0092J\2\u0340\u0341\5\u008eH\2\u0341\u008d"+
		"\3\2\2\2\u0342\u0344\5\u0090I\2\u0343\u0342\3\2\2\2\u0344\u0347\3\2\2"+
		"\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u008f\3\2\2\2\u0347\u0345"+
		"\3\2\2\2\u0348\u0349\7F\2\2\u0349\u034a\5\u0092J\2\u034a\u0091\3\2\2\2"+
		"\u034b\u034c\5\u0098M\2\u034c\u034d\5\u0094K\2\u034d\u0093\3\2\2\2\u034e"+
		"\u0350\5\u0096L\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0095"+
		"\3\2\2\2\u0351\u0352\7H\2\2\u0352\u0353\5\u009aN\2\u0353\u0097\3\2\2\2"+
		"\u0354\u0355\7q\2\2\u0355\u0356\5\u01e2\u00f2\2\u0356\u0099\3\2\2\2\u0357"+
		"\u035a\5\u009cO\2\u0358\u035a\5\u017a\u00be\2\u0359\u0357\3\2\2\2\u0359"+
		"\u0358\3\2\2\2\u035a\u009b\3\2\2\2\u035b\u035c\7A\2\2\u035c\u035d\5\u009e"+
		"P\2\u035d\u035e\7B\2\2\u035e\u009d\3\2\2\2\u035f\u0361\5\u00a0Q\2\u0360"+
		"\u035f\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u009f\3\2\2\2\u0362\u0363\5\u009a"+
		"N\2\u0363\u0364\5\u00a2R\2\u0364\u0365\5\u01e0\u00f1\2\u0365\u00a1\3\2"+
		"\2\2\u0366\u0368\5\u00a4S\2\u0367\u0366\3\2\2\2\u0368\u036b\3\2\2\2\u0369"+
		"\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u00a3\3\2\2\2\u036b\u0369\3\2"+
		"\2\2\u036c\u036d\7F\2\2\u036d\u036e\5\u009aN\2\u036e\u00a5\3\2\2\2\u036f"+
		"\u0370\7q\2\2\u0370\u0371\5\u00a8U\2\u0371\u0372\5\u00aaV\2\u0372\u00a7"+
		"\3\2\2\2\u0373\u0375\5\u01c8\u00e5\2\u0374\u0373\3\2\2\2\u0374\u0375\3"+
		"\2\2\2\u0375\u00a9\3\2\2\2\u0376\u0378\5\u00acW\2\u0377\u0376\3\2\2\2"+
		"\u0378\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u00ab"+
		"\3\2\2\2\u037b\u0379\3\2\2\2\u037c\u037d\7G\2\2\u037d\u037e\7q\2\2\u037e"+
		"\u037f\5\u00a8U\2\u037f\u00ad\3\2\2\2\u0380\u0384\5\u01c2\u00e2\2\u0381"+
		"\u0382\7M\2\2\u0382\u0384\5\u00b0Y\2\u0383\u0380\3\2\2\2\u0383\u0381\3"+
		"\2\2\2\u0384\u00af\3\2\2\2\u0385\u0386\t\2\2\2\u0386\u0388\5\u01c2\u00e2"+
		"\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u00b1\3\2\2\2\u0389\u038a"+
		"\5\u00ccg\2\u038a\u038b\5\u00b4[\2\u038b\u00b3\3\2\2\2\u038c\u038e\5\u00b6"+
		"\\\2\u038d\u038c\3\2\2\2\u038e\u0391\3\2\2\2\u038f\u038d\3\2\2\2\u038f"+
		"\u0390\3\2\2\2\u0390\u00b5\3\2\2\2\u0391\u038f\3\2\2\2\u0392\u0393\7F"+
		"\2\2\u0393\u0394\5\u00ccg\2\u0394\u00b7\3\2\2\2\u0395\u0396\7?\2\2\u0396"+
		"\u0397\5\u00ba^\2\u0397\u0398\7@\2\2\u0398\u00b9\3\2\2\2\u0399\u039b\5"+
		"\u00bc_\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u00bb\3\2\2\2"+
		"\u039c\u039f\5\u00be`\2\u039d\u039f\5\u00caf\2\u039e\u039c\3\2\2\2\u039e"+
		"\u039d\3\2\2\2\u039f\u00bd\3\2\2\2\u03a0\u03a1\5\u00c8e\2\u03a1\u03a2"+
		"\5\u00c0a\2\u03a2\u03a3\5\u00c4c\2\u03a3\u00bf\3\2\2\2\u03a4\u03a6\5\u00c2"+
		"b\2\u03a5\u03a4\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7"+
		"\u03a8\3\2\2\2\u03a8\u00c1\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03ab\7F"+
		"\2\2\u03ab\u03ac\5\u00c8e\2\u03ac\u00c3\3\2\2\2\u03ad\u03af\5\u00c6d\2"+
		"\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u00c5\3\2\2\2\u03b0\u03b1"+
		"\7F\2\2\u03b1\u03b2\5\u00caf\2\u03b2\u00c7\3\2\2\2\u03b3\u03b4\5\34\17"+
		"\2\u03b4\u03b5\5\u01c2\u00e2\2\u03b5\u03b6\5\u0098M\2\u03b6\u00c9\3\2"+
		"\2\2\u03b7\u03b8\5\34\17\2\u03b8\u03b9\5\u01c2\u00e2\2\u03b9\u03ba\7m"+
		"\2\2\u03ba\u03bb\5\u0098M\2\u03bb\u00cb\3\2\2\2\u03bc\u03bd\7q\2\2\u03bd"+
		"\u03be\5\u00ceh\2\u03be\u00cd\3\2\2\2\u03bf\u03c1\5\u00d0i\2\u03c0\u03bf"+
		"\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3"+
		"\u00cf\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c5\u03c6\7G\2\2\u03c6\u03c7\7q\2"+
		"\2\u03c7\u00d1\3\2\2\2\u03c8\u03cf\5\u00d4k\2\u03c9\u03cf\5\u00d6l\2\u03ca"+
		"\u03cf\7<\2\2\u03cb\u03cf\7=\2\2\u03cc\u03cf\7;\2\2\u03cd\u03cf\7>\2\2"+
		"\u03ce\u03c8\3\2\2\2\u03ce\u03c9\3\2\2\2\u03ce\u03ca\3\2\2\2\u03ce\u03cb"+
		"\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cd\3\2\2\2\u03cf\u00d3\3\2\2\2\u03d0"+
		"\u03d1\t\3\2\2\u03d1\u00d5\3\2\2\2\u03d2\u03d3\t\4\2\2\u03d3\u00d7\3\2"+
		"\2\2\u03d4\u03d5\7l\2\2\u03d5\u03d6\5\u00ccg\2\u03d6\u03d7\5\u00dan\2"+
		"\u03d7\u00d9\3\2\2\2\u03d8\u03da\5\u00dco\2\u03d9\u03d8\3\2\2\2\u03d9"+
		"\u03da\3\2\2\2\u03da\u00db\3\2\2\2\u03db\u03dc\7?\2\2\u03dc\u03dd\5\u00de"+
		"p\2\u03dd\u03de\7@\2\2\u03de\u00dd\3\2\2\2\u03df\u03e1\5\u00e0q\2\u03e0"+
		"\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u00df\3\2\2\2\u03e2\u03e5\5\u00e2"+
		"r\2\u03e3\u03e5\5\u00eav\2\u03e4\u03e2\3\2\2\2\u03e4\u03e3\3\2\2\2\u03e5"+
		"\u00e1\3\2\2\2\u03e6\u03e7\5\u00e8u\2\u03e7\u03e8\5\u00e4s\2\u03e8\u00e3"+
		"\3\2\2\2\u03e9\u03eb\5\u00e6t\2\u03ea\u03e9\3\2\2\2\u03eb\u03ee\3\2\2"+
		"\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u00e5\3\2\2\2\u03ee\u03ec"+
		"\3\2\2\2\u03ef\u03f0\7F\2\2\u03f0\u03f1\5\u00e8u\2\u03f1\u00e7\3\2\2\2"+
		"\u03f2\u03f3\7q\2\2\u03f3\u03f4\7H\2\2\u03f4\u03f5\5\u00eav\2\u03f5\u00e9"+
		"\3\2\2\2\u03f6\u03fa\5\u017a\u00be\2\u03f7\u03fa\5\u00d8m\2\u03f8\u03fa"+
		"\5\u00ecw\2\u03f9\u03f6\3\2\2\2\u03f9\u03f7\3\2\2\2\u03f9\u03f8\3\2\2"+
		"\2\u03fa\u00eb\3\2\2\2\u03fb\u03fc\7A\2\2\u03fc\u03fd\5\u00f2z\2\u03fd"+
		"\u03fe\5\u01e0\u00f1\2\u03fe\u03ff\7B\2\2\u03ff\u00ed\3\2\2\2\u0400\u0402"+
		"\5\u00f0y\2\u0401\u0400\3\2\2\2\u0402\u0405\3\2\2\2\u0403\u0401\3\2\2"+
		"\2\u0403\u0404\3\2\2\2\u0404\u00ef\3\2\2\2\u0405\u0403\3\2\2\2\u0406\u0407"+
		"\7F\2\2\u0407\u0408\5\u00eav\2\u0408\u00f1\3\2\2\2\u0409\u040b\5\u00f4"+
		"{\2\u040a\u0409\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u00f3\3\2\2\2\u040c"+
		"\u040d\5\u00eav\2\u040d\u040e\5\u00eex\2\u040e\u00f5\3\2\2\2\u040f\u0410"+
		"\7l\2\2\u0410\u0411\7\36\2\2\u0411\u0412\7q\2\2\u0412\u0413\5\u00f8}\2"+
		"\u0413\u00f7\3\2\2\2\u0414\u0415\7A\2\2\u0415\u0416\5\u00fa~\2\u0416\u0417"+
		"\7B\2\2\u0417\u00f9\3\2\2\2\u0418\u041a\5\u00fc\177\2\u0419\u0418\3\2"+
		"\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2\2\2\u041b\u041c\3\2\2\2\u041c"+
		"\u00fb\3\2\2\2\u041d\u041b\3\2\2\2\u041e\u041f\5\24\13\2\u041f\u0420\5"+
		"\u00fe\u0080\2\u0420\u0423\3\2\2\2\u0421\u0423\7E\2\2\u0422\u041e\3\2"+
		"\2\2\u0422\u0421\3\2\2\2\u0423\u00fd\3\2\2\2\u0424\u0425\5\u01c2\u00e2"+
		"\2\u0425\u0426\5\u0100\u0081\2\u0426\u0427\7E\2\2\u0427\u0435\3\2\2\2"+
		"\u0428\u0429\5\36\20\2\u0429\u042a\5\u01e6\u00f4\2\u042a\u0435\3\2\2\2"+
		"\u042b\u042c\5R*\2\u042c\u042d\5\u01e6\u00f4\2\u042d\u0435\3\2\2\2\u042e"+
		"\u042f\5<\37\2\u042f\u0430\5\u01e6\u00f4\2\u0430\u0435\3\2\2\2\u0431\u0432"+
		"\5\u00f6|\2\u0432\u0433\5\u01e6\u00f4\2\u0433\u0435\3\2\2\2\u0434\u0424"+
		"\3\2\2\2\u0434\u0428\3\2\2\2\u0434\u042b\3\2\2\2\u0434\u042e\3\2\2\2\u0434"+
		"\u0431\3\2\2\2\u0435\u00ff\3\2\2\2\u0436\u0439\5\u0102\u0082\2\u0437\u0439"+
		"\5\u0104\u0083\2\u0438\u0436\3\2\2\2\u0438\u0437\3\2\2\2\u0439\u0101\3"+
		"\2\2\2\u043a\u043b\7q\2\2\u043b\u043c\7?\2\2\u043c\u043d\7@\2\2\u043d"+
		"\u043e\5\u0106\u0084\2\u043e\u0103\3\2\2\2\u043f\u0440\5\u008cG\2\u0440"+
		"\u0105\3\2\2\2\u0441\u0443\5\u0108\u0085\2\u0442\u0441\3\2\2\2\u0442\u0443"+
		"\3\2\2\2\u0443\u0107\3\2\2\2\u0444\u0445\7\16\2\2\u0445\u0446\5\u00ea"+
		"v\2\u0446\u0109\3\2\2\2\u0447\u0448\7A\2\2\u0448\u0449\5\u010c\u0087\2"+
		"\u0449\u044a\7B\2\2\u044a\u010b\3\2\2\2\u044b\u044d\5\u010e\u0088\2\u044c"+
		"\u044b\3\2\2\2\u044d\u0450\3\2\2\2\u044e\u044c\3\2\2\2\u044e\u044f\3\2"+
		"\2\2\u044f\u010d\3\2\2\2\u0450\u044e\3\2\2\2\u0451\u0455\5\u0110\u0089"+
		"\2\u0452\u0455\5\u0116\u008c\2\u0453\u0455\5\u0114\u008b\2\u0454\u0451"+
		"\3\2\2\2\u0454\u0452\3\2\2\2\u0454\u0453\3\2\2\2\u0455\u010f\3\2\2\2\u0456"+
		"\u0457\5\u0112\u008a\2\u0457\u0458\7E\2\2\u0458\u0111\3\2\2\2\u0459\u045a"+
		"\5\34\17\2\u045a\u045b\5\u01c2\u00e2\2\u045b\u045c\5\u008cG\2\u045c\u0113"+
		"\3\2\2\2\u045d\u0460\5\22\n\2\u045e\u0461\5\36\20\2\u045f\u0461\5R*\2"+
		"\u0460\u045e\3\2\2\2\u0460\u045f\3\2\2\2\u0461\u0464\3\2\2\2\u0462\u0464"+
		"\7E\2\2\u0463\u045d\3\2\2\2\u0463\u0462\3\2\2\2\u0464\u0115\3\2\2\2\u0465"+
		"\u0477\5\u0118\u008d\2\u0466\u0477\5\u011a\u008e\2\u0467\u0477\5\u011c"+
		"\u008f\2\u0468\u0477\5\u011e\u0090\2\u0469\u0477\5\u0120\u0091\2\u046a"+
		"\u0477\5\u0122\u0092\2\u046b\u0477\5\u0124\u0093\2\u046c\u0477\5\u0126"+
		"\u0094\2\u046d\u0477\5\u0128\u0095\2\u046e\u0477\5\u012a\u0096\2\u046f"+
		"\u0477\5\u012c\u0097\2\u0470\u0477\5\u012e\u0098\2\u0471\u0477\5\u0130"+
		"\u0099\2\u0472\u0477\5\u0132\u009a\2\u0473\u0477\5\u0134\u009b\2\u0474"+
		"\u0477\5\u0136\u009c\2\u0475\u0477\5\u0138\u009d\2\u0476\u0465\3\2\2\2"+
		"\u0476\u0466\3\2\2\2\u0476\u0467\3\2\2\2\u0476\u0468\3\2\2\2\u0476\u0469"+
		"\3\2\2\2\u0476\u046a\3\2\2\2\u0476\u046b\3\2\2\2\u0476\u046c\3\2\2\2\u0476"+
		"\u046d\3\2\2\2\u0476\u046e\3\2\2\2\u0476\u046f\3\2\2\2\u0476\u0470\3\2"+
		"\2\2\u0476\u0471\3\2\2\2\u0476\u0472\3\2\2\2\u0476\u0473\3\2\2\2\u0476"+
		"\u0474\3\2\2\2\u0476\u0475\3\2\2\2\u0477\u0117\3\2\2\2\u0478\u0479\5\u010a"+
		"\u0086\2\u0479\u0119\3\2\2\2\u047a\u047b\7\4\2\2\u047b\u047c\5\u017a\u00be"+
		"\2\u047c\u047d\5\u013a\u009e\2\u047d\u047e\7E\2\2\u047e\u011b\3\2\2\2"+
		"\u047f\u0480\7\30\2\2\u0480\u0481\5\u0170\u00b9\2\u0481\u0482\5\u0116"+
		"\u008c\2\u0482\u0483\5\u013e\u00a0\2\u0483\u011d\3\2\2\2\u0484\u0485\7"+
		"\27\2\2\u0485\u0486\7?\2\2\u0486\u0487\5\u0166\u00b4\2\u0487\u0488\7@"+
		"\2\2\u0488\u0489\5\u0116\u008c\2\u0489\u011f\3\2\2\2\u048a\u048b\7\64"+
		"\2\2\u048b\u048c\5\u0170\u00b9\2\u048c\u048d\5\u0116\u008c\2\u048d\u0121"+
		"\3\2\2\2\u048e\u048f\7\17\2\2\u048f\u0490\5\u0116\u008c\2\u0490\u0491"+
		"\7\64\2\2\u0491\u0492\5\u0170\u00b9\2\u0492\u0493\7E\2\2\u0493\u0123\3"+
		"\2\2\2\u0494\u0495\7\61\2\2\u0495\u0498\5\u010a\u0086\2\u0496\u0499\5"+
		"\u014c\u00a7\2\u0497\u0499\5\u0156\u00ac\2\u0498\u0496\3\2\2\2\u0498\u0497"+
		"\3\2\2\2\u0499\u0125\3\2\2\2\u049a\u049b\7\61\2\2\u049b\u049c\5\u0158"+
		"\u00ad\2\u049c\u049d\5\u010a\u0086\2\u049d\u049e\5\u0148\u00a5\2\u049e"+
		"\u049f\5\u0142\u00a2\2\u049f\u0127\3\2\2\2\u04a0\u04a1\7+\2\2\u04a1\u04a2"+
		"\5\u0170\u00b9\2\u04a2\u04a3\7A\2\2\u04a3\u04a4\5\u0144\u00a3\2\u04a4"+
		"\u04a5\7B\2\2\u04a5\u0129\3\2\2\2\u04a6\u04a7\7,\2\2\u04a7\u04a8\5\u0170"+
		"\u00b9\2\u04a8\u04a9\5\u010a\u0086\2\u04a9\u012b\3\2\2\2\u04aa\u04ab\7"+
		"&\2\2\u04ab\u04ac\5\u014a\u00a6\2\u04ac\u04ad\7E\2\2\u04ad\u012d\3\2\2"+
		"\2\u04ae\u04af\7.\2\2\u04af\u04b0\5\u017a\u00be\2\u04b0\u04b1\7E\2\2\u04b1"+
		"\u012f\3\2\2\2\u04b2\u04b3\7\6\2\2\u04b3\u04b4\5\u01e8\u00f5\2\u04b4\u04b5"+
		"\7E\2\2\u04b5\u0131\3\2\2\2\u04b6\u04b7\7\r\2\2\u04b7\u04b8\5\u01e8\u00f5"+
		"\2\u04b8\u04b9\7E\2\2\u04b9\u0133\3\2\2\2\u04ba\u04bb\7E\2\2\u04bb\u0135"+
		"\3\2\2\2\u04bc\u04bd\5\u017a\u00be\2\u04bd\u04be\7E\2\2\u04be\u0137\3"+
		"\2\2\2\u04bf\u04c0\7q\2\2\u04c0\u04c1\7N\2\2\u04c1\u04c2\5\u0116\u008c"+
		"\2\u04c2\u0139\3\2\2\2\u04c3\u04c5\5\u013c\u009f\2\u04c4\u04c3\3\2\2\2"+
		"\u04c4\u04c5\3\2\2\2\u04c5\u013b\3\2\2\2\u04c6\u04c7\7N\2\2\u04c7\u04c8"+
		"\5\u017a\u00be\2\u04c8\u013d\3\2\2\2\u04c9\u04cb\5\u0140\u00a1\2\u04ca"+
		"\u04c9\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u013f\3\2\2\2\u04cc\u04cd\7\21"+
		"\2\2\u04cd\u04ce\5\u0116\u008c\2\u04ce\u0141\3\2\2\2\u04cf\u04d1\5\u0156"+
		"\u00ac\2\u04d0\u04cf\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u0143\3\2\2\2\u04d2"+
		"\u04d4\5\u0162\u00b2\2\u04d3\u04d2\3\2\2\2\u04d4\u04d7\3\2\2\2\u04d5\u04d3"+
		"\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u0145\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d8"+
		"\u04da\5\u0164\u00b3\2\u04d9\u04d8\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04d9"+
		"\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u0147\3\2\2\2\u04dd\u04df\5\u014e\u00a8"+
		"\2\u04de\u04dd\3\2\2\2\u04df\u04e2\3\2\2\2\u04e0\u04de\3\2\2\2\u04e0\u04e1"+
		"\3\2\2\2\u04e1\u0149\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e3\u04e5\5\u017a\u00be"+
		"\2\u04e4\u04e3\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u014b\3\2\2\2\u04e6\u04e7"+
		"\5\u0148\u00a5\2\u04e7\u04e8\5\u0142\u00a2\2\u04e8\u014d\3\2\2\2\u04e9"+
		"\u04ea\7\t\2\2\u04ea\u04eb\7?\2\2\u04eb\u04ec\5\34\17\2\u04ec\u04ed\5"+
		"\u0150\u00a9\2\u04ed\u04ee\7q\2\2\u04ee\u04ef\7@\2\2\u04ef\u04f0\5\u010a"+
		"\u0086\2\u04f0\u014f\3\2\2\2\u04f1\u04f2\5\u00ccg\2\u04f2\u04f3\5\u0152"+
		"\u00aa\2\u04f3\u0151\3\2\2\2\u04f4\u04f6\5\u0154\u00ab\2\u04f5\u04f4\3"+
		"\2\2\2\u04f6\u04f9\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8"+
		"\u0153\3\2\2\2\u04f9\u04f7\3\2\2\2\u04fa\u04fb\7\\\2\2\u04fb\u04fc\5\u00cc"+
		"g\2\u04fc\u0155\3\2\2\2\u04fd\u04fe\7\25\2\2\u04fe\u04ff\5\u010a\u0086"+
		"\2\u04ff\u0157\3\2\2\2\u0500\u0501\7?\2\2\u0501\u0502\5\u015a\u00ae\2"+
		"\u0502\u0503\5\u01e6\u00f4\2\u0503\u0504\7@\2\2\u0504\u0159\3\2\2\2\u0505"+
		"\u0506\5\u0160\u00b1\2\u0506\u0507\5\u015c\u00af\2\u0507\u015b\3\2\2\2"+
		"\u0508\u050a\5\u015e\u00b0\2\u0509\u0508\3\2\2\2\u050a\u050d\3\2\2\2\u050b"+
		"\u0509\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u015d\3\2\2\2\u050d\u050b\3\2"+
		"\2\2\u050e\u050f\7E\2\2\u050f\u0510\5\u0160\u00b1\2\u0510\u015f\3\2\2"+
		"\2\u0511\u0512\5\34\17\2\u0512\u0513\5\u00a6T\2\u0513\u0514\5\u0098M\2"+
		"\u0514\u0515\7H\2\2\u0515\u0516\5\u017a\u00be\2\u0516\u0161\3\2\2\2\u0517"+
		"\u0518\5\u0146\u00a4\2\u0518\u0519\5\u010c\u0087\2\u0519\u0163\3\2\2\2"+
		"\u051a\u051d\7\b\2\2\u051b\u051e\5\u017a\u00be\2\u051c\u051e\7q\2\2\u051d"+
		"\u051b\3\2\2\2\u051d\u051c\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0523\7N"+
		"\2\2\u0520\u0521\7\16\2\2\u0521\u0523\7N\2\2\u0522\u051a\3\2\2\2\u0522"+
		"\u0520\3\2\2\2\u0523\u0165\3\2\2\2\u0524\u052c\5\u016e\u00b8\2\u0525\u0526"+
		"\5\u0168\u00b5\2\u0526\u0527\7E\2\2\u0527\u0528\5\u014a\u00a6\2\u0528"+
		"\u0529\7E\2\2\u0529\u052a\5\u016a\u00b6\2\u052a\u052c\3\2\2\2\u052b\u0524"+
		"\3\2\2\2\u052b\u0525\3\2\2\2\u052c\u0167\3\2\2\2\u052d\u052f\5\u016c\u00b7"+
		"\2\u052e\u052d\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0169\3\2\2\2\u0530\u0532"+
		"\5\u0172\u00ba\2\u0531\u0530\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u016b\3"+
		"\2\2\2\u0533\u0536\5\u0112\u008a\2\u0534\u0536\5\u0172\u00ba\2\u0535\u0533"+
		"\3\2\2\2\u0535\u0534\3\2\2\2\u0536\u016d\3\2\2\2\u0537\u0538\5\34\17\2"+
		"\u0538\u0539\5\u01c2\u00e2\2\u0539\u053a\5\u0098M\2\u053a\u053b\7N\2\2"+
		"\u053b\u053c\5\u017a\u00be\2\u053c\u016f\3\2\2\2\u053d\u053e\7?\2\2\u053e"+
		"\u053f\5\u017a\u00be\2\u053f\u0540\7@\2\2\u0540\u0171\3\2\2\2\u0541\u0542"+
		"\5\u017a\u00be\2\u0542\u0543\5\u0174\u00bb\2\u0543\u0173\3\2\2\2\u0544"+
		"\u0546\5\u0176\u00bc\2\u0545\u0544\3\2\2\2\u0546\u0549\3\2\2\2\u0547\u0545"+
		"\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u0175\3\2\2\2\u0549\u0547\3\2\2\2\u054a"+
		"\u054b\7F\2\2\u054b\u054c\5\u017a\u00be\2\u054c\u0177\3\2\2\2\u054d\u054e"+
		"\7q\2\2\u054e\u054f\7?\2\2\u054f\u0550\5\u016a\u00b6\2\u0550\u0551\7@"+
		"\2\2\u0551\u055d\3\2\2\2\u0552\u0553\7-\2\2\u0553\u0554\7?\2\2\u0554\u0555"+
		"\5\u016a\u00b6\2\u0555\u0556\7@\2\2\u0556\u055d\3\2\2\2\u0557\u0558\7"+
		"*\2\2\u0558\u0559\7?\2\2\u0559\u055a\5\u016a\u00b6\2\u055a\u055b\7@\2"+
		"\2\u055b\u055d\3\2\2\2\u055c\u054d\3\2\2\2\u055c\u0552\3\2\2\2\u055c\u0557"+
		"\3\2\2\2\u055d\u0179\3\2\2\2\u055e\u055f\b\u00be\1\2\u055f\u0560\7?\2"+
		"\2\u0560\u0561\5\u017a\u00be\2\u0561\u0562\7@\2\2\u0562\u0589\3\2\2\2"+
		"\u0563\u0589\7-\2\2\u0564\u0589\7*\2\2\u0565\u0589\5\u00d2j\2\u0566\u0589"+
		"\7q\2\2\u0567\u0568\5j\66\2\u0568\u0569\7G\2\2\u0569\u056a\7\13\2\2\u056a"+
		"\u0589\3\2\2\2\u056b\u056e\5\u01ba\u00de\2\u056c\u056f\5\u01d6\u00ec\2"+
		"\u056d\u056f\5\u017c\u00bf\2\u056e\u056c\3\2\2\2\u056e\u056d\3\2\2\2\u056f"+
		"\u0589\3\2\2\2\u0570\u0589\5\u0178\u00bd\2\u0571\u0572\7!\2\2\u0572\u0589"+
		"\5\u01a4\u00d3\2\u0573\u0574\7?\2\2\u0574\u0575\5\u01c2\u00e2\2\u0575"+
		"\u0576\7@\2\2\u0576\u0577\5\u017a\u00be\27\u0577\u0589\3\2\2\2\u0578\u0579"+
		"\t\5\2\2\u0579\u0589\5\u017a\u00be\25\u057a\u057b\t\6\2\2\u057b\u0589"+
		"\5\u017a\u00be\24\u057c\u0589\5\u018e\u00c8\2\u057d\u057e\5\u01c2\u00e2"+
		"\2\u057e\u0581\7k\2\2\u057f\u0582\5\u0182\u00c2\2\u0580\u0582\7!\2\2\u0581"+
		"\u057f\3\2\2\2\u0581\u0580\3\2\2\2\u0582\u0589\3\2\2\2\u0583\u0584\5\u019e"+
		"\u00d0\2\u0584\u0585\7k\2\2\u0585\u0586\5\u00a8U\2\u0586\u0587\7!\2\2"+
		"\u0587\u0589\3\2\2\2\u0588\u055e\3\2\2\2\u0588\u0563\3\2\2\2\u0588\u0564"+
		"\3\2\2\2\u0588\u0565\3\2\2\2\u0588\u0566\3\2\2\2\u0588\u0567\3\2\2\2\u0588"+
		"\u056b\3\2\2\2\u0588\u0570\3\2\2\2\u0588\u0571\3\2\2\2\u0588\u0573\3\2"+
		"\2\2\u0588\u0578\3\2\2\2\u0588\u057a\3\2\2\2\u0588\u057c\3\2\2\2\u0588"+
		"\u057d\3\2\2\2\u0588\u0583\3\2\2\2\u0589\u05cf\3\2\2\2\u058a\u058b\f\23"+
		"\2\2\u058b\u058c\t\7\2\2\u058c\u05ce\5\u017a\u00be\24\u058d\u058e\f\22"+
		"\2\2\u058e\u058f\t\b\2\2\u058f\u05ce\5\u017a\u00be\23\u0590\u0594\f\21"+
		"\2\2\u0591\u0595\5\u0184\u00c3\2\u0592\u0595\5\u0188\u00c5\2\u0593\u0595"+
		"\5\u0186\u00c4\2\u0594\u0591\3\2\2\2\u0594\u0592\3\2\2\2\u0594\u0593\3"+
		"\2\2\2\u0595\u0596\3\2\2\2\u0596\u0597\5\u017a\u00be\22\u0597\u05ce\3"+
		"\2\2\2\u0598\u0599\f\20\2\2\u0599\u059a\t\t\2\2\u059a\u05ce\5\u017a\u00be"+
		"\21\u059b\u059c\f\16\2\2\u059c\u059d\t\n\2\2\u059d\u05ce\5\u017a\u00be"+
		"\17\u059e\u059f\f\r\2\2\u059f\u05a0\7[\2\2\u05a0\u05ce\5\u017a\u00be\16"+
		"\u05a1\u05a2\f\f\2\2\u05a2\u05a3\7]\2\2\u05a3\u05ce\5\u017a\u00be\r\u05a4"+
		"\u05a5\f\13\2\2\u05a5\u05a6\7\\\2\2\u05a6\u05ce\5\u017a\u00be\f\u05a7"+
		"\u05a8\f\n\2\2\u05a8\u05a9\7S\2\2\u05a9\u05ce\5\u017a\u00be\13\u05aa\u05ab"+
		"\f\t\2\2\u05ab\u05ac\7T\2\2\u05ac\u05ce\5\u017a\u00be\n\u05ad\u05ae\f"+
		"\b\2\2\u05ae\u05af\7M\2\2\u05af\u05b0\5\u017a\u00be\2\u05b0\u05b1\7N\2"+
		"\2\u05b1\u05b2\5\u017a\u00be\b\u05b2\u05ce\3\2\2\2\u05b3\u05b4\f\7\2\2"+
		"\u05b4\u05b5\t\13\2\2\u05b5\u05ce\5\u017a\u00be\7\u05b6\u05b7\f\33\2\2"+
		"\u05b7\u05be\7G\2\2\u05b8\u05bf\7q\2\2\u05b9\u05bf\5\u0178\u00bd\2\u05ba"+
		"\u05bf\7-\2\2\u05bb\u05bf\5\u017e\u00c0\2\u05bc\u05bf\5\u0180\u00c1\2"+
		"\u05bd\u05bf\5\u01b6\u00dc\2\u05be\u05b8\3\2\2\2\u05be\u05b9\3\2\2\2\u05be"+
		"\u05ba\3\2\2\2\u05be\u05bb\3\2\2\2\u05be\u05bc\3\2\2\2\u05be\u05bd\3\2"+
		"\2\2\u05bf\u05ce\3\2\2\2\u05c0\u05c1\f\32\2\2\u05c1\u05c2\7C\2\2\u05c2"+
		"\u05c3\5\u017a\u00be\2\u05c3\u05c4\7D\2\2\u05c4\u05ce\3\2\2\2\u05c5\u05c6"+
		"\f\26\2\2\u05c6\u05ce\t\f\2\2\u05c7\u05c8\f\17\2\2\u05c8\u05c9\7\34\2"+
		"\2\u05c9\u05ce\5\u01c2\u00e2\2\u05ca\u05cb\f\5\2\2\u05cb\u05cc\7k\2\2"+
		"\u05cc\u05ce\5\u0182\u00c2\2\u05cd\u058a\3\2\2\2\u05cd\u058d\3\2\2\2\u05cd"+
		"\u0590\3\2\2\2\u05cd\u0598\3\2\2\2\u05cd\u059b\3\2\2\2\u05cd\u059e\3\2"+
		"\2\2\u05cd\u05a1\3\2\2\2\u05cd\u05a4\3\2\2\2\u05cd\u05a7\3\2\2\2\u05cd"+
		"\u05aa\3\2\2\2\u05cd\u05ad\3\2\2\2\u05cd\u05b3\3\2\2\2\u05cd\u05b6\3\2"+
		"\2\2\u05cd\u05c0\3\2\2\2\u05cd\u05c5\3\2\2\2\u05cd\u05c7\3\2\2\2\u05cd"+
		"\u05ca\3\2\2\2\u05ce\u05d1\3\2\2\2\u05cf\u05cd\3\2\2\2\u05cf\u05d0\3\2"+
		"\2\2\u05d0\u017b\3\2\2\2\u05d1\u05cf\3\2\2\2\u05d2\u05d3\7-\2\2\u05d3"+
		"\u05d4\5\u01d8\u00ed\2\u05d4\u017d\3\2\2\2\u05d5\u05d6\7!\2\2\u05d6\u05d7"+
		"\5\u018a\u00c6\2\u05d7\u05d8\5\u01a8\u00d5\2\u05d8\u017f\3\2\2\2\u05d9"+
		"\u05da\7*\2\2\u05da\u05db\5\u01d2\u00ea\2\u05db\u0181\3\2\2\2\u05dc\u05dd"+
		"\5\u00a8U\2\u05dd\u05de\7q\2\2\u05de\u0183\3\2\2\2\u05df\u05e0\7J\2\2"+
		"\u05e0\u05e1\7J\2\2\u05e1\u0185\3\2\2\2\u05e2\u05e3\7I\2\2\u05e3\u05e4"+
		"\7I\2\2\u05e4\u0187\3\2\2\2\u05e5\u05e6\7I\2\2\u05e6\u05e7\7I\2\2\u05e7"+
		"\u05e8\7I\2\2\u05e8\u0189\3\2\2\2\u05e9\u05eb\5\u01ba\u00de\2\u05ea\u05e9"+
		"\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u018b\3\2\2\2\u05ec\u05ed\7C\2\2\u05ed"+
		"\u05ee\5\u017a\u00be\2\u05ee\u05ef\7D\2\2\u05ef\u018d\3\2\2\2\u05f0\u05f1"+
		"\5\u0190\u00c9\2\u05f1\u05f2\7j\2\2\u05f2\u05f3\5\u019c\u00cf\2\u05f3"+
		"\u018f\3\2\2\2\u05f4\u05f8\7q\2\2\u05f5\u05f8\5\u0198\u00cd\2\u05f6\u05f8"+
		"\5\u019a\u00ce\2\u05f7\u05f4\3\2\2\2\u05f7\u05f5\3\2\2\2\u05f7\u05f6\3"+
		"\2\2\2\u05f8\u0191\3\2\2\2\u05f9\u05fa\7q\2\2\u05fa\u05fb\5\u0194\u00cb"+
		"\2\u05fb\u0193\3\2\2\2\u05fc\u05fe\5\u0196\u00cc\2\u05fd\u05fc\3\2\2\2"+
		"\u05fe\u0601\3\2\2\2\u05ff\u05fd\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0195"+
		"\3\2\2\2\u0601\u05ff\3\2\2\2\u0602\u0603\7F\2\2\u0603\u0604\7q\2\2\u0604"+
		"\u0197\3\2\2\2\u0605\u0606\7?\2\2\u0606\u0607\5\u00ba^\2\u0607\u0608\7"+
		"@\2\2\u0608\u0199\3\2\2\2\u0609\u060a\7?\2\2\u060a\u060b\5\u0192\u00ca"+
		"\2\u060b\u060c\7@\2\2\u060c\u019b\3\2\2\2\u060d\u0610\5\u017a\u00be\2"+
		"\u060e\u0610\5\u010a\u0086\2\u060f\u060d\3\2\2\2\u060f\u060e\3\2\2\2\u0610"+
		"\u019d\3\2\2\2\u0611\u0612\5\u01a0\u00d1\2\u0612\u0613\5\f\7\2\u0613\u0614"+
		"\7q\2\2\u0614\u0615\5\u00a8U\2\u0615\u019f\3\2\2\2\u0616\u0618\5\u01a2"+
		"\u00d2\2\u0617\u0616\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u01a1\3\2\2\2\u0619"+
		"\u061a\5\u00a6T\2\u061a\u061b\7G\2\2\u061b\u01a3\3\2\2\2\u061c\u061d\5"+
		"\u01ba\u00de\2\u061d\u061e\5\u01a6\u00d4\2\u061e\u061f\5\u01b4\u00db\2"+
		"\u061f\u0626\3\2\2\2\u0620\u0623\5\u01a6\u00d4\2\u0621\u0624\5\u01ac\u00d7"+
		"\2\u0622\u0624\5\u01b4\u00db\2\u0623\u0621\3\2\2\2\u0623\u0622\3\2\2\2"+
		"\u0624\u0626\3\2\2\2\u0625\u061c\3\2\2\2\u0625\u0620\3\2\2\2\u0626\u01a5"+
		"\3\2\2\2\u0627\u062a\5\u00a6T\2\u0628\u062a\5\u01c6\u00e4\2\u0629\u0627"+
		"\3\2\2\2\u0629\u0628\3\2\2\2\u062a\u01a7\3\2\2\2\u062b\u062c\7q\2\2\u062c"+
		"\u062d\5\u01aa\u00d6\2\u062d\u062e\5\u01b4\u00db\2\u062e\u01a9\3\2\2\2"+
		"\u062f\u0631\5\u01b8\u00dd\2\u0630\u062f\3\2\2\2\u0630\u0631\3\2\2\2\u0631"+
		"\u01ab\3\2\2\2\u0632\u063b\7C\2\2\u0633\u0634\7D\2\2\u0634\u0635\5\u01e2"+
		"\u00f2\2\u0635\u0636\5\u009cO\2\u0636\u063c\3\2\2\2\u0637\u0638\5\u01ae"+
		"\u00d8\2\u0638\u0639\5\u01b0\u00d9\2\u0639\u063a\5\u01e2\u00f2\2\u063a"+
		"\u063c\3\2\2\2\u063b\u0633\3\2\2\2\u063b\u0637\3\2\2\2\u063c\u01ad\3\2"+
		"\2\2\u063d\u063e\5\u017a\u00be\2\u063e\u063f\7D\2\2\u063f\u01af\3\2\2"+
		"\2\u0640\u0642\5\u018c\u00c7\2\u0641\u0640\3\2\2\2\u0642\u0645\3\2\2\2"+
		"\u0643\u0641\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u01b1\3\2\2\2\u0645\u0643"+
		"\3\2\2\2\u0646\u0647\t\13\2\2\u0647\u0648\5\u017a\u00be\2\u0648\u01b3"+
		"\3\2\2\2\u0649\u064a\5\u01d8\u00ed\2\u064a\u064b\5L\'\2\u064b\u01b5\3"+
		"\2\2\2\u064c\u064d\5\u01ba\u00de\2\u064d\u064e\5\u01d6\u00ec\2\u064e\u01b7"+
		"\3\2\2\2\u064f\u0652\5\u01ea\u00f6\2\u0650\u0652\5\u01ba\u00de\2\u0651"+
		"\u064f\3\2\2\2\u0651\u0650\3\2\2\2\u0652\u01b9\3\2\2\2\u0653\u0654\7J"+
		"\2\2\u0654\u0655\5\u01bc\u00df\2\u0655\u0656\7I\2\2\u0656\u01bb\3\2\2"+
		"\2\u0657\u0658\5\u01c2\u00e2\2\u0658\u0659\5\u01be\u00e0\2\u0659\u01bd"+
		"\3\2\2\2\u065a\u065c\5\u01c0\u00e1\2\u065b\u065a\3\2\2\2\u065c\u065f\3"+
		"\2\2\2\u065d\u065b\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u01bf\3\2\2\2\u065f"+
		"\u065d\3\2\2\2\u0660\u0661\7F\2\2\u0661\u0662\5\u01c2\u00e2\2\u0662\u01c1"+
		"\3\2\2\2\u0663\u0664\5\u01c4\u00e3\2\u0664\u0665\5\u01a6\u00d4\2\u0665"+
		"\u0666\5\u01e2\u00f2\2\u0666\u01c3\3\2\2\2\u0667\u0669\5\u00d8m\2\u0668"+
		"\u0667\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u01c5\3\2\2\2\u066a\u066b\t\r"+
		"\2\2\u066b\u01c7\3\2\2\2\u066c\u066d\7J\2\2\u066d\u066e\5\u01ca\u00e6"+
		"\2\u066e\u066f\7I\2\2\u066f\u01c9\3\2\2\2\u0670\u0672\5\u01cc\u00e7\2"+
		"\u0671\u0670\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u01cb\3\2\2\2\u0673\u0674"+
		"\5\u00aeX\2\u0674\u0675\5\u01ce\u00e8\2\u0675\u01cd\3\2\2\2\u0676\u0678"+
		"\5\u01d0\u00e9\2\u0677\u0676\3\2\2\2\u0678\u067b\3\2\2\2\u0679\u0677\3"+
		"\2\2\2\u0679\u067a\3\2\2\2\u067a\u01cf\3\2\2\2\u067b\u0679\3\2\2\2\u067c"+
		"\u067d\7F\2\2\u067d\u067e\5\u00aeX\2\u067e\u01d1\3\2\2\2\u067f\u0682\5"+
		"\u01d8\u00ed\2\u0680\u0682\5\u01d4\u00eb\2\u0681\u067f\3\2\2\2\u0681\u0680"+
		"\3\2\2\2\u0682\u01d3\3\2\2\2\u0683\u0684\7G\2\2\u0684\u0685\7q\2\2\u0685"+
		"\u0686\5J&\2\u0686\u01d5\3\2\2\2\u0687\u0688\7*\2\2\u0688\u068c\5\u01d2"+
		"\u00ea\2\u0689\u068a\7q\2\2\u068a\u068c\5\u01d8\u00ed\2\u068b\u0687\3"+
		"\2\2\2\u068b\u0689\3\2\2\2\u068c\u01d7\3\2\2\2\u068d\u068e\7?\2\2\u068e"+
		"\u068f\5\u016a\u00b6\2\u068f\u0690\7@\2\2\u0690\u01d9\3\2\2\2\u0691\u0693"+
		"\7(\2\2\u0692\u0691\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u01db\3\2\2\2\u0694"+
		"\u0696\5\u01de\u00f0\2\u0695\u0694\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u01dd"+
		"\3\2\2\2\u0697\u0698\7G\2\2\u0698\u0699\7Y\2\2\u0699\u01df\3\2\2\2\u069a"+
		"\u069c\7F\2\2\u069b\u069a\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u01e1\3\2"+
		"\2\2\u069d\u069f\5\u01e4\u00f3\2\u069e\u069d\3\2\2\2\u069f\u06a2\3\2\2"+
		"\2\u06a0\u069e\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u01e3\3\2\2\2\u06a2\u06a0"+
		"\3\2\2\2\u06a3\u06a4\7C\2\2\u06a4\u06a5\7D\2\2\u06a5\u01e5\3\2\2\2\u06a6"+
		"\u06a8\7E\2\2\u06a7\u06a6\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u01e7\3\2"+
		"\2\2\u06a9\u06ab\7q\2\2\u06aa\u06a9\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab"+
		"\u01e9\3\2\2\2\u06ac\u06ad\7J\2\2\u06ad\u06ae\7I\2\2\u06ae\u01eb\3\2\2"+
		"\2y\u01f2\u01f7\u01fd\u0208\u0216\u0219\u021e\u0224\u022c\u0236\u023a"+
		"\u023f\u024a\u024d\u0253\u0260\u026b\u0276\u0286\u0289\u0291\u029d\u02a0"+
		"\u02a5\u02b2\u02c2\u02cc\u02d7\u02e1\u02e8\u02ec\u0301\u030a\u0314\u0329"+
		"\u0331\u033a\u0345\u034f\u0359\u0360\u0369\u0374\u0379\u0383\u0387\u038f"+
		"\u039a\u039e\u03a7\u03ae\u03c2\u03ce\u03d9\u03e0\u03e4\u03ec\u03f9\u0403"+
		"\u040a\u041b\u0422\u0434\u0438\u0442\u044e\u0454\u0460\u0463\u0476\u0498"+
		"\u04c4\u04ca\u04d0\u04d5\u04db\u04e0\u04e4\u04f7\u050b\u051d\u0522\u052b"+
		"\u052e\u0531\u0535\u0547\u055c\u056e\u0581\u0588\u0594\u05be\u05cd\u05cf"+
		"\u05ea\u05f7\u05ff\u060f\u0617\u0623\u0625\u0629\u0630\u063b\u0643\u0651"+
		"\u065d\u0668\u0671\u0679\u0681\u068b\u0692\u0695\u069b\u06a0\u06a7\u06aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}