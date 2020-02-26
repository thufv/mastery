package mastery.tree.target;

import java.util.List;

public final class Internal extends TargetNode {
    public final int label;
    public final String name;
    public final List<TargetNode> children;

    private Internal(int label, String name, List<TargetNode> children) {
        this.label = label;
        this.name = name;
        this.children = children;
    }

    public static Internal ofConstructor(int label, String name, List<TargetNode> args) {
        return new Internal(label, name, args);
    }

    public static Internal ofOrderedList(int label, String name, List<TargetNode> elems) {
        return new Internal(label, name, elems);
    }

    public static Internal ofUnorderedList(int label, String name, List<TargetNode> elems) {
        return new Internal(label, name, elems);
    }
}
