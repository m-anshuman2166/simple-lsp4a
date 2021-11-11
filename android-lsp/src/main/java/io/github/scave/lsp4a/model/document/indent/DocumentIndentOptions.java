package io.github.scave.lsp4a.model.document.indent;

import java.util.List;

import io.github.scave.lsp4a.model.document.modify.TextEdit;

/**
 * The class for storing information about indent in a text document for client request
 * @author Scave
 */
public class DocumentIndentOptions {

    /**
     * Whether use tab to replace spaces for indent
     */
    public boolean useTab;

    /**
     * The width of indent(4 spaces = 1 tab)
     */
    public int indentWidth;

    /**
     * Additional edits for indent
     */
    public List<TextEdit> additionalEdits;
}
