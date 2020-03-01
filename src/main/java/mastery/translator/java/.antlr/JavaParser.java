// Generated from /mnt/c/Users/namas/Documents/Research/Tools/UTrans/src/main/java/mastery.translator/java/JavaParser.g4 by ANTLR 4.7.1
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
		RULE_blockStatement = 134, RULE_localVariableDeclaration = 135, RULE_localTypeDeclaration = 136, 
		RULE_statement = 137, RULE_blockStmt = 138, RULE_assertStmt = 139, RULE_ifStmt = 140, 
		RULE_forStmt = 141, RULE_whileStmt = 142, RULE_doWhileStmt = 143, RULE_tryStmt = 144, 
		RULE_tryRscSpecStmt = 145, RULE_switchStmt = 146, RULE_synchronizedStmt = 147, 
		RULE_returnStmt = 148, RULE_throwStmt = 149, RULE_breakStmt = 150, RULE_continueStmt = 151, 
		RULE_semiStmt = 152, RULE_exprStmt = 153, RULE_identifierStmt = 154, RULE_optionColonExpression = 155, 
		RULE_colonExpression = 156, RULE_optionElseStatement = 157, RULE_elseStatement = 158, 
		RULE_optionFinallyBlock = 159, RULE_switchBlockStatementGroups = 160, 
		RULE_switchLabels = 161, RULE_catchClauses = 162, RULE_optionExpression = 163, 
		RULE_catchClausesOrOptionFinallyBlock = 164, RULE_catchClause = 165, RULE_catchType = 166, 
		RULE_orQualifiedNames = 167, RULE_orQualifiedName = 168, RULE_finallyBlock = 169, 
		RULE_resourceSpecification = 170, RULE_resources = 171, RULE_semicolonResources = 172, 
		RULE_semicolonResource = 173, RULE_resource = 174, RULE_switchBlockStatementGroup = 175, 
		RULE_switchLabel = 176, RULE_forControl = 177, RULE_optionforInit = 178, 
		RULE_optionExpressionList = 179, RULE_forInit = 180, RULE_enhancedForControl = 181, 
		RULE_parExpression = 182, RULE_expressionList = 183, RULE_otherExpressions = 184, 
		RULE_anotherExpression = 185, RULE_methodCall = 186, RULE_expression = 187, 
		RULE_thisArguments = 188, RULE_newOptionNonWildcardTypeArgumentsInnerCreator = 189, 
		RULE_superSuperSuffix = 190, RULE_optionTypeArgumentsIdentifier = 191, 
		RULE_leftShift = 192, RULE_signedRightShift = 193, RULE_unsignedRightShift = 194, 
		RULE_optionNonWildcardTypeArguments = 195, RULE_squaredExpression = 196, 
		RULE_lambdaExpression = 197, RULE_lambdaParameters = 198, RULE_identifiers = 199, 
		RULE_otherIdentifiers = 200, RULE_anotherIdentifier = 201, RULE_parenthesizedOptionFormalParameterList = 202, 
		RULE_parenthesizedIdentifiers = 203, RULE_lambdaBody = 204, RULE_classType = 205, 
		RULE_optionClassOrInterfaceTypeDot = 206, RULE_classOrInterfaceTypeDot = 207, 
		RULE_creator = 208, RULE_classOrInterfaceOrPrimitiveType = 209, RULE_innerCreator = 210, 
		RULE_optionNonWildcardTypeArgumentsOrDiamond = 211, RULE_arrayCreatorRest = 212, 
		RULE_rightSquaredExpression = 213, RULE_squaredExpressions = 214, RULE_rightAssocBinaryOperatorAndExpression = 215, 
		RULE_classCreatorRest = 216, RULE_explicitGenericInvocation = 217, RULE_nonWildcardTypeArgumentsOrDiamond = 218, 
		RULE_nonWildcardTypeArguments = 219, RULE_typeList = 220, RULE_commaTypeTypes = 221, 
		RULE_commaTypeType = 222, RULE_typeType = 223, RULE_optionAnnotation = 224, 
		RULE_primitiveType = 225, RULE_typeArguments = 226, RULE_optionNonEmptyTypeArguments = 227, 
		RULE_nonEmptyTypeArguments = 228, RULE_otherTypeArguments = 229, RULE_anotherTypeArgument = 230, 
		RULE_superSuffix = 231, RULE_commaIdentifierOptionArguments = 232, RULE_explicitGenericInvocationSuffix = 233, 
		RULE_arguments = 234, RULE_optionStatic = 235, RULE_optionDotStar = 236, 
		RULE_dotStar = 237, RULE_optionComma = 238, RULE_squares = 239, RULE_square = 240, 
		RULE_optionSemicolon = 241, RULE_optionIdentifier = 242, RULE_angle = 243;
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
		"defaultValue", "block", "blockStatements", "blockStatement", "localVariableDeclaration", 
		"localTypeDeclaration", "statement", "blockStmt", "assertStmt", "ifStmt", 
		"forStmt", "whileStmt", "doWhileStmt", "tryStmt", "tryRscSpecStmt", "switchStmt", 
		"synchronizedStmt", "returnStmt", "throwStmt", "breakStmt", "continueStmt", 
		"semiStmt", "exprStmt", "identifierStmt", "optionColonExpression", "colonExpression", 
		"optionElseStatement", "elseStatement", "optionFinallyBlock", "switchBlockStatementGroups", 
		"switchLabels", "catchClauses", "optionExpression", "catchClausesOrOptionFinallyBlock", 
		"catchClause", "catchType", "orQualifiedNames", "orQualifiedName", "finallyBlock", 
		"resourceSpecification", "resources", "semicolonResources", "semicolonResource", 
		"resource", "switchBlockStatementGroup", "switchLabel", "forControl", 
		"optionforInit", "optionExpressionList", "forInit", "enhancedForControl", 
		"parExpression", "expressionList", "otherExpressions", "anotherExpression", 
		"methodCall", "expression", "thisArguments", "newOptionNonWildcardTypeArgumentsInnerCreator", 
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
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			optionPackageDeclaration();
			setState(489);
			importDeclarations();
			setState(490);
			typeDeclarations();
			setState(491);
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
	}

	public final OptionPackageDeclarationContext optionPackageDeclaration() throws RecognitionException {
		OptionPackageDeclarationContext _localctx = new OptionPackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_optionPackageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(493);
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
	}

	public final ImportDeclarationsContext importDeclarations() throws RecognitionException {
		ImportDeclarationsContext _localctx = new ImportDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(496);
				importDeclaration();
				}
				}
				setState(501);
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
	}

	public final TypeDeclarationsContext typeDeclarations() throws RecognitionException {
		TypeDeclarationsContext _localctx = new TypeDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(502);
				typeDeclaration();
				}
				}
				setState(507);
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
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			annotations();
			setState(509);
			match(PACKAGE);
			setState(510);
			qualifiedName();
			setState(511);
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
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(513);
					annotation();
					}
					} 
				}
				setState(518);
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
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(IMPORT);
			setState(520);
			optionStatic();
			setState(521);
			qualifiedName();
			setState(522);
			optionDotStar();
			setState(523);
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
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeDeclaration);
		try {
			setState(533);
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
				setState(525);
				classOrInterfaceModifiers();
				setState(530);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(526);
					classDeclaration();
					}
					break;
				case ENUM:
					{
					setState(527);
					enumDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(528);
					interfaceDeclaration();
					}
					break;
				case AT:
					{
					setState(529);
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
				setState(532);
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
	}

	public final ClassOrInterfaceModifiersContext classOrInterfaceModifiers() throws RecognitionException {
		ClassOrInterfaceModifiersContext _localctx = new ClassOrInterfaceModifiersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classOrInterfaceModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(535);
					classOrInterfaceModifier();
					}
					} 
				}
				setState(540);
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
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(541);
					modifier();
					}
					} 
				}
				setState(546);
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
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_modifier);
		try {
			setState(552);
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
				setState(547);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 3);
				{
				setState(549);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(550);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(551);
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
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classOrInterfaceModifier);
		try {
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(557);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(558);
				match(STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(559);
				match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(560);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(561);
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
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableModifier);
		try {
			setState(566);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
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
	}

	public final VariableModifiersContext variableModifiers() throws RecognitionException {
		VariableModifiersContext _localctx = new VariableModifiersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(568);
					variableModifier();
					}
					} 
				}
				setState(573);
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
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(CLASS);
			setState(575);
			match(IDENTIFIER);
			setState(576);
			optionTypeParameters();
			setState(577);
			optionExtendsTypeType();
			setState(578);
			optionImplementsTypeList();
			setState(579);
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
	}

	public final OptionTypeParametersContext optionTypeParameters() throws RecognitionException {
		OptionTypeParametersContext _localctx = new OptionTypeParametersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_optionTypeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(581);
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
	}

	public final OptionExtendsTypeTypeContext optionExtendsTypeType() throws RecognitionException {
		OptionExtendsTypeTypeContext _localctx = new OptionExtendsTypeTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_optionExtendsTypeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(584);
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
	}

	public final ExtendsTypeTypeContext extendsTypeType() throws RecognitionException {
		ExtendsTypeTypeContext _localctx = new ExtendsTypeTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_extendsTypeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(EXTENDS);
			setState(588);
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
	}

	public final OptionImplementsTypeListContext optionImplementsTypeList() throws RecognitionException {
		OptionImplementsTypeListContext _localctx = new OptionImplementsTypeListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_optionImplementsTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(590);
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
	}

	public final ImplementsTypeListContext implementsTypeList() throws RecognitionException {
		ImplementsTypeListContext _localctx = new ImplementsTypeListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_implementsTypeList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(IMPLEMENTS);
			setState(594);
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
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(LT);
			setState(597);
			typeParameter();
			setState(598);
			otherTypeParameters();
			setState(599);
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
	}

	public final OtherTypeParametersContext otherTypeParameters() throws RecognitionException {
		OtherTypeParametersContext _localctx = new OtherTypeParametersContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_otherTypeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(601);
				anotherTypeParameter();
				}
				}
				setState(606);
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
	}

	public final AnotherTypeParameterContext anotherTypeParameter() throws RecognitionException {
		AnotherTypeParameterContext _localctx = new AnotherTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_anotherTypeParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(COMMA);
			setState(608);
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
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			annotations();
			setState(611);
			match(IDENTIFIER);
			setState(612);
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
	}

	public final OptionExtendsTypeBoundContext optionExtendsTypeBound() throws RecognitionException {
		OptionExtendsTypeBoundContext _localctx = new OptionExtendsTypeBoundContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_optionExtendsTypeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(614);
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
	}

	public final ExtendsTypeBoundContext extendsTypeBound() throws RecognitionException {
		ExtendsTypeBoundContext _localctx = new ExtendsTypeBoundContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_extendsTypeBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(EXTENDS);
			setState(618);
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
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			typeType();
			setState(621);
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
	}

	public final OtherTypeTypesContext otherTypeTypes() throws RecognitionException {
		OtherTypeTypesContext _localctx = new OtherTypeTypesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_otherTypeTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(623);
				anotherTypeType();
				}
				}
				setState(628);
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
	}

	public final AnotherTypeTypeContext anotherTypeType() throws RecognitionException {
		AnotherTypeTypeContext _localctx = new AnotherTypeTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_anotherTypeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(BITAND);
			setState(630);
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
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_enumDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(ENUM);
			setState(633);
			match(IDENTIFIER);
			setState(634);
			optionImplementsTypeList();
			setState(635);
			match(LBRACE);
			setState(636);
			optionEnumConstants();
			setState(637);
			optionComma();
			setState(638);
			optionEnumBodyDeclarations();
			setState(639);
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
	}

	public final OptionEnumConstantsContext optionEnumConstants() throws RecognitionException {
		OptionEnumConstantsContext _localctx = new OptionEnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_optionEnumConstants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==IDENTIFIER) {
				{
				setState(641);
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
	}

	public final OptionEnumBodyDeclarationsContext optionEnumBodyDeclarations() throws RecognitionException {
		OptionEnumBodyDeclarationsContext _localctx = new OptionEnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_optionEnumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(644);
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
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_enumConstants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			enumConstant();
			setState(648);
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
	}

	public final OtherEnumConstantsContext otherEnumConstants() throws RecognitionException {
		OtherEnumConstantsContext _localctx = new OtherEnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_otherEnumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(650);
					anotherEnumConstant();
					}
					} 
				}
				setState(655);
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
	}

	public final AnotherEnumConstantContext anotherEnumConstant() throws RecognitionException {
		AnotherEnumConstantContext _localctx = new AnotherEnumConstantContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_anotherEnumConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(COMMA);
			setState(657);
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
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_enumConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			annotations();
			setState(660);
			match(IDENTIFIER);
			setState(661);
			optionArguments();
			setState(662);
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
	}

	public final OptionArgumentsContext optionArguments() throws RecognitionException {
		OptionArgumentsContext _localctx = new OptionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_optionArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(664);
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
	}

	public final OptionClassBodyContext optionClassBody() throws RecognitionException {
		OptionClassBodyContext _localctx = new OptionClassBodyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_optionClassBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(667);
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
	}

	public final ClassBodyDeclarationsContext classBodyDeclarations() throws RecognitionException {
		ClassBodyDeclarationsContext _localctx = new ClassBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_classBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(670);
				classBodyDeclaration();
				}
				}
				setState(675);
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
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_enumBodyDeclarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(SEMI);
			setState(677);
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
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_interfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(INTERFACE);
			setState(680);
			match(IDENTIFIER);
			setState(681);
			optionTypeParameters();
			setState(682);
			optionExtendsTypeList();
			setState(683);
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
	}

	public final OptionExtendsTypeListContext optionExtendsTypeList() throws RecognitionException {
		OptionExtendsTypeListContext _localctx = new OptionExtendsTypeListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_optionExtendsTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(685);
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
	}

	public final ExtendsTypeListContext extendsTypeList() throws RecognitionException {
		ExtendsTypeListContext _localctx = new ExtendsTypeListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_extendsTypeList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(EXTENDS);
			setState(689);
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
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(LBRACE);
			setState(692);
			classBodyDeclarations();
			setState(693);
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
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_interfaceBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(LBRACE);
			setState(696);
			interfaceBodyDeclarations();
			setState(697);
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
	}

	public final InterfaceBodyDeclarationsContext interfaceBodyDeclarations() throws RecognitionException {
		InterfaceBodyDeclarationsContext _localctx = new InterfaceBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_interfaceBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(699);
				interfaceBodyDeclaration();
				}
				}
				setState(704);
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
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_classBodyDeclaration);
		try {
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				optionStatic();
				setState(707);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(709);
				modifiers();
				setState(710);
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
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_memberDeclaration);
		try {
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(716);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(717);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(718);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(719);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(720);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(721);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(722);
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
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			typeTypeOrVoid();
			setState(726);
			match(IDENTIFIER);
			setState(727);
			formalParameters();
			setState(728);
			squares();
			setState(729);
			optionThrowsQualifiedNameList();
			setState(730);
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
	}

	public final OptionThrowsQualifiedNameListContext optionThrowsQualifiedNameList() throws RecognitionException {
		OptionThrowsQualifiedNameListContext _localctx = new OptionThrowsQualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_optionThrowsQualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(732);
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
	}

	public final ThrowsQualifiedNameListContext throwsQualifiedNameList() throws RecognitionException {
		ThrowsQualifiedNameListContext _localctx = new ThrowsQualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_throwsQualifiedNameList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(THROWS);
			setState(736);
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
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_methodBody);
		try {
			setState(740);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
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
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_typeTypeOrVoid);
		try {
			setState(744);
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
				setState(742);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
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
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			typeParameters();
			setState(747);
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
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			typeParameters();
			setState(750);
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
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_constructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(IDENTIFIER);
			setState(753);
			formalParameters();
			setState(754);
			optionThrowsQualifiedNameList();
			setState(755);
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
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			typeType();
			setState(758);
			variableDeclarators();
			setState(759);
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
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_interfaceBodyDeclaration);
		try {
			setState(765);
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
				setState(761);
				modifiers();
				setState(762);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
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
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_interfaceMemberDeclaration);
		try {
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(769);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(770);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(771);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(772);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(773);
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
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_constDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			typeType();
			setState(777);
			constantDeclarator();
			setState(778);
			otherConstantDeclarators();
			setState(779);
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
	}

	public final OtherConstantDeclaratorsContext otherConstantDeclarators() throws RecognitionException {
		OtherConstantDeclaratorsContext _localctx = new OtherConstantDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_otherConstantDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(781);
				anotherConstantDeclarators();
				}
				}
				setState(786);
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
	}

	public final AnotherConstantDeclaratorsContext anotherConstantDeclarators() throws RecognitionException {
		AnotherConstantDeclaratorsContext _localctx = new AnotherConstantDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_anotherConstantDeclarators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(COMMA);
			setState(788);
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
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_constantDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(IDENTIFIER);
			setState(791);
			squares();
			setState(792);
			match(ASSIGN);
			setState(793);
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
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_interfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			interfaceMethodModifiers();
			setState(796);
			optionTypeParametersAnnotations();
			setState(797);
			typeTypeOrVoid();
			setState(798);
			match(IDENTIFIER);
			setState(799);
			formalParameters();
			setState(800);
			squares();
			setState(801);
			optionThrowsQualifiedNameList();
			setState(802);
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
	}

	public final OptionTypeParametersAnnotationsContext optionTypeParametersAnnotations() throws RecognitionException {
		OptionTypeParametersAnnotationsContext _localctx = new OptionTypeParametersAnnotationsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_optionTypeParametersAnnotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(804);
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
	}

	public final TypeParametersAnnotationsContext typeParametersAnnotations() throws RecognitionException {
		TypeParametersAnnotationsContext _localctx = new TypeParametersAnnotationsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_typeParametersAnnotations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			typeParameters();
			setState(808);
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
	}

	public final InterfaceMethodModifiersContext interfaceMethodModifiers() throws RecognitionException {
		InterfaceMethodModifiersContext _localctx = new InterfaceMethodModifiersContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_interfaceMethodModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(810);
					interfaceMethodModifier();
					}
					} 
				}
				setState(815);
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
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_interfaceMethodModifier);
		try {
			setState(822);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(818);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(819);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(820);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(821);
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
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			typeParameters();
			setState(825);
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
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_variableDeclarators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			variableDeclarator();
			setState(828);
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
	}

	public final OtherVariableDeclaratorsContext otherVariableDeclarators() throws RecognitionException {
		OtherVariableDeclaratorsContext _localctx = new OtherVariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_otherVariableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(830);
				anotherVariableDeclarator();
				}
				}
				setState(835);
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
	}

	public final AnotherVariableDeclaratorContext anotherVariableDeclarator() throws RecognitionException {
		AnotherVariableDeclaratorContext _localctx = new AnotherVariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_anotherVariableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(COMMA);
			setState(837);
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
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_variableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			variableDeclaratorId();
			setState(840);
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
	}

	public final OptionEqualsVariableInitializerContext optionEqualsVariableInitializer() throws RecognitionException {
		OptionEqualsVariableInitializerContext _localctx = new OptionEqualsVariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_optionEqualsVariableInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(842);
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
	}

	public final EqualsVariableInitializerContext equalsVariableInitializer() throws RecognitionException {
		EqualsVariableInitializerContext _localctx = new EqualsVariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_equalsVariableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(ASSIGN);
			setState(846);
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
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_variableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(IDENTIFIER);
			setState(849);
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
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_variableInitializer);
		try {
			setState(853);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
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
				setState(852);
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
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_arrayInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(LBRACE);
			setState(856);
			optionVariablesInitializer();
			setState(857);
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
	}

	public final OptionVariablesInitializerContext optionVariablesInitializer() throws RecognitionException {
		OptionVariablesInitializerContext _localctx = new OptionVariablesInitializerContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_optionVariablesInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(859);
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
	}

	public final VariablesInitializerContext variablesInitializer() throws RecognitionException {
		VariablesInitializerContext _localctx = new VariablesInitializerContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_variablesInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			variableInitializer();
			setState(863);
			otherVariableInitializers();
			setState(864);
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
	}

	public final OtherVariableInitializersContext otherVariableInitializers() throws RecognitionException {
		OtherVariableInitializersContext _localctx = new OtherVariableInitializersContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_otherVariableInitializers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(866);
					anotherVariableInitializer();
					}
					} 
				}
				setState(871);
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
	}

	public final AnotherVariableInitializerContext anotherVariableInitializer() throws RecognitionException {
		AnotherVariableInitializerContext _localctx = new AnotherVariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_anotherVariableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(COMMA);
			setState(873);
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
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(IDENTIFIER);
			setState(876);
			optionTypeArguments();
			setState(877);
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
	}

	public final OptionTypeArgumentsContext optionTypeArguments() throws RecognitionException {
		OptionTypeArgumentsContext _localctx = new OptionTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_optionTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(879);
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
	}

	public final MemberSelectionsContext memberSelections() throws RecognitionException {
		MemberSelectionsContext _localctx = new MemberSelectionsContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_memberSelections);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(882);
					memberSelection();
					}
					} 
				}
				setState(887);
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
	}

	public final MemberSelectionContext memberSelection() throws RecognitionException {
		MemberSelectionContext _localctx = new MemberSelectionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_memberSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(DOT);
			setState(889);
			match(IDENTIFIER);
			setState(890);
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
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_typeArgument);
		try {
			setState(895);
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
				setState(892);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				match(QUESTION);
				setState(894);
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
	}

	public final OptionExtendsOrSuperTypeTypeContext optionExtendsOrSuperTypeType() throws RecognitionException {
		OptionExtendsOrSuperTypeTypeContext _localctx = new OptionExtendsOrSuperTypeTypeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_optionExtendsOrSuperTypeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(897);
				_la = _input.LA(1);
				if ( !(_la==EXTENDS || _la==SUPER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(898);
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
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_qualifiedNameList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			qualifiedName();
			setState(902);
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
	}

	public final OtherQualifiedNamesContext otherQualifiedNames() throws RecognitionException {
		OtherQualifiedNamesContext _localctx = new OtherQualifiedNamesContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_otherQualifiedNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(904);
				anotherQualifiedName();
				}
				}
				setState(909);
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
	}

	public final AnotherQualifiedNameContext anotherQualifiedName() throws RecognitionException {
		AnotherQualifiedNameContext _localctx = new AnotherQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_anotherQualifiedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(COMMA);
			setState(911);
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
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_formalParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(LPAREN);
			setState(914);
			optionFormalParameterList();
			setState(915);
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
	}

	public final OptionFormalParameterListContext optionFormalParameterList() throws RecognitionException {
		OptionFormalParameterListContext _localctx = new OptionFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_optionFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(917);
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
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_formalParameterList);
		try {
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(920);
				moreThanOneNonArrayFormalParameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(921);
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
	}

	public final MoreThanOneNonArrayFormalParametersContext moreThanOneNonArrayFormalParameters() throws RecognitionException {
		MoreThanOneNonArrayFormalParametersContext _localctx = new MoreThanOneNonArrayFormalParametersContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_moreThanOneNonArrayFormalParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			formalParameter();
			setState(925);
			otherFormalParameters();
			setState(926);
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
	}

	public final OtherFormalParametersContext otherFormalParameters() throws RecognitionException {
		OtherFormalParametersContext _localctx = new OtherFormalParametersContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_otherFormalParameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(928);
					anotherFormalParameter();
					}
					} 
				}
				setState(933);
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
	}

	public final AnotherFormalParameterContext anotherFormalParameter() throws RecognitionException {
		AnotherFormalParameterContext _localctx = new AnotherFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_anotherFormalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			match(COMMA);
			setState(935);
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
	}

	public final OptionCommaArrayFormalParameterContext optionCommaArrayFormalParameter() throws RecognitionException {
		OptionCommaArrayFormalParameterContext _localctx = new OptionCommaArrayFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_optionCommaArrayFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(937);
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
	}

	public final CommaArrayFormalParameterContext commaArrayFormalParameter() throws RecognitionException {
		CommaArrayFormalParameterContext _localctx = new CommaArrayFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_commaArrayFormalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(COMMA);
			setState(941);
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
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			variableModifiers();
			setState(944);
			typeType();
			setState(945);
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
	}

	public final ArrayFormalParameterContext arrayFormalParameter() throws RecognitionException {
		ArrayFormalParameterContext _localctx = new ArrayFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_arrayFormalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			variableModifiers();
			setState(948);
			typeType();
			setState(949);
			match(ELLIPSIS);
			setState(950);
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
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_qualifiedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(IDENTIFIER);
			setState(953);
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
	}

	public final OtherDotIdentifiersContext otherDotIdentifiers() throws RecognitionException {
		OtherDotIdentifiersContext _localctx = new OtherDotIdentifiersContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_otherDotIdentifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(955);
					anotherDotIdentifier();
					}
					} 
				}
				setState(960);
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
	}

	public final AnotherDotIdentifierContext anotherDotIdentifier() throws RecognitionException {
		AnotherDotIdentifierContext _localctx = new AnotherDotIdentifierContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_anotherDotIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(DOT);
			setState(962);
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
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_literal);
		try {
			setState(970);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(967);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(968);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(969);
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
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
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
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
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
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(AT);
			setState(977);
			qualifiedName();
			setState(978);
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
	}

	public final OptionAnnotationRestContext optionAnnotationRest() throws RecognitionException {
		OptionAnnotationRestContext _localctx = new OptionAnnotationRestContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_optionAnnotationRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(980);
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
	}

	public final AnnotationRestContext annotationRest() throws RecognitionException {
		AnnotationRestContext _localctx = new AnnotationRestContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_annotationRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			match(LPAREN);
			setState(984);
			optionElementValuePairsOrElementValue();
			setState(985);
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
	}

	public final OptionElementValuePairsOrElementValueContext optionElementValuePairsOrElementValue() throws RecognitionException {
		OptionElementValuePairsOrElementValueContext _localctx = new OptionElementValuePairsOrElementValueContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_optionElementValuePairsOrElementValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(987);
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
	}

	public final ElementValuePairsOrElementValueContext elementValuePairsOrElementValue() throws RecognitionException {
		ElementValuePairsOrElementValueContext _localctx = new ElementValuePairsOrElementValueContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_elementValuePairsOrElementValue);
		try {
			setState(992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				elementValuePairs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
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
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_elementValuePairs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			elementValuePair();
			setState(995);
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
	}

	public final OtherElementValuePairsContext otherElementValuePairs() throws RecognitionException {
		OtherElementValuePairsContext _localctx = new OtherElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_otherElementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(997);
				anotherElementValuePair();
				}
				}
				setState(1002);
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
	}

	public final AnotherElementValuePairContext anotherElementValuePair() throws RecognitionException {
		AnotherElementValuePairContext _localctx = new AnotherElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_anotherElementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			match(COMMA);
			setState(1004);
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
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(IDENTIFIER);
			setState(1007);
			match(ASSIGN);
			setState(1008);
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
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_elementValue);
		try {
			setState(1013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1010);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1012);
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
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_elementValueArrayInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			match(LBRACE);
			setState(1016);
			optionElementValues();
			setState(1017);
			optionComma();
			setState(1018);
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
	}

	public final OtherElementValuesContext otherElementValues() throws RecognitionException {
		OtherElementValuesContext _localctx = new OtherElementValuesContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_otherElementValues);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1020);
					anotherElementValue();
					}
					} 
				}
				setState(1025);
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
	}

	public final AnotherElementValueContext anotherElementValue() throws RecognitionException {
		AnotherElementValueContext _localctx = new AnotherElementValueContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_anotherElementValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(COMMA);
			setState(1027);
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
	}

	public final OptionElementValuesContext optionElementValues() throws RecognitionException {
		OptionElementValuesContext _localctx = new OptionElementValuesContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_optionElementValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(1029);
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
	}

	public final ElementValuesContext elementValues() throws RecognitionException {
		ElementValuesContext _localctx = new ElementValuesContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_elementValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			elementValue();
			setState(1033);
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
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			match(AT);
			setState(1036);
			match(INTERFACE);
			setState(1037);
			match(IDENTIFIER);
			setState(1038);
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
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_annotationTypeBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(LBRACE);
			setState(1041);
			annotationTypeElementDeclarations();
			setState(1042);
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
	}

	public final AnnotationTypeElementDeclarationsContext annotationTypeElementDeclarations() throws RecognitionException {
		AnnotationTypeElementDeclarationsContext _localctx = new AnnotationTypeElementDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_annotationTypeElementDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(1044);
				annotationTypeElementDeclaration();
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
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_annotationTypeElementDeclaration);
		try {
			setState(1054);
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
				setState(1050);
				modifiers();
				setState(1051);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1053);
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
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_annotationTypeElementRest);
		try {
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1056);
				typeType();
				setState(1057);
				annotationMethodOrConstantRest();
				setState(1058);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1060);
				classDeclaration();
				setState(1061);
				optionSemicolon();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1063);
				interfaceDeclaration();
				setState(1064);
				optionSemicolon();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1066);
				enumDeclaration();
				setState(1067);
				optionSemicolon();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1069);
				annotationTypeDeclaration();
				setState(1070);
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
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_annotationMethodOrConstantRest);
		try {
			setState(1076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1074);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1075);
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
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_annotationMethodRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			match(IDENTIFIER);
			setState(1079);
			match(LPAREN);
			setState(1080);
			match(RPAREN);
			setState(1081);
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
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
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
	}

	public final OptionDefaultValueContext optionDefaultValue() throws RecognitionException {
		OptionDefaultValueContext _localctx = new OptionDefaultValueContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_optionDefaultValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1085);
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
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			match(DEFAULT);
			setState(1089);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			match(LBRACE);
			setState(1092);
			blockStatements();
			setState(1093);
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
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(1095);
				blockStatement();
				}
				}
				setState(1100);
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
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
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
				setState(1101);
				localVariableDeclaration();
				setState(1102);
				match(SEMI);
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
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			variableModifiers();
			setState(1109);
			typeType();
			setState(1110);
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
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_localTypeDeclaration);
		try {
			setState(1118);
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
				setState(1112);
				classOrInterfaceModifiers();
				setState(1115);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(1113);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(1114);
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
				setState(1117);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_statement);
		try {
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1120);
				blockStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1121);
				assertStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1122);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1123);
				forStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1124);
				whileStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1125);
				doWhileStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1126);
				tryStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1127);
				tryRscSpecStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1128);
				switchStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1129);
				synchronizedStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1130);
				returnStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1131);
				throwStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1132);
				breakStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1133);
				continueStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1134);
				semiStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1135);
				exprStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1136);
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
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_blockStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
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
	}

	public final AssertStmtContext assertStmt() throws RecognitionException {
		AssertStmtContext _localctx = new AssertStmtContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_assertStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			match(ASSERT);
			setState(1142);
			expression(0);
			setState(1143);
			optionColonExpression();
			setState(1144);
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
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			match(IF);
			setState(1147);
			parExpression();
			setState(1148);
			statement();
			setState(1149);
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
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(FOR);
			setState(1152);
			match(LPAREN);
			setState(1153);
			forControl();
			setState(1154);
			match(RPAREN);
			setState(1155);
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
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			match(WHILE);
			setState(1158);
			parExpression();
			setState(1159);
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
	}

	public final DoWhileStmtContext doWhileStmt() throws RecognitionException {
		DoWhileStmtContext _localctx = new DoWhileStmtContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_doWhileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			match(DO);
			setState(1162);
			statement();
			setState(1163);
			match(WHILE);
			setState(1164);
			parExpression();
			setState(1165);
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
	}

	public final TryStmtContext tryStmt() throws RecognitionException {
		TryStmtContext _localctx = new TryStmtContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_tryStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			match(TRY);
			setState(1168);
			block();
			setState(1171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(1169);
				catchClausesOrOptionFinallyBlock();
				}
				break;
			case 2:
				{
				setState(1170);
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
	}

	public final TryRscSpecStmtContext tryRscSpecStmt() throws RecognitionException {
		TryRscSpecStmtContext _localctx = new TryRscSpecStmtContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_tryRscSpecStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			match(TRY);
			setState(1174);
			resourceSpecification();
			setState(1175);
			block();
			setState(1176);
			catchClauses();
			setState(1177);
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
	}

	public final SwitchStmtContext switchStmt() throws RecognitionException {
		SwitchStmtContext _localctx = new SwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_switchStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			match(SWITCH);
			setState(1180);
			parExpression();
			setState(1181);
			match(LBRACE);
			setState(1182);
			switchBlockStatementGroups();
			setState(1183);
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
	}

	public final SynchronizedStmtContext synchronizedStmt() throws RecognitionException {
		SynchronizedStmtContext _localctx = new SynchronizedStmtContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_synchronizedStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1185);
			match(SYNCHRONIZED);
			setState(1186);
			parExpression();
			setState(1187);
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
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			match(RETURN);
			setState(1190);
			optionExpression();
			setState(1191);
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
	}

	public final ThrowStmtContext throwStmt() throws RecognitionException {
		ThrowStmtContext _localctx = new ThrowStmtContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_throwStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			match(THROW);
			setState(1194);
			expression(0);
			setState(1195);
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
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			match(BREAK);
			setState(1198);
			optionIdentifier();
			setState(1199);
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
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_continueStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			match(CONTINUE);
			setState(1202);
			optionIdentifier();
			setState(1203);
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
	}

	public final SemiStmtContext semiStmt() throws RecognitionException {
		SemiStmtContext _localctx = new SemiStmtContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_semiStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
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
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_exprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			((ExprStmtContext)_localctx).statementExpression = expression(0);
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
	}

	public final IdentifierStmtContext identifierStmt() throws RecognitionException {
		IdentifierStmtContext _localctx = new IdentifierStmtContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_identifierStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			((IdentifierStmtContext)_localctx).identifierLabel = match(IDENTIFIER);
			setState(1211);
			match(COLON);
			setState(1212);
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
	}

	public final OptionColonExpressionContext optionColonExpression() throws RecognitionException {
		OptionColonExpressionContext _localctx = new OptionColonExpressionContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_optionColonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1214);
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
	}

	public final ColonExpressionContext colonExpression() throws RecognitionException {
		ColonExpressionContext _localctx = new ColonExpressionContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_colonExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			match(COLON);
			setState(1218);
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
	}

	public final OptionElseStatementContext optionElseStatement() throws RecognitionException {
		OptionElseStatementContext _localctx = new OptionElseStatementContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_optionElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(1220);
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
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			match(ELSE);
			setState(1224);
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
	}

	public final OptionFinallyBlockContext optionFinallyBlock() throws RecognitionException {
		OptionFinallyBlockContext _localctx = new OptionFinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_optionFinallyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1226);
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
	}

	public final SwitchBlockStatementGroupsContext switchBlockStatementGroups() throws RecognitionException {
		SwitchBlockStatementGroupsContext _localctx = new SwitchBlockStatementGroupsContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_switchBlockStatementGroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1229);
				switchBlockStatementGroup();
				}
				}
				setState(1234);
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
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_switchLabels);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1236); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1235);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1238); 
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
	}

	public final CatchClausesContext catchClauses() throws RecognitionException {
		CatchClausesContext _localctx = new CatchClausesContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_catchClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1240);
				catchClause();
				}
				}
				setState(1245);
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
	}

	public final OptionExpressionContext optionExpression() throws RecognitionException {
		OptionExpressionContext _localctx = new OptionExpressionContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_optionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(1246);
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
	}

	public final CatchClausesOrOptionFinallyBlockContext catchClausesOrOptionFinallyBlock() throws RecognitionException {
		CatchClausesOrOptionFinallyBlockContext _localctx = new CatchClausesOrOptionFinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_catchClausesOrOptionFinallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			catchClauses();
			setState(1250);
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
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			match(CATCH);
			setState(1253);
			match(LPAREN);
			setState(1254);
			variableModifiers();
			setState(1255);
			catchType();
			setState(1256);
			match(IDENTIFIER);
			setState(1257);
			match(RPAREN);
			setState(1258);
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
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_catchType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			qualifiedName();
			setState(1261);
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
	}

	public final OrQualifiedNamesContext orQualifiedNames() throws RecognitionException {
		OrQualifiedNamesContext _localctx = new OrQualifiedNamesContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_orQualifiedNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1263);
				orQualifiedName();
				}
				}
				setState(1268);
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
	}

	public final OrQualifiedNameContext orQualifiedName() throws RecognitionException {
		OrQualifiedNameContext _localctx = new OrQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_orQualifiedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			match(BITOR);
			setState(1270);
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
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			match(FINALLY);
			setState(1273);
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
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_resourceSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			match(LPAREN);
			setState(1276);
			resources();
			setState(1277);
			optionSemicolon();
			setState(1278);
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
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_resources);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			resource();
			setState(1281);
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
	}

	public final SemicolonResourcesContext semicolonResources() throws RecognitionException {
		SemicolonResourcesContext _localctx = new SemicolonResourcesContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_semicolonResources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1283);
					semicolonResource();
					}
					} 
				}
				setState(1288);
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
	}

	public final SemicolonResourceContext semicolonResource() throws RecognitionException {
		SemicolonResourceContext _localctx = new SemicolonResourceContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_semicolonResource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			match(SEMI);
			setState(1290);
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
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			variableModifiers();
			setState(1293);
			classOrInterfaceType();
			setState(1294);
			variableDeclaratorId();
			setState(1295);
			match(ASSIGN);
			setState(1296);
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
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			switchLabels();
			setState(1299);
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
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_switchLabel);
		try {
			setState(1309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1301);
				match(CASE);
				setState(1304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(1302);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1303);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(1306);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1307);
				match(DEFAULT);
				setState(1308);
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
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_forControl);
		try {
			setState(1318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1311);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1312);
				optionforInit();
				setState(1313);
				match(SEMI);
				setState(1314);
				optionExpression();
				setState(1315);
				match(SEMI);
				setState(1316);
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
	}

	public final OptionforInitContext optionforInit() throws RecognitionException {
		OptionforInitContext _localctx = new OptionforInitContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_optionforInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(1320);
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
	}

	public final OptionExpressionListContext optionExpressionList() throws RecognitionException {
		OptionExpressionListContext _localctx = new OptionExpressionListContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_optionExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(1323);
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
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_forInit);
		try {
			setState(1328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1326);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1327);
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
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			variableModifiers();
			setState(1331);
			typeType();
			setState(1332);
			variableDeclaratorId();
			setState(1333);
			match(COLON);
			setState(1334);
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
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			match(LPAREN);
			setState(1337);
			expression(0);
			setState(1338);
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
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_expressionList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			expression(0);
			setState(1341);
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
	}

	public final OtherExpressionsContext otherExpressions() throws RecognitionException {
		OtherExpressionsContext _localctx = new OtherExpressionsContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_otherExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1343);
				anotherExpression();
				}
				}
				setState(1348);
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
	}

	public final AnotherExpressionContext anotherExpression() throws RecognitionException {
		AnotherExpressionContext _localctx = new AnotherExpressionContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_anotherExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			match(COMMA);
			setState(1350);
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
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_methodCall);
		try {
			setState(1367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1352);
				match(IDENTIFIER);
				setState(1353);
				match(LPAREN);
				setState(1354);
				optionExpressionList();
				setState(1355);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1357);
				match(THIS);
				setState(1358);
				match(LPAREN);
				setState(1359);
				optionExpressionList();
				setState(1360);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1362);
				match(SUPER);
				setState(1363);
				match(LPAREN);
				setState(1364);
				optionExpressionList();
				setState(1365);
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
	}
	public static class ThisExprContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public ThisExprContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	}
	public static class ArrayReadExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayReadExprContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	}
	public static class MethodCallExprContext extends ExpressionContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MethodCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LambdaExprContext extends ExpressionContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public LambdaExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesizedExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralExprContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TypedExprContext extends ExpressionContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypedExprContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	}
	public static class ExprMethodReferenceContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OptionTypeArgumentsIdentifierContext optionTypeArgumentsIdentifier() {
			return getRuleContext(OptionTypeArgumentsIdentifierContext.class,0);
		}
		public ExprMethodReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	}
	public static class ClassExprContext extends ExpressionContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public ClassExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PreAddMinusExprContext extends ExpressionContext {
		public Token prefix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PreAddMinusExprContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	}
	public static class SuperExprContext extends ExpressionContext {
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public SuperExprContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	}
	public static class NegExprContext extends ExpressionContext {
		public Token prefix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SufAddMinusExprContext extends ExpressionContext {
		public Token postfix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SufAddMinusExprContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	}
	public static class IdExprContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public IdExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 374;
		enterRecursionRule(_localctx, 374, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1370);
				match(LPAREN);
				setState(1371);
				expression(0);
				setState(1372);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ThisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1374);
				match(THIS);
				}
				break;
			case 3:
				{
				_localctx = new SuperExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1375);
				match(SUPER);
				}
				break;
			case 4:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1376);
				literal();
				}
				break;
			case 5:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1377);
				match(IDENTIFIER);
				}
				break;
			case 6:
				{
				_localctx = new ClassExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1378);
				typeTypeOrVoid();
				setState(1379);
				match(DOT);
				setState(1380);
				match(CLASS);
				}
				break;
			case 7:
				{
				_localctx = new CallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1382);
				nonWildcardTypeArguments();
				setState(1385);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case IDENTIFIER:
					{
					setState(1383);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1384);
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
				setState(1387);
				methodCall();
				}
				break;
			case 9:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1388);
				match(NEW);
				setState(1389);
				creator();
				}
				break;
			case 10:
				{
				_localctx = new TypedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1390);
				match(LPAREN);
				setState(1391);
				typeType();
				setState(1392);
				match(RPAREN);
				setState(1393);
				expression(21);
				}
				break;
			case 11:
				{
				_localctx = new PreAddMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1395);
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
				setState(1396);
				expression(19);
				}
				break;
			case 12:
				{
				_localctx = new NegExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1397);
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
				setState(1398);
				expression(18);
				}
				break;
			case 13:
				{
				_localctx = new LambdaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1399);
				lambdaExpression();
				}
				break;
			case 14:
				{
				_localctx = new TypeMethodReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1400);
				typeType();
				setState(1401);
				match(COLONCOLON);
				setState(1404);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
				case IDENTIFIER:
					{
					setState(1402);
					optionTypeArgumentsIdentifier();
					}
					break;
				case NEW:
					{
					setState(1403);
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
				setState(1406);
				classType();
				setState(1407);
				match(COLONCOLON);
				setState(1408);
				optionTypeArguments();
				setState(1409);
				match(NEW);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1480);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1413);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1414);
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
						setState(1415);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new InfixAddMinusExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1416);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1417);
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
						setState(1418);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1419);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1423);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
						case 1:
							{
							setState(1420);
							leftShift();
							}
							break;
						case 2:
							{
							setState(1421);
							unsignedRightShift();
							}
							break;
						case 3:
							{
							setState(1422);
							signedRightShift();
							}
							break;
						}
						setState(1425);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new CmpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1427);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1428);
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
						setState(1429);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new EqExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1430);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1431);
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
						setState(1432);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new BitAndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1433);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1434);
						((BitAndExprContext)_localctx).bop = match(BITAND);
						setState(1435);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new XorExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1436);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1437);
						((XorExprContext)_localctx).bop = match(CARET);
						setState(1438);
						expression(11);
						}
						break;
					case 8:
						{
						_localctx = new BitOrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1439);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1440);
						((BitOrExprContext)_localctx).bop = match(BITOR);
						setState(1441);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new LogicAndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1442);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1443);
						((LogicAndExprContext)_localctx).bop = match(AND);
						setState(1444);
						expression(9);
						}
						break;
					case 10:
						{
						_localctx = new LogicOrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1445);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1446);
						((LogicOrExprContext)_localctx).bop = match(OR);
						setState(1447);
						expression(8);
						}
						break;
					case 11:
						{
						_localctx = new CondExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1448);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1449);
						((CondExprContext)_localctx).bop = match(QUESTION);
						setState(1450);
						expression(0);
						setState(1451);
						match(COLON);
						setState(1452);
						expression(6);
						}
						break;
					case 12:
						{
						_localctx = new AssignExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1454);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1455);
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
						setState(1456);
						expression(5);
						}
						break;
					case 13:
						{
						_localctx = new DottedExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1457);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1458);
						((DottedExprContext)_localctx).bop = match(DOT);
						setState(1465);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
						case 1:
							{
							setState(1459);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(1460);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1461);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1462);
							newOptionNonWildcardTypeArgumentsInnerCreator();
							}
							break;
						case 5:
							{
							setState(1463);
							superSuperSuffix();
							}
							break;
						case 6:
							{
							setState(1464);
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
						setState(1467);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1468);
						match(LBRACK);
						setState(1469);
						expression(0);
						setState(1470);
						match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new SufAddMinusExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1472);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1473);
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
						setState(1474);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1475);
						((InstanceOfExprContext)_localctx).bop = match(INSTANCEOF);
						setState(1476);
						typeType();
						}
						break;
					case 17:
						{
						_localctx = new ExprMethodReferenceContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1477);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1478);
						match(COLONCOLON);
						setState(1479);
						optionTypeArgumentsIdentifier();
						}
						break;
					}
					} 
				}
				setState(1484);
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
	}

	public final ThisArgumentsContext thisArguments() throws RecognitionException {
		ThisArgumentsContext _localctx = new ThisArgumentsContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_thisArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			match(THIS);
			setState(1486);
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
	}

	public final NewOptionNonWildcardTypeArgumentsInnerCreatorContext newOptionNonWildcardTypeArgumentsInnerCreator() throws RecognitionException {
		NewOptionNonWildcardTypeArgumentsInnerCreatorContext _localctx = new NewOptionNonWildcardTypeArgumentsInnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_newOptionNonWildcardTypeArgumentsInnerCreator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			match(NEW);
			setState(1489);
			optionNonWildcardTypeArguments();
			setState(1490);
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
	}

	public final SuperSuperSuffixContext superSuperSuffix() throws RecognitionException {
		SuperSuperSuffixContext _localctx = new SuperSuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_superSuperSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
			match(SUPER);
			setState(1493);
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
	}

	public final OptionTypeArgumentsIdentifierContext optionTypeArgumentsIdentifier() throws RecognitionException {
		OptionTypeArgumentsIdentifierContext _localctx = new OptionTypeArgumentsIdentifierContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_optionTypeArgumentsIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			optionTypeArguments();
			setState(1496);
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
	}

	public final LeftShiftContext leftShift() throws RecognitionException {
		LeftShiftContext _localctx = new LeftShiftContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_leftShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			match(LT);
			setState(1499);
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
	}

	public final SignedRightShiftContext signedRightShift() throws RecognitionException {
		SignedRightShiftContext _localctx = new SignedRightShiftContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_signedRightShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501);
			match(GT);
			setState(1502);
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
	}

	public final UnsignedRightShiftContext unsignedRightShift() throws RecognitionException {
		UnsignedRightShiftContext _localctx = new UnsignedRightShiftContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_unsignedRightShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			match(GT);
			setState(1505);
			match(GT);
			setState(1506);
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
	}

	public final OptionNonWildcardTypeArgumentsContext optionNonWildcardTypeArguments() throws RecognitionException {
		OptionNonWildcardTypeArgumentsContext _localctx = new OptionNonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_optionNonWildcardTypeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1508);
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
	}

	public final SquaredExpressionContext squaredExpression() throws RecognitionException {
		SquaredExpressionContext _localctx = new SquaredExpressionContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_squaredExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1511);
			match(LBRACK);
			setState(1512);
			expression(0);
			setState(1513);
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
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			lambdaParameters();
			setState(1516);
			match(ARROW);
			setState(1517);
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
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_lambdaParameters);
		try {
			setState(1522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1519);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1520);
				parenthesizedOptionFormalParameterList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1521);
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
	}

	public final IdentifiersContext identifiers() throws RecognitionException {
		IdentifiersContext _localctx = new IdentifiersContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_identifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			match(IDENTIFIER);
			setState(1525);
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
	}

	public final OtherIdentifiersContext otherIdentifiers() throws RecognitionException {
		OtherIdentifiersContext _localctx = new OtherIdentifiersContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_otherIdentifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1527);
				anotherIdentifier();
				}
				}
				setState(1532);
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
	}

	public final AnotherIdentifierContext anotherIdentifier() throws RecognitionException {
		AnotherIdentifierContext _localctx = new AnotherIdentifierContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_anotherIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			match(COMMA);
			setState(1534);
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
	}

	public final ParenthesizedOptionFormalParameterListContext parenthesizedOptionFormalParameterList() throws RecognitionException {
		ParenthesizedOptionFormalParameterListContext _localctx = new ParenthesizedOptionFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_parenthesizedOptionFormalParameterList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			match(LPAREN);
			setState(1537);
			optionFormalParameterList();
			setState(1538);
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
	}

	public final ParenthesizedIdentifiersContext parenthesizedIdentifiers() throws RecognitionException {
		ParenthesizedIdentifiersContext _localctx = new ParenthesizedIdentifiersContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_parenthesizedIdentifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1540);
			match(LPAREN);
			setState(1541);
			identifiers();
			setState(1542);
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
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_lambdaBody);
		try {
			setState(1546);
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
				setState(1544);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1545);
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
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_classType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1548);
			optionClassOrInterfaceTypeDot();
			setState(1549);
			annotations();
			setState(1550);
			match(IDENTIFIER);
			setState(1551);
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
	}

	public final OptionClassOrInterfaceTypeDotContext optionClassOrInterfaceTypeDot() throws RecognitionException {
		OptionClassOrInterfaceTypeDotContext _localctx = new OptionClassOrInterfaceTypeDotContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_optionClassOrInterfaceTypeDot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(1553);
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
	}

	public final ClassOrInterfaceTypeDotContext classOrInterfaceTypeDot() throws RecognitionException {
		ClassOrInterfaceTypeDotContext _localctx = new ClassOrInterfaceTypeDotContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_classOrInterfaceTypeDot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			classOrInterfaceType();
			setState(1557);
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
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_creator);
		try {
			setState(1568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1559);
				nonWildcardTypeArguments();
				setState(1560);
				classOrInterfaceOrPrimitiveType();
				setState(1561);
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
				setState(1563);
				classOrInterfaceOrPrimitiveType();
				setState(1566);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1564);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1565);
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
	}

	public final ClassOrInterfaceOrPrimitiveTypeContext classOrInterfaceOrPrimitiveType() throws RecognitionException {
		ClassOrInterfaceOrPrimitiveTypeContext _localctx = new ClassOrInterfaceOrPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_classOrInterfaceOrPrimitiveType);
		try {
			setState(1572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1570);
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
				setState(1571);
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
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_innerCreator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			match(IDENTIFIER);
			setState(1575);
			optionNonWildcardTypeArgumentsOrDiamond();
			setState(1576);
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
	}

	public final OptionNonWildcardTypeArgumentsOrDiamondContext optionNonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		OptionNonWildcardTypeArgumentsOrDiamondContext _localctx = new OptionNonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_optionNonWildcardTypeArgumentsOrDiamond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1578);
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
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_arrayCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			match(LBRACK);
			setState(1590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1582);
				match(RBRACK);
				setState(1583);
				squares();
				setState(1584);
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
				setState(1586);
				rightSquaredExpression();
				setState(1587);
				squaredExpressions();
				setState(1588);
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
	}

	public final RightSquaredExpressionContext rightSquaredExpression() throws RecognitionException {
		RightSquaredExpressionContext _localctx = new RightSquaredExpressionContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_rightSquaredExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
			expression(0);
			setState(1593);
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
	}

	public final SquaredExpressionsContext squaredExpressions() throws RecognitionException {
		SquaredExpressionsContext _localctx = new SquaredExpressionsContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_squaredExpressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1598);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1595);
					squaredExpression();
					}
					} 
				}
				setState(1600);
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
	}

	public final RightAssocBinaryOperatorAndExpressionContext rightAssocBinaryOperatorAndExpression() throws RecognitionException {
		RightAssocBinaryOperatorAndExpressionContext _localctx = new RightAssocBinaryOperatorAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_rightAssocBinaryOperatorAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601);
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
			setState(1602);
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
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
			arguments();
			setState(1605);
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
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			nonWildcardTypeArguments();
			setState(1608);
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
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1610);
				angle();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1611);
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
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
			match(LT);
			setState(1615);
			typeList();
			setState(1616);
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
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_typeList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1618);
			typeType();
			setState(1619);
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
	}

	public final CommaTypeTypesContext commaTypeTypes() throws RecognitionException {
		CommaTypeTypesContext _localctx = new CommaTypeTypesContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_commaTypeTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1621);
				commaTypeType();
				}
				}
				setState(1626);
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
	}

	public final CommaTypeTypeContext commaTypeType() throws RecognitionException {
		CommaTypeTypeContext _localctx = new CommaTypeTypeContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_commaTypeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			match(COMMA);
			setState(1628);
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
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_typeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			optionAnnotation();
			setState(1631);
			classOrInterfaceOrPrimitiveType();
			setState(1632);
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
	}

	public final OptionAnnotationContext optionAnnotation() throws RecognitionException {
		OptionAnnotationContext _localctx = new OptionAnnotationContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_optionAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1634);
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
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
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
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1639);
			match(LT);
			setState(1640);
			optionNonEmptyTypeArguments();
			setState(1641);
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
	}

	public final OptionNonEmptyTypeArgumentsContext optionNonEmptyTypeArguments() throws RecognitionException {
		OptionNonEmptyTypeArgumentsContext _localctx = new OptionNonEmptyTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_optionNonEmptyTypeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (QUESTION - 75)) | (1L << (AT - 75)) | (1L << (IDENTIFIER - 75)))) != 0)) {
				{
				setState(1643);
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
	}

	public final NonEmptyTypeArgumentsContext nonEmptyTypeArguments() throws RecognitionException {
		NonEmptyTypeArgumentsContext _localctx = new NonEmptyTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_nonEmptyTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
			typeArgument();
			setState(1647);
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
	}

	public final OtherTypeArgumentsContext otherTypeArguments() throws RecognitionException {
		OtherTypeArgumentsContext _localctx = new OtherTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_otherTypeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1649);
				anotherTypeArgument();
				}
				}
				setState(1654);
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
	}

	public final AnotherTypeArgumentContext anotherTypeArgument() throws RecognitionException {
		AnotherTypeArgumentContext _localctx = new AnotherTypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_anotherTypeArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			match(COMMA);
			setState(1656);
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
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_superSuffix);
		try {
			setState(1660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1658);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1659);
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
	}

	public final CommaIdentifierOptionArgumentsContext commaIdentifierOptionArguments() throws RecognitionException {
		CommaIdentifierOptionArgumentsContext _localctx = new CommaIdentifierOptionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_commaIdentifierOptionArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			match(DOT);
			setState(1663);
			match(IDENTIFIER);
			setState(1664);
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
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1670);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1666);
				match(SUPER);
				setState(1667);
				superSuffix();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1668);
				match(IDENTIFIER);
				setState(1669);
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
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
			match(LPAREN);
			setState(1673);
			optionExpressionList();
			setState(1674);
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
	}

	public final OptionStaticContext optionStatic() throws RecognitionException {
		OptionStaticContext _localctx = new OptionStaticContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_optionStatic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1676);
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
	}

	public final OptionDotStarContext optionDotStar() throws RecognitionException {
		OptionDotStarContext _localctx = new OptionDotStarContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_optionDotStar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1679);
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
	}

	public final DotStarContext dotStar() throws RecognitionException {
		DotStarContext _localctx = new DotStarContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_dotStar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			match(DOT);
			setState(1683);
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
	}

	public final OptionCommaContext optionComma() throws RecognitionException {
		OptionCommaContext _localctx = new OptionCommaContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_optionComma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1685);
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
	}

	public final SquaresContext squares() throws RecognitionException {
		SquaresContext _localctx = new SquaresContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_squares);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1688);
					square();
					}
					} 
				}
				setState(1693);
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
	}

	public final SquareContext square() throws RecognitionException {
		SquareContext _localctx = new SquareContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_square);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			match(LBRACK);
			setState(1695);
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
	}

	public final OptionSemicolonContext optionSemicolon() throws RecognitionException {
		OptionSemicolonContext _localctx = new OptionSemicolonContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_optionSemicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1697);
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
	}

	public final OptionIdentifierContext optionIdentifier() throws RecognitionException {
		OptionIdentifierContext _localctx = new OptionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_optionIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1700);
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
	}

	public final AngleContext angle() throws RecognitionException {
		AngleContext _localctx = new AngleContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_angle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
			match(LT);
			setState(1704);
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
		case 187:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3q\u06ad\4\2\t\2\4"+
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
		"\3\2\3\2\3\2\3\2\3\2\3\3\5\3\u01f1\n\3\3\4\7\4\u01f4\n\4\f\4\16\4\u01f7"+
		"\13\4\3\5\7\5\u01fa\n\5\f\5\16\5\u01fd\13\5\3\6\3\6\3\6\3\6\3\6\3\7\7"+
		"\7\u0205\n\7\f\7\16\7\u0208\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0215\n\t\3\t\5\t\u0218\n\t\3\n\7\n\u021b\n\n\f\n\16\n\u021e"+
		"\13\n\3\13\7\13\u0221\n\13\f\13\16\13\u0224\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u022b\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0235\n\r\3\16\3\16"+
		"\5\16\u0239\n\16\3\17\7\17\u023c\n\17\f\17\16\17\u023f\13\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\5\21\u0249\n\21\3\22\5\22\u024c\n\22\3"+
		"\23\3\23\3\23\3\24\5\24\u0252\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\7\27\u025d\n\27\f\27\16\27\u0260\13\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\32\5\32\u026a\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\7\35\u0273\n\35\f\35\16\35\u0276\13\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \5 \u0285\n \3!\5!\u0288\n!\3\"\3\"\3"+
		"\"\3#\7#\u028e\n#\f#\16#\u0291\13#\3$\3$\3$\3%\3%\3%\3%\3%\3&\5&\u029c"+
		"\n&\3\'\5\'\u029f\n\'\3(\7(\u02a2\n(\f(\16(\u02a5\13(\3)\3)\3)\3*\3*\3"+
		"*\3*\3*\3*\3+\5+\u02b1\n+\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/\7/\u02bf"+
		"\n/\f/\16/\u02c2\13/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u02cb\n\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02d6\n\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\63\5\63\u02e0\n\63\3\64\3\64\3\64\3\65\3\65"+
		"\5\65\u02e7\n\65\3\66\3\66\5\66\u02eb\n\66\3\67\3\67\3\67\38\38\38\39"+
		"\39\39\39\39\3:\3:\3:\3:\3;\3;\3;\3;\5;\u0300\n;\3<\3<\3<\3<\3<\3<\3<"+
		"\5<\u0309\n<\3=\3=\3=\3=\3=\3>\7>\u0311\n>\f>\16>\u0314\13>\3?\3?\3?\3"+
		"@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\5B\u0328\nB\3C\3C\3C\3D\7"+
		"D\u032e\nD\fD\16D\u0331\13D\3E\3E\3E\3E\3E\3E\5E\u0339\nE\3F\3F\3F\3G"+
		"\3G\3G\3H\7H\u0342\nH\fH\16H\u0345\13H\3I\3I\3I\3J\3J\3J\3K\5K\u034e\n"+
		"K\3L\3L\3L\3M\3M\3M\3N\3N\5N\u0358\nN\3O\3O\3O\3O\3P\5P\u035f\nP\3Q\3"+
		"Q\3Q\3Q\3R\7R\u0366\nR\fR\16R\u0369\13R\3S\3S\3S\3T\3T\3T\3T\3U\5U\u0373"+
		"\nU\3V\7V\u0376\nV\fV\16V\u0379\13V\3W\3W\3W\3W\3X\3X\3X\5X\u0382\nX\3"+
		"Y\3Y\5Y\u0386\nY\3Z\3Z\3Z\3[\7[\u038c\n[\f[\16[\u038f\13[\3\\\3\\\3\\"+
		"\3]\3]\3]\3]\3^\5^\u0399\n^\3_\3_\5_\u039d\n_\3`\3`\3`\3`\3a\7a\u03a4"+
		"\na\fa\16a\u03a7\13a\3b\3b\3b\3c\5c\u03ad\nc\3d\3d\3d\3e\3e\3e\3e\3f\3"+
		"f\3f\3f\3f\3g\3g\3g\3h\7h\u03bf\nh\fh\16h\u03c2\13h\3i\3i\3i\3j\3j\3j"+
		"\3j\3j\3j\5j\u03cd\nj\3k\3k\3l\3l\3m\3m\3m\3m\3n\5n\u03d8\nn\3o\3o\3o"+
		"\3o\3p\5p\u03df\np\3q\3q\5q\u03e3\nq\3r\3r\3r\3s\7s\u03e9\ns\fs\16s\u03ec"+
		"\13s\3t\3t\3t\3u\3u\3u\3u\3v\3v\3v\5v\u03f8\nv\3w\3w\3w\3w\3w\3x\7x\u0400"+
		"\nx\fx\16x\u0403\13x\3y\3y\3y\3z\5z\u0409\nz\3{\3{\3{\3|\3|\3|\3|\3|\3"+
		"}\3}\3}\3}\3~\7~\u0418\n~\f~\16~\u041b\13~\3\177\3\177\3\177\3\177\5\177"+
		"\u0421\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\5\u0080\u0433\n\u0080\3\u0081\3\u0081\5\u0081\u0437\n\u0081\3\u0082\3"+
		"\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084\5\u0084\u0441\n"+
		"\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087"+
		"\7\u0087\u044b\n\u0087\f\u0087\16\u0087\u044e\13\u0087\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\5\u0088\u0455\n\u0088\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u008a\3\u008a\3\u008a\5\u008a\u045e\n\u008a\3\u008a\5\u008a"+
		"\u0461\n\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\5\u008b\u0474\n\u008b\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\5\u0092\u0496\n\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a"+
		"\3\u009a\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009d"+
		"\5\u009d\u04c2\n\u009d\3\u009e\3\u009e\3\u009e\3\u009f\5\u009f\u04c8\n"+
		"\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a1\5\u00a1\u04ce\n\u00a1\3\u00a2\7"+
		"\u00a2\u04d1\n\u00a2\f\u00a2\16\u00a2\u04d4\13\u00a2\3\u00a3\6\u00a3\u04d7"+
		"\n\u00a3\r\u00a3\16\u00a3\u04d8\3\u00a4\7\u00a4\u04dc\n\u00a4\f\u00a4"+
		"\16\u00a4\u04df\13\u00a4\3\u00a5\5\u00a5\u04e2\n\u00a5\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a9\7\u00a9\u04f3\n\u00a9\f\u00a9\16\u00a9"+
		"\u04f6\13\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ae\7\u00ae"+
		"\u0507\n\u00ae\f\u00ae\16\u00ae\u050a\13\u00ae\3\u00af\3\u00af\3\u00af"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u051b\n\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\5\u00b2\u0520\n\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\5\u00b3\u0529\n\u00b3\3\u00b4\5\u00b4\u052c\n\u00b4\3\u00b5\5"+
		"\u00b5\u052f\n\u00b5\3\u00b6\3\u00b6\5\u00b6\u0533\n\u00b6\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00ba\7\u00ba\u0543\n\u00ba\f\u00ba\16\u00ba\u0546"+
		"\13\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\5\u00bc\u055a\n\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\5\u00bd\u056c\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u057f\n\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0586\n\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0592"+
		"\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u05bc\n\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\7\u00bd\u05cb\n\u00bd\f\u00bd\16\u00bd\u05ce"+
		"\13\u00bd\3\u00be\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c5\5\u00c5\u05e8"+
		"\n\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u05f5\n\u00c8\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00ca\7\u00ca\u05fb\n\u00ca\f\u00ca\16\u00ca\u05fe\13\u00ca\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00ce\3\u00ce\5\u00ce\u060d\n\u00ce\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00d0\5\u00d0\u0615\n\u00d0\3\u00d1\3\u00d1\3\u00d1"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u0621"+
		"\n\u00d2\5\u00d2\u0623\n\u00d2\3\u00d3\3\u00d3\5\u00d3\u0627\n\u00d3\3"+
		"\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d5\5\u00d5\u062e\n\u00d5\3\u00d6\3"+
		"\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6"+
		"\u0639\n\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d8\7\u00d8\u063f\n\u00d8\f"+
		"\u00d8\16\u00d8\u0642\13\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00da\3\u00da"+
		"\3\u00da\3\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc\5\u00dc\u064f\n\u00dc"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00de\3\u00de\3\u00de\3\u00df\7\u00df"+
		"\u0659\n\u00df\f\u00df\16\u00df\u065c\13\u00df\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e2\5\u00e2\u0666\n\u00e2\3\u00e3"+
		"\3\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e5\5\u00e5\u066f\n\u00e5"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e7\7\u00e7\u0675\n\u00e7\f\u00e7\16\u00e7"+
		"\u0678\13\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e9\3\u00e9\5\u00e9\u067f"+
		"\n\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00eb"+
		"\5\u00eb\u0689\n\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ed\5\u00ed"+
		"\u0690\n\u00ed\3\u00ee\5\u00ee\u0693\n\u00ee\3\u00ef\3\u00ef\3\u00ef\3"+
		"\u00f0\5\u00f0\u0699\n\u00f0\3\u00f1\7\u00f1\u069c\n\u00f1\f\u00f1\16"+
		"\u00f1\u069f\13\u00f1\3\u00f2\3\u00f2\3\u00f2\3\u00f3\5\u00f3\u06a5\n"+
		"\u00f3\3\u00f4\5\u00f4\u06a8\n\u00f4\3\u00f5\3\u00f5\3\u00f5\3\u00f5\2"+
		"\3\u0178\u00f6\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130"+
		"\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148"+
		"\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160"+
		"\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178"+
		"\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190"+
		"\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8"+
		"\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0"+
		"\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8"+
		"\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\2\16\4\2\23\23**\3\2"+
		"\658\3\29:\3\2UX\3\2KL\4\2YZ^^\3\2WX\4\2IJPQ\4\2OORR\4\2HH_i\3\2UV\n\2"+
		"\5\5\7\7\n\n\20\20\26\26\35\35\37\37\'\'\2\u0686\2\u01ea\3\2\2\2\4\u01f0"+
		"\3\2\2\2\6\u01f5\3\2\2\2\b\u01fb\3\2\2\2\n\u01fe\3\2\2\2\f\u0206\3\2\2"+
		"\2\16\u0209\3\2\2\2\20\u0217\3\2\2\2\22\u021c\3\2\2\2\24\u0222\3\2\2\2"+
		"\26\u022a\3\2\2\2\30\u0234\3\2\2\2\32\u0238\3\2\2\2\34\u023d\3\2\2\2\36"+
		"\u0240\3\2\2\2 \u0248\3\2\2\2\"\u024b\3\2\2\2$\u024d\3\2\2\2&\u0251\3"+
		"\2\2\2(\u0253\3\2\2\2*\u0256\3\2\2\2,\u025e\3\2\2\2.\u0261\3\2\2\2\60"+
		"\u0264\3\2\2\2\62\u0269\3\2\2\2\64\u026b\3\2\2\2\66\u026e\3\2\2\28\u0274"+
		"\3\2\2\2:\u0277\3\2\2\2<\u027a\3\2\2\2>\u0284\3\2\2\2@\u0287\3\2\2\2B"+
		"\u0289\3\2\2\2D\u028f\3\2\2\2F\u0292\3\2\2\2H\u0295\3\2\2\2J\u029b\3\2"+
		"\2\2L\u029e\3\2\2\2N\u02a3\3\2\2\2P\u02a6\3\2\2\2R\u02a9\3\2\2\2T\u02b0"+
		"\3\2\2\2V\u02b2\3\2\2\2X\u02b5\3\2\2\2Z\u02b9\3\2\2\2\\\u02c0\3\2\2\2"+
		"^\u02ca\3\2\2\2`\u02d5\3\2\2\2b\u02d7\3\2\2\2d\u02df\3\2\2\2f\u02e1\3"+
		"\2\2\2h\u02e6\3\2\2\2j\u02ea\3\2\2\2l\u02ec\3\2\2\2n\u02ef\3\2\2\2p\u02f2"+
		"\3\2\2\2r\u02f7\3\2\2\2t\u02ff\3\2\2\2v\u0308\3\2\2\2x\u030a\3\2\2\2z"+
		"\u0312\3\2\2\2|\u0315\3\2\2\2~\u0318\3\2\2\2\u0080\u031d\3\2\2\2\u0082"+
		"\u0327\3\2\2\2\u0084\u0329\3\2\2\2\u0086\u032f\3\2\2\2\u0088\u0338\3\2"+
		"\2\2\u008a\u033a\3\2\2\2\u008c\u033d\3\2\2\2\u008e\u0343\3\2\2\2\u0090"+
		"\u0346\3\2\2\2\u0092\u0349\3\2\2\2\u0094\u034d\3\2\2\2\u0096\u034f\3\2"+
		"\2\2\u0098\u0352\3\2\2\2\u009a\u0357\3\2\2\2\u009c\u0359\3\2\2\2\u009e"+
		"\u035e\3\2\2\2\u00a0\u0360\3\2\2\2\u00a2\u0367\3\2\2\2\u00a4\u036a\3\2"+
		"\2\2\u00a6\u036d\3\2\2\2\u00a8\u0372\3\2\2\2\u00aa\u0377\3\2\2\2\u00ac"+
		"\u037a\3\2\2\2\u00ae\u0381\3\2\2\2\u00b0\u0385\3\2\2\2\u00b2\u0387\3\2"+
		"\2\2\u00b4\u038d\3\2\2\2\u00b6\u0390\3\2\2\2\u00b8\u0393\3\2\2\2\u00ba"+
		"\u0398\3\2\2\2\u00bc\u039c\3\2\2\2\u00be\u039e\3\2\2\2\u00c0\u03a5\3\2"+
		"\2\2\u00c2\u03a8\3\2\2\2\u00c4\u03ac\3\2\2\2\u00c6\u03ae\3\2\2\2\u00c8"+
		"\u03b1\3\2\2\2\u00ca\u03b5\3\2\2\2\u00cc\u03ba\3\2\2\2\u00ce\u03c0\3\2"+
		"\2\2\u00d0\u03c3\3\2\2\2\u00d2\u03cc\3\2\2\2\u00d4\u03ce\3\2\2\2\u00d6"+
		"\u03d0\3\2\2\2\u00d8\u03d2\3\2\2\2\u00da\u03d7\3\2\2\2\u00dc\u03d9\3\2"+
		"\2\2\u00de\u03de\3\2\2\2\u00e0\u03e2\3\2\2\2\u00e2\u03e4\3\2\2\2\u00e4"+
		"\u03ea\3\2\2\2\u00e6\u03ed\3\2\2\2\u00e8\u03f0\3\2\2\2\u00ea\u03f7\3\2"+
		"\2\2\u00ec\u03f9\3\2\2\2\u00ee\u0401\3\2\2\2\u00f0\u0404\3\2\2\2\u00f2"+
		"\u0408\3\2\2\2\u00f4\u040a\3\2\2\2\u00f6\u040d\3\2\2\2\u00f8\u0412\3\2"+
		"\2\2\u00fa\u0419\3\2\2\2\u00fc\u0420\3\2\2\2\u00fe\u0432\3\2\2\2\u0100"+
		"\u0436\3\2\2\2\u0102\u0438\3\2\2\2\u0104\u043d\3\2\2\2\u0106\u0440\3\2"+
		"\2\2\u0108\u0442\3\2\2\2\u010a\u0445\3\2\2\2\u010c\u044c\3\2\2\2\u010e"+
		"\u0454\3\2\2\2\u0110\u0456\3\2\2\2\u0112\u0460\3\2\2\2\u0114\u0473\3\2"+
		"\2\2\u0116\u0475\3\2\2\2\u0118\u0477\3\2\2\2\u011a\u047c\3\2\2\2\u011c"+
		"\u0481\3\2\2\2\u011e\u0487\3\2\2\2\u0120\u048b\3\2\2\2\u0122\u0491\3\2"+
		"\2\2\u0124\u0497\3\2\2\2\u0126\u049d\3\2\2\2\u0128\u04a3\3\2\2\2\u012a"+
		"\u04a7\3\2\2\2\u012c\u04ab\3\2\2\2\u012e\u04af\3\2\2\2\u0130\u04b3\3\2"+
		"\2\2\u0132\u04b7\3\2\2\2\u0134\u04b9\3\2\2\2\u0136\u04bc\3\2\2\2\u0138"+
		"\u04c1\3\2\2\2\u013a\u04c3\3\2\2\2\u013c\u04c7\3\2\2\2\u013e\u04c9\3\2"+
		"\2\2\u0140\u04cd\3\2\2\2\u0142\u04d2\3\2\2\2\u0144\u04d6\3\2\2\2\u0146"+
		"\u04dd\3\2\2\2\u0148\u04e1\3\2\2\2\u014a\u04e3\3\2\2\2\u014c\u04e6\3\2"+
		"\2\2\u014e\u04ee\3\2\2\2\u0150\u04f4\3\2\2\2\u0152\u04f7\3\2\2\2\u0154"+
		"\u04fa\3\2\2\2\u0156\u04fd\3\2\2\2\u0158\u0502\3\2\2\2\u015a\u0508\3\2"+
		"\2\2\u015c\u050b\3\2\2\2\u015e\u050e\3\2\2\2\u0160\u0514\3\2\2\2\u0162"+
		"\u051f\3\2\2\2\u0164\u0528\3\2\2\2\u0166\u052b\3\2\2\2\u0168\u052e\3\2"+
		"\2\2\u016a\u0532\3\2\2\2\u016c\u0534\3\2\2\2\u016e\u053a\3\2\2\2\u0170"+
		"\u053e\3\2\2\2\u0172\u0544\3\2\2\2\u0174\u0547\3\2\2\2\u0176\u0559\3\2"+
		"\2\2\u0178\u0585\3\2\2\2\u017a\u05cf\3\2\2\2\u017c\u05d2\3\2\2\2\u017e"+
		"\u05d6\3\2\2\2\u0180\u05d9\3\2\2\2\u0182\u05dc\3\2\2\2\u0184\u05df\3\2"+
		"\2\2\u0186\u05e2\3\2\2\2\u0188\u05e7\3\2\2\2\u018a\u05e9\3\2\2\2\u018c"+
		"\u05ed\3\2\2\2\u018e\u05f4\3\2\2\2\u0190\u05f6\3\2\2\2\u0192\u05fc\3\2"+
		"\2\2\u0194\u05ff\3\2\2\2\u0196\u0602\3\2\2\2\u0198\u0606\3\2\2\2\u019a"+
		"\u060c\3\2\2\2\u019c\u060e\3\2\2\2\u019e\u0614\3\2\2\2\u01a0\u0616\3\2"+
		"\2\2\u01a2\u0622\3\2\2\2\u01a4\u0626\3\2\2\2\u01a6\u0628\3\2\2\2\u01a8"+
		"\u062d\3\2\2\2\u01aa\u062f\3\2\2\2\u01ac\u063a\3\2\2\2\u01ae\u0640\3\2"+
		"\2\2\u01b0\u0643\3\2\2\2\u01b2\u0646\3\2\2\2\u01b4\u0649\3\2\2\2\u01b6"+
		"\u064e\3\2\2\2\u01b8\u0650\3\2\2\2\u01ba\u0654\3\2\2\2\u01bc\u065a\3\2"+
		"\2\2\u01be\u065d\3\2\2\2\u01c0\u0660\3\2\2\2\u01c2\u0665\3\2\2\2\u01c4"+
		"\u0667\3\2\2\2\u01c6\u0669\3\2\2\2\u01c8\u066e\3\2\2\2\u01ca\u0670\3\2"+
		"\2\2\u01cc\u0676\3\2\2\2\u01ce\u0679\3\2\2\2\u01d0\u067e\3\2\2\2\u01d2"+
		"\u0680\3\2\2\2\u01d4\u0688\3\2\2\2\u01d6\u068a\3\2\2\2\u01d8\u068f\3\2"+
		"\2\2\u01da\u0692\3\2\2\2\u01dc\u0694\3\2\2\2\u01de\u0698\3\2\2\2\u01e0"+
		"\u069d\3\2\2\2\u01e2\u06a0\3\2\2\2\u01e4\u06a4\3\2\2\2\u01e6\u06a7\3\2"+
		"\2\2\u01e8\u06a9\3\2\2\2\u01ea\u01eb\5\4\3\2\u01eb\u01ec\5\6\4\2\u01ec"+
		"\u01ed\5\b\5\2\u01ed\u01ee\7\2\2\3\u01ee\3\3\2\2\2\u01ef\u01f1\5\n\6\2"+
		"\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\5\3\2\2\2\u01f2\u01f4\5"+
		"\16\b\2\u01f3\u01f2\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\7\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01fa\5\20\t"+
		"\2\u01f9\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fc\t\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\5\f\7\2\u01ff"+
		"\u0200\7\"\2\2\u0200\u0201\5\u00ccg\2\u0201\u0202\7E\2\2\u0202\13\3\2"+
		"\2\2\u0203\u0205\5\u00d8m\2\u0204\u0203\3\2\2\2\u0205\u0208\3\2\2\2\u0206"+
		"\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\r\3\2\2\2\u0208\u0206\3\2\2\2"+
		"\u0209\u020a\7\33\2\2\u020a\u020b\5\u01d8\u00ed\2\u020b\u020c\5\u00cc"+
		"g\2\u020c\u020d\5\u01da\u00ee\2\u020d\u020e\7E\2\2\u020e\17\3\2\2\2\u020f"+
		"\u0214\5\22\n\2\u0210\u0215\5\36\20\2\u0211\u0215\5<\37\2\u0212\u0215"+
		"\5R*\2\u0213\u0215\5\u00f6|\2\u0214\u0210\3\2\2\2\u0214\u0211\3\2\2\2"+
		"\u0214\u0212\3\2\2\2\u0214\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0218"+
		"\7E\2\2\u0217\u020f\3\2\2\2\u0217\u0216\3\2\2\2\u0218\21\3\2\2\2\u0219"+
		"\u021b\5\30\r\2\u021a\u0219\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3"+
		"\2\2\2\u021c\u021d\3\2\2\2\u021d\23\3\2\2\2\u021e\u021c\3\2\2\2\u021f"+
		"\u0221\5\26\f\2\u0220\u021f\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3"+
		"\2\2\2\u0222\u0223\3\2\2\2\u0223\25\3\2\2\2\u0224\u0222\3\2\2\2\u0225"+
		"\u022b\5\30\r\2\u0226\u022b\7 \2\2\u0227\u022b\7,\2\2\u0228\u022b\7\60"+
		"\2\2\u0229\u022b\7\63\2\2\u022a\u0225\3\2\2\2\u022a\u0226\3\2\2\2\u022a"+
		"\u0227\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u0229\3\2\2\2\u022b\27\3\2\2"+
		"\2\u022c\u0235\5\u00d8m\2\u022d\u0235\7%\2\2\u022e\u0235\7$\2\2\u022f"+
		"\u0235\7#\2\2\u0230\u0235\7(\2\2\u0231\u0235\7\3\2\2\u0232\u0235\7\24"+
		"\2\2\u0233\u0235\7)\2\2\u0234\u022c\3\2\2\2\u0234\u022d\3\2\2\2\u0234"+
		"\u022e\3\2\2\2\u0234\u022f\3\2\2\2\u0234\u0230\3\2\2\2\u0234\u0231\3\2"+
		"\2\2\u0234\u0232\3\2\2\2\u0234\u0233\3\2\2\2\u0235\31\3\2\2\2\u0236\u0239"+
		"\7\24\2\2\u0237\u0239\5\u00d8m\2\u0238\u0236\3\2\2\2\u0238\u0237\3\2\2"+
		"\2\u0239\33\3\2\2\2\u023a\u023c\5\32\16\2\u023b\u023a\3\2\2\2\u023c\u023f"+
		"\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\35\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u0240\u0241\7\13\2\2\u0241\u0242\7q\2\2\u0242\u0243\5 "+
		"\21\2\u0243\u0244\5\"\22\2\u0244\u0245\5&\24\2\u0245\u0246\5X-\2\u0246"+
		"\37\3\2\2\2\u0247\u0249\5*\26\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2"+
		"\2\u0249!\3\2\2\2\u024a\u024c\5$\23\2\u024b\u024a\3\2\2\2\u024b\u024c"+
		"\3\2\2\2\u024c#\3\2\2\2\u024d\u024e\7\23\2\2\u024e\u024f\5\u01c0\u00e1"+
		"\2\u024f%\3\2\2\2\u0250\u0252\5(\25\2\u0251\u0250\3\2\2\2\u0251\u0252"+
		"\3\2\2\2\u0252\'\3\2\2\2\u0253\u0254\7\32\2\2\u0254\u0255\5\u01ba\u00de"+
		"\2\u0255)\3\2\2\2\u0256\u0257\7J\2\2\u0257\u0258\5\60\31\2\u0258\u0259"+
		"\5,\27\2\u0259\u025a\7I\2\2\u025a+\3\2\2\2\u025b\u025d\5.\30\2\u025c\u025b"+
		"\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"-\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0262\7F\2\2\u0262\u0263\5\60\31\2"+
		"\u0263/\3\2\2\2\u0264\u0265\5\f\7\2\u0265\u0266\7q\2\2\u0266\u0267\5\""+
		"\22\2\u0267\61\3\2\2\2\u0268\u026a\5\64\33\2\u0269\u0268\3\2\2\2\u0269"+
		"\u026a\3\2\2\2\u026a\63\3\2\2\2\u026b\u026c\7\23\2\2\u026c\u026d\5\66"+
		"\34\2\u026d\65\3\2\2\2\u026e\u026f\5\u01c0\u00e1\2\u026f\u0270\58\35\2"+
		"\u0270\67\3\2\2\2\u0271\u0273\5:\36\2\u0272\u0271\3\2\2\2\u0273\u0276"+
		"\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u02759\3\2\2\2\u0276"+
		"\u0274\3\2\2\2\u0277\u0278\7[\2\2\u0278\u0279\5\u01c0\u00e1\2\u0279;\3"+
		"\2\2\2\u027a\u027b\7\22\2\2\u027b\u027c\7q\2\2\u027c\u027d\5&\24\2\u027d"+
		"\u027e\7A\2\2\u027e\u027f\5> \2\u027f\u0280\5\u01de\u00f0\2\u0280\u0281"+
		"\5@!\2\u0281\u0282\7B\2\2\u0282=\3\2\2\2\u0283\u0285\5B\"\2\u0284\u0283"+
		"\3\2\2\2\u0284\u0285\3\2\2\2\u0285?\3\2\2\2\u0286\u0288\5P)\2\u0287\u0286"+
		"\3\2\2\2\u0287\u0288\3\2\2\2\u0288A\3\2\2\2\u0289\u028a\5H%\2\u028a\u028b"+
		"\5D#\2\u028bC\3\2\2\2\u028c\u028e\5F$\2\u028d\u028c\3\2\2\2\u028e\u0291"+
		"\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290E\3\2\2\2\u0291"+
		"\u028f\3\2\2\2\u0292\u0293\7F\2\2\u0293\u0294\5H%\2\u0294G\3\2\2\2\u0295"+
		"\u0296\5\f\7\2\u0296\u0297\7q\2\2\u0297\u0298\5J&\2\u0298\u0299\5L\'\2"+
		"\u0299I\3\2\2\2\u029a\u029c\5\u01d6\u00ec\2\u029b\u029a\3\2\2\2\u029b"+
		"\u029c\3\2\2\2\u029cK\3\2\2\2\u029d\u029f\5X-\2\u029e\u029d\3\2\2\2\u029e"+
		"\u029f\3\2\2\2\u029fM\3\2\2\2\u02a0\u02a2\5^\60\2\u02a1\u02a0\3\2\2\2"+
		"\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4O\3"+
		"\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a7\7E\2\2\u02a7\u02a8\5N(\2\u02a8"+
		"Q\3\2\2\2\u02a9\u02aa\7\36\2\2\u02aa\u02ab\7q\2\2\u02ab\u02ac\5 \21\2"+
		"\u02ac\u02ad\5T+\2\u02ad\u02ae\5Z.\2\u02aeS\3\2\2\2\u02af\u02b1\5V,\2"+
		"\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1U\3\2\2\2\u02b2\u02b3\7"+
		"\23\2\2\u02b3\u02b4\5\u01ba\u00de\2\u02b4W\3\2\2\2\u02b5\u02b6\7A\2\2"+
		"\u02b6\u02b7\5N(\2\u02b7\u02b8\7B\2\2\u02b8Y\3\2\2\2\u02b9\u02ba\7A\2"+
		"\2\u02ba\u02bb\5\\/\2\u02bb\u02bc\7B\2\2\u02bc[\3\2\2\2\u02bd\u02bf\5"+
		"t;\2\u02be\u02bd\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1]\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02cb\7E\2\2\u02c4"+
		"\u02c5\5\u01d8\u00ed\2\u02c5\u02c6\5\u010a\u0086\2\u02c6\u02cb\3\2\2\2"+
		"\u02c7\u02c8\5\24\13\2\u02c8\u02c9\5`\61\2\u02c9\u02cb\3\2\2\2\u02ca\u02c3"+
		"\3\2\2\2\u02ca\u02c4\3\2\2\2\u02ca\u02c7\3\2\2\2\u02cb_\3\2\2\2\u02cc"+
		"\u02d6\5b\62\2\u02cd\u02d6\5l\67\2\u02ce\u02d6\5r:\2\u02cf\u02d6\5p9\2"+
		"\u02d0\u02d6\5n8\2\u02d1\u02d6\5R*\2\u02d2\u02d6\5\u00f6|\2\u02d3\u02d6"+
		"\5\36\20\2\u02d4\u02d6\5<\37\2\u02d5\u02cc\3\2\2\2\u02d5\u02cd\3\2\2\2"+
		"\u02d5\u02ce\3\2\2\2\u02d5\u02cf\3\2\2\2\u02d5\u02d0\3\2\2\2\u02d5\u02d1"+
		"\3\2\2\2\u02d5\u02d2\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d4\3\2\2\2\u02d6"+
		"a\3\2\2\2\u02d7\u02d8\5j\66\2\u02d8\u02d9\7q\2\2\u02d9\u02da\5\u00b8]"+
		"\2\u02da\u02db\5\u01e0\u00f1\2\u02db\u02dc\5d\63\2\u02dc\u02dd\5h\65\2"+
		"\u02ddc\3\2\2\2\u02de\u02e0\5f\64\2\u02df\u02de\3\2\2\2\u02df\u02e0\3"+
		"\2\2\2\u02e0e\3\2\2\2\u02e1\u02e2\7/\2\2\u02e2\u02e3\5\u00b2Z\2\u02e3"+
		"g\3\2\2\2\u02e4\u02e7\5\u010a\u0086\2\u02e5\u02e7\7E\2\2\u02e6\u02e4\3"+
		"\2\2\2\u02e6\u02e5\3\2\2\2\u02e7i\3\2\2\2\u02e8\u02eb\5\u01c0\u00e1\2"+
		"\u02e9\u02eb\7\62\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02e9\3\2\2\2\u02ebk\3"+
		"\2\2\2\u02ec\u02ed\5*\26\2\u02ed\u02ee\5b\62\2\u02eem\3\2\2\2\u02ef\u02f0"+
		"\5*\26\2\u02f0\u02f1\5p9\2\u02f1o\3\2\2\2\u02f2\u02f3\7q\2\2\u02f3\u02f4"+
		"\5\u00b8]\2\u02f4\u02f5\5d\63\2\u02f5\u02f6\5\u010a\u0086\2\u02f6q\3\2"+
		"\2\2\u02f7\u02f8\5\u01c0\u00e1\2\u02f8\u02f9\5\u008cG\2\u02f9\u02fa\7"+
		"E\2\2\u02fas\3\2\2\2\u02fb\u02fc\5\24\13\2\u02fc\u02fd\5v<\2\u02fd\u0300"+
		"\3\2\2\2\u02fe\u0300\7E\2\2\u02ff\u02fb\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300"+
		"u\3\2\2\2\u0301\u0309\5x=\2\u0302\u0309\5\u0080A\2\u0303\u0309\5\u008a"+
		"F\2\u0304\u0309\5R*\2\u0305\u0309\5\u00f6|\2\u0306\u0309\5\36\20\2\u0307"+
		"\u0309\5<\37\2\u0308\u0301\3\2\2\2\u0308\u0302\3\2\2\2\u0308\u0303\3\2"+
		"\2\2\u0308\u0304\3\2\2\2\u0308\u0305\3\2\2\2\u0308\u0306\3\2\2\2\u0308"+
		"\u0307\3\2\2\2\u0309w\3\2\2\2\u030a\u030b\5\u01c0\u00e1\2\u030b\u030c"+
		"\5~@\2\u030c\u030d\5z>\2\u030d\u030e\7E\2\2\u030ey\3\2\2\2\u030f\u0311"+
		"\5|?\2\u0310\u030f\3\2\2\2\u0311\u0314\3\2\2\2\u0312\u0310\3\2\2\2\u0312"+
		"\u0313\3\2\2\2\u0313{\3\2\2\2\u0314\u0312\3\2\2\2\u0315\u0316\7F\2\2\u0316"+
		"\u0317\5~@\2\u0317}\3\2\2\2\u0318\u0319\7q\2\2\u0319\u031a\5\u01e0\u00f1"+
		"\2\u031a\u031b\7H\2\2\u031b\u031c\5\u009aN\2\u031c\177\3\2\2\2\u031d\u031e"+
		"\5\u0086D\2\u031e\u031f\5\u0082B\2\u031f\u0320\5j\66\2\u0320\u0321\7q"+
		"\2\2\u0321\u0322\5\u00b8]\2\u0322\u0323\5\u01e0\u00f1\2\u0323\u0324\5"+
		"d\63\2\u0324\u0325\5h\65\2\u0325\u0081\3\2\2\2\u0326\u0328\5\u0084C\2"+
		"\u0327\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0083\3\2\2\2\u0329\u032a"+
		"\5*\26\2\u032a\u032b\5\f\7\2\u032b\u0085\3\2\2\2\u032c\u032e\5\u0088E"+
		"\2\u032d\u032c\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330"+
		"\3\2\2\2\u0330\u0087\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0339\5\u00d8m"+
		"\2\u0333\u0339\7%\2\2\u0334\u0339\7\3\2\2\u0335\u0339\7\16\2\2\u0336\u0339"+
		"\7(\2\2\u0337\u0339\7)\2\2\u0338\u0332\3\2\2\2\u0338\u0333\3\2\2\2\u0338"+
		"\u0334\3\2\2\2\u0338\u0335\3\2\2\2\u0338\u0336\3\2\2\2\u0338\u0337\3\2"+
		"\2\2\u0339\u0089\3\2\2\2\u033a\u033b\5*\26\2\u033b\u033c\5\u0080A\2\u033c"+
		"\u008b\3\2\2\2\u033d\u033e\5\u0092J\2\u033e\u033f\5\u008eH\2\u033f\u008d"+
		"\3\2\2\2\u0340\u0342\5\u0090I\2\u0341\u0340\3\2\2\2\u0342\u0345\3\2\2"+
		"\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u008f\3\2\2\2\u0345\u0343"+
		"\3\2\2\2\u0346\u0347\7F\2\2\u0347\u0348\5\u0092J\2\u0348\u0091\3\2\2\2"+
		"\u0349\u034a\5\u0098M\2\u034a\u034b\5\u0094K\2\u034b\u0093\3\2\2\2\u034c"+
		"\u034e\5\u0096L\2\u034d\u034c\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0095"+
		"\3\2\2\2\u034f\u0350\7H\2\2\u0350\u0351\5\u009aN\2\u0351\u0097\3\2\2\2"+
		"\u0352\u0353\7q\2\2\u0353\u0354\5\u01e0\u00f1\2\u0354\u0099\3\2\2\2\u0355"+
		"\u0358\5\u009cO\2\u0356\u0358\5\u0178\u00bd\2\u0357\u0355\3\2\2\2\u0357"+
		"\u0356\3\2\2\2\u0358\u009b\3\2\2\2\u0359\u035a\7A\2\2\u035a\u035b\5\u009e"+
		"P\2\u035b\u035c\7B\2\2\u035c\u009d\3\2\2\2\u035d\u035f\5\u00a0Q\2\u035e"+
		"\u035d\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u009f\3\2\2\2\u0360\u0361\5\u009a"+
		"N\2\u0361\u0362\5\u00a2R\2\u0362\u0363\5\u01de\u00f0\2\u0363\u00a1\3\2"+
		"\2\2\u0364\u0366\5\u00a4S\2\u0365\u0364\3\2\2\2\u0366\u0369\3\2\2\2\u0367"+
		"\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u00a3\3\2\2\2\u0369\u0367\3\2"+
		"\2\2\u036a\u036b\7F\2\2\u036b\u036c\5\u009aN\2\u036c\u00a5\3\2\2\2\u036d"+
		"\u036e\7q\2\2\u036e\u036f\5\u00a8U\2\u036f\u0370\5\u00aaV\2\u0370\u00a7"+
		"\3\2\2\2\u0371\u0373\5\u01c6\u00e4\2\u0372\u0371\3\2\2\2\u0372\u0373\3"+
		"\2\2\2\u0373\u00a9\3\2\2\2\u0374\u0376\5\u00acW\2\u0375\u0374\3\2\2\2"+
		"\u0376\u0379\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u00ab"+
		"\3\2\2\2\u0379\u0377\3\2\2\2\u037a\u037b\7G\2\2\u037b\u037c\7q\2\2\u037c"+
		"\u037d\5\u00a8U\2\u037d\u00ad\3\2\2\2\u037e\u0382\5\u01c0\u00e1\2\u037f"+
		"\u0380\7M\2\2\u0380\u0382\5\u00b0Y\2\u0381\u037e\3\2\2\2\u0381\u037f\3"+
		"\2\2\2\u0382\u00af\3\2\2\2\u0383\u0384\t\2\2\2\u0384\u0386\5\u01c0\u00e1"+
		"\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u00b1\3\2\2\2\u0387\u0388"+
		"\5\u00ccg\2\u0388\u0389\5\u00b4[\2\u0389\u00b3\3\2\2\2\u038a\u038c\5\u00b6"+
		"\\\2\u038b\u038a\3\2\2\2\u038c\u038f\3\2\2\2\u038d\u038b\3\2\2\2\u038d"+
		"\u038e\3\2\2\2\u038e\u00b5\3\2\2\2\u038f\u038d\3\2\2\2\u0390\u0391\7F"+
		"\2\2\u0391\u0392\5\u00ccg\2\u0392\u00b7\3\2\2\2\u0393\u0394\7?\2\2\u0394"+
		"\u0395\5\u00ba^\2\u0395\u0396\7@\2\2\u0396\u00b9\3\2\2\2\u0397\u0399\5"+
		"\u00bc_\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u00bb\3\2\2\2"+
		"\u039a\u039d\5\u00be`\2\u039b\u039d\5\u00caf\2\u039c\u039a\3\2\2\2\u039c"+
		"\u039b\3\2\2\2\u039d\u00bd\3\2\2\2\u039e\u039f\5\u00c8e\2\u039f\u03a0"+
		"\5\u00c0a\2\u03a0\u03a1\5\u00c4c\2\u03a1\u00bf\3\2\2\2\u03a2\u03a4\5\u00c2"+
		"b\2\u03a3\u03a2\3\2\2\2\u03a4\u03a7\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a5"+
		"\u03a6\3\2\2\2\u03a6\u00c1\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a8\u03a9\7F"+
		"\2\2\u03a9\u03aa\5\u00c8e\2\u03aa\u00c3\3\2\2\2\u03ab\u03ad\5\u00c6d\2"+
		"\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u00c5\3\2\2\2\u03ae\u03af"+
		"\7F\2\2\u03af\u03b0\5\u00caf\2\u03b0\u00c7\3\2\2\2\u03b1\u03b2\5\34\17"+
		"\2\u03b2\u03b3\5\u01c0\u00e1\2\u03b3\u03b4\5\u0098M\2\u03b4\u00c9\3\2"+
		"\2\2\u03b5\u03b6\5\34\17\2\u03b6\u03b7\5\u01c0\u00e1\2\u03b7\u03b8\7m"+
		"\2\2\u03b8\u03b9\5\u0098M\2\u03b9\u00cb\3\2\2\2\u03ba\u03bb\7q\2\2\u03bb"+
		"\u03bc\5\u00ceh\2\u03bc\u00cd\3\2\2\2\u03bd\u03bf\5\u00d0i\2\u03be\u03bd"+
		"\3\2\2\2\u03bf\u03c2\3\2\2\2\u03c0\u03be\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1"+
		"\u00cf\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c3\u03c4\7G\2\2\u03c4\u03c5\7q\2"+
		"\2\u03c5\u00d1\3\2\2\2\u03c6\u03cd\5\u00d4k\2\u03c7\u03cd\5\u00d6l\2\u03c8"+
		"\u03cd\7<\2\2\u03c9\u03cd\7=\2\2\u03ca\u03cd\7;\2\2\u03cb\u03cd\7>\2\2"+
		"\u03cc\u03c6\3\2\2\2\u03cc\u03c7\3\2\2\2\u03cc\u03c8\3\2\2\2\u03cc\u03c9"+
		"\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cc\u03cb\3\2\2\2\u03cd\u00d3\3\2\2\2\u03ce"+
		"\u03cf\t\3\2\2\u03cf\u00d5\3\2\2\2\u03d0\u03d1\t\4\2\2\u03d1\u00d7\3\2"+
		"\2\2\u03d2\u03d3\7l\2\2\u03d3\u03d4\5\u00ccg\2\u03d4\u03d5\5\u00dan\2"+
		"\u03d5\u00d9\3\2\2\2\u03d6\u03d8\5\u00dco\2\u03d7\u03d6\3\2\2\2\u03d7"+
		"\u03d8\3\2\2\2\u03d8\u00db\3\2\2\2\u03d9\u03da\7?\2\2\u03da\u03db\5\u00de"+
		"p\2\u03db\u03dc\7@\2\2\u03dc\u00dd\3\2\2\2\u03dd\u03df\5\u00e0q\2\u03de"+
		"\u03dd\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u00df\3\2\2\2\u03e0\u03e3\5\u00e2"+
		"r\2\u03e1\u03e3\5\u00eav\2\u03e2\u03e0\3\2\2\2\u03e2\u03e1\3\2\2\2\u03e3"+
		"\u00e1\3\2\2\2\u03e4\u03e5\5\u00e8u\2\u03e5\u03e6\5\u00e4s\2\u03e6\u00e3"+
		"\3\2\2\2\u03e7\u03e9\5\u00e6t\2\u03e8\u03e7\3\2\2\2\u03e9\u03ec\3\2\2"+
		"\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u00e5\3\2\2\2\u03ec\u03ea"+
		"\3\2\2\2\u03ed\u03ee\7F\2\2\u03ee\u03ef\5\u00e8u\2\u03ef\u00e7\3\2\2\2"+
		"\u03f0\u03f1\7q\2\2\u03f1\u03f2\7H\2\2\u03f2\u03f3\5\u00eav\2\u03f3\u00e9"+
		"\3\2\2\2\u03f4\u03f8\5\u0178\u00bd\2\u03f5\u03f8\5\u00d8m\2\u03f6\u03f8"+
		"\5\u00ecw\2\u03f7\u03f4\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f6\3\2\2"+
		"\2\u03f8\u00eb\3\2\2\2\u03f9\u03fa\7A\2\2\u03fa\u03fb\5\u00f2z\2\u03fb"+
		"\u03fc\5\u01de\u00f0\2\u03fc\u03fd\7B\2\2\u03fd\u00ed\3\2\2\2\u03fe\u0400"+
		"\5\u00f0y\2\u03ff\u03fe\3\2\2\2\u0400\u0403\3\2\2\2\u0401\u03ff\3\2\2"+
		"\2\u0401\u0402\3\2\2\2\u0402\u00ef\3\2\2\2\u0403\u0401\3\2\2\2\u0404\u0405"+
		"\7F\2\2\u0405\u0406\5\u00eav\2\u0406\u00f1\3\2\2\2\u0407\u0409\5\u00f4"+
		"{\2\u0408\u0407\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u00f3\3\2\2\2\u040a"+
		"\u040b\5\u00eav\2\u040b\u040c\5\u00eex\2\u040c\u00f5\3\2\2\2\u040d\u040e"+
		"\7l\2\2\u040e\u040f\7\36\2\2\u040f\u0410\7q\2\2\u0410\u0411\5\u00f8}\2"+
		"\u0411\u00f7\3\2\2\2\u0412\u0413\7A\2\2\u0413\u0414\5\u00fa~\2\u0414\u0415"+
		"\7B\2\2\u0415\u00f9\3\2\2\2\u0416\u0418\5\u00fc\177\2\u0417\u0416\3\2"+
		"\2\2\u0418\u041b\3\2\2\2\u0419\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041a"+
		"\u00fb\3\2\2\2\u041b\u0419\3\2\2\2\u041c\u041d\5\24\13\2\u041d\u041e\5"+
		"\u00fe\u0080\2\u041e\u0421\3\2\2\2\u041f\u0421\7E\2\2\u0420\u041c\3\2"+
		"\2\2\u0420\u041f\3\2\2\2\u0421\u00fd\3\2\2\2\u0422\u0423\5\u01c0\u00e1"+
		"\2\u0423\u0424\5\u0100\u0081\2\u0424\u0425\7E\2\2\u0425\u0433\3\2\2\2"+
		"\u0426\u0427\5\36\20\2\u0427\u0428\5\u01e4\u00f3\2\u0428\u0433\3\2\2\2"+
		"\u0429\u042a\5R*\2\u042a\u042b\5\u01e4\u00f3\2\u042b\u0433\3\2\2\2\u042c"+
		"\u042d\5<\37\2\u042d\u042e\5\u01e4\u00f3\2\u042e\u0433\3\2\2\2\u042f\u0430"+
		"\5\u00f6|\2\u0430\u0431\5\u01e4\u00f3\2\u0431\u0433\3\2\2\2\u0432\u0422"+
		"\3\2\2\2\u0432\u0426\3\2\2\2\u0432\u0429\3\2\2\2\u0432\u042c\3\2\2\2\u0432"+
		"\u042f\3\2\2\2\u0433\u00ff\3\2\2\2\u0434\u0437\5\u0102\u0082\2\u0435\u0437"+
		"\5\u0104\u0083\2\u0436\u0434\3\2\2\2\u0436\u0435\3\2\2\2\u0437\u0101\3"+
		"\2\2\2\u0438\u0439\7q\2\2\u0439\u043a\7?\2\2\u043a\u043b\7@\2\2\u043b"+
		"\u043c\5\u0106\u0084\2\u043c\u0103\3\2\2\2\u043d\u043e\5\u008cG\2\u043e"+
		"\u0105\3\2\2\2\u043f\u0441\5\u0108\u0085\2\u0440\u043f\3\2\2\2\u0440\u0441"+
		"\3\2\2\2\u0441\u0107\3\2\2\2\u0442\u0443\7\16\2\2\u0443\u0444\5\u00ea"+
		"v\2\u0444\u0109\3\2\2\2\u0445\u0446\7A\2\2\u0446\u0447\5\u010c\u0087\2"+
		"\u0447\u0448\7B\2\2\u0448\u010b\3\2\2\2\u0449\u044b\5\u010e\u0088\2\u044a"+
		"\u0449\3\2\2\2\u044b\u044e\3\2\2\2\u044c\u044a\3\2\2\2\u044c\u044d\3\2"+
		"\2\2\u044d\u010d\3\2\2\2\u044e\u044c\3\2\2\2\u044f\u0450\5\u0110\u0089"+
		"\2\u0450\u0451\7E\2\2\u0451\u0455\3\2\2\2\u0452\u0455\5\u0114\u008b\2"+
		"\u0453\u0455\5\u0112\u008a\2\u0454\u044f\3\2\2\2\u0454\u0452\3\2\2\2\u0454"+
		"\u0453\3\2\2\2\u0455\u010f\3\2\2\2\u0456\u0457\5\34\17\2\u0457\u0458\5"+
		"\u01c0\u00e1\2\u0458\u0459\5\u008cG\2\u0459\u0111\3\2\2\2\u045a\u045d"+
		"\5\22\n\2\u045b\u045e\5\36\20\2\u045c\u045e\5R*\2\u045d\u045b\3\2\2\2"+
		"\u045d\u045c\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u0461\7E\2\2\u0460\u045a"+
		"\3\2\2\2\u0460\u045f\3\2\2\2\u0461\u0113\3\2\2\2\u0462\u0474\5\u0116\u008c"+
		"\2\u0463\u0474\5\u0118\u008d\2\u0464\u0474\5\u011a\u008e\2\u0465\u0474"+
		"\5\u011c\u008f\2\u0466\u0474\5\u011e\u0090\2\u0467\u0474\5\u0120\u0091"+
		"\2\u0468\u0474\5\u0122\u0092\2\u0469\u0474\5\u0124\u0093\2\u046a\u0474"+
		"\5\u0126\u0094\2\u046b\u0474\5\u0128\u0095\2\u046c\u0474\5\u012a\u0096"+
		"\2\u046d\u0474\5\u012c\u0097\2\u046e\u0474\5\u012e\u0098\2\u046f\u0474"+
		"\5\u0130\u0099\2\u0470\u0474\5\u0132\u009a\2\u0471\u0474\5\u0134\u009b"+
		"\2\u0472\u0474\5\u0136\u009c\2\u0473\u0462\3\2\2\2\u0473\u0463\3\2\2\2"+
		"\u0473\u0464\3\2\2\2\u0473\u0465\3\2\2\2\u0473\u0466\3\2\2\2\u0473\u0467"+
		"\3\2\2\2\u0473\u0468\3\2\2\2\u0473\u0469\3\2\2\2\u0473\u046a\3\2\2\2\u0473"+
		"\u046b\3\2\2\2\u0473\u046c\3\2\2\2\u0473\u046d\3\2\2\2\u0473\u046e\3\2"+
		"\2\2\u0473\u046f\3\2\2\2\u0473\u0470\3\2\2\2\u0473\u0471\3\2\2\2\u0473"+
		"\u0472\3\2\2\2\u0474\u0115\3\2\2\2\u0475\u0476\5\u010a\u0086\2\u0476\u0117"+
		"\3\2\2\2\u0477\u0478\7\4\2\2\u0478\u0479\5\u0178\u00bd\2\u0479\u047a\5"+
		"\u0138\u009d\2\u047a\u047b\7E\2\2\u047b\u0119\3\2\2\2\u047c\u047d\7\30"+
		"\2\2\u047d\u047e\5\u016e\u00b8\2\u047e\u047f\5\u0114\u008b\2\u047f\u0480"+
		"\5\u013c\u009f\2\u0480\u011b\3\2\2\2\u0481\u0482\7\27\2\2\u0482\u0483"+
		"\7?\2\2\u0483\u0484\5\u0164\u00b3\2\u0484\u0485\7@\2\2\u0485\u0486\5\u0114"+
		"\u008b\2\u0486\u011d\3\2\2\2\u0487\u0488\7\64\2\2\u0488\u0489\5\u016e"+
		"\u00b8\2\u0489\u048a\5\u0114\u008b\2\u048a\u011f\3\2\2\2\u048b\u048c\7"+
		"\17\2\2\u048c\u048d\5\u0114\u008b\2\u048d\u048e\7\64\2\2\u048e\u048f\5"+
		"\u016e\u00b8\2\u048f\u0490\7E\2\2\u0490\u0121\3\2\2\2\u0491\u0492\7\61"+
		"\2\2\u0492\u0495\5\u010a\u0086\2\u0493\u0496\5\u014a\u00a6\2\u0494\u0496"+
		"\5\u0154\u00ab\2\u0495\u0493\3\2\2\2\u0495\u0494\3\2\2\2\u0496\u0123\3"+
		"\2\2\2\u0497\u0498\7\61\2\2\u0498\u0499\5\u0156\u00ac\2\u0499\u049a\5"+
		"\u010a\u0086\2\u049a\u049b\5\u0146\u00a4\2\u049b\u049c\5\u0140\u00a1\2"+
		"\u049c\u0125\3\2\2\2\u049d\u049e\7+\2\2\u049e\u049f\5\u016e\u00b8\2\u049f"+
		"\u04a0\7A\2\2\u04a0\u04a1\5\u0142\u00a2\2\u04a1\u04a2\7B\2\2\u04a2\u0127"+
		"\3\2\2\2\u04a3\u04a4\7,\2\2\u04a4\u04a5\5\u016e\u00b8\2\u04a5\u04a6\5"+
		"\u010a\u0086\2\u04a6\u0129\3\2\2\2\u04a7\u04a8\7&\2\2\u04a8\u04a9\5\u0148"+
		"\u00a5\2\u04a9\u04aa\7E\2\2\u04aa\u012b\3\2\2\2\u04ab\u04ac\7.\2\2\u04ac"+
		"\u04ad\5\u0178\u00bd\2\u04ad\u04ae\7E\2\2\u04ae\u012d\3\2\2\2\u04af\u04b0"+
		"\7\6\2\2\u04b0\u04b1\5\u01e6\u00f4\2\u04b1\u04b2\7E\2\2\u04b2\u012f\3"+
		"\2\2\2\u04b3\u04b4\7\r\2\2\u04b4\u04b5\5\u01e6\u00f4\2\u04b5\u04b6\7E"+
		"\2\2\u04b6\u0131\3\2\2\2\u04b7\u04b8\7E\2\2\u04b8\u0133\3\2\2\2\u04b9"+
		"\u04ba\5\u0178\u00bd\2\u04ba\u04bb\7E\2\2\u04bb\u0135\3\2\2\2\u04bc\u04bd"+
		"\7q\2\2\u04bd\u04be\7N\2\2\u04be\u04bf\5\u0114\u008b\2\u04bf\u0137\3\2"+
		"\2\2\u04c0\u04c2\5\u013a\u009e\2\u04c1\u04c0\3\2\2\2\u04c1\u04c2\3\2\2"+
		"\2\u04c2\u0139\3\2\2\2\u04c3\u04c4\7N\2\2\u04c4\u04c5\5\u0178\u00bd\2"+
		"\u04c5\u013b\3\2\2\2\u04c6\u04c8\5\u013e\u00a0\2\u04c7\u04c6\3\2\2\2\u04c7"+
		"\u04c8\3\2\2\2\u04c8\u013d\3\2\2\2\u04c9\u04ca\7\21\2\2\u04ca\u04cb\5"+
		"\u0114\u008b\2\u04cb\u013f\3\2\2\2\u04cc\u04ce\5\u0154\u00ab\2\u04cd\u04cc"+
		"\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u0141\3\2\2\2\u04cf\u04d1\5\u0160\u00b1"+
		"\2\u04d0\u04cf\3\2\2\2\u04d1\u04d4\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d2\u04d3"+
		"\3\2\2\2\u04d3\u0143\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d5\u04d7\5\u0162\u00b2"+
		"\2\u04d6\u04d5\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d8\u04d9"+
		"\3\2\2\2\u04d9\u0145\3\2\2\2\u04da\u04dc\5\u014c\u00a7\2\u04db\u04da\3"+
		"\2\2\2\u04dc\u04df\3\2\2\2\u04dd\u04db\3\2\2\2\u04dd\u04de\3\2\2\2\u04de"+
		"\u0147\3\2\2\2\u04df\u04dd\3\2\2\2\u04e0\u04e2\5\u0178\u00bd\2\u04e1\u04e0"+
		"\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u0149\3\2\2\2\u04e3\u04e4\5\u0146\u00a4"+
		"\2\u04e4\u04e5\5\u0140\u00a1\2\u04e5\u014b\3\2\2\2\u04e6\u04e7\7\t\2\2"+
		"\u04e7\u04e8\7?\2\2\u04e8\u04e9\5\34\17\2\u04e9\u04ea\5\u014e\u00a8\2"+
		"\u04ea\u04eb\7q\2\2\u04eb\u04ec\7@\2\2\u04ec\u04ed\5\u010a\u0086\2\u04ed"+
		"\u014d\3\2\2\2\u04ee\u04ef\5\u00ccg\2\u04ef\u04f0\5\u0150\u00a9\2\u04f0"+
		"\u014f\3\2\2\2\u04f1\u04f3\5\u0152\u00aa\2\u04f2\u04f1\3\2\2\2\u04f3\u04f6"+
		"\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u0151\3\2\2\2\u04f6"+
		"\u04f4\3\2\2\2\u04f7\u04f8\7\\\2\2\u04f8\u04f9\5\u00ccg\2\u04f9\u0153"+
		"\3\2\2\2\u04fa\u04fb\7\25\2\2\u04fb\u04fc\5\u010a\u0086\2\u04fc\u0155"+
		"\3\2\2\2\u04fd\u04fe\7?\2\2\u04fe\u04ff\5\u0158\u00ad\2\u04ff\u0500\5"+
		"\u01e4\u00f3\2\u0500\u0501\7@\2\2\u0501\u0157\3\2\2\2\u0502\u0503\5\u015e"+
		"\u00b0\2\u0503\u0504\5\u015a\u00ae\2\u0504\u0159\3\2\2\2\u0505\u0507\5"+
		"\u015c\u00af\2\u0506\u0505\3\2\2\2\u0507\u050a\3\2\2\2\u0508\u0506\3\2"+
		"\2\2\u0508\u0509\3\2\2\2\u0509\u015b\3\2\2\2\u050a\u0508\3\2\2\2\u050b"+
		"\u050c\7E\2\2\u050c\u050d\5\u015e\u00b0\2\u050d\u015d\3\2\2\2\u050e\u050f"+
		"\5\34\17\2\u050f\u0510\5\u00a6T\2\u0510\u0511\5\u0098M\2\u0511\u0512\7"+
		"H\2\2\u0512\u0513\5\u0178\u00bd\2\u0513\u015f\3\2\2\2\u0514\u0515\5\u0144"+
		"\u00a3\2\u0515\u0516\5\u010c\u0087\2\u0516\u0161\3\2\2\2\u0517\u051a\7"+
		"\b\2\2\u0518\u051b\5\u0178\u00bd\2\u0519\u051b\7q\2\2\u051a\u0518\3\2"+
		"\2\2\u051a\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u0520\7N\2\2\u051d"+
		"\u051e\7\16\2\2\u051e\u0520\7N\2\2\u051f\u0517\3\2\2\2\u051f\u051d\3\2"+
		"\2\2\u0520\u0163\3\2\2\2\u0521\u0529\5\u016c\u00b7\2\u0522\u0523\5\u0166"+
		"\u00b4\2\u0523\u0524\7E\2\2\u0524\u0525\5\u0148\u00a5\2\u0525\u0526\7"+
		"E\2\2\u0526\u0527\5\u0168\u00b5\2\u0527\u0529\3\2\2\2\u0528\u0521\3\2"+
		"\2\2\u0528\u0522\3\2\2\2\u0529\u0165\3\2\2\2\u052a\u052c\5\u016a\u00b6"+
		"\2\u052b\u052a\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u0167\3\2\2\2\u052d\u052f"+
		"\5\u0170\u00b9\2\u052e\u052d\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0169\3"+
		"\2\2\2\u0530\u0533\5\u0110\u0089\2\u0531\u0533\5\u0170\u00b9\2\u0532\u0530"+
		"\3\2\2\2\u0532\u0531\3\2\2\2\u0533\u016b\3\2\2\2\u0534\u0535\5\34\17\2"+
		"\u0535\u0536\5\u01c0\u00e1\2\u0536\u0537\5\u0098M\2\u0537\u0538\7N\2\2"+
		"\u0538\u0539\5\u0178\u00bd\2\u0539\u016d\3\2\2\2\u053a\u053b\7?\2\2\u053b"+
		"\u053c\5\u0178\u00bd\2\u053c\u053d\7@\2\2\u053d\u016f\3\2\2\2\u053e\u053f"+
		"\5\u0178\u00bd\2\u053f\u0540\5\u0172\u00ba\2\u0540\u0171\3\2\2\2\u0541"+
		"\u0543\5\u0174\u00bb\2\u0542\u0541\3\2\2\2\u0543\u0546\3\2\2\2\u0544\u0542"+
		"\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0173\3\2\2\2\u0546\u0544\3\2\2\2\u0547"+
		"\u0548\7F\2\2\u0548\u0549\5\u0178\u00bd\2\u0549\u0175\3\2\2\2\u054a\u054b"+
		"\7q\2\2\u054b\u054c\7?\2\2\u054c\u054d\5\u0168\u00b5\2\u054d\u054e\7@"+
		"\2\2\u054e\u055a\3\2\2\2\u054f\u0550\7-\2\2\u0550\u0551\7?\2\2\u0551\u0552"+
		"\5\u0168\u00b5\2\u0552\u0553\7@\2\2\u0553\u055a\3\2\2\2\u0554\u0555\7"+
		"*\2\2\u0555\u0556\7?\2\2\u0556\u0557\5\u0168\u00b5\2\u0557\u0558\7@\2"+
		"\2\u0558\u055a\3\2\2\2\u0559\u054a\3\2\2\2\u0559\u054f\3\2\2\2\u0559\u0554"+
		"\3\2\2\2\u055a\u0177\3\2\2\2\u055b\u055c\b\u00bd\1\2\u055c\u055d\7?\2"+
		"\2\u055d\u055e\5\u0178\u00bd\2\u055e\u055f\7@\2\2\u055f\u0586\3\2\2\2"+
		"\u0560\u0586\7-\2\2\u0561\u0586\7*\2\2\u0562\u0586\5\u00d2j\2\u0563\u0586"+
		"\7q\2\2\u0564\u0565\5j\66\2\u0565\u0566\7G\2\2\u0566\u0567\7\13\2\2\u0567"+
		"\u0586\3\2\2\2\u0568\u056b\5\u01b8\u00dd\2\u0569\u056c\5\u01d4\u00eb\2"+
		"\u056a\u056c\5\u017a\u00be\2\u056b\u0569\3\2\2\2\u056b\u056a\3\2\2\2\u056c"+
		"\u0586\3\2\2\2\u056d\u0586\5\u0176\u00bc\2\u056e\u056f\7!\2\2\u056f\u0586"+
		"\5\u01a2\u00d2\2\u0570\u0571\7?\2\2\u0571\u0572\5\u01c0\u00e1\2\u0572"+
		"\u0573\7@\2\2\u0573\u0574\5\u0178\u00bd\27\u0574\u0586\3\2\2\2\u0575\u0576"+
		"\t\5\2\2\u0576\u0586\5\u0178\u00bd\25\u0577\u0578\t\6\2\2\u0578\u0586"+
		"\5\u0178\u00bd\24\u0579\u0586\5\u018c\u00c7\2\u057a\u057b\5\u01c0\u00e1"+
		"\2\u057b\u057e\7k\2\2\u057c\u057f\5\u0180\u00c1\2\u057d\u057f\7!\2\2\u057e"+
		"\u057c\3\2\2\2\u057e\u057d\3\2\2\2\u057f\u0586\3\2\2\2\u0580\u0581\5\u019c"+
		"\u00cf\2\u0581\u0582\7k\2\2\u0582\u0583\5\u00a8U\2\u0583\u0584\7!\2\2"+
		"\u0584\u0586\3\2\2\2\u0585\u055b\3\2\2\2\u0585\u0560\3\2\2\2\u0585\u0561"+
		"\3\2\2\2\u0585\u0562\3\2\2\2\u0585\u0563\3\2\2\2\u0585\u0564\3\2\2\2\u0585"+
		"\u0568\3\2\2\2\u0585\u056d\3\2\2\2\u0585\u056e\3\2\2\2\u0585\u0570\3\2"+
		"\2\2\u0585\u0575\3\2\2\2\u0585\u0577\3\2\2\2\u0585\u0579\3\2\2\2\u0585"+
		"\u057a\3\2\2\2\u0585\u0580\3\2\2\2\u0586\u05cc\3\2\2\2\u0587\u0588\f\23"+
		"\2\2\u0588\u0589\t\7\2\2\u0589\u05cb\5\u0178\u00bd\24\u058a\u058b\f\22"+
		"\2\2\u058b\u058c\t\b\2\2\u058c\u05cb\5\u0178\u00bd\23\u058d\u0591\f\21"+
		"\2\2\u058e\u0592\5\u0182\u00c2\2\u058f\u0592\5\u0186\u00c4\2\u0590\u0592"+
		"\5\u0184\u00c3\2\u0591\u058e\3\2\2\2\u0591\u058f\3\2\2\2\u0591\u0590\3"+
		"\2\2\2\u0592\u0593\3\2\2\2\u0593\u0594\5\u0178\u00bd\22\u0594\u05cb\3"+
		"\2\2\2\u0595\u0596\f\20\2\2\u0596\u0597\t\t\2\2\u0597\u05cb\5\u0178\u00bd"+
		"\21\u0598\u0599\f\16\2\2\u0599\u059a\t\n\2\2\u059a\u05cb\5\u0178\u00bd"+
		"\17\u059b\u059c\f\r\2\2\u059c\u059d\7[\2\2\u059d\u05cb\5\u0178\u00bd\16"+
		"\u059e\u059f\f\f\2\2\u059f\u05a0\7]\2\2\u05a0\u05cb\5\u0178\u00bd\r\u05a1"+
		"\u05a2\f\13\2\2\u05a2\u05a3\7\\\2\2\u05a3\u05cb\5\u0178\u00bd\f\u05a4"+
		"\u05a5\f\n\2\2\u05a5\u05a6\7S\2\2\u05a6\u05cb\5\u0178\u00bd\13\u05a7\u05a8"+
		"\f\t\2\2\u05a8\u05a9\7T\2\2\u05a9\u05cb\5\u0178\u00bd\n\u05aa\u05ab\f"+
		"\b\2\2\u05ab\u05ac\7M\2\2\u05ac\u05ad\5\u0178\u00bd\2\u05ad\u05ae\7N\2"+
		"\2\u05ae\u05af\5\u0178\u00bd\b\u05af\u05cb\3\2\2\2\u05b0\u05b1\f\7\2\2"+
		"\u05b1\u05b2\t\13\2\2\u05b2\u05cb\5\u0178\u00bd\7\u05b3\u05b4\f\33\2\2"+
		"\u05b4\u05bb\7G\2\2\u05b5\u05bc\7q\2\2\u05b6\u05bc\5\u0176\u00bc\2\u05b7"+
		"\u05bc\7-\2\2\u05b8\u05bc\5\u017c\u00bf\2\u05b9\u05bc\5\u017e\u00c0\2"+
		"\u05ba\u05bc\5\u01b4\u00db\2\u05bb\u05b5\3\2\2\2\u05bb\u05b6\3\2\2\2\u05bb"+
		"\u05b7\3\2\2\2\u05bb\u05b8\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bb\u05ba\3\2"+
		"\2\2\u05bc\u05cb\3\2\2\2\u05bd\u05be\f\32\2\2\u05be\u05bf\7C\2\2\u05bf"+
		"\u05c0\5\u0178\u00bd\2\u05c0\u05c1\7D\2\2\u05c1\u05cb\3\2\2\2\u05c2\u05c3"+
		"\f\26\2\2\u05c3\u05cb\t\f\2\2\u05c4\u05c5\f\17\2\2\u05c5\u05c6\7\34\2"+
		"\2\u05c6\u05cb\5\u01c0\u00e1\2\u05c7\u05c8\f\5\2\2\u05c8\u05c9\7k\2\2"+
		"\u05c9\u05cb\5\u0180\u00c1\2\u05ca\u0587\3\2\2\2\u05ca\u058a\3\2\2\2\u05ca"+
		"\u058d\3\2\2\2\u05ca\u0595\3\2\2\2\u05ca\u0598\3\2\2\2\u05ca\u059b\3\2"+
		"\2\2\u05ca\u059e\3\2\2\2\u05ca\u05a1\3\2\2\2\u05ca\u05a4\3\2\2\2\u05ca"+
		"\u05a7\3\2\2\2\u05ca\u05aa\3\2\2\2\u05ca\u05b0\3\2\2\2\u05ca\u05b3\3\2"+
		"\2\2\u05ca\u05bd\3\2\2\2\u05ca\u05c2\3\2\2\2\u05ca\u05c4\3\2\2\2\u05ca"+
		"\u05c7\3\2\2\2\u05cb\u05ce\3\2\2\2\u05cc\u05ca\3\2\2\2\u05cc\u05cd\3\2"+
		"\2\2\u05cd\u0179\3\2\2\2\u05ce\u05cc\3\2\2\2\u05cf\u05d0\7-\2\2\u05d0"+
		"\u05d1\5\u01d6\u00ec\2\u05d1\u017b\3\2\2\2\u05d2\u05d3\7!\2\2\u05d3\u05d4"+
		"\5\u0188\u00c5\2\u05d4\u05d5\5\u01a6\u00d4\2\u05d5\u017d\3\2\2\2\u05d6"+
		"\u05d7\7*\2\2\u05d7\u05d8\5\u01d0\u00e9\2\u05d8\u017f\3\2\2\2\u05d9\u05da"+
		"\5\u00a8U\2\u05da\u05db\7q\2\2\u05db\u0181\3\2\2\2\u05dc\u05dd\7J\2\2"+
		"\u05dd\u05de\7J\2\2\u05de\u0183\3\2\2\2\u05df\u05e0\7I\2\2\u05e0\u05e1"+
		"\7I\2\2\u05e1\u0185\3\2\2\2\u05e2\u05e3\7I\2\2\u05e3\u05e4\7I\2\2\u05e4"+
		"\u05e5\7I\2\2\u05e5\u0187\3\2\2\2\u05e6\u05e8\5\u01b8\u00dd\2\u05e7\u05e6"+
		"\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u0189\3\2\2\2\u05e9\u05ea\7C\2\2\u05ea"+
		"\u05eb\5\u0178\u00bd\2\u05eb\u05ec\7D\2\2\u05ec\u018b\3\2\2\2\u05ed\u05ee"+
		"\5\u018e\u00c8\2\u05ee\u05ef\7j\2\2\u05ef\u05f0\5\u019a\u00ce\2\u05f0"+
		"\u018d\3\2\2\2\u05f1\u05f5\7q\2\2\u05f2\u05f5\5\u0196\u00cc\2\u05f3\u05f5"+
		"\5\u0198\u00cd\2\u05f4\u05f1\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f4\u05f3\3"+
		"\2\2\2\u05f5\u018f\3\2\2\2\u05f6\u05f7\7q\2\2\u05f7\u05f8\5\u0192\u00ca"+
		"\2\u05f8\u0191\3\2\2\2\u05f9\u05fb\5\u0194\u00cb\2\u05fa\u05f9\3\2\2\2"+
		"\u05fb\u05fe\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u0193"+
		"\3\2\2\2\u05fe\u05fc\3\2\2\2\u05ff\u0600\7F\2\2\u0600\u0601\7q\2\2\u0601"+
		"\u0195\3\2\2\2\u0602\u0603\7?\2\2\u0603\u0604\5\u00ba^\2\u0604\u0605\7"+
		"@\2\2\u0605\u0197\3\2\2\2\u0606\u0607\7?\2\2\u0607\u0608\5\u0190\u00c9"+
		"\2\u0608\u0609\7@\2\2\u0609\u0199\3\2\2\2\u060a\u060d\5\u0178\u00bd\2"+
		"\u060b\u060d\5\u010a\u0086\2\u060c\u060a\3\2\2\2\u060c\u060b\3\2\2\2\u060d"+
		"\u019b\3\2\2\2\u060e\u060f\5\u019e\u00d0\2\u060f\u0610\5\f\7\2\u0610\u0611"+
		"\7q\2\2\u0611\u0612\5\u00a8U\2\u0612\u019d\3\2\2\2\u0613\u0615\5\u01a0"+
		"\u00d1\2\u0614\u0613\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u019f\3\2\2\2\u0616"+
		"\u0617\5\u00a6T\2\u0617\u0618\7G\2\2\u0618\u01a1\3\2\2\2\u0619\u061a\5"+
		"\u01b8\u00dd\2\u061a\u061b\5\u01a4\u00d3\2\u061b\u061c\5\u01b2\u00da\2"+
		"\u061c\u0623\3\2\2\2\u061d\u0620\5\u01a4\u00d3\2\u061e\u0621\5\u01aa\u00d6"+
		"\2\u061f\u0621\5\u01b2\u00da\2\u0620\u061e\3\2\2\2\u0620\u061f\3\2\2\2"+
		"\u0621\u0623\3\2\2\2\u0622\u0619\3\2\2\2\u0622\u061d\3\2\2\2\u0623\u01a3"+
		"\3\2\2\2\u0624\u0627\5\u00a6T\2\u0625\u0627\5\u01c4\u00e3\2\u0626\u0624"+
		"\3\2\2\2\u0626\u0625\3\2\2\2\u0627\u01a5\3\2\2\2\u0628\u0629\7q\2\2\u0629"+
		"\u062a\5\u01a8\u00d5\2\u062a\u062b\5\u01b2\u00da\2\u062b\u01a7\3\2\2\2"+
		"\u062c\u062e\5\u01b6\u00dc\2\u062d\u062c\3\2\2\2\u062d\u062e\3\2\2\2\u062e"+
		"\u01a9\3\2\2\2\u062f\u0638\7C\2\2\u0630\u0631\7D\2\2\u0631\u0632\5\u01e0"+
		"\u00f1\2\u0632\u0633\5\u009cO\2\u0633\u0639\3\2\2\2\u0634\u0635\5\u01ac"+
		"\u00d7\2\u0635\u0636\5\u01ae\u00d8\2\u0636\u0637\5\u01e0\u00f1\2\u0637"+
		"\u0639\3\2\2\2\u0638\u0630\3\2\2\2\u0638\u0634\3\2\2\2\u0639\u01ab\3\2"+
		"\2\2\u063a\u063b\5\u0178\u00bd\2\u063b\u063c\7D\2\2\u063c\u01ad\3\2\2"+
		"\2\u063d\u063f\5\u018a\u00c6\2\u063e\u063d\3\2\2\2\u063f\u0642\3\2\2\2"+
		"\u0640\u063e\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u01af\3\2\2\2\u0642\u0640"+
		"\3\2\2\2\u0643\u0644\t\13\2\2\u0644\u0645\5\u0178\u00bd\2\u0645\u01b1"+
		"\3\2\2\2\u0646\u0647\5\u01d6\u00ec\2\u0647\u0648\5L\'\2\u0648\u01b3\3"+
		"\2\2\2\u0649\u064a\5\u01b8\u00dd\2\u064a\u064b\5\u01d4\u00eb\2\u064b\u01b5"+
		"\3\2\2\2\u064c\u064f\5\u01e8\u00f5\2\u064d\u064f\5\u01b8\u00dd\2\u064e"+
		"\u064c\3\2\2\2\u064e\u064d\3\2\2\2\u064f\u01b7\3\2\2\2\u0650\u0651\7J"+
		"\2\2\u0651\u0652\5\u01ba\u00de\2\u0652\u0653\7I\2\2\u0653\u01b9\3\2\2"+
		"\2\u0654\u0655\5\u01c0\u00e1\2\u0655\u0656\5\u01bc\u00df\2\u0656\u01bb"+
		"\3\2\2\2\u0657\u0659\5\u01be\u00e0\2\u0658\u0657\3\2\2\2\u0659\u065c\3"+
		"\2\2\2\u065a\u0658\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u01bd\3\2\2\2\u065c"+
		"\u065a\3\2\2\2\u065d\u065e\7F\2\2\u065e\u065f\5\u01c0\u00e1\2\u065f\u01bf"+
		"\3\2\2\2\u0660\u0661\5\u01c2\u00e2\2\u0661\u0662\5\u01a4\u00d3\2\u0662"+
		"\u0663\5\u01e0\u00f1\2\u0663\u01c1\3\2\2\2\u0664\u0666\5\u00d8m\2\u0665"+
		"\u0664\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u01c3\3\2\2\2\u0667\u0668\t\r"+
		"\2\2\u0668\u01c5\3\2\2\2\u0669\u066a\7J\2\2\u066a\u066b\5\u01c8\u00e5"+
		"\2\u066b\u066c\7I\2\2\u066c\u01c7\3\2\2\2\u066d\u066f\5\u01ca\u00e6\2"+
		"\u066e\u066d\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u01c9\3\2\2\2\u0670\u0671"+
		"\5\u00aeX\2\u0671\u0672\5\u01cc\u00e7\2\u0672\u01cb\3\2\2\2\u0673\u0675"+
		"\5\u01ce\u00e8\2\u0674\u0673\3\2\2\2\u0675\u0678\3\2\2\2\u0676\u0674\3"+
		"\2\2\2\u0676\u0677\3\2\2\2\u0677\u01cd\3\2\2\2\u0678\u0676\3\2\2\2\u0679"+
		"\u067a\7F\2\2\u067a\u067b\5\u00aeX\2\u067b\u01cf\3\2\2\2\u067c\u067f\5"+
		"\u01d6\u00ec\2\u067d\u067f\5\u01d2\u00ea\2\u067e\u067c\3\2\2\2\u067e\u067d"+
		"\3\2\2\2\u067f\u01d1\3\2\2\2\u0680\u0681\7G\2\2\u0681\u0682\7q\2\2\u0682"+
		"\u0683\5J&\2\u0683\u01d3\3\2\2\2\u0684\u0685\7*\2\2\u0685\u0689\5\u01d0"+
		"\u00e9\2\u0686\u0687\7q\2\2\u0687\u0689\5\u01d6\u00ec\2\u0688\u0684\3"+
		"\2\2\2\u0688\u0686\3\2\2\2\u0689\u01d5\3\2\2\2\u068a\u068b\7?\2\2\u068b"+
		"\u068c\5\u0168\u00b5\2\u068c\u068d\7@\2\2\u068d\u01d7\3\2\2\2\u068e\u0690"+
		"\7(\2\2\u068f\u068e\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u01d9\3\2\2\2\u0691"+
		"\u0693\5\u01dc\u00ef\2\u0692\u0691\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u01db"+
		"\3\2\2\2\u0694\u0695\7G\2\2\u0695\u0696\7Y\2\2\u0696\u01dd\3\2\2\2\u0697"+
		"\u0699\7F\2\2\u0698\u0697\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u01df\3\2"+
		"\2\2\u069a\u069c\5\u01e2\u00f2\2\u069b\u069a\3\2\2\2\u069c\u069f\3\2\2"+
		"\2\u069d\u069b\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u01e1\3\2\2\2\u069f\u069d"+
		"\3\2\2\2\u06a0\u06a1\7C\2\2\u06a1\u06a2\7D\2\2\u06a2\u01e3\3\2\2\2\u06a3"+
		"\u06a5\7E\2\2\u06a4\u06a3\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u01e5\3\2"+
		"\2\2\u06a6\u06a8\7q\2\2\u06a7\u06a6\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8"+
		"\u01e7\3\2\2\2\u06a9\u06aa\7J\2\2\u06aa\u06ab\7I\2\2\u06ab\u01e9\3\2\2"+
		"\2y\u01f0\u01f5\u01fb\u0206\u0214\u0217\u021c\u0222\u022a\u0234\u0238"+
		"\u023d\u0248\u024b\u0251\u025e\u0269\u0274\u0284\u0287\u028f\u029b\u029e"+
		"\u02a3\u02b0\u02c0\u02ca\u02d5\u02df\u02e6\u02ea\u02ff\u0308\u0312\u0327"+
		"\u032f\u0338\u0343\u034d\u0357\u035e\u0367\u0372\u0377\u0381\u0385\u038d"+
		"\u0398\u039c\u03a5\u03ac\u03c0\u03cc\u03d7\u03de\u03e2\u03ea\u03f7\u0401"+
		"\u0408\u0419\u0420\u0432\u0436\u0440\u044c\u0454\u045d\u0460\u0473\u0495"+
		"\u04c1\u04c7\u04cd\u04d2\u04d8\u04dd\u04e1\u04f4\u0508\u051a\u051f\u0528"+
		"\u052b\u052e\u0532\u0544\u0559\u056b\u057e\u0585\u0591\u05bb\u05ca\u05cc"+
		"\u05e7\u05f4\u05fc\u060c\u0614\u0620\u0622\u0626\u062d\u0638\u0640\u064e"+
		"\u065a\u0665\u066e\u0676\u067e\u0688\u068f\u0692\u0698\u069d\u06a4\u06a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}