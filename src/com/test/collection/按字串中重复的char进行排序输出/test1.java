package com.test.collection.按字串中重复的char进行排序输出;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
	
	public int find2(String src, String find) { //方法2
		if (src.length() < find.length()) return 0;
		char[] srcArr = src.toCharArray();//把String转化为Char[]才能 ”拼接” 操作
		int count = 0; //从被匹配字符串src的首个一个一个往后推，截取find字符串长度的字符串 与find字符串 对比
		for (int i = 0; i < src.length() - find.length() + 1; i++) { // 注意这个 +1 
			StringBuffer buffer = new StringBuffer();
			//这里必须用buffer把char数组转化成String。注：(char[]没有.toString()方法！！！)
			for (int j = 0; j < find.length(); j++) {
				buffer.append(srcArr[i + j]);
//				System.out.println("--haha->"+buffer.toString());
			}
			if(buffer.toString().equals(find)) count ++;
		}
		return count;
	}

	
	public int find1(String src, String find) { //方法1 
		if (src.length() < find.length()) return 0;
		Matcher m = Pattern.compile(find).matcher(src);// Pattern [?p?tn].compile: 模式.编译
		int count = 0;
		while(m.find()){ count++; } 
		return count;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}