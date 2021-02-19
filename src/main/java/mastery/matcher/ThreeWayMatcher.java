package mastery.matcher;

import java.util.logging.Level;

import mastery.tree.Tree;

import mastery.util.log.Log;
import mastery.util.Interval;

public class ThreeWayMatcher {
    TwoWayMatcher twoWayMatcher;

    // A two-way matcher is necessary for a three-way matcher
    public ThreeWayMatcher(TwoWayMatcher twoWayMatcher) {
        assert twoWayMatcher != null;

        this.twoWayMatcher = twoWayMatcher;
    }

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
        
        MatchingSet matchingSet = new MatchingSet(base, left, right);

        Log.fine("2-way matching: base <-> left");
        var leftMappings = twoWayMatcher.apply(base, left);

//        System.out.printf("base: %s\n", base);
//        System.out.printf("base: %s\n", base.toReadableString());
//        System.out.printf("base: %s\n", left);
//        System.out.printf("base: %s\n", left.toReadableString());

        for (Mapping mapping: leftMappings.asSet())
            matchingSet.setLeftMatch(mapping.first, mapping.second);

        Log.fine("2-way matching: base <-> right");
        var rightMappings = twoWayMatcher.apply(base, right);
        for (Mapping mapping: rightMappings.asSet())
            matchingSet.setRightMatch(mapping.first, mapping.second);
        
        Log.fine("2-way matching: %d matches identified", matchingSet.size());
        return matchingSet;
    }
}