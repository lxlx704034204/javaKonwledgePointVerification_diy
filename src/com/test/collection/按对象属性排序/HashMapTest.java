package com.test.collection.按对象属性排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, User> users = new HashMap<>();
		users.put(1, new User("张三", 25));
		users.put(3, new User("李四", 22));
		users.put(2, new User("王五", 28));
		System.out.println("按属性排序前：" + users.toString());
		HashMap<Integer,User> sortHashMap = sortHashMap(users);
		System.out.println("按属性排序后：" + sortHashMap);
		/*
		  	控制台输出内容
		   	{1=User [name=张三, age=25], 2=User [name=王五, age=28], 3=User [name=李四, age=22]}
			{2=User [name=王五, age=28], 1=User [name=张三, age=25], 3=User [name=李四, age=22]}
			已知一个HashMap<Integer，User>集合， User有name（String）和age（int）属性。请写一个方法实现对HashMap的排序功能，该方法接收HashMap<Integer，User>为形参，
		返回类型为HashMap<Integer，User>，要求对HashMap中的User的age倒序进行排序。排序时key=value键值对不得拆散。
		tips ：要做出这道题必须对集合的体系结构非常的熟悉。HashMap本身就是不可排序的，但是该道题偏偏让给HashMap排序，那我们就得想在API中有没有这样的Map结构是有序的，
		但是有个LinkedHashMap，【它是Map结构+链表结构+有序的，更可喜的是他是HashMap的子类】，我们返回LinkedHashMap<Integer,User>即可，还符合面向接口（父类编程的思想）。
		但凡是对集合的操作，我们应该保持一个原则就是能用JDK中的API就有JDK中的API，比如排序算法我们不应该去用冒泡或者选择，而是首先想到用Collections集合工具类。
		 */
	}

	public static HashMap<Integer, User> sortHashMap(HashMap<Integer, User> map) {
		// 首先拿到map的键值对集合
		Set<Entry<Integer, User>> entrySet = map.entrySet();
		 
		List<Entry<Integer, User>> entryList = new ArrayList<Entry<Integer, User>>(entrySet);//set转List，为了使用工具类的排序方法
		Collections.sort(entryList, new Comparator<Entry<Integer, User>>() {// 使用Collections集合工具类对list进行排序，排序规则使用匿名内部类来实现
			@Override
			public int compare(Entry<Integer, User> o1, Entry<Integer, User> o2) {
				return o2.getValue().getAge() - o1.getValue().getAge();//根据User的age倒序
			}
		});
		LinkedHashMap<Integer, User> linkedHashMap = new LinkedHashMap<Integer, User>();//创建一个新的有序的HashMap子类的集合
		for(Entry<Integer, User> entry : entryList){//将List中的数据存储在LinkedHashMap中
			linkedHashMap.put(entry.getKey(), entry.getValue());
		}
		return linkedHashMap;
	}
		 

	
	
}