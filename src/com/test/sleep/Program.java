package com.test.sleep;
 
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Handler;

import net.sf.json.JSONObject;

public class Program {
	private final static ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

	public static void main(String[] args) { 
		Program pro = new Program();
		 
//		 scheduler.scheduleAtFixedRate(new Runnable() {
//	            @Override
//	            public void run() {
////	                try {
//	                    int[] s = new int[1];
//	                    System.out.println("OK");
////	                    System.out.println(s[1]); // 数组越界
////	                } catch (Throwable t) {
////	                    System.out.println("Error");
////	                }
//
//	            }
//	        },
//	        
//	        0, 2, TimeUnit.MILLISECONDS); // TimeUnit.MILLISECONDS,   TimeUnit.SECONDS
			
/*			 
		Timer timer=new Timer();//实例化Timer类   
		timer.schedule(new TimerTask(){   
			public void run(){   
				System.out.println("退出");   
				this.cancel();
			}
		},	3000);//五百毫秒  
		
		
//		new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//            	System.out.println("退出");  
//            }
//        }, 3000);
		*/
		
		
//		String str1 = "[颜色=55, 网络=11, 内存=102]";
//		System.out.println(str1.replace("[","").replace("]","") );
//		String str2="我是一个人（中国人）aaa[真的]bbbb{确定}";
//		System.out.println(str2.replaceAll("\\(.*?\\)|\\{.*?}|\\[.*?]|（.*?）", "") );   
		
//		System.out.println("".replaceAll("^\"|\"$", "")); // 以\"开头  或  以\"结尾  
/*
一、行定位符（^和$） 
　　行定位符就是用来描述字串的边界。“^”表示行的开始；“$”表示行的结尾。如： 
　　^tm : 该表达式表示要匹配字串tm的开始位置是行头，如tm equal Tomorrow Moon就可以匹配 
　　tm$ : 该表达式表示要匹配字串tm的位置是行尾，Tomorrow Moon equal tm匹配。 
　　如果要匹配的字串可以出现在字符串的任意部分，那么可以直接   写成 ：tm
四、选择字符（|） 
 　　还有一种方法可以实现上面的匹配模式，就是使用选择字符（|）。该字符可以理解为“或”，如上例也可以写成 (T|t)(M|m)，该表达式的意思是以字母T或t开头，后面接一个字母M或m。 
　　使用“[]”和使用“|”的区别在于“[]”只能匹配单个字符，而“|”可以匹配任意长度的字串。如果不怕麻烦，上例还可以写为 ：TM|tm|Tm|tM
三、字符类（[ ]） 
　　正则表达式是区分大小写的，如果要忽略大小写可使用方括号表达式“[]”。只要匹配的字符出现在方括号内，即可表示匹配成功。但要注意：一个方括号只能匹配一个字符。例如，要匹配的字串tm不区分大小写，那么该表达式应该写作如下格式：[Tt][Mm]


*/
		
		//----------------------------			
//		//HashMap排序
//		HashMap<Integer, User> users = new HashMap<Integer, User>();
//		users.put(1, new User("张三", 25));
//		users.put(3, new User("李四", 22));
//		users.put(2, new User("王五", 28));
//		System.out.println("排序前："+users);
//		
//		System.out.println("排序后："+sortHashMap(users));
		
		 
//	    List<Integer> nums = new ArrayList<Integer>();  
//        nums.add(3); nums.add(5); nums.add(1);nums.add(0);  
//        System.out.println("排序前："+nums);  
//        Collections.sort(nums);  
//        System.out.println("升序排序后："+nums); 
//        Collections.reverse(nums);  
//        System.out.println("降序排序后："+nums);
		
		//----------------------------			
//		List<String> list = new ArrayList<String>();
//		list.add("11");
//		list.add("22");
//		System.out.println( listToString(list, "_") );
		
		//----------------------------			
//		StringBuffer sb = new StringBuffer(2048); 
//		System.out.println("test_1_: "+sb.length()); // 0 
//		if(sb == null ){ 
//			System.out.println("test_2: ");
//		}else if(sb.equals("")){
//			System.out.println("test_3: ");
//		} else if(sb != null ){
//			System.out.println("test_4: "+sb);		 //""
//		} else if(!sb.equals("")){
//			System.out.println("test_5: ");
//		} 
		
		//----------------------------			
//		int pageCount = 3;
//		int[] indexPoint=new int[]{pageCount};
//		System.out.println("test-indexPoint.length: "+ indexPoint.length);
//		for(int i=0;i<indexPoint.length;i++){
//			System.out.println("test-"+i +":"+indexPoint[i]);
//		}
		
		//----------------------------			
		//【j++ 和 ++j的本质区别：】
//        int m1, j1 = 5;
//        m1 = (j1++) ; 	// 此步运算[0  + (j1++)]结束后，j加1
//        System.out.println(m1 + " + " + j1); //5 + 6
//        
//        int m2, j2 = 5;
//        //		a	+	b	 +	c
//        m2 = (j2++) + (j2++) + (j2++); // 
//        System.out.println(m2 + " + " + j2);//18 + 8
////		++在参与运算时，在操作数后，先参与运算再自增；
////		因此,第一次运算[	  0  + (j2++) 即: (0 + 5) ]后：res1 = 5，   然后j2自增为6(即:b位置的(j2++)已经变为6 );
////		          第二次运算[res1  + (j2++) 即: (5 + 6) ]后：res2 = 11，然后j2自增为7(即:c位置的(j2++)已经变为7 );
////		          第三次运算[res2  + (j2++) 即: (6 + 7) ]后：res3 = 18，然后j2自增为8(即:如果下一步谁取j2的值的话它就是8了！！！ );
////		         此时							m2	=    res3 = 18;
//		
//        int m3, j3 = 5;
//        //		a	+	b	 +	c
//        m3 = (++j3) + (++j3) + (++j3);
//        System.out.println(m3 + " + " + j3); // 21 + 8
////      ++在前，先自增，再参与运算；
////	        因此,第一次自增后：	j3自增到6(即:a位置的(++j3)已经变为6 ), 然后开始第一次运算[	0  + (++j3) 即: (0  + 6) ]后：res1 = 6 ;
////	                  第二次自增后：	j3自增到7(即:b位置的(++j3)已经变为7 ),	然后开始第二次运算[res1  + (++j3) 即: (6  + 7) ]后：res2 = 13;
////	                  第三次自增后：	j3自增到8(即:c位置的(++j3)已经变为8 ),	然后开始第三次运算[res2  + (++j3) 即: (13 + 8) ]后：res3 = 21(即:如果下一步谁取j3的值的话它就是8了！！！ );
////	                 此时							m2	=    res3 = 18;

		//----------------------------			
//		User u = new User("n1",1);  
//		System.out.println(  SerializeTool.getObjectFromString("\"name\":\"n1\";\"age\":1", User.class) );
//		System.out.println(  SerializeTool.object2String(u) );//{\"name\":\"n1\";\"age\":1}
		
//		//list集合的序列化与反序列化： 
//		List<String> myAL = new ArrayList<String>();
//        myAL.add("aaaaaa! ");
//        myAL.add("bbbb-0");
//        System.out.println("我的ArrayList：" + myAL.get(0));
//        // 序列化使用的输出流
//        ObjectOutputStream OOS = null;
//        // 序列化后数据流给ByteArrayOutputStream 来保存。
//        // ByteArrayOutputStream 可转成字符串或字节数组
//        ByteArrayOutputStream BAOS = new ByteArrayOutputStream();
//        // ByteArrayInputStream 可接收一个字节数组 "byte[] "。供反序列化做参数
//        ByteArrayInputStream BAIS = null;
//        // 反序列化使用的输入流
//        ObjectInputStream OIS = null;
//        try {
//            // byte[] myb= "s ";
//            OOS = new ObjectOutputStream(BAOS);
//            OOS.writeObject(myAL);
//            byte[] abc = BAOS.toByteArray();
//            System.out.println("abc:"+abc);
//            String StrMySerializer = abc.toString();
//            System.out.println("序列化:" + StrMySerializer);
//            OOS.close();
//             
//            //反序列化
//            byte[] ddd = StrMySerializer.getBytes();
//            System.out.println("ddd:"+ddd);
//            BAIS = new ByteArrayInputStream(abc);
//            OIS = new ObjectInputStream(BAIS);
//            ArrayList c = (ArrayList) (OIS.readObject());
//            System.out.println("反序列化:" + c.get(0)+c.get(1));
//            OIS.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (Exception ex) {
//            System.out.println("序列化时产生错误 ");
//        }

//----------------------------			
//		int a1 = 1449842218;
//		 
//		long ttt = System.currentTimeMillis();
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//      String sd = sdf.format(new Date(Long.parseLong(String.valueOf(ttt))));   // 时间戳转换成时间
//      System.out.println(sd);
		
//		System.out.println(ttt-a1);
//		long time1=Long.parseLong(String.valueOf(System.currentTimeMillis()).toString().substring(0,10));
//		int time2=Integer.parseInt(String.valueOf(System.currentTimeMillis()).toString().substring(0,10));
//		System.out.println(time1);
//		System.out.println(time2);
//		
//		Integer.parseInt(ttt+"");
//		System.out.println(ttt);
//		System.out.println(Calendar.getInstance().getTimeInMillis());
//		System.out.println(new Date().getTime());
  
//		String str = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());// java 获取14位 时间戳
//		System.out.println(str );
//		
		 
//		System.out.println(Math.random()*9000 + 1000 ); //+ 1000
//		System.out.println( ((int)(Math.random()*(9999-1000+1))+1000) );
	
//----------------------------			
//		//cha[]初始化
//		String ss ="";
//		char[] cha;  
//		cha= ss.toCharArray();
//		System.out.println(cha.length);
		
//		int jjj = -1;
////		JSONObject jb = new JSONObject(); 	jb.put("pay_btn", 0); 
////		jb.put("pay_btn", 1);
//		Map mm = new HashMap();				mm.put("pay_btn", 0); 
//		mm.put("pay_btn", 1);
////		jjj = jb.getInt("pay_btn");
//		jjj = (int) mm.get("pay_btn");
//		
//		System.out.println(jjj);
		
//----------------------------	
//		/*
//		{
//		    "wifi":{
//		         
//		       "WiFi_2.4G_MAC_Filter_Num":1,
//		         
//		        "WiFi_2.4G_MAC_Filter":[
//		            {
//		                "mode":"2"
//		            },
//		            {
//		                "x_mac0":"58:44:98:7d:8a:fb"
//		            }
//		        ] 
//		    }
//		}
//
// 	 */
//	String json1 ="{ \"wifi\":{ \"WiFi_2.4G_MAC_Filter_Num\":1,  \"WiFi_2.4G_MAC_Filter\":[ {\"mode\":\"2\"}, {\"x_mac0\":\"58:44:98:7d:8a:fb\"} ]  } }";
//	String json2 ="{\"wifi\":11,\"password\":11}";	
////		JSONObject ob =JSONObject.fromObject(json);
//		JSONObject ob1 = null;
//		JSONObject ob2 = null;
// 
//		ob1 =JSONObject.fromObject(json1);
////		ob2 =JSONObject.fromObject(json2.toString());
//  
//		if(ob1.getJSONObject("wifi").has("WiFi_2.4G_MAC_Filter")) System.out.println("-★3-: ");	//即使"WiFi_2.4G_MAC_Filter"是个jsonArray，也可以判断！！！
//		if(ob1.getJSONObject("wifi").containsKey("WiFi_2.4G_MAC_Filter")) System.out.println("-★4-: ");
		
		//----------------------------		
		//"17/04/24, 10:39:52" --> "17/04/24 10:39:52"
//		String d1 = "17/04/24, 10:39:52";
//		System.out.println(d1.replace(",", "") );;
		
		//----------------------------	
//		String str1= "1";
//		int str2 = 2;
////		JSONObject jb = new JSONObject();
////		jb.put("str1", str1);
////		jb.put("str2", str2);
////		System.out.println(jb.toString());
//		
//		 String body = "{" + "FileID" + ":" + 16 + "," +
//                 "NWSTAT" + ":" +
//                 "{" + "\"quota_limit\"" + ":" + "\""+str1+"\"" + "}" + "}";
//		 //想要得到{"FileID":16,"NWSTAT":{"quota_limit":"1"}}，即使str1是String 也要在str1的两边加上双引号！
//		 JSONObject requestBody = JSONObject.fromObject(body);
//		System.out.println(requestBody.toString());
		
		//----------------------------	
//		List list = new ArrayList();
//		list.add("");
//		
//		if(list != null && list.size() !=0)  System.out.println("test-0-"); 
//		
//		if(list.get(0) == null) 	System.out.println("test-1-"); 
//		if("".equals(  list.get(0)) ) System.out.println("test-2-");  
//		
////		if(list == null) System.out.println("test-3-"); 
////		if(list == null) System.out.println("test-4-"); 
		
		//----------------------------	java list 交集 并集 差集 去重复并集
		List<String> list1 = new ArrayList<String>();
		   List<String> list2 = new ArrayList<String>();
		   list1.add("a1");
		   list1.add("a1");
		   list1.add("b1");
		   list1.add("c1");
		   list1.add("d1");
		   
		   list2.add("a2");
		   list2.add("a1");
		   list2.add("a1");
		   list2.add("b2");
		   list2.add("c2");
		   list2.add("d2");
		
		   	//交集：
//		   list1.retainAll(list2);// 有效的结果为 .的前者(后者有重复无影响！) ！	无去重的效果
//		
//		   System.out.print(list1);
		    
//		   Map<String,String> mm = new HashMap<String,String>();  
//		   mm.put("aa", "");
//		   if(null == mm)   System.out.print("way_1");
//		   if("".equals(mm))   System.out.print("way_2");
//		   if(mm.values() == null)   System.out.print("way_3");
//		   if(mm.size()<=0)   System.out.print("way_4"); 
		   
//		 //----------------------------文件操作：复制
//		try {  
//			File f1 = new File("d:/tr1/tr2");
//			File f2 = new File("c:/cp1/cp2");
//			if(!f1.exists())  f1.mkdirs(); if(!f2.exists())  f2.mkdirs();    
//			File file1 = new File(f1,"test.txt");//f1文件夹下创建 "test.txt"文件	"d:/tr1/tr2/test.txt"
//			File file2 = new File(f2,"copy.txt");//f2文件夹下创建 "copy.txt"文件
//			try {
//				if( file1.exists()) file1.delete();
//				if(!file1.exists()) file1.createNewFile();
//				if( file2.exists()) file2.delete();
//				if(!file2.exists()) file2.createNewFile();
//			} catch (IOException e) { System.out.println("--test-1-:"+e.toString()); }
//			
//			FileOutputStream out=new FileOutputStream(file1,true);     
//			for(int i=0;i<3;i++){
//	             StringBuffer sb=new StringBuffer();
//	             sb.append("这是第"+i+"行: 哈哈"+"\n");
//	             out.write(sb.toString().getBytes("utf-8"));
//	        }        
//	        out.close();
//	        
//	        Program pro = new Program();
//	        pro.CopyFile(file1, file2);
////			pro.CopyFile(new File(args[0]),new File(args[1]));
//	        System.out.println("--test-2-: finish" );
//		} catch (Exception e) {  System.out.println("--test-3-:"+e.toString()); } 
		   
		
		   
//		   //----------------------------try(return...)...catch(){}retrun...
//		   System.out.println(pro.setex_diy2(2)); 
		
		   
		   
		   
		
//		 //---------------------------
//	    System.out.println("input an integer: ");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        System.out.println("the factorial of "+n+" is "+Factorial(n));   
		   
//		macList.clear(); 
//		macList.add(0);
//		macList.add(2);
//		System.out.println("最终的res: "+ getMinimalMacId()+  ";   item: "+macList.size() );

	}// -----------main 末------------------------
 
	

	
	
	
	
