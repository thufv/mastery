package mastery.translator;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Pair;

import java.io.IOException;
import java.util.*;

/**
 * Parsing strategy.
 */
public interface ParsingStrategy {
    /**
     * Construct a parser for parsing source file, make sure that the parsing is
     * completed when this method returns.
     *
     * @param srcFile source file
     * @return parser and context for the root node (often compilation unit)
     */
    Pair<Parser, ParserRuleContext> apply(String srcFile) throws IOException;

    /**
     * Get the List-Node names for a specific language,
     *
     * @return names in a HashSet
     */
    default HashSet<String> getListNodeNames() {
        return new HashSet<>();
    }

    /**
     * Get the ordered List-Node names for a specific language, "ordered" means if
     * you change the arrangement of the list, you will possibly change the semantic
     * of the program.
     *
     * @return names in a HashSet
     */
    default HashSet<String> getOrderedListNodeNames() {
        return new HashSet<>();
    }

    /**
     * Get alternative labels for distinguish them to arrange a unique label.
     * 
     * @return alternative labels.
     */
    default List<String> getAlternativeNames() {
        return new ArrayList<>();
    }

    default HashSet<String> getStopNames() { return new HashSet<>(); }

    default Map<String, Integer> getDeclarationNames() {
        return new HashMap<>();
    }

    default HashSet<String> getLookaheadLabels() {
        return new HashSet<>();
    }
}
