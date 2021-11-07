package io.github.scave.lsp4a.model.action;

import com.tiecode.protocol.lang.model.document.TextDocumentIdentifier;

/**
 * 已保存文本文档参数信息类
 * @author Scave
 */
public class DidSaveTextDocumentParams {
    /**
     * 文本文档
     */
    public TextDocumentIdentifier document;
    /**
     * 文本内容
     */
    public String text;
}
