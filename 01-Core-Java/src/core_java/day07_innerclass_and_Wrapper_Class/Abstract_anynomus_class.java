package core_java.day07_innerclass_and_Wrapper_Class;

abstract class main1
{
	abstract void show();
}
public class Abstract_anynomus_class {

	public static void main(String[] args) {
		main1 m1=new main1()
		{		
			public void show()
			{
				System.out.println("i am from anymous ");
			}
		};
		m1.show();

	    }
	
}
