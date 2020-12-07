package com.xizi.proxy_mode.restaurant;

import lombok.Data;

/** 菜品实例对象
 * @author 夜尽
 * @date 2020/12/7 15:51
 */

@Data
public class MenuItem {

    private String name;
    private String description;
    private boolean isVagetarian;
    private double price;
    
    public MenuItem(String name, String description, boolean isVagetarian, double price) {
        this.name = name;
        this.description = description;
        this.isVagetarian = isVagetarian;
        this.price = price;
    }
}
