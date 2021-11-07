package io.github.scave.lsp4a.model.common;

/**
 * The class for storing a range that contains start position and end position
 * @author Scave
 */
public class Range {

    /**
     * none of range
     */
    public static final Range NONE = new Range(Position.NONE, Position.NONE);

    /**
     * the start position
     */
    public Position start;

    /**
     * the end position
     */
    public Position end;

    public Range() {
    }

    public Range(Position start, Position end) {
        this.start = start;
        this.end = end;
    }
}
