package mastery.merging;

import mastery.diff.MatchingSet;
import mastery.tree.*;

import java.util.function.Function;

public abstract class Merger implements Function<MatchingSet, Tree>,
        Tree.RichVisitor<MergeScenario> {
    @Override
    public Tree apply(MatchingSet m) {
        this.m = m;
        return merge();
    }

    protected abstract Tree merge();

    @Override
    public MergeScenario visitLeaf(Leaf leaf) {
        return MergeScenario.of(leaf, m.getLeftMatch(leaf), m.getRightMatch(leaf));
    }

    @Override
    public MergeScenario visitConstructor(Constructor constructor) {
        return MergeScenario.of(constructor, m.getLeftMatch(constructor), m.getRightMatch(constructor));
    }

    @Override
    public MergeScenario visitOrderedList(OrderedList ordered) {
        return MergeScenario.of(ordered, m.getLeftMatch(ordered), m.getRightMatch(ordered));
    }

    @Override
    public MergeScenario visitUnorderedList(UnorderedList unordered) {
        return MergeScenario.of(unordered, m.getLeftMatch(unordered), m.getRightMatch(unordered));
    }

    @Override
    public MergeScenario visitConflict(Conflict conflict) {
        throw new IllegalStateException("cannot visit conflict!");
    }

    protected MatchingSet m;
}
