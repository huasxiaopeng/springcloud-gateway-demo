package com.example.webdubbo.service;

import com.example.dubboapi.DubboHello;
import org.apache.dubbo.config.annotation.DubboService;


/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/31
 * @desc
 */
@DubboService(protocol = "dubbo")
public class DubboHelloImpl  implements DubboHello {
    @Override
    public String sayHello(String name) {
        System.out.println("服务提供者被调用");
        return "dubbo service: " + name;
    }
}
