package com.sample.drop.exception;

public class RestCustomException extends Throwable {

    private int code;

    public RestCustomException() {
    }
    public RestCustomException(int code) {
        this(code, "Error while processing the request", null);
    }
    public RestCustomException(int code, String message) {
        this(code, message, null);
    }
    public RestCustomException(int code, String message, Throwable throwable) {
        super(message, throwable);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
