package com.qr.dao;

import com.qr.entity.Lease;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("InsertOrderDao")
public interface InsertOrderDao {
    void insertOredr(Lease lease);
}
