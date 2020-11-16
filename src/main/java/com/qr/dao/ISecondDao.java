package com.qr.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("secondDao")
public interface ISecondDao {
    List findSecondGoodsInfo(@Param("shopId") String shopId,@Param("goodsSecondKind") String goodsSecondKind);
}
