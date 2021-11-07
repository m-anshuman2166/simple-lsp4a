package io.github.scave.lsp4a.model.code;

/**
 * 代码操作类型
 * @author Scave
 */
public class CodeActionKind {
    /**
     * 快速修复
     */
    public static final String QUICKFIX = "QUICKFIX";
    /**
     * 重新操作
     */
    public static final String REFACTOR = "REFACTOR";
    /**
     * 导出接口/方法
     */
    public static final String REFACTOR_EXTRACT = "REFACTOR.EXTRACT";
    /**
     * 内联
     */
    public static final String REFACTOR_INLINE = "REFACTOR.INLINE";
    /**
     * 重写
     */
    public static final String REFACTOR_REWRITE = "REFACTOR.REWRITE";
    /**
     * 源代码
     */
    public static final String SOURCE = "SOURCE";
    /**
     * 重新组织导入信息
     */
    public static final String SOURCE_ORGANIZE_IMPORTS = "SOURCE.ORGANIZE_IMPORTS";
}
