package com.example.dubboapi;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/31
 * @desc
 */
public interface DubboPay {

    /**
     *  支付订单
     * @param orderNo
     * @return
     */
    String payOrder(String orderNo) throws InterruptedException;
}
