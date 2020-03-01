package mastery.driver;

import mastery.diff.Matcher;
import mastery.merging.Merger;
import mastery.tree.Tree;
import mastery.tree.TreeBuilder;
import mastery.tree.TreePrinters;
import mastery.util.log.Log;
import org.apache.commons.cli.ParseException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;

public final class Driver {
    public static void fromCLI(String[] args) {
        CLIParser parser = new CLIParser();
        try {
            Config config = parser.parse(args);
            fromConfig(config);
        } catch (ParseException e) {
            e.printStackTrace();
            parser.printHelp();
        } catch (HelpException e) {
            parser.printHelp();
        }
    }

    public static void fromConfig(Config config) {
        try {
            // set up logger
            if (config.logDump != null) {
                Log.setup(config.logLevel, config.logColorful, config.logDump);
            }
            else {
                Log.setup(config.logLevel, config.logColorful);
            }
            Log.config("logger setup");

            // Parse AST from source code
            Tree base = TreeBuilder.fromSource(config.base, config.language);
            
            Log.ifLoggable(Level.FINEST, printer -> {
                printer.println("base");
                base.prettyPrintTo(printer);
            });

            Tree left = TreeBuilder.fromSource(config.left, config.language);
            Log.ifLoggable(Level.FINEST, printer -> {
                printer.println("left");
                left.prettyPrintTo(printer);
            });

            Tree right = TreeBuilder.fromSource(config.right, config.language);
            Log.ifLoggable(Level.FINEST, printer -> {
                printer.println("right");
                right.prettyPrintTo(printer);
            });

            Matcher matcher = new Matcher();
            Merger merger = new Merger();

            var mapping = matcher.apply(base, left, right);
            var target = merger.apply(mapping);
            Log.fine("done");
            Log.ifLoggable(Level.FINEST, printer -> TreePrinters.rawCode(target, printer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
