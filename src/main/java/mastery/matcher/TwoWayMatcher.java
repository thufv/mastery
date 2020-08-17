package mastery.matcher;

import mastery.tree.Tree;

public abstract class TwoWayMatcher{
    // WARNING: The ORDER is considered!
    // You must pass the BASE tree as FIRST parameter.
    public abstract MappingStore apply(Tree tree1, Tree tree2);

    protected enum MappingType {
        isomorphic,
        container,
        recovery,
        compulsory,
        homonymy
    }

    protected MappingStore m;
}
