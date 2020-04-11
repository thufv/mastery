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
            .hasArg()
            .argName("algorithm")
            .desc("algorithm of mapping (default ta)")
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
            "Do you want a matcher, or merger?\nmastery diff <file...> -l java|c|c#\nmastery merge <left> <base> <right> -l java|c|c# [options]\n",
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
        if (mode.equals("diff")) {
            if (arguments.length < 3) {
                throw new ParseException("Please provide at least 2 files as arguments.");
            }

            String[] files = new String[arguments.length - 1];
            for (int i = 1; i < arguments.length; ++i)
                files[i - 1] = arguments[i];
            
            String language = cli.getOptionValue(LANG).toUpperCase();
            if (!Arrays.asList(LANGS).contains(language)) {
                throw new ParseException("Invalid language: " + lang.getDescription());
            }
            
            config = new Config(files, language);
        }
        else if (mode.equals("merge")) {
            if (arguments.length < 4) {
                throw new ParseException("Please provide 3 files/directories as arguments.");
            }

            String left = arguments[1];
            String base = arguments[2];
            String right = arguments[3];

            String language = cli.getOptionValue(LANG).toUpperCase();
            if (!Arrays.asList(LANGS).contains(language)) {
                throw new ParseException("Invalid language: " + lang.getDescription());
            }

            config = new Config(left, base, right, language);

            config.output = cli.getOptionValue(OUTPUT);
            config.language = language;
            if (cli.hasOption(ALGO)) {
                config.algorithm = cli.getOptionValue(ALGO);
            }

            if (cli.hasOption(FORMATTER)) {
                config.formatter = cli.getOptionValue(FORMATTER);
            }
        }
        else {
            throw new ParseException("Diff or merge? Please tell me what to do first.");
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
