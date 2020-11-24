package com.qr.actions;

import com.qr.entity.Goods;
import com.qr.entity.Lease;
import com.qr.entity.User;
import com.qr.service.IAddOrderService;
import com.qr.service.IGoDetialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
public class AddOrderAction {
    @Autowired
    private IAddOrderService addOrderService;
    @Autowired
    private IGoDetialsService IGoDetialsService;

    @RequestMapping("/insertOrder")
    public String insertOrder(String goodsId, Model model, HttpServletRequest req,String begintime){
        Goods goods =IGoDetialsService.queryGoodsInfo(goodsId);
        Date date=new Date();
        String d="OR"+date.getTime();
        Lease lease=new Lease();
        lease.setLeaseId(d);
        lease.setGoodsId(goodsId);
        HttpSession session=req.getSession();
        User u= (User) session.getAttribute("U");
        lease.setUserId(u.getUserID());
        lease.setLeaseTime(begintime);
        addOrderService.addOrder(lease);
        model.addAttribute("orderInfo",lease);
        model.addAttribute("gInfo",goods);
        return "UserOrder";
    }
}
