package io.github.scave.lsp4a.model.action;

import io.github.scave.lsp4a.model.document.TextDocumentItem;

/**
 * The class store params about a text document which was opened while language client posted
 * @author Scave
 */
public class DidOpenTextDocumentParams {
    /**
     * The information about a text document
     * @see io.github.scave.lsp4a.model.document.TextDocumentIdentifier
     */
    public TextDocumentItem document = new TextDocumentItem();

    public DidOpenTextDocumentParams() {}

    public DidOpenTextDocumentParams(TextDocumentItem document) {
        this.document = document;
    }
}
