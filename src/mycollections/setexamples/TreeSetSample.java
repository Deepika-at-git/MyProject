package mycollections.setexamples;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSample {

    public static void main(String[] args){

        TreeSet<Integer> ti = new TreeSet<Integer>();

        ti.add(69);
        ti.add(29);
        ti.add(39);
        ti.add(49);
        ti.add(59);
        ti.add(29);

        Iterator itr = ti.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        ti.remove(69);
        System.out.println("After deletion");
        itr = ti.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
