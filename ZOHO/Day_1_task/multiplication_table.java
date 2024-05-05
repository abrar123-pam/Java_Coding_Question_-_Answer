package ZOHO.Day_1_task;

/*Write a Java program that takes a number as input and prints its multiplication table up to 1 */

import java.util.Scanner;

public class multiplication_table {

    public static void printMultiplication(int n){

        for(int i=1;i<=10;i++){
            System.out.println(n +" * "+i+" = "+n*i);
        }
    }


    public static void rec(int n,int i){
        if(i <= 10){
            System.out.println(n+" * "+i+" = "+ n*i);
            rec(n,i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value : ");
        int number = sc.nextInt();

        rec(number,1);
//        printMultiplication(number);
    }
}
