package core_java.day07_innerclass_and_Wrapper_Class;

class main
{
	void show()
	{
		System.out.println("this is main class method");
	}
}

public class Anonymous_class {
	public static void main(String ar[])
	{
	main obj =new main()
	{
		public void show()	
		{
			System.out.println("this is anyomous classs method");
		}
	};
	obj.show();

}
}
