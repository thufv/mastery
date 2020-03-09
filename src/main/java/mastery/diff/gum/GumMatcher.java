package mastery.diff.gum;

import mastery.diff.Matcher;
import mastery.diff.MatchingSet;
import mastery.tree.Tree;
import mastery.util.log.Log;

public class GumMatcher extends Matcher{
    @Override
    public MatchingSet apply(Tree base, Tree left, Tree right) {
        var diff = new GumDiff();

        Log.fine("diff: base <-> left");
        var leftMapping = diff.apply(base, left);

        Log.fine("diff: base <-> right");
        var rightMapping = diff.apply(base, right);

        var matchingSet = new HashMatchingSet(base, left, right);
        leftMapping.forEach(matchingSet::setLeftMatch);
        rightMapping.forEach(matchingSet::setRightMatch);
        Log.fine("diff: %d matches identified", matchingSet.size());

        return matchingSet;
    }
}
