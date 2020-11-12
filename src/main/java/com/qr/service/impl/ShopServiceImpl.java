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

    /**
     * 添加商店
     * @param shop
     */
    @Override
    public void addShop(Shop shop) {
        Date date=new Date();
        shop.setShopId("SP"+date.getTime());
        shopDao.addShop(shop);
    }

    /**
     * 修改商店信息
     * @param shop
     */
    @Override
    public void shopChange(Shop shop) {
        shopDao.shopChange(shop);
    }

    /**
     * 分页查询商店的商品信息
     * @param page
     * @param limit
     * @param shopId
     * @param goodsId
     * @param goodsName
     * @return
     */
    @Override
    public List findShopGoods(int page, int limit, String shopId, String goodsId, String goodsName) {
        int begin=(page-1)*limit;
        return shopDao.findShopGoods(begin,limit, shopId, goodsId, goodsName);
    }


    /**
     * 查询商店的商品件数
     * @param shopId
     * @param goodsId
     * @param goodsName
     * @return
     */
    @Override
    public Integer findShopGoodsNum(String shopId, String goodsId, String goodsName) {
        return shopDao.findShopGoodsNum(shopId, goodsId, goodsName);
    }

    /**
     * 删除一个商品
     * @param goodsId
     */
    @Override
    public void deleteOneGoods(String goodsId) {
        shopDao.deleteOneGoods(goodsId);
    }
}
