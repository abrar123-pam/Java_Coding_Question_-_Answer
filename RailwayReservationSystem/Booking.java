package RailwayReservationSystem;

import java.util.*;

public class Booking {
    static int availableLowerBerth = 2;
    static int availableMiddleBerth = 1;
    static int availableUpperBerth = 1;
    static int availableRacBerth = 1;
    static int availableWaitingList = 1;


    static List<Integer> LBCount = new ArrayList<>(Arrays.asList(1,2));
    static List<Integer> MBCount = new ArrayList<>(Arrays.asList(1));
    static List<Integer> UBCount = new ArrayList<>(Arrays.asList(1));
    static List<Integer> RACCount = new ArrayList<>(Arrays.asList(1));
    static List<Integer> WLCount = new ArrayList<>(Arrays.asList(1));

    static List<Integer> bookedTicket = new ArrayList<>();
    static Queue<Integer> RacTickets = new LinkedList<>();
    static Queue<Integer> WlTickets = new LinkedList<>();
    static Map<Integer,Passenger> stored_data = new HashMap<Integer,Passenger>();

    public void bookTickets(Passenger p,int seatNumber,String berth){
        p.allotted = berth;
        p.seatNumber = seatNumber;
        stored_data.put(p.passengerId,p);
        bookedTicket.add(p.passengerId);

        System.out.println("Passenger ID : "+p.passengerId);
        System.out.println("Name : "+p.name);
        System.out.println("Age : "+p.age);
        System.out.println("Gender : "+p.gender);
        System.out.println("Seat Number : "+p.seatNumber+" "+p.allotted);
        System.out.println("-------------------------Booked Successfully");
    }

    public void RacTickets(Passenger p,int seatNumber,String berth){
        p.allotted = berth;
        p.seatNumber = seatNumber;
        stored_data.put(p.passengerId,p);
        RacTickets.add(p.passengerId);

        System.out.println("Passenger ID : "+p.passengerId);
        System.out.println("Name : "+p.name);
        System.out.println("Age : "+p.age);
        System.out.println("Gender : "+p.gender);
        System.out.println("Seat Number : "+p.seatNumber+" "+p.allotted);
        System.out.println("-------------------------Rac Given");
    }

    public void WlTickets(Passenger p,int seatNumber,String berth){
        p.allotted = berth;
        p.seatNumber = seatNumber;
        stored_data.put(p.passengerId,p);
        WlTickets.add(p.passengerId);

        System.out.println("Passenger ID : "+p.passengerId);
        System.out.println("Name : "+p.name);
        System.out.println("Age : "+p.age);
        System.out.println("Gender : "+p.gender);
        System.out.println("Seat Number : "+p.seatNumber+" "+p.allotted);
        System.out.println("-------------------------Wait Listed");
    }

    public void cancel(int passengerId){
        Passenger p = stored_data.get(passengerId);
        stored_data.remove(passengerId);
        bookedTicket.remove(passengerId);

        int sNumber = p.seatNumber;
        System.out.println("Cancelled Successfully");
        if(p.allotted.equals("L")){
            LBCount.add(sNumber);
            availableLowerBerth++;
        }else if(p.allotted.equals("M")){
            MBCount.add(sNumber);
            availableMiddleBerth++;
        } else if (p.allotted.equals("U")) {
            UBCount.add(sNumber);
            availableUpperBerth++;
        }

        if(RACCount.size() > 0){
            Passenger rac = stored_data.get(RacTickets.poll());
            int racNum = rac.seatNumber;
            RacTickets.add(racNum);
            RacTickets.remove(rac.passengerId);
            availableRacBerth++;

            if(WLCount.size() > 0){
                Passenger wl = stored_data.get(WlTickets.poll());
                int wlNum = wl.seatNumber;
                WlTickets.add(wlNum);
                WlTickets.remove(wl.passengerId);
                availableWaitingList++;

                wl.seatNumber = RACCount.get(0);
                wl.allotted = "RAC";
                RACCount.remove(0);
                RacTickets.add(wl.passengerId);
                availableWaitingList++;
                availableRacBerth--;
            }
            Main.book(rac);
        }

    }

    public void BookedTickets(){
        if(stored_data.size() ==0){
            System.out.println("No Tickets Found");
            return;
        }

        for(Passenger p:stored_data.values()){
            System.out.println("Passenger ID : "+p.passengerId);
            System.out.println("Name : "+p.name);
            System.out.println("Age : "+p.age);
            System.out.println("Gender : "+p.gender);
            System.out.println("Seat Number : "+p.seatNumber+p.allotted);
            System.out.println("----------------------------------------------");
        }
    }

    public void availableTickets(){
        System.out.println("Available Tickets are");
        System.out.println("Lower Berth " + availableLowerBerth);
        System.out.println("Middle Berth " + availableMiddleBerth);
        System.out.println("Upper Berth " + availableUpperBerth);
        System.out.println("RAC Berth " + availableRacBerth);
        System.out.println("Waiting List Berth " + availableWaitingList);
    }

}
