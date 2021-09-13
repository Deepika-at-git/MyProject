package mycollections.setexamples;

import com.company.Student;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudent {
    public static void main(String[] args){

        HashSet<Student> hss = new HashSet<Student>();

        hss.add(new Student(5,"Zen"));
        hss.add(new Student(5,"Riya"));
        hss.add(new Student(2,"Dan"));
        hss.add(new Student(6,"Tim"));
        hss.add(new Student(2,"Dan"));

        System.out.println(hss);

    }

}
