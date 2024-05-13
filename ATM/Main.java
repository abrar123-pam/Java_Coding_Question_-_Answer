package ATM;

import java.util.Scanner;

/* 1(L3).Create an Automated Teller Machine Backend Logic using Encapsulation technique in Java
 */
public class Main {
    public static void main(String[] args) {
        machine m = new machine(10000);

        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while (flag){
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");

            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter amount to deposit : ");
                    int deposit = sc.nextInt();
                    m.deposit(deposit);
                    break;

                case 2 :
                    System.out.println("Enter amount to withdraw : ");
                    int with_draw = sc.nextInt();
                    m.withDraw(with_draw);
                    break;

                case 3:
                    System.out.println("Available Balance is : "+m.showBalance());
                    break;

                default:
                    System.out.println("Enter valid number......");
                    System.out.println("Exitting..........");
                    flag = false;
            }


        }
    }
}
