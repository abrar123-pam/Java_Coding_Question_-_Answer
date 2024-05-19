package Day7.MISC_Tasks_1;

import java.util.ArrayList;

//Convert list to array
public class task3 {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();


        list.add("Zoho");
        list.add("Tcs");
        list.add("Wipro");
        list.add("Hitachi");
        list.add("Google");
        list.add("MicroSoft");

        String[] arr = list.toArray(new String[0]);

        for(String s : arr){
            System.out.println(s);
        }

    }
}
