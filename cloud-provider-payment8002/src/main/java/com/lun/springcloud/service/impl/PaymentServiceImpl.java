package com.lun.springcloud.service.impl;

import com.lun.springcloud.dao.PaymentDao;
import com.lun.springcloud.entities.Payment;
import com.lun.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Cnzlike
 * @date 2022/3/27 12:08
 */
@Service    //写接口实现类必写Service注解
public class PaymentServiceImpl implements PaymentService {
@Resource
//@Resource是java自带的，@Autowired是spring的。都可以进行依赖注入
//Service调Dao，用Dao的方法操纵mysql
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
