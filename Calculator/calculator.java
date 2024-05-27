package Calculator;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while (loop){

            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Percentage\n6. Exit");
            int choice = sc.nextInt();
            System.out.print("Enter the first number (X): ");
            int x = sc.nextInt();
            System.out.print("Enter the second number (Y): ");
            int y = sc.nextInt();
            switch (choice){

                case 1:
                    add(x,y);
                    break;
                case 2:
                    sub(x,y);
                    break;
                case 3:
                    mul(x,y);
                    break;
                case 4:
                    div(x,y);
                    break;
                case 5:
                    percentageCalculations(sc, x, y);
                    break;
                case 6:
                    loop = false;
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        }

    }

    private static void percentageCalculations(Scanner sc, int x, int y) {
        System.out.println("\nPercentage Calculations");
        System.out.println("Choose an option:");
        System.out.println("1: X% of Y");
        System.out.println("2: What percent of Y is X");
        System.out.println("3: Percentage increase or decrease from X to Y");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(x + "% of " + y + " is " + (x / 100 * y));
                break;
            case 2:
                System.out.println(x + " is " + ((x / y) * 100) + "% of " + y);
                break;
            case 3:
                if (x < y) {
                    System.out.println("Percentage increase from " + x + " to " + y + " is " + ((y - x) / x * 100) + "%");
                } else {
                    System.out.println("Percentage decrease from " + x + " to " + y + " is " + ((x - y) / x * 100) + "%");
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void add(int v1,int v2){
        System.out.println("Result: "+(v1+v2));
    }

    public static void sub(int v1,int v2){
        System.out.println("Result: "+(v1 - v2));
    }

    public static void mul(int v1,int v2){
        System.out.println("Result: "+v1*v2);
    }

    public static void div(int v1,int v2){
        if (v2 != 0) {
            System.out.println("Result: " + (v1 / v2));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
