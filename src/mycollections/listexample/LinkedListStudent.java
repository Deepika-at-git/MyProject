package mycollections.listexample;

import com.company.Student;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListStudent {

    public static void main(String[] args){

        LinkedList<Student> linkS = new LinkedList<Student>();

        Student s = new Student(5, "Dan");

        linkS.add(new Student(10,"Jane"));
        linkS.add(s);
        linkS.add(new Student(2,"Liya"));
        linkS.add(new Student(20,"Zack"));
        linkS.add(new Student(1,"Raghu"));

        for (int i = 0; i <linkS.size() ; i++) {
            System.out.println(linkS.get(i));
        }

        System.out.println("After sorting");

        Collections.sort(linkS);

        for (int i = 0; i <linkS.size() ; i++) {
            System.out.println(linkS.get(i));
        }

        System.out.println("Adding elements");

        linkS.add(new Student(3,"Sam"));
        linkS.addFirst(new Student(1,"Deepika"));
        linkS.addLast(new Student(6,"Windy"));

        Collections.sort(linkS);

        for (int i = 0; i <linkS.size() ; i++) {
            System.out.println(linkS.get(i));
        }

        System.out.println("List contains " + linkS.contains(s));
    }

}
