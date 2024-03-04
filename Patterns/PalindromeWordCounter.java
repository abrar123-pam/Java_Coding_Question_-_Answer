package Patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class PalindromeWordCounter {

    public static String sortElement(String arr){
        char[] temp = arr.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }

    public static void main(String[] args) {
        String[] input = {"catch", "atp", "amt", "mat", "eat", "Pat", "tap", "tea"};
        List<List<String>> anagramGroup = new ArrayList<>();

        int n = input.length;

        for(int i=0;i<n;i++){
            if(input[i] == null){
                continue;
            }
            String first = sortElement(input[i]);

            List<String> anagram = new ArrayList<>();
            anagram.add(input[i]);

            for(int j = i+1;j<n;j++){
                if(input[j] == null){
                    continue;
                }
                String second = sortElement(input[j]);

                if(first.equalsIgnoreCase(second)){
                    anagram.add(input[j]);
                    input[j] = null;
                }
            }

            anagramGroup.add(anagram);
        }

        for (List<String> s: anagramGroup) {
            for (String st: s) {
                System.out.print(st +" ");
            }
            System.out.println();

        }
    }
}