package mastery.tree;

import mastery.util.Interval;
import mastery.util.log.IndentPrinter;
import org.jetbrains.annotations.Nullable;

import static org.junit.Assert.assertNotNull;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * A parse tree.
 * <p>
 * Nodes are classified into five categories:
 *
 * @see Constructor
 * @see OrderedList
 * @see UnorderedList
 * @see Leaf
 * @see Constructor (target tree only)
 */
public abstract class Tree {
    /**
     * Height (leaves are 0).
     */
    public final int height;

    /**
     * Size, i.e. total number of nodes.
     */
    public final int size;

    /**
     * Label, i.e. grammar kind/type.
     * -1 stands for weird label.
     */
    public final int label;

    /**
     * Human-readable string representation of label.
     */
    public final String name;

    /**
     * Children.
     */
    public final List<Tree> children;

    /**
     * Hash value.
     */
    public final int treeHash;

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
     * LCA stands for the lowest common ancestor
     * The current node is considered.
     * (for base tree)
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
    public int childno;

    /**
     * The buddy of recovery mapping (if the current node is one node of recovery mapping)
     */
    public Tree recoveryBuddy;

    /**
     * Parent.
     *
     * @return parent if exists, or else null.
     */
    public final @Nullable Tree getParent() {
        return parent;
    }

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
    
    public abstract <C> void accept(Visitor<C> visitor, C... ctx);

    /**
     * A visitor for visiting nodes by type.
     * You have the freedom to decide which nodes need be visited and the visiting order.
     */
    public interface Visitor<C> {
        default void visitLeaf(Leaf leaf, C... ctx) {
        }

        default void visitConstructor(Constructor constructor, C... ctx) {
            visitInternal(constructor, ctx);
        }

        default void visitOrderedList(OrderedList ordered, C... ctx) {
            visitInternal(ordered, ctx);
        }

        default void visitUnorderedList(UnorderedList unordered, C... ctx) {
            visitInternal(unordered, ctx);
        }

        default void visitConflict(Conflict conflict, C... ctx) {
        }

        default void visitInternal(InternalNode internal, C... ctx) {
        }
    }

    public abstract <T> T accept(RichVisitor<T> visitor);

    /**
     * Like `Visitor` but returns a value of type `T`.
     */
    public interface RichVisitor<T> {
        T visitLeaf(Leaf leaf);

        T visitConstructor(Constructor constructor);

        T visitOrderedList(OrderedList ordered);

        T visitUnorderedList(UnorderedList unordered);

        T visitConflict(Conflict conflict);
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

    public abstract boolean isLeaf();

    public abstract boolean isConstructor();

    public abstract boolean isOrderedList();

    public abstract boolean isUnorderedList();

    public abstract boolean isConflict();

    protected Tree(int label, String name, List<Tree> children) {
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

        // compute size
        int size = 1;
        for (var child : children) {
            size += child.size;
        }
        this.size = size;

        // set parents
        for (int i = 0; i < children.size(); ++i) {
            Tree child = children.get(i);

            child.childno = i;
            child.parent = this; // set parent here
        }
        this.parent = null;

        // compute tree hash
        int hash = label;
        if (isUnorderedList()) {
            hash = label * 23333333;
            for (var child : children) {
                hash = hash + child.treeHash;
            }
        }
        else {
            for (var child : children) {
                hash = hash * 2333 + child.treeHash;
            }
        }
        this.treeHash = hash;
    }

    protected Tree(int label, String name) {
        this.label = label;
        this.name = name;
        this.children = Collections.emptyList();
        this.height = 0;
        this.size = 1;
        this.parent = null;

        this.treeHash = label * 2333 + name.hashCode();
    }

    Tree parent;

    public final static Tree getLCA(Tree node1, Tree node2) {
        if (node1 == null) return node2;
        if (node2 == null) return node1;
        while(node1 != node2) {
            assertNotNull(node1);
            assertNotNull(node2);

            if (node1.size < node2.size) {
                node1 = node1.parent;
            }
            else {
                node2 = node2.parent;
            }
        }
        return node1;
    }
}