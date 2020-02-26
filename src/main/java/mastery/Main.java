package mastery;

import mastery.tree.input.Tree;
import mastery.diff.Diff;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Tree tree1 = Tree.fromJSON("GumTree1.json");
        Tree tree2 = Tree.fromJSON("GumTree2.json");

        System.out.println(tree1.prettyPrint());

//        System.out.println(tree1.prettyPrint());
//        System.out.println(":: tree2");
        System.out.println(tree2.prettyPrint());
//        System.out.flush();

        var diff = new Diff();
        diff.apply(tree1, tree2);
    }
}
