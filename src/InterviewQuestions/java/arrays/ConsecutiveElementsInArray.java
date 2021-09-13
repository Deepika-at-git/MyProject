package InterviewQuestions.java.arrays;

import java.util.TreeSet;

public class ConsecutiveElementsInArray {

    public static void main(String[] args) {

        //int[] arr = {5, 3, 4, 1, 2};
        //int[] arr1 = {47, 43, 45, 44, 46};
        int[] arr2 = {1, 7, 5, 6};
        boolean result = checkArrayElements(arr2);
        System.out.println("Array elements are consecutive: " + result);
    }

    public static boolean checkArrayElements(int[] arr) {

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }

        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        if (arr.length == set.size()) {
            for (int i = 0; i < arr.length; i++) {
                if (!(set.pollFirst() == min + i)) {
                    return false;
                }
            }

        } else {
            return false;
        }

        return true;

    }

}
