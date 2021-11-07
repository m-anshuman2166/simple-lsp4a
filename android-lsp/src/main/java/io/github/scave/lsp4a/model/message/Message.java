package io.github.scave.lsp4a.model.message;

/**
 * 信息实体类
 * @author Scave
 */
public class Message {
    /**
     * JSON头
     */
    public String jsonrpc;
    /**
     * 请求ID
     */
    public Integer id;
    /**
     * 方法
     */
    public String method;
    /**
     * 参数
     */
    public String params;
}
