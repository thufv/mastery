package mastery.diff.ta;

import mastery.diff.Matcher;
import mastery.diff.MatchingSet;
import mastery.tree.Tree;

public class TaMatcher extends Matcher {
    @Override
    public MatchingSet apply(Tree base, Tree left, Tree right) {
        // TODO: implement
        return new TaMatchingSet(base, left, right);
    }
}