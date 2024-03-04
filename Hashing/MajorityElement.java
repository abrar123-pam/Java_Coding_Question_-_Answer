package Hashing;
import java.util.*;

public class MajorityElement {

    public static void MajorElement(int[] num){
        HashMap<Integer, Integer> map  = new HashMap<>();
        int n = num.length;

        for (int i=0;i<n;i++){
            if (map.containsKey(num[i])){
                map.put(num[i],map.get(num[i]) + 1);
                System.out.println(map.put(num[i],map.get(num[i]) + 1));
            }else {
                map.put(num[i], 1);
            }   
        }
        for (int key :map.keySet()){
            if (map.get(key) > n/3){
                System.out.println("Majority Elements : "+ key);
            }
        }
    }

    public static void frequency(String str){
        HashMap<Character,Integer> map = new HashMap<>(25);
        char [] hash = str.toCharArray();
        for (char c : hash){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else {
                map.put(c,1);

            }
        }

        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + "......."+ entry.getValue());
        }
    }

    public static void main(String[] args) {


//        int n;
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter elements : ");
//        n = sc.nextInt();
//        int[] num = new int[n];
//
//
//        for (int i=0;i<n;i++){
//            num[i] = sc.nextInt();
//        }
        int[] a = {5,8,3,2,1,4};
        MajorElement(a);

//        Set<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < a.length; i++) {
//            set.add(a[i]);
//        }
//
//        System.out.println(set);

//        String sc = "abcjejjjjafr";
//        frequency(sc);
    }
}