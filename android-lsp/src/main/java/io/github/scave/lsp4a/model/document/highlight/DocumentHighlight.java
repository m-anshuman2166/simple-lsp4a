package io.github.scave.lsp4a.model.document.highlight;

import io.github.scave.lsp4a.model.common.Range;

/**
 * The class for storing the highlight range and kind of the part of a text document
 * Attention!This class may not be in use
 * @author Scave
 */
// TODO: 2021/11/8
public class DocumentHighlight {
    /**
     * The range of the highlight
     */
    public Range range;
    /**
     * The kind of the highlight
     */
    public int kind;
}
