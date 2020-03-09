package mastery.matcher.gum;

import mastery.matcher.Matcher;
import mastery.matcher.MatchingSet;
import mastery.tree.Tree;

public class GumMatcher extends Matcher{
    @Override
    public MatchingSet apply(Tree base, Tree left, Tree right) {
        return calc(new GumTwoWayMatcher(), new HashMatchingSet(base, left, right), base, left, right);
    }
}
