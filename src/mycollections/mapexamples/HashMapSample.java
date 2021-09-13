package mycollections.mapexamples;


import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

    public static void main(String[] args) {

        HashMap<String, Integer> hms = new HashMap<String, Integer>();

        hms.put("Top", 10);
        hms.put("Pants", 15);
        hms.put("Dress", 10);
        hms.put("Wallets", 30);
        System.out.println("The key value pair is ");

        for (Map.Entry<String, Integer> i : hms.entrySet()) {
            System.out.println(i.getKey() + "=" + i.getValue());
        }

    }

}
