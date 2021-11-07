package io.github.scave.lsp4a.model.common;

import java.net.URI;

/**
 * The class for storing the information that contains a identifier of a text document and it's specific range
 * @author Scave
 */
public class Location {

    /**
     * The specific identifier of a text document
     */
    public URI uri;

    /**
     * The range of location
     */
    public Range range;

    public Location() {
    }

    public Location(URI uri, Range range) {
        this.uri = uri;
        this.range = range;
    }
}
