package mastery.tree;

import java.util.List;

import mastery.util.log.Log;

/**
 * An internal node, which has a (nonempty) list of children.
 */
public abstract class InternalNode extends Tree {
    protected InternalNode(int label, String name, List<Tree> children) {
        super(label, name, children);

        if (name.matches(".*Declaration|SimpleName")) {
            for (Tree child : children) {
                if (child.identifier != null) {
                    setIdentifierName(child.getIdentifierName());
                }
            }
        }

        if (name.matches(".*(Declaration|Stmt)|CompilationUnit")) {
            this.stop = true;
        }
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public boolean isConflict() {
        return false;
    }

    public boolean identicalTo(Tree that) {
        if (label != that.label || height != that.height || size != that.size
                || children.size() != that.children.size()) {
            return false;
        }

        var it = children.iterator();
        var jt = that.children.iterator();
        while (it.hasNext()) {
            if (!it.next().identicalTo(jt.next())) {
                return false;
            }
        }

        return true;
    }
}
