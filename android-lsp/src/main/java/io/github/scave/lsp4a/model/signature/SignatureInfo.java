package io.github.scave.lsp4a.model.signature;

import java.util.List;

import io.github.scave.lsp4a.model.markup.MarkupContent;

/**
 * The class for storing information about signature of method, variable, class and so on...
 * In fact, many symbols have signature information.
 * In Java, for example, the package, class, method, field...
 * In C++, for example, the namespace, class, function, variable...
 * ...
 * @author Scave
 */
public class SignatureInfo {

    /**
     * The label of signature
     */
    public String label;
    /**
     * The content which was marked
     */
    public MarkupContent content;
    /**
     * The parameter information of signature
     */
    public List<ParameterInfo> parameters;

    public SignatureInfo() {
    }

    public SignatureInfo(String label, MarkupContent content, List<ParameterInfo> parameters) {
        this.label = label;
        this.content = content;
        this.parameters = parameters;
    }
}
