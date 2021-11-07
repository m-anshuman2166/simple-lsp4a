package io.github.scave.lsp4a.model.folding;

/**
 * 代码折叠范围信息类
 * @author Scave
 */
public class FoldingRange {
    /**
     * 折叠开始行号
     */
    public int startLine;
    /**
     * 折叠开始字符位置
     */
    public int startCharacter;
    /**
     * 折叠结束行号
     */
    public int endLine;
    /**
     * 折叠结束字符位置
     */
    public int endCharacter;
    /**
     * 折叠类型
     */
    public String kind;

    public FoldingRange() {
    }

    public FoldingRange(int startLine, int startCharacter, int endLine, int endCharacter, String kind) {
        this.startLine = startLine;
        this.startCharacter = startCharacter;
        this.endLine = endLine;
        this.endCharacter = endCharacter;
        this.kind = kind;
    }
}
