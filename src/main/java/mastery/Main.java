package mastery;

import mastery.diff.Matcher;
import mastery.merging.Merger;
import mastery.tree.TreeBuilders;
import mastery.tree.TreePrinters;
import mastery.util.log.Log;

import java.io.IOException;
import java.util.logging.Level;

public class Main {
    public static void main(String[] args) {
//        Driver.fromCLI(args);
        try {
            testMain();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testMain() throws IOException {
        // set up logger
        Log.setup(Level.ALL, false);

        var base = TreeBuilders.fromJSON("sample/base.json");
        var left = TreeBuilders.fromJSON("sample/left.json");
        var right = TreeBuilders.fromJSON("sample/right.json");

        Log.ifLoggable(Level.FINEST, printer -> {
            printer.println("base");
            base.prettyPrintTo(printer);
            printer.println("left");
            left.prettyPrintTo(printer);
            printer.println("right");
            right.prettyPrintTo(printer);
        });

        var matcher = new Matcher();
        var merger = new Merger();

        var matching = matcher.apply(base, left, right);
        var target = merger.apply(matching);
        Log.fine("done");
        Log.ifLoggable(Level.FINEST, printer -> TreePrinters.rawCode(target, printer));
    }
}
