package Day_05;

import java.util.Scanner;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println("Entered number: " + num);
            int result = 10 / num; // This may throw ArithmeticException
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred: " + e.getMessage());
        } finally {
            // This block always executes, regardless of whether an exception occurs or not
            // Close any open resources or perform cleanup tasks here
            scanner.close(); // Closing the scanner to prevent resource leak
            System.out.println("Finally block executed.");
        }
    }
}
