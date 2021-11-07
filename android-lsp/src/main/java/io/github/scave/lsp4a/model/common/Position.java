package io.github.scave.lsp4a.model.common;

/**
 * The class for storing a position that contains line and character column
 * @author Scave
 */
public class Position {

    /**
     * none of position
     */
    public static final Position NONE = new Position(-1, -1);

    /**
     * line number
     */
    public int line;

    /**
     * character column number
     */
    public int character;

    public Position() {
    }

    public Position(int line, int character) {
        this.line = line;
        this.character = character;
    }
}
