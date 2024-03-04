package Zoho_Preparation;

import java.util.Map;

public class summingMultiplying {

    public static void finSumMul(int[] arr){
        int n= arr.length;

        for(int i=0;i<n;i++){
            int temp = arr[i];
            int count = 0;
            int rem = 1;
            while(temp !=0){
                rem = rem * (temp % 10);
                temp /= 10;
                count++;
            }
            int ans = Math.max(count,rem);
            System.out.print(ans+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {120,24,71,10,59};

        finSumMul(arr);
    }
}
