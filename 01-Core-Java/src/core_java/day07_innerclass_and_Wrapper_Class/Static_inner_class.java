package core_java.day07_innerclass_and_Wrapper_Class;

class out
{
	void show()
	{
		System.out.println("this is outer show method");
	}
	static class inner
	{
		void display()
		{
			System.out.println("this is inner class dispaly method");
		}
	}
}

public class Static_inner_class {

	public static void main(String[] args) {
		//non static class access
		out o=new out();
		o.show();
		
;		out.inner o1=new out.inner();
		//o1.show();  it can not acces non static class method
		o1.display();
	}

}
