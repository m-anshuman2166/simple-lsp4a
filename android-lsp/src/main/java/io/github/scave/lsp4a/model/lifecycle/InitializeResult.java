package io.github.scave.lsp4a.model.lifecycle;

/**
 * 初始化结果信息类
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
