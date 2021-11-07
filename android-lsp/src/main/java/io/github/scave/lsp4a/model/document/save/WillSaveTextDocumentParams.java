package io.github.scave.lsp4a.model.document.save;

import io.github.scave.lsp4a.model.document.TextDocumentIdentifier;

/**
 * The class for storing the params that the language client request to save a text document
 * @author Scave
 */
public class WillSaveTextDocumentParams {

    /**
     * The identifier of the text document which will be save
     */
    public TextDocumentIdentifier document;

    /**
     * The reason of the text document which will be save
     * @see TextDocumentSaveReason
     */
    public int saveReason = TextDocumentSaveReason.MANUAL;

    public WillSaveTextDocumentParams() {
    }

    public WillSaveTextDocumentParams(TextDocumentIdentifier document) {
        this.document = document;
    }

    public WillSaveTextDocumentParams(TextDocumentIdentifier document, int saveReason) {
        this.document = document;
        this.saveReason = saveReason;
    }
}
