package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*  Write a Java program to remove leading zeros from a given IP address.*/
//  input  : 001.200.010.004
//  output : 1.200.10.4
public class remove_leading_zero {
    public static void removeZeros(String input){

        String[] split = input.split("\\.");

        for(int i=0;i<split.length;i++){
            split[i] = split[i].replaceFirst("^0+(?!$)","");
        }

        System.out.println(String.join(".",split));

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ip address : ");
        String input = sc.nextLine();

        removeZeros(input);


    }
}
