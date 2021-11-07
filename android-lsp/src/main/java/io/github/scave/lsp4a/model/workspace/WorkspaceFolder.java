package io.github.scave.lsp4a.model.workspace;

import java.net.URI;

/**
 * 工程文件夹
 * @author Scave
 */
public class WorkspaceFolder {

    /**
     * 文件夹的URI标识
     */
    public URI uri;

    /**
     * 文件夹名称
     */
    public String name;

    public WorkspaceFolder() {
    }

    public WorkspaceFolder(URI uri, String name) {
        this.uri = uri;
        this.name = name;
    }
}
