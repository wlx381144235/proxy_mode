package com.xizi.proxy_mode.restaurant;

import lombok.Data;

import java.util.HashMap;

/** 服务员类
 * @author 夜尽
 * @date 2020/12/7 16:06
 */

@Data
public class Waitress {
    private HashMap<String,Iterator> menus;
    
    public Waitress(HashMap<String,Iterator> menus) {
        this.menus = menus;
    }
    
    public void printItem(){
        menus.forEach((k,v) -> v.printMenu());
    }
    
    public void printBreakFast(){
        menus.get("breakfast").printMenu();
    }
    
    public void printLaunch(){
        menus.get("launch").printMenu();
    }
    
    public void printVegetarian(){
        menus.forEach((k,v) -> v.printVegetarian());
    }
}
