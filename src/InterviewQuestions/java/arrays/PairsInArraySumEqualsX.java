package InterviewQuestions.java.arrays;

import java.util.Arrays;

public class PairsInArraySumEqualsX {

    public static void main(String[] args) {

        int[] arr = {-40, -5, 1, 3, 6, 7, 8, 20};
        int x = 15;
        //findPairsSumEqualsX(arr, x);
        getPairsSumEqualsX(arr, x);
    }

    public static void findPairsSumEqualsX(int[] arr, int x) {

        System.out.println("The pair whose sum is equal to x ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int pairSum = arr[i] + arr[j];
                if (pairSum == x) {

                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }
    }

    public static void getPairsSumEqualsX(int[] arr, int x) {

        System.out.println("The pair whose sum is equal to x ");

        Arrays.sort(arr);
        int l = 0, r = arr.length - 1;

        while (l < r) {

            int pairSum = arr[l] + arr[r];
            if (pairSum == x) {
                System.out.println(arr[l] + " " + arr[r]);
                l++;
                r--;
            } else if (pairSum < x) {
                l++;
            } else {
                r--;
            }
        }
    }

}
