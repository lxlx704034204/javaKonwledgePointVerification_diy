package com.test.extend;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class testMain {
	static int i = 0;
	
	 public void test(String param){System.out.println("String"+param);}
	 public void test(short param){System.out.println("short"+param);}
	 public void test(int param){System.out.println("int"+param);}
	 public void test(Integer param){System.out.println("Integer"+param);}
	 public void test(Long param){System.out.println("Long"+param);}
	 public void test(long param){System.out.println("long"+param);}
 
	
	//http://www.cnblogs.com/cmi-sh-love/p/fang-fa-de-fu-gai-override-zhong-zai-overload-he-z.html 
	public static void main(String[] args) {
		Parent pp1 = new Son();
//		pp1.NoParametersMethod();    	//son覆盖父类的该方法
//		pp1.hasParametersMethod(10);	//son重写父类的该方法
		
		Son ss2 = new Son();
//		ss2.NoParametersMethod();   	//son覆盖父类的该方法
//		ss2.hasParametersMethod(11, 12);//son重写父类的该方法
		
		Son ss3 = new Son("构造函数问题： ");
//		System.out.println(ss3.k); //2 : 重写
		
		
		Parent pp2 = new Parent();
		System.out.println("---test int混淆---: "+pp2.getLenght().toString() + "," + ss2.getLenght().toString() );//<son继承parent>的重载 (不能改变返回类型)
		//												4								6
		
		
//		ss1.func();
 
		//--------------
		testMain tm = new testMain();
//		tm.test(1000000000);
		
		//---------费波纳茨-----
//		System.out.println(tm.fun1(20));
//		System.out.println(tm.fun2(20));; 
		 
		//--------字符串反转------
//		String s="fedcba";
//		StringBuffer sb=new StringBuffer(s);
//		sb=sb.reverse();
//		System.out.println(sb.toString());
		
		//--------static------
//		tm.fun3();
//		int j = tm.fun3();
//		System.out.println(j);
		
		//-------- ------  
		 
		
		
 
	}
	 
 


	public  int fun3(){ 
		i++;
		return i;
	}
	
	
	 public int fun1(int n) {
		int sum = 0; 
		if (n < 2) return 1; 
		for(int i = 2; i <= n; i++) {
			sum = fun1(i-2) + fun1(i-1); 
		}
		return sum; 
	}
	int fun2(int n) { 
		if (n <= 0) 			return 0;
		else  if(n>0 && n<=2) 	return 1; 
		else  					return fun1(n-2) + fun1(n-1);
	}

	
}
