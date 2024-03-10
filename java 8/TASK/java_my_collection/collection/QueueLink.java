package java_my_collection.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// offer - for adding elements
// poll - for remove element and also return the value which will romove
// pick - its watching second element for first line
// comparator.reverse -> use for priority queue -> reverse the heap defalut value which is min heap
public class QueueLink {

    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<>();

        q1.offer("sachin");
        q1.offer("soni");
        q1.offer("manan");
        System.out.println(q1);
//        q1.poll();
//        System.out.println(q1.poll());
        System.out.println(q1);
        System.out.println(q1.peek());
        System.out.println(q1.offer("hey")); // return true false
        System.out.println(q1);
    }
}
