package mycollections.listexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ArrayListSample {

    public static void main(String[] Args){

        ArrayList<Integer> arrL = new ArrayList<>();

        for (int i=1; i<=5; i++){
            arrL.add(i);
        }
        System.out.println(arrL);

        arrL.remove(3);

        System.out.println("ArrayListSample after one element deletion " + arrL);

        for (int i=0; i<arrL.size(); i++){
            System.out.print(arrL.get(i) + " ");
        }

    }

}
