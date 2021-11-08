package io.github.scave.lsp4a.model.message;

/**
 * The class for storing information about an error
 * @author Scave
 */
public class ResponseError {

    /**
     * The code of error
     * @see ErrorCodes
     */
    public int code;
    /**
     * The message of error
     */
    public String message;
    /**
     * The data of error
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
