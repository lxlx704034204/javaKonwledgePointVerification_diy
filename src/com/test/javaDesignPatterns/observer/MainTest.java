package com.test.javaDesignPatterns.observer;

public class MainTest {

	public static void main(String[] args) {
		House h = new House(1000000); //��ʼ�� price 
		HouseBuyer_Observer buyer1 = new HouseBuyer_Observer("������1");   
		HouseBuyer_Observer buyer2 = new HouseBuyer_Observer("������2");   
		 HouseBuyer_Observer buyer3 = new HouseBuyer_Observer("������3");   
		 h.addObserver(buyer1);// ������(���۲쵽Objec) registered�۲���   
		 h.addObserver(buyer2);// ������(���۲쵽Objec) registered�۲���   
		 h.addObserver(buyer3);// ������(���۲쵽Objec) registered�۲���   
		 System.out.println(h.getPrice());// �޸�price֮ǰ ������Ӽ۸�   
		 h.setPrice(2222222);	  // �޸�price ing���ᴥ��update(Observable o, Object arg)֪ͨall�������µ�price   
		 System.out.println(h.getPrice());// �޸�price֮�� ������Ӽ۸� 


	}
}
