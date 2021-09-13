package mycollections.queueexamples;

import java.util.ArrayDeque;

public class ArrayDequeueSample {
    public static void main(String[] args){
        ArrayDeque<Integer> arrD = new ArrayDeque<Integer>();
        arrD.add(26);
        arrD.add(35);
        arrD.add(56);
        arrD.add(78);
        System.out.println(arrD);
        arrD.removeFirst();
        System.out.println("ArrayDequeue after deletion" + arrD);
        arrD.addLast(100);
        System.out.println(arrD);
        arrD.addFirst(1);
        arrD.addFirst(10);
        System.out.println(arrD);
        arrD.addLast(500);
        arrD.addLast(520);
        System.out.println(arrD);

    }

}
