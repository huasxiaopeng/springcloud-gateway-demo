package com.example.payproducer.controller;

import com.example.dubboapi.DubboPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/31
 * @desc
 */
@RestController
public class PayController {
   @Autowired
    private DubboPay dubboPay;
   @GetMapping("/pay")
   public String pay() throws InterruptedException {
       System.out.println("调用pay.....");
       String s = dubboPay.payOrder("001");
       return s;
   }
}
