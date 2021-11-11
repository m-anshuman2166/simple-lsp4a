package io.github.scave.lsp4a.model.document.indent;

import io.github.scave.lsp4a.model.document.TextDocumentPositionParams;

/**
 * The class store params of indent while the language client request
 * @author Scave
 */
public class DocumentIndentParams extends TextDocumentPositionParams {

    /**
     * The options of indent
     */
    public DocumentIndentOptions options;
}
