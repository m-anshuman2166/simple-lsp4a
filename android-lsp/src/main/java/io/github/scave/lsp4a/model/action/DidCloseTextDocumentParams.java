package io.github.scave.lsp4a.model.action;

import io.github.scave.lsp4a.model.document.TextDocumentIdentifier;

/**
 * The class for storing params about a text document which was closed
 * @author Scave
 */
public class DidCloseTextDocumentParams {
    /**
     * The only identifier of  the text document(URI)
     */
    public TextDocumentIdentifier document = new TextDocumentIdentifier();
}
