package InterviewQuestions.java.arrays;

public class ZerosOnesTwosInArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 0, 0, 1, 2, 2, 1};
        System.out.println("Array after sorting");
        sortZerosOnesTwos(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] sortZerosOnesTwos(int[] arr) {

        int zeroCount = 0, oneCount = 0, twoCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else if (arr[i] == 1) {
                oneCount++;
            } else {
                twoCount++;
            }
        }

        int i = 0;
        while (i < zeroCount) {
            arr[i] = 0;
            i++;
        }
        while (i < (zeroCount + oneCount)) {
            arr[i] = 1;
            i++;
        }
        while (i < arr.length) {
            arr[i] = 2;
            i++;
        }


        return arr;
    }

}
