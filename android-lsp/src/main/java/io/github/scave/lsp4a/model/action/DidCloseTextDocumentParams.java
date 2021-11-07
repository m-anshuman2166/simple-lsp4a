package io.github.scave.lsp4a.model.action;

import com.tiecode.protocol.lang.model.document.TextDocumentIdentifier;

/**
 * 已关闭文本文档参数信息类
 * @author Scave
 */
public class DidCloseTextDocumentParams {
    public TextDocumentIdentifier document = new TextDocumentIdentifier();
}
