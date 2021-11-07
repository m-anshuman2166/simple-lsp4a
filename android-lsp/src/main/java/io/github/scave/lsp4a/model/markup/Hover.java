package io.github.scave.lsp4a.model.markup;

import com.tiecode.protocol.lang.model.common.Range;

import java.util.List;

/**
 * 鼠标放置标识符文本信息类
 * @author Scave
 */
public class Hover {
    /**
     * 被标记文本集合
     */
    public List<MarkedString> contents;
    /**
     * 范围
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
