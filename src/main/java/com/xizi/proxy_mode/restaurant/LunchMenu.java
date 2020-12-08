package com.xizi.proxy_mode.restaurant;

import lombok.Data;

/** 午餐饭店
 * @author 夜尽
 * @date 2020/12/7 15:48
 */

@Data
public class LunchMenu implements Menu {

    private static int MAX_ITEMS = 6;
    private int numOfMenu = 0;
    private MenuItem[] menuItems;
    
    public LunchMenu(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }
    
    @Override
    public boolean hasNext() {
        if(numOfMenu >= menuItems.length || menuItems[numOfMenu] == null){
            return false;
        } else {
            return true;
        }
    }
    
    @Override
    public Object next() {
        MenuItem menuItem = menuItems[numOfMenu];
        numOfMenu ++;
        return menuItem;
    }
}
