package mycollections.stackexamples;

import com.company.Student;

import java.util.Iterator;
import java.util.Stack;

public class StudentStack {

    public static void main(String[] args) {

        Stack<Student> stastu = new Stack<Student>();

        stastu.push(new Student(4, "Riya"));
        stastu.push(new Student(8, "jai"));
        stastu.push(new Student(1, "Zan"));
        stastu.push(new Student(2, "Tan"));


        Iterator<Student> itr = stastu.iterator();

        System.out.println("Student from peek " + stastu.peek());

        System.out.println("Student list is :");

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Student s = stastu.pop();
        System.out.println("Student who is popped " + s);

        itr = stastu.iterator();

        System.out.println("Student list after popping");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        while (!stastu.empty()) {
            System.out.println("Element popped is " + stastu.pop());
        }
        System.out.println("Size of Student list after pop " + stastu.size());

    }

}
