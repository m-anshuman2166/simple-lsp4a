package io.github.scave.lsp4a.model.signature;

import java.util.List;

/**
 * 签名帮助
 * @author Scave
 */
public class SignatureHelp {

    /**
     * 签名信息集合
     */
    public List<SignatureInfo> signatures;
    /**
     * 当前签名信息
     */
    public Integer activeSignature;
    /**
     * 当前光标所处参数
     */
    public Integer activeParameter;
}
