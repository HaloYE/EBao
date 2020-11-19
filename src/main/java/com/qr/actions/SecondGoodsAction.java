package com.qr.actions;

import com.qr.entity.Goods;
import com.qr.service.ISecondGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class SecondGoodsAction {
    @Autowired
    private ISecondGoodsService secondGoodsService;

    @RequestMapping("/buildcommodityindex")
    public String showBuildSecondInfo(Model model,String shopId){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        model.addAttribute("SecondInfo",list);
        return "shopindex/buildshopindex";
    }

    @RequestMapping("/buildcommodityindex2")
    public String showBuildSecondInfo2(String shopId, HttpSession session){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        session.setAttribute("SecondInfo",list);
        System.out.println(list);
        return "commodityindex/buildcommodityindex";
    }

//

    @RequestMapping("/carcommodityindex")
    public String showCarSecondInfo(String shopId, HttpSession session){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        session.setAttribute("SecondInfo",list);
        System.out.println(list);
        return "shopindex/carshopindex";
    }


    @RequestMapping("/carcommodityindex2")
    public String showCarSecondInfo2(String shopId, HttpSession session){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        session.setAttribute("SecondInfo",list);
        System.out.println(list);
        return "commodityindex/carcommodityindex";
    }

//



    @RequestMapping("/equipcommodityindex")
    public String showEquipSecondInfo(Model model,String shopId){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        model.addAttribute("SecondInfo",list);
        return "shopindex/equipshopindex";
    }

    @RequestMapping("/equipcommodityindex2")
    public String showEquipSecondInfo2(String shopId, HttpSession session){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        session.setAttribute("SecondInfo",list);
        System.out.println(list);
        return "commodityindex/equipcommodityindex";
    }

    //
    @RequestMapping("/festivalcommodityindex")
    public String showFestivalSecondInfo(Model model,String shopId){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        model.addAttribute("SecondInfo",list);
        return "shopindex/festivalshopindex";
    }

    @RequestMapping("/festivalcommodityindex2")
    public String showFestivalSecondInfo2(String shopId, HttpSession session){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        session.setAttribute("SecondInfo",list);
        System.out.println(list);
        return "commodityindex/festivalcommodityindex";
    }


    //
    @RequestMapping("/homecommodityindex")
    public String showHomeSecondInfo(Model model,String shopId){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        model.addAttribute("SecondInfo",list);
        return "shopindex/homeshopindex";
    }

    @RequestMapping("/homecommodityindex2")
    public String showHomeSecondInfo2(String shopId, HttpSession session){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        session.setAttribute("SecondInfo",list);
        System.out.println(list);
        return "commodityindex/homecommodityindex";
    }


    //


    @RequestMapping("/housecommodityindex")
    public String showHouseSecondInfo(Model model,String shopId){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        model.addAttribute("SecondInfo",list);
        return "shopindex/houseshopindex";
    }

    @RequestMapping("/housecommodityindex2")
    public String showHouseSecondInfo2(String shopId, HttpSession session){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        session.setAttribute("SecondInfo",list);
        System.out.println(list);
        return "commodityindex/housecommodityindex";
    }


    //
    @RequestMapping("/machinecommodityindex")
    public String showMachineSecondInfo(Model model,String shopId){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        model.addAttribute("SecondInfo",list);
        return "shopindex/machineshopindex";
    }

    @RequestMapping("/machinecommodityindex2")
    public String showMachineSecondInfo2(String shopId, HttpSession session){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        session.setAttribute("SecondInfo",list);
        System.out.println(list);
        return "commodityindex/machinecommodityindex";
    }


    //
    @RequestMapping("/officecommodityindex")
    public String showOfficeSecondInfo(Model model,String shopId){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        model.addAttribute("SecondInfo",list);
        return "shopindex/officeshopindex";
    }
    @RequestMapping("/officecommodityindex2")
    public String showOfficeSecondInfo2(String shopId, HttpSession session){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        session.setAttribute("SecondInfo",list);
        System.out.println(list);
        return "commodityindex/officecommodityindex";
    }


    //
    @RequestMapping("/recreationcommodityindex")
    public String showRecreationSecondInfo(Model model,String shopId){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        model.addAttribute("SecondInfo",list);
        return "shopindex/recreationshopindex";
    }
    @RequestMapping("/recreationcommodityindex2")
    public String showRecreationSecondInfo2(String shopId, HttpSession session){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        session.setAttribute("SecondInfo",list);
        System.out.println(list);
        return "commodityindex/recreationcommodityindex";
    }

    //
    @RequestMapping("/weddingcommodityindex")
    public String showWeddingSecondInfo(Model model,String shopId){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        model.addAttribute("SecondInfo",list);
        return "shopindex/weddingshopindex";
    }
    @RequestMapping("/weddingcommodityindex2")
    public String showWeddingSecondInfo2(String shopId, HttpSession session){
        List<Goods> list=secondGoodsService.findSecondGoodsInfo(shopId);
        session.setAttribute("SecondInfo",list);
        System.out.println(list);
        return "commodityindex/weddingcommodityindex";
    }

}
