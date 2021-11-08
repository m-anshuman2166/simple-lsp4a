package io.github.scave.lsp4a.model.action;

import java.util.ArrayList;
import java.util.List;

import io.github.scave.lsp4a.model.document.VersionedTextDocumentIdentifier;
import io.github.scave.lsp4a.model.document.modify.TextDocumentContentChange;

/**
 * The class store params of text document change
 * @author Scave
 */
public class DidChangeTextDocumentParams {
    /**
     * The identifier of text document with version code
     */
    public VersionedTextDocumentIdentifier document = new VersionedTextDocumentIdentifier();
    /**
     * The changes of the text document content
     */
    public List<TextDocumentContentChange> contentChanges = new ArrayList<>();
}
