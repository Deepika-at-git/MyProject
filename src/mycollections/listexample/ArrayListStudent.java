package mycollections.listexample;


import com.company.Student;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStudent {

    public static void main(String[] arg) {

        ArrayList<Student> arrL = new ArrayList<Student>();

        arrL.add(new Student(3, "Lucky"));
        arrL.add(new Student(4, "Sunny"));
        arrL.add(new Student(1, "Raghu"));
        arrL.add(0, new Student(2, "Deepika"));


        System.out.println("List of Student : ");

        for (int i = 0; i < arrL.size(); i++) {
            System.out.println(arrL.get(i));
        }

        Collections.sort(arrL);

        System.out.println("After sorting");
        for (int i = 0; i < arrL.size(); i++) {
            Student s = arrL.get(i);
            System.out.println(s.getRank() + " " + s.getName());
        }

    }

}

