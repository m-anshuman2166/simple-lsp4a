package io.github.scave.lsp4a.model.file;

import java.net.URI;

/**
 * The class for storing the information of a file which was changed
 * @author Scave
 */
public class FileChange {
    /**
     * The URI of a file,it's similar to a identifier of a text document
     */
    public URI uri;
    /**
     * The type of change
     * @see FileChangeType
     */
    public int type;
}
