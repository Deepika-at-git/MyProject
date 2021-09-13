package InterviewQuestions.java.arrays;

public class MinimumInSortedRotatedArray {

    public static void main(String[] args) {

        //  int[] arr = {16, 19, 21, 1, 3, 5, 8, 10, 12, 14};
        int[] arr = {0, 5, 12, 13, 14};

        System.out.println("Minimum element is: " + findMinimumInSortedRotated(arr, 0, arr.length - 1));
    }

    public static int findMinimumInSortedRotated(int[] arr, int low, int high) {

//        int mid;
//
//        while (high > low) {
//
//            mid = (high + low) / 2;
//
//            if (arr[mid] < arr[high]) {
//                low = mid + 1;
//            } else {
//                high = mid;
//            }
//        }
//
//        return arr[low];

        /*Different approach*/

        int mid;

        if (arr.length == 0) return -1;
        if (arr.length == 1) return arr[0];
        if (arr[0] < arr[arr.length - 1])
            return arr[0];

        while (high > low) {

            mid = (high + low) / 2;

            if (mid >= 0 && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            } else if (arr[low] <= arr[mid] && arr[mid] >= arr[high]) {

                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return arr[low];
    }

}
