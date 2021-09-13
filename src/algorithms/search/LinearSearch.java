package algorithms.search;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 60, 40, 70, 50, 90, 100, 80};
        int n = 80;
        int found = search(arr, n);

        if (found>-1) {
            System.out.println("Element found is " + n + " and the index found at " + found);
        } else {
            System.out.println("Element not found");
        }
    }

    /**
     *
     Time complexity is O(n)
     Space complexity is O(1)
     */

    private static int search(int[] arr, int n) {
        // implement here

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }

        return -1;

    }


}


