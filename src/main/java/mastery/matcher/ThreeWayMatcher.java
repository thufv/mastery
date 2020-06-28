package mastery.matcher;

import mastery.tree.Tree;
import mastery.util.log.Log;
import java.util.logging.Level;

public class ThreeWayMatcher {
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
        TwoWayMatcher twoWayMatcher = new TwoWayMatcher();
        MatchingSet matchingSet = new MatchingSet(base, left, right);

        Log.fine("2-way matching: base <-> left");
        var leftMapping = twoWayMatcher.apply(base, left);
        leftMapping.forEach(matchingSet::setLeftMatch);

        Log.fine("2-way matching: base <-> right");
        var rightMapping = twoWayMatcher.apply(base, right);
        rightMapping.forEach(matchingSet::setRightMatch);
        
        Log.fine("2-way matching: %d matches identified", matchingSet.size());
        return matchingSet;
    }
}