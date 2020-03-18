package mastery.tree;

import mastery.util.log.IndentPrinter;
import org.jetbrains.annotations.Nullable;

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
     * Height, 0 for leaves.
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
     * Assigned integer for equivalence checking. (1-based)
     *
     * @deprecated when using GumTree, the assignment is not computed!
     */
    @Deprecated
    public int assignment;

    /**
     * Children.
     */
    public final List<Tree> children;

    /**
     * Parent.
     *
     * @return parent if exists, or else null.
     */
    public final @Nullable Tree getParent() {
        return parent;
    }

    /**
     * Equivalence of two tree nodes.
     *
     * @return if they're equal?
     * @deprecated when using GumTree, the assignment is not computed!
     */
    @Deprecated
    public final boolean equals(Tree tree) {
        return height == tree.height && assignment == tree.assignment;
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

        // compute size and height
        int height = 0;
        int size = 1;
        for (var child : children) {
            size += child.size;
            if (child.height > height) {
                height = child.height;
            }

            child.parent = this; // set parent here
        }
        this.size = size;
        this.height = height + 1;
        this.parent = null;
    }

    protected Tree(int label, String name) {
        this.label = label;
        this.name = name;
        this.children = Collections.emptyList();
        this.height = 0;
        this.size = 1;
        this.parent = null;
    }

    private Tree parent;
}