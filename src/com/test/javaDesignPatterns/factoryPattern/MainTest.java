package com.test.javaDesignPatterns.factoryPattern;

public class MainTest {
 
	public static void main(String[] args) {
		Animal a = null; // ����ӿڶ���  
		a = Factory.getInstance("Cat"); // ͨ��������ȡʵ��  
		if (a != null) { // �ж϶����Ƿ�Ϊ��  
		    a.say(); // ���÷���  
		}  

	}

}
