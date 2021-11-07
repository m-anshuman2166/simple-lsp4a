package io.github.scave.lsp4a.model.document.save;

/**
 * The class define why the text document will be save
 * @author Scave
 */
public class TextDocumentSaveReason {

    /**
     * 正常保存
     */
    public static final int MANUAL = 1;
    /**
     * 文档关闭
     */
    public static final int DOC_CLOSED = 2;
}
