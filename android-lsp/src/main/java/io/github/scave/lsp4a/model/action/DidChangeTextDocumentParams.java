package io.github.scave.lsp4a.model.action;

import java.util.ArrayList;

/**
 * 文本文档已变更参数信息类
 * @author Scave
 */
public class DidChangeTextDocumentParams {
    public VersionedTextDocumentIdentifier document = new VersionedTextDocumentIdentifier();
    public List<TextDocumentContentChanged> contentChanges = new ArrayList<>();
}
