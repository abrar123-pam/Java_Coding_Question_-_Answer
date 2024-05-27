package Contact;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            //clearScreen();
            System.out.println("1. Call\n2. Search Contact\n3. Delete Contact\n4. Update Contact\n5. Call History\n6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    call(sc);
                    break;
                case 2:
                    search(sc);
                    break;
                case 3:
                    delete(sc);
                    break;
                case 4:
                    update(sc);
                    break;
                case 5:
                    history(sc);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    loop = false;
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }

        sc.close();
    }

//    public static void clearScreen() {
//        for (int i = 0; i < 50; ++i) System.out.println();
//    }

    public static void history(Scanner sc) {
        System.out.print("Enter Name of contact: ");
        String name = sc.next();
        Details d = new Details();
        Call c = d.getContact(name);
        if (c != null) {
            System.out.println("Call count for " + name + ": " + c.getCount());
        } else {
            System.out.println("Contact doesn't exist");
        }
    }

    public static void update(Scanner sc) {
        System.out.print("Enter Name to update contact: ");
        String uName = sc.next();

        Details d = new Details();
        Call c = d.getContact(uName);

        if (c == null) {
            System.out.println("Contact doesn't exist");
            return;
        }

        System.out.println("Your existing Name is: " + c.getContactName());
        System.out.println("Your existing Number is: " + c.getContactNumber());

        System.out.print("Enter new Name: ");
        String name = sc.next();

        System.out.print("Enter new Number: ");
        String number = sc.next();

        if (!isValidMobileNumber(number)) {
            System.out.println("Invalid mobile number format. Please enter a 10-digit number containing only digits.");
            return;
        }

        System.out.print("If all the details are correct [Y/N]: ");
        char confirm = sc.next().charAt(0);

        if (confirm == 'Y' || confirm == 'y') {
            d.updateContact(uName, new Call(name, number));
            System.out.println("Contact updated successfully");
        } else {
            System.out.println("Come back again!");
        }
    }

    public static void delete(Scanner sc) {
        System.out.print("Enter Name to delete contact: ");
        String name = sc.next();

        Details d = new Details();
        d.deleteContact(name);
    }

    public static void search(Scanner sc) {
        System.out.print("Enter the Name: ");
        String sName = sc.next();
        Details d = new Details();
        Call c = d.getContact(sName);
        if (c != null) {
            System.out.println("Your Number is: " + c.getContactNumber());
        } else {
            System.out.println("Contact doesn't exist");
        }
    }

    public static void call(Scanner sc) {
        boolean callLoop = true;
        while (callLoop) {
            //clearScreen();
            System.out.println("1. Add Number\n2. Call\n3. Exit");
            System.out.print("Enter choice: ");
            int callChoice = sc.nextInt();

            switch (callChoice) {
                case 1:
                    System.out.print("Enter contact Name: ");
                    String name = sc.next();
                    System.out.print("Enter contact Number: ");
                    String number = sc.next();

                    if (isValidMobileNumber(number)) {
                        Call call = new Call(name, number);
                        saveCall(call);
                    } else {
                        System.out.println("Invalid mobile number format. Please enter a 10-digit number containing only digits.");
                    }
                    break;
                case 2:
                    System.out.print("Enter Mobile Number: ");
                    String numberr = sc.next();

                    if (isValidMobileNumber(numberr)) {
                        Details d = new Details();
                        d.makeCall(numberr);
                    } else {
                        System.out.println("Invalid mobile number format. Please enter a 10-digit number containing only digits.");
                    }
                    break;
                case 3:
                    callLoop = false;
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }
    }

    public static void saveCall(Call call) {
        Details d = new Details();
        d.saveNumber(call);
    }

    public static boolean isValidMobileNumber(String number) {
        String regex = "\\d{10}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
