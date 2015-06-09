package org.bugkillers.core.exception;

/**
 * Created by liuxinyu on 15/6/9.
 */
public class UserException extends BaseException {

    public UserException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserException(String message) {
        super(message);
    }
}
