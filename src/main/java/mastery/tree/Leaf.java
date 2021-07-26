package mastery.tree;

import java.nio.charset.StandardCharsets;

/**
 * A leaf node, i.e. a token.
 */
public class Leaf extends Tree {
    public String code;
    public byte[] codeBytes;

    public Leaf(int label, String name, String code) {
        super(label, name);
        this.code = code;
        this.codeBytes = code.getBytes(StandardCharsets.UTF_8);
    }

    public Leaf(int label, String name, String code, String identifier) {
        this(label, name, code);
        if (identifier != null) {
            this.identifier = name + ":" + identifier;
        }
    }

    public Leaf(int label, String name, int startPos, int endPos, String fullCode) {
        this(label, name, fullCode.substring(startPos, endPos));
        this.startPos = startPos;
        this.endPos = endPos;
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
        Tree copiedLeaf = new Leaf(label, name, code);
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
        return name + " '" + code + "'" + " assignment " + assignment;
    }
}
