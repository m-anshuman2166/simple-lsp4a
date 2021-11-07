package io.github.scave.lsp4a.model.document.link;

import java.net.URI;

import io.github.scave.lsp4a.model.common.Range;

/**
 * The class for storing the link and it's range in the text document
 * @author Scave
 */
public class DocumentLink {
    /**
     * The range of the link in the text document
     */
    public Range range;
    /**
     * The data string of the link
     */
    public String data;
    /**
     * The target URI of the link
     */
    public URI target;
}
