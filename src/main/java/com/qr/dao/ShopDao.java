package com.qr.dao;

import com.qr.entity.Goods;
import com.qr.entity.Shop;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("shopDao")
public interface ShopDao {
    /**
     * 查找对应的商家的所有商铺信息
     * @param businessId  商家id
     * @return
     */
    List<Shop> findAllShop(@Param("begin") int begin, @Param("limit") int limit, @Param("businessId")String businessId,@Param("shopName") String shopName,@Param("shopId") String shopId,@Param("address") String address);

    /**
     *
     * @param businessId
     * @return
     */
    int selectShopNum(@Param("businessId") String businessId,@Param("shopName") String shopName,@Param("shopId") String shopId,@Param("address") String address);


    /**
     * 添加商铺
     * @param shop
     */
    void addShop(Shop shop);

    /**
     * 修改商店信息
     * @param shop
     */
    void shopChange(Shop shop);

    /**
     * 分页查询店铺的所有信息
     * @param begin
     * @param limit
     * @param shopId
     * @param goodsId
     * @param goodsName
     * @return
     */
    List findShopGoods(@Param("begin")int begin, @Param("limit")int limit, @Param("shopId")String shopId, @Param("goodsId")String goodsId, @Param("goodsName")String goodsName);


    /**
     * 查询店铺的商品件数
     * @param shopId
     * @param goodsId
     * @param goodsName
     * @return
     */
    int findShopGoodsNum(@Param("shopId") String shopId, @Param("goodsId") String goodsId, @Param("goodsName") String goodsName);

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
     * 删除列表
     * @param list
     * @return
     */
    boolean deleteShopList(List list);


    /**
     * 查询是否有已经借出东西的商店
     * @param list
     * @return
     */
    Integer hasleased(List list);

    /**
     * 查询所有商铺的所有字段
     * @return
     */
    List findShop();


}
