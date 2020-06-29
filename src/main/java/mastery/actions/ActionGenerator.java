package mastery.actions;

import mastery.actions.model.*;
import mastery.matcher.Mapping;
import mastery.matcher.MappingStore;
import mastery.tree.FakeTree;
import mastery.tree.Tree;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Queue;
import java.util.LinkedList;

public class ActionGenerator {

    private Tree origSrc;

    private Tree newSrc;

    private Tree origDst;

    private MappingStore origMappings;

    private MappingStore newMappings;

    private Set<Tree> dstInOrder;

    private Set<Tree> srcInOrder;

    private List<Action> actions;

    private TIntObjectMap<Tree> origSrcTrees;

    private TIntObjectMap<Tree> cpySrcTrees;

    public ActionGenerator(Tree src, Tree dst, MappingStore mappings) {
        this.origSrc = src;
        this.newSrc = this.origSrc.deepCopy();
        this.origDst = dst;

        origSrcTrees = new TIntObjectHashMap<>();
        for (Tree t: origSrc.preOrder())
            origSrcTrees.put(t.dfsIndex, t);
        cpySrcTrees = new TIntObjectHashMap<>();
        for (Tree t: newSrc.preOrder())
            cpySrcTrees.put(t.dfsIndex, t);

        origMappings = new MappingStore();
        for (Mapping m: mappings)
            this.origMappings.link(cpySrcTrees.get(m.first.dfsIndex), m.second);
        this.newMappings = origMappings.copy();
    }

    public List<Action> getActions() {
        return actions;
    }

    public List<Action> generate() {
        Tree srcFakeRoot = new FakeTree(newSrc);
        Tree dstFakeRoot = new FakeTree(origDst);
        newSrc.parent = srcFakeRoot;
        origDst.parent = dstFakeRoot;

        actions = new ArrayList<>();
        dstInOrder = new HashSet<>();
        srcInOrder = new HashSet<>();

        newMappings.link(srcFakeRoot, dstFakeRoot);
        int lastId = newSrc.size + 1;

        // Instead of using some twisted design pattern,
        // I decided to write a breadth-first search manually here
        Queue<Tree> bfsDst = new LinkedList<>();
        while (!bfsDst.isEmpty()) {
            Tree x = bfsDst.poll();
            bfsDst.addAll(x.children);

            Tree w = null;
            Tree y = x.parent;
            Tree z = newMappings.getSrc(y);

            if (!newMappings.hasDst(x)) {
                int k = findPos(x);
                // Insertion case : insert new node.
                w = new FakeTree();
                // Here I trivially keep the id of w as 0
                w.dfsIndex = lastId;
                ++lastId;

                // In order to use the real nodes from the second tree, we
                // furnish x instead of w and fake that x has the newly
                // generated ID.
                Action ins = new Insert(x, origSrcTrees.get(z.dfsIndex), k);
                actions.add(ins);
                //System.out.println(ins);
                origSrcTrees.put(w.dfsIndex, x);
                newMappings.link(w, x);
                z.children.add(k, w);
                z.updateNumberOfChildren();
                w.parent = z;
            } else {
                w = newMappings.getSrc(x);
                if (!x.equals(origDst)) { // TODO => x != origDst // Case of the root
                    Tree v = w.parent;
                    if (!(w.label == x.label)) {
                        actions.add(new Update(origSrcTrees.get(w.dfsIndex), x.name));
                        w.label = x.label;
                        w.name = x.name;
                    }
                    if (!z.equals(v)) {
                        int k = findPos(x);
                        Action mv = new Move(origSrcTrees.get(w.dfsIndex), origSrcTrees.get(z.dfsIndex), k);
                        actions.add(mv);
                        //System.out.println(mv);
                        int oldk = w.childno;
                        z.children.add(k, w);
                        z.updateNumberOfChildren();
                        w.parent.children.remove(oldk);
                        w.parent.updateNumberOfChildren();
                        w.parent = z;
                    }
                }
            }

            //FIXME not sure why :D
            srcInOrder.add(w);
            dstInOrder.add(x);
            alignChildren(w, x);
        }

        for (Tree w : newSrc.postOrder()) {
            if (!newMappings.hasSrc(w)) {
                actions.add(new Delete(origSrcTrees.get(w.dfsIndex)));
                //w.parent.getChildren().remove(w);
            }
        }

        //FIXME should ensure isomorphism.
        return actions;
    }

    private void alignChildren(Tree w, Tree x) {
        srcInOrder.removeAll(w.children);
        dstInOrder.removeAll(x.children);

        List<Tree> s1 = new ArrayList<>();
        for (Tree c: w.children)
            if (newMappings.hasSrc(c))
                if (x.children.contains(newMappings.getDst(c)))
                    s1.add(c);

        List<Tree> s2 = new ArrayList<>();
        for (Tree c: x.children)
            if (newMappings.hasDst(c))
                if (w.children.contains(newMappings.getSrc(c)))
                    s2.add(c);

        List<Mapping> lcs = lcs(s1, s2);

        for (Mapping m : lcs) {
            srcInOrder.add(m.first);
            dstInOrder.add(m.second);
        }

        for (Tree a : s1) {
            for (Tree b: s2 ) {
                if (origMappings.has(a, b)) {
                    if (!lcs.contains(new Mapping(a, b))) {
                        int k = findPos(b);
                        Action mv = new Move(origSrcTrees.get(a.dfsIndex), origSrcTrees.get(w.dfsIndex), k);
                        actions.add(mv);
                        //System.out.println(mv);
                        int oldk = a.childno;
                        w.children.add(k, a);
                        w.updateNumberOfChildren();
                        if (k  < oldk ) // FIXME this is an ugly way to patch the index
                            oldk ++;
                        a.parent.children.remove(oldk);
                        a.parent.updateNumberOfChildren();
                        a.parent = w;
                        srcInOrder.add(a);
                        dstInOrder.add(b);
                    }
                }
            }
        }
    }

    private int findPos(Tree x) {
        Tree y = x.parent;
        List<Tree> siblings = y.children;

        for (Tree c : siblings) {
            if (dstInOrder.contains(c)) {
                if (c.equals(x)) return 0;
                else break;
            }
        }

        int xpos = x.childno;
        Tree v = null;
        for (int i = 0; i < xpos; i++) {
            Tree c = siblings.get(i);
            if (dstInOrder.contains(c)) v = c;
        }

        //if (v == null) throw new RuntimeException("No rightmost sibling in order");
        if (v == null) return 0;

        Tree u = newMappings.getSrc(v);
        // siblings = u.parent.getChildren();
        // int upos = siblings.indexOf(u);
        int upos = u.childno;
        // int r = 0;
        // for (int i = 0; i <= upos; i++)
        // if (srcInOrder.contains(siblings.get(i))) r++;
        return upos + 1;
    }

    private List<Mapping> lcs(List<Tree> x, List<Tree> y) {
        int m = x.size();
        int n = y.size();
        List<Mapping> lcs = new ArrayList<>();

        int[][] opt = new int[m + 1][n + 1];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (newMappings.getSrc(y.get(j)).equals(x.get(i))) opt[i][j] = opt[i + 1][j + 1] + 1;
                else  opt[i][j] = Math.max(opt[i + 1][j], opt[i][j + 1]);
            }
        }

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (newMappings.getSrc(y.get(j)).equals(x.get(i))) {
                lcs.add(new Mapping(x.get(i), y.get(j)));
                i++;
                j++;
            } else if (opt[i + 1][j] >= opt[i][j + 1]) i++;
            else j++;
        }

        return lcs;
    }

}
