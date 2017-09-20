package com.test.collection.按字串中重复的char进行排序输出;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class test2 {  //给定一个string,按重复次数的升序排列 统计其中重复的char 

	public void doit(String src) { 
		test1 t1 = new test1(); 
		Map<String, Integer> mmPool = new HashMap<String, Integer>();

		for (int i = 0; i < src.length(); i++) { 
			String char_temp = src.substring(i, i + 1);	//重复的char
			int count = t1.find2(src, char_temp);		//重复的char 的重复次数 
			mmPool.put(char_temp, count);				//重复的char 具有唯一性 故作为key
		}

		List<Integer> mmValuelist = new ArrayList<Integer>();
		for (String g : mmPool.keySet()) 	mmValuelist.add(mmPool.get(g));			
															//mm的keyset[]每个key所对应的value 转化为mmValuelist
		
		Integer[] ss = mmValuelist.toArray(new Integer[0]);	//mm的mmValuelist 转化为mmValueset[]数组
//		int[] ss = new int[mmValuelist.size()];				//mm的mmValuelist 转化为mmValueset[]数组
//		for (int i = 0; i < mmValuelist.size(); i++) {
//			ss[i] = mmValuelist.get(i);
//		}

		Arrays.sort(ss);	//升序
		int jj=0;
		for(int ii : ss) 	jj=jj+ii;
//		System.out.println(jj);//一共有多少个重复的char
		
		List<String> mmValuelist_ideal=new ArrayList<String>();//diy存放keyset的集合
		
		for(int i=0; i < ss.length; i++){
			for (Entry<String,Integer> entryPool : mmPool.entrySet()) {
				if(ss[i] == entryPool.getValue()){	// diy假设条件（也正是我们想要的！）
					int h=0;				    	// diy假设条件 用state=0来标记，哈哈
					for(String ideal : mmValuelist_ideal){
						if(entryPool.getKey().equals(ideal)) 	h=1; 
						// 如果重复了，则标记state=1（if理想的预设list集合中 已经含有原有的mmPool的value了，则标记起来）
					}
					
					if(h==0){
						mmValuelist_ideal.add(entryPool.getKey()); 
						System.out.println("字："+entryPool.getKey()+"----------出现的次数: "+entryPool.getValue());
					}
				}
			}
		}
		
	}

}