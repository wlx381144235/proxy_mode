package com.xizi.proxy_mode.restaurant;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/** 服务员类
 * @author 夜尽
 * @date 2020/12/7 16:06
 */

@Data
public class Waitress {
    private ArrayList<MenuItem> breakfast;
    private MenuItem[] launch;
    
    public Waitress(ArrayList<MenuItem> breakfast, MenuItem[] launch) {
        this.breakfast = breakfast;
        this.launch = launch;
    }
    
    public void printItem(){
        breakfast.forEach(System.out::println);
    
        Arrays.stream(launch).forEach(System.out::println);
    }
    
    public void printBreakFast(){
        breakfast.forEach(System.out::println);
    }
    
    public void printLaunch(){
        Arrays.stream(launch).forEach(System.out::println);
    }
    
    public void printVegetarian(){
        breakfast.stream().filter(MenuItem::isVagetarian).forEach(System.out::println);
        Arrays.stream(launch).filter(Objects::nonNull).filter(MenuItem::isVagetarian).forEach(System.out::println);
    }
}
