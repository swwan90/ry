package com.swwan.common.core.page;

import com.swwan.common.constant.Constants;
import com.swwan.common.utils.ServletUtils;

/**
 * @author swwan
 * @version 1.0
 * @className TableSupport
 * @description 表格数据处理
 * @date 2020/12/7 15:25
 */
public class TableSupport {
    /**
     * 封装分页对象
     */
    private static PageDomain getPageDomain() {
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPageNum(ServletUtils.getParameterToInt(Constants.PAGE_NUM));
        pageDomain.setPageSize(ServletUtils.getParameterToInt(Constants.PAGE_SIZE));
        pageDomain.setOrderByColumn(ServletUtils.getParameter(Constants.ORDER_BY_COLUMN));
        pageDomain.setIsAsc(ServletUtils.getParameter(Constants.IS_ASC));
        return pageDomain;
    }

    public static PageDomain buildPageRequest() {
        return getPageDomain();
    }
}
