package io.github.scave.lsp4a;

/**
 * The interface of all protocol classes
 * @author Scave
 */
public interface Protocol {

    /**
     * Get the version code of current protocol
     * @return Version code of current protocol
     */
    int getVersionCode();

    /**
     * Get the version name of current protocol
     * @return Version name of current protocol
     */
    String getVersionName();

    /**
     * Get the protocol name of current protocol
     * @return Protocol name of current protocol
     */
    String getName();
}
