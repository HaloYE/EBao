package com.qr.service;

import com.qr.entity.User;
import org.apache.ibatis.annotations.Param;

public interface IUserService {
    User confirmUser(String account);
    void addAcount(String account,String password);
    void updateUserInfo(String account,String userName,String realName,int idCardNum,int sex,String address);
}
