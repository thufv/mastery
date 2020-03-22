package mastery.merger;

import mastery.tree.Conflict;
import mastery.tree.OrderedList;
import mastery.tree.Tree;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static mastery.merger.AST.leaf;
import static mastery.merger.AST.ordered;

public class OrderedMergeTest extends MergeTest {
    @Test
    public void leftDeletion() {
        final Tree base1 = leaf("y");
        final Tree left1 = base1.deepCopy();
        final Tree right1 = leaf("y1");

        final Tree baseDeletion = leaf("x");
        final Tree rightDeletion = baseDeletion.deepCopy();

        final OrderedList base = ordered(baseDeletion, base1);
        final OrderedList left = ordered(left1);
        final OrderedList right = ordered(rightDeletion, right1);
        final OrderedList target = ordered(right1.deepCopy());

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
        final Tree leftDeletion = baseDeletion.deepCopy();

        final OrderedList base = ordered(base1, baseDeletion);
        final OrderedList left = ordered(left1, leftDeletion);
        final OrderedList right = ordered(right1);
        final OrderedList target = ordered(right1.deepCopy());

        testOn(base, left, right, target,
               Map.of(base1, left1, baseDeletion, leftDeletion),
               Map.of(base1, right1));
    }

    @Test
    public void bothDeletion() {
        final Tree base1 = leaf("y");
        final Tree left1 = base1.deepCopy();
        final Tree right1 = leaf("y1");

        final Tree baseDeletion1 = leaf("x");
        final Tree leftDeletion = baseDeletion1.deepCopy();
        final Tree baseDeletion2 = leaf("x1");
        final Tree rightDeletion = baseDeletion2.deepCopy();

        final OrderedList base = ordered(baseDeletion2, base1, baseDeletion1);
        final OrderedList left = ordered(left1, leftDeletion);
        final OrderedList right = ordered(rightDeletion, right1);
        final OrderedList target = ordered(right1.deepCopy());

        testOn(base, left, right, target,
               Map.of(base1, left1, baseDeletion1, leftDeletion),
               Map.of(base1, right1, baseDeletion2, rightDeletion));
    }

    @Test
    public void leftInsertion() {
        final Tree base1 = leaf("y");
        final Tree left1 = base1.deepCopy();
        final Tree right1 = leaf("y1");

        final Tree insertion1 = leaf("x");
        final Tree insertion2 = leaf("x");

        final OrderedList base = ordered(base1);
        final OrderedList left = ordered(left1, insertion1, insertion2);
        final OrderedList right = ordered(right1);
        final OrderedList target = ordered(right1.deepCopy(), insertion1.deepCopy(), insertion2.deepCopy());

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
        final Tree insertion2 = leaf("x");

        final OrderedList base = ordered(base1);
        final OrderedList left = ordered(left1);
        final OrderedList right = ordered(insertion1, right1, insertion2);
        final OrderedList target = ordered(insertion1.deepCopy(), right1.deepCopy(), insertion2.deepCopy());

        testOn(base, left, right, target,
               Map.of(base1, left1),
               Map.of(base1, right1));
    }

    @Test
    public void bothInsertion() {
        final Tree base1 = leaf("y");
        final Tree left1 = base1.deepCopy();
        final Tree right1 = leaf("y1");

        final Tree leftInsertion = leaf("x");
        final Tree rightInsertion = leaf("z");

        final OrderedList base = ordered(base1);
        final OrderedList left = ordered(left1, leftInsertion);
        final OrderedList right = ordered(rightInsertion, right1);
        final OrderedList target = ordered(rightInsertion.deepCopy(), right1.deepCopy(), leftInsertion.deepCopy());

        testOn(base, left, right, target,
               Map.of(base1, left1),
               Map.of(base1, right1));
    }

    @Test
    public void insertionDeletion() {
        final Tree base1 = leaf("y");
        final Tree left1 = base1.deepCopy();
        final Tree right1 = leaf("y1");

        final Tree baseDeletion = leaf("x");
        final Tree rightDeletion = baseDeletion.deepCopy();

        final Tree leftInsertion1 = leaf("u1");
        final Tree leftInsertion2 = leaf("u2");

        final OrderedList base = ordered(baseDeletion, base1);
        final OrderedList left = ordered(leftInsertion1, leftInsertion2, left1);
        final OrderedList right = ordered(rightDeletion, right1);
        final OrderedList target = ordered(leftInsertion1.deepCopy(), leftInsertion2.deepCopy(), right1.deepCopy());

        testOn(base, left, right, target,
               Map.of(base1, left1),
               Map.of(base1, right1, baseDeletion, rightDeletion));
    }

