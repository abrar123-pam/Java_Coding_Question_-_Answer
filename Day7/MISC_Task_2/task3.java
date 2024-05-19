package Day7.MISC_Task_2;

import java.util.LinkedList;

public class task3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Insert elements at the last position
        list.addLast("Arun");
        list.addLast("Siddharth");
        list.addLast("Kavya");

        // Insert elements at the first position
        list.addFirst("Anjali");
        list.addFirst("Raj");
        list.addFirst("Bhuvanesh");

        // Print the LinkedList
        System.out.println("LinkedList after insertions: " + list);
    }
}
