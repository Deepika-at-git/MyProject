package InterviewQuestions.java.arrays;

import java.util.Arrays;

public class MinimumPlatformNeeded {

    public static void main(String[] args) {

        int[] arr = {100, 140, 150, 200, 215, 400};
        int[] dep = {110, 210, 230, 300, 315, 600};
        System.out.println("Minimum platform needed is " + getMinimumPlatform(arr, dep, 6));
    }

    public static int getMinimumPlatform(int[] arr, int[] dep, int n) {

        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0, j = 0;
        int platform_needed = 0, maxplatform_needed = 0;

        while (i < n && j < n) {
            if (arr[i] < dep[j]) {
                platform_needed++;
                i++;
                if (platform_needed > maxplatform_needed) {
                    maxplatform_needed = platform_needed;
                }
            } else {
                platform_needed--;
                j++;
            }
        }

        return maxplatform_needed;
    }

}
