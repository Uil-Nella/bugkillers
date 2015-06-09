package org.bugkillers.core.exception;

/**
 * Created by liuxinyu on 15/6/9.
 */
public class BaseException extends Exception {

    public BaseException(String message,Throwable cause){
        super(message,cause);
    }
    public BaseException(String message){
        super(message);
    }
}
