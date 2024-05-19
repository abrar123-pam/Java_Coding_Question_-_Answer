package Day7;

import java.util.ArrayList;
import java.util.Vector;

public class arrayList {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Zoho");
        al.add("TCS");
        al.add("Wipro");
        al.add("Cognizant");

        System.out.println(al);

        al.add(1,"Tech mahindra");
        System.out.println(al);

        System.out.println("Size : "+al.size());

        if(al.equals("Wipro")){
            System.out.println("Wipro is found at index : "+al.indexOf("Wipro"));
        }else{
            System.out.println("Element not found");
        }

        Vector<String> vc = new Vector<>();

        vc.addAll(al);
        System.out.println("After adding all elements in Vector using addALl : "+vc);

        System.out.println("HashCode is : "+al.hashCode());

        System.out.println("is list empty : "+al.isEmpty());
        al.remove("Wipro");

        System.out.println("After removing wipro : "+al);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Botree");
        list1.add("Hitachi");
        list1.add("HCL");

        System.out.println(list1);
        list1.addAll(al);

        System.out.println("After retain : "+list1.retainAll(al));
        System.out.println(list1);
    }

}
