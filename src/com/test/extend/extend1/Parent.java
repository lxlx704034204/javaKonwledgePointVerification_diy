package com.test.extend.extend1;

public class Parent {
	
	public Parent(){}
	
	public int k = 0;
	public Parent(String str){ k = 1; }
	
	public void NoParametersMethod(){
	        System.out.println("Parent1 Method");
	}
	
    public void hasParametersMethod(int a){
        System.out.println("Parent2 Method: "+ a);
    }
	
	
    //��Ա��������
    public int foo(long i){return 1;}
    public int foo(int i){return 2;}
//public String foo(int suu){return "1";} //no������Ҫ�ǡ�����һ���ˣ��޹ط������ͣ�����
    public int foo(int i, String str){return 2;} //������ͬ��λ�ò�ͬ Ҳ���ԣ��޹ط������ͣ�
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
