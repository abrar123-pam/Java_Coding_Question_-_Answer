package Regex;

import java.util.Scanner;

// Write a Java program to validate a personal identification number (PIN).
// Assume the length of a PIN number is 4, 6 or 8
public class ValidatePIN {

    public static void main(String[] args) {
        String pin = "1234"; // Example input
        boolean isValid = validatePIN(pin);
        if (isValid) {
            System.out.println("Valid PIN");
        } else {
            System.out.println("Invalid PIN");
        }
    }

    public static boolean validatePIN(String pin) {
        // Regular expression to match a PIN of length 4, 6, or 8 consisting only of digits
        return pin.matches("^\\d{4}$|^\\d{6}$|^\\d{8}$");
    }
}

