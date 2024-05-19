package Day7.MISC_Task_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//Write a Java program to convert a hash set to a List/ArrayList
public class task7 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Abrar");
        set.add("Musharraf");
        set.add("PAM");
        set.add("Sakthivel");
        set.add("Lallu");

        ArrayList<String> list = new ArrayList<>(set);
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(set);
        System.out.println("By using addALl method() : "+list1);
    }
}
