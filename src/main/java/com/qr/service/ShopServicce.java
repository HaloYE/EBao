package com.qr.service;

import com.qr.entity.Goods;
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
    List<Shop> findAllShop(int page, int limit, String businessId,String shopName,String shopId,String address);

    /**
     * 找到对应商家的商铺数
     * @param businessId
     * @return
     */
    int selectShopNum(String businessId,String shopName,String shopId,String address);


    /**
     * 添加店铺
     * @param shop
     */
    void addShop(Shop shop);


    /**
     * 修改商店信息
     * @param shop
     */
    void shopChange(Shop shop);

    /**
     * 分页查询商店的商品信息
     * @param page
     * @param limit
     * @param shopId
     * @param goodsId
     * @param goodsName
     * @return
     */
    List findShopGoods(int page, int limit, String shopId, String goodsId, String goodsName);

    /**
     * 查询店铺的所有商品条数
     * @param shopId
     * @param goodsId
     * @param goodsName
     * @return
     */
    Integer findShopGoodsNum(String shopId, String goodsId, String goodsName);

    /**
     * 删除一个商品
     * @param goodsId
     */
    void deleteOneGoods(String goodsId);


    /**
     * 店铺添加一个商品
     * @param goods
     */
    void addGoods(Goods goods);

    /**
     * 修改一个商品
     * @param goods
     */
    void goodsChange(Goods goods);

    /**
     * 删除商店列表
     * @param list
     * @return
     */
    boolean deleteShopList(List list);

    /**
     * 查询是否有已经借出东西的商店
     * @param list
     * @return
     */
    boolean hasleased(List list);
}
