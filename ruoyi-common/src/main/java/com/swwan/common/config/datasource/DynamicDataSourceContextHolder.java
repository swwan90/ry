package com.swwan.common.config.datasource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author swwan
 * @version 1.0
 * @className DynamicDataSourceContextHolder
 * @description 数据源切换处理
 * @date 2020/12/4 14:44
 */
public class DynamicDataSourceContextHolder {
    public static final Logger log = LoggerFactory.getLogger(DynamicDataSourceContextHolder.class);

    /**
     * 使用 ThreadLocal 维护变量，ThreadLocal 为每个使用该变量的线程提供独立的变量副本。
     * 所以每一个线程都可以独立地改变自己的副本，而不会影响其他线程所对应的副本。
     */
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    /**
     * 设置数据源的变量
     */
    public static void setDataSourceType(String dataSourceType ){
        log.info("切换到{}数据源", dataSourceType);
        CONTEXT_HOLDER.set(dataSourceType);
    }

    public static String getDataSourceType() {
        return CONTEXT_HOLDER.get();
    }

    public static void clearDataSourceType() {
        CONTEXT_HOLDER.remove();
    }
}
