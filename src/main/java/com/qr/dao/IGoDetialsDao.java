package com.qr.dao;

import com.qr.entity.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("IGoDetialsDao")
public interface IGoDetialsDao {
    Goods queryGoodsInfo(@Param("goodsId") String goodsId);
}
