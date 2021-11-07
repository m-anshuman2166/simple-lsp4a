package io.github.scave.lsp4a.model.document.modify;


import io.github.scave.lsp4a.model.common.Range;

/**
 * The class for storing the content's change of a text document
 * @author Scave
 */
public class TextDocumentContentChange {

    /**
     * The range of the change
     */
    public Range range;

    /**
     * The length of the range
     */
    public Integer rangeLength;

    /**
     * The text of change
     */
    public String text;
}
