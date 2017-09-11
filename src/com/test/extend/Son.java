package com.test.extend;

public class Son extends Parent implements inter{
	
	String a1 ="a_1";
	String a2 ="a_2";

//	@Override
//	@Overload
	public Son() {
		super();
	}
 
	public Son(String text) {
		 k= 2;
	}

	 
	
	
	@Override //覆盖
	public void NoParametersMethod() {
//		super.NoParametersMethod();   //有此句则 就会调用父类的该方法！没有则不会调用父类的该方法
		System.out.println("son1 Method....");
	}


 
	@Override 		//重载
	public void hasParametersMethod(int a) {
//		super.hasParametersMethod(a); //有此句则 就会调用父类的该方法！没有则不会调用父类的该方法
		System.out.println("son2 Method....");
	}
 
	//	@Override //重载
	public int hasParametersMethod(int a, int b) {
		System.out.println("son3 Method: "+a+","+b);
		return 1;
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

	
	
//	public Long getLenght() { return new Long(5); }  		//错误的返回类型，返回类型必须为Integer
	@Override
	public Integer getLenght() { return new Integer(6);   } //★★★(方法名相同,参数相同的)<son继承parent>的重载@Override不能改变返回类型
	
//	@Override//此处 能加@Override 
//	public Parent aMethod() { System.out.println("public void aMethod(String s)"); return new Parent();}	
	//@Override//此处并不是 重载 父类的 aMethod方法 ,so就不能加@Override(算是子类的)，算是 自己类中的方法重载！
	public void aMethod(String s) { }					//  重载 子类对父类覆盖的方法
	public int  aMethod(String s, int i) {return 1; }	//	重载 子类对父类覆盖的方法					自己类中的方法重载
	public boolean  aMethod(int s, int i) {return false; }//同名成员方法与返回类型无关，只与参数有关：包括个数，位置（参数都一样，但是放置的位置不同也可以！）
	
	@Override  //此处		覆盖 父类的 aMethod方法,so   能加@Override！
	public Parent aMethod() { return new Parent(); } 
	
	
	private Son aMethod2() { return null; } 
}
