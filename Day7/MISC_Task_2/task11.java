package Day7.MISC_Task_2;
import java.util.HashMap;
import java.util.Map;

public class task11 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        String keyToCheck = "B";
        if (map.containsKey(keyToCheck)) {
            System.out.println("Map contains a mapping for the key '" + keyToCheck + "'.");
        } else {
            System.out.println("Map does not contain a mapping for the key '" + keyToCheck + "'.");
        }

        keyToCheck = "D";
        if (map.containsKey(keyToCheck)) {
            System.out.println("Map contains a mapping for the key '" + keyToCheck + "'.");
        } else {
            System.out.println("Map does not contain a mapping for the key '" + keyToCheck + "'.");
        }
    }
}
