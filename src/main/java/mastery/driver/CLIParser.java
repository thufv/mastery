package mastery.driver;

import org.apache.commons.cli.*;

import mastery.util.HelpException;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

public final class CLIParser {
    static final String LANG = "l";
    static final String[] LANGS = {"JAVA", "XML"/*, "C", "C#"*/};
    final Option lang = Option
            .builder(LANG)
            .longOpt("lang")
            .hasArg()
            .argName("language")
            .desc("language of the source codes: java (default), xml")
            .build();

    static final String OUTPUT = "o";
    final Option output = Option.
            builder(OUTPUT)
            .longOpt("output")
            .hasArg()
            .argName("file")
            .desc("output file (default stdout)")
            .build();
    
    static final String ALGO = "a";
    static final String[] ALGOs = {"GUMTREE", "SKINCHANGER", "JDIME", "JDIME-LOOKAHEAD", "CHANGEDISTILLER"};
    final Option algorithm = Option
            .builder(ALGO)
            .longOpt("algorithm")
            .hasArg()
            .argName("algorithm")
            .desc("matching algorithm: skinchanger (default), gumtree, jdime, changedistiller")
            .build();

    static final String LOG_LEVEL = "log-level";
    final Option logLevel = Option
            .builder(null)
            .longOpt(LOG_LEVEL)
            .hasArg()
            .argName("level")
            .desc("log level: all, severe, warning, info, config, fine, finer, finest, off (default)")
            .build();

    static final String LOG_COLORFUL = "log-color";
    final Option logColorful = Option
            .builder(null)
            .longOpt(LOG_COLORFUL)
            .hasArg(false)
            .desc("enable colorful log (default plain)")
            .build();

    static final String LOG_FILE = "log-file";
    final Option logFile = Option
            .builder(null)
            .longOpt(LOG_FILE)
            .hasArg()
            .argName("file")
            .desc("also dump log to a file")
            .build();

    static final String FORMATTER = "formatter";
    final Option formatter = Option
            .builder(null)
            .longOpt(FORMATTER)
            .hasArg()
            .argName("executable")
            .desc("path to code formatter")
            .build();
    
    static final String PORT = "p";
    final Option port = Option
            .builder(PORT)
            .longOpt("port")
            .hasArg()
            .argName("port")
            .desc("port (default 4567), only for webdiff")
            .build();

    static final String HELP = "h";
    static final String HELP_DESC = "Usage ";
    final Option help = Option.builder(HELP)
                            .longOpt("help")
                            .hasArg(false)
                            .desc("Show usage help.")
                            .build();

    public CLIParser() {
        options = new Options();
        options.addOption(lang);
        options.addOption(output);
        // log related
        options.addOption(logLevel);
        options.addOption(logColorful);
        options.addOption(logFile);

        options.addOption(algorithm);

        options.addOption(formatter);

        // for webdiff
        options.addOption(port);

        options.addOption(help);
    }

    public void printHelp() {
        String header = "\noptions:\n";
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("\n  mastery merge <left> <base> <right> [options]\n"
                + "  mastery check <file1> <file2> [options]\n"
                + "  mastery webdiff <file1> <file2> [options]\n"
                + "  mastery textdiff <file1> <file2> [options]",
            header, options, "");
    }

