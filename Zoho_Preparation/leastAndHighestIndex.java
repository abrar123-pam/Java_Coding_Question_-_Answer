package Zoho_Preparation;

import java.util.Arrays;

public class leastAndHighestIndex {

    //Brute force
//    public static void findIndex(String st1, String st2){
//        int n1= st1.length();
//        int n2 = st2.length();
//
//        int[] arr = new int[n2];
//
//        for(int i=0;i<n2;i++){
//            for(int j=0;j<st1.length();j++){
//                if(st2.charAt(i) == st1.charAt(j)){
//                    arr[i] = j;
//                    break;
//                }
//            }
//        }
//
//        Arrays.sort(arr);
//        int least = arr[0];
//        int highest = arr[arr.length-1];
//
//        System.out.println(st1.substring(least,highest+1));
//
////        for (int i=least;i<=highest;i++){
////            System.out.print(st1.charAt(i));
////        }
//    }

    //Optimal approach
    public static void findIndexOptimal(String st1, String st2){
        int minIndex =Integer.MAX_VALUE;
        int maxIndex = Integer.MIN_VALUE;

        for(char ch:st2.toCharArray()){
            int ind =  st1.indexOf(ch);
            if(ind != -1){
                minIndex = Math.min(minIndex,ind);
                maxIndex = Math.max(maxIndex,ind);
            }
        }

        System.out.println(st1.substring(minIndex,maxIndex+1));
    }


    public static void main(String[] args) {
        String st1 = "ZOHOCORPORATION";
        String st2 = "PORT";

        //findIndex(st1,st2);
        findIndexOptimal(st1,st2);

    }
}
