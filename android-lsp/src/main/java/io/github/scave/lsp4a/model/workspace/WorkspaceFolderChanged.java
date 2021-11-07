package io.github.scave.lsp4a.model.workspace;

import java.util.List;

/**
 * 工程文件夹变更信息类
 * @author Scave
 */
public class WorkspaceFolderChanged {

    /**
     * 增加的文件夹列表
     */
    public List<WorkspaceFolder> addedFolderList;

    /**
     * 移除的文件夹列表
     */
    public List<WorkspaceFolder> removedFolderList;


}
