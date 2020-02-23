package mastery.merge;

import mastery.tree.Node;

public interface IMerge<E extends Node> {
    E apply(E base, E left, E right);
}
