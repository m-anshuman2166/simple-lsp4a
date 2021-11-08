package io.github.scave.lsp4a.model.action;

import io.github.scave.lsp4a.model.document.TextDocumentItem;

/**
 * The class for storing information about a text document which was opened
 * @author Scsave
 */
public class DidOpenTextDocument {
    /**
     * 文本文档
     */
    public TextDocumentItem document;
}
