package Sorting;

import java.util.ArrayList;

public class mergeSort {
    public static void mergesort(int[] arr, int left,int high){
        if(left >= high)
            return;
        int mid = (left + high) / 2;
        mergesort(arr,left, mid);
        mergesort(arr,mid+1,high);
        merge(arr,left,mid,high);

    }

    static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid+1;

        while (left<=mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }

        while (right<=high){
            temp.add(arr[right]);
            right++;
        }

        for (int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
    }
}
