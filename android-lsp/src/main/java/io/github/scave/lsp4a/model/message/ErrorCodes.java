package io.github.scave.lsp4a.model.message;

/**
 * The class define codes of errors
 * @author Scave
 */
public class ErrorCodes {
    /**
     * Error occurred while server started with error
     */
    public static final int SERVER_ERROR_START = -1;
    /**
     * Error occurred while server ended with error
     */
    public static final int SERVER_ERROR_END = -10;
    /**
     * Error occurred while server started without initializing
     */
    public static final int SERVER_NOT_INITIALIZED = -20;
    /**
     * Error occurred but don't know that what happened
     */
    public static final int UNKNOWN_ERROR_CODE = -30;
    /**
     * Error occurred while the request had cancelled
     */
    public static final int REQUEST_CANCELLED = -40;
    /**
     * Error occurred while the target document of the request was modified
     */
    public static final int CONTENT_MODIFIED = -50;
    /**
     * Error occurred while parsing
     */
    public static final int PARSE_ERROR = -60;
    /**
     * Error occurred while receiving a invalid request
     */
    public static final int INVALID_REQUEST = -70;
    /**
     * Error occurred while the method cannot be found
     */
    public static final int METHOD_NOT_FOUND = -80;
    /**
     * Error occurred while receiving a request with invalid params
     */
    public static final int INVALID_PARAMS = -90;
    /**
     * Error occurred while an error occurs inside the protocol
     */
    public static final int INTERNAL_ERROR = -100;
}
