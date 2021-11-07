package io.github.scave.lsp4a.model.markup;

/**
 * 标记内容
 * @author Scave
 */
public class MarkupContent {

    /**
     * 类型
     */
    public String kind;
    /**
     * 值
     */
    public String value;

    public MarkupContent() {
    }

    public MarkupContent(String kind, String value) {
        this.kind = kind;
        this.value = value;
    }
}
