package io.github.scave.lsp4a.model.code;

import com.tiecode.protocol.lang.model.document.TextDocumentIdentifier;

/**
 * 代码长度参数信息类
 * @author Scave
 */
public class CodeLensParams {
    /**
     * 文本文档
     */
    public TextDocumentIdentifier document;

    public CodeLensParams() {}

    public CodeLensParams(TextDocumentIdentifier textDocument) {
        this.document = textDocument;
    }
}
