package DSAquestions;

import java.util.ArrayList;
import java.util.Collections;

public class findRange {

    public static int findRange(ArrayList<Integer> number){
        Collections.sort(number);
        int min = number.get(0);
        int max = number.get(number.size()-1);
        return max - min;



    }
    public static int rangeSum(int []nums){
        int n = nums.length;
        int sum = 0;

        for(int i=0;i<n;i++){
            ArrayList<Integer> number = new ArrayList<>(); // Create a new list for each subarray
            for(int j=i;j<n;j++){
                number.add(nums[j]);
                sum += findRange(number);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int nums[] = {4,1,2,5};

        int ans = rangeSum(nums);
        System.out.println(ans);
    }
}