package InterviewQuestions.java.arrays;

import java.util.Arrays;

public class SumClosestToZero {

    public static void main(String[] args) {

        int[] arr = {1, 3, -5, 7, 8, 20, 40, 6};
        //findPairSumCloseToZero(arr);
        getPairSumCloseToZero(arr);
    }

    public static void findPairSumCloseToZero(int[] arr) {

        if (arr.length < 2)
            return;

        int minimumSum = arr[0] + arr[1];
        int pair1 = 0;
        int pair2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                int sum = arr[i] + arr[j];

                if (Math.abs(sum) < Math.abs(minimumSum)) {
                    minimumSum = sum;
                    pair1 = arr[i];
                    pair2 = arr[j];
                }
            }
        }

        System.out.println("Pair sum closest to zero is " + pair1 + " " + pair2);
    }

    public static void getPairSumCloseToZero(int[] arr) {

        Arrays.sort(arr);
        int l = 0;
        int r = arr.length - 1;
        int minSum = Integer.MAX_VALUE;
        int pair1 = 0;
        int pair2 = 0;

        while (l < r) {

            int sum = arr[l] + arr[r];

            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                pair1 = arr[l];
                pair2 = arr[r];
            } else if (sum < 0) {
                l++;
            } else {
                r--;
            }
        }

        System.out.println("Pair sum closest to zero is " + pair1 + " " + pair2);
    }

}
