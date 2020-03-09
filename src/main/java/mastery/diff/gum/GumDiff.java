package mastery.diff.gum;

import mastery.tree.Tree;

public class GumDiff extends GumTree {
    public GumDiff() {
        super(2, 0.2);
    }

    @Override
    public double dice(Tree node1, Tree node2) {
        int matchedCount = 0;
        for (var child : node1.children) {
            if (!matched.contains(child)) {
                matchedCount++;
            }
        }

        if (node1.isConstructor() && node2.isConstructor() && node1.label == node2.label) {
            for (int i = 0; i < node1.children.size(); i++) {
                var u = node1.children.get(i);
                var v = node1.children.get(i);
                if (u.treeHash == v.treeHash && !matched.contains(u) && !matched.contains(v)) {
                    matchedCount++;
                }
            }
        }

        return matchedCount * 2.0 / (node1.children.size() + node2.children.size());
    }
}
