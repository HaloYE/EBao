package com.qr.service.impl;

import com.qr.dao.InsertOrderDao;
import com.qr.entity.Lease;
import com.qr.service.IAddOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("addOrderService")
public class IAddOrderServiceImpl implements IAddOrderService {
    @Resource
    private InsertOrderDao InsertOrderDao;
    public void addOrder(Lease lease) {
        InsertOrderDao.insertOredr(lease);
    }
}
