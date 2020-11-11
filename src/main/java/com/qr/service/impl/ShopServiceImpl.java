package com.qr.service.impl;

import com.qr.dao.ShopDao;
import com.qr.entity.Shop;
import com.qr.service.ShopServicce;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("shopservice")
public class ShopServiceImpl implements ShopServicce {

    @Resource
    private ShopDao shopDao;

    /**
     * 找到对应商家的商铺列表
     * @param page
     * @param limit
     * @param businessId
     * @return
     */
    @Override
    public List<Shop> findAllShop(int page, int limit, String businessId,String shopName,String shopId,String address) {
        int begin=(page-1)*limit;
        return shopDao.findAllShop(begin,limit,businessId,shopName,shopId,address);
    }

    /**
     * 找到对应商家的商铺数
     * @param businessId
     * @return
     */
    @Override
    public int selectShopNum(String businessId,String shopName,String shopId,String address) {
        return shopDao.selectShopNum(businessId,shopName,shopId,address);
    }

    @Override
    public void addShop(Shop shop) {
        Date date=new Date();
        shop.setShopId("SP"+date.getTime());
        shopDao.addShop(shop);
    }
}
