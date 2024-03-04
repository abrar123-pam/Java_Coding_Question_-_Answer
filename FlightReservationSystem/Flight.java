package FlightReservationSystem;

import java.util.ArrayList;
import java.util.List;

public class Flight {

    static int id = 1;
    int flightId;
    int tickets;
    int price;

    List<String> passengerDetails;
    List<Integer> passengerId;
    List<Integer> bookedPerPassenger;
    List<Integer>  passengerCost;


    public Flight(){
        flightId = id++;
        tickets = 50;
        price = 5000;
        passengerDetails = new ArrayList<>();
        passengerId = new ArrayList<>();
        bookedPerPassenger = new ArrayList<>();
        passengerCost = new ArrayList<>();
    }
    public void addPassengerDetails(String passengerDetail,int noOftickets,int pid){
        passengerDetails.add(passengerDetail);
        passengerId.add(pid);
        passengerCost.add(price*noOftickets);
        bookedPerPassenger.add(noOftickets);

        price += 200 * noOftickets;
        tickets -= noOftickets;
        System.out.println("Booked Successfully");
    }
    public void cancelTicket(int pId){
        int indexToRemove = passengerId.indexOf(pId);
        if(indexToRemove < 0){
            System.out.println("No Passenger Found");
            return;
        }

        int ticketsToCancel = bookedPerPassenger.get(indexToRemove);

        tickets += ticketsToCancel;

        price -= 200*ticketsToCancel;

        System.out.println("Refund Amount "+passengerCost.get(indexToRemove));

        bookedPerPassenger.remove(indexToRemove);
        passengerId.remove(Integer.valueOf(pId));
        passengerDetails.remove(indexToRemove);
        passengerCost.remove(indexToRemove);

        System.out.println("Cancelled Booked Ticket Successfully");
    }

    public void printSummary(){
        System.out.println("FLight ID "+flightId+" No of Tickets "+tickets+" Current Price "+price);
    }

    public void printDetails()
    {
//        System.out.println("Flight IF --> "+flightId);
        for(String details:passengerDetails){
            System.out.println(details);
        }
    }
}
