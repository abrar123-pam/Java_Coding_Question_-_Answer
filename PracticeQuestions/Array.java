package PracticeQuestions;

import java.util.*;
import java.util.ArrayList;

public class Array {

    public static void seclarge(int n, int[] a) {
        int large = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > large) {
                large = a[i];
            }
        }
        int secLarge = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > secLarge && a[i] != large) {
                secLarge = a[i];
            }
        }

        System.out.println(secLarge);
    }

    public static void main(String[] args) {
        //array of 5 floats and calculate their sums
        int[] a = {1, 3, 4, 6, 7, 8};
        seclarge(6, a);

        
        /*float[] num = {67.7f,45.6f,70.0f,56.7f,60.2f};
        float sum = 0;
        for (float elements:num) {
            sum = sum+elements;
        }
        System.out.println(sum);*/
//      program to  find whether the value is present or not

//        int[] array = {34,67,55,23,98,90,44};
//        int find = 233;
//        boolean isvaluepresent = false;
//        for (int num:array) {
//            if(find==num){
//                isvaluepresent = true;
//                break;
//            }
//        }
//        if(isvaluepresent){
//            System.out.println("the value is present in the array");
//        }else{
//            System.out.println("the value is not present in  the array");


        //program to  find the average of an aray
        /*int[] array = {34,67,55,23,98};
        int sum = 0;

        for(int avg:array){
            sum = sum+avg;
        }
        System.out.print("the average is"+sum/ array.length);*/

        //program to reverse an array
//
//        int[] array  = {1,2,3,4,5,6};
//        int l = array.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//
//        for(int i=0; i<n; i++){
//            temp = array[i];
//            array[i] = array[l-1-i];
//            array[l-1-i] = temp;
//        }
//
//        for (int elements:array) {
//            System.out.print(elements);
//        }


//        int[] arr ={1,2,3,4,5,6};
//        System.out.println("ORIGINSL ARRAY");
//
//        for(int i = 0; i<arr.length;i++){
//            System.out.print(arr[i]+ " ");
//        }
//        System.out.println("");
//        System.out.println("REVERSE ARRAY");
//
//        for (int i=arr.length-1;i>=0;i--){
//            System.out.print(arr[i]+ " ");
//        }


        //program to find maximum element in an array
//
//        int[] array = {34,67,34,444,6,8,97};
//       // System.out.println(array);
//        int max = 0;
//
//        for (int element:array) {
//            if(element>max){
//                max = element;
//            }
//        }
//        System.out.println("the maximum element is: "+ max);

        //program to find minimum array

//        int[] array1 = {34,67,34,444,6,8,97};
//        //System.out.println(array1);
//        int min =array1[0];
//
//        for(int i=0;i<array1.length;i++){
//            if(array1[i]<min){
//                min = array1[i];
//            }
//        }
//        System.out.println("The minimum element is: "+ min);


        //Majority Elements
//        //find all elements tha apper more than [n / 3]
//        int[] num = {1,3,2,5,1,3,1,5,1};
//        List result = findMajorityElements(num);
//        System.out.println("Majority elements: " + result);
//
//    }

//    public static List<Integer> findMajorityElements(int[] nums){
//        int n = nums.length;
//        List<Integer> majorityElements = new ArrayList<>();
//
//        for (int i=0;i< n;i++){
//            int count = 0;
//
//            for (int j=0;j< n;j++){
//                if (nums[j] == nums[i]){
//                    count++;
//                }
//            }
//            if (count > n / 3 && !majorityElements.contains(nums[i])) {
//                majorityElements.add(nums[i]);
//            }
//        }
//        return majorityElements;
//    }


    }
}
