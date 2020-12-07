package com.swwan.common.annotation;

import java.lang.annotation.*;

/**
 * @author swwan
 * @version 1.0
 * @className DataScope
 * @description 数据权限过滤注解
 * @date 2020/12/7 15:32
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataScope {

    /**
     * 部门表的别名
     */
    String deptAlias() default "";

    /**
     * 用户表的别名
     */
    String userAlias() default "";
}
