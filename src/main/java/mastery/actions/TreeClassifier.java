package mastery.actions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import mastery.actions.model.Action;
import mastery.matcher.Mapping;
import mastery.matcher.MappingStore;
import mastery.matcher.TwoWayMatcher;
import mastery.tree.Tree;

public abstract class TreeClassifier {

    protected Set<Tree> srcUpdTrees;

    protected Set<Tree> dstUpdTrees;

    protected Set<Tree> srcMvTrees;

    protected Set<Tree> dstMvTrees;

    protected Set<Tree> srcDelTrees;

    protected Set<Tree> dstAddTrees;

    protected Tree src;

    protected Tree dst;

    protected MappingStore mappings;

    protected List<Action> actions;

    public TreeClassifier(Tree src, Tree dst, Set<Mapping> rawMappings, List<Action> actions) {
        this(src, dst, rawMappings);
        this.actions = actions;
        classify();
    }

    // TODO: have no idea how to modify it
    // public TreeClassifier(Tree src, Tree dst, Matcher m) {
    //     this(src, dst, m.getMappingsAsSet());
    //     ActionGenerator g = new ActionGenerator(src.getRoot(), dst.getRoot(), m.getMappings());
    //     g.generate();
    //     this.actions = g.getActions();
    //     classify();
    // }

    private TreeClassifier(Tree src, Tree dst, Set<Mapping> rawMappings) {
        this.src = src;
        this.dst = dst;
        this.mappings = new MappingStore(rawMappings);
        this.srcDelTrees = new HashSet<>();
        this.srcMvTrees = new HashSet<>();
        this.srcUpdTrees = new HashSet<>();
        this.dstMvTrees = new HashSet<>();
        this.dstAddTrees = new HashSet<>();
        this.dstUpdTrees = new HashSet<>();
    }

    public abstract void classify();

    public Set<Tree> getSrcUpdTrees() {
        return srcUpdTrees;
    }

    public Set<Tree> getDstUpdTrees() {
        return dstUpdTrees;
    }

    public Set<Tree> getSrcMvTrees() {
        return srcMvTrees;
    }

    public Set<Tree> getDstMvTrees() {
        return dstMvTrees;
    }

    public Set<Tree> getSrcDelTrees() {
        return srcDelTrees;
    }

    public Set<Tree> getDstAddTrees() {
        return dstAddTrees;
    }

}
