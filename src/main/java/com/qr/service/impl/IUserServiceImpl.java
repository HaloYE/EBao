package com.qr.service.impl;

import com.qr.dao.IUserDao;
import com.qr.entity.User;
import com.qr.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userservice")
public class IUserServiceImpl implements IUserService {
    @Resource
    private IUserDao userdao;

    public User confirmUser(String account) {
        return userdao.confirmLogin(account);
    }

    public void addAcount(String account, String password) {
        userdao.insertAccount(account, password);
    }

    public void updateUserInfo(String userImage, String account, String userName, String realName, String idCardNum, int sex, String userTel, String address) {
        userdao.updateAccountInfo(userImage, account, userName, realName, idCardNum, sex, userTel, address);
    }
}
