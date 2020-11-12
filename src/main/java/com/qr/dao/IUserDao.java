package com.qr.dao;

import com.qr.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("userdao")
public interface IUserDao {
    User confirmLogin(@Param("account") String account);
    void insertAccount(@Param("account") String account,@Param("password") String password);
    void updateAccountInfo(@Param("account") String account, @Param("userName") String userName, @Param("realName") String realName, @Param("idCardNum") int idCardNum, @Param("sex") int sex, @Param("address") String address);
}
