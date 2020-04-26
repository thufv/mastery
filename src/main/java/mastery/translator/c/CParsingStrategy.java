package mastery.translator.c;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Pair;

import mastery.translator.ParsingStrategy;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;

public class CParsingStrategy implements ParsingStrategy {
    @Override
    public Pair<Parser, ParserRuleContext> apply(String srcFile) throws IOException{
        CLexer lexer = null;
        lexer = new CLexer(CharStreams.fromFileName(srcFile));
        CParser parser = new CParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true); // save parse tree
        ParserRuleContext ctx = parser.compilationUnit(); // invoke parsing

        return new Pair<>(parser, ctx);
    }

    @Override
    public HashSet<String> getListNodeNames() {
        HashSet<String> ListNodeNames = new HashSet<String>();
        // TODO: Add C ListNodes
        return ListNodeNames;
    }

    public HashSet<String> getOrderedListNodeNames() {
        HashSet<String> OrderedListNodeNames = new HashSet<String>();
        // TODO: Add C ordered ListNodes
        return OrderedListNodeNames;
    }

    public List<String> getAlternativeLabels() {
        List<String> AlternativeLabels = List.of();
        // TODO: Add C# alternative labels
        return AlternativeLabels;
    }

    @Override
    public HashSet<String> getStopLabels() {
        HashSet<String> stopLabels = new HashSet<>();
        return stopLabels;
    }
}
