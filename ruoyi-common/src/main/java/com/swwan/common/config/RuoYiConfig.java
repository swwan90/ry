package com.swwan.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author swwan
 * @version 1.0
 * @className RuoYiConfig
 * @description 全局配置类
 * @date 2020/12/4 14:26
 */
@Component
@ConfigurationProperties(prefix = "ruoyi")
public class RuoYiConfig {
    /**
     * 项目名称
     */
    private static String name;

    /**
     * 版本
     */
    private static String version;

    /**
     * 版权年份
     */
    private static String copyrightYear;

    /**
     * 实例演示开关
     */
    private static boolean demoEnabled;

    /**
     * 上传路径
     */
    private static String profile;

    /**
     * 获取地址开关
     */
    private static boolean addressesEnabled;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        RuoYiConfig.name = name;
    }

    public static String getVersion() {
        return version;
    }

    public static void setVersion(String version) {
        RuoYiConfig.version = version;
    }

    public static String getCopyrightYear() {
        return copyrightYear;
    }

    public static void setCopyrightYear(String copyrightYear) {
        RuoYiConfig.copyrightYear = copyrightYear;
    }

    public static boolean isDemoEnabled() {
        return demoEnabled;
    }

    public static void setDemoEnabled(boolean demoEnabled) {
        RuoYiConfig.demoEnabled = demoEnabled;
    }

    public static String getProfile() {
        return profile;
    }

    public static void setProfile(String profile) {
        RuoYiConfig.profile = profile;
    }

    public static boolean isAddressesEnabled() {
        return addressesEnabled;
    }

    public static void setAddressesEnabled(boolean addressesEnabled) {
        RuoYiConfig.addressesEnabled = addressesEnabled;
    }

    public static String getAvatarPath() {
        return getProfile() + "/avatar";
    }

    public static String getDownloadPath() {
        return getProfile() + "/download/";
    }

    public static String getUploadPath() {
        return getProfile() + "/upload";
    }
}
