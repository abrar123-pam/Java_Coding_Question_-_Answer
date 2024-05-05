package DSAquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Create a program that removes duplicate element from a sorted list without using additional memory
//            input :  [0,0,1,1,1,2,2,3,3,4]
//            output : [0,1,2,3,4]
public class removeDuplicates {

//    public static ArrayList<Integer> removeDup(int[] arr){
//        Map<Integer,Integer> map = new HashMap<>();
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for(int i=0;i<arr.length;i++){
//            if(map.containsKey(arr[i])){
//                map.put(arr[i],map.get(arr[i])+1);
//            }else{
//                map.put(arr[i],0);
//            }
//        }
//
//        for(int i : map.keySet()){
//            list.add(i);
//        }
//
//        return list;
//    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4,5,6,6,9};
//        ArrayList<Integer> ans = removeDup(arr);

         int i = 0;
         int j = 1;
         int n = arr.length;

         while(j<n){
             if(arr[i] == arr[j]){
                 j++;
             }else{
                 i++;
                 arr[i] = arr[j];
                 j++;
             }
         }

         for(int m=0;m<=i;m++){
             System.out.print(arr[m]+" ");
         }

    }
}
