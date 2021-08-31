package com.example.dubboapi;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/31
 * @desc
 */
public interface DubboSMS {
    /**
     * 发送短信
     * @param name
     * @return
     */
    String sendSMS(String name);

}
