package mastery.translator.xml;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Pair;
import mastery.translator.ParsingStrategy;

import java.io.IOException;
import java.util.*;

public class XMLParsingStrategy implements ParsingStrategy {
    @Override
    public Pair<Parser, ParserRuleContext> apply(String srcFile) throws IOException {
        XMLLexer lexer = new XMLLexer(CharStreams.fromFileName(srcFile));
        XMLParser parser = new XMLParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true); // save parse tree
        ParserRuleContext ctx = parser.document(); // invoke parsing

        return new Pair<>(parser, ctx);
    }

    private static final String[] listStrings = new String[] {
        "optionProlog",
        "someContents",
        "attributes",
        "optionChardata",
        "miscs"
    };
    private static final HashSet<String> listSet = new HashSet<>(Arrays.asList(listStrings));

    @Override
    public HashSet<String> getListNodeNames() {
        return listSet;
    }

    private static final String[] orderedlistStrings = new String[] {
        "someContents"
    };
    private static final HashSet<String> orderedlistSet = new HashSet<>(Arrays.asList(orderedlistStrings));

    @Override
    public HashSet<String> getOrderedListNodeNames() {
        return orderedlistSet;
    }

    private static final String[] alternativeLabelStrings = {};
    private static final List<String> alternativeLabelList = Arrays.asList(alternativeLabelStrings);

    @Override
    public List<String> getAlternativeLabels() {
        return alternativeLabelList;
    }

    private static final String[] stopStrings = {"someContent"};
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
    private static final Map<String, Integer> declarationLabels = new HashMap<>();

    @Override
    public Map<String, Integer> getDeclarationLabels() {
        return declarationLabels;
    }
}
