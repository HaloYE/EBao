package com.qr.service;

import com.qr.entity.Shop;

import java.util.List;

public interface ShopServicce {
    /**
     * 找到对应商家的所有的商铺
     * @param page
     * @param limit
     * @param businessId
     * @return
     */
    List<Shop> findAllShop(int page, int limit, String businessId);

    /**
     * 找到对应商家的商铺数
     * @param businessId
     * @return
     */
    int selectShopNum(String businessId);
}
