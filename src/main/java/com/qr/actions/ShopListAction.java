package com.qr.actions;

import com.github.pagehelper.PageInfo;
import com.qr.entity.Shop;
import com.qr.service.ShopServicce;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpCookie;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
public class ShopListAction {


    @Autowired
    private ShopServicce shopServicce;

    @RequestMapping("/shopList")
    public String  findShop(HttpServletRequest request, Model model,String goodsFirstKind){
        log.debug(goodsFirstKind,model);
        System.out.println(goodsFirstKind);
        Integer pageNo=request.getParameter("pageNo")==null?1:Integer.valueOf(request.getParameter("pageNo"));
        PageInfo<Shop> pageInfo= (PageInfo<Shop>) shopServicce.findShop(pageNo,4,goodsFirstKind);
        model.addAttribute("shoplist",pageInfo.getList());
        model.addAttribute("pages",pageInfo.getPages());
        model.addAttribute("pageNo",pageInfo.getPageNum());
        model.addAttribute("pageSize",pageInfo.getPageSize());
        return "shopList";
    }

//    @RequestMapping("/shopList")
//
//    public String findAllShopType(Model model){
//        List<Shop> list=shopServicce.findAllShopType();
//        model.addAttribute("shoplist1",list);
//        return "shopList";
//    }
}

