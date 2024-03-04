package Zoho_Preparation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class twoSortedArrays {

    public static ArrayList<Integer> sortedArray(int[] arr1,int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        for (int k : arr1) {
            set.add(k);
        }
        for (int j : arr2) {
            set.add(j);
        }
        for(Integer i: set){
            ans.add(i);
        }

        return  ans;
    }

    public static int[] sortedArray2(int[] arr1,int[] arr2){
        List<Integer> temp = new ArrayList<>();
        int i=0;
        int j = 0;

        while (i< arr1.length && j < arr2.length){

            if(arr1[i] < arr2[j]){
                temp.add(arr1[i++]);
            } else if (arr1[i] > arr2[j]) {
                temp.add(arr2[j++]);
            }else{
                temp.add(arr1[i++]);
                j++;
            }
        }

        while (i<arr1.length){
            temp.add(arr1[i++]);
        }
        while (j< arr2.length){
            temp.add(arr2[j++]);
        }

        int[] ans = new int[temp.size()];

        for (int k=0;k<temp.size();k++){
            ans[k] =temp.get(k);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,4,5,6,7,9,10,13};
        int[] arr2 = {2,3,4,5,6,7,8,9,11,15};

        ArrayList<Integer> arr = sortedArray(arr1,arr2);

        int[] ans = sortedArray2(arr1,arr2);

        for(Integer i: ans){
            System.out.print(i+" ");
        }
    }
}
