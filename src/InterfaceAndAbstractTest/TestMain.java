package InterfaceAndAbstractTest;

public class TestMain extends AbsFly implements ICar{

	@Override//��Դ��extends:���ӱ�����д�������� δʵ�ֵ� ����
	public void stop() {System.out.println("TestMain stop");}
	
	@Override//������ֶ���ӵģ�
	public void start() {System.out.println("TestMain start");}
	
	public static void main(String arg[]){
		TestMain tm = new TestMain();
//		tm.start();
//		tm.stop();
		 
	}

	
	
	
	
	
}
