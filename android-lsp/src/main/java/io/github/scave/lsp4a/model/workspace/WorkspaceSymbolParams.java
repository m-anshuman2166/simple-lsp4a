package io.github.scave.lsp4a.model.workspace;

/**
 * The class for storing params about a workspace symbol
 * @author Scave
 */
public class WorkspaceSymbolParams {

    /**
     * The query name of symbol
     */
    public String query;

    public WorkspaceSymbolParams() {
    }

    public WorkspaceSymbolParams(String query) {
        this.query = query;
    }
}
