package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class uniqueSum {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();

        while (n!=0){
            int temp = n % 10;

            if(map.containsValue(temp)){
                map.put(temp,map.getOrDefault(temp,0)+1);
            }else {
                map.put(temp,0);
            }

            n /= 10;

        }
        int sum = 0;
        for (int element :map.keySet()) {
            if(map.get(element) == 0){
                sum += map.get(element);
            }
        }

        System.out.println(sum);

    }
}
