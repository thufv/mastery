package mastery.merger;

import mastery.tree.*;

import java.util.Arrays;
import java.util.List;

public class AST {
    public static Leaf leaf(String value) {
        Leaf node = new Leaf(1, "token", value);
        node.assignment = 1 * 2333 + value.hashCode();

        // System.out.println("leaf(" + value + ").assignment = " + node.assignment);

        return node;
    }

    public static Constructor binary(Tree first, Tree second) {
        Constructor node = new Constructor(2, "binary", List.of(first, second));
        node.assignment = 2 * 2333;
        for(Tree element: List.of(first, second)) {
            node.assignment = 233 * node.assignment + element.assignment;
        }
        return node;
    }

    public static Constructor ternary(Tree first, Tree second, Tree third) {
        Constructor node = new Constructor(3, "ternary", List.of(first, second, third));
        node.assignment = 3 * 2333;
        for (Tree element: List.of(first, second, third)) {
            node.assignment = 233 * node.assignment + element.assignment;
        }
        return node;
    }

    public static OrderedList ordered(Tree... elements) {
        OrderedList node = new OrderedList(4, "olist", Arrays.asList(elements));
        node.assignment = 4 * 2333;
        for (Tree element: elements) {
            node.assignment = 233 * node.assignment + element.assignment;
        }
        return node;
    }

    public static UnorderedList unordered(Tree... elements) {
        // System.out.println("Calculate the assignment of an unordered list: ");

        UnorderedList node = new UnorderedList(5, "ulist", Arrays.asList(elements));
        node.assignment = 5 * 2333;
        for (Tree element: elements) {
            // System.out.print(node.assignment + " + " + element.assignment);

            node.assignment += element.assignment;

            // System.out.println(" = " + node.assignment);
        }
        return node;
    }
}
