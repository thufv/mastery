package mastery.driver;

import java.util.logging.Level;

public final class Config {
    enum Mode {
        CHECK,
        MERGE,
        WEBDIFF
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
    public String formatter = "clang-format";

    // algorithm
    public boolean topDown = true;

    // webdiff
    public int port = 4567;

    public Config(String left, String base, String right) {
        mode = Mode.MERGE;
        this.left = left;
        this.base = base;
        this.right = right;
    }
}
