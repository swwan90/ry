package com.swwan.common.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解放置表单重复提交
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RepeatSubmit {

}
