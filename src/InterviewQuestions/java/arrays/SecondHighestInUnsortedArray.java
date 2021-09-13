package InterviewQuestions.java.arrays;

public class SecondHighestInUnsortedArray {

    public static void main(String[] args) {

        int[] arr = {-7, -1, -6, -1, -4, -9};
        System.out.println("Second largest element is: " + findSecondLargest(arr));
    }

    public static int findSecondLargest(int[] arr) {

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];

            } else if (arr[i] > secondHighest && arr[i] != highest) {
                secondHighest = arr[i];
            }
        }
        return secondHighest;
    }

}
