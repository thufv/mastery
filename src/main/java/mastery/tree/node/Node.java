package mastery.tree.node;

import com.google.gson.JsonObject;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Node {

    public int id; // TODO: do we really need this?

    public final int height;

    public final int size;

    public final int label;

    public final String name;

    public List<Node> children;

    // TODO: we don't need hash once we precomputed the isomorphic mappings by other methods (radix sort)
    public final int treeHash;

    private Node parent;

    public final @Nullable Node getParent() {
        return parent;
    }

    protected Node(int label, String name, List<Node> children) {
        this.label = label;
        this.name = name;
        this.children = children;

        // compute height
        if (children.isEmpty()) {
            this.height = 0;
        } else {
            var it = children.iterator();
            int height = it.next().height;
            while (it.hasNext()) {
                var child = it.next();
                if (child.height > height) {
                    height = child.height;
                }
            }
            this.height = height + 1;
        }

        // compute size and tree hash
        // hash(x) = label + \sum_{y \in children(x)} (hash(y) * primes(y.size))
        int size = 1;
        int hash = label;
        for (var child : children) {
            size += child.size;
            hash += child.treeHash * PRIMES[child.size];
        }
        this.size = size;
        this.treeHash = hash;
        this.parent = null;
    }

    private final int[] PRIMES = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997};

    public abstract boolean isLeaf();

    public abstract boolean isConstructor();

    public abstract boolean isOrderedList();

    public abstract boolean isUnorderedList();

    public abstract boolean isConflict();

    public abstract String toString();

    public static Node fromJSon(JsonObject object) {
        int label = object.get("label").getAsInt();
        String name = object.get("name").getAsString();
        String kind = object.get("kind").getAsString();
        if (kind.equals("leaf")) {
            return new Leaf(label, name, object.get("code").getAsString());
        }

        var children = new ArrayList<Node>();
        for (var o : object.get("children").getAsJsonArray()) {
            children.add(Node.fromJSon(o.getAsJsonObject()));
        }

        Node self = null;
        if (kind.equals("node")) {
            self = children.isEmpty() ? new Nothing() : new Constructor(label, name, children);
        }

        if (kind.equals("orderedlist")) {
            self = new OrderedList(label, name, children);
        }

        if (kind.equals("unorderedlist")) {
            self = new UnorderedList(label, name, children);
        }

        Objects.requireNonNull(self);

        for (var child : self.children) {
            child.parent = self;
        }

        return self;
    }

    public abstract Node updated(Node target, Node replacement);

    public String prettyPrint() {
        var sb = new StringBuilder();
        prettyPrintTo(sb, "", "");
        return sb.toString();
    }

    private static final String CONSECUTIVE_PROMPT = "├── ";
    private static final String LAST_PROMPT = "└── ";
    private static final String DASHED_PROMPT = "╎   ";
    private static final String EMPTY_PROMPT = "    ";

    void prettyPrintTo(StringBuilder sb, String inherited, String prompt) {
        sb.append(inherited);
        sb.append(prompt);
        // this node
        sb.append(toString());
        sb.append(" height ").append(height);
        sb.append(" hash ").append(treeHash);
        sb.append('\n');

        if (!children.isEmpty()) {
            var prefix = inherited;
            if (prompt.equals(CONSECUTIVE_PROMPT)) prefix += DASHED_PROMPT;
            else if (prompt.equals(LAST_PROMPT)) prefix += EMPTY_PROMPT;

            var it = children.iterator();
            for (int i = 0; i < children.size() - 1; i++) {
                it.next().prettyPrintTo(sb, prefix, CONSECUTIVE_PROMPT);
            }
            it.next().prettyPrintTo(sb, prefix, LAST_PROMPT);
        }
    }

    public abstract <T> T accept(Visitor<T> visitor);

    public interface Visitor<T> {
        T visitLeaf(Leaf node);

        T visitConstructor(Constructor node);

        T visitOrderedList(OrderedList node);

        T visitUnorderedList(UnorderedList node);

        default T visitConflict(Conflict node) {
            throw new UnsupportedOperationException("this tree must not have conflict nodes");
        }
    }
}