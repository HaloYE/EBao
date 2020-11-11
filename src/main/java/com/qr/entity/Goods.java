package com.qr.entity;

import lombok.Data;

@Data
public class Goods {
    private String goodsId;
    private String goodsName;
    private String goodsKind;
    private String shopsId;
    private Integer goodsPrice;
    private Integer deposit;
}
