package Zoho_Preparation;

import java.util.Arrays;

public class firstSmalleestfirstLargest {

    public static void rearrange(int[] arr, int n){
        Arrays.sort(arr);
        int[] ans = new int[n];
        int m = 0;
        int i= 0;
        int j = n-1;

        while (i<=j){
            if(m%2 == 0){
                ans[m] = arr[i];
                i++;
            }else{
                ans[m] = arr[j];
                j--;
            }
            m++;
        }

        for(int k=0;k<n;k++){
            System.out.print(ans[k]+" ");
        }
    }

    public static void rearrange1(int[] arr, int n){

        Arrays.sort(arr);
        int low=0;
        int high = n-1;
        boolean placeSmallest = true;

        while (low <= high){
            if(placeSmallest){
                System.out.print(arr[low++]+" ");
            }else{
                System.out.print(arr[high--]+" ");
            }

            placeSmallest = !placeSmallest;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5};
        int n = arr.length;

        //rearrange(arr,n);
        rearrange1(arr,n);
    }
}
