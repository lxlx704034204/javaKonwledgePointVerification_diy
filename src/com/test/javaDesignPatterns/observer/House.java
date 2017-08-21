package com.test.javaDesignPatterns.observer;

import java.util.Observable;

class House extends Observable { //被观察者(Observer)观察 的 Class  
	private float price;   
	public House(float price) {this.price = price;}  
    public void setPrice(float price) {   
        this.setChanged();				// 设置变化点  
        this.notifyObservers(price);   	// 通知所有观察者价格改变  	synchronized
        this.price = price;   
    }   
    public float getPrice() { return this.price;  }   
}
