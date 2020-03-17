package mastery.merging;

import mastery.diff.HashMatchingSet;
import mastery.tree.Tree;

import java.util.Map;

import static org.junit.Assert.assertTrue;

public abstract class MergeTest {
    private final Merger merger = new BottomUpMerger();

    protected final void testOn(Tree base, Tree left, Tree right, Tree target,
                                Map<Tree, Tree> leftMatches, Map<Tree, Tree> rightMatches) {
        var m = new HashMatchingSet(base, left, right);
        leftMatches.forEach(m::setLeftMatch);
        m.setLeftMatch(base, left);
        rightMatches.forEach(m::setRightMatch);
        m.setRightMatch(base, right);

        var tree = merger.apply(m);
        assertTrue(tree.isomorphicTo(target));
    }
}
