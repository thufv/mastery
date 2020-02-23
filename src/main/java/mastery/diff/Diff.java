package mastery.diff;

import mastery.tree.Node;

public class Diff extends GumTree {
    public Diff() {
        super(2, 0.2);
    }

    @Override
    public double dice(Node node1, Node node2) {
        int matchedCount = 0;
        for (var child : node1.children) {
            if (child.matched) {
                matchedCount++;
            }
        }

        if (node1.isConstructor() && node2.isConstructor() && node1.label == node2.label) {
            for (int i = 0; i < node1.children.size(); i++) {
                var u = node1.children.get(i);
                var v = node1.children.get(i);
                if (u.treeHash == v.treeHash && !u.matched && !v.matched) {
                    matchedCount++;
                }
            }
        }

        return matchedCount * 2.0 / (node1.children.size() + node2.children.size());
    }
}
