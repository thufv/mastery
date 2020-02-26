package mastery.tree.input;

import com.google.gson.JsonParser;
import mastery.tree.Revision;
import mastery.tree.TraverseUtil;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tree {
    public final Node root;

    public Revision revision;

    public Iterable<Node> preOrder() {
        return () -> TraverseUtil.preOrderIterator(root);
    }

    public Iterable<Node> postOrder() {
        return () -> TraverseUtil.postOrderIterator(root);
    }

    private Tree(Node root) {
        this.root = root;
    }

    public static Tree fromJSON(String json) throws FileNotFoundException {
        FileReader reader = new FileReader(json);
        var object = JsonParser.parseReader(reader).getAsJsonObject();
        return new Tree(Node.fromJSon(object));
    }

    public String prettyPrint() {
        var sb = new StringBuilder();
        root.prettyPrintTo(sb, "", "");
        return sb.toString();
    }
}
