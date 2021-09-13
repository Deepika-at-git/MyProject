package mycollections.setexamples;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetSample {

    public static void main(String[] args){

        LinkedHashSet<Integer> linset = new LinkedHashSet<Integer>();

        linset.add(8);
        linset.add(9);
        linset.add(2);
        linset.add(6);
        linset.add(8);
        linset.add(1);
        linset.add(2);

        Iterator itr = linset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        linset.spliterator();

        linset.remove(9);

        itr = linset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
