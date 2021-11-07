package io.github.scave.lsp4a.model.document;

import java.net.URI;

/**
 * The class for storing information about text a document
 * @author Scave
 */
public class TextDocumentItem {

    /**
     * The URI of the text document such as file path,url,virtual path in the zip and so on...
     */
    public URI uri;

    /**
     * The language id of text document
     */
    public String languageId;

    /**
     * The version of text document
     */
    public int version;

    /**
     * The content of text document
     */
    public String text;
}
