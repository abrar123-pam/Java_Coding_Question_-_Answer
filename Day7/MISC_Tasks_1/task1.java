package Day7.MISC_Tasks_1;
//Write a program to get student names and respective locations - sort students based on the lexicographical order of locations

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student>{
    String name;
    String location;

    public Student(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public int compareTo(Student o) {
        return this.location.compareTo(o.location);
    }
}


public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<>();


        System.out.print("Enter student count : ");
        int count = sc.nextInt();

        for (int i=0;i<count;i++){
            System.out.print("Enter Student name : ");
            String sName = sc.next();

            System.out.print("Enter Student Location : ");
            String sLoc = sc.next();

            Student student = new Student(sName,sLoc);
            list.add(student);
        }

        Collections.sort(list);

        for(Student s : list){
            System.out.print("Name = "+s.name + ", Location = "+s.location);
            System.out.println();
        }


    }
}
