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
////	                    System.out.println(s[1]); // ����Խ��
////	                } catch (Throwable t) {
////	                    System.out.println("Error");
////	                }
//
//	            }
//	        },
//	        
//	        0, 2, TimeUnit.MILLISECONDS); // TimeUnit.MILLISECONDS,   TimeUnit.SECONDS
			
/*			 
		Timer timer=new Timer();//ʵ����Timer��   
		timer.schedule(new TimerTask(){   
			public void run(){   
				System.out.println("�˳�");   
				this.cancel();
			}
		},	3000);//��ٺ���  
		
		
//		new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//            	System.out.println("�˳�");  
//            }
//        }, 3000);
		*/
		
		
//		String str1 = "[��ɫ=55, ����=11, �ڴ�=102]";
//		System.out.println(str1.replace("[","").replace("]","") );
//		String str2="����һ���ˣ��й��ˣ�aaa[���]bbbb{ȷ��}";
//		System.out.println(str2.replaceAll("\\(.*?\\)|\\{.*?}|\\[.*?]|��.*?��", "") );   
		
//		System.out.println("".replaceAll("^\"|\"$", "")); // ��\"��ͷ  ��  ��\"��β  
/*
һ���ж�λ����^��$�� 
�����ж�λ���������������ִ��ı߽硣��^����ʾ�еĿ�ʼ����$����ʾ�еĽ�β���磺 
����^tm : �ñ��ʽ��ʾҪƥ���ִ�tm�Ŀ�ʼλ������ͷ����tm equal Tomorrow Moon�Ϳ���ƥ�� 
����tm$ : �ñ��ʽ��ʾҪƥ���ִ�tm��λ������β��Tomorrow Moon equal tmƥ�䡣 
�������Ҫƥ����ִ����Գ������ַ��������ⲿ�֣���ô����ֱ��   д�� ��tm
�ġ�ѡ���ַ���|�� 
 ��������һ�ַ�������ʵ�������ƥ��ģʽ������ʹ��ѡ���ַ���|�������ַ��������Ϊ���򡱣�������Ҳ����д�� (T|t)(M|m)���ñ��ʽ����˼������ĸT��t��ͷ�������һ����ĸM��m�� 
����ʹ�á�[]����ʹ�á�|�����������ڡ�[]��ֻ��ƥ�䵥���ַ�������|������ƥ�����ⳤ�ȵ��ִ�����������鷳������������дΪ ��TM|tm|Tm|tM
�����ַ��ࣨ[ ]�� 
����������ʽ�����ִ�Сд�ģ����Ҫ���Դ�Сд��ʹ�÷����ű��ʽ��[]����ֻҪƥ����ַ������ڷ������ڣ����ɱ�ʾƥ��ɹ�����Ҫע�⣺һ��������ֻ��ƥ��һ���ַ������磬Ҫƥ����ִ�tm�����ִ�Сд����ô�ñ��ʽӦ��д�����¸�ʽ��[Tt][Mm]


*/
		
		//----------------------------			
//		//HashMap����
//		HashMap<Integer, User> users = new HashMap<Integer, User>();
//		users.put(1, new User("����", 25));
//		users.put(3, new User("����", 22));
//		users.put(2, new User("����", 28));
//		System.out.println("����ǰ��"+users);
//		
//		System.out.println("�����"+sortHashMap(users));
		
		 
//	    List<Integer> nums = new ArrayList<Integer>();  
//        nums.add(3); nums.add(5); nums.add(1);nums.add(0);  
//        System.out.println("����ǰ��"+nums);  
//        Collections.sort(nums);  
//        System.out.println("���������"+nums); 
//        Collections.reverse(nums);  
//        System.out.println("���������"+nums);
		
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
		//��j++ �� ++j�ı������𣺡�
//        int m1, j1 = 5;
//        m1 = (j1++) ; 	// �˲�����[0  + (j1++)]������j��1
//        System.out.println(m1 + " + " + j1); //5 + 6
//        
//        int m2, j2 = 5;
//        //		a	+	b	 +	c
//        m2 = (j2++) + (j2++) + (j2++); // 
//        System.out.println(m2 + " + " + j2);//18 + 8
////		++�ڲ�������ʱ���ڲ��������Ȳ���������������
////		���,��һ������[	  0  + (j2++) ��: (0 + 5) ]��res1 = 5��   Ȼ��j2����Ϊ6(��:bλ�õ�(j2++)�Ѿ���Ϊ6 );
////		          �ڶ�������[res1  + (j2++) ��: (5 + 6) ]��res2 = 11��Ȼ��j2����Ϊ7(��:cλ�õ�(j2++)�Ѿ���Ϊ7 );
////		          ����������[res2  + (j2++) ��: (6 + 7) ]��res3 = 18��Ȼ��j2����Ϊ8(��:�����һ��˭ȡj2��ֵ�Ļ�������8�ˣ����� );
////		         ��ʱ							m2	=    res3 = 18;
//		
//        int m3, j3 = 5;
//        //		a	+	b	 +	c
//        m3 = (++j3) + (++j3) + (++j3);
//        System.out.println(m3 + " + " + j3); // 21 + 8
////      ++��ǰ�����������ٲ������㣻
////	        ���,��һ��������	j3������6(��:aλ�õ�(++j3)�Ѿ���Ϊ6 ), Ȼ��ʼ��һ������[	0  + (++j3) ��: (0  + 6) ]��res1 = 6 ;
////	                  �ڶ���������	j3������7(��:bλ�õ�(++j3)�Ѿ���Ϊ7 ),	Ȼ��ʼ�ڶ�������[res1  + (++j3) ��: (6  + 7) ]��res2 = 13;
////	                  ������������	j3������8(��:cλ�õ�(++j3)�Ѿ���Ϊ8 ),	Ȼ��ʼ����������[res2  + (++j3) ��: (13 + 8) ]��res3 = 21(��:�����һ��˭ȡj3��ֵ�Ļ�������8�ˣ����� );
////	                 ��ʱ							m2	=    res3 = 18;

		//----------------------------			
//		User u = new User("n1",1);  
//		System.out.println(  SerializeTool.getObjectFromString("\"name\":\"n1\";\"age\":1", User.class) );
//		System.out.println(  SerializeTool.object2String(u) );//{\"name\":\"n1\";\"age\":1}
		
//		//list���ϵ����л��뷴���л��� 
//		List<String> myAL = new ArrayList<String>();
//        myAL.add("aaaaaa! ");
//        myAL.add("bbbb-0");
//        System.out.println("�ҵ�ArrayList��" + myAL.get(0));
//        // ���л�ʹ�õ������
//        ObjectOutputStream OOS = null;
//        // ���л�����������ByteArrayOutputStream �����档
//        // ByteArrayOutputStream ��ת���ַ������ֽ�����
//        ByteArrayOutputStream BAOS = new ByteArrayOutputStream();
//        // ByteArrayInputStream �ɽ���һ���ֽ����� "byte[] "���������л�������
//        ByteArrayInputStream BAIS = null;
//        // �����л�ʹ�õ�������
//        ObjectInputStream OIS = null;
//        try {
//            // byte[] myb= "s ";
//            OOS = new ObjectOutputStream(BAOS);
//            OOS.writeObject(myAL);
//            byte[] abc = BAOS.toByteArray();
//            System.out.println("abc:"+abc);
//            String StrMySerializer = abc.toString();
//            System.out.println("���л�:" + StrMySerializer);
//            OOS.close();
//             
//            //�����л�
//            byte[] ddd = StrMySerializer.getBytes();
//            System.out.println("ddd:"+ddd);
//            BAIS = new ByteArrayInputStream(abc);
//            OIS = new ObjectInputStream(BAIS);
//            ArrayList c = (ArrayList) (OIS.readObject());
//            System.out.println("�����л�:" + c.get(0)+c.get(1));
//            OIS.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (Exception ex) {
//            System.out.println("���л�ʱ�������� ");
//        }

//----------------------------			
//		int a1 = 1449842218;
//		 
//		long ttt = System.currentTimeMillis();
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//      String sd = sdf.format(new Date(Long.parseLong(String.valueOf(ttt))));   // ʱ���ת����ʱ��
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
  
//		String str = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());// java ��ȡ14λ ʱ���
//		System.out.println(str );
//		
		 
//		System.out.println(Math.random()*9000 + 1000 ); //+ 1000
//		System.out.println( ((int)(Math.random()*(9999-1000+1))+1000) );
	
//----------------------------			
//		//cha[]��ʼ��
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
//		if(ob1.getJSONObject("wifi").has("WiFi_2.4G_MAC_Filter")) System.out.println("-��3-: ");	//��ʹ"WiFi_2.4G_MAC_Filter"�Ǹ�jsonArray��Ҳ�����жϣ�����
//		if(ob1.getJSONObject("wifi").containsKey("WiFi_2.4G_MAC_Filter")) System.out.println("-��4-: ");
		
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
//		 //��Ҫ�õ�{"FileID":16,"NWSTAT":{"quota_limit":"1"}}����ʹstr1��String ҲҪ��str1�����߼���˫���ţ�
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
		
		//----------------------------	java list ���� ���� � ȥ�ظ�����
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
		
		   	//������
