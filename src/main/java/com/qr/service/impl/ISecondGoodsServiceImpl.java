package com.qr.service.impl;

import com.qr.dao.ISecondDao;
import com.qr.service.ISecondGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("secondGoodsService")
public class ISecondGoodsServiceImpl implements ISecondGoodsService {
    @Resource
    private ISecondDao seconddao;
    public List findSecondGoodsInfo(String shopId, String goodsSecondKind) {
        List list=seconddao.findSecondGoodsInfo(shopId,goodsSecondKind);
        return list;
    }
}
