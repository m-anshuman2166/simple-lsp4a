package io.github.scave.lsp4a.model.reference;

import com.tiecode.protocol.lang.model.document.TextDocumentPositionParams;

/**
 * 成员引用参数信息类
 * @author Scave
 */
public class ReferenceParams extends TextDocumentPositionParams {

    public ReferenceContext context;
}