    @Test
    public void misc1() {
        final Tree base1 = leaf("y");
        final Tree left1 = base1.deepCopy();
        final Tree right1 = base1.deepCopy();

        final Tree baseDeletion1 = leaf("z");
        final Tree rightDeletion = baseDeletion1.deepCopy();
        final Tree baseDeletion2 = leaf("x");
        final Tree leftDeletion = baseDeletion2.deepCopy();

        final Tree leftInsertion1 = leaf("w1");
        final Tree leftInsertion2 = leaf("w2");
        final Tree leftInsertion3 = leaf("w3");

        final Tree rightInsertion11 = leaf("u1");
        final Tree rightInsertion12 = leaf("u2");

        final Tree rightInsertion21 = leaf("v1");
        final Tree rightInsertion22 = leaf("v2");
        final Tree rightInsertion23 = leaf("v3");

        final OrderedList base = ordered(base1, baseDeletion1, baseDeletion2);
        final OrderedList left = ordered(left1, leftDeletion, leftInsertion1, leftInsertion2, leftInsertion3);
        final OrderedList right = ordered(rightInsertion11, rightInsertion12, right1,
                                          rightInsertion21, rightInsertion22, rightInsertion23, rightDeletion);
        final OrderedList target = ordered(rightInsertion11.deepCopy(), rightInsertion12.deepCopy(), base1.deepCopy(),
                                           rightInsertion21.deepCopy(), rightInsertion22.deepCopy(),
                                           rightInsertion23.deepCopy(),
                                           leftInsertion1.deepCopy(), leftInsertion2.deepCopy(),
                                           leftInsertion3.deepCopy());

        testOn(base, left, right, target,
               Map.of(base1, left1, baseDeletion2, leftDeletion),
               Map.of(base1, right1, baseDeletion1, rightDeletion));
    }

    // conflict cases

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

        final OrderedList base = ordered(base1, leftDeletion, rightDeletion);
        final OrderedList left = ordered(left1, leftInsertion, leftChange);
        final OrderedList right = ordered(right1, rightChange, rightInsertion);

        final Tree conflict1 = Conflict.ofLeft(leftChange);
        final Tree conflict2 = Conflict.ofRight(rightChange);
        final OrderedList target = ordered(right1.deepCopy(), leftInsertion.deepCopy(), conflict1, conflict2,
                                           rightInsertion.deepCopy());

        testOn(base, left, right, target,
               Map.of(base1, left1, leftDeletion, leftChange),
               Map.of(base1, right1, rightDeletion, rightChange));
    }

    @Test
    public void bothInsertionConflict() {
        final Tree base1 = leaf("y");
        final Tree left1 = base1.deepCopy();
        final Tree right1 = leaf("y1");

        final Tree leftInsertion = leaf("u");
        final Tree rightInsertion = leaf("v");

        final OrderedList base = ordered(base1);
        final OrderedList left = ordered(left1, leftInsertion);
        final OrderedList right = ordered(right1, rightInsertion);

        final Tree conflict = Conflict.of(List.of(leftInsertion), List.of(rightInsertion));
        final OrderedList target = ordered(right1.deepCopy(), conflict);

        testOn(base, left, right, target,
               Map.of(base1, left1),
               Map.of(base1, right1));
    }

    @Test
    public void insertionDeletionConflict() {
        final Tree leftDeletion = leaf("x");
        final Tree leftChange = leaf("x1");
        final Tree rightDeletion = leaf("z");
        final Tree rightChange = leaf("z1");
        final Tree leftInsertion = leaf("u");

        final OrderedList base = ordered(leftDeletion, rightDeletion);
        final OrderedList left = ordered(leftChange, leftInsertion);
        final OrderedList right = ordered(rightChange);

        final Tree conflict1 = Conflict.ofLeft(leftChange);
        final Tree conflict2 = Conflict.of(List.of(leftInsertion), List.of(rightChange));
        final OrderedList target = ordered(conflict1, conflict2);

        testOn(base, left, right, target,
               Map.of(leftDeletion, leftChange),
               Map.of(rightDeletion, rightChange));
    }

    @Test
    public void cyclicConflict() {
        final Tree base1 = leaf("y");
        final Tree left1 = base1.deepCopy();
        final Tree right1 = leaf("y1");

        final Tree base2 = leaf("x");
        final Tree left2 = base2.deepCopy();
        final Tree right2 = base2.deepCopy();

        final Tree baseCross = leaf("z");
        final Tree rightCross = baseCross.deepCopy();

        final OrderedList base = ordered(base1, base2, baseCross);
        final OrderedList left = ordered(left1, left2);
        final OrderedList right = ordered(right1, rightCross, right2);

        final Tree conflict = Conflict.of(List.of(left2), List.of(rightCross, right2));
        final OrderedList target = ordered(right1.deepCopy(), conflict);

        testOn(base, left, right, target,
               Map.of(base1, left1, base2, left2),
               Map.of(base1, right1, base2, right2, baseCross, rightCross));
    }
}
