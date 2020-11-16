package com.qr.entity;

import lombok.Data;

@Data
public class Goods {
    private String goodsId;
    private String goodsName;
    private String goodsFirstKind;
    private String goodsSecondKind;
    private String shopId;
    private Integer goodsPrice;
    private Integer deposit;
    private Integer status;
    private String goodsPicture;
}
