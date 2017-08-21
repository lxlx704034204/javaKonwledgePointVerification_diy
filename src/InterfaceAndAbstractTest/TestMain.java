package InterfaceAndAbstractTest;

public class TestMain extends AbsFly implements ICar{

	@Override//来源于extends:儿子必须重写抽象类中 未实现的 方法
	public void stop() {System.out.println("TestMain stop");}
	
	@Override//这个是手动添加的！
	public void start() {System.out.println("TestMain start");}
	
	public static void main(String arg[]){
		TestMain tm = new TestMain();
//		tm.start();
//		tm.stop();
		 
	}

	
	
	
	
	
}
