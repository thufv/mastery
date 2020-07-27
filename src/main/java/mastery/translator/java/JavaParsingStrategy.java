package mastery.translator.java;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Pair;
import mastery.translator.ParsingStrategy;

import java.io.IOException;
import java.util.*;

import static java.util.Map.entry;

public class JavaParsingStrategy implements ParsingStrategy {
    @Override
    public Pair<Parser, ParserRuleContext> apply(String srcFile) throws IOException {
        JavaLexer lexer = new JavaLexer(CharStreams.fromFileName(srcFile));
        JavaParser parser = new JavaParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true); // save parse tree
        ParserRuleContext ctx = parser.compilationUnit(); // invoke parsing

        return new Pair<>(parser, ctx);
    }

    private static final String[] listStrings = new String[] { "optionPackageDeclaration", "importDeclarations",
            "typeDeclarations", "annotations", "classOrInterfaceModifiers", "modifiers", "variableModifiers",
            "optionTypeParameters", "optionExtendsTypeType", "optionImplementsTypeList", "otherTypeParameters",
            "optionExtendsTypeBound", "otherTypeTypes", "optionEnumConstants", "optionEnumBodyDeclarations",
            "otherEnumConstants", "optionArguments", "optionClassBody", "classBodyDeclarations",
            "optionExtendsTypeList", "interfaceBodyDeclarations", "optionThrowsQualifiedNameList",
            "otherConstantDeclarators", "optionTypeParametersAnnotations", "interfaceMethodModifiers",
            "otherVariableDeclarators", "optionEqualsVariableInitializer", "optionVariablesInitializer",
            "otherVariableInitializers", "optionTypeArguments", "memberSelections", "optionExtendsOrSuperTypeType",
            "otherQualifiedNames", "optionFormalParameterList", "otherFormalParameters",
            "optionCommaArrayFormalParameter", "otherDotIdentifiers", "optionAnnotationRest",
            "elementValuePairsOrElementValue?", "otherElementValuePairs", "otherElementValues", "optionElementValues",
            "annotationTypeElementDeclarations", "optionDefaultValue", "blockStatements", "optionColonExpression",
            "optionElseStatement", "optionFinallyBlock", "switchBlockStatementGroups", "switchLabels", "catchClauses",
            "optionExpression", "orQualifiedNames", "semicolonResources", "optionforInit", "optionExpressionList",
            "otherExpressions", "optionNonWildcardTypeArguments", "otherIdentifiers", "optionClassOrInterfaceTypeDot",
            "nonWildcardTypeArgumentsOrDiamond?", "squaredExpressions", "commaTypeTypes", "optionAnnotation",
            "optionNonEmptyTypeArguments", "otherTypeArguments", "optionStatic", "optionDotStar", "optionComma",
            "squares", "optionSemicolon", "optionIdentifier" };
    private static final HashSet<String> listSet = new HashSet<>(Arrays.asList(listStrings));

    @Override
    public HashSet<String> getListNodeNames() {
        return listSet;
    }

    private static final String[] orderedlistStrings = new String[] { "otherTypeParameters", "otherTypeTypes",
            "otherEnumConstants", "otherConstantDeclarators", "otherVariableDeclarators", "otherVariableInitializers",
            "memberSelections", "otherFormalParameters", "otherDotIdentifiers", "otherElementValues", "blockStatements",
            "switchBlockStatementGroups", "catchClauses", "semicolonResources", "otherExpressions", "otherIdentifiers",
            "squaredExpressions", "commaTypeTypes", "otherTypeArguments" };
    private static final HashSet<String> orderedlistSet = new HashSet<>(Arrays.asList(orderedlistStrings));

    @Override
    public HashSet<String> getOrderedListNodeNames() {
        return orderedlistSet;
    }

    private static final String[] alternativeLabelStrings = { "parenthesizedExpr", "thisExpr", "superExpr",
            "literalExpr", "idExpr", "classExpr", "callExpr", "dottedExpr", "arrayReadExpr", "methodCallExpr",
            "newExpr", "typedExpr", "sufAddMinusExpr", "preAddMinusExpr", "negExpr", "multDivExpr", "infixAddMinusExpr",
            "shiftExpr", "cmpExpr", "instanceOfExpr", "eqExpr", "bitAndExpr", "xorExpr", "bitOrExpr", "logicAndExpr",
            "logicOrExpr", "condExpr", "assignExpr", "lambdaExpr", "exprMethodReference", "typeMethodReference",
            "classTypeMethodReference" };
    private static final List<String> alternativeLabelList = Arrays.asList(alternativeLabelStrings);

    @Override
    public List<String> getAlternativeLabels() {
        return alternativeLabelList;
    }

    private static final String[] stopStrings = { "compilationUnit", "importDeclaration", "typeDeclaration", "packageDeclaration", "classDeclaration", "enumDeclaration", "interfaceDeclaration", "classBodyDeclaration", "memberDeclaration", "methodDeclaration", "genericMethodDeclaration", "fieldDeclaration", "constructorDeclaration", "genericConstructorDeclaration", "interfaceDeclaration", "annotationTypeDeclaration", "constDeclaration", "interfaceMethodDeclaration", "annotationTypeElementDeclaration", "statement", "blockStmt", "assertStmt", "ifStmt", "forStmt", "whileStmt", "doWhileStmt", "tryStmt", "tryRscSpecStmt", "switchStmt", "synchronizedStmt", "returnStmt", "throwStmt", "breakStmt", "continueStmt", 	"semiStmt", "exprStmt", "identifierStmt", "localVariableDeclarationStatement", "statement", "localTypeDeclaration", "localVariableDeclaration"};
    private static final HashSet<String> stopLabels = new HashSet<>(Arrays.asList(stopStrings));

    @Override
    public HashSet<String> getStopLabels() {
        return stopLabels;
    }

    // delcarations that probable unique
    // that is, declarations that (have both identifier and body as its child)
    // or (have both identifier and body as its child)
    // the list is the child number path to the identifier or a node that's supposed to have identifier
    // the identifier does possibly not exist
    private static final Map<String, Integer> declarationLabels = Map.ofEntries(
        entry("classDeclaration", 1),
        entry("enumDeclaration", 1),
        entry("enumConstant", 1),
        entry("interfaceDeclaration", 1),
        entry("methodDeclaration", 1),
        entry("interfaceMethodDeclaration", 3),
        entry("constructorDeclaration", 0),
        entry("annotationTypeDeclaration", 2),
        entry("catchClause", 4),
        entry("typeDeclaration", 0),
        entry("realTypeDeclaration", 1),
        entry("classBodyDeclaration", 0),
        entry("realClassBodyDeclaration", 1),
        entry("memberDeclaration", 0),
        entry("genericConstructorDeclaration", 1),
        entry("genericMethodDeclaration", 1),
        entry("interfaceBodyDeclaration", 0),
        entry("realInterfaceBodyDeclaration", 1),
        entry("interfaceMemberDeclaration", 0),
        entry("genericInterfaceMethodDeclaration", 1),
        entry("annotationTypeElementDeclaration", 0),
        entry("realAnnotationTypeElementDeclaration", 1),
        entry("annotationTypeElementRest", 0),
        entry("typeTypeAnnotationMethodRest", 1),
        entry("typeTypeAnnotationConstantRest", 1)
    );

    @Override
    public Map<String, Integer> getDeclarationLabels() {
        return declarationLabels;
    }
}
