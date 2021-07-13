package mastery.actions;

import mastery.actions.model.*;
import mastery.matcher.Mapping;
import mastery.matcher.MappingStore;
import mastery.tree.FakeTree;
import mastery.tree.Tree;
import mastery.tree.Leaf;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;

import mastery.util.log.*;

import java.util.*;

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
        // System.out.println(" < mappings");
        // for (Mapping mapping: mappings.asSet())
        //     System.out.println(mapping.first + " <-> " + mapping.second);
        // System.out.println(" mappings >");

        this.origSrc = src;
        this.newSrc = this.origSrc.deepCopy();
        this.origDst = dst;

        // System.out.println("Before put");

        origSrcTrees = new TIntObjectHashMap<>();
        for (Tree t: origSrc.preOrder())
            origSrcTrees.put(t.actionId, t);
        cpySrcTrees = new TIntObjectHashMap<>();
        for (Tree t: newSrc.preOrder())
            cpySrcTrees.put(t.actionId, t);
        
        // System.out.println("After put");
        // System.out.println("Before link");

        origMappings = new MappingStore();
        for (Mapping m: mappings) {
            // System.out.println("link " + cpySrcTrees.get(m.first.actionId) + " and " + m.second);

            this.origMappings.link(cpySrcTrees.get(m.first.actionId), m.second);
        }
        // System.out.println("After link");
        // System.out.println("Before copy");

        this.newMappings = origMappings.copy();

        // System.out.println("After copy");
    }

    public List<Action> getActions() {
        return actions;
    }

    // WARNING: this algorithm requires the roots of the two trees are matched
    public List<Action> generate() {
        Tree srcFakeRoot = new FakeTree(new ArrayList<>(Arrays.asList(newSrc)));
        Tree dstFakeRoot = new FakeTree(new ArrayList<>(Arrays.asList(origDst)));
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
        bfsDst.add(origDst);
        while (!bfsDst.isEmpty()) {
            Tree x = bfsDst.poll();
            bfsDst.addAll(x.children);

            Log.finer("===== " + x + " =====");

            Tree w = null;
            Tree y = x.parent;

            // System.out.println("y = " + y);

            Tree z = newMappings.getSrc(y);

            if (!newMappings.hasDst(x)) {
                Log.finer("  case: doesn't have dst");

                Integer k = findPos(x);
                // Insertion case : insert new node.
                w = new FakeTree(new ArrayList<Tree>());
                // Here I trivially keep the id of w as 0
                w.actionId = lastId;
                ++lastId;

                // In order to use the real nodes from the second tree, we
                // furnish x instead of w and fake that x has the newly
                // generated ID.
                Action ins = new Insert(x, origSrcTrees.get(z.actionId), k);
                actions.add(ins);

                Log.finer("  " + ins);

                origSrcTrees.put(w.actionId, x);
                newMappings.link(w, x);
                z.children.add(k, w);
                z.updateNumberOfChildren();
                z.updateNumberOfChildren();
                w.parent = z;
            } else {
                Log.finer("  case: have dst");

                w = newMappings.getSrc(x);
                if (!x.equals(origDst)) {
                    Tree v = w.parent;
                    if (!(w.label == x.label) || w.isLeaf() && x.isLeaf() && !(((Leaf)w).code.equals(((Leaf)x).code))) {
                        Log.finer("    case: labels are not equal");

                        Action upd = new Update(origSrcTrees.get(w.actionId), x.name);
                        actions.add(upd);

                        Log.finer("    " + upd);

                        w.label = x.label;
                        w.name = x.name;
                    }
                    if (!z.equals(v)) {
                        Log.finer("    case: nodes are not equal");

                        int k = findPos(x);
                        Action mv = new Move(origSrcTrees.get(w.actionId), origSrcTrees.get(z.actionId), k);
                        actions.add(mv);
                        Log.finer("    " + mv);

                        int oldk = w.childNo;
                        z.children.add(k, w);
                        z.updateNumberOfChildren();
                        w.parent.children.remove(oldk);
                        w.parent.updateNumberOfChildren();
                        w.parent = z;
                    }
                }
            }

            // System.out.println("Before align children");

            srcInOrder.add(w);
            dstInOrder.add(x);
            alignChildren(w, x);
        }

        // post-order traversal
        for (Tree w : newSrc.postOrder()) {
            if (!newMappings.hasSrc(w)) {
                Action del = new Delete(origSrcTrees.get(w.actionId));
                actions.add(del);
                Log.finer(del.toString());

                w.parent.children.remove(w);
                w.parent.updateNumberOfChildren();
            }
        }

        return actions;
    }

    private void alignChildren(Tree w, Tree x) {
        Log.finer("alignChildren(" + w + ", " + x + ")");

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
        
        Log.finer("s1:");
        for (Tree node: s1) Log.finer(" " + node);
        Log.finer("s2:");
        for (Tree node: s2) Log.finer(" " + node);

        List<Mapping> lcs = lcs(s1, s2);

        for (Mapping m : lcs) {
            srcInOrder.add(m.first);
            dstInOrder.add(m.second);
        }

        for (Tree a : s1) {
            for (Tree b: s2 ) {
                if (origMappings.has(a, b)) {
                    boolean contained = false;
                    for (Mapping m: lcs)
                        if (m.first == a && m.second == b)
                            contained = true;

                    if (!contained) {
                        int k = findPos(b);

                        if (!w.isUnorderedList()) {
                            Action mv = new Move(origSrcTrees.get(a.actionId), origSrcTrees.get(w.actionId), k);
                            actions.add(mv);
                            Log.finer(mv.toString());
                        }

                        int oldk = a.childNo;
                        w.children.add(k, a);
                        w.updateNumberOfChildren();
                        if (k  < oldk )
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

        int xpos = x.childNo;
        Tree v = null;
        for (int i = 0; i < xpos; i++) {
            Tree c = siblings.get(i);
            if (dstInOrder.contains(c)) v = c;
        }

        if (v == null) return 0;

        Tree u = newMappings.getSrc(v);
        int upos = u.childNo;
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
