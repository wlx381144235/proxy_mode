package com.xizi.proxy_mode.restaurant;

import java.util.ArrayList;
import java.util.Iterator;

/** 菜单类
 * @author 夜尽
 * @date 2020/12/8 14:39
 */

public class Menus extends MenuComponent {
    private String name;
    private String description;
    private ArrayList<MenuComponent> menuComponentArrayList = new ArrayList<>();
    
    public Menus(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentArrayList.add(menuComponent);
    }
    
    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentArrayList.remove(menuComponent);
    }
    
    @Override
    public MenuComponent getChild(int i) {
        return menuComponentArrayList.get(i);
    }
    
    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.print("," + getDescription());
        System.out.println("------------------------");
        Iterator<MenuComponent> iterator = menuComponentArrayList.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}
