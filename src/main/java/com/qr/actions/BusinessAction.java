package com.qr.actions;

import com.qr.entity.Business;
import com.qr.entity.User;
import com.qr.service.IBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class BusinessAction {
    @Autowired
    private IBusinessService businessService;

    @RequestMapping("/confirmBLogin.action")
    public int confirmBLogin(String baccount, String bpassword, HttpServletRequest request){
        Business business =businessService.confirmbusiness(baccount);
        HttpSession session=request.getSession();
        session.setAttribute("businessId",business.getBusinessId());
        int m;
        if (business==null){
            m=0;
        }else {
            if (business.getBusinessPassword().equals(bpassword)){
                m=1;
            }else {
                m=2;
            }
        }
        return m;
    }

    @RequestMapping("/confirmBRegister.action")
    public int isBRegistre(String baccount,String bpassword){
        Business business=businessService.confirmbusiness(baccount);
        int m;
        if (business==null){
            businessService.addbAcount(baccount,bpassword);
            m=1;
        }else {
            m=0;
        }
        return m;
    }

//
//    @RequestMapping("/confirmUpdate.action")
//    public int isUpdate(String userImage,String account,String userName, String realName, String idCardNum, int sex,String userTel, String address){
//        user=userService.confirmUser(account);
//        userService.updateUserInfo(userImage,account,userName,realName,idCardNum,sex,userTel,address);
//        return 1;
//    }
}
