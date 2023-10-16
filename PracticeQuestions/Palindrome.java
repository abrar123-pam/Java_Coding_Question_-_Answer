package PracticeQuestions;

import java.util.Scanner;

public class Palindrome {

    public static void main(String args[]){

     int num,rev=0,rem,temp;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number:");
     num = sc.nextInt();
     temp= num;
     while(temp!=0){
         rem = temp % 10;
         rev = rev * 10 + rem;
         temp = temp/10;
     }
     if(num == rev)
         System.out.println("\n palindrome");
     else
         System.out.println("\n not a palindrome");
    }

//        int num, rev=0, rem, temp;
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter a Number: ");
//        num = scan.nextInt();
//
//        temp = num;
//        while(temp!=0)
//        {
//            rem = temp%10;
//            rev = (rev*10) + rem;
//            temp = temp/10;
//        }
//
//        if(num==rev)
//            System.out.println("\nIt is a PracticeQuestions.Palindrome Number.");
//        else
//            System.out.println("\nIt is not a PracticeQuestions.Palindrome Number.");
//    }
}
