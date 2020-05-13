/*
 [The "BSD licence"] Copyright (c) 2013 Terence Parr, Sam Harwell Copyright (c) 2017 Ivan Kochurkin
 (upgrade to Java 8) Copyright (c) 2020 Xingyu Xie All rights reserved.
 
 Redistribution and use in source and binary forms, with or without modification, are permitted
 provided that the following conditions are met: 1. Redistributions of source code must retain the
 above copyright notice, this list of conditions and the following disclaimer. 2. Redistributions in
 binary form must reproduce the above copyright notice, this list of conditions and the following
 disclaimer in the documentation and/or other materials provided with the distribution. 3. The name
 of the author may not be used to endorse or promote products derived from this software without
 specific prior written permission.
 
 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 ARE DISCLAIMED. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 POSSIBILITY OF SUCH DAMAGE.
 */

parser grammar JavaParser;

options {
	tokenVocab = JavaLexer;
}

compilationUnit:
	optionPackageDeclaration importDeclarations typeDeclarations EOF;

optionPackageDeclaration: packageDeclaration?;

importDeclarations: importDeclaration*;

typeDeclarations: typeDeclaration*;

packageDeclaration: annotations PACKAGE qualifiedName ';';

annotations: annotation*;

importDeclaration:
	IMPORT optionStatic qualifiedName optionDotStar ';';

typeDeclaration: realTypeDeclaration | ';';

realTypeDeclaration:
	classOrInterfaceModifiers (
		classDeclaration
		| enumDeclaration
		| interfaceDeclaration
		| annotationTypeDeclaration
	);

classOrInterfaceModifiers: classOrInterfaceModifier*;

modifiers: modifier*;

modifier:
	classOrInterfaceModifier
	| NATIVE
	| SYNCHRONIZED
	| TRANSIENT
	| VOLATILE;

classOrInterfaceModifier:
	annotation
	| PUBLIC
	| PROTECTED
	| PRIVATE
	| STATIC
	| ABSTRACT
	| FINAL // FINAL for class only -- does not apply to interfaces
	| STRICTFP;

variableModifier: FINAL | annotation;
variableModifiers: variableModifier*;
classDeclaration:
	CLASS IDENTIFIER optionTypeParameters optionExtendsTypeType optionImplementsTypeList classBody;

optionTypeParameters: typeParameters?;

optionExtendsTypeType: extendsTypeType?;

extendsTypeType: EXTENDS typeType;

optionImplementsTypeList: implementsTypeList?;

implementsTypeList: IMPLEMENTS typeList;

typeParameters: '<' typeParameter otherTypeParameters '>';

otherTypeParameters: anotherTypeParameter*;

anotherTypeParameter: ',' typeParameter;

typeParameter: annotations IDENTIFIER optionExtendsTypeBound;

optionExtendsTypeBound: extendsTypeBound?;

extendsTypeBound: EXTENDS typeBound;

typeBound: typeType otherTypeTypes;

otherTypeTypes: anotherTypeType*;

anotherTypeType: '&' typeType;

enumDeclaration:
	ENUM IDENTIFIER optionImplementsTypeList '{' optionEnumConstants optionComma
		optionEnumBodyDeclarations '}';

optionEnumConstants: enumConstants?;

optionEnumBodyDeclarations: enumBodyDeclarations?;

enumConstants: enumConstant otherEnumConstants;

otherEnumConstants: anotherEnumConstant*;

anotherEnumConstant: ',' enumConstant;

enumConstant:
	annotations IDENTIFIER optionArguments optionClassBody;

optionArguments: arguments?;

optionClassBody: classBody?;

classBodyDeclarations: classBodyDeclaration*;
enumBodyDeclarations: ';' classBodyDeclarations;

interfaceDeclaration:
	INTERFACE IDENTIFIER optionTypeParameters optionExtendsTypeList interfaceBody;

optionExtendsTypeList: extendsTypeList?;

extendsTypeList: EXTENDS typeList;

classBody: '{' classBodyDeclarations '}';

interfaceBody: '{' interfaceBodyDeclarations '}';

interfaceBodyDeclarations: interfaceBodyDeclaration*;

classBodyDeclaration: ';' | realclassBodyDeclaration;

realclassBodyDeclaration:
	optionStatic block
	| modifiers memberDeclaration;

