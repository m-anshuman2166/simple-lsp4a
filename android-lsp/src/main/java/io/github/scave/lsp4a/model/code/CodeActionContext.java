package io.github.scave.lsp4a.model.code;

import com.tiecode.protocol.lang.model.lint.Diagnostic;

import java.util.ArrayList;
import java.util.List;

/**
 * 代码操作上下文
 * @author Scave
 */
public class CodeActionContext {
    public List<Diagnostic> diagnostics = new ArrayList<>();
    public List<String> only;
}
