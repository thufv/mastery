package mastery.tree.node;

import com.google.gson.JsonParser;
import mastery.tree.TraverseUtil;

import java.io.FileNotFoundException;
import java.io.FileReader;

// TODO: do we really need this wrapper?
public class Tree {
    public final Node root;

    public Iterable<Node> preOrder() {
        return () -> TraverseUtil.preOrderIterator(root);
    }

    public Iterable<Node> postOrder() {
        return () -> TraverseUtil.postOrderIterator(root);
    }

    public Tree(Node root) {
        this.root = root;
    }

    public static Tree fromJSON(String json) throws FileNotFoundException {
        FileReader reader = new FileReader(json);
        var object = JsonParser.parseReader(reader).getAsJsonObject();
        return new Tree(Node.fromJSon(object));
    }

    public String prettyPrint() {
        return root.prettyPrint();
    }

    public String getRawCodeString() {
        var sb = new StringBuilder();
        for (var node : preOrder()) {
            if (node.isLeaf()) {
                var leaf = (Leaf) node;
                sb.append(leaf.value);
                sb.append(' ');
            }
        }

        return sb.toString();
    }
}
