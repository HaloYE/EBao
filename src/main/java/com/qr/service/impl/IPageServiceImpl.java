package com.qr.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qr.dao.SysUserMapper;
import com.qr.entity.PageRequest;
import com.qr.entity.Shop;
import com.qr.service.IPageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IPageServiceImpl implements IPageService {
    @Autowired
    private SysUserMapper sysUserMapper;

    public Shop findByshopName(String shopName) {
        return null;
    }

    public PageInfo<Shop> findPage(PageRequest pageRequest) {
        int pageNum=pageRequest.getPageNum();
        int pageSize=pageRequest.getPageSize();
        PageHelper.startPage(pageNum,pageSize);
        List<Shop> shops = sysUserMapper.selectPage();
        return new PageInfo<Shop>(shops);
    }
}