	public  String setex_diy2(int i) {
        String a = null;
        try {
        	System.out.println("--1-: ");
            a = "a1";
            System.out.println("--1.1-: ");
            return a+i;
        } catch (Exception e) {
        	System.out.println("--2-: ");
         
        }
        return null;
  
    }
	
	public void CopyFile(File in, File out) throws Exception {      
		 FileInputStream fis  = new FileInputStream(in);       
		 FileOutputStream fos = new FileOutputStream(out);       
		 byte[] buf = new byte[1024];       
		 int i = 0;        
		 while((i=fis.read(buf))!=-1) { // 每1024、1024的  从硬盘中   读取到  内存
			fos.write(buf, 0, i);       // 每1024、1024的  从内存中   写入到  硬盘    直到写完为止
		 }       
		 fis.close();       
		 fos.close(); 
	}
	
	
	
	
	//4、	Java递归算法 计算阶乘
    public static long Factorial(int n) {
        if (n < 0) {
            System.out.println("无效输入，请重新输入！");
            return 0;
        } else if (n == 1 || n == 0) {
            return 1;
        } else
            return n * Factorial(n - 1);
    }
	
	
	
	static ArrayList<Integer> macList = new ArrayList<Integer>();
	 
	private static int getMinimalMacId() { 
		int i = 0;
        while (true) {
            if (!macList.contains(i)) { // 不包含的话 就break(跳出当前while循环了)了！ macList中的值也是从0开始递增的，
                macList.add(i);         // 加几次，i就自增几次，不管macList中的值重复与否
                break; //break了 就不走下面的 i++;了！！！
            }
            i++;	// 包含的话就忽略你：包含的话就 i++;继续往下循环，直到找到不包含的那个item 
            System.out.println("i++后打印："+ i );
        }
        return i;
	
	}
	
	
	
	
	
	
	
