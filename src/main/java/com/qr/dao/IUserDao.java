package com.qr.dao;

import com.qr.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("userdao")
public interface IUserDao {
    User confirmLogin(@Param("account") String account);
}
