package io.github.scave.lsp4a.model.markup;

/**
 * The class store information about markup content
 * @author Scave
 */
public class MarkupContent {

    /**
     * The kind of markup
     * @see MarkupKind
     */
    public String kind;
    /**
     * The value of markup
     */
    public String value;

    public MarkupContent() {
    }

    public MarkupContent(String kind, String value) {
        this.kind = kind;
        this.value = value;
    }
}
