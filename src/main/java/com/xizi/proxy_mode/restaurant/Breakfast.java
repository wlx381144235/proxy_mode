package com.xizi.proxy_mode.restaurant;

import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;

/** 早餐饭店
 * @author 夜尽
 * @date 2020/12/7 15:47
 */

@Data
public class Breakfast {

    private ArrayList<MenuItem> menuItems;
    
    private void addItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }
    
    public Breakfast() {
        menuItems = new ArrayList<>();
        addItem(new MenuItem("油条","面食油炸",true,1.2));
        addItem(new MenuItem("包子","韭菜鸡蛋",true,1.5));
        addItem(new MenuItem("豆浆","豆制品",true,1.8));
        addItem(new MenuItem("丸子","肉丸子",false,2.5));
        
    }
    
    public Menu getIterator(){
        return new BreakfastMenu(this.menuItems);
    }
}
