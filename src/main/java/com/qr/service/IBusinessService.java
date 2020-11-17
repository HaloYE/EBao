package com.qr.service;

import com.qr.entity.Business;
import com.qr.entity.User;

public interface IBusinessService {
    Business confirmbusiness(String baccount);
    void addbAcount(String baccount, String bpassword);
//    void updateUserInfo(String userImage, String account, String userName, String realName, String idCardNum, int sex, String userTel, String address);
}
