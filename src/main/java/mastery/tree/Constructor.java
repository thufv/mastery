package mastery.tree;

import com.github.javaparser.metamodel.BaseNodeMetaModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A constructor, i.e. an internal node that has a fixed positive number of children.
 * 
 * namasikanam: I don't like this ambiguous name.
 */
public final class Constructor extends InternalNode {
    public BaseNodeMetaModel meta = null;

    public final int arity;

    public Constructor(int label, String name, List<Tree> children) {
        super(label, name, children);
        this.arity = children.size();
    }

    public Constructor(int label, String name, List<Tree> children, BaseNodeMetaModel meta) {
        this(label, name, children);
        this.meta = meta;
    }

    public Constructor(Constructor constructor, List<Tree> children) {
        this(constructor.label, constructor.name, children, constructor.meta);
    }

    public Tree childAt(int index) {
        if (index < 0 || index >= arity) {
            throw new IndexOutOfBoundsException(arity + "-ary constructor does not have a child at index " + index);
        }
        return children.get(index);
    }

    @Override
    public boolean isConstructor() {
        return true;
    }

    @Override
    public boolean isOrderedList() {
        return false;
    }

    @Override
    public boolean isUnorderedList() {
        return false;
    }

    @Override
    public Tree deepCopy() {
        var copiedChildren = new ArrayList<Tree>();
        for (var child : children) {
            copiedChildren.add(child.deepCopy());
        }
        Constructor copiedConstructor = new Constructor(this, copiedChildren);
        copiedConstructor.assignment = assignment;
        copiedConstructor.actionId = actionId;
        copiedConstructor.dfsIndex = dfsIndex;
        return copiedConstructor;
    }

    @Override
    @SafeVarargs
    public final <C> void accept(Visitor<C> visitor, C... ctx) {
        visitor.visitConstructor(this, ctx);
    }

    @Override
    public <T> T accept(RichVisitor<T> visitor) {
        return visitor.visitConstructor(this);
    }

    @Override
    public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    @Override
    public String toString() {
        return name + " (" + arity + "-ary) assignment " + assignment
            + (interval != null ? " dfs [" + interval.l + ", " + interval.r + "]" : "")
            ;
    }
}
