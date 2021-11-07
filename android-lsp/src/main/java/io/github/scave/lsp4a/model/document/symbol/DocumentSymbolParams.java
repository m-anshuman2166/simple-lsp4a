package io.github.scave.lsp4a.model.document.symbol;

import io.github.scave.lsp4a.model.document.TextDocumentIdentifier;

/**
 * 文本文档符号信息参数类
 * @author Scave
 */
public class DocumentSymbolParams {

    /**
     * 文本文档
     */
    public TextDocumentIdentifier document;

    public DocumentSymbolParams() {
    }

    public DocumentSymbolParams(TextDocumentIdentifier document) {
        this.document = document;
    }
}
