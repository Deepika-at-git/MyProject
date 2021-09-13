package InterviewQuestions.java.arrays;

public class LocalMinimaInArray {

    public static void main(String[] args) {

        int[] arr = {10, 5, 3, 6, 13, 16, 7};
        int[] arr1 = {11, 12, 13, 14};
        int[] arr2 = {10};
        int[] arr3 = {8, 6};
        getLocalMinima(arr);
    }

    public static void getLocalMinima(int[] arr) {

        System.out.println("Local minima is :");

        if (arr.length == 1) {
            System.out.println(arr[0]);
            return;
        } else if (arr[0] < arr[1]) {
            System.out.print(arr[0] + " ");
            return;
        }
        int n = arr.length - 1;
        for (int i = 1; i <= n - 1; i++) {
            if (arr[i] < arr[i - 1] & arr[i] < arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }

        if (arr[n] < arr[n - 1]) {
            System.out.print(arr[n]);
        }
    }

}
