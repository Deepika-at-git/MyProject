package InterviewQuestions.java.arrays;

public class MissingNumInArray {

    public static void main(String[] args) {

        int[] arr = {5, 3, 1, 2};

        //finding missing number
//        Arrays.sort(arr);
//        int temp = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == temp) {
//                temp++;
//            } else {
//                System.out.println("Missing element is: " + temp);
//                break;
//            }
//        }

        //finding missing number using sum of all natural numbers

        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;
        int newSum = 0;

        for (int i = 0; i < arr.length; i++) {
            newSum = newSum + arr[i];
        }
        int missingNum = sum - newSum;
        System.out.println("Missing number is: " + missingNum);

    }

}
