package io.github.scave.lsp4a.model.signature;

import com.tiecode.protocol.lang.model.markup.MarkupContent;

/**
 * 参数信息
 * @author Scave
 */
public class ParameterInfo {

    /**
     * 标签
     */
    public String label;

    /**
     * 标记内容
     */
    public MarkupContent content;

    public ParameterInfo() {
    }

    public ParameterInfo(String label, MarkupContent content) {
        this.label = label;
        this.content = content;
    }
}
