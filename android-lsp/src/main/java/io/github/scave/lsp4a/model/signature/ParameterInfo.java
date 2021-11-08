package io.github.scave.lsp4a.model.signature;

import io.github.scave.lsp4a.model.markup.MarkupContent;

/**
 * The class store information of a parameter
 * @author Scave
 */
public class ParameterInfo {

    /**
     * The label of parameter
     */
    public String label;

    /**
     * The markup content of parameter
     */
    public MarkupContent content;

    public ParameterInfo() {
    }

    public ParameterInfo(String label, MarkupContent content) {
        this.label = label;
        this.content = content;
    }
}
