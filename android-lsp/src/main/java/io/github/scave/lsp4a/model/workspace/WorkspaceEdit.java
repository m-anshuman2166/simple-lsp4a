package io.github.scave.lsp4a.model.workspace;

import com.tiecode.protocol.lang.model.document.TextEdit;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 工作区变更信息类
 * @author Scave
 */
public class WorkspaceEdit {

    /**
     * URI标识对应文本文档被编辑更改信息表
     */
    public Map<URI, List<TextEdit>> changes = new HashMap<>();

    public void addChange(URI uri, List<TextEdit> textEditList) {
        if (changes.containsKey(uri)) {
            List<TextEdit> tmp = changes.get(uri);
            if (tmp != null) {
                tmp.addAll(textEditList);
            }
        } else {
            changes.put(uri, textEditList);
        }
    }

    public void addChange(URI uri, TextEdit textEdit) {
        if (changes.containsKey(uri)) {
            List<TextEdit> tmp = changes.get(uri);
            if (tmp != null) {
                tmp.add(textEdit);
            }
        } else {
            List<TextEdit> tmp = new ArrayList<>();
            tmp.add(textEdit);
            changes.put(uri, tmp);
        }
    }
}
