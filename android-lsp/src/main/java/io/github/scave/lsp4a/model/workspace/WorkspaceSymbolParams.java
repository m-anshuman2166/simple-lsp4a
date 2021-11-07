package io.github.scave.lsp4a.model.workspace;

/**
 * 工作区域符号参数
 * @author Scave
 */
public class WorkspaceSymbolParams {

    public String query;

    public WorkspaceSymbolParams() {
    }

    public WorkspaceSymbolParams(String query) {
        this.query = query;
    }
}
