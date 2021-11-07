package io.github.scave.lsp4a.model.document.link;

import io.github.scave.lsp4a.model.document.TextDocumentIdentifier;

/**
 * The class for storing the params that the language client request the links of document
 * @author Scave
 */
public class DocumentLinkParams {

    /**
     * The identifier of the text document(URI)
     */
    public TextDocumentIdentifier document;

    public DocumentLinkParams() {
    }

    public DocumentLinkParams(TextDocumentIdentifier document) {
        this.document = document;
    }
}
