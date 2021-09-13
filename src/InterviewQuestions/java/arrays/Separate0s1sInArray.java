package InterviewQuestions.java.arrays;

public class Separate0s1sInArray {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 0, 1, 1, 1, 0, 1};
        set0s1sSeparately(arr);
    }

    public static void set0s1sSeparately(int[] arr) {

        int n = arr.length - 1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        for (int j = 0; j < n; j++) {
            if (j < count) {
                arr[j] = 0;
            } else {
                arr[j] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }

}
