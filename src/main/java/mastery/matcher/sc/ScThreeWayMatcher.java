package mastery.matcher.sc;

import mastery.matcher.ThreeWayMatcher;
import mastery.matcher.MatchingSet;
import mastery.matcher.Assigner;
import mastery.matcher.Mapping;
import mastery.tree.Tree;
import mastery.util.log.Log;
import java.util.logging.Level;

public class ScThreeWayMatcher extends ThreeWayMatcher {
    @Override
    public MatchingSet apply(Tree base, Tree left, Tree right) {
        Assigner assigner = new Assigner();
        assigner.apply(base, left, right);

        // log
        Log.ifLoggable(Level.FINEST, printer -> {
            printer.println("left");
            left.prettyPrintTo(printer);
        });
        Log.ifLoggable(Level.FINEST, printer -> {
            printer.println("base");
            base.prettyPrintTo(printer);
        });
        Log.ifLoggable(Level.FINEST, printer -> {
            printer.println("right");
            right.prettyPrintTo(printer);
        });

        // Calculate Mapping
        ScTwoWayMatcher scTwoWayMatcher = new ScTwoWayMatcher();
        MatchingSet matchingSet = new MatchingSet(base, left, right);

        Log.fine("2-way matching: base <-> left");
        var leftMapping = scTwoWayMatcher.apply(base, left);
        for (Mapping mapping: leftMapping.asSet())
            matchingSet.setLeftMatch(mapping.first, mapping.second);

        Log.fine("2-way matching: base <-> right");
        var rightMapping = scTwoWayMatcher.apply(base, right);
        for (Mapping mapping: rightMapping.asSet())
            matchingSet.setRightMatch(mapping.first, mapping.second);
        
        Log.fine("2-way matching: %d matches identified", matchingSet.size());
        return matchingSet;
    }
}