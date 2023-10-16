package PracticeQuestions;

import java.util.Scanner;

public class Leapyear {

    //Every four years, there is a year known as a leap year. According to the Gregorian calendar
    //a year should have 365.25 days in it

    public static void main(String[] args) {

//        System.out.print("Enter year: ");
//        Scanner sc = new Scanner(System.in);
//
//        int year = sc.nextInt();
//        if(year % 4 ==0 || year % 400 == 0 && year % 100 ==0){
//            System.out.println("Leap year");
//        }else {
//            System.out.println("Not a Leap year");
//        }
//        int st = 100;
//        while(st != 201){
//            System.out.println(st);
//            st++;
//        }

        for(int i=5;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
           System.out.println();
        }
    }
}
