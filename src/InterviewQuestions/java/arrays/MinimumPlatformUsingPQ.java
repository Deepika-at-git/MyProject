package InterviewQuestions.java.arrays;

import java.util.PriorityQueue;

public class MinimumPlatformUsingPQ {

    public static void main(String[] args) {

        int[] arr = {100, 140, 150, 200, 215, 400};
        int[] dep = {110, 210, 610, 700, 800, 600};

        System.out.println("Minimum platform required is " + getMinimumPlatformRequired(arr, dep));
    }

    public static int getMinimumPlatformRequired(int[] arr, int[] dep) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            if (pq.isEmpty() || pq.peek() > arr[i]) {
                pq.add(dep[i]);
            } else {
                pq.poll();
                pq.add(dep[i]);
            }
        }

        return pq.size();
    }

}
