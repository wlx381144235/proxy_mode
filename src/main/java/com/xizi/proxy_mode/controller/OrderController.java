package com.xizi.proxy_mode.controller;

import com.xizi.proxy_mode.pojo.XxOrder;
import com.xizi.proxy_mode.service.impl.OrderServiceProxy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 夜尽
 * @date 2020/11/30 11:40
 */

@RestController
@RequestMapping("/test")
public class OrderController {
    
    @Resource
    private OrderServiceProxy orderServiceProxy;
    
    @PostMapping("/create")
    public void create(XxOrder xxOrder){
        orderServiceProxy.createOrder(xxOrder);
    }
}
