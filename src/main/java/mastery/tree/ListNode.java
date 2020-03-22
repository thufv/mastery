package mastery.tree;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.List;

/**
 * A list node, whose number of children is arbitrary.
 */
public abstract class ListNode extends InternalNode implements Iterable<Tree> {
    protected ListNode(int label, String name, List<Tree> children) {
        super(label, name, children);
    }

    @Override
    public final boolean isConstructor() {
        return false;
    }

    @NotNull
    @Override
    public final Iterator<Tree> iterator() {
        return children.iterator();
    }

    public final boolean isEmpty() {
        return children.isEmpty();
    }
}
