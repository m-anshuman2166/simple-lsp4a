package io.github.scave.lsp4a.model.code;

import io.github.scave.lsp4a.model.document.TextDocumentIdentifier;

/**
 * The class for storing params about length of code while language client posted
 * @author Scave
 */
public class CodeLensParams {
    /**
     * The only identifier of text document
     */
    public TextDocumentIdentifier document;

    public CodeLensParams() {}

    public CodeLensParams(TextDocumentIdentifier textDocument) {
        this.document = textDocument;
    }
}
