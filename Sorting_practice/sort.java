package Sorting_practice;

import java.util.ArrayList;

public class sort {

    //Function for Bubble Sort
    static void  bubbleSort(int[] arr, int n){

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("\nAfter Sorting");
        for (int num:arr){
            System.out.print(num+ " ");
        }
    }
    //Function for selection sort
    static void selectionSort(int[] arr, int n){
         for (int i=0;i<n-1 ;i++){
             int k = i;
             for(int j=i;j<n;j++) {
                 if (arr[j] < arr[k]) {
                     k = j;
                 }
             }
                int temp = arr[k];
                 arr[k] = arr[i];
                 arr[i]  =temp;
         }
        System.out.println("After Sorting");
        for (int num:arr){
            System.out.print(num+ " ");
        }
    }
    //Function for Insertion sort
    static void insertionSort(int[] arr, int n){
        for(int i=0;i<n;i++){
            int j = i;

            while (j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println();
        for (int num: arr) {
            System.out.print(num + " ");

        }
    }
    //Function for Merge Sort
    static void mergeSort(int[] arr, int si, int ei){

        if(si>=ei){
            return;
        }
        int mid = (si+ei)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }

    static void merge(int[] arr, int si, int mid, int ei){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = si;
        int right = mid+1;

        while (left <= mid && right <= ei){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while (right <= ei){
            temp.add(arr[right]);
            right++;
        }

        for (int i=si;i<=ei;i++){
            arr[i] = temp.get(i-si);
        }

        System.out.println("After sorting Sorting");
        for (int num:arr){
            System.out.print(num+ " ");
        }


    }

    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        int n = arr.length;

        System.out.println("Before Sorting");
        for (int num:arr){
            System.out.print(num+ " ");
        }
        //bubbleSort(arr,n);
        //selectionSort(arr,n);
        //insertionSort(arr,n);
        mergeSort(arr, 0,n-1);
    }
}
