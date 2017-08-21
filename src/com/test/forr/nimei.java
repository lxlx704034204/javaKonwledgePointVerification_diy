package com.test.forr;

public class nimei {
	private Object oo = new Object();
	private int count; 
 //		System.out.println("bb:"+bb); 
	  
	private int j;
	public static void main(String[] args) {
		nimei abc =new nimei();
		
		new Thread( abc.new Run("D",4) ).start();
		new Thread( abc.new Run("C",3) ).start();
		new Thread( abc.new Run("B",2) ).start();
		new Thread( abc.new Run("A",1) ).start(); 
		
	}
	
	 class Run implements Runnable{
		private String name="";
		private int number;
		public Run(String name, int number) { 
			this.name = name;
			this.number = number;
		}
  
		@Override
		public void run() {
			synchronized (oo) { //同步
				while(true){
					if(count == number -1){ //count从0开始， number从1开始
						System.out.println("ThreadName:"+ name +",ThreadNumber:"+ this.number);
						count++;
						oo.notifyAll();
					}else{
						try {
							oo.wait(); // wait()属于Object的方法，它 必须需要 notifyAll()唤醒 才能执行线程！
						} catch (InterruptedException e) { 
							e.printStackTrace();
						}
						
					}
				}
			}
		}
		
	}
	 
	 
	 
	 
	 
	 
	 
//	//设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1
//	nimei tt=new nimei();  
//	 Inc inc=tt.new Inc(); 
//	 Dec dec=tt.new Dec();  
//	 for(int i=0;i<2;i++){  
//		 Thread t=new Thread(inc);  
//		 t.start(); 
//		 t=new Thread(dec);  
//		 t.start();  
//	 } 
	private synchronized void inc(){  
		  j++;  
		 System.out.println(Thread.currentThread().getName()+"-inc:"+j); 
	}
	private synchronized void dec(){
		  j--;  
		  System.out.println(Thread.currentThread().getName()+"-dec:"+j);  
	}
	class Inc implements Runnable{  
		public void run(){  
			for(int i=0;i<100;i++){  
				inc();  
			} 
		}  
	} 
	class Dec implements Runnable{
		public void run(){ 
			for(int i=0;i<100;i++){ 
				dec(); 
			} 
		}  
	}

	 
	
}
