package io.github.scave.lsp4a.model.action;

import java.util.List;

import io.github.scave.lsp4a.model.file.FileChange;

/**
 * The class store changes of a file
 * @author Scave
 */
public class DidChangeWatchedFilesParams {
    /**
     * The changes of a file
     */
    public List<FileChange> changes;
}
