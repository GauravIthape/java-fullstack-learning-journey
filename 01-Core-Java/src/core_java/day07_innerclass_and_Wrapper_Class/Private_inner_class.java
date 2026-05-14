package core_java.day07_innerclass_and_Wrapper_Class;

class outer
{
	int x=10;
	private class inner // when inner class declare as private it cannot acces outer data
	{
	int y=2;
	}
}
public class Private_inner_class {

	public static void main(String[] args) {
		outer o1=new outer();
	//	outer.inner i1=o1.new inner(); 
		System.out.println(o1.x);
	//	System.out.println(i1.y);

	}

}

//Unlike a "regular" class, 
//an inner class can be private or protected. If you don't want outside objects to access the inner class, declare the class as private:
