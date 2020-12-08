package com.xizi.proxy_mode.restaurant;

import lombok.Data;


/** 服务员类
 * @author 夜尽
 * @date 2020/12/7 16:06
 */

@Data
public class Waitress {
    private MenuComponent menuComponent;
    
    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }
    
    public void printMenu(){
        menuComponent.print();
    }
    
//    public void printItem(){
//        Menu breakfastIterator = breakfast.getIterator();
//        printItem(breakfastIterator);
//        Menu lunchIterator = lunch.getIterator();
//        printItem(lunchIterator);
//    }
//    public void printItem(Menu iterator){
//        while(iterator.hasNext()){
//            MenuItem menuItem = (MenuItem) iterator.next();
//            System.out.println(menuItem);
//        }
//    }
//
//    public void printBreakFast(){
//        printItem(breakfast.getIterator());
//    }
//
//    public void printLaunch(){
//        printItem(lunch.getIterator());
//    }
    
//    public void printVegetarian(){
//        menus.forEach((k,v) -> v.printVegetarian());
//    }
}
