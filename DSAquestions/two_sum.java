package DSAquestions;


public class two_sum {
    public static void main(String[] args) {
        int[] arr = {1,-1,-1,2,2};
        int target = 1;
        int n = arr.length;

        twoSum(arr,target,n);
    }

    public static void twoSum(int[] arr, int target, int n){

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] +" "+ arr[j]);
                }
            }
        }
    }
}
