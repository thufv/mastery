package mastery.merging;

import mastery.tree.Constructor;
import mastery.tree.Leaf;
import mastery.tree.Tree;
import org.junit.Test;

import java.util.Map;

import static mastery.merging.AST.*;

public class ConstructorMergeTest extends MergeTest {
    @Test
    public void noShifted() {
        final Leaf base1 = leaf("x");
        final Leaf base2 = leaf("y");

        final Leaf left1 = leaf("x1");
        final Leaf left2 = leaf("y");

        final Leaf right1 = leaf("x");
        final Leaf right2 = leaf("y1");

        final Constructor base = binary(base1, base2);
        final Constructor left = binary(left1, left2);
        final Constructor right = binary(right1, right2);
        final Constructor target = binary(leaf("x1"), leaf("y1"));

        testOn(base, left, right, target,
               Map.of(base1, left1, base2, left2),
               Map.of(base1, right1, base2, right2));
    }

    @Test
    public void leftShifted() {
        final Leaf base1 = leaf("x");
        final Leaf base2 = leaf("y");
        final Leaf base3 = leaf("z");

        final Leaf left1 = leaf("x");
        final Leaf shift = leaf("y");
        final Tree left2 = binary(shift, leaf("u"));
        final Leaf left3 = leaf("z1");

        final Leaf right1 = leaf("x1");
        final Leaf right2 = leaf("y1");
        final Leaf right3 = leaf("z");

        final Constructor base = ternary(base1, base2, base3);
        final Constructor left = ternary(left1, left2, left3);
        final Constructor right = ternary(right1, right2, right3);
        final Tree shifted = binary(leaf("y1"), leaf("u"));
        final Constructor target = ternary(leaf("x1"), shifted, leaf("z1"));

        testOn(base, left, right, target,
               Map.of(base1, left1, base2, shift, base3, left3),
               Map.of(base1, right1, base2, right2, base3, right3));
    }

    @Test
    public void rightShifted() {
        final Leaf base1 = leaf("x");
        final Leaf base2 = leaf("y");
        final Leaf base3 = leaf("z");

        final Leaf left1 = leaf("x1");
        final Leaf left2 = leaf("y1");
        final Leaf left3 = leaf("z");

        final Leaf right1 = leaf("x");
        final Leaf shift = leaf("y");
        final Tree right2 = binary(shift, leaf("u"));
        final Leaf right3 = leaf("z1");

        final Constructor base = ternary(base1, base2, base3);
        final Constructor left = ternary(left1, left2, left3);
        final Constructor right = ternary(right1, right2, right3);
        final Tree shifted = binary(leaf("y1"), leaf("u"));
        final Constructor target = ternary(leaf("x1"), shifted, leaf("z1"));

        testOn(base, left, right, target,
               Map.of(base1, left1, base2, left2, base3, left3),
               Map.of(base1, right1, base2, shift, base3, right3));
    }
}
