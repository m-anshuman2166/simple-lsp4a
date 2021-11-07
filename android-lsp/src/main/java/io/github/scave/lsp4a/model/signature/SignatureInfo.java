package io.github.scave.lsp4a.model.signature;

import com.tiecode.protocol.lang.model.markup.MarkupContent;

import java.util.List;

/**
 * 签名信息（函数/方法等）
 * @author Scave
 */
public class SignatureInfo {

    /**
     * 标签
     */
    public String label;
    /**
     * 内容
     */
    public MarkupContent content;
    /**
     * 参数信息
     */
    public List<ParameterInfo> parameters;

    public SignatureInfo() {
    }

    public SignatureInfo(String label, MarkupContent content, List<ParameterInfo> parameters) {
        this.label = label;
        this.content = content;
        this.parameters = parameters;
    }
}
