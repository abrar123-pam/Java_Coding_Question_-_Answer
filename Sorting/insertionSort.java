package Sorting;

public class insertionSort {
    static void insertionsort(int[] arr, int n){
        for (int i=0;i<n;i++){
            int j=i;
            while (j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j]  = temp;
                j--;
            }
        }

        System.out.println("INSERTION SORT");
        for (int element:arr) {
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
