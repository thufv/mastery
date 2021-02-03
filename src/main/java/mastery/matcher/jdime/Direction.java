package mastery.matcher.jdime;

/**
 * A helper class used within the matrix of the LCST matcher.
 */
public enum Direction {

    LEFT {
        @Override
        public String toString() {
            return "LEFT";
        }
    },

    TOP {
        @Override
        public String toString() {
            return "TOP";
        }
    },

    DIAG {
        @Override
        public String toString() {
            return "DIAG";
        }
    }
}
