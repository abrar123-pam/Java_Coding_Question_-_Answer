package Day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sortArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int stop = 0;
        boolean check = true;

        System.out.println("Enter 0 to stop");
        while (check){
            int input = sc.nextInt();

            list.add(input);

            if(input == stop){
                check = false;
            }
        }

        Collections.sort(list);
        System.out.println(list);




    }
}
