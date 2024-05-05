package ZOHO.Day_1_task;

import java.util.Scanner;

/* Write a program in Java to display the n terms of odd natural number and their sum.
Input number of terms is: 5
Expected Output :
The odd numbers are :
1
3
5
7
9
The Sum of odd Natural Number up to 5 terms is: 25 */
public class sum_of_odd_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("The odd numbers are:");
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            int oddNumber = 2 * i - 1;
            System.out.println(oddNumber);
            sum += oddNumber;
        }
//        int st = 1;
//        int sum = 0;
//        while (num != 0){
//            while (st % 2!=0){
//                System.out.println(st);
//                sum += st;
//                st++;
//            }
//            st++;
//
//            num--;
//        }

        System.out.println(sum);
    }
}
