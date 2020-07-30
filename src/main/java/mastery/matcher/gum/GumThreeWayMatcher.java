package mastery.matcher.gum;

import java.util.logging.Level;

import mastery.matcher.Mapping;
import mastery.matcher.MatchingSet;
import mastery.matcher.ThreeWayMatcher;
import mastery.tree.Tree;
import mastery.util.log.Log;

public class GumThreeWayMatcher extends ThreeWayMatcher {
    @Override
    public MatchingSet apply(Tree base, Tree left, Tree right) {
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
        
        GumTwoWayMatcher gumTwoWayMatcher = new GumTwoWayMatcher();
        MatchingSet matchingSet = new MatchingSet(base, left, right);

        Log.fine("2-way matching: base <-> left");
        var leftMapping = gumTwoWayMatcher.apply(base, left);
        for (Mapping mapping: leftMapping.asSet())
            matchingSet.setLeftMatch(mapping.first, mapping.second);

        Log.fine("2-way matching: base <-> right");
        var rightMapping = gumTwoWayMatcher.apply(base, right);
        for (Mapping mapping: rightMapping.asSet())
            matchingSet.setRightMatch(mapping.first, mapping.second);
        
        Log.fine("2-way matching: %d matches identified", matchingSet.size());
        return matchingSet;
    }
}