package ZOHO.Day_1_task;

import java.util.Scanner;

/* Two numbers are entered through the keyboard.
 Write a program to find the value of one number raised to the power of another.
 (Do not use Java built-in method)
*/
public class raise_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int component = sc.nextInt();
        int ans = 1;

        for(int i=1;i<=component;i++){
            ans *= base;
        }

        System.out.println(ans);
    }
}

