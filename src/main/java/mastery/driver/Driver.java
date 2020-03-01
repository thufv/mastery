package mastery.driver;

import mastery.diff.Matcher;
import mastery.merging.Merger;
import mastery.tree.Tree;
import mastery.tree.TreeBuilders;
import mastery.tree.TreePrinters;
import mastery.util.HelpException;
import mastery.util.log.Log;
import org.apache.commons.cli.ParseException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
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
                Log.setup(config.logLevel, config.logDump);
            }
            else {
                Log.setup(config.logLevel, config.logColorful);
            }
            Log.config("logger setup");

            // Parse AST from source code
            Tree base = TreeBuilders.fromSource(config.base, config.language);
            
            Log.ifLoggable(Level.FINEST, printer -> {
                printer.println("base");
                base.prettyPrintTo(printer);
            });

            Tree left = TreeBuilders.fromSource(config.left, config.language);
            Log.ifLoggable(Level.FINEST, printer -> {
                printer.println("left");
                left.prettyPrintTo(printer);
            });

            Tree right = TreeBuilders.fromSource(config.right, config.language);
            Log.ifLoggable(Level.FINEST, printer -> {
                printer.println("right");
                right.prettyPrintTo(printer);
            });

            // Phase I: Mapping
            Matcher matcher = new Matcher();
            var mapping = matcher.apply(base, left, right);

            // Phase II: Merge
            Merger merger = new Merger();
            var target = merger.apply(mapping);

            // Everything is done.
            // Valar Morghulis
            Log.fine("done");

            // Show our output
            String code = TreePrinters.prettyCode(target, config.language);
            if (config.output == null) {
                System.out.println(code);
            }
            else {
                Writer out = new FileWriter(config.output);
                out.write(code);
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
