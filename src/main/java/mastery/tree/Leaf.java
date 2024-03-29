package mastery.tree;

import com.github.javaparser.metamodel.BaseNodeMetaModel;

/**
 * A leaf node, i.e. a token.
 */
public class Leaf extends Tree {
    public final String code;

    public final BaseNodeMetaModel meta;

    public Leaf(int label, String name, String code, BaseNodeMetaModel meta) {
        super(label, name);
        this.code = code;
        this.meta = meta;
    }

    public Leaf(int label, String name, String code) {
        this(label, name, code, null);
    }

    public Leaf(int label, String name, String code, boolean isIdentifier) {
        this(label, name, code);
        if (isIdentifier) {
            setIdentifierName(code);
        }
    }

    @Override
    public final boolean isLeaf() {
        return true;
    }

    @Override
    public final boolean isConstructor() {
        return false;
    }

    @Override
    public final boolean isOrderedList() {
        return false;
    }

    @Override
    public final boolean isUnorderedList() {
        return false;
    }

    @Override
    public final boolean isConflict() {
        return false;
    }

    @Override
    public final Tree deepCopy() {
        Tree copiedLeaf = new Leaf(label, name, code, meta);
        copiedLeaf.assignment = assignment;
        copiedLeaf.actionId = actionId;
        copiedLeaf.dfsIndex = dfsIndex;
        return copiedLeaf;
    }

    @Override
    public boolean identicalTo(Tree that) {
        if (that.isLeaf()) {
            Leaf leaf = (Leaf) that;
            return label == leaf.label && code.equals(leaf.code);
        }

        return false;
    }

    @Override
    @SafeVarargs
    public final <C> void accept(Visitor<C> visitor, C... ctx) {
        visitor.visitLeaf(this, ctx);
    }

    @Override
    public final <T> T accept(RichVisitor<T> visitor) {
        return visitor.visitLeaf(this);
    }

    @Override
    public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    @Override
    public String toString() {
        return String.format("%s '%s' assignment %d", name, code, assignment)
            + (interval != null ? String.format(" dfs [%d]", interval.l) : "");
    }

    @Override
    public String getContent() {
        return code;
    }

    @Override
    public String getValue() {
        return code;
    }
}
