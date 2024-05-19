package Day7.MISC_Task_2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        List<String> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Total elements : ");
        int count = sc.nextInt();

        for (int i=0;i<count;i++){
            String num = sc.next();
            ll.add(num);
        }

        for (String s : ll){
            System.out.println(s);
        }

        System.out.println("In which index you want to add element");
        int index = sc.nextInt();

        System.out.println("ELement String ");
        String element = sc.next();

        ll.add(index,element);

        System.out.println("After Adding Element");
        for (String s : ll){
            System.out.println(s);
        }


    }
}
