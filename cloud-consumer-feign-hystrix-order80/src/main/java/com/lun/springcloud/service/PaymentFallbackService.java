package com.lun.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Cnzlike
 * @date 2022/4/2 18:39
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "paymentInfo_OK fall back ┭┮﹏┭┮";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "paymentInfo_TimeOut fall back ┭┮﹏┭┮";
    }
}
