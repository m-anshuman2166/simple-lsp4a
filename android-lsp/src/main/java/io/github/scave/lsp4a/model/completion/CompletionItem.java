package io.github.scave.lsp4a.model.completion;

import com.tiecode.protocol.lang.model.document.TextEdit;
import com.tiecode.protocol.lang.model.markup.MarkupContent;

import java.util.List;

public class CompletionItem {
    public int kind;
    public String label;
    public String detail;
    public MarkupContent documentation;
    public Boolean deprecated;
    public Boolean preselect;
    public String sortText;
    public String filterText;
    public String insertText;
    public Integer insertTextFormat;
    public TextEdit textEdit;
    public List<TextEdit> additionalTextEdits;
    public List<Character> commitCharacters;
    public String data;
}
