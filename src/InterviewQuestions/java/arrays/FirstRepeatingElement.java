package InterviewQuestions.java.arrays;

import java.util.HashMap;
import java.util.HashSet;

public class FirstRepeatingElement {

    public static void main(String[] args) {

        int[] arr = {10, 6, 7, 8, 1, 8, 7, 6};
        //int result = getFirstRepeatingElement(arr);
        int min = getFirstElementRepeating(arr);
        System.out.println("The first repeating element is: " + arr[min]);
    }

    public static int getFirstRepeatingElement(int[] arr) {

        HashMap<Integer, Integer> repMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!repMap.containsKey(arr[i])) {
                repMap.put(arr[i], 1);
            } else {
                repMap.put(arr[i], (repMap.get(arr[i]) + 1));
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (repMap.get(arr[i]) > 1) {
                return arr[i];
            }
        }

        return 0;
    }

    /**
     * Using HashSet
     */
    public static int getFirstElementRepeating(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        int minimumIndex = -1;
        for (int i = arr.length - 1; i > 0; i--) {
            if (set.contains(arr[i])) {
                minimumIndex = i;
            } else {
                set.add(arr[i]);
            }
        }

        return minimumIndex;
    }

}
