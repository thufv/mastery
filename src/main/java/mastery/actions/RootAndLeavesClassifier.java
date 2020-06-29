package mastery.actions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import mastery.actions.model.*;
import mastery.matcher.Mapping;
import mastery.tree.Tree;
public class RootAndLeavesClassifier extends TreeClassifier {

    public RootAndLeavesClassifier(Tree src, Tree dst, Set<Mapping> rawMappings, List<Action> actions) {
        super(src, dst, rawMappings, actions);
    }

    @Override
    public void classify() {
        for (Action a: actions) {
            if (a instanceof Insert) {
                dstAddTrees.add(a.getNode());
            } else if (a instanceof Delete) {
                srcDelTrees.add(a.getNode());
            } else if (a instanceof Update) {
                srcUpdTrees.add(a.getNode());
                dstUpdTrees.add(mappings.getDst(a.getNode()));
            } else if (a instanceof Move) {
                srcMvTrees.add(a.getNode());
                dstMvTrees.add(mappings.getDst(a.getNode()));
            }
        }

        Set<Tree> fDstAddTrees = new HashSet<>();
        for (Tree t: dstAddTrees)
            if (!dstAddTrees.contains(t.parent))
                fDstAddTrees.add(t);
        dstAddTrees = fDstAddTrees;

        Set<Tree> fSrcDelTrees = new HashSet<>();
        for (Tree t: srcDelTrees) {
            if (!srcDelTrees.contains(t.parent))
                fSrcDelTrees.add(t);
        }
        srcDelTrees = fSrcDelTrees;
    }

}
