package Day7.MISC_Tasks_1;

import java.util.*;

//Store list of students from Chennai in a linked list and sort them based on the length of their names

class NameComparator implements Comparator<task2>{

    @Override
    public int compare(task2 o1, task2 o2) {
        return Integer.compare(o1.getName().length(), o2.getName().length());
    }
}
public class task2 {

    String name ;

    public task2(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<task2> ll = new LinkedList<>();

        System.out.print("Enter total student count :  ");
        int count = sc.nextInt();

        for(int i=0;i<count;i++){
            System.out.print("Enter Name : ");
            String name =  sc.next();
            task2 t2 = new task2(name);
            ll.add(t2);
        }

        for (task2 t : ll){
            System.out.println(t.name);
        }
        Collections.sort(ll,new NameComparator());

        System.out.println("After Sorting");
        for (task2 t : ll){
            System.out.println(t.name);
        }


    }
}
