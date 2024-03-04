package Queue_using_Array;

import java.util.Scanner;

public class FlightTicketReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSeats = 50;
        int basePrice = 5000;
        int priceIncrement = 200;
        int passengerId = 1; // Initialize passenger ID

        System.out.println("Welcome to the Flight Ticket Reservation System!");
        System.out.println("Please choose an option:");
        System.out.println("1. Book a ticket");
        System.out.println("2. Cancel a ticket");
        System.out.println("3. Print flight details with passengers");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the number of seats required:");
                int seatsRequired = scanner.nextInt();
                if (seatsRequired <= totalSeats) {
                    int totalPrice = basePrice + (priceIncrement * (totalSeats - seatsRequired));
                    System.out.println("Your total price: " + totalPrice + " rupees");
                    // Increment passenger ID for each booking
                    for (int i = 0; i < seatsRequired; i++) {
                        System.out.println("Passenger " + passengerId + " booked a seat.");
                        passengerId++;
                    }
                } else {
                    System.out.println("Sorry, not enough seats available.");
                }
                break;
            case 2:
                System.out.println("Enter the number of seats to cancel:");
                int seatsToCancel = scanner.nextInt();
                int refundAmount = priceIncrement * seatsToCancel;
                System.out.println("Refund amount: " + refundAmount + " rupees");
                break;
            case 3:
                System.out.println("Flight details:");
                // Print flight details with passengers (not specified in the requirements)
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }
}
