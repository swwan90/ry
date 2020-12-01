package com.swwan.common.enums;

/**
 * 用户会话
 *
 * @author swwan
 */
public enum OnlineStatus {
    on_line("在线"),off_line("离线");

    private final String info;

    private OnlineStatus(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
