package Day7;

import java.util.*;

//Allocate rank for the university students according to their scores by using Maps, Packages.
class Student implements Comparable<Student>{
    int marks;
    String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public int getMarks(){
        return marks;
    }

    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return this.marks - o.marks;
    }
}



public class allocateRank {

    public static void main(String[] args) {
        HashMap<Student,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of students : ");
        int noOfStudent = sc.nextInt();

        for(int i=0;i<noOfStudent;i++){
            System.out.print("Enter name : ");
            String name = sc.next();

            System.out.print("\nEnter Marks : ");
            int marks = sc.nextInt();

            map.put(new Student(marks, name),0);
        }

        for (Student s : map.keySet()){

            if(s.getMarks() >= 90){
                System.out.println(s.getName() + " " + s.marks + " Rank 1 ");
            } else if (s.getMarks() >= 80 && s.getMarks() <90) {
                System.out.println(s.getName() + " " + s.marks + " Rank 2 ");
            } else if (s.getMarks() >= 60 && s.getMarks() <80) {
                System.out.println(s.getName() + " " + s.marks + " Rank 3");
            } else if (s.getMarks() <= 50) {
                System.out.println(s.getName() + " " + s.marks + " Failed");
            }
        }
    }
}
