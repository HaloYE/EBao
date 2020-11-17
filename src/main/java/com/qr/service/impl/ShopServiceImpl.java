package com.qr.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qr.dao.ShopDao;
import com.qr.dao.TypeDao;
import com.qr.entity.Goods;
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
    @Resource
    private TypeDao typeDao;
    /**
     * 找到对应商家的商铺列表
     * @param page
     * @param limit
     * @param businessId
     * @return
     */
    public List<Shop> findAllShop(int page, int limit, String businessId,String shopName,String shopId,String address) {
        int begin=(page-1)*limit;
        return shopDao.findAllShop(begin,limit,businessId,shopName,shopId,address);
    }

    /**
     * 找到对应商家的商铺数
     * @param businessId
     * @return
     */
    public int selectShopNum(String businessId,String shopName,String shopId,String address) {
        return shopDao.selectShopNum(businessId,shopName,shopId,address);
    }

    /**
     * 添加商店
     * @param shop
     */
    public void addShop(Shop shop) {
        Date date=new Date();
        shop.setShopId("SP"+date.getTime());
        shopDao.addShop(shop);
    }

    /**
     * 修改商店信息
     * @param shop
     */
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
    public Integer findShopGoodsNum(String shopId, String goodsId, String goodsName) {
        return shopDao.findShopGoodsNum(shopId, goodsId, goodsName);
    }

    /**
     * 删除一个商品
     * @param goodsId
     */
    public void deleteOneGoods(String goodsId) {
        shopDao.deleteOneGoods(goodsId);
    }

    /**
     * 店铺添加一个商品
     * @param goods
     */
    public void addGoods(Goods goods) {
        Date date=new Date();
        goods.setGoodsId("GD"+date.getTime());
        shopDao.addGoods(goods);
    }

    /**
     * 修改一个商品
     * @param goods
     */
    public void goodsChange(Goods goods) {
        shopDao.goodsChange(goods);
    }

    /**
     * 删除商店列表
     * @param list
     * @return
     */

    public boolean deleteShopList(List list) {
        return  shopDao.deleteShopList(list);
    }


    /**
     * 查询是否有已经借出东西的商店
     * @param list
     * @return
     */

    public boolean hasleased(List list) {
        if(shopDao.hasleased(list)>0){
            return false;
        }
        return true;
    }

    public PageInfo<Shop> findShop(Integer pageNum, Integer pageSize,String goodsFirstKind){

        //PageHelpe分页
        PageHelper.startPage(pageNum,pageSize);
        List<Shop> list=typeDao.findAllType(goodsFirstKind);
        PageInfo<Shop> pageInfo=new PageInfo<Shop>(list,pageSize);
        return  pageInfo;

    }

    public List<Shop> findAllShopType(){
        List<Shop> list=shopDao.findAllShopType();
        return list;
    }


}
