package Day7.MISC_Task_2;

import java.util.ArrayList;

//Write a Java program to clone an array list to another array list
public class task1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("CSE");
        list1.add("IT");
        list1.add("MECH");
        list1.add("CIVIL");
        list1.add("AI/DS");
        list1.add("CSBS");
        list1.add("AI/ML");
        list1.add("CCNA");


        System.out.println("First ArrayList "+list1);
        list2 = (ArrayList) list1.clone();
        System.out.println("Second Array List "+list2);




    }
}
