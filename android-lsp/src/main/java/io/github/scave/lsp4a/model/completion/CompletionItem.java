package io.github.scave.lsp4a.model.completion;

import java.util.List;

import io.github.scave.lsp4a.model.document.modify.TextEdit;
import io.github.scave.lsp4a.model.markup.MarkupContent;

/**
 * The class store information about a completion item
 * @author Scave
 */
public class CompletionItem {
    /**
     * The kind of completion
     * @see CompletionItemKind
     */
    public int kind;
    /**
     * The label of completion
     */
    public String label;
    /**
     * The detail of completion
     */
    public String detail;
    /**
     * The content which was markup
     */
    public MarkupContent documentation;
    /**
     * Identify whether the symbol was deprecated
     */
    public Boolean deprecated;
    public Boolean preselect;
    /**
     * The text for sorting items
     */
    public String sortText;
    /**
     * The filter text of completion
     */
    public String filterText;
    /**
     * The text which will be inserted while this item is selected by users
     */
    public String insertText;
    /**
     * The format of text which will be inserted
     * @see InsertTextFormat
     */
    public Integer insertTextFormat;
    /**
     * The text edition of completion
     */
    public TextEdit textEdit;
    /**
     * The additional editions of this completion, such as auto imports, overriding methods...
     * @see io.github.scave.lsp4a.model.code.CodeActionKind
     */
    public List<TextEdit> additionalTextEdits;
    /**
     * The characters which will be committed
     */
    public List<Character> commitCharacters;
}