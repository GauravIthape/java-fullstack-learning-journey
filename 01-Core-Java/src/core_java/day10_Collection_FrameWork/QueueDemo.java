package core_java.day10_Collection_FrameWork;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q);

        System.out.println(q.peek());

        System.out.println(q.poll());

        System.out.println(q);

        System.out.println(q.size());

        System.out.println(q.contains(20));
    }
}