package Sorting;

public class quickSort {
    public static void quick(int[] arr,int low, int high){
        if(low >= high){
            return;
        }
        int pi = partition(arr,low,high);
        quick(arr,low,pi-1);
        quick(arr,pi+1,high);
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int pi = low;

        for(int i=low;i<high;i++){
            if(arr[i] <= pivot){
                swap(arr,i,pi);
                pi++;
            }
        }

        swap(arr,pi,high);

        return pi;
    }

    public static void main(String[] args) {
        int[] arr = {8,3,2,7,9,6,4,5};
        quick(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
