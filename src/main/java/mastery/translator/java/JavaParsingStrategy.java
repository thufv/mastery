package mastery.translator.java;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Pair;
import mastery.translator.ParsingStrategy;

import java.io.IOException;
import java.util.*;

public class JavaParsingStrategy implements ParsingStrategy {
    @Override
    public Pair<Parser, ParserRuleContext> apply(String srcFile) throws IOException {
        JavaLexer lexer = null;
        lexer = new JavaLexer(CharStreams.fromFileName(srcFile));
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
            "annotationTypeElementDeclaration*", "optionDefaultValue", "blockStatements", "optionColonExpression",
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
}
