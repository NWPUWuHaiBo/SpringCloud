package cn.whb.springcloud.dao;

import cn.whb.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author haiboWu
 * @create 2020-03-18 11:30
 */

//@Mapper : 表示本类是一个 MyBatis 的 Mapper
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
