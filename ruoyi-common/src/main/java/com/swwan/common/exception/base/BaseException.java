package com.swwan.common.exception.base;

import org.springframework.util.StringUtils;
import sun.misc.MessageUtils;

import javax.management.relation.RoleUnresolved;
import java.util.Base64;

/**
 * @ClassName BaseException
 * @Description TODO
 * @Author swwan
 * @Date 2020/11/30 17:38
 * @Version 1.0
 **/
public class BaseException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String module;

    private String code;

    private Object[] args;

    private String defaultMessage;

    public BaseException(String module, String code, Object[] args, String defaultMessage) {
        this.module = module;
        this.code = code;
        this.args = args;
        this.defaultMessage = defaultMessage;
    }

    public BaseException(String module, String code, Object[] args) {
        this(module, code, args, null);
    }

    public BaseException(String module, String defaultMessage) {
        this(module, null, null, defaultMessage);
    }

    public BaseException(String code, Object[] args) {
        this(null, code, args, null);
    }

    public BaseException(String defaultMessage) {
        this(null, null, null, defaultMessage);
    }

    @Override
    public String getMessage() {
        String message = null;
        if (!StringUtils.isEmpty(code)) {
            message = MessageUtils.message(code, args);
        }
    }
}
