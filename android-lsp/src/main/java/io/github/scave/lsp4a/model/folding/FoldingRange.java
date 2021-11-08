package io.github.scave.lsp4a.model.folding;

/**
 * The class for storing the information about the folding range
 * @author Scave
 */
public class FoldingRange {
    /**
     * The start line of the folding range
     */
    public int startLine;
    /**
     * The start character column of the folding range
     */
    public int startCharacter;
    /**
     * The end line of the folding range
     */
    public int endLine;
    /**
     * The end character column of the folding range
     */
    public int endCharacter;
    /**
     * The kind of the folding range
     * @see FoldingRangeKind
     */
    public String kind;

    public FoldingRange() {
    }

    public FoldingRange(int startLine, int startCharacter, int endLine, int endCharacter, String kind) {
        this.startLine = startLine;
        this.startCharacter = startCharacter;
        this.endLine = endLine;
        this.endCharacter = endCharacter;
        this.kind = kind;
    }
}
