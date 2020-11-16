package com.qr.dao;

import com.qr.entity.Shop;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("shopDao")
public interface CompareShopDao {

    /**
     * 查找对应的商家的所有商铺信息
     * @param shopName  商家名称
     * @return
     */
    List<Shop> CompareShop( @Param("shopName")String shopName, @Param("shopId") String shopId);


}
