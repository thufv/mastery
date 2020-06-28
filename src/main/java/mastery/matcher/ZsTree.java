package mastery.matcher;

import mastery.tree.Tree;

import java.util.*;

// The tree class for ZS algorithm
public class ZsTree {
    public int start; // internal array position of leafmost leaf descendant of the root node

    public int nodeCount; // number of nodes

    public int leafCount;

    public int[] llds; // llds[i] stores the postorder-ID of the
    // left-most leaf descendant of the i-th node in postorder
    public Tree[] labels; // labels[i] is the tree of the i-th node in postorder

    public int[] kr;

    public ZsTree(Tree t) {
        this.start = 0;
        this.nodeCount = t.size;
        this.leafCount = 0;
        this.llds = new int[start + nodeCount];
        this.labels = new Tree[start + nodeCount];

        int idx = 1;
        Map<Tree,Integer> tmpData = new HashMap<>();
        for (Tree n: t.postOrder()) {
            tmpData.put(n, idx);
            this.setTree(idx, n);
            this.setLld(idx, tmpData.get(Tree.getFirstLeaf(n)));
            if (n.children.isEmpty())
                leafCount++;
            idx++;
        }

        setKeyRoots();
    }

    public void setTree(int i, Tree tree) {
        labels[i + start - 1] = tree;
        if (nodeCount < i)
            nodeCount = i;
    }

    public void setLld(int i, int lld) {
        llds[i + start - 1] = lld + start - 1;
        if (nodeCount < i)
            nodeCount = i;
    }

    public boolean isLeaf(int i) {
        return this.lld(i) == i;
    }

    public int lld(int i) {
        return llds[i + start - 1] - start + 1;
    }

    public Tree tree(int i) {
        return labels[i + start - 1];
    }

    public void setKeyRoots() {
        kr = new int[leafCount + 1];
        boolean[] visited = new boolean[nodeCount + 1];
        Arrays.fill(visited, false);
        int k = kr.length - 1;
        for (int i = nodeCount; i >= 1; i--)
            if (!visited[lld(i)]) {
                kr[k] = i;
                visited[lld(i)] = true;
                k--;
            }
    }
}