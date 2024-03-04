package Zoho_Preparation;

public class ReverseString {

    public static String reverseWords(String str) {
        // Base case: if the string is empty or has only one word
        if (str == null || str.isEmpty()) {
            return str;
        }

        // Find the index of the first space character
        int spaceIndex = str.indexOf(' ');

        // Base case: if there are no more spaces (only one word remaining)
        if (spaceIndex == -1) {
            return str;
        }

        // Recursively reverse the substring after the first space
        String reversedSubstring = reverseWords(str.substring(spaceIndex + 1));

        // Concatenate the reversed substring with the first word and a space
        return reversedSubstring + " " + str.substring(0, spaceIndex);
    }

    public static void main(String[] args) {
        String input1 = "one two three";
        String input2 = "I love india";

        System.out.println("Input 1: " + input1);
        System.out.println("Output 1: " + reverseWords(input1));

        System.out.println("Input 2: " + input2);
        System.out.println("Output 2: " + reverseWords(input2));
    }
}
