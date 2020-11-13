package com.qr.actions;


import com.qr.service.ShopServicce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
    public Map selectShop(int page, int limit, HttpServletRequest request){
        HttpSession session=request.getSession();
        String businessId=(String) session.getAttribute("businessId");
        List shoplist=shopServicce.findAllShop(page, limit, businessId);
        Integer count=shopServicce.selectShopNum(businessId);
        Map map=new HashMap();
        map.put("msg","");
        map.put("code",0);
        map.put("data",shoplist);
        map.put("count",count);
        return map;
    }


}
