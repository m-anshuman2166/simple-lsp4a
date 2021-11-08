package io.github.scave.lsp4a.model.action;

import io.github.scave.lsp4a.model.document.TextDocumentIdentifier;

/**
 * The class for storing params about a text document which was saved
 * @author Scave
 */
public class DidSaveTextDocumentParams {
    /**
     * The only identifier of a text document(It contains URI)
     */
    public TextDocumentIdentifier document;
    /**
     * The saved text of the text document
     */
    public String text;
}
