package Zoho_Preparation;

import java.util.ArrayList;

public class ReplaceElementswithGreatestElementonRightSide {

    public static int[] replaceElements(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        int greatest = -1;

        for(int i=n-1;i>=0;i--){
            ans[i] = greatest;
            greatest = Math.max(greatest, arr[i]);
        }
        return  ans;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};

        int[] ans = replaceElements(arr);

        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
