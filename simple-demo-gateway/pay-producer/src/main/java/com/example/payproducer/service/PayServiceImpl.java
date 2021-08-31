package com.example.payproducer.service;

import com.example.dubboapi.DubboPay;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/31
 * @desc
 */
@DubboService
public class PayServiceImpl  implements DubboPay {
    @Override
    public String payOrder(String orderNo) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("接受的订单号:"+orderNo);
        System.out.println("正在进行支付。。。。。");

        return "支付成功:返回的支付编码为：ZFD202108134212";
    }
}
