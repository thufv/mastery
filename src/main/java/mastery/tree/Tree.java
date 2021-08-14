package mastery.tree;

import mastery.util.Interval;
import mastery.util.log.IndentPrinter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;

import static org.junit.Assert.assertNotNull;

/**
 * A parse tree.
 * <p>
 * Nodes are classified into five categories:
 *
 * @see Constructor
 * @see OrderedList
 * @see UnorderedList
 * @see Leaf
 * @see Conflict (target tree only)
 */
public abstract class Tree {
    /**
     * Height (leaves are 0).
     */
    public int height;

    /**
     * Size, i.e. total number of nodes.
     */
    public int size;

    /**
     * Label, i.e. grammar kind/type, starts from 1.
     * -1 stands for weird label.
     * -2 stands for conflict.
     */
    public int label;

    public static final int LABEL_MAX = TreeTransformer.LABEL_MAX;

    /**
     * Human-readable string representation of label.
     */
    public String name;

    /**
     * Children.
     */
    public List<Tree> children;

    /**
     * parent
     */
    public Tree parent = null;

    /**
     * Assigned integer for equivalence checking. (1-based)
     */
    public int assignment = -1;

    /**
     * Information about dfs order (1-based) to keep monotonicity.
     */
    public Integer dfsIndex = 0;

    /**
     * The current node is considered.
     * (for base tree)
     */
    public Interval preInterval = null;

    /**
     * LCA stands for the lowest common ancestor of the buddies of all descendants of the current node.
     * (the current node itself is also considered)
     * This field is only for base tree.
     * This field is used to calculate the candidate, which is used in the bottom-up phase.
     */
    public Tree postLCA = null;

    /**
     * The interval of the current node.
     * (for left tree and right tree)
     */
    public Interval interval = null;

    /**
     * The number of child that the node is
     */
    public int childNo = 0;

    /**
     * The buddy of recovery mapping (if the current node is one node of recovery mapping)
     */
    public Tree recoveryBuddy;

    /**
     * stop means this is a relative complete syntax unit
     */
    public boolean stop = false;

    /**
     * if the node is a declaration with identifier,
     * the identifier will not be null.
     */
    public String identifier = null;

    /**
     * The position of the first character.
     */
    public int startPos;

    /**
     * The position of the last character.
     */
    public int endPos;

    /**
     * The id for generating edit scripts (actions).
     */
    public int actionId;

    /**
     * names that are allowed to look ahead
     */
    public static HashSet<String> lookaheadNames; // FIXME: now there're no lookahead names

    /**
     * Deep copy this node.
     *
     * @return a deep copied version
     */
    public abstract Tree deepCopy();

    /**
     * The SLOW way to check if two trees are strictly identical (unordered lists are also regarded as ordered).
     *
     * @param that another tree
     * @return true iff they are identical
     */
    public abstract boolean identicalTo(Tree that);

    @SuppressWarnings("unchecked")
    public abstract <C> void accept(Visitor<C> visitor, C... ctx);

    /**
     * A visitor for visiting nodes by type.
     * You have the freedom to decide which nodes need be visited and the visiting order.
     */
    @SuppressWarnings("unchecked")
    public interface Visitor<C> {
        default void visitInternal(InternalNode internal, C... ctx) {
        }

        default void visitConstructor(Constructor constructor, C... ctx) {
            visitInternal(constructor, ctx);
        }

        default void visitListNode(ListNode listNode, C... ctx) {
            visitInternal(listNode, ctx);
        }

        default void visitOrderedList(OrderedList ordered, C... ctx) {
            visitListNode(ordered, ctx);
        }

        default void visitUnorderedList(UnorderedList unordered, C... ctx) {
            visitListNode(unordered, ctx);
        }

        default void visitLeaf(Leaf leaf, C... ctx) {
        }

        default void visitConflict(Conflict conflict, C... ctx) {
        }
    }

    public abstract <T> T accept(RichVisitor<T> visitor);

    /**
     * Like `Visitor` but returns a value of type `T`.
     */
    public interface RichVisitor<T> {
        default T visitInternal(InternalNode internal) {
            return null;
        }

        default T visitConstructor(Constructor constructor) {
            return visitInternal(constructor);
        }

        default T visitListNode(ListNode listNode) {
            return visitInternal(listNode);
        }

        default T visitOrderedList(OrderedList ordered) {
            return visitListNode(ordered);
        }

        default T visitUnorderedList(UnorderedList unordered) {
            return visitListNode(unordered);
        }

        default T visitLeaf(Leaf leaf) {
            return null;
        }

        default T visitConflict(Conflict conflict) {
            return null;
        }
    }

    public abstract <R, A> R accept(GenericVisitor<R, A> v, A arg);

    /**
     * Like `Visitor` but returns a value of type `R`.
     */
    public interface GenericVisitor<R, A> {
        default R visit(InternalNode tree, A arg) {
            return null;
        }

        default R visit(Constructor tree, A arg) {
            return visit((InternalNode) tree, arg);
        }

        default R visit(ListNode tree, A arg) {
            return visit((InternalNode) tree, arg);
        }

