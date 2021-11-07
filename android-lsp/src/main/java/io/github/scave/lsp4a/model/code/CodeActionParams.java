package io.github.scave.lsp4a.model.code;

import com.tiecode.protocol.lang.model.common.Range;
import com.tiecode.protocol.lang.model.document.TextDocumentIdentifier;

/**
 * 代码操作参数信息类
 * @author Scave
 */
public class CodeActionParams {
    /**
     * 文本文档
     */
    public TextDocumentIdentifier document;
    /**
     * 文本文档操作范围
     */
    public Range range;
    public CodeActionContext context = new CodeActionContext();
}
