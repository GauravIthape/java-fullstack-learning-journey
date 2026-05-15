package day_08_String_handling;

public class String_buffer_method {
	public static void main(String ar[])
	{
		StringBuffer s1=new StringBuffer();
		s1.append("java");
		s1.insert(0, "core");
		System.out.println("before replace methhod methods output =>"+s1);
		s1.replace(0, 3,"Smart");
		s1.reverse();
		
		System.out.println("string buffer =>"+s1);
	}
}
