package com.qr.actions;

import com.qr.service.IShopListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopListAction {
    @Autowired
    private IShopListService shopListService;

    @RequestMapping("/getAllShop.action")
    public String getAllShop(Model model){
        List list=shopListService.queryAllShop();
        model.addAttribute("list",list);
        return "getAllShop";
    }
}
