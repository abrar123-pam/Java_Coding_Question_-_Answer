package ZOHO.Day_1_task;

import java.util.Scanner;

public class quadratic_equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double desccriminant = b * b - 4 * a * c;

        if(desccriminant > 0){
            double root1 = (-b + Math.sqrt(desccriminant))/ (2 * a);
            double root2 = (-b - Math.sqrt(desccriminant)) / (2 * a);
            System.out.println("The equation has two distinct real roots:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }else if(desccriminant == 0){
            double root = -b / (2*a);
            System.out.println("The equation has one real root:");
            System.out.println(root);
        }else{
            System.out.println("The equation has no real root (Complex root) : ");
        }
    }
}
