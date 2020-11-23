package com.qr.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Lease {
    private String leaseId;
    private String goodsId;
    private String userId;
    private String leaseTime;
    private String returnTime;
}
