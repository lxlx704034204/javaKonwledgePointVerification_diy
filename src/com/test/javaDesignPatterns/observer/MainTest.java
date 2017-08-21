package com.test.javaDesignPatterns.observer;

public class MainTest {

	public static void main(String[] args) {
		House h = new House(1000000); //初始化 price 
		HouseBuyer_Observer buyer1 = new HouseBuyer_Observer("购房者1");   
		HouseBuyer_Observer buyer2 = new HouseBuyer_Observer("购房者2");   
		 HouseBuyer_Observer buyer3 = new HouseBuyer_Observer("购房者3");   
		 h.addObserver(buyer1);// 给房子(被观察到Objec) registered观察者   
		 h.addObserver(buyer2);// 给房子(被观察到Objec) registered观察者   
		 h.addObserver(buyer3);// 给房子(被观察到Objec) registered观察者   
		 System.out.println(h.getPrice());// 修改price之前 输出房子价格   
		 h.setPrice(2222222);	  // 修改price ing，会触发update(Observable o, Object arg)通知all购房者新的price   
		 System.out.println(h.getPrice());// 修改price之后 输出房子价格 


	}
}
