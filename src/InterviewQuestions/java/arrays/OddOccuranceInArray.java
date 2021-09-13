package InterviewQuestions.java.arrays;

import java.util.HashSet;
import java.util.Set;

public class OddOccuranceInArray {

    public static void main(String[] args) {

        int[] arr = {20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 50};

        Set<Integer> setOdd = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (setOdd.contains(arr[i])) {
                setOdd.remove(arr[i]);
            } else {
                setOdd.add(arr[i]);
            }

        }
        System.out.println("Number occurring odd number of times is " + setOdd);

    }

}
