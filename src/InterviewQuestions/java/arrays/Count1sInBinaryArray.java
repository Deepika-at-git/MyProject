package InterviewQuestions.java.arrays;

public class Count1sInBinaryArray {

    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 1, 1, 1, 1};
        getCountOf1sInBinaryArray(arr);
    }

    public static void getCountOf1sInBinaryArray(int[] arr) {

       /* HashMap<Integer, Integer> arrMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                if (!arrMap.containsKey(arr[i])) {
                    arrMap.put(arr[i], 1);
                } else {
                    arrMap.put(arr[i], (arrMap.get(arr[i]) + 1));
                }

            }

        }
        System.out.println(arrMap.get(1));*/
        /**
         * Linear O(n)
         */
        /*int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }
        System.out.println(count);
*/
        /**
         *Sorted BinaryArray
         */
        int start = 0, end = arr.length - 1;
        int total;
        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == 1) {
                if (arr[mid - 1] == 0) {
                    total = ((arr.length - 1) - mid) + 1;
                    System.out.println("Total 1's is: " + total);
                    return;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid + 1] == 1) {
                    total = (arr.length - 1) - (mid + 1) + 1;
                    System.out.println("Total 1's is: " + total);
                    return;
                } else {
                    start = mid + 1;
                }
            }
        }
    }


}

/*
arrMap={1,4}
i=2, arr.length=7
i=4
 */