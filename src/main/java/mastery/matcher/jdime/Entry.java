package mastery.matcher.jdime;

import mastery.matcher.MappingStore;

/**
 * A helper class used within the matrix of the LCST matcher.
 */
public class Entry {

    private Direction direction;
    private MappingStore mappings;

    /**
     * Creates a new entry.
     *
     * @param direction
     *            direction
     * @param mappings
     *            mappings
     */
    public Entry(final Direction direction, final MappingStore mappings) {
        this.direction = direction;
        this.mappings = mappings;
    }

    /**
     * @return the direction
     */
    public final Direction getDirection() {
        return direction;
    }

    /**
     * @param direction
     *            the direction to set
     */
    public final void setDirection(final Direction direction) {
        this.direction = direction;
    }

    /**
     * @return the matching
     */
    public final MappingStore getMappings() {
        return mappings;
    }

    /**
     * @param mappings
     *            the mappings to set
     */
    public final void setMappings(final MappingStore mappings) {
        this.mappings = mappings;
    }
}
