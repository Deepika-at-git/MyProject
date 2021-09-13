package mycollections.setexamples;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {
    public static void main(String[] args){
        HashSet<Integer> hashi = new HashSet<Integer>();
        hashi.add(2);
        hashi.add(18);
        hashi.add(5);
        hashi.add(20);
        hashi.add(null);
        hashi.add(45);
        hashi.add(5);
        hashi.add(20);

        Iterator itr = hashi.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
