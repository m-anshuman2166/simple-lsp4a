package io.github.scave.lsp4a.model.rename;

import io.github.scave.lsp4a.model.common.Range;

/**
 * The class store the information about renaming response
 * @author Scave
 */
public class RenameResponse {
    /**
     * The range of renaming
     */
    public Range range;
    /**
     * The place holder of renaming
     */
    public String placeholder;
}
