package cn.whb.springcloud.service;

import cn.whb.springcloud.dao.PaymentDao;
import cn.whb.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author haiboWu
 * @create 2020-03-18 13:44
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
