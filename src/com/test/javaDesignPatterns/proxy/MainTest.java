package com.test.javaDesignPatterns.proxy;

public class MainTest {

	public static void main(String[] args) {
		Network net = null; // 定义接口对象  
		net = new Proxy(new Real()); // 实例化代理，同时传入代理的真实操作  
		net.browse(); // 调用代理的上网操作

	}
}
