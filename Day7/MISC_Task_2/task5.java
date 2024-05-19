package Day7.MISC_Task_2;

import java.util.LinkedList;
import java.util.List;

public class task5 {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();

        ll.add(3);
        ll.add(6);
        ll.add(7);
        ll.add(20);
        ll.add(12);

        System.out.println("Original LinkedList:");
        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();

        int idx1 = ll.indexOf(7);
        int idx2 = ll.indexOf(20);

        if (idx1 != -1 && idx2 != -1) {
            ll.set(idx1, 20);
            ll.set(idx2, 7);
        }

        System.out.println("After swapping 7 and 20:");
        for (int i : ll) {
            System.out.print(i + " ");
        }
    }
}
