//package com.qr.service.impl;
//
//import com.qr.dao.ISecondDao;
//import com.qr.service.ISecondGoodsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service("secondGoodsService")
//public class ISecondGoodsServiceImpl implements ISecondGoodsService {
//    @Autowired
//    private ISecondDao seconddao;
//    public List findSecondGoodsInfo(String shopId, String goodsSecondKind) {
//        List list=seconddao.findSecondGoodsInfo(shopId,goodsSecondKind);
//        return list;
//    }
//}
