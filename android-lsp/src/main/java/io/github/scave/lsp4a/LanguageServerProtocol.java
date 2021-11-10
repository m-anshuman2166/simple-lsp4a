package io.github.scave.lsp4a;

import io.github.scave.lsp4a.client.LanguageClient;
import io.github.scave.lsp4a.server.LanguageServer;

/**
 * The protocol of language server
 * @author Scave
 */
public class LanguageServerProtocol implements Protocol {

    private LanguageServer server;
    private LanguageClient client;
    private static LanguageServerProtocol protocol;

    /**
     * Current protocol's version code
     */
    private static final int VERSION_CODE = 1;

    /**
     * Current protocol's version name
     */
    private static final String VERSION_NAME = "1.0";

    /**
     * Current protocol's name
     */
    private static final String NAME = "LanguageServerProtocol";

    private LanguageServerProtocol() {}

    /**
     * Get the single instance of LanguageServerProtocol
     * @return The single instance of LanguageServerProtocol
     */
    public static LanguageServerProtocol getInstance() {
        if (protocol == null) {
            protocol = new LanguageServerProtocol();
        }
        return protocol;
    }

    /**
     * Bind the server and client for protocol
     * @param server The instance of LanguageServer
     * @param client The instance of LanguageClient
     */
    public void bind(LanguageServer server, LanguageClient client) {
        this.server = server;
        this.client = client;
    }

    /**
     * Get the language server of protocol
     * @return The language server
     */
    public LanguageServer getServer() {
        return server;
    }

    /**
     * Get the language client of protocol
     * @return The language client
     */
    public LanguageClient getClient() {
        return client;
    }

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
