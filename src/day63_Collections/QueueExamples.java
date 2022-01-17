package day63_Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("one");
        queue.add("two");
        queue.add("asd");
        queue.add("mam");
        queue.add("bas");
        queue.add("ca");
        queue.add("zaz");

        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue);


        Queue<String> queue1 = new ArrayDeque<>();
        queue1.add("zero");
        queue1.add("one");
        queue1.add("two");
        queue1.add("three");
        queue1.add("four");
        System.out.println(queue1);

        System.out.println(queue1.element());
        System.out.println(queue1.peek());

        System.out.println(queue1.remove());
        System.out.println(queue1.poll());

        System.out.println(queue1);

    }


}
