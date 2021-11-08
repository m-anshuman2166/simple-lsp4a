package io.github.scave.lsp4a.model.lint;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * The class store params for diagnostics while the language server send message to client
 * @author Scave
 */
public class PublishDiagnosticsParams {
    /**
     * The URI of target text document which will receive diagnostics
     */
    public URI uri;
    /**
     * The diagnostics
     */
    public List<Diagnostic> diagnostics;

    public PublishDiagnosticsParams() {
        diagnostics = new ArrayList<>();
    }

    public PublishDiagnosticsParams(URI uri, List<Diagnostic> diagnostics) {
        this.uri = uri;
        this.diagnostics = diagnostics;
    }
}
