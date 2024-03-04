package Zoho_Preparation;

import java.util.Arrays;

public class NGE {

    public static void findNextGreater(int[] arr){
        int n =arr.length;
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            int next = -1;
            for(int j=i+1;j<n;j++){
                if(arr[i] < arr[j]){
                    next = arr[j];

                    break;
                }
            }
            ans[i]=next;
        }

        for(int i=0;i< ans.length;i++){
            System.out.print(ans[i] +" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,2,25};

        findNextGreater(arr);

    }
}
