package com.qr.actions;

import com.qr.service.AlipayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class payController {
    @Autowired
    @Qualifier("alipayService")
    private AlipayService alipayService;

    @RequestMapping("/pay")
    public String payController(@RequestParam("WIDout_trade_no") String id, @RequestParam("WIDsubject") String name, @RequestParam("WIDtotal_amount") String amount ) throws Exception {
        Integer pay=Integer.valueOf(amount);
        String pays = alipayService.webPagePay(id, pay, name);
        return pays;
    }
}
