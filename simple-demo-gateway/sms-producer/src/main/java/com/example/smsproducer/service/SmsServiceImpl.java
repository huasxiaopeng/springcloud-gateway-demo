package com.example.smsproducer.service;

import com.example.dubboapi.DubboSMS;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/31
 * @desc
 */
@DubboService
public class SmsServiceImpl  implements DubboSMS {
    @Override
    public String sendSMS(String name) {
        System.out.println("调用短信服务。。。。");
        return "调用者："+name+" :您的验证码为【231456】";
    }
}
