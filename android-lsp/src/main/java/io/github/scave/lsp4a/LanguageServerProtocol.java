package io.github.scave.lsp4a;

/**
 * The protocol of language server
 * @author Scave
 */
public class LanguageServerProtocol implements Protocol {

    /**
     * Current protocol's version code
     */
    public static final int VERSION_CODE = 1;

    /**
     * Current protocol's version name
     */
    public static final String VERSION_NAME = "1.0";

    /**
     * Current protocol's name
     */
    public static final String NAME = "LanguageServerProtocol";

    @Override
    public int getVersionCode() {
        return VERSION_CODE;
    }

    @Override
    public String getVersionName() {
        return VERSION_NAME;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
