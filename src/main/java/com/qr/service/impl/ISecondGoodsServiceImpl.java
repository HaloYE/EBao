package com.qr.service.impl;

import com.qr.dao.ISecondDao;
import com.qr.service.ISecondGoodsService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service("secondService")
public class ISecondGoodsServiceImpl implements ISecondGoodsService {
    @Resource
    private ISecondDao secondDao;
    public List findSecondGoodsInfo(String shopId, String goodsSecondKind) {
        List list=secondDao.findSecondGoodsInfo(shopId,goodsSecondKind);
        return list;
    }
}
