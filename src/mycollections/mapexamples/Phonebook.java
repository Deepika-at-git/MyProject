package mycollections.mapexamples;

import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> mapList = new HashMap<>();
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            mapList.put(name, phone);
            in.nextLine();
        }

        while (in.hasNext()) {
            String s = in.nextLine();
            if (mapList.containsKey(s)) {
                System.out.println(s + "=" + mapList.get(s));
            } else {
                System.out.println("Not found");
            }
        }


    }
}
