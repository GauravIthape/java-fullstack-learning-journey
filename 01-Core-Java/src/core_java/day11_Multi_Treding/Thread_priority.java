

package core_java.day11_Multi_Treding;

class C extends Thread
{
	public void run()
	{
	for(int i=0;i<50;i++)
	{
		System.out.println("hi");
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
}

class D extends Thread
{
	public void run()
	{
	for(int j=0;j<40;j++)
	{
		System.out.println("hello");
	}
	}
}


public class Thread_priority {
	
	public static void main(String[] args) {
		
		C a1=new C();
		D b1=new D();
		 a1.setPriority(Thread.MAX_PRIORITY); // 10
	     b1.setPriority(Thread.MIN_PRIORITY); // 1
		 a1.start();
		 b1.start();
		
	}

}