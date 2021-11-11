package io.github.scave.lsp4a;

import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import io.github.scave.lsp4a.client.LanguageClient;
import io.github.scave.lsp4a.model.lifecycle.InitializeParams;
import io.github.scave.lsp4a.model.lifecycle.InitializeResult;
import io.github.scave.lsp4a.server.LanguageServer;

/**
 * The protocol of language server
 * @author Scave
 */
public class LanguageProtocol implements Protocol {

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

    private LanguageServer server;
    private LanguageClient client;
    private static LanguageProtocol protocol;
    private static Handler handler = new Handler(Looper.getMainLooper());
    private static ExecutorService service = Executors.newFixedThreadPool(1);

    private LanguageProtocol() {}

    /**
     * Get the single instance of LanguageServerProtocol
     * @return The single instance of LanguageServerProtocol
     */
    public static LanguageProtocol getInstance() {
        if (protocol == null) {
            protocol = new LanguageProtocol();
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
     * Initialize the language server
     * @param params The params of initializing
     */
    public void initialize(InitializeParams params) {
        exec(() -> {
            InitializeResult result = server.initialize(params);
            post(() -> client.receiveInitializeResult(result));
        });
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

    private void exec(Runnable runnable) {
        service.execute(runnable);
    }

    private void post(Runnable runnable) {
        handler.post(runnable);
    }
}
