package io.github.scave.lsp4a.model.action;

import com.tiecode.protocol.lang.model.workspace.WorkspaceFolderChanged;

/**
 * 已变更工程文件夹参数信息类
 * @author Scave
 */
public class DidChangeWorkspaceFoldersParams {
    public WorkspaceFolderChanged changed;
}
