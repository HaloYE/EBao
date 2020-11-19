package com.qr.service.impl;

import com.qr.dao.IGoDetialsDao;
import com.qr.entity.Goods;
import com.qr.service.IGoDetialsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("IGoDetialsService")
public class IGoDetialsServiceImpl implements IGoDetialsService {
    @Resource
    private IGoDetialsDao IGoDetialsDao;
    public Goods queryGoodsInfo(String goodsId) {
        return IGoDetialsDao.queryGoodsInfo(goodsId);
    }
}
