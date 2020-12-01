package com.xizi.proxy_mode.proxy.dynamic;

import com.xizi.proxy_mode.config.DataSourceKey;
import com.xizi.proxy_mode.config.DynamicDataSourceContextHolder;
import com.xizi.proxy_mode.util.BeanUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 夜尽
 * @date 2020/12/1 10:30
 */

public class ServiceDynamicProxy implements InvocationHandler {
    
    private Object target;
    
    public Object getInstance(Object obj){
        this.target =obj;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object object = method.invoke(BeanUtil.getBean(target.getClass()),args);
        after();
        return object;
    }
    
    private void before(Object object){
        try {
            String time = object.getClass().getMethod("getTime").invoke(object).toString();
            if(time.equals("2020")){
                DynamicDataSourceContextHolder.setDataSourceKey(DataSourceKey.master.name());
            } else {
                DynamicDataSourceContextHolder.setDataSourceKey(DataSourceKey.slave.name());
            }
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    
    private void after(){
        DynamicDataSourceContextHolder.clearDataSourceKey();
    }
}
