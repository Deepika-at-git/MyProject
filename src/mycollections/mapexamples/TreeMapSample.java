package mycollections.mapexamples;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {

    public static void main(String[] args){

        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();

        tm.put(8,"Raj");
        tm.put(4,"Seema");
        tm.put(1,"Raghu");
        tm.put(9,"Ben");
        tm.put(2,"Dpka");
        System.out.println("Ranking order is :");
        for(Map.Entry<Integer,String> i : tm.entrySet())
            System.out.println(i.getKey() + ":" + i.getValue());
    }

}
