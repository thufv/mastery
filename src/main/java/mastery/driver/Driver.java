package mastery.driver;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import mastery.matcher.MatchingSet;
import mastery.matcher.Matcher;
import mastery.matcher.gum.GumMatcher;
import mastery.matcher.ta.TaMatcher;
import mastery.merger.BottomUpMerger;
import mastery.tree.Tree;
import mastery.tree.TreeBuilders;
import mastery.tree.TreePrinters;
import mastery.util.HelpException;
import mastery.util.log.Log;
import org.apache.commons.cli.ParseException;

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
            Tree left = TreeBuilders.fromSource(config.left, config.language);
            Tree base = TreeBuilders.fromSource(config.base, config.language);
            Tree right = TreeBuilders.fromSource(config.right, config.language);

            // Phase I: Mapping
            Matcher matcher;
            if ("gum".equals(config.algorithm)) {
                matcher = new GumMatcher();
            }
            else if ("ta".equals(config.algorithm)) {
                matcher = new TaMatcher();
            }
            else {
                throw new IllegalStateException("wrong matching algorithm. The legal options are gum/ta");
            }
            MatchingSet mapping = matcher.apply(base, left, right);

            // Phase II: Merge
            BottomUpMerger merger = new BottomUpMerger();
            Tree target = merger.apply(mapping);

            // Log.ifLoggable(Level.FINEST, printer -> {
            //     printer.println("target");
            //     target.prettyPrintTo(printer);
            // });

            // Everything is done.
            // Valar Morghulis
            Log.fine("done");

            // Show our output
            String code = TreePrinters.prettyCode(target, config.formatter);
            if (config.output == null) {
              System.out.println(code);
            } else {
              Writer out = new FileWriter(config.output);
              out.write(code);
              out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
