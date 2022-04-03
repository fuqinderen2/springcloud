package com.lun.springcloud.service;

import com.lun.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(Payment payment); //写操作

    public Payment getPaymentById(@Param("id") Long id);    //读操作
}
