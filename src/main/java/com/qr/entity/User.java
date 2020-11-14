package com.qr.entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private String userImage;
    private String userID;
    private String userName;
    private String password;
    private String realName;
    private String idCardNum;
    private Integer sex;
    private String userTel;
    private String address;
}
