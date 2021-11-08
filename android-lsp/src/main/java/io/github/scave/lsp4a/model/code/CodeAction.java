package io.github.scave.lsp4a.model.code;

import java.util.List;

import io.github.scave.lsp4a.model.lint.Diagnostic;
import io.github.scave.lsp4a.model.workspace.WorkspaceEdit;

/**
 * The class for storing information about a action of code
 * @author Scave
 */
public class CodeAction {
    /**
     * none of action
     */
    public static final CodeAction NONE = null;
    /**
     * The title of action
     */
    public String title;
    /**
     * The kind of action
     * @see CodeActionKind
     */
    public String kind;
    /**
     * The diagnostics of action
     */
    public List<Diagnostic> diagnostics;
    /**
     * The workspace edition of action
     */
    public WorkspaceEdit edit;
}
