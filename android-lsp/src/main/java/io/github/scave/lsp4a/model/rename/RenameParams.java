package io.github.scave.lsp4a.model.rename;

import io.github.scave.lsp4a.model.common.Position;
import io.github.scave.lsp4a.model.document.TextDocumentIdentifier;

/**
 * The class store params of renaming operation while the language client posted
 * @author Scave
 */
public class RenameParams {
    /**
     * The only identifier of text document(URI)
     */
    public TextDocumentIdentifier document;
    /**
     * The position of renaming operation
     */
    public Position position;
    /**
     * The new name for renaming
     */
    public String newName;
}
