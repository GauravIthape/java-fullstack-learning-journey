package core_java.day10_Collection_FrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Methods {

    public static void main(String[] args) {

        ArrayList<String> list =
                new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");

        Iterator<String> it =
                list.iterator();

        while(it.hasNext())
        {
            String s = it.next();

            if(s.equals("C"))
            {
                it.remove();
            }

            System.out.println(s);
        }

        System.out.println(list);
    }
}