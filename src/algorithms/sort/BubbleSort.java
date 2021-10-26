package algorithms.sort;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 8, 10, 6};
        System.out.println("Array elements before Bubble sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        sort(arr);

        System.out.println("Array elements after Bubble sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * Time complexity is O(n*n)
     * Space complexity is O(1)
     */

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

    }

}
