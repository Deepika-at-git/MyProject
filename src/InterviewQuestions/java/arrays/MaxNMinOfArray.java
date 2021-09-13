package InterviewQuestions.java.arrays;

public class MaxNMinOfArray {

    public static void main(String[] args) {
        int array[] = {5, 8, 1, 6, 9, 2, 4};

        maxAndMinArray(array);
    }

    public static void maxAndMinArray(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum value is: " + min);
        System.out.println("Maximum value is: " + max);
    }

}
