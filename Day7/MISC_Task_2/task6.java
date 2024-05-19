package Day7.MISC_Task_2;

import java.util.LinkedList;

public class task6 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Arun");
        list1.add("Siddharth");
        list1.add("Kavya");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Anjali");
        list2.add("Raj");
        list2.add("Bhuvanesh");

        System.out.println("First LinkedList: " + list1);

        System.out.println("Second LinkedList: " + list2);

        list1.addAll(list2);

        System.out.println("Combined LinkedList: " + list1);
    }
}
