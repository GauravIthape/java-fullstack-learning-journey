package core_java.day10_Collection_FrameWork;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list =
                new ArrayList<>();

        list.add(50);
        list.add(10);
        list.add(30);
        list.add(80);

        Collections.sort(list);

        System.out.println("Ascending : " + list);

        Collections.sort(list,
                (a,b) -> b-a);

        System.out.println("Descending : " + list);

        System.out.println(Collections.max(list));

        System.out.println(Collections.min(list));
    }
}