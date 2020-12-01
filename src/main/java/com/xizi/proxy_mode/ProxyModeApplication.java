package com.xizi.proxy_mode;

import com.xizi.proxy_mode.util.BeanUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProxyModeApplication {

    public static void main(String[] args) {
        BeanUtil.applicationContext = SpringApplication.run(ProxyModeApplication.class, args);
    }

}
