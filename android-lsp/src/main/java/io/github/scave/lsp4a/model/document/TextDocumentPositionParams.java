package io.github.scave.lsp4a.model.document;

import io.github.scave.lsp4a.model.common.Position;

/**
 * The class for storing the params that language client request requires this
 * @author Scave
 */
public class TextDocumentPositionParams {

    /**
     * The identifier of the text document
     */
    public TextDocumentIdentifier document;

    /**
     * The position in the text document
     */
    public Position position;

    public TextDocumentPositionParams() {
    }

    public TextDocumentPositionParams(TextDocumentIdentifier document, Position position) {
        this.document = document;
        this.position = position;
    }
}
