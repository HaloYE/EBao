package com.qr.actions;

import com.qr.entity.Shop;
import com.qr.service.ShopServicce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpCookie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class ShopListAction {
    @Autowired
    private ShopServicce shopServicce;
    @RequestMapping("/shopList.action")

    public List findShop( Model model){
//        HttpSession session=request.getSession();
//        HttpCookxie cookie =request.getCookies();
//        String shopName=(String) session.getAttribute("shopName");
        List<Shop> shoplist=shopServicce.findShop();
        model.addAttribute("shoplist",shoplist);
        return shoplist;
    }
}

