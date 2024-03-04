package Zoho_Preparation;

public class alternateSorting {

    public static int[] alternate(int[] arr, int n){
        int[] ans = new int[n];

        int low = 0;
        int high = n-1;
        int k = 0;
        while(low <= high){
            if(k%2 == 0){
                ans[k] = arr[high];
                high--;
            }else{
                ans[k] = arr[low];
                low++;
            }
            k++;
        }
        return  ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;

        int[] ans = alternate(arr,n);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] +" ");
        }
    }
}