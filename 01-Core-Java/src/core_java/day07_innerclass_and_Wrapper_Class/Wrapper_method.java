package core_java.day07_innerclass_and_Wrapper_Class;

public class Wrapper_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // valueOf()
        Integer obj = Integer.valueOf("100");

        // parseInt()
        int x = Integer.parseInt("50");

        // toString()
        String s = obj.toString();

        // intValue()
        int y = obj.intValue();

        // compareTo()
        System.out.println(obj.compareTo(100));

        // equals()
        System.out.println(obj.equals(100));

        // max(), min(), sum()
        System.out.println(Integer.max(10, 20));
        System.out.println(Integer.min(10, 20));
        System.out.println(Integer.sum(10, 20));

        // Character methods
        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.toUpperCase('a'));

        // Output
        System.out.println(obj);
        System.out.println(x);
        System.out.println(s);
        System.out.println(y);
	}

}

