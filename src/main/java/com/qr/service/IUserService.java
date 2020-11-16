package com.qr.service;

import com.qr.entity.User;
import org.apache.ibatis.annotations.Param;

public interface IUserService {
    User confirmUser(String account);

    void addAcount(String account, String password);

    void updateUserInfo(String userImage, String account, String userName, String realName, String idCardNum, int sex, String userTel, String address);
}
