package com.test.forr;

public class Son extends Parent implements inter{
	
	String a1 ="a_1";
	String a2 ="a_2";

//	@Override
//	@Overload
	public Son() {
		super();
	}
 


	 
	
	
	@Override
	public void NoParametersMethod() {
		super.NoParametersMethod();
		System.out.println("son1 Method....");
	}


 
	@Override
	public void hasParametersMethod(int a) {
		super.hasParametersMethod(a);
		System.out.println("son2 Method....");
	}
 
	//	@Override
	public void hasParametersMethod(int a, int b) {
		System.out.println("son3 Method: "+a+","+b);
	}

	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	@Override
	public String haha1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	 
	static int i = 200;
	void func() {
		System.out.println("in son.func(), and i = "+ i);
	}

	
	
//	public Long getLenght() { return new Long(5); }
	@Override
	public Integer getLenght() { return new Integer(6);   } //(方法名相同,参数相同的)重载@Override不能改变返回类型
	
//	@Override//此处 能加@Override 
//	public Parent aMethod() { System.out.println("public void aMethod(String s)"); return new Parent();}	
	//@Override//此处并不是 重载 父类的 aMethod方法 ,so就不能加@Override(算是子类的)，算是 自己类中的方法重载！
	public void aMethod(String s) { }
	public void aMethod(String s, int i) { }	//						自己类中的方法重载
	@Override  //此处		重载 父类的 aMethod方法,so   能加@Override！
	public Parent aMethod() { return new Parent(); } 
	
	
	private Son aMethod2() { return null; } 
}
