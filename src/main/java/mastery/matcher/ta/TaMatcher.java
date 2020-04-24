package mastery.matcher.ta;

import mastery.matcher.Matcher;
import mastery.matcher.Assigner;
import mastery.matcher.MatchingSet;
import mastery.tree.Tree;
import mastery.util.Interval;

import mastery.util.log.Log;
import java.util.logging.Level;

public class TaMatcher extends Matcher {
    private Integer dfsIndex;
    private void dfs(Tree node) {
        node.dfsIndex = ++dfsIndex;
        for (Tree child: node.children)
            dfs(child);
        Integer rightIndex = dfsIndex;
        node.interval = Interval.of(node.dfsIndex, rightIndex);
    }
    private void calDfs(Tree tree) {
        dfsIndex = 0;
        dfs(tree);
    }

    @Override
    public MatchingSet apply(Tree base, Tree left, Tree right) {
        // Assign trees
        Assigner assigner = new Assigner();
        assigner.apply(base, left, right);

        // Calculate information about dfs ordering
        calDfs(base);
        calDfs(left);
        calDfs(right);

        // log
        Log.ifLoggable(Level.FINEST, printer -> {
            printer.println("base");
            base.prettyPrintTo(printer);
        });
        Log.ifLoggable(Level.FINEST, printer -> {
            printer.println("left");
            left.prettyPrintTo(printer);
        });
        Log.ifLoggable(Level.FINEST, printer -> {
            printer.println("right");
            right.prettyPrintTo(printer);
        });

        // Calculate Mapping
        return calc(new TaTwoWayMatcher(), new TaMatchingSet(base, left, right), base, left, right);
    }
}