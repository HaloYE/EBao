package com.qr.actions;

import com.qr.service.ShopServicce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class testAction {
    @Autowired
    private ShopServicce shopServicce;
    @RequestMapping("/test")
//    public List test(String shopName){
//
//    0    ModelAndView modelAndView=new ModelAndView();
//        modelAndView.setViewName("test");
//        modelAndView.addObject("shopName",123456);
//        return  modelAndView;
//    }

    public List findShop(HttpServletRequest request, Model model){
        HttpSession session=request.getSession();
//        String shopName=(String) session.getAttribute("shopName");
        List shoplist=shopServicce.findShop();

        model.addAttribute("shoplist",shoplist);
        return shoplist;
    }

}

