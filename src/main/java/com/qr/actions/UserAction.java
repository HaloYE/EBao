package com.qr.actions;

import com.qr.entity.User;
import com.qr.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class UserAction {
    @Autowired
    private IUserService userService;

    @RequestMapping("/confirmLogin.action")
    public int confirmLogin(String account,String password){
        User user=userService.confirmUser(account);
        int m;
        if (user==null){
            m=0;
        }else {
            if (user.getPassword().equals(password)){
                m=1;
            }else {
                m=2;
            }
        }
        return m;
    }

    @RequestMapping("/confirmRegister.action")
    public int isRegistre(String account,String password){
        User user=userService.confirmUser(account);
        int m;
        if (user==null){
            userService.addAcount(account,password);
            m=1;
        }else {
            m=0;
        }
        return m;
    }
}
