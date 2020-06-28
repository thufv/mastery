package mastery.merger;

import mastery.matcher.MatchingSet;
import mastery.tree.Tree;
import mastery.tree.TreePrinters;
import mastery.util.log.IndentPrinter;
import mastery.util.log.Log;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;

public abstract class MergeTest {
    private final Merger merger = new BottomUpMerger();

    protected final void testOn(Tree base, Tree left, Tree right, Tree target,
                                Map<Tree, Tree> leftMatches, Map<Tree, Tree> rightMatches) {
        var m = new MatchingSet(base, left, right);
        leftMatches.forEach(m::setLeftMatch);
        m.setLeftMatch(base, left);
        rightMatches.forEach(m::setRightMatch);
        m.setRightMatch(base, right);

        try {
            Log.setup(Level.ALL, false);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Tree tree = merger.apply(m);
        IndentPrinter printer = new IndentPrinter();

        System.out.println("merged tree");
        TreePrinters.rawTree(tree, printer);
        printer.flush();

        System.out.println("target tree");
        TreePrinters.rawTree(target, printer);
        printer.flush();

        assertTrue(tree.identicalTo(target));
    }
}
