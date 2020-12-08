package com.xizi.proxy_mode.restaurant;


/**
 * @author 夜尽
 * @date 2020/12/7 16:14
 */

public class Test {
    public static void main(String[] args) {
        MenuComponent all = new Menus("all","全部菜单");
        MenuComponent zaocan = new Menus("zaocan","早餐");
        MenuComponent wucan = new Menus("wucan","午餐");
        MenuComponent tiandian = new Menus("tiandian","甜点");
        
        tiandian.add(new MenuItem("饼干","面食",true,1.2));
        tiandian.add(new MenuItem("冰激凌","面食",true,1.2));
        
        zaocan.add(new MenuItem("油条","面食油炸",true,1.2));
        zaocan.add(new MenuItem("包子","韭菜鸡蛋",true,1.5));
        zaocan.add(new MenuItem("豆浆","豆制品",true,1.8));
        zaocan.add(new MenuItem("丸子","肉丸子",false,2.5));
    
        wucan.add(new MenuItem("京酱肉丝","肉啊",false,12.5));
        wucan.add(new MenuItem("鱼香肉丝","肉啊",false,16.5));
        wucan.add(new MenuItem("炒虾仁","虾啊",false,22.5));
        wucan.add(new MenuItem("炒青菜","蔬菜",true,8.5));
        wucan.add(tiandian);
        
        all.add(zaocan);
        all.add(wucan);
        
        Waitress alice = new Waitress(all);
        alice.printMenu();
    }
}
