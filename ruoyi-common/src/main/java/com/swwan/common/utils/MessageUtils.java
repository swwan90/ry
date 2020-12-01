package com.swwan.common.utils;

import org.springframework.context.MessageSource;

/**
 * @ClassName MessageUtils
 * @Description 获取 i18n 资源文件
 * @Author swwan
 * @Date 2020/12/1 15:38
 * @Version 1.0
 **/
public class MessageUtils {
    public static String message(String code, Object... args) {
        MessageSource messageSource = SpringUtils.getBean(MessageSource.class);
    }
}
