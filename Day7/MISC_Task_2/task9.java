package Day7.MISC_Task_2;

import java.util.HashSet;

public class task9 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");

        String[] array = new String[hashSet.size()];
        hashSet.toArray(array);

        System.out.println("Array elements:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
