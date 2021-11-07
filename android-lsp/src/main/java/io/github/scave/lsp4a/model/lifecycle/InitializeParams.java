package io.github.scave.lsp4a.model.lifecycle;

import java.net.URI;
import java.util.List;

import io.github.scave.lsp4a.model.workspace.WorkspaceFolder;

/**
 * 初始化参数信息类
 * @author Scave
 */
public class InitializeParams {

    /**
     * 进程ID
     */
    public int processId;
    /**
     * 根路径
     */
    public String rootPath;
    /**
     * 根URI
     */
    public URI rootUri;
    /**
     * 初始化参数
     */
    public InitializeOptions options;
    /**
     * 信息
     */
    public String trace;
    /**
     * 工程所有文件夹
     */
    public List<WorkspaceFolder> workspaceFolders;
}
