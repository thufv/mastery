package mastery.driver;

import org.apache.commons.cli.*;

import mastery.util.HelpException;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

public final class CLIParser {
    static final String LANG = "l";
    static final String[] LANGS = {"JAVA", "C", "C#"};
    final Option lang = Option.builder(LANG)
            .longOpt("lang")
            .required()
            .hasArg()
            .argName("language")
            .desc("language of the source codes: java, c, c#")
            .build();

    static final String OUTPUT = "o";
    final Option output = Option.builder(OUTPUT)
            .longOpt("output")
            .hasArg()
            .argName("file")
            .desc("output file/directory")
            .build();

    static final String EXPECTED = "e";
    final Option expected = Option.builder(EXPECTED)
            .longOpt("expected")
            .hasArg()
            .argName("file")
            .desc("expected file/directory (enables auto check)")
            .build();

    static final String LOG_LEVEL = "log-level";
    final Option logLevel = Option
            .builder(null)
            .longOpt(LOG_LEVEL)
            .hasArg()
            .argName("level")
            // TODO: in production, info
            .desc("log level: all (default), severe, warning, info, config, fine, finer, finest, off")
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
    
    
    static final String ALGO = "a";
    final Option algo = Option
            .builder(ALGO)
            .longOpt("algorithm")
            .required()
            .hasArg()
            .argName("algorithm")
            .desc("algorithm of mapping")
            .build();

    static final String FORMATTER = "formatter";
    final Option formatter = Option
            .builder(null)
            .longOpt(FORMATTER)
            .hasArg()
            .argName("executable")
            .desc("the formatter to format output code (default plain)")
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
        options.addOption(expected);
        // log related
        options.addOption(logLevel);
        options.addOption(logColorful);
        options.addOption(logFile);
        options.addOption(algo);
        options.addOption(formatter);
        options.addOption(help);
    }

    public void printHelp() {
        String header = "\noptions:\n";
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp(
            "mastery [options] -l java|c|c# -a gum|ta <left> <base> <right>\n"
                + "  arguments should be all file paths",
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
        if (arguments.length < 3) {
            printHelp();
            throw new ParseException("Please provide 3 files/directories as arguments.");
        }

        String left = arguments[0];
        String base = arguments[1];
        String right = arguments[2];
        String output = cli.getOptionValue(OUTPUT);
        var builder = Config.builder(base, left, right, output);

        if (cli.hasOption(HELP)) {
            throw new HelpException();
        }

        if (cli.hasOption(LANG)) {
            String language = cli.getOptionValue(LANG).toUpperCase();
            if (!Arrays.asList(LANGS).contains(language)) {
                printHelp();
                throw new ParseException("Invalid language: " + lang.getDescription());
            }
            builder.lang(language);
        }

        if (cli.hasOption(EXPECTED)) {
            builder.expected(cli.getOptionValue(EXPECTED));
        }

        if (cli.hasOption(LOG_LEVEL)) {
            Level level = Level.parse(cli.getOptionValue(LOG_LEVEL).toUpperCase());
            builder.logLevel(level);
        }

        if (cli.hasOption(LOG_COLORFUL)) {
            builder.enableLogColor();
        }

        if (cli.hasOption(LOG_FILE)) {
            builder.logDump(cli.getOptionValue(LOG_FILE));
        }

        if (cli.hasOption(ALGO)) {
            builder.algorithm(cli.getOptionValue(ALGO));
        }

        if (cli.hasOption(FORMATTER)) {
            builder.formatter(cli.getOptionValue(FORMATTER));
        }

        return builder.build();
    }

    private Options options;
}
