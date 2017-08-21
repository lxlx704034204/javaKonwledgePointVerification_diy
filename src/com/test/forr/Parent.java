package com.test.forr;

public class Parent {
	
	public Parent(){}
	
	public void NoParametersMethod(){
	        System.out.println("Parent1 Method");
	}
	
    public void hasParametersMethod(int a){
        System.out.println("Parent2 Method: "+ a);
    }
	
	
    //成员方法测试
    public int foo(long i){return 1;}
    public int foo(int i){return 2;}
//public String foo(int suu){return "1";} //no：　主要是　参数一样了（无关返回类型）　！
    public int foo(int i, String str){return 2;} //参数相同，位置不同 也可以（无关返回类型）
    public int foo(String str,int i ){return 2;}
    
    
 
    
	
	//Object
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	protected void finalize() throws Throwable {
	}
	
	
	
	
	static int i = 100;
	void func() {
		System.out.println("in father.func(), and i = " + i);
	}

	
	
	
	
	public Integer getLenght() { return new Integer(4); }
	public Parent aMethod() { System.out.println("public Parent aMethod()"); return this; }

	 
 
	

}
