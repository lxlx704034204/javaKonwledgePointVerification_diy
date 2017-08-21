package com.test.javaDesignPatterns.proxy;

class Proxy implements Network { // ��������  
    private Network network;   
    public Proxy(Network realNetwork) {// ���ô������ʵ����  
        this.network = realNetwork; // ���ô��������  
    }   
	@Override // ����
    public void browse() {   
        this.check(); // ���þ���Ĵ���ҵ�����  
        this.network.browse(); // ������ʵ����������  
    }  
	public void check() { System.out.println("����û��Ƿ�Ϸ���"); } // ����˽�е� �����֤����
}  
