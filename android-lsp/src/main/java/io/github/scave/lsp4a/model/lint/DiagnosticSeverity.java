package io.github.scave.lsp4a.model.lint;

/**
 * The class define severities of diagnostics
 * @author Scave
 */
public class DiagnosticSeverity {
    /**
     * The severity has reached the error level
     */
    public static final int ERROR = 4;
    /**
     * The severity has reached the warning level
     */
    public static final int WARNING = 3;
    /**
     * The severity has reached the info level
     */
    public static final int INFO = 2;
    /**
     * The severity has reached the hint level
     */
    public static final int HINT = 1;
}
