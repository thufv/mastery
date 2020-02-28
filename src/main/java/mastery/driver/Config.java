package mastery.driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;

public final class Config {
    // required arguments
    public final File base;
    public final File left;
    public final File right;
    public final File output;
    // optional check mode
    public final File expected;

    // gumtree-related
    public final int minHeight;
    public final double minDice;

    // log-related
    public final Level logLevel;
    public final boolean logColorful;
    public final File logDump;

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
    }

    public static Builder builder(File base, File left, File right, File output) throws FileNotFoundException {
        return new Builder(base, left, right, output);
    }

    public static class Builder {
        private final File base;
        private final File left;
        private final File right;
        private final File output;
        private File expected;

        // gumtree-related
        private int minHeight = 2;
        private double minDice = 0.2;

        // log-related
        private Level logLevel = Level.ALL;             // TODO: in production, info
        private boolean logColorful = false;
        private File logDump = null;

        public Builder(File base, File left, File right, File output) throws FileNotFoundException {
            if (!base.exists()) throw new FileNotFoundException(base.toString());
            if (!left.exists()) throw new FileNotFoundException(left.toString());
            if (!right.exists()) throw new FileNotFoundException(right.toString());

            this.base = base;
            this.left = left;
            this.right = right;
            this.output = output;
        }

        public Builder expected(File file) throws FileNotFoundException {
            if (!file.exists()) throw new FileNotFoundException(file.toString());

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

        public Builder logDump(File file) {
            this.logDump = file;
            return this;
        }

        public Config build() {
            return new Config(this);
        }
    }
}
