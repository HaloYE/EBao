//package com.qr.actions;
//
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//import com.qr.dao.SysUserMapper;
//import com.qr.entity.PageRequest;
//import com.qr.entity.Shop;
//import com.qr.service.IPageService;
//import com.qr.service.ShopServicce;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("shop")
//public class PageAction {
//
//    @Autowired
//    private IPageService iPageService;
//
//    @GetMapping("value=/findPage")
////    public String list(@RequestParam(value = "nowPage",required = false,defaultValue = "0"))Integer nowPager,Model model){
////        //每页显示条数
////        PageHelper.startPage(nowPager, 5);
////        List<Shop> user = (List<Shop>) ShopServicce.findShop();
////        int i = ShopServicce.countAll(); //查询所有的数据条数
////
////        //分页
////        PageInfo<Shop> pageInfo=new PageInfo<Shop>(shop);
////        model.addAttribute("pageInfo",pageInfo);
////        model.addAttribute("pagesize", pageInfo.getPages());
////        model.addAttribute("page",pageInfo.getPageNum());
////
////        model.addAttribute("count",i);
////        model.addAttribute("userList",user);
////       /* for(int i=0;i<user.size();i++){
////            System.out.println(user.get(i).getUname());
////        }*/
////
////        return "admin/user-list";
////
////
////    }
//
//    @PostMapping(value="/findPage")
//    public Object findPage(@RequestBody PageRequest pageQuery) {
//        return iPageService.findPage(pageQuery);
//    }
//}
//
//
//
//