memberDeclaration:
	methodDeclaration
	| genericMethodDeclaration
	| fieldDeclaration
	| constructorDeclaration
	| genericConstructorDeclaration
	| interfaceDeclaration
	| annotationTypeDeclaration
	| classDeclaration
	| enumDeclaration;

/* We use rule this even for void methods which cannot have [] after parameters. This simplifies
 grammar and we can consider void to be a type, which renders the [] matching as a context-sensitive
 issue or a semantic check for invalid return type after parsing.
 */
methodDeclaration:
	typeTypeOrVoid IDENTIFIER formalParameters squares optionThrowsQualifiedNameList methodBody;

optionThrowsQualifiedNameList: throwsQualifiedNameList?;

throwsQualifiedNameList: THROWS qualifiedNameList;

methodBody: block | ';';

typeTypeOrVoid: typeType | VOID;

genericMethodDeclaration: typeParameters methodDeclaration;

genericConstructorDeclaration:
	typeParameters constructorDeclaration;

constructorDeclaration:
	IDENTIFIER formalParameters optionThrowsQualifiedNameList constructorBody = block;

fieldDeclaration: typeType variableDeclarators ';';

interfaceBodyDeclaration: realInterfaceBodyDeclaration | ';';

realInterfaceBodyDeclaration:
	modifiers interfaceMemberDeclaration;

interfaceMemberDeclaration:
	constDeclaration
	| interfaceMethodDeclaration
	| genericInterfaceMethodDeclaration
	| interfaceDeclaration
	| annotationTypeDeclaration
	| classDeclaration
	| enumDeclaration;

constDeclaration:
	typeType constantDeclarator otherConstantDeclarators ';';

otherConstantDeclarators: anotherConstantDeclarators*;

anotherConstantDeclarators: ',' constantDeclarator;

constantDeclarator: IDENTIFIER squares '=' variableInitializer;

// see matching of [] comment in methodDeclaratorRest methodBody from Java8
interfaceMethodDeclaration:
	interfaceMethodModifiers optionTypeParametersAnnotations typeTypeOrVoid IDENTIFIER
		formalParameters squares optionThrowsQualifiedNameList methodBody;

optionTypeParametersAnnotations: typeParametersAnnotations?;
typeParametersAnnotations: typeParameters annotations;

interfaceMethodModifiers: interfaceMethodModifier*;
// Java8
interfaceMethodModifier:
	annotation
	| PUBLIC
	| ABSTRACT
	| DEFAULT
	| STATIC
	| STRICTFP;

genericInterfaceMethodDeclaration:
	typeParameters interfaceMethodDeclaration;

variableDeclarators:
	variableDeclarator otherVariableDeclarators;

otherVariableDeclarators: anotherVariableDeclarator*;

anotherVariableDeclarator: ',' variableDeclarator;

variableDeclarator:
	variableDeclaratorId optionEqualsVariableInitializer;

optionEqualsVariableInitializer: equalsVariableInitializer?;

equalsVariableInitializer: '=' variableInitializer;

variableDeclaratorId: IDENTIFIER squares;

variableInitializer: arrayInitializer | expression;

arrayInitializer: '{' optionVariablesInitializer '}';

optionVariablesInitializer: variablesInitializer?;

variablesInitializer:
	variableInitializer otherVariableInitializers optionComma;

otherVariableInitializers: anotherVariableInitializer*;

anotherVariableInitializer: ',' variableInitializer;

classOrInterfaceType:
	IDENTIFIER optionTypeArguments memberSelections;

optionTypeArguments: typeArguments?;

memberSelections: memberSelection*;

memberSelection: '.' IDENTIFIER optionTypeArguments;

typeArgument: typeType | questionOptionExtendsOrSuperTypeType;

questionOptionExtendsOrSuperTypeType:
	'?' optionExtendsOrSuperTypeType;

optionExtendsOrSuperTypeType: extendsOrSuperTypeType?;

extendsOrSuperTypeType: (EXTENDS | SUPER) typeType;

qualifiedNameList: qualifiedName otherQualifiedNames;

otherQualifiedNames: anotherQualifiedName*;

anotherQualifiedName: ',' qualifiedName;

formalParameters: '(' optionFormalParameterList ')';

optionFormalParameterList: formalParameterList?;

formalParameterList:
	moreThanOneNonArrayFormalParameters
	| arrayFormalParameter;

moreThanOneNonArrayFormalParameters:
	formalParameter otherFormalParameters optionCommaArrayFormalParameter;

otherFormalParameters: anotherFormalParameter*;

anotherFormalParameter: ',' formalParameter;

