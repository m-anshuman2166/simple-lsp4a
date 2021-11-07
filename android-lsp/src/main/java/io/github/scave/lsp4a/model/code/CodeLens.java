package io.github.scave.lsp4a.model.code;

import com.tiecode.protocol.lang.model.common.Range;

/**
 * 代码长度信息类
 * @author Scave
 */
public class CodeLens {
    /**
     * 代码区域范围
     */
    public Range range;
    /**
     * 代码数据
     */
    public String data;

    public CodeLens() {}

    public CodeLens(Range range, String data) {
        this.range = range;
        this.data = data;
    }
}
