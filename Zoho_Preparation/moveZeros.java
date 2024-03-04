package Zoho_Preparation;

public class moveZeros {
    public static void main(String[] args) {
        int[] arr = {1,0,4,0,2};

      //Brute force Approch
//        int[] ans = new int[n];
//        int j = 0;
//        int count = 0;
//        for(int i = 0;i<n;i++){
//            if(arr[i] == 0){
//                count++;
//            }else{
//                ans[j] = arr[i];
//                j++;
//            }
//        }
//
//        for(int i=j;j<count;j++){
//            ans[i]= 0;
//        }

        //optimal approach
        int i=0;
        int j= 0;
        int n = arr.length;

        while (j<n){
            if(i<n && arr[i]!=0){
                i++;
                j++;
            } else if (arr[j] !=0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }else{
                j++;
            }
        }

        for(int k=0;k<n;k++){
            System.out.print(arr[k] +" ");
        }

    }
}
