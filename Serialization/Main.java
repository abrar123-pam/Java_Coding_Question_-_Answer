package Serialization;

import Serialization.Models.Student;
import Serialization.Controller.controller;
import Serialization.Models.Teachers;

import java.util.Scanner;

public class Main {
    private static controller con;

    public static void main(String[] args) {
        boolean loop = true;

        Scanner sc =new Scanner(System.in);
        con = Serialization.Controller.controller.load();


        while (loop){
            System.out.println("1.Student\n2.Teacher\n3.Chairman\n4.exit");
            int choice = sc.nextInt();

            switch (choice){

                case 1:
                    student(sc);
                    break;
                case 2:
                    teacher(sc);
                    break;
                case 3:
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        }

        con.save();

    }

    private static void teacher(Scanner sc) {
        System.out.println("1.Signup\n2.Login");
        int tchoice = sc.nextInt();

        switch (tchoice){
            case 1:
                System.out.println("name");
                String name = sc.next();
                System.out.println("Subject");
                String sub = sc.next();
                System.out.println("Salary");
                float sal = sc.nextFloat();

                Teachers teachers = new Teachers(name,sub,sal);
                con.addTeacher(teachers);
                break;
            case 2:
                System.out.println("Enter name");
                String n = sc.next();

                if(con.isValidName(n)){
                    con.displayteacher(n);
                }else {
                    System.out.println("Data not found");
                }
                break;

        }


    }

    private static void student(Scanner sc) {

        System.out.println("1.Signup\n2.Login");
        int schoice = sc.nextInt();

        switch (schoice){
            case 1:
                System.out.println("Enter name : ");
                String name = sc.next();
                System.out.println("Dept");
                String dept = sc.next();
                System.out.println("Passed out");
                int passedOut = sc.nextInt();
                System.out.println("rollNo");
                int roll = sc.nextInt();

                Student student = new Student(name,dept,passedOut,roll);
                con.addStudent(student);

                break;
            case 2:
                System.out.println("Enter Roll");
                int rollNo = sc.nextInt();
                if(con.isValid(rollNo)){
                    con.display(rollNo);
                }else{
                    System.out.println("Enter valid roll no");
                }
                break;
            default:
                System.out.println("valid");
                break;

        }


    }
}
