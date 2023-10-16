package Hashing;

import java.util.HashSet;

public class IntersectionOfTwoArray {

    public static void Insertion(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for (int i =0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for (int j=0;j<arr2.length;j++){
            if (set.contains(arr2[j])){
                count++;
                set.remove(arr2[j]);
                System.out.println(arr2[j]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {2,4,5,7,8};
        int[] arr2 = {3,5,6,7,8,9,21};

        Insertion(arr1,arr2);



    }
}
