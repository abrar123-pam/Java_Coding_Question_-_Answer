package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class UnionOfTwoArray {

    public static void Union(int[] arr1, int[] arr2){
        HashSet<Integer> set =new HashSet<>();

        for (int i =0; i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for (int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        System.out.println(set.size());

        Iterator it = set.iterator();
//        if (it.hasNext()){
//            System.out.println(it.next());
//        }

        for (int i=0;it.hasNext();i++){
            System.out.print(it.next() + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {3,6,7,9};
        int[] arr2 = {4,3,6,8,1,10,2};

        Union(arr1,arr2);
    }
}
