package InterviewQuestions.java.arrays;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {

        // int[] arr = {16, 19, 21, 25, 3, 5, 8, 10, 12};
        int[] arr = {0, 5, 12, 13, 14};
        System.out.println("Element 16 found at index " + findNInRotatedSortedArray(arr, 0, arr.length - 1, 0))
        ;
    }

    public static int findNInRotatedSortedArray(int[] arr, int low, int high, int n) {

        int mid;
        while (high >= low) {

            mid = (high + low) / 2;

            if (arr[mid] == n) {
                return mid;
            } else if (arr[mid] >= arr[low]) {
                if (n <= arr[mid] && n >= arr[low]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } else {
                if (n >= arr[mid] && n <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

}
