package Sorting;

public class selectionSort {
    static void selectionsort(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            int min = i;
            for (int j=i+1;j<n;j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;

        }
        System.out.println("SELECTION SORT");
        for (int element:arr) {
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
