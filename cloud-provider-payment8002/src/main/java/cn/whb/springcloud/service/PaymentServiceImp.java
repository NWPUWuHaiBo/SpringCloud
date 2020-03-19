package cn.whb.springcloud.service;

import cn.whb.springcloud.dao.PaymentDao;
import cn.whb.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author haiboWu
 * @create 2020-03-18 13:46
 */
@Service
public class PaymentServiceImp  implements PaymentService{
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
