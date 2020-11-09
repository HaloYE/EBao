package com.qr.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAction {

    @RequestMapping("/a.action")
    public String hello(){
        return  "hello world";
    }

}
