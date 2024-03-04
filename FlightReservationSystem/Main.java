package FlightReservationSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void cancel(Flight cFlight, int pId){
        cFlight.cancelTicket(pId);
        cFlight.printSummary();
        cFlight.printDetails();
    }

    public static void book(Flight cFlight,int tickets,int passengerId){
        String passengerDetails =
                "Passenger ID "+passengerId+" No of Tickets "+tickets+" Total Cost "+cFlight.price*tickets;

        cFlight.addPassengerDetails(passengerDetails,tickets,passengerId);

        cFlight.printSummary();
        cFlight.printDetails();
    }

    public static void print(Flight f){
        f.printDetails();
    }


    public static void main(String[] args) {
        boolean loop = true;

        ArrayList<Flight> flights = new ArrayList<>();
        for(int i=0;i<2;i++){
            flights.add(new Flight());
        }
        int passengerId = 1;

        Scanner sc = new Scanner(System.in);

        while (loop){
            System.out.println("1.Book\n2.Cancel\n3.print details\n4.Exit");
            int choice = sc.nextInt();

            switch (choice){

                case 1:
                    System.out.println("Enter Flight id [1 | 2]");
                    int fid = sc.nextInt();

                    if(fid > flights.size() ){
                        System.out.println("Invalid FLight ID");
                        break;
                    }

                    Flight currFlight = null;
                    for(Flight f: flights){
                        if(f.flightId == fid){
                            currFlight =f;
                            f.printSummary();
                            break;
                        }
                    }
                    System.out.println("Enter no of Tickets");
                    int tickets = sc.nextInt();

                    if( tickets > currFlight.tickets ){
                        System.out.println("No Available Tickets");
                        break;
                    }

                    book(currFlight,tickets,passengerId);
                    passengerId++;
                    break;
                case 2:
                    System.out.print("Enter Flight ID : ");
                    int c_fid = sc.nextInt();
                    if(c_fid > flights.size()){
                        System.out.println("Invalid Flight Id");
                        return;
                    }
                    System.out.println();

                    Flight cFlight = null;
                    for(Flight f: flights){
                        if(f.flightId == c_fid){
                            cFlight = f;
                            break;
                        }
                    }
                    System.out.print("Enter Passenger Id : ");
                    int p_id = sc.nextInt();
                    cancel(cFlight,p_id);
                    break;

                case  3:

                    for(Flight f:flights){
                        if(f.passengerDetails.size() == 0){
                            System.out.println("No Passenger Details fpr - Flight "+f.flightId);
                        }else{
                            print(f);
                        }
                    }

                    break;

                case 4:
                    loop = false;
                    break;
            }
        }
    }
}
