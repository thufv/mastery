package mastery.actions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import mastery.actions.model.Action;
import mastery.matcher.MappingStore;
import mastery.tree.Tree;

public abstract class TreeClassifier {

    protected Set<Tree> srcUpdTrees = new HashSet<>();

    protected Set<Tree> dstUpdTrees = new HashSet<>();

    protected Set<Tree> srcMvTrees = new HashSet<>();

    protected Set<Tree> dstMvTrees = new HashSet<>();

    protected Set<Tree> srcDelTrees = new HashSet<>();

    protected Set<Tree> dstAddTrees = new HashSet<>();

    protected Tree src;

    protected Tree dst;

    protected MappingStore mappings;

    protected List<Action> actions;

    public TreeClassifier(Tree src, Tree dst, MappingStore mappings, List<Action> actions) {
        this.src = src;
        this.dst = dst;
        this.mappings = mappings;
        this.actions = actions;
        classify();
    }

    public TreeClassifier(Tree src, Tree dst, MappingStore mappings) {
        this.src = src;
        this.dst = dst;
        this.mappings = mappings;

        ActionGenerator g = new ActionGenerator(src, dst, mappings);
        g.generate();
        this.actions = g.getActions();
        classify();
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
