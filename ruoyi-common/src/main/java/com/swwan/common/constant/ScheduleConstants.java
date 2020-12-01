package com.swwan.common.constant;

/**
 * @ClassName ScheduleConstants
 * @Description 任务调度通用常量
 * @Author swwan
 * @Date 2020/11/30 15:15
 * @Version 1.0
 **/
public class ScheduleConstants {
    public static final String TASK_CLASS_NAME = "TASK_CLASS_NAME";
    public static final String TASK_PROPERTIES = "TASK_PROPERTIES";
    /** 默认 */
    public static final String MISFIRE_DEFAULT = "0";
    /** 触发立即执行 */
    public static final String MISFIRE_IGNORE_MISFIRES = "1";
    /** 触发一次执行 */
    public static final String MISFIRE_FIRE_ADD_PROCEED = "2";
    /** 不触发立即执行 */
    public static final String MISFIRE_DO_NOTHING = "3";

    public enum Status {
        NORMAL("0"),
        PAUSE("1");

        private String value;

        private Status(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }
}
