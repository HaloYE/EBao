package com.qr.dao;

import com.qr.entity.Shop;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("TypeDao")
public interface TypeDao {
    List<Shop> findAllType(@Param("goodsFirstKind") String goodsFirstKind);

}
