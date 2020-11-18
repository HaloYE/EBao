package com.qr.service;

import com.qr.entity.Goods;

import java.util.List;

public interface ISecondGoodsService {
    List<Goods> findSecondGoodsInfo(String shopId);
}
