package Zoho_Preparation;

import java.util.*;

public class anagram {

    public  static String sortElements(String arr){
        char[] temp = arr.toCharArray();
        Arrays.sort(temp);

        return  new String(temp);
    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> anagramGroup = new HashMap<>();

        for (String word: input) {
            String  sortedWord = sortElements(word);
            if(!anagramGroup.containsKey(sortedWord)){
                anagramGroup.put(sortedWord,new ArrayList<>());
            }
            anagramGroup.get(sortedWord).add(word);
        }

        for(List<String> st : anagramGroup.values()){
            for(String s : st){
                System.out.print(s  + " ");
            }
            System.out.println();
        }
    }
}
