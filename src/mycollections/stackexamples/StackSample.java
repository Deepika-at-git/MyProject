package mycollections.stackexamples;

import java.util.Iterator;
import java.util.Stack;

public class StackSample {
    public static void main(String[] args){

        Stack<Integer> s = new Stack<Integer>();

        s.push(50);
        s.push(40);
        s.push(30);
        s.push(20);
        s.push(10);

        Iterator<Integer> it = s.iterator();
        System.out.println("My stack is");
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        int x=s.pop();
        System.out.println("\nTop element from pop " + x);

        System.out.println("Stack after pop");
        it=s.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println("\nTop element from peek " + s.peek());

        it=s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
