package com.qr.actions;


import com.qr.entity.Shop;
import com.qr.service.ShopServicce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
        session.setAttribute("businessId","bs001");
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
}
