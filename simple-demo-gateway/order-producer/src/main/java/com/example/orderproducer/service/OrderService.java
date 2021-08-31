package com.example.orderproducer.service;

import com.example.dubboapi.DubboOrder;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/31
 * @desc
 */
@DubboService
public class OrderService  implements DubboOrder {
    @Override
    public String createOrder(String name) {
        System.out.println("用户名："+name+"  准备创建订单");
        System.out.println("创建的订单为：CD201212145");
        return "返回的订单信息为：CD201212145";
    }
}
