package com.test.javaDesignPatterns.proxy;

class Real implements Network { // ��ʵ���������� 
	@Override // ����   
	public void browse() {System.out.println("���������ϢReal.class----�ҽ���proxy�� ����"); }   
}  