        default R visit(OrderedList tree, A arg) {
            return visit((ListNode) tree, arg);
        }

        default R visit(UnorderedList tree, A arg) {
            return visit((ListNode) tree, arg);
        }

        default R visit(Leaf tree, A arg) {
            return null;
        }

        default R visit(Conflict tree, A arg) {
            return null;
        }
    }

    /**
     * Iterate nodes in pre-order, i.e. parent precede children.
     *
     * @return an iterable in pre-order
     */
    public Iterable<Tree> preOrder() {
        return () -> TreeTraverse.preOrderIterator(this);
    }

    /**
     * Pre-order walker by node type.
     */
    public abstract static class PreOrderWalker implements Visitor<Object>, Consumer<Tree> {
        /**
         * Execute post-order walking.
         *
         * @param tree the root node to start with
         */
        @Override
        public final void accept(Tree tree) {
            for (var node : tree.preOrder()) {
                node.accept(this);
            }
        }
    }

    /**
     * Iterate nodes in post-order, i.e. children precede parents.
     *
     * @return an iterable in post-order
     */
    public Iterable<Tree> postOrder() {
        return () -> TreeTraverse.postOrderIterator(this);
    }

    /**
     * Post-order walker by node type.
     */
    public abstract static class PostOrderWalker implements Visitor<Object>, Consumer<Tree> {
        /**
         * Execute post-order walking.
         *
         * @param tree the root node to start with
         */
        @Override
        public final void accept(Tree tree) {
            for (var node : tree.postOrder()) {
                node.accept(this);
            }
        }
    }

    /**
     * Human-readable string representation of the root of the tree.
     *
     * @return a readable string
     */
    public abstract String toString();

    public final void prettyPrintTo(IndentPrinter printer) {
        TreePrinters.textTree(this, printer);
    }

    public String toReadableString() {
        var sb = new StringBuilder();
        sb.append(name).append(" `");
        var code = TreePrinters.rawCode(this).strip();
        if (code.length() < 50) {
            sb.append(code);
        } else {
            sb.append(code, 0, 50).append("...");
        }
        sb.append('`');
        return sb.toString();
    }

    public abstract boolean isLeaf();

    public abstract boolean isConstructor();

    public abstract boolean isOrderedList();

    public abstract boolean isUnorderedList();

    public abstract boolean isConflict();

    protected Tree(int label, String name, List<Tree> children) {
        this.label = label;
        this.name = name;
        this.children = children;

        this.height = children.stream()
            .mapToInt(child -> child.height).max().orElse(-1) + 1;
        this.size = children.stream()
            .mapToInt(child -> child.size).sum() + 1;

        for (int i = 0; i < children.size(); ++i) {
            Tree child = children.get(i);
            child.childNo = i; // set the number as child
            child.parent = this; // set parent here
        }
    }

    protected Tree(int label, String name) {
        this(label, name, Collections.emptyList());
    }

    public static Tree getLCA(Tree node1, Tree node2) {
        if (node1 == null) return node2;
        if (node2 == null) return node1;

        // Log.finer("LCA(%s, %s) = ", node1, node2);

        while (node1 != node2) {
            assertNotNull(node1);
            assertNotNull(node2);

            if (node1.size < node2.size) node1 = node1.parent;
            else node2 = node2.parent;
        }

        // Log.finer("%s", node1);

        return node1;
    }

    public final boolean equals(Tree node) {
        assert assignment != 0;
        assert node.assignment != 0;
        return assignment == node.assignment;
    }

    public static Tree getFirstLeaf(Tree t) {
        Tree current = t;
        while (!current.children.isEmpty())
            current = current.children.get(0);

        return current;
    }

    public void updateNumberOfChildren() {
        for (int i = 0; i < children.size(); ++i)
            children.get(i).childNo = i;
    }

    // the node itself is excluded
    public List<Tree> getDescendants() {
        List<Tree> descendants = new ArrayList<>();
        for (Tree node: this.preOrder())
            if (node != this)
                descendants.add(node);
        return descendants;
    }

    public void refresh() {
        for (Tree child: children)
            child.refresh();

        this.height = children.stream()
            .mapToInt(child -> child.height).max().orElse(-1) + 1;
        this.size = children.stream()
            .mapToInt(child -> child.size).sum() + 1;

        for (int i = 0; i < children.size(); ++i)
            children.get(i).childNo = i;
    }

    public boolean is(String fullName) {
        return name.equals(fullName);
    }

    public boolean isProperty(String fieldName) {
        return name.endsWith("#" + fieldName);
    }

    public String getIdentifierName() {
        return identifier.substring(identifier.indexOf(':') + 1);
    }

    public void setIdentifierName(String identifierName) {
        this.identifier = this.name + ":" + identifierName;
    }

    public Tree getOnlyChild() {
        assert children.size() == 1;
        return children.get(0);
    }

    public Tree getOnlyLeftTree() {
        throw new IllegalStateException("the tree is not a conflict");
    }

    public Tree getOnlyRightTree() {
        throw new IllegalStateException("the tree is not a conflict");
    }

    public String getValue() {
        throw new IllegalStateException("the tree has no value");
    }
}