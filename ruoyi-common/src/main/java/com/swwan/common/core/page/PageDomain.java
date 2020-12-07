package com.swwan.common.core.page;

import com.swwan.common.utils.StringUtils;

/**
 * @author swwan
 * @version 1.0
 * @className PageDomain
 * @description 分页数据
 * @date 2020/12/7 15:15
 */
public class PageDomain {

    private Integer pageNum;

    private Integer pageSize;

    /**
     * 排序列
     */
    private String orderByColumn;

    /**
     * 升序 降序
     */
    private String isAsc = "asc";

    public String getOrderBy() {
        if (StringUtils.isEmpty(orderByColumn)) {
            return "";
        }
        return StringUtils.toUnderScoreCase(orderByColumn) + " " + isAsc;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderByColumn() {
        return orderByColumn;
    }

    public void setOrderByColumn(String orderByColumn) {
        this.orderByColumn = orderByColumn;
    }

    public String getIsAsc() {
        return isAsc;
    }

    public void setIsAsc(String isAsc) {
        this.isAsc = isAsc;
    }
}
