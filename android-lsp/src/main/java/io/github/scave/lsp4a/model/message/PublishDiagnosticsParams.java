package io.github.scave.lsp4a.model.message;

import com.tiecode.protocol.lang.model.lint.Diagnostic;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * 发送诊断信息参数类
 * @author Scave
 */
public class PublishDiagnosticsParams {
    /**
     * 文本文档URI标识
     */
    public URI uri;
    /**
     * 诊断信息集合
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
