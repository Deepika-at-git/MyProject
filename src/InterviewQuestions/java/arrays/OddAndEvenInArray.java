package InterviewQuestions.java.arrays;

public class OddAndEvenInArray {

    public static void main(String[] args) {

        int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};

        separateOddAndEvenInArray(arr);

    }

    public static void separateOddAndEvenInArray(int[] arr) {
        System.out.println("Array after separating odd and even numbers :");
        //Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }
            while (arr[right] % 2 != 0 && left < right) {
                right--;
            }

            int temp;
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }

}



