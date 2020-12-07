package com.xizi.proxy_mode.restaurant;

import lombok.Data;

/** 午餐饭店
 * @author 夜尽
 * @date 2020/12/7 15:48
 */

@Data
public class Lunch {

    private static int MAX_ITEMS = 6;
    private int numOfMenu = 0;
    private MenuItem[] menuItems;
    
    public Lunch() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem(new MenuItem("京酱肉丝","肉啊",false,12.5));
        addItem(new MenuItem("鱼香肉丝","肉啊",false,16.5));
        addItem(new MenuItem("炒虾仁","虾啊",false,22.5));
        addItem(new MenuItem("炒青菜","蔬菜",true,8.5));
    }
    
    public void addItem(MenuItem menuItem){
        if(numOfMenu > MAX_ITEMS){
            System.out.println("菜单已满，不能继续添加");
        } else {
            menuItems[numOfMenu] = menuItem;
            numOfMenu += 1;
        }
    }
}
