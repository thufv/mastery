package mastery.translator;

/**
 * CodeFormatStrategy interface.
 */
public interface CodeFormatStrategy {
    /**
     * Format code.
     * @param raw raw code
     * @return formatted code
     */
    String apply(String raw);
}