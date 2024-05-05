package Hashing;
import java.util.HashMap;

public class oItenaryFromTickets {

    public static String getStart(HashMap<String,String> tic){
        HashMap<String,String> revTick = new HashMap<>();

        for (String key:tic.keySet()){
            revTick.put(tic.get(key),key);
        }

        for (String key: tic.keySet()){
            if (!revTick.containsKey(key)){
                return key;
            }
        }
        return "Start Point is not available";
    }


    public static void main(String[] args) {
        HashMap<String,String> jour = new HashMap<>();
        jour.put("Chennai","Bengaluru");
        jour.put("Mumbai","Delhi");
        jour.put("Goa","Chennai");
        jour.put("Delhi","Goa");
        jour.put("Andhra","Mumbai");

        String start = getStart(jour);

        while (jour.containsKey(start)){
            System.out.print(start + "->");
            start = jour.get(start);
        }
        System.out.println(start);

    }
}
