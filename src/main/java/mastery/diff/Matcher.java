package mastery.diff;

import mastery.tree.node.Tree;
import mastery.util.log.Log;

public class Matcher {
    public MatchingSet apply(Tree base, Tree left, Tree right) {
        var diff = new Diff();

        Log.fine("diff: base <-> left");
        var leftMapping = diff.apply(base, left);

        Log.fine("diff: base <-> right");
        var rightMapping = diff.apply(base, right);

        var matchingSet = new MatchingSet(base, left, right);
        leftMapping.forEach(matchingSet::setLeftMatch);
        rightMapping.forEach(matchingSet::setRightMatch);
        Log.fine("diff: %d matches identified", matchingSet.size());

        return matchingSet;
    }
}
