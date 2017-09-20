package com.test.collection.按字串中重复的char进行排序输出;

import java.util.HashMap;
import java.util.Map;

public class testmain {
	int i;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test2 t2=new test2();
		
		String a="sdabddsdbbb";
		String b="dab";
		
		
		String c= "快快快快快打打打卡啊机卡啊的的的的的空";
		t2.doit(c);
 
		
//		System.out.println( queryURL("http://www.baidu.com?name=javascript&keyword=word") );
	}

	
	public static String queryURL(String url){
//		Object[] obj = {};
		Map<String, String> mm = new HashMap<String, String>(); 
		String[] params = url.split("\\?")[1].split("&"); //因为+、*、|、\、?等符号在正则表达示中有相应的不同意义，所以在使用时要进行转义处理
		for(int i=0;i<params.length;i++){
			String[] param = params[i].split("=");
//	         obj[param[0]] = param[1];//为对象赋值 相当于java的list.add()
			mm.put(param[0], param[1]);
	     }  
	     return mm.toString();
//	     var a = queryURL("http://www.baidu.com?name=javascript&keyword=word");
	}
	
	
	
	
}