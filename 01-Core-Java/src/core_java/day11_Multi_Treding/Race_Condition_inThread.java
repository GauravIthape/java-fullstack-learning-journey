package core_java.day11_Multi_Treding;

class Counter
{
	int count=0;
	public void increament()
	{
		count++;
	}
}

	public class Race_Condition_inThread {
		
		public static void main(String[] args) throws InterruptedException {
			
			Counter c=new Counter();
			
			Runnable obj1 =()->
			{
				for(int i=0;i<1000;i++)
				{
					c.increament();
				}
			};
			
			Runnable obj2 =()->
			{
				for(int j=0;j<1000;j++)
				{
					c.increament();
				}	
			};
			
			Thread t1=new Thread(obj1);
			Thread t2=new Thread(obj2);
			
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();
			
			System.out.println(c.count);
			
		}

	}