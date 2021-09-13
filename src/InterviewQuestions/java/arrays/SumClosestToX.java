package InterviewQuestions.java.arrays;

public class SumClosestToX {

    public static void main(String[] args) {

        int[] arr = {-1, 2, 1, -4};
        int[] arr1 = {-40, -5, 1, 3, 6, 7, 8, 20};
        int x = 1, x1 = 5;

        //findPairSumClosestToX(arr, x);
        getPairSumClosestToX(arr1, x1);
    }

    public static void findPairSumClosestToX(int[] arr, int x) {

        int minSum = Math.abs(arr[0] + arr[1] - x);
        int pair1 = arr[0];
        int pair2 = arr[1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                int sum = Math.abs(arr[i] + arr[j] - x);

                if (sum < minSum) {
                    minSum = sum;
                    pair1 = arr[i];
                    pair2 = arr[j];
                }
            }
        }

        System.out.println("Pair whose sum is closest to x is " + pair1 + " " + pair2);

    }

    public static void getPairSumClosestToX(int[] arr, int x) {

        int l = 0, r = arr.length - 1;
        int minSum = Integer.MAX_VALUE;
        int pair1 = 0, pair2 = 0;

        while (l < r) {

            int sum = Math.abs((arr[l] + arr[r]) - x);

            if (sum < minSum) {
                minSum = sum;
                pair1 = arr[l];
                pair2 = arr[r];
            } else if (sum < x) {
                l++;
            } else {
                r--;
            }

        }

        System.out.println("Pair whose sum is closest to x is " + pair1 + " " + pair2);
    }

}
