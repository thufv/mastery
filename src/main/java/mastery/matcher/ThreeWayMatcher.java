package mastery.matcher;

import mastery.tree.Tree;

public abstract class ThreeWayMatcher {
    public abstract MatchingSet apply(Tree base, Tree left, Tree right);
}