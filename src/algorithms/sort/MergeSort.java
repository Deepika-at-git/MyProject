package algorithms.sort;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {8, 2, 5, 6, 1, 9, 7, 3, 4};
        System.out.println("Array before sort");
        PrintArray(arr);

        MergeSort ms = new MergeSort();
        ms.sort(arr, 0, arr.length - 1);

        System.out.println("Array after sort");
        PrintArray(arr);
    }

    public static void PrintArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Sort function to divide the array into smallest element
     * and merging them
     */

    void sort(int[] arr, int l, int r) {

        int m = (l + (r - 1)) / 2;

        if (l < r) {

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    void merge(int arr[], int l, int m, int r) {

        /*to know the size of two sub-arrays to be merged*/
        int n1 = m - l + 1;
        int n2 = r - m;

        /*to merge the two sorted sub arrays*/

        int[] L = new int[n1];
        int[] R = new int[n2];

        int i = 0, j = 0;

        while (i < n1) {
            L[i] = arr[l + i];
            i++;
        }

        while (j < n2) {
            R[j] = arr[m + 1 + j];
            j++;
        }

        int ii = 0, jj = 0, k = l;

        while (ii < n1 && jj < n2) {

            if (L[ii] <= R[jj]) {
                arr[k] = L[ii];
                ii++;
            } else {
                arr[k] = R[jj];
                jj++;
            }
            k++;
        }

        while (ii < n1) {
            arr[k] = L[ii];
            ii++;
            k++;
        }

        while (jj < n2) {
            arr[k] = R[jj];
            jj++;
            k++;
        }

    }
}