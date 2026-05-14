package core_java.day07_innerclass_and_Wrapper_Class;
class OuterClass {
	  int x = 10;

	  class InnerClass {
	    int y = 5;
	  }
	}

	public class InnerClassDemo {
	  public static void main(String[] args) {
	    OuterClass myOuter = new OuterClass();
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.y + myOuter.x);
	  }
	}

	