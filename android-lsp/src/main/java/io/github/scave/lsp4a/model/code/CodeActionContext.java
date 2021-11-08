package io.github.scave.lsp4a.model.code;

import java.util.ArrayList;
import java.util.List;

import io.github.scave.lsp4a.model.lint.Diagnostic;

/**
 * The class for storing context of code action
 * @author Scave
 */
public class CodeActionContext {
    /**
     * The diagnostics of code action
     */
    public List<Diagnostic> diagnostics = new ArrayList<>();
    public List<String> only;
}
