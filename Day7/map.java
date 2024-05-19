package Day7;

import java.util.HashMap;
import java.util.Map;

public class map {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Chennai");
        map.put(2,"Banglore");
        map.put(3,"Hydrabad");
        map.put(4,"Bombay");

        System.out.println(map);
        System.out.println(map.get(3));
        System.out.println(map.containsValue("Chennai"));
        System.out.println(map.containsKey(7));
        map.remove(4);
        System.out.println(map.isEmpty());


        for (Map.Entry<Integer, String> m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
