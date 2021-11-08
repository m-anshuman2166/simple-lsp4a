package io.github.scave.lsp4a.model.workspace;

import java.net.URI;

/**
 * The class for storing information about a workspace folder
 * @author Scave
 */
public class WorkspaceFolder {

    /**
     * The URI of folder
     */
    public URI uri;

    /**
     * The name of folder
     */
    public String name;

    public WorkspaceFolder() {
    }

    public WorkspaceFolder(URI uri, String name) {
        this.uri = uri;
        this.name = name;
    }
}
