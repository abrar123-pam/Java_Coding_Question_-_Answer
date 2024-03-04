package Zoho_Preparation;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static  List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int m = matrix[0].length;
        int n = matrix.length;

        int left = 0;
        int right = m-1;
        int top = 0;
        int bottom = n-1;

        while (left <= right && top <= bottom){

            //Left to Right
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;

            //Top to Bottom
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;

            //Right to Left

            if(top <= bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }


            //Bottom to top
            if(left <= right){
                for (int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        int[] [] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        List<Integer> ans = spiralOrder(matrix);

        for(Integer i:ans){
            System.out.print(i+" ");
        }
    }
}
