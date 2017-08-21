package com.test.javaDesignPatterns.observer;

import java.util.Observable;

class House extends Observable { //���۲���(Observer)�۲� �� Class  
	private float price;   
	public House(float price) {this.price = price;}  
    public void setPrice(float price) {   
        this.setChanged();				// ���ñ仯��  
        this.notifyObservers(price);   	// ֪ͨ���й۲��߼۸�ı�  	synchronized
        this.price = price;   
    }   
    public float getPrice() { return this.price;  }   
}
