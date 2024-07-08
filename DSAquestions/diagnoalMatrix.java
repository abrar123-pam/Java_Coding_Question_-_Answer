package DSAquestions;

import PracticeQuestions.Array;

import java.util.Arrays;

public class diagnoalMatrix {
        public static int[] findDiagonalOrder(int[][] mat) {
            int[][] arr = new int[5][5];

            int[] cntarr = new int[5];
            int m = mat.length;
            int n = mat[0].length;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    int sum = i+j;
                    arr[sum][i] = mat[i][j];
                    cntarr[sum] += 1;
                }
            }
            swap(arr);

            for(int i=0;i< arr.length;i++){
                for(int j=0;j< arr[0].length;j++){
                    System.out.print(arr[i][j] + " " );
                }
                System.out.println();
            }



            System.out.println(Arrays.toString(cntarr));
            int[] ans = new int[m*n];
            int k = 0;
            for(int i=0;i<arr.length;i++){
                if(i%2 == 0){
                    for(int j=cntarr[i]-1;j>=0;j--){

                        ans[k++] = arr[i][j];

                    }
                }else{
                    for(int j=0;j<=cntarr[i]-1;j++){

                        ans[k++] = arr[i][j];

                    }
                }
            }
            return ans;
        }

    private static void swap(int[][] arr) {

        for(int i=0;i< arr.length;i++){
            moveZero(arr[i]);
        }
    }

    private static void moveZero(int[] ints) {
            int i=0,j=1;
            while (j<ints.length){
                if(ints[i] == 0 && ints[j] > 0){
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j]  =temp;
                    i++;
                    j++;
                }else {
                    j++;
                }
            }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int[] ans = findDiagonalOrder(arr);

        System.out.println(Arrays.toString(ans));
    }

}

