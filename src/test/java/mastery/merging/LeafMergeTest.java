package mastery.merging;

import mastery.tree.Conflict;
import mastery.tree.Leaf;
import mastery.tree.Tree;
import org.junit.Test;

import java.util.Collections;

import static mastery.merging.AST.leaf;

public class LeafMergeTest extends MergeTest {
    private void testOn(Tree base, Tree left, Tree right, Tree target) {
        testOn(base, left, right, target, Collections.emptyMap(), Collections.emptyMap());
    }

    @Test
    public void leftChange() {
        final Leaf base = leaf("a");
        final Leaf left = leaf("b");
        final Leaf right = leaf("a");
        final Leaf target = leaf("b");

        testOn(base, left, right, target);
    }

    @Test
    public void rightChange() {
        final Leaf base = leaf("a");
        final Leaf left = leaf("a");
        final Leaf right = leaf("b");
        final Leaf target = leaf("b");

        testOn(base, left, right, target);
    }

    @Test
    public void consistentChange() {
        final Leaf base = leaf("a");
        final Leaf left = leaf("b");
        final Leaf right = leaf("b");
        final Leaf target = leaf("b");

        testOn(base, left, right, target);
    }

    @Test
    public void inconsistentChange() {
        final Leaf base = leaf("a");
        final Leaf left = leaf("b");
        final Leaf right = leaf("c");
        final Conflict target = Conflict.of(leaf("b"), leaf("c"));

        testOn(base, left, right, target);
    }
}
