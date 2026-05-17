package core_java.day10_Collection_FrameWork;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");

        System.out.println(list);

        list.add(1, "HTML");

        System.out.println(list);

        System.out.println(list.get(2));

        list.set(0, "Core Java");

        System.out.println(list);

        list.remove("C");

        System.out.println(list);

        System.out.println(list.contains("Python"));

        System.out.println(list.size());

        list.clear();

        System.out.println(list);
    }
}