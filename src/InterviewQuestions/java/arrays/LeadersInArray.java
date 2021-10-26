package InterviewQuestions.java.arrays;

public class LeadersInArray {

    public static void main(String[] args) {

        int[] arr = {99, 65, 21, 14, 12, 7, 5, 8};
        getLeaders(arr);

    }

    public static void getLeaders(int[] arr) {

        int start = arr.length - 1;
        int max = arr[start];
        System.out.print("Leaders in the array are: ");
        System.out.print(max);

        for (int i = start - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.print(" " + max);
            }
        }
    }

}


