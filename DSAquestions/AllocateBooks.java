package DSAquestions;

import java.util.Map;

public class AllocateBooks {
    public static void main(String[] args) {
        int[] arr = {12,34,67,90};

        System.out.println(allocateBook(arr,2));
    }

    static int allocateBook(int[] arr, int m){
        int low = getMax(arr);
        int high = getSum(arr);
        while (low <= high){
            int mid = (low+high)/2;
            int cbook = canWeGiveBook(arr,mid,m);
            if(cbook > m) low = mid +1;
            else high = mid -1;
        }
        return low;
    }

    private static int canWeGiveBook(int[] arr, int idx, int m) {
        int cnt = 1;
        int books = 0;
        for(int i=0;i<arr.length;i++){
            if(books + arr[i] <= idx){
                books+= arr[i];
            }else{
                cnt++;
                books = arr[i];

            }
        }
        return cnt;
    }

    private static int getMax(int[] arr) {
        int max = 0;
        for(int i:arr){
            max = Math.max(max,i);
        }
        return max;
    }

    private static int getSum(int[] arr) {
        int sum  =0;
        for(int i:arr){
            sum += i;
        }
        return sum;
    }
}
