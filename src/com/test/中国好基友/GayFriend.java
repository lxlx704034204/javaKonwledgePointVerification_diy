package com.test.�й��û���;

import java.util.concurrent.TimeUnit;

public class GayFriend {
	public void getAnswer(String question, iDoHomeWorkListener someone) {
		System.out.println("˼����");	//˼��3��
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if ("��x������0��sin(x)/x =?".equals(question)) {
			someone.answerAbstractFunction(question, "1");
			//		  ��绰��֪(�ص�)  ����	   ��
		} else {
			someone.answerAbstractFunction(question, null);
			//		     ��绰��֪(�ص�)  ����	   ��
		}
	}
	
	//gayfriend ����Ŀ��԰��� д��ҵ�� ����interface
	public interface iDoHomeWorkListener {
		public void answerAbstractFunction(String question, String answer);
		//			��绰��֪(�ص�)        				����		         ��
	}
	
}
