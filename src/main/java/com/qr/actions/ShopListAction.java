package com.qr.actions;

import com.github.pagehelper.PageInfo;
import com.qr.entity.Shop;
import com.qr.service.ShopServicce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpCookie;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

    @RequestMapping("/shopList")

    public String  findShop(HttpServletRequest request, Model model){
        Integer pageNo=request.getParameter("pageNo")==null?1:Integer.valueOf(request.getParameter("pageNo"));
        PageInfo<Shop> pageInfo= (PageInfo<Shop>) shopServicce.findShop(pageNo,4);
            model.addAttribute("shoplist",pageInfo.getList());
        model.addAttribute("pages",pageInfo.getPages());
        model.addAttribute("pageNo",pageInfo.getPageNum());
        model.addAttribute("pageSize",pageInfo.getPageSize());
        return "shopList";
    }
}

