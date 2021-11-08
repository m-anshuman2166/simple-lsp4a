package io.github.scave.lsp4a.model.signature;

import java.util.List;

/**
 * The class for storing signature helps
 * @author Scave
 */
public class SignatureHelp {

    /**
     * The signature information
     */
    public List<SignatureInfo> signatures;
    /**
     * The index of active signature
     */
    public Integer activeSignature;
    /**
     * The index of active parameter
     */
    public Integer activeParameter;
}
