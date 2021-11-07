package io.github.scave.lsp4a.model.action;

import com.tiecode.protocol.lang.model.document.TextDocumentItem;

/**
 * 已打开文本文档信息类
 * @author Scsave
 */
public class DidOpenTextDocument {
    /**
     * 文本文档
     */
    public TextDocumentItem document;
}
