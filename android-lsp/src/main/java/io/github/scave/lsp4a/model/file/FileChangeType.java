package io.github.scave.lsp4a.model.file;

/**
 * The class define the types of file change
 * @author Scave
 */
public class FileChangeType {
    /**
     * The file changed because it was created
     */
    public static final int CREATED = 1;
    /**
     * The file changed because the content of it was changed
     */
    public static final int CHANGED = 2;
    /**
     * The file changed because it was deleted
     */
    public static final int DELETED = 3;
}
