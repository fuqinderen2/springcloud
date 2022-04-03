package com.lun.springcloud.dao;

import com.lun.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper //写DAO必写Mapper注解
public interface PaymentDao {
    public int create(Payment payment); //写操作

    public Payment getPaymentById(@Param("id") Long id);    //读操作
}
