package mastery.actions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import mastery.actions.model.*;
import mastery.matcher.MappingStore;
import mastery.tree.Tree;
public class RootAndLeavesClassifier extends TreeClassifier {

    public RootAndLeavesClassifier(Tree src, Tree dst, MappingStore mappings, List<Action> actions) {
        super(src, dst, mappings, actions);
    }

    public RootAndLeavesClassifier(Tree src, Tree dst, MappingStore mappings) {
        super(src, dst, mappings);
    }

    @Override
    public void classify() {
        System.out.println("Before iterate actions");

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

        System.out.println("After iterate actions");
        System.out.println("Before calculate dstAddTrees");

        Set<Tree> fDstAddTrees = new HashSet<>();
        for (Tree t: dstAddTrees) {
            System.out.println("add " + t);
            // FIXME: extreme hack, idk why it could be null
            if (t != null && !dstAddTrees.contains(t.parent))
                fDstAddTrees.add(t);
        }
        dstAddTrees = fDstAddTrees;

        System.out.println("After calculate dstAddTrees");
        System.out.println("Before calculate srcDelTrees");

        Set<Tree> fSrcDelTrees = new HashSet<>();
        for (Tree t: srcDelTrees) {
            System.out.println("del " + t);

            // FIXME: extreme hack, idk why it could be null
            if (t != null && !srcDelTrees.contains(t.parent))
                fSrcDelTrees.add(t);
        }
        srcDelTrees = fSrcDelTrees;

        System.out.println("After calculate srcDelTrees");
    }

}
