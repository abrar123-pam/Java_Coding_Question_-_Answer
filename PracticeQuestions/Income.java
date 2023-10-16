package PracticeQuestions;

import java.util.Scanner;

public class Income {

    public static void main(String[] args) {

        System.out.println("Enter your income in lakhs: ");
        Scanner sc = new Scanner(System.in);
        float tax  = 0;
        float income  = sc.nextFloat();

        if(income<=2.5){
            tax = tax+0;
        } else if (income >2.5f && income<=5f) {
            tax = tax +0.5f *(income - 2.5f);
        } else if (income>5f && income<=10f) {
            tax = tax +0.5f *(income - 2.5f);
            tax = tax + 0.2f *(income - 5f);
        } else if (income>10f) {
            tax = tax +0.5f *(income - 2.5f);
            tax = tax + 0.2f *(income - 5f);
            tax = tax + 0.3f *(income - 10f);
        }

        System.out.println("The total tax id : "+ tax);


    }
}
