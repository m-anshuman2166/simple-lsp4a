package io.github.scave.lsp4a.model.action;

import com.tiecode.protocol.lang.model.file.FileChanged;

import java.util.List;

/**
 * 文件已变更参数信息类
 * @author Scave
 */
public class DidChangeWatchedFilesParams {
    public List<FileChanged> changes;
}