optionCommaArrayFormalParameter: commaArrayFormalParameter?;

commaArrayFormalParameter: ',' arrayFormalParameter;

formalParameter:
	variableModifiers typeType variableDeclaratorId;

arrayFormalParameter:
	variableModifiers typeType '...' variableDeclaratorId;

qualifiedName: IDENTIFIER otherDotIdentifiers;

otherDotIdentifiers: anotherDotIdentifier*;

anotherDotIdentifier: '.' IDENTIFIER;

literal:
	integerLiteral
	| floatLiteral
	| CHAR_LITERAL
	| STRING_LITERAL
	| BOOL_LITERAL
	| NULL_LITERAL;

integerLiteral:
	DECIMAL_LITERAL
	| HEX_LITERAL
	| OCT_LITERAL
	| BINARY_LITERAL;

floatLiteral: FLOAT_LITERAL | HEX_FLOAT_LITERAL;

// ANNOTATIONS

annotation: '@' qualifiedName optionAnnotationRest;

optionAnnotationRest: annotationRest?;

annotationRest: '(' optionElementValuePairsOrElementValue ')';

optionElementValuePairsOrElementValue:
	elementValuePairsOrElementValue?;

elementValuePairsOrElementValue:
	elementValuePairs
	| elementValue;

elementValuePairs: elementValuePair otherElementValuePairs;

otherElementValuePairs: anotherElementValuePair*;

anotherElementValuePair: ',' elementValuePair;

elementValuePair: IDENTIFIER '=' elementValue;

elementValue:
	expression
	| annotation
	| elementValueArrayInitializer;

elementValueArrayInitializer:
	'{' optionElementValues optionComma '}';

otherElementValues: anotherElementValue*;

anotherElementValue: ',' elementValue;

optionElementValues: elementValues?;

elementValues: elementValue otherElementValues;

annotationTypeDeclaration:
	'@' INTERFACE IDENTIFIER annotationTypeBody;

annotationTypeBody: '{' annotationTypeElementDeclarations '}';

annotationTypeElementDeclarations:
	annotationTypeElementDeclaration*;

annotationTypeElementDeclaration:
	realAnnotationTypeElementDeclaration
	| ';';

realAnnotationTypeElementDeclaration:
	modifiers annotationTypeElementRest;
// this is not allowed by the grammar, but apparently allowed by the actual compiler Xingyu Xie: is
// really "apparently allowed" ???

annotationTypeElementRest:
	typeTypeAnnotationMethodRest ';'
	| typeTypeAnnotationConstantRest ';'
	| classDeclaration optionSemicolon
	| interfaceDeclaration optionSemicolon
	| enumDeclaration optionSemicolon
	| annotationTypeDeclaration optionSemicolon;

typeTypeAnnotationMethodRest:
	typeType IDENTIFIER '(' ')' optionDefaultValue;

typeTypeAnnotationConstantRest:
	typeType IDENTIFIER '(' ')' optionDefaultValue;

annotationConstantRest: variableDeclarators;

optionDefaultValue: defaultValue?;

defaultValue: DEFAULT elementValue;

// STATEMENTS / BLOCKS

block: '{' blockStatements '}';

blockStatements: blockStatement*;

blockStatement:
	localVariableDeclarationStatement
	| statement
	| localTypeDeclaration;

localVariableDeclarationStatement: localVariableDeclaration ';';

localVariableDeclaration:
	variableModifiers typeType variableDeclarators;

localTypeDeclaration:
	classOrInterfaceModifiers (
		classDeclaration
		| interfaceDeclaration
	)
	| ';';

statement:
	blockStmt
	| assertStmt
	| ifStmt
	| forStmt
	| whileStmt
	| doWhileStmt
	| tryStmt
	| tryRscSpecStmt
	| switchStmt
	| synchronizedStmt
	| returnStmt
	| throwStmt
	| breakStmt
	| continueStmt
	| semiStmt
	| exprStmt
	| identifierStmt;

blockStmt: blockLabel = block;

assertStmt: ASSERT expression optionColonExpression ';';

ifStmt: IF parExpression statement optionElseStatement;

forStmt: FOR '(' forControl ')' statement;

whileStmt: WHILE parExpression statement;

doWhileStmt: DO statement WHILE parExpression ';';

tryStmt:
	TRY block (catchClausesOrOptionFinallyBlock | finallyBlock);

tryRscSpecStmt:
	TRY resourceSpecification block catchClauses optionFinallyBlock;

