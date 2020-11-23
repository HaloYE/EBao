package com.qr.actions;

import com.qr.entity.Goods;
import com.qr.service.IGoDetialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoDetialsAction {
    @Autowired
    private IGoDetialsService IGoDetialsService;
    @RequestMapping("/goDetials")
    public String GoDetials(String goodsId, Model model){
        Goods goods =IGoDetialsService.queryGoodsInfo(goodsId);
//        System.out.println("aaaaaaa");
        model.addAttribute("goodsInfo",goods);
        return "commoditydetails/commoditydetails";
    }
}
