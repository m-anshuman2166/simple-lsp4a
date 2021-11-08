package io.github.scave.lsp4a.model.folding;

/**
 * The class define kinds of folding range
 * @author Scave
 */
public class FoldingRangeKind {
    /**
     * The content in folding range is comment
     */
    public static final String COMMENT = "comment";
    /**
     * The content in folding range is imports
     */
    public static final String IMPORTS = "imports";
    /**
     * The content in folding range is includes
     */
    public static final String INCLUDES = "includes";
    /**
     * The content in folding range is macro define
     */
    public static final String DEFINE = "define";
    /**
     * The content in folding range is a region of code
     */
    public static final String REGION = "region";
}
