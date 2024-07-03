package DSAquestions;

import java.util.Scanner;

public class kokoEatingBananas {

    public static int findMax(int arr[]){
        int maxi =  Integer.MIN_VALUE;
        int n = arr.length;

        for (int j : arr) {
            maxi = Math.max(maxi, j);
        }
        return maxi;
    }
    public static int calculateH(int[] arr, int mid){
        int total = 0;
        int n = arr.length;

        for(int i =0 ;i<n;i++){
            total += Math.ceil ((double)(arr[i])/ (double)(mid));
        }
        return total;
    }
    public static void calculateHour(int[] arr, int h){
        int low = 0;
        int high = findMax(arr);

        while (low <= high){
            int mid = (low+high)/2;

            int totalH = calculateH(arr,mid);
            if (totalH <= h){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        System.out.println(low);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int hours;
        hours = sc.nextInt();
        //3628
        calculateHour(arr,hours);
    }
}