switchStmt:
	SWITCH parExpression '{' switchBlockStatementGroups '}';

synchronizedStmt: SYNCHRONIZED parExpression block;

returnStmt: RETURN optionExpression ';';

throwStmt: THROW expression ';';

breakStmt: BREAK optionIdentifier ';';

continueStmt: CONTINUE optionIdentifier ';';

semiStmt: SEMI;

exprStmt: statementExpression = expression ';';

identifierStmt: identifierLabel = IDENTIFIER ':' statement;

optionColonExpression: colonExpression?;

colonExpression: ':' expression;

optionElseStatement: elseStatement?;

elseStatement: ELSE statement;

optionFinallyBlock: finallyBlock?;

switchBlockStatementGroups: switchBlockStatementGroup*;

switchLabels: switchLabel+;

catchClauses: catchClause*;

optionExpression: expression?;

catchClausesOrOptionFinallyBlock:
	catchClauses optionFinallyBlock;

catchClause:
	CATCH '(' variableModifiers catchType IDENTIFIER ')' block;

catchType: qualifiedName orQualifiedNames;

orQualifiedNames: orQualifiedName*;

orQualifiedName: '|' qualifiedName;

finallyBlock: FINALLY block;

resourceSpecification: '(' resources optionSemicolon ')';

resources: resource semicolonResources;

semicolonResources: semicolonResource*;

semicolonResource: ';' resource;

resource:
	variableModifiers classOrInterfaceType variableDeclaratorId '=' expression;

switchBlockStatementGroup: switchLabels blockStatements;

switchLabel:
	CASE (
		constantExpression = expression
		| enumConstantName = IDENTIFIER
	) ':'
	| DEFAULT ':';

forControl:
	variableModifiers typeType variableDeclaratorId ':' expression
	| optionforInit ';' optionExpression ';' forUpdate = optionExpressionList;

optionforInit: forInit?;

optionExpressionList: expressionList?;

forInit: localVariableDeclaration | expressionList;

// EXPRESSIONS

parExpression: '(' expression ')';

expressionList: expression otherExpressions;

otherExpressions: anotherExpression*;

anotherExpression: ',' expression;

methodCall:
	IDENTIFIER '(' optionExpressionList ')'
	| THIS '(' optionExpressionList ')'
	| SUPER '(' optionExpressionList ')';

expression:
	'(' expression ')'			# parenthesizedExpr
	| THIS						# thisExpr
	| SUPER						# superExpr
	| literal					# literalExpr
	| IDENTIFIER				# idExpr
	| typeTypeOrVoid '.' CLASS	# classExpr
	| nonWildcardTypeArguments (
		explicitGenericInvocationSuffix
		| thisArguments
	) # callExpr
	| expression bop = '.' (
		IDENTIFIER
		| methodCall
		| THIS
		| newOptionNonWildcardTypeArgumentsInnerCreator
		| superSuperSuffix
		| explicitGenericInvocation
	)												# dottedExpr
	| expression '[' expression ']'					# arrayReadExpr
	| methodCall									# methodCallExpr
	| NEW creator									# newExpr
	| '(' typeType ')' expression					# typedExpr
	| expression postfix = ('++' | '--')			# sufAddMinusExpr
	| prefix = ('+' | '-' | '++' | '--') expression	# preAddMinusExpr
	| prefix = ('~' | '!') expression				# negExpr
	| expression bop = ('*' | '/' | '%') expression	# multDivExpr
	| expression bop = ('+' | '-') expression		# infixAddMinusExpr
	| expression (
		leftShift
		| unsignedRightShift
		| signedRightShift
	) expression														# shiftExpr
	| expression bop = ('<=' | '>=' | '>' | '<') expression				# cmpExpr
	| expression bop = INSTANCEOF typeType								# instanceOfExpr
	| expression bop = ('==' | '!=') expression							# eqExpr
	| expression bop = '&' expression									# bitAndExpr
	| expression bop = '^' expression									# xorExpr
	| expression bop = '|' expression									# bitOrExpr
	| expression bop = '&&' expression									# logicAndExpr
	| expression bop = '||' expression									# logicOrExpr
	| <assoc = right> expression bop = '?' expression ':' expression	# condExpr
	| <assoc = right> expression bop = (
		'='
		| '+='
		| '-='
		| '*='
		| '/='
		| '&='
		| '|='
		| '^='
		| '>>='
		| '>>>='
		| '<<='
		| '%='
	) expression		# assignExpr
	| lambdaExpression	# lambdaExpr // Java8

	// Java 8 methodReference
	| expression '::' optionTypeArgumentsIdentifier			# exprMethodReference
	| typeType '::' (optionTypeArgumentsIdentifier | NEW)	# typeMethodReference
	| classType '::' optionTypeArguments NEW				# classTypeMethodReference;

