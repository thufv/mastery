package mastery.translator.cs;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Pair;
import mastery.translator.ParsingStrategy;

import java.io.IOException;
import java.util.*;

public class CSharpParsingStrategy implements ParsingStrategy {
    @Override
    public Pair<Parser, ParserRuleContext> apply(String srcFile) throws IOException{
        CSharpLexer lexer = null;
        lexer = new CSharpLexer(CharStreams.fromFileName(srcFile));
        CSharpParser parser = new CSharpParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true); // save parse tree
        ParserRuleContext ctx = parser.compilation_unit(); // invoke parsing

        return new Pair<>(parser, ctx);
    }

    @Override
    public HashSet<String> getListNodeNames() {
        HashSet<String> ListNodeNames = new HashSet<String>();
        ListNodeNames.add("statement_list");
        ListNodeNames.add("extern_alias_directives");
        ListNodeNames.add("using_directives");
        ListNodeNames.add("namespace_member_declarations");
        ListNodeNames.add("type_parameter_constraints_clauses");
        ListNodeNames.add("class_member_declarations");
        ListNodeNames.add("all_member_modifiers");
        ListNodeNames.add("attributes");
        return ListNodeNames;
    }
}
