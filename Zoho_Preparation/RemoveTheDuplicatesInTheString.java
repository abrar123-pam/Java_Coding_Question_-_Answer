package Zoho_Preparation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveTheDuplicatesInTheString {

    public static String removeDuplicate(String st){
        Map<Character,Integer> map = new HashMap<>();
        String s = "";

        for(int i=0;i<st.length();i++){
            if(!map.containsKey(st.charAt(i))){
                s += st.charAt(i);
                map.put(st.charAt(i),1);
            }
        }

        return  s;

    }

    public static void main(String[] args) {
        String input = "Java1234";

        System.out.println(removeDuplicate(input));
    }
}
