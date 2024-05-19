package Day7;

import java.util.ArrayList;

public class space {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Zoho");
        list.add("tcs");
        list.add("wipro");
        list.add("Hitachi");

        for (String s : list){
            System.out.print(s + " ");
        }
    }
}
