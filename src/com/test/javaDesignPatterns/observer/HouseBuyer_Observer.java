package com.test.javaDesignPatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class HouseBuyer_Observer implements Observer {//�۲���interface   
    private String name;   //�۲��ߵ� name
    public HouseBuyer_Observer(String name) {   
        super();   
        this.name = name;   
    }   
    @Override  //ͬ���� update����
    public void update(Observable o, Object arg) {// ֻҪ�ı��� observable ����͵��ô˷���  
        if (arg instanceof Float) {   
            System.out.println(this.name + "�۲�ļ۸����Ϊ:" + ((Float) arg).floatValue());   
        }   
    }   
}   

