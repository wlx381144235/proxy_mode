package com.xizi.proxy_mode.restaurant;

import java.util.HashMap;

/**
 * @author 夜尽
 * @date 2020/12/7 16:14
 */

public class Test {
    public static void main(String[] args) {
        HashMap<String,Iterator> map = new HashMap<>();
        map.put("breakfast",new Breakfast());
        map.put("launch",new Lunch());
        Waitress alice = new Waitress(map);
        alice.printItem();
        System.out.println("=================================");
        alice.printBreakFast();
        System.out.println("=================================");
        alice.printLaunch();
        System.out.println("=================================");
        alice.printVegetarian();
    }
}
