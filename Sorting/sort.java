package Sorting;

import java.util.Scanner;

public class sort {

    public static void main(String[] args) {
        // 8 6 2 5 1 need to sort
        // 1 2 5 6 8

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int n = arr.length;
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

//        bubbleSort.bubblesort(arr,n);
//        selectionSort.selectionsort(arr,n);
//        insertionSort.insertionsort(arr,n);
        int l = 0;
        int r = n -1;
        mergeSort.mergesort(arr,l,r);
        System.out.println("MERGE SORT");
        for (int element:arr) {
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
