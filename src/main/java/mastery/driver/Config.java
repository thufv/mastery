package mastery.driver;

import java.util.logging.Level;
import java.util.*;

public final class Config {
    public enum Mode {
        check,
        merge,
        webdiff,
        textdiff
    }
    public Mode mode;

    // "ending with 'Sim'" means the type is double,
    // otherwise, the type is assumed to be int
    public enum Hyperparameter {
        minHeight,
        sepSize,
        minCodeSim,
        minDiceSim,
        maxSize,
        stopCodeSim
    }

    // common arguments
    public String language = "JAVA";

    // log-related
    public Level logLevel = Level.OFF;
    public boolean logColorful = false;
    public String logDump;

    /* ------- Diff Mode -------*/
    public String[] files;

    public Config(String file1, String file2, Mode mode) {
        this.mode = mode;
        this.files = new String[]{file1, file2};
    }

    /* ------- Merge Mode -------*/
    public String base;
    public String left;
    public String right;
    public String output;

    // formatter
    public String formatter = null;

    // algorithm
    public String algorithm = "SKINCHANGER";

    // webdiff
    public int port = 4567;

    // hyperparameters
    public Map<Hyperparameter, Object> hyperparameters = new HashMap<Hyperparameter, Object>();

    public ParserConfig parserConfig = new ParserConfig(false);

    public Config(String left, String base, String right) {
        mode = Mode.merge;
        this.left = left;
        this.base = base;
        this.right = right;
    }

    public static final class ParserConfig {
        public boolean keepComment;

        public ParserConfig(boolean keepComment) {
            this.keepComment = keepComment;
        }
    }
}
