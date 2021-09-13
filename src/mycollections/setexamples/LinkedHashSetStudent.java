package mycollections.setexamples;

import com.company.Student;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudent {

    public static void main(String[] args) {

        LinkedHashSet<Student> ls = new LinkedHashSet<Student>();
        Student s = new Student(1, "One");
        ls.add(s);
        ls.add(new Student(5, "Five"));
        ls.add(new Student(3, "Three"));
        ls.add(new Student(1, "One"));


        Iterator itr = ls.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        ls.remove(new Student(5, "Five"));

        System.out.println("Linked set after removal of a student");
        itr = ls.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
