package com.aiguigu.springcloud.dao;

import com.aiguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    int create(Payment payment);


    Payment getPaymentById(@Param("id")Long id);
}
