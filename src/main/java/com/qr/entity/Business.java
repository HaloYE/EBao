package com.qr.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Business {
    private String businessId;
    private String businessUserName;
    private String businessPassword;
    private String businessName;
    private String businessSex;
    private String businessPhone;
}
