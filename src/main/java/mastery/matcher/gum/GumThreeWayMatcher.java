package mastery.matcher.gum;

import java.util.logging.Level;

import mastery.matcher.Mapping;
import mastery.matcher.MappingStore;
import mastery.matcher.MatchingSet;
import mastery.matcher.ThreeWayMatcher;
import mastery.tree.Tree;
import mastery.util.log.Log;
import mastery.util.Interval;

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
        var leftMappings = gumTwoWayMatcher.apply(base, left);
        filter(leftMappings, base);
        for (Mapping mapping: leftMappings.asSet())
            matchingSet.setLeftMatch(mapping.first, mapping.second);

        Log.fine("2-way matching: base <-> right");
        var rightMappings = gumTwoWayMatcher.apply(base, right);
        filter(rightMappings, base);
        for (Mapping mapping: rightMappings.asSet())
            matchingSet.setRightMatch(mapping.first, mapping.second);
        
        Log.fine("2-way matching: %d matches identified", matchingSet.size());
        return matchingSet;
    }

    private void filter(MappingStore mappings, Tree root) {
        // the interval of the other tree is assumed to have been calculated
        for (Tree node: root.preOrder()) {
            if (node.parent == null) {
                node.preInterval = mappings.getDst(node).interval;
            }
            else {
                if (mappings.hasSrc(node)) {
                    Tree dst = mappings.getDst(node);
                    if (Interval.isSubinterval(dst.interval, node.parent.preInterval)) {
                        node.preInterval = dst.interval;
                    }
                    else {
                        mappings.unlink(node, dst);
                    }
                }
                else {
                    node.preInterval = node.parent.preInterval;
                }
            }
        }
    }
}
