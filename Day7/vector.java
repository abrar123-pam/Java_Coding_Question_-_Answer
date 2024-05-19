package Day7;

import java.util.*;
//Program to show up the vector class and its methods.

public class vector{
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("FaceBook");
        vector.add("WhatsApp");
        vector.add("Instagram");
        vector.add("YouTube");

        System.out.println("Vector List : "+vector);

        vector.addElement("Discord");
        System.out.println("After adding element : "+vector);
        System.out.println("Capacity : "+vector.capacity());

        vector.ensureCapacity(30);
        System.out.println("Ensure Capacity : " +vector.capacity());

        System.out.println("index of 2 is : "+vector.get(2));
        System.out.println("Hash Code "+vector.hashCode());
        vector.insertElementAt("Kala",3);
        System.out.println("After Inserting Element At index : "+vector);

        System.out.println("This is a colone of Vector : "+vector.clone());

        if(vector.contains("Discord")){
            System.out.println("Discord Present at index : "+vector.indexOf("Discord"));
        }else{
            System.out.println("Discord is not present in the list");
        }

        vector.remove("Instagram");
        System.out.println("After removing a element : "+vector);

        System.out.println("The First element : "+vector.firstElement());
        System.out.println("The Last element : "+vector.lastElement());


        List<String> list = new ArrayList<>();
        list.add("WhatsApp");
        list.add("FaceBook");

        System.out.println("Does vector contains all list elements : "+vector.containsAll(list));

        list.add("Snapchat");

        System.out.println("Does vector contains all list elements : "+vector.containsAll(list));

        String[] arr = new String[vector.size()];

        vector.copyInto(arr);

        for(String s : arr){
            System.out.println("Array Elements : "+s);
        }
        vector.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println("After sorting : "+vector);

        vector.clear();
        System.out.println(vector);

    }

}
