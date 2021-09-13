package mycollections.queueexamples;

import com.company.Student;

import java.util.PriorityQueue;

public class QueueStudent {
    public static void main(String[] args){
        PriorityQueue<Student> ps = new PriorityQueue<Student>();
        ps.add(new Student(5,"a"));
        ps.add(new Student(2,"b"));
        ps.add(new Student(4,"c"));
        ps.add(new Student(1,"d"));
        ps.add(new Student(3,"e"));
        System.out.println("List of Student is:");
        while(ps.size()>0){
            System.out.println(ps.poll());
        }

        System.out.println("The front element is: " + ps.peek());
        System.out.println("removing the top element: " + ps.poll());
        System.out.println("List of students after removing one: \n" + ps);
        ps.offer(new Student(6,"A"));
        System.out.println("New lis is: " + ps);
        System.out.println("Clearing the list" );
        ps.clear();
        System.out.println("Size of the prequeue now is " + ps.size());
    }

}
