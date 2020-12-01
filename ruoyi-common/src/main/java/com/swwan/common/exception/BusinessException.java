package com.swwan.common.exception;

/**
 * @ClassName BusinessException
 * @Description TODO
 * @Author swwan
 * @Date 2020/11/30 17:34
 * @Version 1.0
 **/
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    protected final String message;

    public BusinessException(String message) {
        this.message = message;
    }

    public BusinessException(String message, Throwable e) {
        super(message, e);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
