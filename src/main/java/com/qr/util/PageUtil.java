package com.qr.util;

import com.github.pagehelper.PageInfo;
import com.qr.entity.PageResult;

public class PageUtil {
/**
 * 将分页的信息统一分装到接口
 * @param pageRequest
 * @param pageInfo
 * @return
 */

    public static PageResult getPageResult(PageResult pageRequest, PageInfo<?> pageInfo){
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }
}
