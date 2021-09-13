package mycollections.queueexamples;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {

    public static void main(String[] args){

        PriorityQueue<String> pqStr = new PriorityQueue<String>();

        pqStr.add("b");
        pqStr.add("a");
        pqStr.add("c");

        System.out.println(pqStr);
        System.out.println("Top element from peek is: " + pqStr.peek());
        System.out.println("Size of the priority queue is: " + pqStr.size());
        while(pqStr.size()>0) {
            System.out.println(pqStr.poll());
        }
        System.out.println(pqStr.size());

    }

}
