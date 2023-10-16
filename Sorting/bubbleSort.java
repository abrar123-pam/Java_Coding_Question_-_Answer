package Sorting;
public class bubbleSort {
    static void bubblesort(int[] arr,int n){

        for (int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]  =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("BUBBLE SORT");
        for (int element:arr) {
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
