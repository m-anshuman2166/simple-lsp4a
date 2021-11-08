package io.github.scave.lsp4a.model.lint;

import java.util.List;

import io.github.scave.lsp4a.model.common.Range;

/**
 * The class for storing information about diagnostic in the text document
 * @author Scave
 */
public class Diagnostic {
    /**
     * The range of the diagnostic
     */
    public Range range;
    /**
     * The severity of the diagnostic
     * @see DiagnosticSeverity
     */
    public Integer severity;
    /**
     * The code of the diagnostic
     */
    public String code;
    /**
     * The source of the diagnostic
     */
    public String source;
    /**
     * The message of the diagnostic
     */
    public String message;
    /**
     * The tags of diagnostic
     * @see DiagnosticTag
     */
    public List<Integer> tags;
}
