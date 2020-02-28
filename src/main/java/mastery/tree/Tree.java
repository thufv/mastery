package mastery.tree;

import mastery.util.log.IndentPrinter;
import org.jetbrains.annotations.Nullable;

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

    public int id; // TODO: do we really need this?

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

    // TODO: we don't need hash once we precomputed the isomorphic mappings by other methods (radix sort)
    public final int treeHash;

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

    public abstract void accept(Visitor visitor);

    /**
     * A visitor for visiting nodes by type.
     * You have the freedom to decide which nodes need be visited and the visiting order.
     */
    public interface Visitor {
        default void visitLeaf(Leaf leaf) {
        }

        default void visitConstructor(Constructor constructor) {
        }

        default void visitOrderedList(OrderedList ordered) {
        }

        default void visitUnorderedList(UnorderedList unordered) {
        }

        default void visitConflict(Conflict conflict) {
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
    /**
     * Post-order walker by node type.
     */
    public abstract static class PreOrderWalker implements Visitor, Consumer<Tree> {
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
    public abstract static class PostOrderWalker implements Visitor, Consumer<Tree> {
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

        // compute size and tree hash
        // hash(x) = label + \sum_{y \in children(x)} (hash(y) * primes(y.size))
        int size = 1;
        int hash = label;
        for (var child : children) {
            size += child.size;
            hash += child.treeHash * PRIMES[child.size];
            child.parent = this; // set parent here
        }
        this.size = size;
        this.treeHash = hash;
        this.parent = null;
    }

    // TODO: in-package private
    private Tree parent;

    private final int[] PRIMES = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997};
}