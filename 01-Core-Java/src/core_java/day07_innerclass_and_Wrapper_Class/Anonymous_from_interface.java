package core_java.day07_innerclass_and_Wrapper_Class;

interface Greeting {
void sayHello();
}

public class Anonymous_from_interface {
	public static void main(String[] args) {
		 // Anonymous class that implements Greeting
		 Greeting greet = new Greeting() {
		   public void sayHello() {
		     System.out.println("Hello, World!");
		   }
		 };

		 greet.sayHello();
	}
}