//		   list1.retainAll(list2);// ��Ч�Ľ��Ϊ .��ǰ��(�������ظ���Ӱ�죡) ��	��ȥ�ص�Ч��
//		
//		   System.out.print(list1);
		    
//		   Map<String,String> mm = new HashMap<String,String>();  
//		   mm.put("aa", "");
//		   if(null == mm)   System.out.print("way_1");
//		   if("".equals(mm))   System.out.print("way_2");
//		   if(mm.values() == null)   System.out.print("way_3");
//		   if(mm.size()<=0)   System.out.print("way_4"); 
		   
//		 //----------------------------�ļ�����������
//		try {  
//			File f1 = new File("d:/tr1/tr2");
//			File f2 = new File("c:/cp1/cp2");
//			if(!f1.exists())  f1.mkdirs(); if(!f2.exists())  f2.mkdirs();    
//			File file1 = new File(f1,"test.txt");//f1�ļ����´��� "test.txt"�ļ�	"d:/tr1/tr2/test.txt"
//			File file2 = new File(f2,"copy.txt");//f2�ļ����´��� "copy.txt"�ļ�
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
//	             sb.append("���ǵ�"+i+"��: ����"+"\n");
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
//		System.out.println("���յ�res: "+ getMinimalMacId()+  ";   item: "+macList.size() );

	}// -----------main ĩ------------------------
 
	

	
	
	
	
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
		 while((i=fis.read(buf))!=-1) { // ÿ1024��1024��  ��Ӳ����   ��ȡ��  �ڴ�
			fos.write(buf, 0, i);       // ÿ1024��1024��  ���ڴ���   д�뵽  Ӳ��    ֱ��д��Ϊֹ
		 }       
		 fis.close();       
		 fos.close(); 
	}
	
	
	
	
	//4��	Java�ݹ��㷨 ����׳�
    public static long Factorial(int n) {
        if (n < 0) {
            System.out.println("��Ч���룬���������룡");
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
            if (!macList.contains(i)) { // �������Ļ� ��break(������ǰwhileѭ����)�ˣ� macList�е�ֵҲ�Ǵ�0��ʼ�����ģ�
                macList.add(i);         // �Ӽ��Σ�i���������Σ�����macList�е�ֵ�ظ����
                break; //break�� �Ͳ�������� i++;�ˣ�����
            }
            i++;	// �����Ļ��ͺ����㣺�����Ļ��� i++;��������ѭ����ֱ���ҵ����������Ǹ�item 
            System.out.println("i++���ӡ��"+ i );
        }
        return i;
	
	}
	
	
	
	
	
	
	
    public static String listToString(List list, String separator) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < list.size(); ++i) { // i++Ҳ��
            sb.append(list.get(i)).append(separator);
        }

        return separator.equals("")?sb.toString():sb.toString().substring(0, sb.toString().length() - 1);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static HashMap<Integer, User> sortHashMap( HashMap<Integer, User> map){
		// �����õ�map�ļ�ֵ�Լ���
		Set<Entry<Integer, User>> entrySet = map.entrySet();
		// ��set����תΪList���ϣ�Ϊʲô��Ϊ��ʹ�ù���������򷽷�
		List<Entry<Integer, User>> list = new ArrayList<Entry<Integer, User>>(entrySet);
		// ʹ��Collections���Ϲ������list���������������ʹ�������ڲ�����ʵ��
		Collections.sort(list, new Comparator<Entry<Integer, User>>() {
			@Override
			public int compare(Entry<Integer, User> o1, Entry<Integer, User> o2) {
				//����Ҫ�����User��age�ĵ��������
				return o2.getValue().getAge() - o1.getValue().getAge(); //����user��age��������
			}
		});
		//����һ���µ������HashMap����ļ���
		LinkedHashMap<Integer, User> linkedHashMap = new LinkedHashMap<Integer, User>();
		//��List�е����ݴ洢��LinkedHashMap��
		for (Entry<Integer,User> entry : list) {
			linkedHashMap.put(entry.getKey(), entry.getValue());
		}
		//���ؽ��
		return linkedHashMap;
	}
	
	
	 
	
	//��� JDK8�� map.getOrDefault()������ 
	public Set<String> replace_getOrDefault(Map< Class<?>, Set<String> > map, Class<?> type ){	//���һ��map��ƥ���ṩ����ֵ�Ƿ��ҵ���û�ҵ�ƥ�����ʹ��һ��Ĭ��ֵ
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
