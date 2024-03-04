package RailwayReservationSystem;

import java.awt.print.Book;
import java.util.Scanner;

public class Main {

    public static void cancel(int passengerId){
        Booking b = new Booking();

        if(!Booking.stored_data.containsKey(passengerId)){
            System.out.println("No details Found");
        }else{
            b.cancel(passengerId);
        }

    }
    public static void book(Passenger p){
        Booking b = new Booking();

        if(Booking.availableWaitingList == 0){
            System.out.println("No Tickets Available");
            return;
        }
        else if((p.berth.equals("L") && Booking.availableLowerBerth > 0) ||
                ( p.berth.equals("M") && Booking.availableMiddleBerth > 0) ||
                (p.berth.equals("U") && Booking.availableUpperBerth > 0)){
                if(p.berth.equals("L")){
                    System.out.println("Lower Berth Given");
                    b.bookTickets(p,Booking.LBCount.get(0),"L");
                    Booking.LBCount.remove(0);
                    Booking.availableLowerBerth--;
                } else if (p.berth.equals("M")) {
                    System.out.println("Middle Berth Given");
                    b.bookTickets(p,Booking.MBCount.get(0),"M");
                    Booking.MBCount.remove(0);
                    Booking.availableMiddleBerth--;
                } else {
                    System.out.println("Upper Berth Given");
                    b.bookTickets(p,Booking.UBCount.get(0),"U");
                    Booking.UBCount.remove(0);
                    Booking.availableUpperBerth--;
                }
            }

         else if(Booking.availableLowerBerth > 0){
            System.out.println("Lower Berth Given");
            b.bookTickets(p,Booking.LBCount.get(0),"L");
            Booking.LBCount.remove(0);
            Booking.availableLowerBerth--;
        }else if(Booking.availableMiddleBerth > 0){
            System.out.println("Middle Berth given");
            b.bookTickets(p,Booking.MBCount.get(0),"M");
            Booking.MBCount.remove(0);
            Booking.availableMiddleBerth--;
        }else if(Booking.availableUpperBerth > 0){
            System.out.println("Upper Berth Given");
            b.bookTickets(p,Booking.UBCount.get(0),"U");
            Booking.UBCount.remove(0);
            Booking.availableUpperBerth--;
        }else if(Booking.availableRacBerth > 0){
            System.out.println("RAC Ticket Given");
            b.RacTickets(p,Booking.RACCount.get(0),"RAC");
            Booking.RACCount.remove(0);
            Booking.availableRacBerth--;
        }else if(Booking.availableWaitingList > 0){
            System.out.println("Waiting List");
            b.WlTickets(p,Booking.WLCount.get(0),"WL");
            Booking.WLCount.remove(0);
            Booking.availableWaitingList--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while (loop){
            System.out.println("1. Book\n2. Cancel\n3. Print Booked Tickets\n4. Print Available Tickets\n5. Exit");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Your Name");
                    String name = sc.next();
                    System.out.println("Enter Your Age");
                    int age = sc.nextInt();
                    System.out.println("Enter Your Gender [M | F]");
                    String gender = sc.next();
                    System.out.println("Enter Your Berth Preference [L | M | U]");
                    String berth = sc.next();


                    Passenger details = new Passenger(name,age,gender,berth);
                    book(details);
                    break;
                case 2:
                    System.out.println("Enter Passenger Id");
                    int pid = sc.nextInt();
                    cancel(pid);
                    break;
                case 3:
                   Booking b = new Booking();
                   b.BookedTickets();
                    break;
                case 4:
                    Booking b1 = new Booking();
                    b1.availableTickets();
                    break;
                case 5:
                    loop = false;
                    break;
            }
        }
    }
}
