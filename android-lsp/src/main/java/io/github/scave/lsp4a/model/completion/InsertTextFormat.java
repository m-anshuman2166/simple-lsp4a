package io.github.scave.lsp4a.model.completion;

/**
 * The class define the formats of text insertion
 * @author Scave
 */
public class InsertTextFormat {
    /**
     * The plain text will be inserted
     */
    public static final int PLAINTEXT = 1;
    /**
     * The snippet will be inserted
     * In fact, the snippet is a code snippet that specifies a code template
     */
    public static final int SNIPPET = 2;
}
