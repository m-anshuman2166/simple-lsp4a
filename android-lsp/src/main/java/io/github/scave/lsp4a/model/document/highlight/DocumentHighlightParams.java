package io.github.scave.lsp4a.model.document.highlight;

import io.github.scave.lsp4a.model.document.TextDocumentIdentifier;
import io.github.scave.lsp4a.model.document.TextDocumentPositionParams;
import io.github.scave.lsp4a.model.document.indent.DocumentIndentOptions;

/**
 * The class store params of highlight while the language client request
 * @author Scave
 */
public class DocumentHighlightParams {

    /**
     * The identifier of specific text document
     */
    public TextDocumentIdentifier document;
}
