package io.github.scave.lsp4a.model.lifecycle;

import java.net.URI;
import java.util.List;

import io.github.scave.lsp4a.model.workspace.WorkspaceFolder;

/**
 * The class for storing params for initializing while language client posted
 * @author Scave
 */
public class InitializeParams {

    /**
     * The process id of initializing
     */
    public int processId;
    /**
     * The root path of initializing
     */
    public String rootPath;
    /**
     * The root URI of initializing
     */
    public URI rootUri;
    /**
     * The options of initializing
     */
    public InitializeOptions options;
    /**
     * The trace of initializing
     */
    public String trace;
    /**
     * The workspace folders of initializing
     */
    public List<WorkspaceFolder> workspaceFolders;
}
