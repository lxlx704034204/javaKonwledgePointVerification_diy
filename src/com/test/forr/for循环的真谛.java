package com.test.forr;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class forѭ�������� {
 
	static boolean foo(char c){
		System.out.print(c + "\t");
		return true;		
	}
	
/*
	1.��ʵfoo('A');���ǳ�ʼ��(����)��ֻ��ִ��һ�Σ����Ե�һ����ӡ�Ŀ϶���Aλ��
	2.��Ϊi=0;
		ѭ��������i<2 ���ɴ˿�֪ѭ��i����2��ʱ��ͻ�ֹͣѭ����)����0<2�������������Ż����Bλ�ã�
		Ȼ��ִ��i++;i�ͱ��1�ˣ�
		�����Dλ�ã�����������Bλ��,��ֱ�����Dλ��, �����꣬Ȼ��j++(++�ں��� ��ʾ������ �ټ�1)�� <�ɲ��� ������for(int j=0; j<list1.size(); j++){...}>
		��������Cλ�ã� 
		һ��ѭ����Ľ��(λ��ִ��˳��)�ǣ�ABDC
	3.�ڶ���ѭ���Ŀ�ʼ��foo('A');�ǳ�ʼ�������Բ���ִ�У�
		soֱ�Ӵ�foo('B')��ʼ�����Bλ�� (��ǰiΪ1����С��2)��
		��ʱѭ�������ٴ�ִ��i++, i��ֵΪ2�ˣ�
		�ٴ����Dλ�ã�
		������Cλ�� 
		�ڶ���ѭ���Ľ��(λ��ִ��˳��)�ǣ�BDC
	4.Ȼ��ѭ���ٴ�ִ��for(foo('A');foo('B')&&(i<2);foo('C'))
		ֱ�����Bλ�ã����B����ֹ(i��ֵ�ڵڶ���ѭ�����ֵ�����2��2<2����������ֹѭ��)��
		
		A	B	D	C	B	D	C	B
		 
//		 List<String> list1 = new ArrayList<String>();
//		 list1.add("��0"); list1.add("��1"); list1.add("��2");  
// 		       A			B		   C
//		 for(int j=0; j<list1.size(); j++){ // ++�ں��� ��ʾ������ �ټ�1
//						D
//			 System.out.println(list1.get(j));  //����������B,��ֱ�����D, �����꣬Ȼ��j++(++�ں��� ��ʾ������ �ټ�1)��
//		 }
  
*/
	public static void main(String[] args) {	//	for(int j=0; j<length; j++){ }
		 int i = 0;
		 //��ʵ���ľ���for (��ʼ�����; �ж�����; ѭ������) 
		 for( foo('A'); foo('B') && (i < 2); foo('C') ){
			 i++; 		//�˴����ֹ����i++, �����޷�ѭ����ȥ�� ��ʵ���� ��ģ�ⳣ����forѭ���� 'C' λ�� ������
			 foo('D');
		 }
		 
		 
		 
//		 // ��int��ʽ�� String[]���� ת��Ϊ �Զ��Ÿ����� ����  ����1��
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
		  
	 
//		// ��int��ʽ�� String[]���� ת��Ϊ �Զ��Ÿ����� ����  ����2��	 
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
//// 					���ְ취 ����					
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
