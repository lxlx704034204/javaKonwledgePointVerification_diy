package com.test.javaDesignPatterns.proxy;

public class MainTest {

	public static void main(String[] args) {
		Network net = null; // ����ӿڶ���  
		net = new Proxy(new Real()); // ʵ��������ͬʱ����������ʵ����  
		net.browse(); // ���ô������������

	}
}
