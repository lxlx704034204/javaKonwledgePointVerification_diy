package com.test.javaDesignPatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class HouseBuyer_Observer implements Observer {//观察者interface   
    private String name;   //观察者的 name
    public HouseBuyer_Observer(String name) {   
        super();   
        this.name = name;   
    }   
    @Override  //同步的 update方法
    public void update(Observable o, Object arg) {// 只要改变了 observable 对象就调用此方法  
        if (arg instanceof Float) {   
            System.out.println(this.name + "观察的价格更改为:" + ((Float) arg).floatValue());   
        }   
    }   
}   

