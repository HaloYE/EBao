package com.qr.action;

import com.qr.entity.User;
import com.qr.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAction {
    @Autowired
    private IUserService userService;

    @RequestMapping("/confirmLogin.action")
    public String confirmLogin(String account,String password){
        User user=userService.confirmUser(account);
        String msg="";
        if (user.getUserID().equals(account)){
            msg="ok";
        }else {
            msg="账号有误";
        }
        if (user.getPassword().equals(password)){
            msg="ok";
        }else {
            msg="账号有误";
        }
        return msg;
    }
}
