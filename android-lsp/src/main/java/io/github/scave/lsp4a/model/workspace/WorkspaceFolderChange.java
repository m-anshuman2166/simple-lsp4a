package io.github.scave.lsp4a.model.workspace;

import java.util.List;

/**
 * The class store the information of workspace folder changes
 * @author Scave
 */
public class WorkspaceFolderChange {

    /**
     * The folders which were added
     */
    public List<WorkspaceFolder> addedFolderList;

    /**
     * The folders which were removed
     */
    public List<WorkspaceFolder> removedFolderList;


}
