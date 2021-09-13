package mycollections.listexample;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertDeleteList {

    public static void main(String[] args) {

        int n, q;
        String insert = "Insert";
        String delete = "Delete";
        int x, y;


        ArrayList<Integer> arrList = new ArrayList<>();

        Scanner scn = new Scanner(System.in);

        n = scn.nextInt();


        for (int i = 0; i < n; i++) {
            int value = scn.nextInt();
            arrList.add(i, value);
        }


        q = scn.nextInt();

        while (q >= 1) {
            scn.nextLine();
            String query = scn.nextLine();
            if (query.equalsIgnoreCase(insert)) {
                x = scn.nextInt();
                y = scn.nextInt();
                arrList.add(x, y);
            } else if (query.equalsIgnoreCase(delete)) {
                x = scn.nextInt();
                arrList.remove(x);
            }

            q--;
        }

        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }


    }

}
