package mastery.matcher.ta;

import mastery.matcher.Matcher;
import mastery.matcher.Assigner;
import mastery.matcher.MatchingSet;
import mastery.tree.Tree;

import mastery.util.log.Log;
import java.util.logging.Level;

public class TaMatcher extends Matcher {
    @Override
    public MatchingSet apply(Tree base, Tree left, Tree right) {
        // Assign trees
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
        return calc(new TaTwoWayMatcher(), new TaMatchingSet(base, left, right), base, left, right);
    }
}