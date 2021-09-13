package algorithms.sort;

public class InsertionSort {

    public static void main(String[] args){

        int[] arr = {4,2,7,8,10,6};
        System.out.println("Array elements before Insertion sort: ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        sort(arr);

        System.out.println("Array elements after Insertion sort: ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * Time complexity is O(n*n)
     * Space Complexity is O(n)
     */

    public static void sort(int[] arr){

       for(int i=1;i<arr.length;i++){
           int current=arr[i];
           int j=i-1;

           while(j>=0 && arr[j]>current){
               arr[j+1]=arr[j];
               j--;
           }

           arr[j+1]=current;
       }



    }

}
