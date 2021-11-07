package io.github.scave.lsp4a.model.markup;

/**
 * 标记文本类
 * @author Scave
 */
public class MarkedString {

    /**
     * 语言
     */
    public String language;

    /**
     * 文本值
     */
    public String value;

    public MarkedString() {
    }

    public MarkedString(String value) {
        this.value = value;
    }

    public MarkedString(String language, String value) {
        this.language = language;
        this.value = value;
    }
}