thisArguments: THIS arguments;

newOptionNonWildcardTypeArgumentsInnerCreator:
	NEW optionNonWildcardTypeArguments innerCreator;

superSuperSuffix: SUPER superSuffix;

optionTypeArgumentsIdentifier: optionTypeArguments IDENTIFIER;

leftShift: '<' '<';

signedRightShift: '>' '>';

unsignedRightShift: '>' '>' '>';

optionNonWildcardTypeArguments: nonWildcardTypeArguments?;

squaredExpression: '[' expression ']';

// Java8
lambdaExpression: lambdaParameters '->' lambdaBody;

// Java8
lambdaParameters:
	IDENTIFIER
	| parenthesizedOptionFormalParameterList
	| parenthesizedIdentifiers;

identifiers: IDENTIFIER otherIdentifiers;

otherIdentifiers: anotherIdentifier*;

anotherIdentifier: ',' IDENTIFIER;

parenthesizedOptionFormalParameterList:
	'(' optionFormalParameterList ')';

parenthesizedIdentifiers: '(' identifiers ')';

// Java8
lambdaBody: expression | block;

classType:
	optionClassOrInterfaceTypeDot annotations IDENTIFIER optionTypeArguments;

optionClassOrInterfaceTypeDot: classOrInterfaceTypeDot?;

classOrInterfaceTypeDot: classOrInterfaceType '.';

creator:
	nonWildcardTypeArguments classOrInterfaceOrPrimitiveType classCreatorRest
	| classOrInterfaceOrPrimitiveType (
		arrayCreatorRest
		| classCreatorRest
	);

classOrInterfaceOrPrimitiveType:
	classOrInterfaceType
	| primitiveType;

innerCreator:
	IDENTIFIER optionNonWildcardTypeArgumentsOrDiamond classCreatorRest;

optionNonWildcardTypeArgumentsOrDiamond:
	nonWildcardTypeArgumentsOrDiamond?;

arrayCreatorRest:
	'[' (
		']' squares arrayInitializer
		| rightSquaredExpression squaredExpressions squares
	);

rightSquaredExpression: expression ']';

squaredExpressions: squaredExpression*;

rightAssocBinaryOperatorAndExpression:
	bop = (
		'='
		| '+='
		| '-='
		| '*='
		| '/='
		| '&='
		| '|='
		| '^='
		| '>>='
		| '>>>='
		| '<<='
		| '%='
	) expression;

classCreatorRest: arguments optionClassBody;

explicitGenericInvocation:
	nonWildcardTypeArguments explicitGenericInvocationSuffix;

nonWildcardTypeArgumentsOrDiamond:
	angle
	| nonWildcardTypeArguments;

nonWildcardTypeArguments: '<' typeList '>';

typeList: typeType commaTypeTypes;

commaTypeTypes: commaTypeType*;

commaTypeType: ',' typeType;

typeType:
	optionAnnotation classOrInterfaceOrPrimitiveType squares;

optionAnnotation: annotation?;

primitiveType:
	BOOLEAN
	| CHAR
	| BYTE
	| SHORT
	| INT
	| LONG
	| FLOAT
	| DOUBLE;

typeArguments: '<' optionNonEmptyTypeArguments '>';

optionNonEmptyTypeArguments: nonEmptyTypeArguments?;

nonEmptyTypeArguments: typeArgument otherTypeArguments;

otherTypeArguments: anotherTypeArgument*;

anotherTypeArgument: ',' typeArgument;

superSuffix: arguments | commaIdentifierOptionArguments;

commaIdentifierOptionArguments: '.' IDENTIFIER optionArguments;

explicitGenericInvocationSuffix:
	SUPER superSuffix
	| IDENTIFIER arguments;

arguments: '(' optionExpressionList ')';

// option token
optionStatic: STATIC?;

optionDotStar: dotStar?;

dotStar: '.' '*';

optionComma: ','?;

squares: square*;

square: '[' ']';

optionSemicolon: ';'?;

optionIdentifier: IDENTIFIER?;

angle: '<' '>';