package com.xizi.proxy_mode.controller;

import com.xizi.proxy_mode.pojo.XxOrder;
import com.xizi.proxy_mode.proxy.dynamic.ServiceDynamicProxy;
import com.xizi.proxy_mode.service.OrderService;
import com.xizi.proxy_mode.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @Qualifier("orderServiceProxy")
    private OrderService orderService;
    
    @PostMapping("/create")
    public void create(XxOrder xxOrder){
        orderService.createOrder(xxOrder);
    }
    
    @PostMapping("/create2")
    public void create2(XxOrder xxOrder){
        OrderService dynamicOrderService = (OrderService) new ServiceDynamicProxy().getInstance(new OrderServiceImpl());
        dynamicOrderService.createOrder(xxOrder);
    }
}
