package com.swwan.common.utils.sql;

import com.swwan.common.exception.base.BaseException;
import com.swwan.common.utils.StringUtils;

/**
 * @author swwan
 * @version 1.0
 * @className SqlUtils
 * @description sql 操作工具类
 * @date 2020/12/3 15:56
 */
public class SqlUtils {

    /**
     * 仅支持字母、数字、下划线、空格、都好、小数点
     */
    public static final String SQL_PATTERN = "[a-zA-Z0-9_\\ \\,\\.]";

    /**
     * 检查字符，防止注入绕过
     */
    public static String escapeOrderBySql(String value) {
        if (StringUtils.isNotEmpty(value) && !isValidOrderBysql(value)) {
            throw  new BaseException("参数不符合规范，不能进行查询");
        }
        return value;
    }

    private static boolean isValidOrderBysql(String value) {
        return value.matches(SQL_PATTERN);
    }
}
