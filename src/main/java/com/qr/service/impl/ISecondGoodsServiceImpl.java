package com.qr.service.impl;

import com.qr.dao.ISecondDao;
import com.qr.entity.Goods;
import com.qr.service.ISecondGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("secondGoodsService")
public class ISecondGoodsServiceImpl implements ISecondGoodsService {
    @Resource
    private ISecondDao seconddao;
    public List<Goods> findSecondGoodsInfo(String shopId) {
        return seconddao.findSecondGoodsInfo(shopId);
    }
}
