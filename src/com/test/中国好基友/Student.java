package com.test.�й��û���;
import com.test.�й��û���.GayFriend.iDoHomeWorkListener;
//http://blog.sina.com.cn/s/blog_8417aea801010aj1.html
public class Student implements iDoHomeWorkListener{ //��ͨ��implements���Ѷ����(���԰����д��ҵ��)����ӿڣ������һ������ġ��ҡ� ������doHomeWork
	//Student�Լ�������1  			����	 ,    ����
	public void ask(final String question, final GayFriend gay) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				// ���ѻش������������getAnswer��...��
				gay.getAnswer(question, Student.this); //if �����������  �ȴ�����ʱ������� answerʱ  ���ûص����� ֪ͨ�������ߡ� 
				//��ͨ��implements���Ѷ����(���԰����д��ҵ��)����ӿڣ������һ������ġ���(Student.this)�� ������doHomeWork		
			}
		}).start();
		goHome();//Student�Լ�������1����ҵ�������ˣ�student�������κ��£�����
	}
    //Student�Լ�������1 
	public void goHome() {
		System.out.println("��ҵ�������ˣ��û��ѣ��һؼ�������(����)������������^.^��");
	}

	
	@Override //implements ����interface�� ���صķ���
	public void answerAbstractFunction(String question, String answer) {
		System.out.println("��ҵ��");
		if (answer != null) {
			System.out.println("��ҵ��" + question + " �𰸣�" + answer);
		} else {
			System.out.println("��ҵ��" + question + " �𰸣�" + "(�հ�)");
		}
	}
	
	//����run���
	public static void main(String[] args) {
		String question = "��x������0��sin(x)/x =?";
		Student student = new Student();
		student.ask(question, new GayFriend());	// student������2�� ask(...)
		//             ����	 ,  ����
	}
	
}