    public Config parse(String[] args) throws ParseException, HelpException {
        if (args.length == 0 || List.of(args).contains("-h") || List.of(args).contains("--help")) {
            printHelp();
            System.exit(0);
        }

        DefaultParser parser = new DefaultParser();
        CommandLine cli = parser.parse(options, args);

        String[] arguments = cli.getArgs();
        String mode = arguments[0];

        if (cli.hasOption(HELP)) {
            throw new HelpException();
        }

        Config config;
        if (mode.equals("check")) {
            if (arguments.length < 3) {
                throw new ParseException("Please provide 2 files as arguments.");
            }

            String file1 = arguments[1];
            String file2 = arguments[2];

            config = new Config(file1, file2, Config.Mode.CHECK);

            if (cli.hasOption(LANG)) {
                config.language = cli.getOptionValue(LANG).toUpperCase();
                if (!Arrays.asList(LANGS).contains(config.language)) {
                    throw new ParseException("Invalid language: " + lang.getDescription());
                }
            }
        }
        else if (mode.equals("merge")) {
            if (arguments.length < 4) {
                throw new ParseException("Please provide 3 files as arguments.");
            }

            String left = arguments[1];
            String base = arguments[2];
            String right = arguments[3];

            config = new Config(left, base, right);

            if (cli.hasOption(LANG)) {
                config.language = cli.getOptionValue(LANG).toUpperCase();
                if (!Arrays.asList(LANGS).contains(config.language)) {
                    throw new ParseException("Invalid language: " + lang.getDescription());
                }
            }

            config.output = cli.getOptionValue(OUTPUT);
            if (cli.hasOption(FORMATTER))
                config.formatter = cli.getOptionValue(FORMATTER);
            if (cli.hasOption(ALGO)) {
                config.algorithm = cli.getOptionValue(ALGO).toUpperCase();
                if (!Arrays.asList(ALGOs).contains(config.algorithm)) {
                    throw new ParseException("Invalid algorithm: " + algorithm.getDescription());
                }
            }
        } else if (mode.equals("webdiff")) {
            if (arguments.length != 3) {
                throw new ParseException("Please provide exactly 2 files as arguments.");
            }

            String sSrc = arguments[1];
            String sDst = arguments[2];

            config = new Config(sSrc, sDst, Config.Mode.WEBDIFF);

            if (cli.hasOption(LANG)) {
                config.language = cli.getOptionValue(LANG).toUpperCase();
                if (!Arrays.asList(LANGS).contains(config.language)) {
                    throw new ParseException("Invalid language: " + lang.getDescription());
                }
            }
            if (cli.hasOption(ALGO)) {
                config.algorithm = cli.getOptionValue(ALGO).toUpperCase();
                if (!Arrays.asList(ALGOs).contains(config.algorithm)) {
                    throw new ParseException("Invalid algorithm: " + algorithm.getDescription());
                }
            }
            if (cli.hasOption(PORT)) {
                config.port = Integer.parseInt(cli.getOptionValue(PORT));
                if (config.port < 0) {
                    throw new ParseException("Invalid port: " + config.port);
                }
            }
        } else if (mode.equals("textdiff")) {
            if (arguments.length != 3) {
                throw new ParseException("Please provide exactly 2 files as arguments.");
            }

            String sSrc = arguments[1];
            String sDst = arguments[2];

            config = new Config(sSrc, sDst, Config.Mode.TEXTDIFF);

            if (cli.hasOption(LANG)) {
                config.language = cli.getOptionValue(LANG).toUpperCase();
                if (!Arrays.asList(LANGS).contains(config.language)) {
                    throw new ParseException("Invalid language: " + lang.getDescription());
                }
            }
            if (cli.hasOption(ALGO)) {
                config.algorithm = cli.getOptionValue(ALGO).toUpperCase();
                if (!Arrays.asList(ALGOs).contains(config.algorithm)) {
                    throw new ParseException("Invalid algorithm: " + algorithm.getDescription());
                }
            }

            config.output = cli.getOptionValue(OUTPUT);
        }
        else {
            throw new ParseException("Please specify mode: merge, check, webdiff, or textdiff?");
        }

        if (cli.hasOption(LOG_LEVEL)) {
            Level level = Level.parse(cli.getOptionValue(LOG_LEVEL).toUpperCase());
            config.logLevel = level;
        }
        if (cli.hasOption(LOG_COLORFUL)) {
            config.logColorful = true;
        }
        if (cli.hasOption(LOG_FILE)) {
            config.logDump = cli.getOptionValue(LOG_FILE);
        }

        return config;
    }

    private Options options;
}
