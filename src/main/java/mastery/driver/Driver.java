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
import mastery.matcher.changedistiller.ChangeDistillerTwoWayMatcher;
import mastery.matcher.gumtree.GumTreeTwoWayMatcher;
import mastery.matcher.skinchanger.SkinChangerTwoWayMatcher;
import mastery.matcher.jdime.JDimeTwoWayMatcher;
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
            if (Log.isLoggable(Level.CONFIG)) {
                Log.config("logger setup");
            }

            if (config.mode == Config.Mode.check) {
                // Parse AST from source code
                Tree[] trees = new Tree[config.files.length];
                for (int i = 0; i < config.files.length; ++i) {
                    // Abnormal signal will be exited when parsing fails
                    trees[i] = TreeBuilders.fromSource(config.files[i], config.parserConfig);
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
            else if (config.mode == Config.Mode.merge) {
                // Parse AST from source code
                Tree left = TreeBuilders.fromSource(config.left, config.parserConfig);
                Tree base = TreeBuilders.fromSource(config.base, config.parserConfig);
                Tree right = TreeBuilders.fromSource(config.right, config.parserConfig);

                // Phase I: Assign
                Assigner assigner = new Assigner();
                assigner.apply(base, left, right);

                // Phase II: Mapping
                TwoWayMatcher twoWayMatcher = getTwoWayMatcherFromAlgorithm(config.algorithm, config.hyperparameters);
                ThreeWayMatcher threeWayMatcher = new ThreeWayMatcher(twoWayMatcher);
                MatchingSet mappings = threeWayMatcher.apply(base, left, right);

                // Phase III: Merge
                Merger merger = new TopDownPruningMerger();
                Tree target = merger.apply(mappings);

                // Log.ifLoggable(Level.FINEST, printer -> {
                //     printer.println("target");
                //     target.prettyPrintTo(printer);
                // })

                // Show our output
                String code = TreePrinters.prettyCode(target, config.left, config.right, config.formatter, config.language);
                if (config.output == null) {
                    System.out.println(code);
                } else {
                    Writer out = new FileWriter(config.output);
                    out.write(code);
                    out.close();
                }
            } else if (config.mode == Config.Mode.webdiff) {
                assert config.files.length == 2;
                Tree src = TreeBuilders.fromSource(config.files[0], config.parserConfig);
                Tree dst = TreeBuilders.fromSource(config.files[1], config.parserConfig);

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

                TwoWayMatcher twoWayMatcher = config.algorithm.equals("GUMTREE") ? new GumTreeTwoWayMatcher(): new SkinChangerTwoWayMatcher(config.hyperparameters);
                MappingStore mappings = twoWayMatcher.apply(src, dst);

                for (Tree node: src.preOrder())
                    node.actionId = node.dfsIndex;
                for (Tree node: dst.preOrder())
                    node.actionId= node.dfsIndex + src.size;

                Path pSrc = Paths.get(config.files[0]);
                Path pDst = Paths.get(config.files[1]);
                File fSrc = pSrc.toFile();
                File fDst = pDst.toFile();
                WebDiff webDiff = new WebDiff(config.port, config.algorithm);
                webDiff.apply(fSrc, fDst, src, dst, mappings);
            } else if (config.mode == Config.Mode.textdiff) {
                assert config.files.length == 2;
                Tree src = TreeBuilders.fromSource(config.files[0], config.parserConfig);
                Tree dst = TreeBuilders.fromSource(config.files[1], config.parserConfig);

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

                TwoWayMatcher twoWayMatcher = getTwoWayMatcherFromAlgorithm(config.algorithm, config.hyperparameters);
                MappingStore mappings = twoWayMatcher.apply(src, dst);

                for (Tree node: src.preOrder())
                    node.actionId = node.dfsIndex;
                for (Tree node: dst.preOrder())
                    node.actionId= node.dfsIndex + src.size;

                ActionGenerator g = new ActionGenerator(src, dst, mappings);
                g.generate();
                List<Action> actions = g.getActions();

                dumpTextDiff(actions, mappings, config.output);
            } else if (config.mode == Config.Mode.match) {
                assert config.files.length == 2;
                Tree src = TreeBuilders.fromSource(config.files[0], config.parserConfig);
                Tree dst = TreeBuilders.fromSource(config.files[1], config.parserConfig);

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

                TwoWayMatcher twoWayMatcher = getTwoWayMatcherFromAlgorithm(config.algorithm, config.hyperparameters);
                MappingStore mappings = twoWayMatcher.apply(src, dst);

                int shifted_code = 0;
                for (Mapping mapping: mappings) {
                    Tree fp = mapping.first.parent;
                    Tree sp = mapping.second.parent;
                    if (fp != null && sp != null) {
                        if (mappings.hasSrc(fp) && mappings.getDst(fp) != sp) {
                            if (Log.isLoggable(Level.CONFIG)) {
                                Log.config("beneath %s <-> %s\n", fp, mappings.getDst(fp));
                            }
                            if (Log.isLoggable(Level.CONFIG)) {
                                Log.config("shifted code %s <-> %s\n", mapping.first, mapping.second);
                            }

                            shifted_code += 1;
                            continue;
                        }
                    }
                }

                System.out.println(shifted_code);
            }
            // Everything is done.
            // Valar Morghulis
            if (Log.isLoggable(Level.FINE)) {
                Log.fine("done");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static TwoWayMatcher getTwoWayMatcherFromAlgorithm(String algorithm, Map<Config.Hyperparameter, Object> hyperparameters) {
        switch (algorithm) {
            case "GUMTREE":
                return new GumTreeTwoWayMatcher();
            case "SKINCHANGER":
                return new SkinChangerTwoWayMatcher(hyperparameters);
            case "JDIME":
                return new JDimeTwoWayMatcher(false);
            case "JDIME-LOOKAHEAD":
                return new JDimeTwoWayMatcher(true);
            default:
                assert (algorithm.equals("CHANGEDISTILLER"));
                return new ChangeDistillerTwoWayMatcher();
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
