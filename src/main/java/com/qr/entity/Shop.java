package com.qr.entity;

import lombok.Data;

@Data
public class Shop {
    private String shopId;
    private String shopName;
    private String businessId;
    private String address;
    private double longitude;
    private double latitude;
}
