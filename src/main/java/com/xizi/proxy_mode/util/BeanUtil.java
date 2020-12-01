package com.xizi.proxy_mode.util;

import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 夜尽
 * @date 2020/12/1 11:37
 */

public class BeanUtil {
    //将管理上下文的applicationContext设置成静态变量，供全局调用
    public static ConfigurableApplicationContext applicationContext;
    //定义一个获取已经实例化bean的方法
    public static <T> T getBean(Class<T> c){
        return applicationContext.getBean(c);
    }
}
