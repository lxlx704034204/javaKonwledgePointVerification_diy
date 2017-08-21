package com.test.javaDesignPatterns.proxy;

class Real implements Network { // 真实的上网操作 
	@Override // 重载   
	public void browse() {System.out.println("上网浏览信息Real.class----我将被proxy类 覆盖"); }   
}  
