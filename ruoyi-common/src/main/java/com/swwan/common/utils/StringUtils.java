package com.swwan.common.utils;

import java.util.Collection;
import java.util.Map;

/**
 * @ClassName StringUtils
 * @Description TODO
 * @Author swwan
 * @Date 2020/12/1 16:33
 * @Version 1.0
 **/
public class StringUtils extends org.apache.commons.lang3.StringUtils {

    private static final String NULLSTR = "";
    private static final char SEPARATOR = '_';

    public static <T> T nvl(T value, T defaultValue) {
        return value != null ? value : defaultValue;
    }

    public static boolean isEmpty(Collection<?> collection) {
        return isNull(collection) || collection.isEmpty();
    }

    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    public static boolean isEmpty(Object[] objects) {
        return isNull(objects) || (objects.length == 0);
    }

    public static boolean isNotEmpty(Object[] objects) {
        return !isEmpty(objects);
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return isNull(map) || map.isEmpty();
    }

    public static boolean isNotEmpty(Map<?, ?> map) {
        return !isEmpty(map);
    }

    public static boolean isEmpty(String string) {
        return isNull(string) || NULLSTR.equals(string.trim());
    }

    public static boolean isNotEmpty(String string) {
        return !isNotEmpty(string);
    }

    public static boolean isNull(Object object) {
        return object == null;
    }

    public static boolean isNotNull(Object object) {
        return !isNull(object);
    }

    public static boolean isArray(Object object) {
        return isNotNull(object) && object.getClass().isArray();
    }

    public static String trim(String string) {
        return (string == null ? NULLSTR : string.trim());
    }

    public static String substring(final String str, int start) {
        if (str == null ) {
            return NULLSTR;
        }
        // 负数，从后开始计算
        if (start < 0) {
            start = str.length() + start;
        }
        if (start < 0) {
            start = 0;
        }
        if (start > str.length()) {
            return NULLSTR;
        }
        return str.substring(start);
    }

    /**
     * 截取字符串
     *
     * @author swwan
     * @date 2020/12/1
     * @param str
     * @param start
     * @param end
     * @return java.lang.String
     */
    public static String substring(final String str, int start, int end) {
        if (str == null || start > end) {
            return NULLSTR;
        }
        if (end < 0) {
            end = str.length() + end;
        }
        if (start < 0) {
            start = str.length() + start;
        }
        if (end > str.length()) {
            end = str.length();
        }
        if (start > end) {
            return NULLSTR;
        }
        if (start < 0) {
            start = 0;
        }
        if (end < 0) {
            end = 0;
        }
        return str.substring(start, end);
    }

    /**
     * 格式化文本，{} 表示占位符
     * 此方法只能简单将占位符 {} 按照顺序替换为参数
     * 如果想输出 {} 使用 \\ 转义 { 即可，如果想输出 {} 之前的 \ 使用双转义符 \\\\ 即可
     *
     * @author swwan
     * @date 2020/12/1
     * @param template
     * @param params
     * @return java.lang.String
     */
    public static String format(String template, Object... params){
        if (isEmpty(params) || isEmpty(template)) {
            return template;
        }
        return StrFormatter.format(template, params);
    }
}
