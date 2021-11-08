package io.github.scave.lsp4a.model.code;

import io.github.scave.lsp4a.model.common.Range;

/**
 * The class for storing information about code
 * @author Scave
 */
public class CodeLens {
    /**
     * The range of code
     */
    public Range range;
    /**
     * The data(text) of code
     */
    public String data;

    public CodeLens() {}

    public CodeLens(Range range, String data) {
        this.range = range;
        this.data = data;
    }
}
