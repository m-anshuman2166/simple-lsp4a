package io.github.scave.lsp4a.model.reference;

import io.github.scave.lsp4a.model.document.TextDocumentPositionParams;

/**
 * The class store params of reference while the language client posted
 * @author Scave
 */
public class ReferenceParams extends TextDocumentPositionParams {

    public ReferenceContext context;
}
