package com.test.javaDesignPatterns.proxy;

class Proxy implements Network { // 代理上网  
    private Network network;   
    public Proxy(Network realNetwork) {// 设置代理的真实操作  
        this.network = realNetwork; // 设置代理的子类  
    }   
	@Override // 重载
    public void browse() {   
        this.check(); // 调用具体的代理业务操作  
        this.network.browse(); // 调用真实的上网操作  
    }  
	public void check() { System.out.println("检查用户是否合法！"); } // 子类私有的 身份验证方法
}  
