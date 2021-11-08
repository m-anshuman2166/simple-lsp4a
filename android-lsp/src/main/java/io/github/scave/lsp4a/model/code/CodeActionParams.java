package io.github.scave.lsp4a.model.code;

import io.github.scave.lsp4a.model.common.Range;
import io.github.scave.lsp4a.model.document.TextDocumentIdentifier;

/**
 * The class for storing params about a code action which was posted by language client
 * @author Scave
 */
public class CodeActionParams {
    /**
     * The context of code action
     */
    public CodeActionContext context = new CodeActionContext();
    /**
     * The only identifier of text document
     */
    public TextDocumentIdentifier document;
    /**
     * The range of action in the text document
     */
    public Range range;
}
