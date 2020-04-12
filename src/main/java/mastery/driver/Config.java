package mastery.driver;

import java.util.logging.Level;

public final class Config {
    enum Mode {
        DIFF,
        MERGE
    }
    public Mode mode;

    // common arguments
    public String language;

    // log-related
    public Level logLevel = Level.ALL;
    public boolean logColorful = false;
    public String logDump;

    /* ------- Diff Mode -------*/
    public String[] files;
    
    public Config(String[] files, String language) {
        mode = Mode.DIFF;
        this.files = files;
        this.language = language;
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
    public boolean topDown = false;

    public Config(String left, String base, String right, String language) {
        mode = Mode.MERGE;
        this.left = left;
        this.base = base;
        this.right = right;
        this.language = language;
    }
}
