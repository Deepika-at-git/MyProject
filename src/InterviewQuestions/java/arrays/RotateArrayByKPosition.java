package InterviewQuestions.java.arrays;

public class RotateArrayByKPosition {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 8;

        if (k > arr.length) {
            System.out.println("Provide K within range");
            return;
        }
        reverseK(arr, k);
        System.out.println("The K rotated array is: ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

    }

    public static int[] reverseK(int[] arr, int k) {
        arr = reverseArray(arr, 0, arr.length - 1);
        arr = reverseArray(arr, 0, k - 1);
        arr = reverseArray(arr, k, arr.length - 1);
        return arr;
    }

    public static int[] reverseArray(int[] arr, int start, int end) {
        int temp;

        while (start < end) {
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }

        return arr;
    }

}
