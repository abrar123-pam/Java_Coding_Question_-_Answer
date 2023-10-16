package PracticeQuestions;

import java.util.Scanner;

public class Conditionals {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sub1 marks: ");
        float sub1 = sc.nextFloat();

        System.out.print("Enter sub2 marks: ");
        float sub2 = sc.nextFloat();

        System.out.print("Enter sub3 marks: ");
        float sub3 = sc.nextFloat();

        float avg = sub1+sub2+sub3/3f;
        System.out.println("Your Average Marks: "+avg+" %");

        if(avg >=40 && sub1>=33 && sub2>=33 && sub3>=33){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }




    }

}
