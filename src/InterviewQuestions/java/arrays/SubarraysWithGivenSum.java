package InterviewQuestions.java.arrays;

public class SubarraysWithGivenSum {

    public static void main(String[] args) {

        int[] arr = {2, 3, 6, 4, 9, 0, 11};
        int num = 9;
        getSubarraysSumToGivenSum(arr, num);
    }

    public static void getSubarraysSumToGivenSum(int[] arr, int target) {

        int start = 0, end = 0, currSum = 0;

        while (start < arr.length && end <= arr.length) {

            if (currSum == target) {
                System.out.println("Starting index is: " + start + " " + "ending index is: " + (end - 1));

                if (end <= arr.length - 1) {
                    currSum += arr[end];
                    end++;
                }
            } else {
                if (currSum > target) {
                    currSum -= arr[start];
                    start++;
                } else {
                    if (end <= arr.length - 1) {
                        currSum += arr[end];
                        end++;
                    }
                }
            }
        }
    }

}
