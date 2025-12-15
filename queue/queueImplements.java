package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class queueImplements {
    public static void main(String[] args) {

        // Using LinkedList
        Queue<Integer> ql  = new LinkedList<>();

        System.out.println("Using LinkedList");
        ql.offer(10);
        ql.offer(20);
        ql.offer(30);
        System.out.println(ql.peek());
        System.out.println(ql.poll());
        System.out.println(ql.peek());


        // Using Array
        Queue<Integer> qa = new ArrayDeque<>();

        System.out.println("Using Array");
        qa.offer(10);
        qa.offer(20);
        qa.offer(30);

        System.out.println(qa.peek());
        System.out.println(qa.poll());
        System.out.println(qa.peek());
    }
}
