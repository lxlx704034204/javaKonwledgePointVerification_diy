package com.test.javaDesignPatterns.factoryPattern;

public class MainTest {
 
	public static void main(String[] args) {
		Animal a = null; // 定义接口对象  
		a = Factory.getInstance("Cat"); // 通过工厂获取实例  
		if (a != null) { // 判断对象是否为空  
		    a.say(); // 调用方法  
		}  

	}

}
