package com.test.javaDesignPatterns.factoryPattern;



public class Factory {
 
	public static Animal getInstance(String className) {   
        Animal a = null; // ����ӿڶ���  
        if ("Cat".equals(className)) { // �ж����ĸ�����ı��  
            a = new Cat(); // ͨ��Cat����ʵ�����ӿ�  
        }   
        if ("Dog".equals(className)) { // �ж����ĸ�����ı��  
            a = new Dog(); // ͨ��Dog����ʵ�����ӿ�  
        }   
        return a;   
    }   
	
	

	
	
}  
