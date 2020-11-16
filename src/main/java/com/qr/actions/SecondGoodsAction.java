package com.qr.actions;

import com.qr.service.ISecondGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SecondGoodsAction {
    @Autowired
    private ISecondGoodsService secondService;
    @RequestMapping("/findSecondInfo")
    public String findSecondInfo(Model model,String shopId,String goodsSecondKind){
        List list=secondService.findSecondGoodsInfo("sp001","婚纱礼服");
        model.addAttribute("secondGoodlist",list);
        return "secondKinds";
    }
}