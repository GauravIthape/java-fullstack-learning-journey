package core_java.day11_Multi_Treding;

public class Runnable_thread {
	
	public static void main(String[] args) {
		
		;
		
		Runnable obj1 =()->
		{
			for(int i=0;i<7;i++)
			{
				System.out.println("hi");
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable obj2 =()->
		{
			for(int j=0;j<5;j++)
			{
				System.out.println("hello");
			}	
		};
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();
		t2.start();
		
	}

}