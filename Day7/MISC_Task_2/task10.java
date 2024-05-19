package Day7.MISC_Task_2;

import java.util.HashMap;
import java.util.Map;

public class task10 {
    public static void main(String[] args) {
        HashMap<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "Apple");
        originalMap.put(2, "Banana");
        originalMap.put(3, "Orange");

        HashMap<Integer, String> shallowCopyMap = new HashMap<>(originalMap);

        System.out.println("Original HashMap: " + originalMap);

        System.out.println("Shallow Copy HashMap: " + shallowCopyMap);

        originalMap.put(4, "Grapes");

        System.out.println("Modified Original HashMap: " + originalMap);

        System.out.println("Shallow Copy HashMap after modification in original map: " + shallowCopyMap);
    }
}
