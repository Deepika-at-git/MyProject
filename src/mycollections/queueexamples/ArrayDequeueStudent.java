package mycollections.queueexamples;

import com.company.Student;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeueStudent {
    public static void main(String[] args){
        ArrayDeque<Student> as = new ArrayDeque<Student>();
        as.add(new Student(20,"Twenty"));
        as.add(new Student(10,"Ten"));
        as.add(new Student(40,"Fourty"));
        as.add(new Student(30,"Thirty"));

        Iterator itr = as.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("The first student which is removed " + as.removeFirst());
        System.out.println("Adding a new student " );
        as.addFirst(new Student(5,"Five"));
        itr = as.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        as.addLast(new Student(50,"Fifty"));
        System.out.println(as);
        System.out.println("First student is " + as.getFirst());

    }

}
