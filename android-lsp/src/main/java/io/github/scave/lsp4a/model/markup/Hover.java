package io.github.scave.lsp4a.model.markup;

import java.util.List;

import io.github.scave.lsp4a.model.common.Range;

/**
 * The class store the information about contents which were hovered by mouse
 * @author Scave
 */
public class Hover {
    /**
     * The contents of hovered
     */
    public List<MarkedString> contents;
    /**
     * The range of hovered
     */
    public Range range;

    public Hover() {
    }

    public Hover(List<MarkedString> contents) {
        this.contents = contents;
    }

    public Hover(List<MarkedString> contents, Range range) {
        this.contents = contents;
        this.range = range;
    }
}
