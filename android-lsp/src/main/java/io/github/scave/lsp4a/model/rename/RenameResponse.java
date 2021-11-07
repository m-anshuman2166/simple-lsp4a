package io.github.scave.lsp4a.model.rename;

import com.tiecode.protocol.lang.model.common.Range;

/**
 * 重命名信息类
 * @author Scave
 */
public class RenameResponse {
    /**
     * 重命名范围
     */
    public Range range;
    /**
     * 替换文本
     */
    public String placeholder;
}
