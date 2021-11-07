package io.github.scave.lsp4a.model.message;

/**
 * 返回错误信息类
 * @author Scave
 */
public class ResponseError {

    /**
     * 错误代码
     */
    public int code;
    /**
     * 错误信息
     */
    public String message;
    /**
     * 数据
     */
    public Object data;

    public ResponseError() {
    }

    public ResponseError(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
