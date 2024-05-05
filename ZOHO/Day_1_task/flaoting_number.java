package ZOHO.Day_1_task;

import java.util.Scanner;

/* Write a Java program that reads a floating-point number and
 prints "zero" if the number is zero. Otherwise, print "positive" or "negative".
 Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000. */
public class flaoting_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();

        if(num == 0.0){
            System.out.println("Zero");
        } else if (num > 0.0) {
            System.out.println("Positive");
            if(Math.abs(num) < 1){
                System.out.println("small");
            }else if (Math.abs(num) > 1000000) {
                System.out.println("Large");
            }
        }else{
            System.out.println("Negative");
            if(Math.abs(num) < 1){
                System.out.println("small");
            }else if (Math.abs(num) > 1000000) {
                System.out.println("Large");
            }
        }


    }
}
