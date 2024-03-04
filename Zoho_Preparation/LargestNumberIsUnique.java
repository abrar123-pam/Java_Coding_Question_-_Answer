package Zoho_Preparation;

public class LargestNumberIsUnique {

    public static int printUnique(int[] arr){
        int n = arr.length;
        int greatest = arr[0];
        int index = -1;

        for(int i=1;i<n;i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
                index = i;

            }
        }
        for(int i=0;i<n;i++){
            if(i == index){
                continue;
            }else if(arr[i]*2 > greatest){
                index = -1;
                break;
            }
        }
        return  index;

    }

    public static void main(String[] args) {
        int[] arr = {1,3,6,2};

        int ans = printUnique(arr);

        System.out.println(ans);
    }
}
