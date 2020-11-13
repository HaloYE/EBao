package com.qr.dao;

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
    List<Shop> findAllShop(@Param("begin") int begin, @Param("limit") int limit, @Param("businessId")String businessId);

    /**
     *
     * @param businessId
     * @return
     */
    int selectShopNum(String businessId);

    List<Shop> findShop();

}
