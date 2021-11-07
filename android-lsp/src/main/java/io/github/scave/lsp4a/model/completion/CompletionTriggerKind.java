package io.github.scave.lsp4a.model.completion;

/**
 * 代码提示触发类型
 * @author Scave
 */
public class CompletionTriggerKind {
    /**
     * 输入标识符或按下Ctrl+Space触发代码提示
     */
    public static final int INVOKED = 1;

    /**
     * 被指定代码提示触发符触发
     */
    public static final int TRIGGER_CHARACTER = 2;

    /**
     * 在当前代码提示列表中重新触发
     */
    public static final int TRIGGER_INCOMPLETE = 3;
}
