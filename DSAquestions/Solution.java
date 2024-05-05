package DSAquestions;

import java.util.ArrayList;
import java.util.Collections;

public final class Solution {
    public static int findMedian(int matrix[][], int m, int n) {

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr.add(matrix[i][j]);
            }
        }

        Collections.sort(arr);
        System.out.println(arr.size());

        int mid = (arr.size()-1) / 2;

        if (arr.size() % 2 == 1) {
            return arr.get(mid);
        } else {
            // If the number of elements is even, return the average of the two middle elements
            int mid1 = arr.get(mid);
            int mid2 = arr.get(mid + 1);
            return (mid1 + mid2) / 2;
        }

    }

    public static void main(String[] args) {
        int[][] arr = {{ 1 ,2 ,3 ,4 ,5 },
                {8 ,9 ,11 ,12 ,13 },
                { 21 ,23 ,25 ,27 ,29}};

        int ans = findMedian(arr,5,3);

        System.out.println(ans);


    }
}