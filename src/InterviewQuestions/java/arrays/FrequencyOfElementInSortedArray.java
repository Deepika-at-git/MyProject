package InterviewQuestions.java.arrays;

import java.util.HashMap;

public class FrequencyOfElementInSortedArray {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 3, 3, 4, 5, 5, 6, 6};
        getFrequencyOfElement(arr);

    }

    public static void getFrequencyOfElement(int[] arr) {

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!freqMap.containsKey(arr[i])) {
                freqMap.put(arr[i], 1);
            } else {
                freqMap.put(arr[i], (freqMap.get(arr[i]) + 1));
            }
        }

        for (int val : freqMap.keySet()) {
            System.out.println("Frequency of " + val + " is : " + freqMap.get(val));
        }
    }

}
