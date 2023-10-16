package OOPS;


import java.util.Arrays;
import java.util.Scanner;

class Student{
    String name;
    int[] arrays = new int[20];
    int reg_no;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.reg_no);
//        for (int i=0;i<3;i++){
//            System.out.println(Arrays.toString(this.arrays));
//        }
    }

    //Non-Parameterized constructor
    Student(){
        System.out.println("Constructor called");
    }
    //Parameterized Constructor
    Student(Student s2){
        this.name =s2.name;
        this.reg_no =s2.reg_no;
    }

    //copy constructor
}


public class classandobject {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "lalith";
        student.reg_no = 20;
        Scanner sc = new Scanner(System.in);

//        for (int i=0;i<3;i++){
//            int st = sc.nextInt();
//            student.arrays[i] = st;
//        }
        Student s2 = new Student(student);
        s2.printInfo();




    }
}
