package com.test.中国好基友;
import com.test.中国好基友.GayFriend.iDoHomeWorkListener;
//http://blog.sina.com.cn/s/blog_8417aea801010aj1.html
public class Student implements iDoHomeWorkListener{ //我通过implements基友定义的(可以帮别人写作业的)这个接口，创造出一个虚拟的“我” 来替我doHomeWork
	//Student自己的能力1  			问题	 ,    室友
	public void ask(final String question, final GayFriend gay) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				// 舍友回答问题的能力：getAnswer（...）
				gay.getAnswer(question, Student.this); //if 给出了问题后  等待若干时间后有了 answer时  就用回调函数 通知‘发问者’ 
				//我通过implements基友定义的(可以帮别人写作业的)这个接口，创造出一个虚拟的“我(Student.this)” 来替我doHomeWork		
			}
		}).start();
		goHome();//Student自己的能力1：作业交给你了，student可以做任何事，解耦
	}
    //Student自己的能力1 
	public void goHome() {
		System.out.println("作业交给你了，好基友，我回家了玩游(解耦)啦……美滋滋^.^。");
	}

	
	@Override //implements 监听interface后 重载的方法
	public void answerAbstractFunction(String question, String answer) {
		System.out.println("作业本");
		if (answer != null) {
			System.out.println("作业：" + question + " 答案：" + answer);
		} else {
			System.out.println("作业：" + question + " 答案：" + "(空白)");
		}
	}
	
	//程序run入口
	public static void main(String[] args) {
		String question = "当x趋向于0，sin(x)/x =?";
		Student student = new Student();
		student.ask(question, new GayFriend());	// student的能力2： ask(...)
		//             问题	 ,  室友
	}
	
}
