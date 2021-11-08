package io.github.scave.lsp4a.model.lifecycle;

/**
 * The class for storing result of initializing after the language server initialized
 * @author Scave
 */
public class InitializeResult {

    public String capabilities;

    public InitializeResult() {
    }

    public InitializeResult(String capabilities) {
        this.capabilities = capabilities;
    }
}
