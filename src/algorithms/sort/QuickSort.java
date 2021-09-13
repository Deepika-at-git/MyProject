package algorithms.sort;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {5, 4, 7, 2, 5, 8, 1, 9};

        System.out.println("Elements before quick sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sort(arr, 0, arr.length - 1);

        System.out.println();
        System.out.println("Elements after quick sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sort(int[] arr, int l, int r) {

        if (l >= r)
            return;

        int p = partition(arr, l, r);
        sort(arr, l, p - 1);
        sort(arr, p + 1, r);


    }

    static int partition(int[] arr, int l, int r) {

        int pivot = arr[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, j, i);
            }

        }
        swap(arr, i + 1, r);

        return i + 1;
    }

    static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }


}
