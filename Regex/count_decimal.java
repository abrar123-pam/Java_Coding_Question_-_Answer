package Regex;

import java.util.Scanner;

public class count_decimal {

    public static int count(String input){
        String[] arr = input.split("\\.");
        if(arr.length == 2){
            return arr[1].length();
        }else {
            return  0;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input : ");
        String input = sc.nextLine();

        int ans = count(input);
        System.out.println(ans);
    }
}
