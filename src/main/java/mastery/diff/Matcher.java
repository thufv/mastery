package mastery.diff;

import mastery.tree.Tree;

public abstract class Matcher {
    public abstract MatchingSet apply(Tree base, Tree left, Tree right);
}