package com.xizi.proxy_mode.service.impl;

import com.xizi.proxy_mode.mapper.OrderMapper;
import com.xizi.proxy_mode.pojo.XxOrder;
import com.xizi.proxy_mode.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 夜尽
 * @date 2020/11/30 11:38
 */

@Service
public class OrderServiceImpl implements OrderService {
    
    @Resource
    private OrderMapper orderMapper;
    
    @Override
    public String createOrder(XxOrder xxOrder) {
        orderMapper.create(xxOrder);
        return "插入成";
    }
}
