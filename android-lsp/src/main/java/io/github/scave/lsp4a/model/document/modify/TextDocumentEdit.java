package io.github.scave.lsp4a.model.document.modify;

import java.util.List;

import io.github.scave.lsp4a.model.document.VersionedTextDocumentIdentifier;

/**
 * The class for storing information of text editions in a text document
 * @author Scave
 */
public class TextDocumentEdit {

    /**
     * The identifier of a text document with version coe
     */
    public VersionedTextDocumentIdentifier versionedDocument;

    /**
     * The text editions in a text document
     */
    public List<TextEdit> textEditList;

    public TextDocumentEdit() {
    }

    public TextDocumentEdit(VersionedTextDocumentIdentifier versionedDocument, List<TextEdit> textEditList) {
        this.versionedDocument = versionedDocument;
        this.textEditList = textEditList;
    }
}
