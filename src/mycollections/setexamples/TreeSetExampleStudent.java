package mycollections.setexamples;

import com.company.Student;
import com.sun.tools.jdi.EventSetImpl;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExampleStudent {

    public static void main(String[] args){

        TreeSet<Student> ts = new TreeSet<Student>();

        ts.add(new Student(5,"Five"));
        ts.add(new Student(2,"Two"));
        ts.add(new Student(1,"One"));
        ts.add(new Student(2,"Two"));
        ts.add(new Student(3,"Three"));
        ts.add(new Student(4,"Four"));
        ts.add(new Student(3,"Three"));

        Iterator itr = ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("After removing a student");

        ts.remove(new Student(2,"Two"));

        itr = ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
