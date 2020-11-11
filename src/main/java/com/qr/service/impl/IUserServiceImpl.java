package com.qr.service.impl;

import com.qr.dao.IUserDao;
import com.qr.entity.User;
import com.qr.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userservice")
public class IUserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public User confirmUser(String account) {
        return userDao.confirmLogin(account);
    }

    public void addAcount(String account, String password) {
        userDao.insertAccount(account,password);
    }

    public User updateUserInfo(String account, String userName, String realNAme, int idCardNum, int sex, String address) {
        return userDao.updateAccountInfo(account,userName,realNAme,idCardNum,sex,address);
    }
}
