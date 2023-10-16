package DSAquestions;

import java.util.ArrayList;

public class merge_sort {

    public static void main(String[] args) {
        int[] arr= {8,6,2,5,1};
        int n= arr.length;
        int l = 0;
        int r = n-1;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        mergeSort(arr,l,r);

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr, int l, int r){
        if(l >= r)
            return;

        int mid = (l + r) / 2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    public static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while (left<=mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else {
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


        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }


    }
}
