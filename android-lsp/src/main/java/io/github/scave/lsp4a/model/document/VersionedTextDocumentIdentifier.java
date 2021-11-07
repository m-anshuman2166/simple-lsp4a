package io.github.scave.lsp4a.model.document;

import java.net.URI;

/**
 * The identifier of a text document with version code
 * @see TextDocumentIdentifier
 * @author Scave
 */
public class VersionedTextDocumentIdentifier extends TextDocumentIdentifier {

    /**
     * The version code of text document
     */
    public int version;

    public VersionedTextDocumentIdentifier() {
    }

    public VersionedTextDocumentIdentifier(int version) {
        this.version = version;
    }

    public VersionedTextDocumentIdentifier(URI uri, int version) {
        super(uri);
        this.version = version;
    }
}