    public static String listToString(List list, String separator) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < list.size(); ++i) { // i++也行
            sb.append(list.get(i)).append(separator);
        }

        return separator.equals("")?sb.toString():sb.toString().substring(0, sb.toString().length() - 1);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static HashMap<Integer, User> sortHashMap( HashMap<Integer, User> map){
		// 首先拿到map的键值对集合
		Set<Entry<Integer, User>> entrySet = map.entrySet();
		// 将set集合转为List集合，为什么，为了使用工具类的排序方法
		List<Entry<Integer, User>> list = new ArrayList<Entry<Integer, User>>(entrySet);
		// 使用Collections集合工具类对list进行排序，排序规则使用匿名内部类来实现
		Collections.sort(list, new Comparator<Entry<Integer, User>>() {
			@Override
			public int compare(Entry<Integer, User> o1, Entry<Integer, User> o2) {
				//按照要求根据User的age的倒序进行排
				return o2.getValue().getAge() - o1.getValue().getAge(); //按照user的age倒序排列
			}
		});
		//创建一个新的有序的HashMap子类的集合
		LinkedHashMap<Integer, User> linkedHashMap = new LinkedHashMap<Integer, User>();
		//将List中的数据存储在LinkedHashMap中
		for (Entry<Integer,User> entry : list) {
			linkedHashMap.put(entry.getKey(), entry.getValue());
		}
		//返回结果
		return linkedHashMap;
	}
	
	
	 
	
	//替代 JDK8的 map.getOrDefault()方法： 
	public Set<String> replace_getOrDefault(Map< Class<?>, Set<String> > map, Class<?> type ){	//检查一个map中匹配提供键的值是否找到，没找到匹配项就使用一个默认值
    	Set<String> set = null; 
    	if(map.containsKey(type)){
    		if(map.get(type) == null){
    			set = new HashSet<String>();
    		}else{
    			set = map.get(type);
    		}
    	}else{
    		set = new HashSet<String>();
    	} 
    	return set;
    }
}
