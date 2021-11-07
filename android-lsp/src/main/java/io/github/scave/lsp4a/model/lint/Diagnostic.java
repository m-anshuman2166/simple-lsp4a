package io.github.scave.lsp4a.model.lint;

import com.tiecode.protocol.lang.model.common.Range;

import java.util.List;

/**
 * 诊断信息类
 * @author Scave
 */
public class Diagnostic {
    /**
     * 诊断范围
     */
    public Range range;
    /**
     * 诊断程度
     */
    public Integer severity;
    /**
     * 代码
     */
    public String code;
    /**
     * 源代码
     */
    public String source;
    /**
     * 诊断信息
     */
    public String message;
    public List<Integer> tags;
}
