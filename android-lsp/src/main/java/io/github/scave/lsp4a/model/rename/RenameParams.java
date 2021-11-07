package io.github.scave.lsp4a.model.rename;

import com.tiecode.protocol.lang.model.common.Position;
import com.tiecode.protocol.lang.model.document.TextDocumentIdentifier;

/**
 * 重命名操作参数
 * @author Scave
 */
public class RenameParams {
    /**
     * 文本文档唯一标识
     */
    public TextDocumentIdentifier document;
    /**
     * 重命名位置
     */
    public Position position;
    /**
     * 重命名后名称
     */
    public String newName;
}
