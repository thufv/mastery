package mastery.matcher;

import mastery.tree.Tree;
import mastery.util.log.Log;

public abstract class Matcher {
    public abstract MatchingSet apply(Tree base, Tree left, Tree right);

    public MatchingSet calc(TwoWayMatcher twoWayMatcher, MatchingSet matchingSet, Tree base, Tree left, Tree right) {
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