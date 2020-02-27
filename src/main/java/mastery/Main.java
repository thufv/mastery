package mastery;

import mastery.diff.Matcher;
import mastery.merging.Merger;
import mastery.tree.node.Tree;
import mastery.util.log.Log;

import java.io.IOException;
import java.util.logging.Level;

public class Main {
    public static void main(String[] args) throws IOException {
        // set up logger
        Log.setup(Level.ALL, false);

        var base = Tree.fromJSON("sample/base.json");
        var left = Tree.fromJSON("sample/left.json");
        var right = Tree.fromJSON("sample/right.json");

        Log.ifLoggable(Level.FINEST, printer -> {
            printer.println("base");
            printer.println(base.prettyPrint());
            printer.println("left");
            printer.println(left.prettyPrint());
            printer.println("right");
            printer.println(right.prettyPrint());
        });

        var matcher = new Matcher();
        var merger = new Merger();

        var matching = matcher.apply(base, left, right);
        var target = merger.apply(matching);
        Log.info("%s", target.getRawCodeString());
    }
}
