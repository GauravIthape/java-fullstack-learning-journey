package core_java.day10_Collection_FrameWork;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> map =
                new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C");

        System.out.println(map);

        System.out.println(map.get(2));

        map.replace(3, "C++");

        System.out.println(map);

        map.remove(1);

        System.out.println(map);

        System.out.println(map.containsKey(2));

        System.out.println(map.containsValue("Python"));

        System.out.println(map.keySet());

        System.out.println(map.values());

        System.out.println(map.size());
    }
}
