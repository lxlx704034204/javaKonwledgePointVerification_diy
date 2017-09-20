package com.test.thread.中国好基友;

import java.util.concurrent.TimeUnit;

public class GayFriend {
	public void getAnswer(String question, iDoHomeWorkListener someone) {
		System.out.println("思考：");	//思考3秒
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if ("当x趋向于0，sin(x)/x =?".equals(question)) {
			someone.answerAbstractFunction(question, "1");
			//		  打电话告知(回调)  问题	   答案
		} else {
			someone.answerAbstractFunction(question, null);
			//		     打电话告知(回调)  问题	   答案
		}
	}
	
	//gayfriend 定义的可以帮我 写作业的 监听interface
	public interface iDoHomeWorkListener {
		public void answerAbstractFunction(String question, String answer);
		//			打电话告知(回调)        				问题		         答案
	}

}