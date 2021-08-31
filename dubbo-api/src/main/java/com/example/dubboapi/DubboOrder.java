package com.example.dubboapi;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/31
 * @desc
 */
public interface DubboOrder {
    /**
     * 创建订单
     * @param name
     * @return
     */
    String createOrder(String name);
}
