package io.github.scave.lsp4a.model.action;

import com.tiecode.protocol.lang.model.document.TextDocumentItem;

/**
 * 已打开文本文档参数信息类
 * @author Scave
 */
public class DidOpenTextDocumentParams {
    public TextDocumentItem document = new TextDocumentItem();

    public DidOpenTextDocumentParams() {}

    public DidOpenTextDocumentParams(TextDocumentItem document) {
        this.document = document;
    }
}
