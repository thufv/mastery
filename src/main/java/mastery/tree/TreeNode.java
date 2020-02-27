package mastery.tree;

import java.util.List;

public abstract class TreeNode<E> {
    public final List<E> children;

    protected TreeNode(List<E> children) {
        this.children = children;
    }
}
