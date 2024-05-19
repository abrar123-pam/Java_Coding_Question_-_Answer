package Day7.MISC_Tasks_1;

import java.util.Arrays;
import java.util.List;

public class task4 {
    public static void main(String[] args) {
        String[] name  = {"zoho","tcs","wipro","google","Microsoft"};

        System.out.println("Array elements");
        for(String s : name){
            System.out.println(s);
        }

        System.out.println("List elements");
        List<String> list = Arrays.asList(name);
        System.out.println(list);
    }
}
