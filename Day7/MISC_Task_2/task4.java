package Day7.MISC_Task_2;

import java.util.LinkedList;

public class task4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Arun");
        list.add("Siddharth");
        list.add("Kavya");
        list.add("Anjali");
        list.add("Raj");
        list.add("Bhuvanesh");

        System.out.println("LinkedList before removal: " + list);

        String elementToRemove = "Kavya";

        boolean removed = list.remove(elementToRemove);

        if (removed) {
            System.out.println("Element '" + elementToRemove + "' was removed.");
        } else {
            System.out.println("Element '" + elementToRemove + "' was not found.");
        }

        System.out.println("LinkedList after removal: " + list);
    }
}
