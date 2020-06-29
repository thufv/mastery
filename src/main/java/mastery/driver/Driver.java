package mastery.driver;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.File;
import java.nio.file.*;
import java.util.logging.Level;
import java.util.Map;

import mastery.matcher.MatchingSet;
import mastery.matcher.ThreeWayMatcher;
import mastery.matcher.TwoWayMatcher;
import mastery.matcher.Assigner;
import mastery.matcher.MappingStore;
import mastery.merger.Merger;
import mastery.merger.BottomUpMerger;
import mastery.merger.TopDownPruningMerger;
import mastery.webdiff.WebDiff;
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

            if (config.mode == Config.Mode.CHECK) {
                // Parse AST from source code
                Tree trees[] = new Tree[config.files.length];
                for (int i = 0; i < config.files.length; ++i) {
                    // Abnormal signal will be exited when parsing fails
                    trees[i] = TreeBuilders.fromSource(config.files[i], config.language);
                }

                // Mapping
                Assigner assigner = new Assigner();
                assigner.apply(trees);

                for (int i = 0; i < config.files.length; ++i) {
                    final String file = config.files[i];
                    final Tree tree = trees[i];
                    Log.ifLoggable(Level.FINEST, printer -> {
                        printer.println(file);
                        tree.prettyPrintTo(printer);
                    });
                }

                boolean equivalent = true;
                for (Tree tree: trees)
                    equivalent &= tree.equals(trees[0]);
                if (equivalent) {
                    System.out.println("Yes! They're equal.");
                    System.exit(0);
                }
                else {
                    System.out.println("Sorry. They're not equal.");
                    System.exit(1);
                }
            }
            else if (config.mode == Config.Mode.MERGE) {
                // Parse AST from source code
                Tree left = TreeBuilders.fromSource(config.left, config.language);
                Tree base = TreeBuilders.fromSource(config.base, config.language);
                Tree right = TreeBuilders.fromSource(config.right, config.language);

                // Phase I: Mapping
                ThreeWayMatcher threeWayMatcher = new ThreeWayMatcher();
                MatchingSet mapping = threeWayMatcher.apply(base, left, right);

                // Phase II: Merge
                Merger merger = config.topDown ? new TopDownPruningMerger(): new BottomUpMerger();
                Tree target = merger.apply(mapping);

                // Log.ifLoggable(Level.FINEST, printer -> {
                //     printer.println("target");
                //     target.prettyPrintTo(printer);
                // });

                // Show our output
                String code = TreePrinters.prettyCode(target, config.formatter, config.language, config.left, config.right);
                if (config.output == null) {
                    System.out.println(code);
                } else {
                    Writer out = new FileWriter(config.output);
                    out.write(code);
                    out.close();
                }
            } else {
                assert config.files.length == 2;
                Tree src = TreeBuilders.fromSource(config.files[0], config.language);
                Tree dst = TreeBuilders.fromSource(config.files[1], config.language);

                TwoWayMatcher twoWayMatcher = new TwoWayMatcher();
                Map<Tree, Tree> map = twoWayMatcher.apply(src, dst);
                MappingStore mappings = new MappingStore(map);

                Path pSrc = Paths.get(config.files[0]);
                Path pDst = Paths.get(config.files[1]);
                File fSrc = pSrc.toFile();
                File fDst = pDst.toFile();
                WebDiff webDiff = new WebDiff(config.port);
                webDiff.apply(fSrc, fDst, src, dst, mappings);
            }
            // Everything is done.
            // Valar Morghulis
            Log.fine("done");
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
