package com.qr.dao;

import com.qr.entity.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("secondDao")
public interface ISecondDao {
    List<Goods> findSecondGoodsInfo(@Param("shopId") String shopId);
}
