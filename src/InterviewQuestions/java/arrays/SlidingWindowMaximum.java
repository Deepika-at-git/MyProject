package InterviewQuestions.java.arrays;

public class SlidingWindowMaximum {

    public static void main(String[] args) {

        int[] arr = {2, 6, -1, 2, 4, 1, -6, 5};
        int k = 3;
        getSlidingWindowMaximum(arr, k);
    }

    public static void getSlidingWindowMaximum(int[] arr, int k) {

        for (int i = 0; i <= arr.length - k; i++) {

            int max = arr[i];

            for (int j = i; j < (i + k); j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            System.out.print(max + " ");
        }
    }

}
