package com.swwan.common.core.page;

import java.io.Serializable;
import java.util.List;

/**
 * @author swwan
 * @version 1.0
 * @className TableDataInfo
 * @description 表格分页数据
 * @date 2020/12/7 15:23
 */
public class TableDataInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private long total;

    private List<?> rows;

    private int code;

    private String msg;

    public TableDataInfo() {
    }

    /**
     * 分页
     *
     * @param total 总记录数
     * @param rows 列表数据
     */
    public TableDataInfo(long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
