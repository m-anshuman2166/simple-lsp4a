package io.github.scave.lsp4a.model.document.symbol;

import java.util.List;

import io.github.scave.lsp4a.model.common.Range;

/**
 * The class for storing the symbol of text document
 * @author Scave
 */
public class DocumentSymbol {
    /**
     * The name of symbol
     */
    public String name;
    /**
     * The detail of symbol
     */
    public String detail;
    /**
     * The kind of the symbol
     * @see io.github.scave.lsp4a.model.symbol.SymbolKind
     */
    public int kind;
    /**
     * Identify whether the symbol was deprecated
     */
    public boolean deprecated;
    /**
     * The range of the symbol in the document
     */
    public Range range;
    /**
     * The selection range that the language client posted if there was a selected range in user's device
     */
    public Range selectionRange;
    /**
     * The child symbols of current symbol
     * In fact, the symbol maybe a file or namespace..., so it must contain child symbols
     * @see io.github.scave.lsp4a.model.symbol.SymbolKind
     */
    public List<DocumentSymbol> children;
}
