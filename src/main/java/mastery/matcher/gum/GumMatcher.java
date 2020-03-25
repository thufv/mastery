package mastery.matcher.gum;

import mastery.matcher.Matcher;
import mastery.matcher.MatchingSet;
import mastery.tree.Tree;
import mastery.util.log.Log;
import java.util.logging.Level;

public class GumMatcher extends Matcher{
    @Override
    public MatchingSet apply(Tree base, Tree left, Tree right) {
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
        
        return calc(new GumTwoWayMatcher(), new HashMatchingSet(base, left, right), base, left, right);
    }
}
