package algorithms.search;

public class BinarySearch {


    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int n = 80;
        int found = search(arr, n);

        if (found > -1) {
            System.out.println("Element found is " + n + " and the index found at " + found);
        } else {
            System.out.println("Element not found");
        }
    }

    /**
     * Time complexity is O(n)
     * Space complexity is O(1)
     */

    private static int search(int[] arr, int n) {
        // implement here

        int low = 0;
        int high = arr.length - 1;

        while (high > low) {

            int mid = (high + low) / 2;

            if (arr[mid] == n) {
                return mid;
            } else if (n < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
