package com.qr.actions;


import com.qr.entity.Goods;
import com.qr.entity.Shop;
import com.qr.service.ShopServicce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ShopAction {

    @Autowired
    private ShopServicce shopServicce;

    @RequestMapping("/selectShop.action")
    public Map selectShop(int page, int limit, HttpServletRequest request,String shopName,String shopId,String address){
        HttpSession session=request.getSession();
//        session.setAttribute("businessId","bs001");
        String businessId=(String) session.getAttribute("businessId");
        List shoplist=shopServicce.findAllShop(page, limit, businessId,shopName,shopId,address);
        Integer count=shopServicce.selectShopNum(businessId,shopName,shopId,address);
//        System.out.println(shopName);
        Map map=new HashMap();
        map.put("msg","");
        map.put("code",0);
        map.put("data",shoplist);
        map.put("count",count);
        return map;
    }

    @RequestMapping("/addShop.action")
    public void shopAdd(Shop shop, HttpServletRequest request){
        HttpSession session=request.getSession();
        String businessId=(String) session.getAttribute("businessId");
        if (businessId==""||"".equals(businessId)){
            System.out.println("请登录");
        }else {
            shop.setBusinessId(businessId);
            shopServicce.addShop(shop);
        }
    }



    @RequestMapping("/shopChange.action")
    public void shopChange(Shop shop,HttpServletRequest request){
        HttpSession session=request.getSession();
        String businessId=(String) session.getAttribute("businessId");
        if (businessId==""||"".equals(businessId)){
            System.out.println("请登录");
        }else {
            shop.setBusinessId(businessId);
        }
        shopServicce.shopChange(shop);
    }



    @RequestMapping("/selectShopGoods.action")
    public Map selectShopGoods(int page, int limit,String shopId,String goodsId,String goodsName){
        List goodsList=shopServicce.findShopGoods(page,limit,shopId,goodsId,goodsName);
        Integer goodsNum=shopServicce.findShopGoodsNum(shopId,goodsId,goodsName);
        Map map=new HashMap();
        map.put("msg","");
        map.put("code",0);
        map.put("data",goodsList);
        map.put("count",goodsNum);
        return map;
    }

    @RequestMapping("/deleteOneGoods.action")
    public void deleteOneGoods(String goodsId){
        try {
            shopServicce.deleteOneGoods(goodsId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @RequestMapping("/shopAddGoods.action")
    public void shopAddGoods(Goods goods){
        try {
            shopServicce.addGoods(goods);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @RequestMapping("/goodsChange.action")
    public void goodsChange(Goods goods){
        System.out.println(goods);
        try {
            shopServicce.goodsChange(goods);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @RequestMapping("/deleteShopList.action")
    public boolean deleteShopList(String shopIds){
        System.out.println(shopIds);
        String arr[]=shopIds.split(",");
        List list = Arrays.asList(arr);
        if (shopServicce.hasleased(list)){
            return shopServicce.deleteShopList(list);
        }
        return false;
    }

    @RequestMapping("/searchAllShopPoint.action")
    public List<Shop> searchAllShopPoint(String goodsFirstKind){
        System.out.println(goodsFirstKind);
//        str.replaceAll(" ", ""); //去掉所有空格，包括首尾、中间
        String newGoodsFirstKind=goodsFirstKind.replaceAll(" ","");
        System.out.println(newGoodsFirstKind);
        List<Shop> shops=shopServicce.searchAllShop(newGoodsFirstKind);
        return shops;
    }
}
