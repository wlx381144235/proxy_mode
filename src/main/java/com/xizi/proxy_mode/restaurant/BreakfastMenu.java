package com.xizi.proxy_mode.restaurant;

import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;

/** 早餐饭店
 * @author 夜尽
 * @date 2020/12/7 15:47
 */

@Data
public class BreakfastMenu implements Menu {

    private ArrayList<MenuItem> menuItems;
    private Iterator<MenuItem> iterator;
    
    
    public BreakfastMenu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.iterator = menuItems.iterator();
    }
    
    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }
    
    @Override
    public Object next() {
        return iterator.next();
    }
}
