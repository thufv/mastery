package mastery.driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;

public final class Config {
    // required arguments
    public final String language;
    public final String base;
    public final String left;
    public final String right;
    public final String output;
    // optional check mode
    public final String expected;

    // gumtree-related
    public final int minHeight;
    public final double minDice;

    // log-related
    public final Level logLevel;
    public final boolean logColorful;
    public final String logDump;

    private Config(Builder builder) {
        this.base = builder.base;
        this.left = builder.left;
        this.right = builder.right;
        this.output = builder.output;
        this.expected = builder.expected;
        this.minHeight = builder.minHeight;
        this.minDice = builder.minDice;
        this.logLevel = builder.logLevel;
        this.logColorful = builder.logColorful;
        this.logDump = builder.logDump;
        this.language = builder.language;
    }

    public static Builder builder(String base, String left, String right, String output) {
        return new Builder(base, left, right, output);
    }

    public static class Builder {
        private final String base;
        private final String left;
        private final String right;
        private final String output;
        private String expected;

        // gumtree-related
        private int minHeight = 2;
        private double minDice = 0.2;

        // log-related
        private Level logLevel = Level.ALL;             // TODO: in production, info
        private boolean logColorful = false;
        private String logDump = null;
		private String language = "";

        public Builder(String base, String left, String right, String output) {
            this.base = base;
            this.left = left;
            this.right = right;
            this.output = output;
        }

        public Builder expected(String file) {
            this.expected = file;
            return this;
        }

        public Builder minHeight(int value) {
            this.minHeight = value;
            return this;
        }

        public Builder minDice(double value) {
            this.minDice = value;
            return this;
        }

        public Builder logLevel(Level level) {
            this.logLevel = level;
            return this;
        }

        public Builder enableLogColor() {
            this.logColorful = true;
            return this;
        }

        public Builder logDump(String file) {
            this.logDump = file;
            return this;
        }

        public Builder lang(String language) {
            this.language = language;
            return this;   
		}

        public Config build() {
            return new Config(this);
        }
    }
}
