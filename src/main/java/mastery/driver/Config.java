package mastery.driver;

import java.util.logging.Level;

public final class Config {
    enum Mode {
        DIFF,
        MERGE
    }
    public Mode mode;

    // common arguments
    public String language = "JAVA";

    // log-related
    public Level logLevel = Level.OFF;
    public boolean logColorful = false;
    public String logDump;

    /* ------- Diff Mode -------*/
    public String[] files;
    
    public Config(String[] files) {
        mode = Mode.DIFF;
        this.files = files;
    }

    /* ------- Merge Mode -------*/
    public String base;
    public String left;
    public String right;
    public String output;

    // formatter
    public String formatter;

    // algorithm
    public String algorithm = "ta";
    public boolean topDown = true;

    public Config(String left, String base, String right) {
        mode = Mode.MERGE;
        this.left = left;
        this.base = base;
        this.right = right;
    }
}
