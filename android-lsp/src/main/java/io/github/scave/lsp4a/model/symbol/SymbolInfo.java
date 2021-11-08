package io.github.scave.lsp4a.model.symbol;

import io.github.scave.lsp4a.model.common.Location;

/**
 * The class for storing information about a symbol
 * In fact, the symbol maybe a file, namespace, class, field and so on...
 * @author Scave
 */
public class SymbolInfo {
    /**
     * The name of the symbol
     */
    public String name;
    /**
     * The kind of the symbol
     * @see SymbolKind
     */
    public int kind;
    /**
     * Identify whether the symbol was deprecated
     */
    public boolean deprecated;
    /**
     * The location of the symbol
     * It contains the URI and the range
     * @see Location
     */
    public Location location;

    /**
     * The name of the symbol's container,such as a namespace for class, a class for variable, a folder for file
     */
    public String containerName;
}
