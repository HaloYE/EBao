package com.qr.service.impl;

import com.qr.dao.IBusinessDao;
import com.qr.dao.IUserDao;
import com.qr.entity.Business;
import com.qr.entity.User;
import com.qr.service.IBusinessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("businessService")
public class IBusinessServiceImpl implements IBusinessService {

    @Resource
    private IBusinessDao businessDao;
    public Business confirmbusiness(String baccount) {
        return businessDao.confirmBLogin(baccount);
    }

    public void addbAcount(String baccount, String bpassword) {
        businessDao.insertBAccount(baccount,bpassword);
    }

//    @Override
//    public void updateUserInfo(String userImage, String account, String userName, String realName, String idCardNum, int sex, String userTel, String address) {
//
//    }
}
