package Regex;
//Write a Java program to remove all the vowels of a given string. Return the new string.
import java.util.Scanner;

public class remove_vowels {
    public static String removeVowels(String input){

        return input.replaceAll("(?i)[aeiou]","");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input : ");
        String input = sc.nextLine();

        String ans  = removeVowels(input);
        System.out.println(ans);

    }
}
