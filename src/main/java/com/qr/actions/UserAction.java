package com.qr.actions;

import com.qr.entity.User;
import com.qr.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserAction {
    @Autowired
    private IUserService userService;
    User user;

    @RequestMapping("/confirmLogin.action")
    public Map confirmLogin(String account, String password, HttpServletRequest req){
        user=userService.confirmUser(account);
        HttpSession session=req.getSession();
        session.setAttribute("U",user);
        int m;
        Map map =new HashMap();
        if (user==null){
            m=0;
        }else {
            if (user.getPassword().equals(password)){
                map.put("user",user);
                m=1;
            }else {
                m=2;
            }
        }
        map.put("r",m);
        return map;
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

    @RequestMapping("/confirmUpdate.action")
    public int isUpdate(String userImage,String account,String userName, String realName, String idCardNum, int sex,String userTel, String address){
        user=userService.confirmUser(account);
        userService.updateUserInfo(userImage,account,userName,realName,idCardNum,sex,userTel,address);
        return 1;
    }
}
