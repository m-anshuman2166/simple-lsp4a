package io.github.scave.lsp4a.model.folding;

import io.github.scave.lsp4a.model.document.TextDocumentIdentifier;

/**
 * The class for storing params for folding range while language client posted
 * @author Scave
 */
public class FoldingRangeParams {

    /**
     * 文本文档
     */
    public TextDocumentIdentifier document;
}
