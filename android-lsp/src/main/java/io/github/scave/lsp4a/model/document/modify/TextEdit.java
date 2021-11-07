package io.github.scave.lsp4a.model.document.modify;

import io.github.scave.lsp4a.model.common.Range;

/**
 * The class for storing the information of edited text in a text document
 * @author Scave
 */
public class TextEdit {

    /**
     * The none of TextEdit
     */
    public static final TextEdit NONE = new TextEdit(Range.NONE, "");

    /**
     * The range of edited text
     */
    public Range range;

    /**
     * The new text to replace the old text in the range
     */
    public String newText;

    public TextEdit() {
    }

    public TextEdit(Range range, String newText) {
        this.range = range;
        this.newText = newText;
    }
}
