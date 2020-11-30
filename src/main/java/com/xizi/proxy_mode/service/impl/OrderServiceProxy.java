package com.xizi.proxy_mode.service.impl;

import com.xizi.proxy_mode.config.DataSourceKey;
import com.xizi.proxy_mode.config.DynamicDataSourceContextHolder;
import com.xizi.proxy_mode.pojo.XxOrder;
import com.xizi.proxy_mode.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 夜尽
 * @date 2020/11/30 11:26
 */
@Service
@Slf4j
public class OrderServiceProxy {
    
    @Resource
    private OrderService orderService;
    
    public String createOrder(XxOrder xxOrder) {
        before(xxOrder);
        orderService.createOrder(xxOrder);
        after();
        return "插入成功";
    }
    
    private void before(XxOrder xxOrder){
        if(xxOrder.getTime().equals("2020")){
            DynamicDataSourceContextHolder.setDataSourceKey(DataSourceKey.master.name());
        } else {
            DynamicDataSourceContextHolder.setDataSourceKey(DataSourceKey.slave.name());
        }
        
        log.info("切换数据源成功");
    }
    
    private void after(){
        DynamicDataSourceContextHolder.clearDataSourceKey();
    }
}
