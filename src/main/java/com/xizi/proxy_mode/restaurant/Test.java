package com.xizi.proxy_mode.restaurant;


/**
 * @author 夜尽
 * @date 2020/12/7 16:14
 */

public class Test {
    public static void main(String[] args) {
        Waitress alice = new Waitress(new Breakfast(), new Lunch());
        alice.printItem();
        System.out.println("=================================");
        alice.printBreakFast();
        System.out.println("=================================");
        alice.printLaunch();
        System.out.println("=================================");
    }
}
