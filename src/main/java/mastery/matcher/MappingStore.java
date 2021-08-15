package mastery.matcher;

import mastery.tree.Tree;
import mastery.util.log.Log;

import java.util.*;

public class MappingStore implements Iterable<Mapping> {

    private Map<Tree, Tree> srcs = new HashMap<>();
    private Map<Tree, Tree> dsts = new HashMap<>();

    public MappingStore(Set<Mapping> mappings) {
        for (Mapping m: mappings)
            link(m.first, m.second);
    }

    public MappingStore(Map<Tree, Tree> map) {
        for (Map.Entry<Tree, Tree> entry : map.entrySet())
            link(entry.getKey(), entry.getValue());
    }

    public MappingStore() {
    }

    public Set<Mapping> asSet() {
        Set<Mapping> sm = new HashSet<>();
        for (Map.Entry<Tree, Tree> e : srcs.entrySet()) {
            var m = new Mapping(e.getKey(), e.getValue());
            sm.add(m);
        }
        return sm;
    }

    public MappingStore copy() {
        return new MappingStore(asSet());
    }

    public void addMappings(MappingStore mappings) {
        for (Mapping m : mappings.asSet())
            addMapping(m);
    }

    public void addMapping(Mapping m) {
        link(m.first, m.second);
    }

    public void link(Tree src, Tree dst) {
        Log.finer("link %s <-> %s", src, dst);
        Log.finer("link %s <-> %s", src.toReadableString(), dst.toReadableString());
        
        srcs.put(src, dst);
        dsts.put(dst, src);
    }

    public void unlink(Tree src, Tree dst) {
        Log.finer("unlink %s <-> %s", src, dst);
        Log.finer("unlink %s <-> %s", src.toReadableString(), dst.toReadableString());

        srcs.remove(src);
        dsts.remove(dst);
    }

    public Tree firstMappedSrcParent(Tree src) {
        Tree p = src.parent;
        if (p == null) return null;
        else {
            while (!hasSrc(p)) {
                p = p.parent;
                if (p == null) return p;
            }
            return p;
        }
    }

    public Tree firstMappedDstParent(Tree dst) {
        Tree p = dst.parent;
        if (p == null) return null;
        else {
            while (!hasDst(p)) {
                p = p.parent;
                if (p == null) return p;
            }
            return p;
        }
    }

    public Tree getDst(Tree src) {
        return srcs.get(src);
    }

    public Tree getSrc(Tree dst) {
        return dsts.get(dst);
    }

    public boolean hasSrc(Tree src) {
        return srcs.containsKey(src);
    }

    public boolean hasDst(Tree dst) {
        return dsts.containsKey(dst);
    }

    public boolean has(Tree src, Tree dst) {
        return srcs.get(src) == dst;
    }

    /**
     * Indicate whether or not a tree is mappable to another given tree.
     * @return true if both trees are not mapped and if the trees have the same type, false either.
     */
    public boolean isMatchable(Tree src, Tree dst) {
        return src.label == dst.label && !(srcs.containsKey(src)  || dsts.containsKey(dst));
    }

    @Override
    public Iterator<Mapping> iterator() {
        return asSet().iterator();
    }

    @Override
    public String toString() {
        return asSet().toString();
    }

    public int getSize() {
        return srcs.size();
    }
}
