package com.qr.dao;

import com.qr.entity.Business;
import com.qr.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("businessDao")
public interface IBusinessDao {
    Business confirmBLogin(@Param("baccount") String baccount);

    void insertBAccount(@Param("baccount") String baccount, @Param("bpassword") String bpassword);

//    void updateAccountInfo(@Param("userImage") String userImage, @Param("account") String account, @Param("userName") String userName, @Param("realName") String realName, @Param("idCardNum") String idCardNum, @Param("sex") int sex, @Param("userTel") String userTel, @Param("address") String address);

}
