package io.github.scave.lsp4a.model.document.formatting;

import io.github.scave.lsp4a.model.document.TextDocumentIdentifier;

/**
 * The params class for requiring to format a text document
 * @author Scave
 */
public class DocumentFormattingParams {
    /**
     * The identifier of a text document
     */
    public TextDocumentIdentifier textDocument;
    /**
     * The options of formatting
     */
    public FormattingOptions options;
}
