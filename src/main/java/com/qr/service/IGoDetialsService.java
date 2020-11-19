package com.qr.service;

import com.qr.entity.Goods;

public interface IGoDetialsService {
    Goods queryGoodsInfo(String goodsId);
}
