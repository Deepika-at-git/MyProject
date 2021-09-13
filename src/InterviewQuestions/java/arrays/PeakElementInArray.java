package InterviewQuestions.java.arrays;

public class PeakElementInArray {

    public static void main(String[] args) {

        int[] arr = {14, 22, 70, 15, 99, 65, 21, 90};
        int result = getPeakElement(arr);
        System.out.println("One of the peak element in the array is  " + result);
    }

    public static int getPeakElement(int[] arr) {

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (start == mid || end == mid) {
                return arr[mid];
            } else if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            } else if (arr[mid - 1] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return 0;
    }

}
