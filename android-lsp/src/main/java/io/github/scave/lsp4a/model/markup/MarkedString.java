package io.github.scave.lsp4a.model.markup;

/**
 * The class store information about marked string text
 * @author Scave
 */
public class MarkedString {

    /**
     * The language of current marked string
     */
    public String language;

    /**
     * The value of marked string
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
