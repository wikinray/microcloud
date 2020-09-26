package com.aiguigu.springcloud.controller;

import com.aiguigu.springcloud.entities.CommonResult;
import com.aiguigu.springcloud.entities.Payment;
import com.aiguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create( Payment payment){

        Integer result=paymentService.create(payment);
        log.info("****插入结果****:{}",result);
        if(result>0){
            return new CommonResult(200,"插入数据库成功",result);

        }
        return new CommonResult(444,"插入数据库失败",null);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){

        Payment payment=paymentService.getPaymentById(id);
        log.info("****查询结果****:{}",payment);
        if(payment!=null){
            return new CommonResult(200,"查询结果成功",payment);

        }
        return new CommonResult(444,"无记录,查询ID:"+id,null);
    }
}
