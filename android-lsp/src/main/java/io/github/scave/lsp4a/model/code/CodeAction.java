package io.github.scave.lsp4a.model.code;

import com.tiecode.protocol.lang.model.lint.Diagnostic;
import com.tiecode.protocol.lang.model.workspace.WorkspaceEdit;

import java.util.List;

/**
 * 代码操作信息类
 * @author Scave
 */
public class CodeAction {
    public String title, kind;
    public List<Diagnostic> diagnostics;
    public WorkspaceEdit edit;
    public static CodeAction NONE;
}
