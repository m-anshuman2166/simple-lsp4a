package io.github.scave.lsp4a.model.symbol;

import com.tiecode.protocol.lang.model.common.Location;

/**
 * 文档中代码的单位信息
 * @author Scave
 */
public class SymbolInfo {
    /**
     * 符号文本
     */
    public String name;
    /**
     * 符号类型
     */
    public int kind;
    /**
     * 是否已经为过时API
     */
    public boolean deprecated;
    /**
     * 定位
     */
    public Location location;

    /**
     * 容器名称
     */
    public String containerName;
}
