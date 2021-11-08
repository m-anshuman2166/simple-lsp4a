package io.github.scave.lsp4a.model.workspace;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.github.scave.lsp4a.model.document.modify.TextEdit;

/**
 * The class for storing the information of a workspace edition
 * @author Scave
 */
public class WorkspaceEdit {

    /**
     * The map of URI to TextEdit
     * The file corresponding to a URI may have multiple text edition changes
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
