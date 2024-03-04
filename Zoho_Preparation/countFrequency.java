package Zoho_Preparation;

import java.util.HashMap;
import java.util.Map;

public class countFrequency {

    public static void checkFrequency(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        int n = arr.length;

        for(int i=0;i<n;i++){

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//            if(map.containsKey(arr[i])){
//                map.put(arr[i],map.get(arr[i])+1);
//            }else{
//                map.put(arr[i],1);
//            }

        }

        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            System.out.print(m.getKey()+"("+m.getValue()+")");
            System.out.println();
        }
    }

//Brute Force
//    public static void checkFrequency(int[] arr) {
//        // Sort the array
//        Arrays.sort(arr);
//
//        // Initialize variables to store the current element and its frequency
//        int currentElement = arr[0];
//        int frequency = 1;
//
//        // Iterate through the sorted array starting from the second element
//        for (int i = 1; i < arr.length; i++) {
//            // If the current element is the same as the previous element, increment the frequency
//            if (arr[i] == currentElement) {
//                frequency++;
//            } else {
//                // If the current element is different from the previous element,
//                // print the frequency of the previous element and update currentElement and frequency
//                System.out.println(currentElement + "(" + frequency + ")");
//                currentElement = arr[i];
//                frequency = 1;
//            }
//        }
//
//        // Print the frequency of the last element
//        System.out.println(currentElement + "(" + frequency + ")");
//    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,2,2,5,5};
        checkFrequency(arr);
    }

}
