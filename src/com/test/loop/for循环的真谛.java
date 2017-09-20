package com.test.loop;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class for循环的真谛 {
 
	static boolean foo(char c){
		System.out.print(c + "\t");
		return true;		
	}
	
/*
	1.其实foo('A');就是初始化(条件)，只会执行一次，所以第一个打印的肯定是A位置
	2.因为i=0;
		循环条件是i<2 （由此可知循环i等于2的时候就会停止循环，)所以0<2满足条件，接着会输出B位置，
		然后执行i++;i就变成1了，
		在输出D位置，（满足条件B位置,则直接输出D位置, 运算完，然后j++(++在后面 表示先运算 再加1)） <可参照 常见的for(int j=0; j<list1.size(); j++){...}>
		在最后输出C位置， 
		一次循环后的结果(位置执行顺序)是：ABDC
	3.第二次循环的开始是foo('A');是初始条件所以不会执行，
		so直接从foo('B')开始，输出B位置 (当前i为1，且小于2)，
		此时循环体内再次执行i++, i的值为2了，
		再次输出D位置，
		最后输出C位置 
		第二次循环的结果(位置执行顺序)是：BDC
	4.然后循环再次执行for(foo('A');foo('B')&&(i<2);foo('C'))
		直接输出B位置，输出B后终止(i的值在第二轮循环后的值变成了2，2<2不成立，终止循环)，
		
		A	B	D	C	B	D	C	B
		 
//		 List<String> list1 = new ArrayList<String>();
//		 list1.add("李0"); list1.add("李1"); list1.add("李2");  
// 		       A			B		   C
//		 for(int j=0; j<list1.size(); j++){ // ++在后面 表示先运算 再加1
//						D
//			 System.out.println(list1.get(j));  //（满足条件B,则直接输出D, 运算完，然后j++(++在后面 表示先运算 再加1)）
//		 }
  
*/
	public static void main(String[] args) {	//	for(int j=0; j<length; j++){ }
		 int i = 0;
		 //其实考的就是for (初始化语句; 判断条件; 循环条件) 
		 for( foo('A'); foo('B') && (i < 2); foo('C') ){
			 i++; 		//此处需手工添加i++, 否则无法循环下去！ 它实际上 是模拟常见的for循环的 'C' 位置 ！！！
			 foo('D');
		 }
		 
		 
		 
//		 // 把int格式的 String[]数组 转化为 以逗号隔开的 数字  方法1：
//		 String[] ii = {"1","2","3"}; 
// 
//		 String ids = "";
//		 for(int k=0; k<ii.length;k++){
//				if(k==0){
//					ids=ii[k];
//				}else{
//					ids+=","+ii[k];
//				}
//		}
//		 System.out.println(ids); //1,2,3
		  
	 
//		// 把int格式的 String[]数组 转化为 以逗号隔开的 数字  方法2：	 
//		 String[] ary = {"1", "2", "3"}; //{"abc", "123", "45"}
//		 String str2 = String.format("%s,%s,%s", ary);
//		 System.out.println(str2); 
		 
		 
		  
//		 String str2 = "1,2,3";
//		 String[] nids =  str2.split(",");
//		 for(int k=0; k<nids.length;k++){
//			 System.out.print(nids[k]); 
//		 }
		 
//		 2.
//		 try {
//			new FileOutputStream("C:\\www\\aaa.txt");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
	
//		3.
		 
		 
//		 List<String> ls = new ArrayList<String>();; //find_key_byGoodsId( goodsId)
//			ls.add("11_55_102");
//			ls.add("11_99_102");
//			ls.add("11_100_102");
//			
//			Map<Integer, List<String>> mml = new HashMap<Integer, List<String>>();
//			Map<Integer, Map<Integer,String>> mmm = new HashMap<Integer, Map<Integer,String>>();
//			
//			List<String> list = null;
//			Map<Integer,String> mm = null;
//			if(ls!=null && !ls.isEmpty()){
//				
//				for(int i=0; i< ls.size(); i++){
//					list = new ArrayList<String>();
//					list.add(ls.get(i).replace("_", ","));
//
//// 					这种办法 不行					
////					mm = new HashMap<Integer, String>();
////					mm.put(i, ls.get(i).replace("_", ",")); 
////					mmm.put(i, mm);
//					
//					mml.put(i, list);
//				}
//			}
//		 
//		 System.out.println("mml.size(): "+ mml.size()); //mmm.size()   3
//		 System.out.println("mml.size(): "+ mml.get(1)); // mmm.get(1)   {1=11,99,102}
			
			
			
			
	} 
	
//	public void find_key_byGoodsId2(){ //int goodsId
//		
//		
//		List<String> ls = new ArrayList<String>();; //find_key_byGoodsId( goodsId)
//		ls.add("11_55_102");
//		ls.add("11_99_102");
//		ls.add("11_100_102");
//		
//		
//		if(ls!=null && !ls.isEmpty()){
//			Map<Integer, Map<Integer,String>> mml = new HashMap<Integer, Map<Integer,String>>();
//			Map<Integer,String> mm = null;
//			for(int i=0; i< ls.size(); i++){
//				mm = new HashMap<Integer, String>();
//				mm.put(i, ls.get(i).replace("_", ","));
//				mml.put(i, mm);
//			}
//		}
//			
//		
//		
//	}

}