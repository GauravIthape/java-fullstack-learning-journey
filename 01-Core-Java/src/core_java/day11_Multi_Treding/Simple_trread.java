package core_java.day11_Multi_Treding;

class A extends Thread
{
	public void run()
	{
	for(int i=0;i<50;i++)
	{
		System.out.println("hi");
	}
	}
}

class B extends Thread
{
	public void run()
	{
	for(int j=0;j<40;j++)
	{
		System.out.println("hello");
	}
	}
}


public class Simple_trread {
	
	public static void main(String[] args) {
		
		A a1=new A();
		B b1=new B();
		 a1.start();
		 b1.start();
		
	}

}
