package mastery.matcher;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import mastery.tree.Tree;

public abstract class TwoWayMatcher{
    // WARNING: The ORDER is considered!
    // You must pass the BASE tree as FIRST parameter.
    public abstract Map<Tree, Tree> apply(Tree tree1, Tree tree2);

    protected enum MappingType {
        isomorphic,
        container,
        recovery
    }

    protected Map<Tree, Tree> m;
    protected Set<Tree> matched = new HashSet<>();
}