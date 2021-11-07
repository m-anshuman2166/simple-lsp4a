package io.github.scave.lsp4a.model.file;

import java.net.URI;

/**
 * 文件更改信息类
 * @author Scave
 */
public class FileChanged {
    /**
     * 文件URI标识
     */
    public URI uri;
    /**
     * 变更类型
     */
    public int type;
}
