package mastery.driver;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.File;
import java.nio.file.*;
import java.util.logging.Level;
import java.util.*;

import mastery.matcher.MatchingSet;
import mastery.matcher.ThreeWayMatcher;
import mastery.matcher.TwoWayMatcher;
import mastery.matcher.gum.GumThreeWayMatcher;
import mastery.matcher.gum.GumTwoWayMatcher;
import mastery.matcher.sc.ScThreeWayMatcher;
import mastery.matcher.sc.ScTwoWayMatcher;
import mastery.matcher.Assigner;
import mastery.matcher.MappingStore;
import mastery.matcher.Mapping;
import mastery.merger.Merger;
import mastery.merger.TopDownPruningMerger;
import mastery.webdiff.WebDiff;
import mastery.tree.Tree;
import mastery.tree.TreeBuilders;
import mastery.tree.TreePrinters;
import mastery.util.HelpException;
import mastery.util.log.Log;
import mastery.actions.ActionGenerator;
import mastery.actions.model.*;

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
                ThreeWayMatcher threeWayMatcher = config.algorithm.equals("GUMTREE") ? new GumThreeWayMatcher(): new ScThreeWayMatcher();
                MatchingSet mapping = threeWayMatcher.apply(base, left, right);

                // Phase II: Merge
                Merger merger = new TopDownPruningMerger();
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
            } else if (config.mode == Config.Mode.WEBDIFF) {
                assert config.files.length == 2;
                Tree src = TreeBuilders.fromSource(config.files[0], config.language);
                Tree dst = TreeBuilders.fromSource(config.files[1], config.language);

                Assigner assigner = new Assigner();
                assigner.apply(src, dst);

                Log.ifLoggable(Level.FINEST, printer -> {
                    printer.println(config.files[0]);
                    src.prettyPrintTo(printer);
                });
                Log.ifLoggable(Level.FINEST, printer -> {
                    printer.println(config.files[1]);
                    dst.prettyPrintTo(printer);
                });

                TwoWayMatcher twoWayMatcher = config.algorithm.equals("GUMTREE") ? new GumTwoWayMatcher(): new ScTwoWayMatcher();
                MappingStore mappings = twoWayMatcher.apply(src, dst);

                for (Tree node: src.preOrder())
                    node.actionId = node.dfsIndex;
                for (Tree node: dst.preOrder())
                    node.actionId= node.dfsIndex + src.size;

                Path pSrc = Paths.get(config.files[0]);
                Path pDst = Paths.get(config.files[1]);
                File fSrc = pSrc.toFile();
                File fDst = pDst.toFile();
                WebDiff webDiff = new WebDiff(config.port);
                webDiff.apply(fSrc, fDst, src, dst, mappings);
            } else if (config.mode == Config.Mode.TEXTDIFF) {
                assert config.files.length == 2;
                Tree src = TreeBuilders.fromSource(config.files[0], config.language);
                Tree dst = TreeBuilders.fromSource(config.files[1], config.language);

                Assigner assigner = new Assigner();
                assigner.apply(src, dst);

                Log.ifLoggable(Level.FINEST, printer -> {
                    printer.println(config.files[0]);
                    src.prettyPrintTo(printer);
                });
                Log.ifLoggable(Level.FINEST, printer -> {
                    printer.println(config.files[1]);
                    dst.prettyPrintTo(printer);
                });

                TwoWayMatcher twoWayMatcher = config.algorithm.equals("GUMTREE") ? new GumTwoWayMatcher(): new ScTwoWayMatcher();
                MappingStore mappings = twoWayMatcher.apply(src, dst);

                for (Tree node: src.preOrder())
                    node.actionId = node.dfsIndex;
                for (Tree node: dst.preOrder())
                    node.actionId= node.dfsIndex + src.size;

                ActionGenerator g = new ActionGenerator(src, dst, mappings);
                g.generate();
                List<Action> actions = g.getActions();

                dumpTextDiff(actions, mappings, config.output);
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

    public static void dumpTextDiff(List<Action> actions, MappingStore mappings, String output)
        throws IOException {
        if (output == null) {
            // Write the matches
            for (Mapping m: mappings) {
                System.out.println("Match " + m.first + " to " + m.second);
                // System.out.println("Match " + m.first.toReadableString() + " to " + m.second.toReadableString());
            }

            // Write the actions
            for (Action a : actions)
                System.out.println(a);
        }
        else {
            Writer writer = new FileWriter(output);

            // Write the matches
            for (Mapping m: mappings) {
                writer.write("Match " + m.first + " to " + m.second + "\n");
                // writer.write("Match " + m.first.toReadableString() + " to " + m.second.toReadableString() + "\n");
            }

            // Write the actions
            for (Action a : actions)
                writer.write(a.toString() + "\n");
            
            writer.close();
        }
    }
}
