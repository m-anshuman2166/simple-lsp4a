package io.github.scave.lsp4a.model.lint;

/**
 * 诊断信息严重程度
 * @author Scave
 */
public class DiagnosticSeverity {
    /**
     * 必须给出错误
     */
    public static final int ERROR = 1;
    /**
     * 必须给出警告
     */
    public static final int WARNING = 1;
    /**
     * 必须给出信息
     */
    public static final int INFO = 1;
    /**
     * 必须给出过时API处理
     */
    public static final int HINT = 1;
}
