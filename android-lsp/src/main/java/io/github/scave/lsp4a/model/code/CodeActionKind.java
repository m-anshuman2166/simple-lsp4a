package io.github.scave.lsp4a.model.code;

/**
 * The class define kinds of code actions
 * @author Scave
 */
public class CodeActionKind {
    /**
     * The action is for quick fixing
     */
    public static final String QUICKFIX = "quickfix";
    /**
     * The action is for refactor
     */
    public static final String REFACTOR = "refactor";
    /**
     * The action is for extract of refactor
     */
    public static final String REFACTOR_EXTRACT = "refactor.extract";
    /**
     * The action is for inline variable, method and so on...
     */
    public static final String REFACTOR_INLINE = "refactor.inline";
    /**
     * The action is for rewriting such as auto import, overriding method...
     */
    public static final String REFACTOR_REWRITE = "refactor.rewrite";
    /**
     * The action is for source
     */
    public static final String SOURCE = "source";
    /**
     * The action is for organizing imports of source
     */
    public static final String SOURCE_ORGANIZE_IMPORTS = "source.organize.imports";
}
