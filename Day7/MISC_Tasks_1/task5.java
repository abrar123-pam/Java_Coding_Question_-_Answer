package Day7.MISC_Tasks_1;

import java.util.ArrayList;

public class task5 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("CSE");
        list1.add("IT");
        list1.add("MECH");
        list1.add("CIVIL");
        list2.add("AI/DS");
        list2.add("CSBS");
        list2.add("AI/ML");
        list2.add("CCNA");

        System.out.println(list1);
        System.out.println(list2);

        list1.addAll(list2);
        System.out.println(list1);

    }
}
