package mastery.merger;

import mastery.tree.Conflict;
import mastery.tree.Tree;
import mastery.tree.UnorderedList;
import org.junit.Test;

import java.util.Map;

import static mastery.merger.AST.leaf;
import static mastery.merger.AST.unordered;

public class UnorderedMergeTest extends MergeTest {
    @Test
    public void leftDeletion() {
        final Tree base1 = leaf("y");
        final Tree left1 = base1.deepCopy();
        final Tree right1 = leaf("y1");

        final Tree baseDeletion = leaf("x");
        final Tree rightDeletion = leaf("x");

        final UnorderedList base = unordered(baseDeletion, base1);
        final UnorderedList left = unordered(left1);
        final UnorderedList right = unordered(right1, rightDeletion);
        final UnorderedList target = unordered(right1.deepCopy());

        testOn(base, left, right, target,
               Map.of(base1, left1),
               Map.of(base1, right1, baseDeletion, rightDeletion));
    }

    @Test
    public void rightDeletion() {
        final Tree base1 = leaf("y");
        final Tree left1 = base1.deepCopy();
        final Tree right1 = leaf("y1");

        final Tree baseDeletion = leaf("x");
        final Tree leftDeletion = leaf("x");

        final UnorderedList base = unordered(base1, baseDeletion);
        final UnorderedList left = unordered(leftDeletion, left1);
        final UnorderedList right = unordered(right1);
        final UnorderedList target = unordered(right1.deepCopy());

        testOn(base, left, right, target,
               Map.of(base1, left1, baseDeletion, leftDeletion),
               Map.of(base1, right1));
    }

    @Test
    public void leftInsertion() {
        final Tree base1 = leaf("y");
        final Tree left1 = base1.deepCopy();
        final Tree right1 = leaf("y1");

        final Tree insertion = leaf("x");

        final UnorderedList base = unordered(base1);
        final UnorderedList left = unordered(left1, insertion);
        final UnorderedList right = unordered(right1);
        final UnorderedList target = unordered(right1.deepCopy(), insertion.deepCopy());

        testOn(base, left, right, target,
               Map.of(base1, left1),
               Map.of(base1, right1));
    }

    @Test
    public void rightInsertion() {
        final Tree base1 = leaf("y");
        final Tree left1 = base1.deepCopy();
        final Tree right1 = leaf("y1");

        final Tree insertion1 = leaf("x");
        final Tree insertion2 = leaf("z");

        final UnorderedList base = unordered(base1);
        final UnorderedList left = unordered(left1);
        final UnorderedList right = unordered(insertion1, right1, insertion2);
        final UnorderedList target = unordered(right1.deepCopy(), insertion1.deepCopy(), insertion2.deepCopy());

        testOn(base, left, right, target,
               Map.of(base1, left1),
               Map.of(base1, right1));
    }

    @Test
    public void deletionChangeConflict() {
        final Tree base1 = leaf("y");
        final Tree left1 = base1.deepCopy();
        final Tree right1 = leaf("y1");

        final Tree leftDeletion = leaf("x");
        final Tree leftChange = leaf("x1");
        final Tree rightDeletion = leaf("z");
        final Tree rightChange = leaf("z1");
        final Tree leftInsertion = leaf("u");
        final Tree rightInsertion = leaf("v");

        final UnorderedList base = unordered(base1, leftDeletion, rightDeletion);
        final UnorderedList left = unordered(left1, leftInsertion, leftChange);
        final UnorderedList right = unordered(right1, rightInsertion, rightChange);

        final Tree conflict1 = Conflict.ofLeft(leftChange);
        final Tree conflict2 = Conflict.ofRight(rightChange);
        final UnorderedList target = unordered(right1.deepCopy(), conflict1, conflict2,
                                               leftInsertion.deepCopy(), rightInsertion.deepCopy());

        testOn(base, left, right, target,
               Map.of(base1, left1, leftDeletion, leftChange),
               Map.of(base1, right1, rightDeletion, rightChange));
    }

    // TODO: insert the same element in both left and right
}
