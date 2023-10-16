package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//HASHMAP PracticeQuestions.Methods
//put() -- get() -- containsKey() -- remove() -- size() -- keySet()//
public class hashmap {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("IDLY", "Chutney");
        map.put("DOSAI", "Sambar");
        map.put("RICE", "Salan");
        map.put("VADA", "Pudina Chutney");

        System.out.println(map);
        map.put("RICE", "salna");
        System.out.println(map);

        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

//        Set<String> keys = map.keySet();
//        for (String ke : keys){
//            System.out.println(keys + " " +map.get(ke));
//        }
//
//        map.remove("VADA");
//        System.out.println(map.size());
//        System.out.println(map.containsKey("AB"));


        HashMap<Integer, String> reg_no = new HashMap<>();
//        reg_no.put(04,"Abrar");
//        reg_no.put(33,"Sakthivel");
//        reg_no.put(16,"Lalith");
//        reg_no.put(05,"Althaf");

        //    System.out.println(reg_no);
    }
}

