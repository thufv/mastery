package mastery.merger;

import mastery.matcher.gum.HashMatchingSet;
import mastery.tree.Tree;
import mastery.tree.TreePrinters;
import mastery.util.log.IndentPrinter;
import mastery.util.log.Log;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;

import static org.junit.Assert.assertTrue;

public abstract class MergeTest {
    private final Merger merger = new BottomUpMerger();

    protected final void testOn(Tree base, Tree left, Tree right, Tree target,
                                Map<Tree, Tree> leftMatches, Map<Tree, Tree> rightMatches) {
        var m = new HashMatchingSet(base, left, right);
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
        TreePrinters.textTree(tree, printer);
        printer.flush();
        assertTrue(tree.identicalTo(target));
    }
}
