package com.example.webdubbo.controller;

import com.example.dubboapi.DubboHello;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/31
 * @desc
 */
@RestController
public class WebController {
    @Autowired
    private DubboHello hello;

    @GetMapping("/test/{name}")
    public String test(@PathVariable("name") String name) {
        return hello.sayHello(name);
    }
}
