package mastery.driver;

import mastery.util.log.Log;
import org.apache.commons.cli.ParseException;

import java.io.FileNotFoundException;
import java.io.IOException;

public final class Driver {
    public static void fromCLI(String[] args) {
        CLIParser parser = new CLIParser();
        try {
            Config config = parser.parse(args);
        } catch (ParseException e) {
            e.printStackTrace();
            parser.printHelp();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void fromConfig(Config config) {
        // set up logger
        try {
            Log.setup(config.logLevel, config.logColorful);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Log.config("logger setup");

        // TODO: algorithm
    }
}
