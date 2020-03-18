package mastery.merging;

import mastery.tree.*;

import java.util.Arrays;
import java.util.List;

public class AST {
    public static Leaf leaf(String value) {
        return new Leaf(1, "token", value);
    }

    public static Constructor binary(Tree first, Tree second) {
        return new Constructor(2, "binary", List.of(first, second));
    }

    public static Constructor ternary(Tree first, Tree second, Tree third) {
        return new Constructor(3, "ternary", List.of(first, second, third));
    }

    public static OrderedList ordered(Tree... elements) {
        return new OrderedList(4, "olist", Arrays.asList(elements));
    }

    public static UnorderedList unordered(Tree... elements) {
        return new UnorderedList(5, "ulist", Arrays.asList(elements));
    }
}
